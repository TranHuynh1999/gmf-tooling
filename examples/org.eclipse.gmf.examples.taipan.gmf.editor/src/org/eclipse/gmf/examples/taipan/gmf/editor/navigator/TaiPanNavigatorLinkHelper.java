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
package org.eclipse.gmf.examples.taipan.gmf.editor.navigator;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gef.EditPart;

import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.AquatoryEditPart;

import org.eclipse.gmf.examples.taipan.gmf.editor.part.TaiPanDiagramEditor;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

import org.eclipse.ui.navigator.ILinkHelper;

import org.eclipse.ui.part.FileEditorInput;

/**
 * @generated
 */
public class TaiPanNavigatorLinkHelper implements ILinkHelper {

	/**
	 * @generated
	 */
	public IStructuredSelection findSelection(IEditorInput anInput) {
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	public void activateEditor(IWorkbenchPage aPage, IStructuredSelection aSelection) {
		if (aSelection == null || aSelection.isEmpty()) {
			return;
		}
		if (aSelection.getFirstElement() instanceof TaiPanAbstractNavigatorItem) {
			TaiPanAbstractNavigatorItem navigatorItem = (TaiPanAbstractNavigatorItem) aSelection.getFirstElement();
			if (!AquatoryEditPart.MODEL_ID.equals(navigatorItem.getModelID())) {
				return;
			}
			Object parentFile = navigatorItem.getParent();
			while (parentFile instanceof TaiPanAbstractNavigatorItem) {
				parentFile = ((TaiPanAbstractNavigatorItem) parentFile).getParent();
			}
			if (false == parentFile instanceof IFile) {
				return;
			}
			IEditorInput fileInput = new FileEditorInput((IFile) parentFile);
			IEditorPart editor = aPage.findEditor(fileInput);
			if (editor == null) {
				return;
			}
			aPage.bringToTop(editor);
			if (editor instanceof TaiPanDiagramEditor) {
				TaiPanDiagramEditor diagramEditor = (TaiPanDiagramEditor) editor;
				Resource diagramResource = diagramEditor.getDiagram().eResource();

				View navigatorView = null;
				if (navigatorItem instanceof TaiPanNavigatorItem) {
					navigatorView = ((TaiPanNavigatorItem) navigatorItem).getView();
				} else if (navigatorItem instanceof TaiPanNavigatorGroup) {
					TaiPanNavigatorGroup group = (TaiPanNavigatorGroup) navigatorItem;
					if (group.getParent() instanceof TaiPanNavigatorItem) {
						navigatorView = ((TaiPanNavigatorItem) group.getParent()).getView();
					}
				}

				if (navigatorView == null) {
					return;
				}
				EObject selectedView = diagramResource.getEObject(navigatorView.eResource().getURIFragment(navigatorView));
				if (selectedView == null) {
					return;
				}
				EditPart selectedEditPart = (EditPart) diagramEditor.getDiagramGraphicalViewer().getEditPartRegistry().get(selectedView);
				if (selectedEditPart != null) {
					diagramEditor.getDiagramGraphicalViewer().select(selectedEditPart);
				}
			}
		}
	}

}
