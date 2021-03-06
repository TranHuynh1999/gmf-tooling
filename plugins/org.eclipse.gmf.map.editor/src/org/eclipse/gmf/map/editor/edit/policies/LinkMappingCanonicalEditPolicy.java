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
package org.eclipse.gmf.map.editor.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.EditPart;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.map.editor.edit.parts.DesignLabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.LabelMapping2EditPart;
import org.eclipse.gmf.map.editor.edit.parts.NodeMappingEditPart;

import org.eclipse.gmf.map.editor.part.GMFMapVisualIDRegistry;

import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.MappingEntry;
import org.eclipse.gmf.mappings.TopNodeReference;

import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;

import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;

import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

import org.eclipse.gmf.runtime.notation.Diagram;

/**
 * @generated
 */
public class LinkMappingCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null && view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		createdViews.addAll(refreshPhantoms());
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection refreshPhantoms() {
		Collection phantomNodes = new LinkedList();
		EObject container = ((View) getHost().getModel()).getElement();
		EClass containerMetaclass = container.eClass();
		Diagram diagram = getDiagram();
		if (GMFMapPackage.eINSTANCE.getTopNodeReference().isSuperTypeOf(containerMetaclass)) {
			EObject nextDestination = (EObject) ((TopNodeReference) container).getOwnedChild();
			if (NodeMappingEditPart.VISUAL_ID == GMFMapVisualIDRegistry.getNodeVisualID(diagram, nextDestination)) {
				phantomNodes.add(nextDestination);

			}
		}
		if (GMFMapPackage.eINSTANCE.getChildReference().isSuperTypeOf(containerMetaclass)) {
			EObject nextDestination = (EObject) ((ChildReference) container).getOwnedChild();
			if (NodeMappingEditPart.VISUAL_ID == GMFMapVisualIDRegistry.getNodeVisualID(diagram, nextDestination)) {
				phantomNodes.add(nextDestination);

			}
		}

		for (Iterator diagramNodes = getDiagram().getChildren().iterator(); diagramNodes.hasNext();) {
			View nextView = (View) diagramNodes.next();
			EObject nextViewElement = nextView.getElement();
			if (phantomNodes.contains(nextViewElement)) {
				phantomNodes.remove(nextViewElement);
			}
		}
		return createPhantomNodes(phantomNodes);
	}

	/**
	 * @generated
	 */
	private Collection createPhantomNodes(Collection nodes) {
		if (nodes.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		List descriptors = new ArrayList();
		for (Iterator elements = nodes.iterator(); elements.hasNext();) {
			EObject element = (EObject) elements.next();
			CreateViewRequest.ViewDescriptor descriptor = getViewDescriptor(element);
			descriptors.add(descriptor);
		}
		Diagram diagram = getDiagram();
		EditPart diagramEditPart = getDiagramEditPart();

		CreateViewRequest request = getCreateViewRequest(descriptors);
		Command cmd = diagramEditPart.getCommand(request);
		if (cmd == null) {
			CompositeCommand cc = new CompositeCommand(DiagramUIMessages.AddCommand_Label);
			for (Iterator descriptorsIterator = descriptors.iterator(); descriptorsIterator.hasNext();) {
				CreateViewRequest.ViewDescriptor descriptor = (CreateViewRequest.ViewDescriptor) descriptorsIterator.next();
				ICommand createCommand = new CreateCommand(((IGraphicalEditPart) getHost()).getEditingDomain(), descriptor, diagram);
				cc.compose(createCommand);
			}
			cmd = new ICommandProxy(cc);
		}

		List adapters = Collections.EMPTY_LIST;
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(((IGraphicalEditPart) diagramEditPart).getNotationView())).execute();
			executeCommand(cmd);
			adapters = (List) request.getNewObject();
		}
		diagramEditPart.refresh();
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getDiagramEditPart() {
		return (EditPart) getHost().getViewer().getEditPartRegistry().get(getDiagram());
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

}
