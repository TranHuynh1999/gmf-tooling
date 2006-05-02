/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.tooldef.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.gmf.tooldef.GMFToolFactory;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.gmf.tooldef.ToolRegistry;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.tooldef.ToolRegistry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolRegistryItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolRegistryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GMFToolPackage.eINSTANCE.getToolRegistry_SharedActions());
			childrenFeatures.add(GMFToolPackage.eINSTANCE.getToolRegistry_AllMenus());
			childrenFeatures.add(GMFToolPackage.eINSTANCE.getToolRegistry_Palette());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ToolRegistry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ToolRegistry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_ToolRegistry_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ToolRegistry.class)) {
		case GMFToolPackage.TOOL_REGISTRY__SHARED_ACTIONS:
		case GMFToolPackage.TOOL_REGISTRY__ALL_MENUS:
		case GMFToolPackage.TOOL_REGISTRY__PALETTE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_SharedActions(), GMFToolFactory.eINSTANCE.createMenuAction()));

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_AllMenus(), GMFToolFactory.eINSTANCE.createPredefinedMenu()));

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_AllMenus(), GMFToolFactory.eINSTANCE.createContextMenu()));

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_AllMenus(), GMFToolFactory.eINSTANCE.createPopupMenu()));

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_AllMenus(), GMFToolFactory.eINSTANCE.createMainMenu()));

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_AllMenus(), GMFToolFactory.eINSTANCE.createToolbar()));

		newChildDescriptors.add(createChildParameter(GMFToolPackage.eINSTANCE.getToolRegistry_Palette(), GMFToolFactory.eINSTANCE.createPalette()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return GMFToolEditPlugin.INSTANCE;
	}

}
