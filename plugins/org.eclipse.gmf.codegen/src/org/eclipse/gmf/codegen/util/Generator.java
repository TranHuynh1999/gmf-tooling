/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.codegen.util;

import java.io.ByteArrayInputStream;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.codegen.gmfgen.GenChildContainer;
import org.eclipse.gmf.codegen.gmfgen.GenChildNode;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenCompartment;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.gmfgen.GenEditorView;
import org.eclipse.gmf.codegen.gmfgen.GenExternalNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenLink;
import org.eclipse.gmf.codegen.gmfgen.GenLinkLabel;
import org.eclipse.gmf.codegen.gmfgen.GenNode;
import org.eclipse.gmf.codegen.gmfgen.GenNodeLabel;
import org.eclipse.gmf.codegen.gmfgen.GenTopLevelNode;
import org.eclipse.gmf.common.UnexpectedBehaviourException;
import org.eclipse.gmf.common.codegen.GeneratorBase;

/**
 * Invokes JET templates to populate diagram editor project.
 * 
 * @author artem
 */
public class Generator extends GeneratorBase implements Runnable {

	private final GenEditorGenerator myEditorGen; 

	private final GenDiagram myDiagram;

	private CodegenEmitters myEmitters;

	private static Map/*<URI, SoftReference>*/ myCachedURI2EmitterMap = new HashMap();

	public Generator(GenEditorGenerator genModel) {
		this(genModel.getDiagram());
	}

	/**
	 * @deprecated use {@link #Generator(GenEditorGenerator) } instead
	 */
	public Generator(GenDiagram diagram) {
		myDiagram = diagram;
		myEditorGen = myDiagram.getEditorGen();
		URI resourceURI = myEditorGen.eResource().getURI();
		if (myEditorGen.isDynamicTemplates()) {
			myCachedURI2EmitterMap.remove(resourceURI);
		}
		CodegenEmitters old = myCachedURI2EmitterMap.containsKey(resourceURI) ? (CodegenEmitters) ((SoftReference) myCachedURI2EmitterMap.get(resourceURI)).get() : null;
		if (old == null) {
			myEmitters = new CodegenEmitters(!myEditorGen.isDynamicTemplates(), myEditorGen.getTemplateDirectory());
			if (!myEditorGen.isDynamicTemplates()) {
				myCachedURI2EmitterMap.put(resourceURI, new SoftReference(myEmitters));
			}
		} else {
			myEmitters = old;
		}
	}
	
	protected URL getJMergeControlFile() {
		return myEmitters.getJMergeControlFile();
	}

	private void generateITextAwareEditPart() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getITextAwareEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			"ITextAwareEditPart",
			myDiagram
		);
	}

	private void generateTextDirectEditManager() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getTextDirectEditManagerEmitter(),
			myDiagram.getEditPartsPackageName(),
			"TextDirectEditManager",
			myDiagram
		);
	}

	private void generateLabelDirectEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelDirectEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			"LabelDirectEditPolicy",
			myDiagram
		);
	}

	private void generateNonResizableTextEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNonResizableTextEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			"NonResizableTextEditPolicy",
			myDiagram
		);
	}

	protected void customRun() throws InterruptedException, JETException, UnexpectedBehaviourException {
		initializeEditorProject(myDiagram.getEditorGen().getPlugin().getID(), createReferencedProjectsList());
		// commands
		generateReorientConnectionViewCommand();

		// temp
		generateITextAwareEditPart();
		generateTextDirectEditManager();
		generateLabelDirectEditPolicy();
		generateNonResizableTextEditPolicy();
		
		// edit parts, edit policies and providers
		generateSemanticHints();
		generateAbstractParser();
		generateStructuralFeatureParser();
		generateStructuralFeaturesParser();
		generateBaseItemSemanticEditPolicy();
		generateBaseGraphicalNodeEditPolicy();
		generateReferenceConnectionEditPolicy();
		generateDiagramCanonicalEditPolicy();
		generateDiagramItemSemanticEditPolicy();
		generateTextSelectionEditPolicy();
		for (Iterator nodes = myDiagram.getTopLevelNodes().iterator(); nodes.hasNext();) {
			GenTopLevelNode node = (GenTopLevelNode) nodes.next();
			generateNode(node);
		}
		for (Iterator nodes = myDiagram.getChildNodes().iterator(); nodes.hasNext();) {
			GenChildNode node = (GenChildNode) nodes.next();
			if (node.isListContainerEntry()) {
				generateListContainerNode(node);
			} else {
				generateNode(node);
			}
		}
		for (Iterator compartments = myDiagram.getCompartments().iterator(); compartments.hasNext();) {
			GenCompartment compartment = (GenCompartment) compartments.next();
			generateCompartment(compartment);
		}
		for (Iterator it = myDiagram.getLinks().iterator(); it.hasNext();) {
			final GenLink next = (GenLink) it.next();
			generateViewFactory(next);
			generateLinkEditPart(next);
			if (next.getModelFacet() != null) {
				generateLinkItemSemanticEditPolicy(next);
			}
			for (Iterator labels = next.getLabels().iterator(); labels.hasNext();) {
				GenLinkLabel label = (GenLinkLabel) labels.next();
				generateLinkLabelEditPart(label);
				generateLinkLabelViewFactory(label);
			}
		}
		generateViewFactory(myDiagram);
		generateDiagramEditPart();
		generateDiagramExternalNodeLabelEditPart();
		generateEditPartFactory();
		generateElementTypes();
		generateViewProvider();
		generateEditPartProvider();
		generatePaletteProvider();
		generateModelingAssistantProvider();
		generatePropertyProvider();
		generateIconProvider();
		generateParserProvider();
		if(myDiagram.isValidationEnabled()) {
			generateValidationProvider();
			generateMarkerNavigationProvider();				
		}

		// editor
		generateInitDiagramFileAction();
		generatePalette();
		generateDiagramEditorUtil();
		generateDiagramFileCreator();
		generateVisualIDRegistry();
		generateCreationWizard();
		generateCreationWizardPage();
		generateEditor();
		generateCreateShortcutAction();
		generateLoadResourceAction();
		generateElementChooser();
		generateDocumentProvider();
		generateActionBarContributor();
		generateMatchingStrategy();
		generatePreferencesInitializer();
		generatePluginClass();
		generateBundleManifest();
		generatePluginProperties();
		generatePluginXml();
		generateBuildProperties();
		generateShortcutIcon();
	}

	private void generateNode(GenNode node) throws JETException, InterruptedException {
		generateNodeEditPart(node);
		for (Iterator labels = node.getLabels().iterator(); labels.hasNext();) {
			GenNodeLabel label = (GenNodeLabel) labels.next();
			if (label instanceof GenExternalNodeLabel) {
				GenExternalNodeLabel extLabel = (GenExternalNodeLabel) label;
				generateExternalNodeLabelEditPart(extLabel);
				generateExternalNodeLabelViewFactory(extLabel);
			} else {
				generateNodeLabelEditPart(label);
				generateNodeLabelViewFactory(label);
			}
		}
		generateChildContainer(node);
		generateNodeGraphicalNodeEditPolicy(node);
		generateNodeItemSemanticEditPolicy(node);
	}

	private void generateListContainerNode(GenNode child) throws JETException, InterruptedException {
		generateListContainerNodeEditPart(child);
		generateNodeItemSemanticEditPolicy(child);
		generateViewFactory(child);
	}
	
	private void generateCompartment(GenCompartment compartment) throws JETException, InterruptedException {
		generateCompartmentEditPart(compartment);
		generateCompartmentItemSemanticEditPolicy(compartment);
		generateChildContainer(compartment);
	}
	
	private void generateChildContainer(GenChildContainer childContainer) throws JETException, InterruptedException {
		generateViewFactory(childContainer);
		generateChildContainerCanonicalEditPolicy(childContainer);
	}

	// commands

	private void generateReorientConnectionViewCommand() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getReorientConnectionViewCommandEmitter(),
			myDiagram.getEditCommandsPackageName(),
			myDiagram.getReorientConnectionViewCommandClassName(),
			myDiagram
		);
	}

	// parts

	private void generateDiagramEditPart() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getEditPartClassName(),
			myDiagram
		);
	}

	private void generateDiagramExternalNodeLabelEditPart() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramExternalNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getBaseExternalNodeLabelEditPartClassName(),
			myDiagram
		);
	}

	private void generateNodeEditPart(GenNode genNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genNode.getEditPartClassName(),
			genNode
		);
	}

	private void generateNodeLabelEditPart(GenNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateExternalNodeLabelEditPart(GenExternalNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getExternalNodeLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateListContainerNodeEditPart(GenNode genChildNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getChildNodeEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genChildNode.getEditPartClassName(),
			genChildNode
		);
	}
	
	private void generateCompartmentEditPart(GenCompartment genCompartment) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCompartmentEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genCompartment.getEditPartClassName(),
			genCompartment
		);
	}

	private void generateLinkEditPart(GenLink genLink) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			genLink.getEditPartClassName(),
			genLink
		);
	}

	private void generateLinkLabelEditPart(GenLinkLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkLabelEditPartEmitter(),
			myDiagram.getEditPartsPackageName(),
			label.getEditPartClassName(),
			label
		);
	}

	private void generateEditPartFactory() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getEditPartFactoryEmitter(),
			myDiagram.getEditPartsPackageName(),
			myDiagram.getEditPartFactoryClassName(),
			myDiagram
		);
	}

	// edit policies

	private void generateBaseItemSemanticEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getBaseItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getBaseItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateBaseGraphicalNodeEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getBaseGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getBaseGraphicalNodeEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateReferenceConnectionEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getReferenceConnectionEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getReferenceConnectionEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateDiagramCanonicalEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramCanonicalEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getCanonicalEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateChildContainerCanonicalEditPolicy(GenChildContainer genContainer) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getChildContainerCanonicalEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genContainer.getCanonicalEditPolicyClassName(),
			genContainer
		);
	}

	private void generateDiagramItemSemanticEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getItemSemanticEditPolicyClassName(),
			myDiagram
		);
	}

	private void generateCompartmentItemSemanticEditPolicy(GenCompartment genCompartment) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCompartmentItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genCompartment.getItemSemanticEditPolicyClassName(),
			genCompartment
		);
	}

	private void generateNodeGraphicalNodeEditPolicy(GenNode genNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeGraphicalNodeEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getGraphicalNodeEditPolicyClassName(),
			genNode
		);
	}

	private void generateNodeItemSemanticEditPolicy(GenNode genNode) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getNodeItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genNode.getItemSemanticEditPolicyClassName(),
			genNode
		);
	}

	private void generateLinkItemSemanticEditPolicy(GenLink genLink) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLinkItemSemanticEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			genLink.getItemSemanticEditPolicyClassName(),
			genLink
		);
	}

	private void generateTextSelectionEditPolicy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getTextSelectionEditPolicyEmitter(),
			myDiagram.getEditPoliciesPackageName(),
			myDiagram.getTextSelectionEditPolicyClassName(),
			myDiagram
		);
	}

	// providers

	private void generateAbstractParser() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getAbstractParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getAbstractParserClassName(),
			myDiagram
		);
	}

	private void generateStructuralFeatureParser() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getStructuralFeatureParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getStructuralFeatureParserClassName(),
			myDiagram
		);
	}

	private void generateStructuralFeaturesParser() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getStructuralFeaturesParserEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getStructuralFeaturesParserClassName(),
			myDiagram
		);
	}

	private void generateSemanticHints() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getSemanticHintsEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getSemanticHintsClassName(),
			myDiagram
		);
	}

	private void generateElementTypes() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getElementTypesEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getElementTypesClassName(),
			myDiagram
		);
	}

	private void generateViewProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getViewProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getNotationViewProviderClassName(),
			myDiagram
		);
	}

	private void generateEditPartProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getEditPartProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getEditPartProviderClassName(),
			myDiagram
		);
	}

	private void generatePaletteProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPaletteProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getPaletteProviderClassName(),
			myDiagram
		);
	}
	
	private void generateModelingAssistantProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getModelingAssistantProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getModelingAssistantProviderClassName(),
			myDiagram);
	}

	private void generatePropertyProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPropertyProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getPropertyProviderClassName(),
			myDiagram);
	}

	private void generateIconProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getIconProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getIconProviderClassName(),
			myDiagram);
	}

	private void generateParserProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getParserProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getParserProviderClassName(),
			myDiagram);
	}
	
	private void generateValidationProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getValidationProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getValidationProviderClassName(),
			myDiagram);
	}
	
	private void generateMarkerNavigationProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getMarkerNavigationProviderEmitter(),
			myDiagram.getProvidersPackageName(),
			myDiagram.getMarkerNavigationProviderClassName(),
			myDiagram);
	}	

	// notation view factories

	private void generateViewFactory(GenCommonBase genElement) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			genElement.getNotationViewFactoryClassName(),
			genElement
		);
	}

	private void generateLinkLabelViewFactory(GenLinkLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	private void generateExternalNodeLabelViewFactory(GenExternalNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	private void generateNodeLabelViewFactory(GenNodeLabel label) throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getLabelTextViewFactoryEmitter(),
			myDiagram.getNotationViewFactoriesPackageName(),
			label.getNotationViewFactoryClassName(),
			label
		);
	}

	// editor

	private void generateInitDiagramFileAction() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getInitDiagramFileActionEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getInitDiagramFileActionClassName(),
			myDiagram);
	}

	private void generatePalette() throws JETException, InterruptedException {
		if (myDiagram.getPalette() == null) {
			return;
		}
		doGenerateJavaClass(
			myEmitters.getPaletteEmitter(),
			myDiagram.getPalette().getPackageName(),
			myDiagram.getPalette().getFactoryClassName(),
			myDiagram
		);
	}

	private void generateDiagramEditorUtil() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramEditorUtilEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDiagramEditorUtilClassName(),
			myDiagram
		);
	}

	private void generateDiagramFileCreator() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDiagramFileCreatorEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDiagramFileCreatorClassName(),
			myDiagram
		);
	}
	
	private void generateVisualIDRegistry() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getVisualIDRegistryEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getVisualIDRegistryClassName(),
			myDiagram
		);
	}

	private void generateCreationWizard() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCreationWizardEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getCreationWizardClassName(),
			myDiagram
		);
	}

	private void generateCreationWizardPage() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getCreationWizardPageEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getCreationWizardPageClassName(),
			myDiagram
		);
	}

	private void generateEditor() throws JETException, InterruptedException {
		final GenEditorView editor = myEditorGen.getEditor();
		doGenerateJavaClass(
			myEmitters.getEditorEmitter(),
			editor.getPackageName(),
			editor.getClassName(),
			editor
		);
	}
	
	private void generateCreateShortcutAction() throws JETException, InterruptedException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		doGenerateJavaClass(
				myEmitters.getCreateShortcutActionEmitter(),
				myEditorGen.getEditor().getPackageName(), 
				myDiagram.getCreateShortcutActionClassName(),
				myDiagram
			);
	}
	
	private void generateLoadResourceAction() throws JETException, InterruptedException {
		doGenerateJavaClass(
				myEmitters.getLoadResourceActionEmitter(),
				myEditorGen.getEditor().getPackageName(), 
				myDiagram.getLoadResourceActionClassName(),
				myDiagram
			);
	}
	
	private void generateElementChooser() throws JETException, InterruptedException {
		if (!myDiagram.generateCreateShortcutAction()) {
			return;
		}
		doGenerateJavaClass(
				myEmitters.getElementChooserEmitter(),
				myEditorGen.getEditor().getPackageName(), 
				myDiagram.getElementChooserClassName(),
				myDiagram
			);
	}
	
	private void generateDocumentProvider() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getDocumentProviderEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getDocumentProviderClassName(),
			myDiagram
		);
	}

	private void generateActionBarContributor() throws JETException, InterruptedException {
		final GenEditorView editor = myEditorGen.getEditor();
		doGenerateJavaClass(
			myEmitters.getActionBarContributorEmitter(),
			editor.getPackageName(),
			editor.getActionBarContributorClassName(),
			editor
		);
	}

	private void generateMatchingStrategy() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getMatchingStrategyEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getMatchingStrategyClassName(),
			myDiagram
		);
	}

	private void generatePreferencesInitializer() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPreferencesInitializerEmitter(),
			myEditorGen.getEditor().getPackageName(),
			myDiagram.getPreferenceInitializerClassName(),
			myEditorGen
		);
	}

	private void generatePluginClass() throws JETException, InterruptedException {
		doGenerateJavaClass(
			myEmitters.getPluginClassEmitter(),
			myEditorGen.getEditor().getPackageName(), 
			myEditorGen.getPlugin().getActivatorClassName(),
			myEditorGen.getPlugin()
		);
	}

	private void generatePluginXml() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getPluginXmlEmitter(), new Path("plugin.xml"), myDiagram.getEditorGen().getPlugin());
	}

	private void generatePluginProperties() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getPluginPropertiesEmitter(), new Path("plugin.properties"), myDiagram.getEditorGen().getPlugin());
	}

	private void generateBundleManifest() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getBundleManifestEmitter(), new Path("META-INF/MANIFEST.MF"), myDiagram.getEditorGen().getPlugin());
	}

	private void generateBuildProperties() throws JETException, InterruptedException {
		doGenerateFile(myEmitters.getBuildPropertiesEmitter(), new Path("build.properties"), myDiagram);
	}
	
	private void generateShortcutIcon() throws InterruptedException, JETException {
		if (!myDiagram.generateShortcutIcon()) {
			return;
		}
		Path iconPath = new Path("icons/shortcut.gif");
		IProgressMonitor pm = getNextStepMonitor();
		try {
			pm.beginTask(iconPath.lastSegment(), 3);
			IPath containerPath = getDestProject().getFullPath().append(iconPath.removeLastSegments(1));
			CodeGenUtil.findOrCreateContainer(containerPath, false, (IPath) null, new SubProgressMonitor(pm, 1));
			IFile f = getDestProject().getFile(iconPath);
			byte[] contents = myEmitters.getShortcutImageEmitter().generateGif();
			if (f.exists()) {
				if (!contains(f, new ByteArrayInputStream(contents))) {
					f.setContents(new ByteArrayInputStream(contents), true, true, new SubProgressMonitor(pm, 1));
				} else {
					pm.worked(1);
				}
			} else {
				f.create(new ByteArrayInputStream(contents), true, new SubProgressMonitor(pm, 1));
			}
			f.getParent().refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(pm, 1));
		} catch (CoreException ex) {
			handleException(ex);
		} finally {
			pm.done();
		}
	}

	protected void setupProgressMonitor() {
		Counter c = new Counter(myDiagram);
		c.setAdditionalOperations(8); // init, palette, editor, plugin.xml, etc
		c.setOperationsPerNode(2);
		c.setOperationsPerListContainerNode(1);
		c.setOperationsPerLink(2);
		setupProgressMonitor(Messages.start, c.getTotal());
	}
	
	
	protected final List createReferencedProjectsList() {
		return Collections.EMPTY_LIST;
	}

	private static final class Counter {
		private final GenDiagram myDiagram;
		private int myOpsPerNode = 1;
		private int myOpsPerLink = 1;
		private int myOpsPerListContainerNode = 1;
		private int myAdditionalOps = 0;
		private int myOpsPerCompartment = 1;

		Counter(GenDiagram diagram) {
			myDiagram = diagram;
		}

		public void setOperationsPerNode(int opsPerNode) {
			 myOpsPerNode = opsPerNode;
		}
		public void setOperationsPerLink(int opsPerLink) {
			myOpsPerLink = opsPerLink;
		}
		public void setOperationsPerListContainerNode(int opsPerChild) {
			myOpsPerListContainerNode = opsPerChild;
		}
		public void setOperationsPerCompartment(int opsPerCompartment) {
			myOpsPerCompartment = opsPerCompartment;
		}
		public void setAdditionalOperations(int additionalOps) {
			myAdditionalOps = additionalOps;
		}
		public int getTotal() {
			int rv = myAdditionalOps;
			rv += myDiagram.getTopLevelNodes().size() * myOpsPerNode;
			rv += getChildNodesCount(myDiagram.getChildNodes());
			rv += myDiagram.getCompartments().size() * myOpsPerCompartment;
			rv += myDiagram.getLinks().size() * myOpsPerLink;
			return rv;  
		}

		private int getChildNodesCount(Collection nodes) {
			int counter = 0;
			for (Iterator it = nodes.iterator(); it.hasNext();) {
				GenChildNode nextNode = (GenChildNode) it.next();
				if (nextNode.isListContainerEntry()) {
					counter += myOpsPerNode;
				} else {
					counter += myOpsPerListContainerNode;
				}
			}
			return counter;
		}
	}
}
