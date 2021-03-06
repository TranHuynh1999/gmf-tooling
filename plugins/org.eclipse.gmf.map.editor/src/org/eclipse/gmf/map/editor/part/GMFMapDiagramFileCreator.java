/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.map.editor.part;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * @generated
 */
public class GMFMapDiagramFileCreator {

	private GMFMapCreationWizard wizard;

	/**
	 * @generated
	 */
	private static GMFMapDiagramFileCreator INSTANCE = new GMFMapDiagramFileCreator();

	/**
	 * @generated
	 */
	public static GMFMapDiagramFileCreator getInstance() {
		return INSTANCE;
	}

	/**
	 * @generated
	 */
	public static boolean exists(IPath path) {
		return ResourcesPlugin.getWorkspace().getRoot().exists(path);
	}

	public GMFMapDiagramFileCreator() {
	}

	public GMFMapDiagramFileCreator(GMFMapCreationWizard wizard) {
		this.wizard = wizard;
	}

	public GMFMapCreationWizard getWizard() {
		return wizard;
	}

	/**
	 * @generated
	 */
	public String getExtension() {
		return ".gmfmap_diagram"; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public String getUniqueFileName(IPath containerPath, String fileName) {
		int nFileNumber = 1;
		fileName = removeExtensionFromFileName(fileName);
		String newFileName = fileName;
		IPath diagramFilePath = containerPath.append(appendExtensionToFileName(newFileName));
		IPath modelFilePath = containerPath.append(newFileName + ".gmfmap"); //$NON-NLS-1$
		while (exists(diagramFilePath) || exists(modelFilePath)) {
			nFileNumber++;
			newFileName = fileName + nFileNumber;
			diagramFilePath = containerPath.append(appendExtensionToFileName(newFileName));
			modelFilePath = containerPath.append(newFileName + ".gmfmap"); //$NON-NLS-1$
		}
		return newFileName;
	}

	/**
	 * @generated
	 */
	public String appendExtensionToFileName(String fileName) {
		if (!fileName.endsWith(getExtension())) {
			return fileName + getExtension();
		}
		return fileName;
	}

	/**
	 * @generated
	 */
	private String removeExtensionFromFileName(String fileName) {
		if (fileName.endsWith(getExtension())) {
			return fileName.substring(0, fileName.length() - getExtension().length());
		}
		return fileName;
	}

	/**
	 * @generated
	 */
	public IFile createNewFile(IPath containerPath, String fileName, InputStream initialContents, Shell shell) {
		IPath newFilePath = containerPath.append(appendExtensionToFileName(fileName));
		IFile newFileHandle = ResourcesPlugin.getWorkspace().getRoot().getFile(newFilePath);
		try {
			createFile(newFileHandle, initialContents);
		} catch (CoreException e) {
			ErrorDialog.openError(shell, "Creation Problems", null, e.getStatus());
			return null;
		}
		return newFileHandle;
	}

	/**
	 * @generated
	 */
	protected void createFile(IFile fileHandle, InputStream contents) throws CoreException {
		try {
			if (contents == null) {
				contents = new ByteArrayInputStream(new byte[0]);
			}
			fileHandle.create(contents, false, new NullProgressMonitor());
		} catch (CoreException e) {
			// If the file already existed locally, just refresh to get contents
			if (e.getStatus().getCode() == IResourceStatus.PATH_OCCUPIED) {
				fileHandle.refreshLocal(IResource.DEPTH_ZERO, null);
			} else {
				throw e;
			}
		}
	}
}