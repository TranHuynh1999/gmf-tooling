/*
 * Copyright (c) 2006, 2007 Borland Software Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.ecore.edit.commands;

import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EcoreReorientConnectionViewCommand extends AbstractTransactionalCommand {

	/**
	 * @generated
	 */
	private IAdaptable edgeAdaptor;

	/**
	 * @generated
	 */
	public EcoreReorientConnectionViewCommand(TransactionalEditingDomain editingDomain, String label) {
		super(editingDomain, label, null);
	}

	/**
	 * @generated
	 */
	public List getAffectedFiles() {
		View view = (View) edgeAdaptor.getAdapter(View.class);
		if (view != null) {
			return getWorkspaceFiles(view);
		}
		return super.getAffectedFiles();
	}

	/**
	 * @generated
	 */
	public IAdaptable getEdgeAdaptor() {
		return edgeAdaptor;
	}

	/**
	 * @generated
	 */
	public void setEdgeAdaptor(IAdaptable edgeAdaptor) {
		this.edgeAdaptor = edgeAdaptor;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) {
		assert null != edgeAdaptor : "Null child in EcoreReorientConnectionViewCommand"; //$NON-NLS-1$
		Edge edge = (Edge) getEdgeAdaptor().getAdapter(Edge.class);
		assert null != edge : "Null edge in EcoreReorientConnectionViewCommand"; //$NON-NLS-1$

		View tempView = edge.getSource();
		edge.setSource(edge.getTarget());
		edge.setTarget(tempView);

		return CommandResult.newOKCommandResult();
	}
}
