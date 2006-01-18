/*
 * Copyright (c) 2006 Eclipse.org
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    dstadnik - initial API and implementation
 */
package org.eclipse.gmf.internal.codegen.dashboard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.presentation.EcoreModelWizard;
import org.eclipse.gmf.codegen.gmfgen.presentation.GMFGenModelWizard;
import org.eclipse.gmf.gmfgraph.presentation.GMFGraphModelWizard;
import org.eclipse.gmf.internal.codegen.FileSelector;
import org.eclipse.gmf.internal.codegen.popup.actions.ExecuteTemplatesAction;
import org.eclipse.gmf.internal.codegen.popup.actions.TransformToGenModel;
import org.eclipse.gmf.internal.codegen.wizards.GMFGraphSimpleModelWizard;
import org.eclipse.gmf.internal.codegen.wizards.GMFToolSimpleModelWizard;
import org.eclipse.gmf.internal.codegen.wizards.NewGMFMapModelWizard;
import org.eclipse.gmf.mappings.presentation.GMFMapModelWizard;
import org.eclipse.gmf.tooldef.presentation.GMFToolModelWizard;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;

/**
 * @author dstadnik
 */
public class DashboardMediator {

	private DashboardFigure view;

	private Shell shell;

	private IProject project;

	private DashboardState state;

	public DashboardMediator(Shell shell) {
		state = new DashboardState();
		this.shell = shell;
	}

	public void setView(DashboardFigure view) {
		this.view = view;
		view.getGDMFigure().addAction(view.createLinkFigure("Select", new SelectGDMAction()));
		view.getGDMFigure().addAction(view.createLinkFigure("Create", new CreateGDMAction()));
		view.getDMFigure().addAction(view.createLinkFigure("Select", new SelectDMAction()));
		view.getDMFigure().addAction(view.createLinkFigure("Create", new CreateDMAction()));
		view.getTDMFigure().addAction(view.createLinkFigure("Select", new SelectTDMAction()));
		view.getTDMFigure().addAction(view.createLinkFigure("Create", new CreateTDMAction()));
		view.getMMFigure().addAction(view.createLinkFigure("Select", new SelectMMAction()));
		view.getMMFigure().addAction(view.createLinkFigure("Create", new CreateMMAction()));
		view.getGMFigure().addAction(view.createLinkFigure("Select", new SelectGMAction()));
		view.getGMFigure().addAction(view.createLinkFigure("Create", new CreateGMAction()));
		view.getGMFigure().addAction(view.createLinkFigure("Generate diagram editor", new GenerateDEAction()));
		view.getDM2GDMFigure().addAction(view.createLinkFigure("Derive", new DeriveGDMAction()));
		view.getDM2TDMFigure().addAction(view.createLinkFigure("Derive", new DeriveTDMAction()));
		view.getDM2MMFigure().addAction(view.createLinkFigure("Combine", new CombineMMAction()));
		view.getMM2GMFigure().addAction(view.createLinkFigure("Transform", new GenerateGMAction()));
		updateStatus();
	}

	protected IFile getFile(String fileName) {
		return project.getFile(new Path(fileName));
	}

	protected String getName(IFile file) {
		if (file == null) {
			return null;
		}
		return file.getProjectRelativePath().toString();
	}

	public IProject getProject() {
		return project;
	}

	public DashboardState getState() {
		return state;
	}

	public void setProjectAndState(IProject project, DashboardState state) {
		this.project = project;
		this.state = state;
		if (this.state == null) {
			this.state = new DashboardState();
		}
		updateStatus();
	}

	protected void updateStatus() {
		if (project == null) {
			view.getStatusLine(0).setText("Select a project in workspace");
			view.getStatusLine(1).setText("");
		} else {
			view.getStatusLine(0).setText("Project: " + project.getName());
			int done = state.getSpecifiedModelsCount() * 100 / state.getModelsCount();
			view.getStatusLine(1).setText("Progress: " + done + "% done");
		}
		setModelName(view.getGDMFigure(), state.gdmFileName);
		setModelName(view.getDMFigure(), state.dmFileName);
		setModelName(view.getTDMFigure(), state.tdmFileName);
		setModelName(view.getMMFigure(), state.mmFileName);
		setModelName(view.getGMFigure(), state.gmFileName);
		view.repaint(); // update hyperlinks
	}

	protected void setModelName(ModelFigure figure, String name) {
		figure.setName(name);
	}

	protected abstract class SelectFileAction implements DashboardAction {

		public boolean isEnabled() {
			return project != null;
		}

		public void run() {
			IFile file = null;
			String fileName = getFileName();
			if (fileName != null) {
				file = getFile(fileName);
			}
			file = FileSelector.selectFile(shell, getFigure().getDescription(), project, file, getFileExtension());
			setFileName(getName(file));
			updateStatus();
		}

		protected abstract ModelFigure getFigure();

		protected abstract String getFileName();

		protected abstract void setFileName(String fileName);

		protected abstract String getFileExtension();
	}

	protected abstract class RunWizardAction implements DashboardAction {

		private static final int SIZING_WIZARD_WIDTH = 500;

		private static final int SIZING_WIZARD_HEIGHT = 500;

		public boolean isEnabled() {
			return project != null;
		}

		public void run() {
			final IWizard wizard = createWizard();
			if (wizard instanceof IWorkbenchWizard) {
				((IWorkbenchWizard) wizard).init(PlatformUI.getWorkbench(), getSelection());
			}
			WizardDialog dialog = new WizardDialog(shell, wizard) {

				protected void finishPressed() {
					wizardFinished(wizard);
					super.finishPressed();
				}
			};
			dialog.create();
			dialog.getShell().setSize(Math.max(SIZING_WIZARD_WIDTH, dialog.getShell().getSize().x), SIZING_WIZARD_HEIGHT);
			dialog.open();
		}

		protected IStructuredSelection getSelection() {
			return new StructuredSelection(project);
		}

		protected abstract IWizard createWizard();

		protected void wizardFinished(IWizard wizard) {
		}
	}

	private class SelectGDMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getGDMFigure();
		}

		protected String getFileName() {
			return state.gdmFileName;
		}

		protected void setFileName(String fileName) {
			state.gdmFileName = fileName;
		}

		protected String getFileExtension() {
			return "gmfgraph";
		}
	}

	private class SelectDMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getDMFigure();
		}

		protected String getFileName() {
			return state.dmFileName;
		}

		protected void setFileName(String fileName) {
			state.dmFileName = fileName;
		}

		protected String getFileExtension() {
			return "ecore";
		}
	}

	private class SelectTDMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getTDMFigure();
		}

		protected String getFileName() {
			return state.tdmFileName;
		}

		protected void setFileName(String fileName) {
			state.tdmFileName = fileName;
		}

		protected String getFileExtension() {
			return "gmftool";
		}
	}

	private class SelectMMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getMMFigure();
		}

		protected String getFileName() {
			return state.mmFileName;
		}

		protected void setFileName(String fileName) {
			state.mmFileName = fileName;
		}

		protected String getFileExtension() {
			return "gmfmap";
		}
	}

	private class SelectGMAction extends SelectFileAction {

		protected ModelFigure getFigure() {
			return DashboardMediator.this.view.getGMFigure();
		}

		protected String getFileName() {
			return state.gmFileName;
		}

		protected void setFileName(String fileName) {
			state.gmFileName = fileName;
		}

		protected String getFileExtension() {
			return "gmfgen";
		}
	}

	private class CreateGDMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFGraphModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFGraphModelWizard) wizard).getModelFile();
			state.gdmFileName = getName(file);
			updateStatus();
		}
	}

	private class CreateDMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new EcoreModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((EcoreModelWizard) wizard).getModelFile();
			state.dmFileName = getName(file);
			updateStatus();
		}
	}

	private class CreateTDMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFToolModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFToolModelWizard) wizard).getModelFile();
			state.tdmFileName = getName(file);
			updateStatus();
		}
	}

	private class CreateMMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFMapModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFMapModelWizard) wizard).getModelFile();
			state.mmFileName = getName(file);
			updateStatus();
		}
	}

	private class CreateGMAction extends RunWizardAction {

		protected IWizard createWizard() {
			return new GMFGenModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFGenModelWizard) wizard).getModelFile();
			state.gmFileName = getName(file);
			updateStatus();
		}
	}

	private class DeriveGDMAction extends RunWizardAction {

		public boolean isEnabled() {
			return super.isEnabled() && state.dmFileName != null;
		}

		protected IWizard createWizard() {
			return new GMFGraphSimpleModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFGraphSimpleModelWizard) wizard).getModelFile();
			state.gdmFileName = getName(file);
			updateStatus();
		}

		protected IStructuredSelection getSelection() {
			return new StructuredSelection(getFile(state.dmFileName));
		}
	}

	private class DeriveTDMAction extends RunWizardAction {

		public boolean isEnabled() {
			return super.isEnabled() && state.dmFileName != null;
		}

		protected IWizard createWizard() {
			return new GMFToolSimpleModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((GMFToolSimpleModelWizard) wizard).getModelFile();
			state.tdmFileName = getName(file);
			updateStatus();
		}

		protected IStructuredSelection getSelection() {
			return new StructuredSelection(getFile(state.dmFileName));
		}
	}

	private class CombineMMAction extends RunWizardAction {

		public boolean isEnabled() {
			return project != null && state.gdmFileName != null && state.dmFileName != null && state.tdmFileName != null;
		}

		protected IWizard createWizard() {
			return new NewGMFMapModelWizard();
		}

		protected void wizardFinished(IWizard wizard) {
			IFile file = ((NewGMFMapModelWizard) wizard).getModelFile();
			state.mmFileName = getName(file);
			updateStatus();
		}
	}

	private class GenerateGMAction implements DashboardAction {

		public boolean isEnabled() {
			return project != null && state.mmFileName != null;
		}

		public void run() {
			IFile file = getFile(state.mmFileName);
			TransformToGenModel action = new TransformToGenModel();
			IAction uiAction = new Action() {
			};
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			action.setActivePart(uiAction, window.getPartService().getActivePart());
			action.selectionChanged(uiAction, new StructuredSelection(file));
			action.run(uiAction);
			IFile gfile = action.getGenModelFile();
			state.gmFileName = getName(gfile);
			updateStatus();
		}
	}

	private class GenerateDEAction implements DashboardAction {

		public boolean isEnabled() {
			return project != null && state.gmFileName != null;
		}

		public void run() {
			IFile file = getFile(state.gmFileName);
			ExecuteTemplatesAction action = new ExecuteTemplatesAction();
			IAction uiAction = new Action() {
			};
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			action.setActivePart(uiAction, window.getPartService().getActivePart());
			action.selectionChanged(uiAction, new StructuredSelection(file));
			action.run(uiAction);
		}
	}
}
