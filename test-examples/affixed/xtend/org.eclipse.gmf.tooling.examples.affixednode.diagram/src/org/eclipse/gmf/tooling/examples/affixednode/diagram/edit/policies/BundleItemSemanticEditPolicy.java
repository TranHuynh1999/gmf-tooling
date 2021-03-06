package org.eclipse.gmf.tooling.examples.affixednode.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.edit.commands.IncomingCommunicatorCreateCommand;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.edit.commands.OutcomingCommunicatorCreateCommand;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.edit.parts.CommunicationEditPart;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.edit.parts.IncomingCommunicatorEditPart;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.edit.parts.OutcomingCommunicatorEditPart;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.part.AffixednodeVisualIDRegistry;
import org.eclipse.gmf.tooling.examples.affixednode.diagram.providers.AffixednodeElementTypes;

/**
 * @generated
 */
public class BundleItemSemanticEditPolicy extends AffixednodeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BundleItemSemanticEditPolicy() {
		super(AffixednodeElementTypes.Bundle_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AffixednodeElementTypes.IncomingCommunicator_3001 == req.getElementType()) {
			return getGEFWrapper(new IncomingCommunicatorCreateCommand(req));
		}
		if (AffixednodeElementTypes.OutcomingCommunicator_3002 == req.getElementType()) {
			return getGEFWrapper(new OutcomingCommunicatorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (AffixednodeVisualIDRegistry.getVisualID(node)) {
			case IncomingCommunicatorEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (AffixednodeVisualIDRegistry.getVisualID(incomingLink) == CommunicationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case OutcomingCommunicatorEditPart.VISUAL_ID:
				for (Iterator<?> it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (AffixednodeVisualIDRegistry.getVisualID(outgoingLink) == CommunicationEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
