/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.examples.taipan.port.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.examples.taipan.Port;
import org.eclipse.gmf.examples.taipan.TaiPanPackage;
import org.eclipse.gmf.examples.taipan.port.diagram.edit.parts.BuildingEditPart;
import org.eclipse.gmf.examples.taipan.port.diagram.edit.parts.BuildingInfoEditPart;
import org.eclipse.gmf.examples.taipan.port.diagram.edit.parts.PortEditPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PortVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = PortDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PortEditPart.MODEL_ID.equals(view.getType())) {
				return PortEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.gmf.examples.taipan.port.diagram.part.PortVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PortDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TaiPanPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass()) && isDiagram((Port) domainElement)) {
			return PortEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null || !PortEditPart.MODEL_ID.equals(org.eclipse.gmf.examples.taipan.port.diagram.part.PortVisualIDRegistry.getModelID(containerView))) {
			return -1;
		}
		switch (org.eclipse.gmf.examples.taipan.port.diagram.part.PortVisualIDRegistry.getVisualID(containerView)) {
		case PortEditPart.VISUAL_ID:
			if (TaiPanPackage.eINSTANCE.getBuilding().isSuperTypeOf(domainElement.eClass())) {
				return BuildingEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.gmf.examples.taipan.port.diagram.part.PortVisualIDRegistry.getModelID(containerView);
		if (!PortEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PortEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.gmf.examples.taipan.port.diagram.part.PortVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PortEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case BuildingEditPart.VISUAL_ID:
			if (BuildingInfoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortEditPart.VISUAL_ID:
			if (BuildingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Port element) {
		return true;
	}

}
