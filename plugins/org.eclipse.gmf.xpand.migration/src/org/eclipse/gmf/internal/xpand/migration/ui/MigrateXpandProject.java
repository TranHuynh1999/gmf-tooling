/**
 * Copyright (c) 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.xpand.migration.ui;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.gmf.internal.xpand.RootManager;
import org.eclipse.gmf.internal.xpand.build.OawBuilder;
import org.eclipse.gmf.internal.xpand.migration.ExpressionMigrationFacade;
import org.eclipse.gmf.internal.xpand.util.OawMarkerManager;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class MigrateXpandProject extends WorkspaceModifyOperation {

	private static final String DEFAULT_TEMPLATES_FOLDER = "templates";

	public static final String MIGRATED_ROOT_EXTENSION = "migrated";
	
	private static final String PLUGIN_CLOSING_TAG = "</plugin>";

	private static final String PLUGIN_OPENNING_TAG = "<plugin>";

	private static final String LF = ExpressionMigrationFacade.LF;

	private static final String PLUGIN_XML_CHARSET = "UTF8";

	private static final String PLUGIN_XML_FILE_NAME = "plugin.xml";

	private static final int BIG_NUMBER = 100;

	private static final String NATIVE_EXTENSIONS_SRC_FOLDER = ".qvtlib";

	private static final String NEW_BUILDER_ID = "org.eclipse.gmf.xpand.xpandBuilder";
	
	private static final String QVT_BUILDER_ID = "org.eclipse.m2m.qvt.oml.project.QVTOBuilder";
	
	private static final String QVT_BUIDLER_SRC_CONTAINER_ARG = "src_container";
	
	private static final String TRANSFORMATION_NATURE_ID = "org.eclipse.m2m.qvt.oml.project.QVTONature";

	private RootManager rootManager;

	private IProject selectedProject;

	private BuildPropertiesManager buildPropertiesManager;

	private static IProgressMonitor createSubProgressMonitor(IProgressMonitor monitor, String taskName, int numberOfTicks) throws InterruptedException {
		if (monitor.isCanceled()) {
			throw new InterruptedException("Process was canceled");
		}
		SubProgressMonitor spm = new SubProgressMonitor(monitor, numberOfTicks);
		if (taskName != null) {
			spm.setTaskName(taskName);
		}
		return spm;
	}
	
	public MigrateXpandProject(IProject project) {
		selectedProject = project;
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		monitor.setTaskName("Migrating Xpand project");
		List<? extends IContainer> xpandRoots = new ArrayList<IFolder>(getRootManager().getXpandRootFolders());
		if (xpandRoots.isEmpty()) {
			xpandRoots = Collections.singletonList(getSelectedProject());
		}
		monitor.beginTask("Migrating Xpand project", xpandRoots.size() + BIG_NUMBER * xpandRoots.size() + 4);
		int totalNumberOfSteps = 0;
		for (IContainer rootContainer : xpandRoots) {
			// each root migration requires two additional steps
			totalNumberOfSteps += 2 + getNumberOfSteps(rootContainer, createSubProgressMonitor(monitor, "Counting xpand resources in: " + rootContainer.getName(), 1));
		}
		IProgressMonitor subMonitor = createSubProgressMonitor(monitor, "Migrating all available xpand root folders", BIG_NUMBER * xpandRoots.size());
		subMonitor.beginTask("Migrating all available xpand root folders", totalNumberOfSteps);
		List<CharSequence> nativeLibraryDeclarations = new ArrayList<CharSequence>();
		List<List<IPath>> newXpandRootEntries = new ArrayList<List<IPath>>();
		for (IContainer rootContainer : xpandRoots) {
			newXpandRootEntries.add(migrateXpandRoot(rootContainer, nativeLibraryDeclarations, subMonitor));
		}
		registerNativeLibraries(nativeLibraryDeclarations, createSubProgressMonitor(monitor, "Registering native libraries", 1));
		switchToNewXpandBuilder(newXpandRootEntries, createSubProgressMonitor(monitor, "Registering new Xpand builder for the project", 1));
		updateXpandRootFile(newXpandRootEntries, createSubProgressMonitor(monitor, "Saving modified Xpand roots information", 1));
		getBuildPropertiesManager().save(createSubProgressMonitor(monitor, "Saving build.properties", 1));
		OawMarkerManager.deleteMarkers(getSelectedProject());
		buildPropertiesManager = null;
	}

	private void updateXpandRootFile(List<List<IPath>> newXpandRootEntries, IProgressMonitor monitor) throws InvocationTargetException, CoreException {
		monitor.beginTask("Saving modified Xpand roots information", 2);
		StringBuilder sb = new StringBuilder();
		for (List<IPath> rootEntry : newXpandRootEntries) {
			for (int i = 0; i < rootEntry.size(); i++) {
				if (i > 0) {
					sb.append(",");
				}
				sb.append(rootEntry.get(i).toString());
			}
			sb.append(ExpressionMigrationFacade.LF);
		}
		monitor.worked(1);
		SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 1);
		subMonitor.setTaskName("Saving Xpand root file");
		IFile xpandRootFile = getSelectedProject().getFile(RootManager.PROJECT_RELATIVE_PATH_TO_CONFIG_FILE);
		try {
			if (xpandRootFile.exists()) {
				xpandRootFile.setContents(new ByteArrayInputStream(sb.toString().getBytes(xpandRootFile.getCharset())), IFile.FORCE | IFile.KEEP_HISTORY, subMonitor);
			} else {
				xpandRootFile.create(new ByteArrayInputStream(sb.toString().getBytes(xpandRootFile.getParent().getDefaultCharset())), true, subMonitor);
			}
		} catch (UnsupportedEncodingException e) {
			throw new InvocationTargetException(e);
		}
	}

	private void switchToNewXpandBuilder(List<List<IPath>> newXpandRootEntries, IProgressMonitor monitor) throws CoreException, InterruptedException {
		monitor.beginTask("Registering new Xpand builder for the project", 2);
		IProjectDescription pd = getSelectedProject().getDescription();
		ArrayList<ICommand> newBuildCommands = new ArrayList<ICommand>();
		ICommand[] buildCommands = pd.getBuildSpec();
		boolean addNewXpandBuilder = true;
		boolean addQVTBuilder = true;
		for (int i = 0; i < buildCommands.length; i++) {
			String builderName = buildCommands[i].getBuilderName();
			if (OawBuilder.getBUILDER_ID().equals(builderName)) {
				continue;
			}
			if (NEW_BUILDER_ID.equals(builderName)) {
				addNewXpandBuilder = false;
			}
			if (QVT_BUILDER_ID.equals(builderName)) {
				addQVTBuilder = false;
			}
			newBuildCommands.add(buildCommands[i]);
		}
		if (addQVTBuilder) {
			ICommand newCommand = pd.newCommand();
			newCommand.setBuilderName(QVT_BUILDER_ID);
			if (newXpandRootEntries.size() > 0) {
				List<IPath> firstEntry = newXpandRootEntries.get(0);
				assert firstEntry.size() > 0;
				IPath mainIPath = firstEntry.get(0);
				if (!mainIPath.isAbsolute()) {
					Map arguments = newCommand.getArguments();
					if (arguments == null) {
						arguments = new HashMap();
					}
					arguments.put(QVT_BUIDLER_SRC_CONTAINER_ARG, mainIPath.toString());
					newCommand.setArguments(arguments);
				}
			}
			newBuildCommands.add(newCommand);
		}
		if (addNewXpandBuilder) {
			ICommand newCommand = pd.newCommand();
			newCommand.setBuilderName(NEW_BUILDER_ID);
			newBuildCommands.add(newCommand);
		}
		pd.setBuildSpec(newBuildCommands.toArray(new ICommand[newBuildCommands.size()]));
		
		ArrayList<String> newNatureIDs = new ArrayList<String>(Arrays.asList(pd.getNatureIds()));
		if (!newNatureIDs.contains(TRANSFORMATION_NATURE_ID)) {
			newNatureIDs.add(TRANSFORMATION_NATURE_ID);
			pd.setNatureIds(newNatureIDs.toArray(new String[newNatureIDs.size()]));
		}
		
		OawMarkerManager.deleteMarkers(getSelectedProject());
		monitor.worked(1);
		getSelectedProject().setDescription(pd, createSubProgressMonitor(monitor, "Saving modified project description", 1));
	}

	private void registerNativeLibraries(List<CharSequence> nativeLibraryDeclarations, IProgressMonitor progressMonitor) throws CoreException, InvocationTargetException, InterruptedException {
		if (nativeLibraryDeclarations.size() == 0) {
			progressMonitor.done();
			return;
		}
		progressMonitor.beginTask("Registering native libraries", 2);
		IFile pluginXml = getSelectedProject().getFile(PLUGIN_XML_FILE_NAME);
		StringBuilder pluginXmlContent = new StringBuilder();
		int insertPosition;
		if (pluginXml.exists()) {
			InputStream is = new BufferedInputStream(pluginXml.getContents());
			try {
				for (int ch = is.read(); ch != -1; ch = is.read()) {
					if (progressMonitor.isCanceled()) {
						throw new InterruptedException();
					}
					pluginXmlContent.append((char) ch);
				}
			} catch (IOException e) {
				throw new InvocationTargetException(e);
			}
			insertPosition = pluginXmlContent.lastIndexOf(PLUGIN_CLOSING_TAG);
			if (insertPosition < 0) {
				throw new InvocationTargetException(new Exception("Incorrect " + PLUGIN_XML_FILE_NAME + " file - " + PLUGIN_CLOSING_TAG + " tag was not found"));
			}
		} else {
			pluginXmlContent.append(PLUGIN_OPENNING_TAG);
			pluginXmlContent.append(LF);
			insertPosition = pluginXmlContent.length();
			pluginXmlContent.append(PLUGIN_CLOSING_TAG);
		}
		progressMonitor.worked(1);

		pluginXmlContent.insert(insertPosition, getNativeLibraryExtensionPoint(nativeLibraryDeclarations));
		try {
			ByteArrayInputStream inputStream = new ByteArrayInputStream(pluginXmlContent.toString().getBytes(PLUGIN_XML_CHARSET));
			IProgressMonitor subProgressMonitor = createSubProgressMonitor(progressMonitor, "Saving new " + PLUGIN_XML_FILE_NAME + "content", 1);
			if (pluginXml.exists()) {
				pluginXml.setContents(inputStream, IFile.FORCE | IFile.KEEP_HISTORY, subProgressMonitor);
			} else {
				pluginXml.create(inputStream, true, subProgressMonitor);
				getBuildPropertiesManager().addBinInclude(pluginXml);
			}
		} catch (UnsupportedEncodingException e) {
			throw new InvocationTargetException(e);
		}
	}

	private StringBuilder getNativeLibraryExtensionPoint(List<CharSequence> nativeLibraryDeclarations) {
		StringBuilder result = new StringBuilder("\t<extension point=\"org.eclipse.m2m.qvt.oml.javaBlackboxUnits\">");
		result.append(LF);
		for (CharSequence declaration : nativeLibraryDeclarations) {
			result.append("\t\t");
			result.append(declaration);
		}
		result.append("\t</extension>");
		return result.append(LF);
	}

	private List<IPath> migrateXpandRoot(IContainer rootContainer, List<CharSequence> nativeLibraryDeclarations, IProgressMonitor progressMonitor) throws InterruptedException, CoreException,
			InvocationTargetException {
		IFolder templatesOutputFolder = getTemplatesOutputFolder(rootContainer, createSubProgressMonitor(progressMonitor, "Calculating new templates root folder name", 1));
		IFolder nativeExtensionsRoot = getNativeExtensionsSourceRoot(rootContainer, createSubProgressMonitor(progressMonitor, "Creating new source rolot for native extensions", 1));

		MigrationVisitor visitor = new MigrationVisitor(rootContainer, templatesOutputFolder, nativeExtensionsRoot, getSelectedProject(), getRootManager(), getBuildPropertiesManager(), progressMonitor);
		acceptVisitor(rootContainer, visitor);
		visitor.done();
		nativeLibraryDeclarations.addAll(visitor.getNativeLibraryDeclarations());
		getBuildPropertiesManager().addBinInclude(templatesOutputFolder);
		return getRootManager().getMigratedXpandRootEntry(rootContainer, templatesOutputFolder);
	}

	private int getNumberOfSteps(IContainer rootContainer, IProgressMonitor progressMonitor) throws CoreException, InterruptedException, InvocationTargetException {
		progressMonitor.beginTask("Counting xpand resources in: " + rootContainer.getName(), 1);
		ResourceCountingVisitor counter = new ResourceCountingVisitor(progressMonitor);
		acceptVisitor(rootContainer, counter);
		progressMonitor.done();
		return counter.getNumberOfSteps();
	}

	private void acceptVisitor(IResource resource, AbstractMigrationVisitor visitor) throws InterruptedException, CoreException, InvocationTargetException {
		try {
			resource.accept(visitor);
		} catch (CoreException e) {
			if (e.getCause() instanceof InterruptedException) {
				throw (InterruptedException) e.getCause();
			} else if (e.getCause() != null) {
				throw new InvocationTargetException(e.getCause());
			} else {
				throw e;
			}
		}
	}

	private IFolder getTemplatesOutputFolder(IContainer rootContainer, IProgressMonitor progressMonitor) {
		assert rootContainer instanceof IFolder || rootContainer instanceof IProject;
		progressMonitor.beginTask("Calculating new templates root folder name", 1);
		IContainer parent;
		IPath relativePathBasis;
		if (rootContainer instanceof IFolder) {
			parent = rootContainer.getParent();
			relativePathBasis = rootContainer.getProjectRelativePath().removeFirstSegments(parent.getProjectRelativePath().segmentCount());
		} else {
			parent = rootContainer;
			relativePathBasis = new Path(DEFAULT_TEMPLATES_FOLDER);
		}
		IPath relativePath = relativePathBasis.addFileExtension(MIGRATED_ROOT_EXTENSION);
		for (int i = 1; parent.getFolder(relativePath).exists(); i++) {
			relativePath = relativePathBasis.addFileExtension(MIGRATED_ROOT_EXTENSION + i);
		}
		progressMonitor.done();
		return parent.getFolder(relativePath);
	}

	private IFolder getNativeExtensionsSourceRoot(IContainer rootContainer, IProgressMonitor progressMonitor) throws CoreException, InterruptedException {
		assert rootContainer instanceof IFolder || rootContainer instanceof IProject;
		progressMonitor.beginTask("Calculating source root for native extensions", 1);
		String baseFolderName;
		if (rootContainer instanceof IFolder) {
			baseFolderName = rootContainer.getName();
		} else {
			baseFolderName = DEFAULT_TEMPLATES_FOLDER;
		}
		String folderName = baseFolderName + NATIVE_EXTENSIONS_SRC_FOLDER;
		for (int i = 1; getSelectedProject().getFolder(folderName).exists(); i++) {
			folderName = baseFolderName + NATIVE_EXTENSIONS_SRC_FOLDER + i;
		}
		progressMonitor.done();
		return getSelectedProject().getFolder(folderName);
	}
	
	private IProject getSelectedProject() {
		return selectedProject;
	}
	
	private RootManager getRootManager() {
		if (rootManager == null) {
			rootManager = new RootManager(getSelectedProject());	
		}
		return rootManager;
	}
	
	private BuildPropertiesManager getBuildPropertiesManager() {
		if (buildPropertiesManager == null) {
			buildPropertiesManager = new BuildPropertiesManager(getSelectedProject());
		}
		return buildPropertiesManager;
	}

}
