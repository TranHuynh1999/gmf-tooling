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
package org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.policies.LargeItemCanonicalEditPolicy;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.policies.LargeItemGraphicalNodeEditPolicy;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.policies.LargeItemItemSemanticEditPolicy;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.policies.TaiPanTextSelectionEditPolicy;
import org.eclipse.gmf.examples.taipan.gmf.editor.part.TaiPanVisualIDRegistry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LargeItemEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public LargeItemEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new LargeItemItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new LargeItemGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new LargeItemCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new TaiPanTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		});
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		LargeItemFigure figure = new LargeItemFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public LargeItemFigure getPrimaryShape() {
		return (LargeItemFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LargeItem_articleEditPart) {
			((LargeItem_articleEditPart) childEditPart).setLabel(getPrimaryShape().getFigureLargeItemArticleFigure());
			return true;
		}
		if (childEditPart instanceof LargeItem_weightEditPart) {
			((LargeItem_weightEditPart) childEditPart).setLabel(getPrimaryShape().getFigureLargeItemWeightFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		return new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(TaiPanVisualIDRegistry.getType(LargeItem_articleEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (!addFixedChild(childEditPart)) {
			super.addChildVisual(childEditPart, -1);
		}
	}

	/**
	 * @generated
	 */
	public class LargeItemFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public LargeItemFigure() {

			org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout myGenLayoutManager = new org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout();

			this.setLayoutManager(myGenLayoutManager);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_0.setText("<...>");

			setFigureLargeItemArticleFigure(fig_0);

			Object layData0 = null;

			this.add(fig_0, layData0);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_1.setText("<...>");

			setFigureLargeItemWeightFigure(fig_1);

			Object layData1 = null;

			this.add(fig_1, layData1);
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fLargeItemArticleFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureLargeItemArticleFigure() {
			return fLargeItemArticleFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureLargeItemArticleFigure(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fLargeItemArticleFigure = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fLargeItemWeightFigure;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureLargeItemWeightFigure() {
			return fLargeItemWeightFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureLargeItemWeightFigure(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fLargeItemWeightFigure = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
