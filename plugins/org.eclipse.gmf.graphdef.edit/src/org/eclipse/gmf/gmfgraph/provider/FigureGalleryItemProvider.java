/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.gmfgraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.gmf.gmfgraph.FigureGallery} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FigureGalleryItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureGalleryItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addImplementationBundlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Identity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Identity_name_feature", "_UI_Identity_type"),
				 GMFGraphPackage.eINSTANCE.getIdentity_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Bundle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationBundlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FigureGallery_implementationBundle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FigureGallery_implementationBundle_feature", "_UI_FigureGallery_type"),
				 GMFGraphPackage.eINSTANCE.getFigureGallery_ImplementationBundle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures());
		}
		return childrenFeatures;
	}

	/**
	 * This returns FigureGallery.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FigureGallery"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((FigureGallery)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FigureGallery_type") :
			getString("_UI_FigureGallery_type") + " " + label;
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

		switch (notification.getFeatureID(FigureGallery.class)) {
			case GMFGraphPackage.FIGURE_GALLERY__NAME:
			case GMFGraphPackage.FIGURE_GALLERY__IMPLEMENTATION_BUNDLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GMFGraphPackage.FIGURE_GALLERY__FIGURES:
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

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createLabeledContainer()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createRoundedRectangle()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createEllipse()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createPolyline()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createPolygon()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createPolylineConnection()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createPolylineDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createPolygonDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createCustomFigure()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createCustomDecoration()));

		newChildDescriptors.add
			(createChildParameter
				(GMFGraphPackage.eINSTANCE.getFigureGallery_Figures(),
				 GMFGraphFactory.eINSTANCE.createCustomConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return GMFGraphEditPlugin.INSTANCE;
	}

}
