/*
 * Copyright (c) 2006, 2008 Borland Software Corp.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alexander Shatalin (Borland) - initial API and implementation
 */
package org.eclipse.gmf.ecore.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.ecore.edit.parts.EAnnotation2EditPart;
import org.eclipse.gmf.ecore.edit.parts.EAnnotationDetailsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EAnnotationEditPart;
import org.eclipse.gmf.ecore.edit.parts.EAnnotationReferencesEditPart;
import org.eclipse.gmf.ecore.edit.parts.EAttributeEditPart;
import org.eclipse.gmf.ecore.edit.parts.EClass2EditPart;
import org.eclipse.gmf.ecore.edit.parts.EClassAttributesEditPart;
import org.eclipse.gmf.ecore.edit.parts.EClassClassAnnotationsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EClassESuperTypesEditPart;
import org.eclipse.gmf.ecore.edit.parts.EClassEditPart;
import org.eclipse.gmf.ecore.edit.parts.EClassOperationsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EDataType2EditPart;
import org.eclipse.gmf.ecore.edit.parts.EDataTypeDataTypeAnnotationsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EDataTypeEditPart;
import org.eclipse.gmf.ecore.edit.parts.EEnum2EditPart;
import org.eclipse.gmf.ecore.edit.parts.EEnumEditPart;
import org.eclipse.gmf.ecore.edit.parts.EEnumEnumAnnotationsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EEnumLiteralEditPart;
import org.eclipse.gmf.ecore.edit.parts.EEnumLiteralsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EOperationEditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackage2EditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackage3EditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackageClassesEditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackageDataTypesEditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackageEditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackageEnumsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackagePackageAnnotationsEditPart;
import org.eclipse.gmf.ecore.edit.parts.EPackagePackagesEditPart;
import org.eclipse.gmf.ecore.edit.parts.EReference2EditPart;
import org.eclipse.gmf.ecore.edit.parts.EReferenceEditPart;
import org.eclipse.gmf.ecore.edit.parts.EStringToStringMapEntryEditPart;
import org.eclipse.gmf.ecore.providers.EcoreElementTypes;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EcoreDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (EcoreVisualIDRegistry.getVisualID(view)) {
		case EClassAttributesEditPart.VISUAL_ID:
			return getEClassAttributes_7001SemanticChildren(view);
		case EClassOperationsEditPart.VISUAL_ID:
			return getEClassOperations_7002SemanticChildren(view);
		case EClassClassAnnotationsEditPart.VISUAL_ID:
			return getEClassClassAnnotations_7003SemanticChildren(view);
		case EPackageClassesEditPart.VISUAL_ID:
			return getEPackageClasses_7004SemanticChildren(view);
		case EPackagePackagesEditPart.VISUAL_ID:
			return getEPackagePackages_7005SemanticChildren(view);
		case EPackageDataTypesEditPart.VISUAL_ID:
			return getEPackageDataTypes_7006SemanticChildren(view);
		case EPackageEnumsEditPart.VISUAL_ID:
			return getEPackageEnums_7007SemanticChildren(view);
		case EPackagePackageAnnotationsEditPart.VISUAL_ID:
			return getEPackagePackageAnnotations_7008SemanticChildren(view);
		case EAnnotationDetailsEditPart.VISUAL_ID:
			return getEAnnotationDetails_7009SemanticChildren(view);
		case EDataTypeDataTypeAnnotationsEditPart.VISUAL_ID:
			return getEDataTypeDataTypeAnnotations_7010SemanticChildren(view);
		case EEnumLiteralsEditPart.VISUAL_ID:
			return getEEnumLiterals_7011SemanticChildren(view);
		case EEnumEnumAnnotationsEditPart.VISUAL_ID:
			return getEEnumEnumAnnotations_7012SemanticChildren(view);
		case EPackageEditPart.VISUAL_ID:
			return getEPackage_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEClassAttributes_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EClass modelElement = (EClass) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEAttributes().iterator(); it.hasNext();) {
			EAttribute childElement = (EAttribute) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EAttributeEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEClassOperations_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EClass modelElement = (EClass) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEOperations().iterator(); it.hasNext();) {
			EOperation childElement = (EOperation) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EOperationEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEClassClassAnnotations_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EClass modelElement = (EClass) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation childElement = (EAnnotation) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EAnnotation2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackageClasses_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EPackage modelElement = (EPackage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEClassifiers().iterator(); it.hasNext();) {
			EClassifier childElement = (EClassifier) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EClass2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackagePackages_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EPackage modelElement = (EPackage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getESubpackages().iterator(); it.hasNext();) {
			EPackage childElement = (EPackage) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EPackage3EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackageDataTypes_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EPackage modelElement = (EPackage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEClassifiers().iterator(); it.hasNext();) {
			EClassifier childElement = (EClassifier) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EDataType2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackageEnums_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EPackage modelElement = (EPackage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEClassifiers().iterator(); it.hasNext();) {
			EClassifier childElement = (EClassifier) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EEnum2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackagePackageAnnotations_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EPackage modelElement = (EPackage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation childElement = (EAnnotation) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EAnnotation2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotationDetails_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EAnnotation modelElement = (EAnnotation) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getDetails().iterator(); it.hasNext();) {
			Map.Entry childElement = (Map.Entry) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, (EObject) childElement);
			if (visualID == EStringToStringMapEntryEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor((EObject) childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEDataTypeDataTypeAnnotations_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EDataType modelElement = (EDataType) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation childElement = (EAnnotation) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EAnnotation2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEEnumLiterals_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EEnum modelElement = (EEnum) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getELiterals().iterator(); it.hasNext();) {
			EEnumLiteral childElement = (EEnumLiteral) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EEnumLiteralEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEEnumEnumAnnotations_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EEnum modelElement = (EEnum) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation childElement = (EAnnotation) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EAnnotation2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		EPackage modelElement = (EPackage) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getEClassifiers().iterator(); it.hasNext();) {
			EClassifier childElement = (EClassifier) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EClassEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EDataTypeEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EEnumEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getESubpackages().iterator(); it.hasNext();) {
			EPackage childElement = (EPackage) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EPackage2EditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getEAnnotations().iterator(); it.hasNext();) {
			EAnnotation childElement = (EAnnotation) it.next();
			int visualID = EcoreVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EAnnotationEditPart.VISUAL_ID) {
				result.add(new EcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (EcoreVisualIDRegistry.getVisualID(view)) {
		case EPackageEditPart.VISUAL_ID:
			return getEPackage_1000ContainedLinks(view);
		case EReference2EditPart.VISUAL_ID:
			return getEReference_4003ContainedLinks(view);
		case EDataTypeEditPart.VISUAL_ID:
			return getEDataType_2004ContainedLinks(view);
		case EStringToStringMapEntryEditPart.VISUAL_ID:
			return getEStringToStringMapEntry_3008ContainedLinks(view);
		case EPackage2EditPart.VISUAL_ID:
			return getEPackage_2002ContainedLinks(view);
		case EPackage3EditPart.VISUAL_ID:
			return getEPackage_3005ContainedLinks(view);
		case EClass2EditPart.VISUAL_ID:
			return getEClass_3004ContainedLinks(view);
		case EOperationEditPart.VISUAL_ID:
			return getEOperation_3002ContainedLinks(view);
		case EAttributeEditPart.VISUAL_ID:
			return getEAttribute_3001ContainedLinks(view);
		case EReferenceEditPart.VISUAL_ID:
			return getEReference_4002ContainedLinks(view);
		case EEnum2EditPart.VISUAL_ID:
			return getEEnum_3007ContainedLinks(view);
		case EDataType2EditPart.VISUAL_ID:
			return getEDataType_3006ContainedLinks(view);
		case EEnumEditPart.VISUAL_ID:
			return getEEnum_2005ContainedLinks(view);
		case EEnumLiteralEditPart.VISUAL_ID:
			return getEEnumLiteral_3009ContainedLinks(view);
		case EAnnotation2EditPart.VISUAL_ID:
			return getEAnnotation_3003ContainedLinks(view);
		case EAnnotationEditPart.VISUAL_ID:
			return getEAnnotation_2003ContainedLinks(view);
		case EClassEditPart.VISUAL_ID:
			return getEClass_2001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (EcoreVisualIDRegistry.getVisualID(view)) {
		case EReference2EditPart.VISUAL_ID:
			return getEReference_4003IncomingLinks(view);
		case EDataTypeEditPart.VISUAL_ID:
			return getEDataType_2004IncomingLinks(view);
		case EStringToStringMapEntryEditPart.VISUAL_ID:
			return getEStringToStringMapEntry_3008IncomingLinks(view);
		case EPackage2EditPart.VISUAL_ID:
			return getEPackage_2002IncomingLinks(view);
		case EPackage3EditPart.VISUAL_ID:
			return getEPackage_3005IncomingLinks(view);
		case EClass2EditPart.VISUAL_ID:
			return getEClass_3004IncomingLinks(view);
		case EOperationEditPart.VISUAL_ID:
			return getEOperation_3002IncomingLinks(view);
		case EAttributeEditPart.VISUAL_ID:
			return getEAttribute_3001IncomingLinks(view);
		case EReferenceEditPart.VISUAL_ID:
			return getEReference_4002IncomingLinks(view);
		case EEnum2EditPart.VISUAL_ID:
			return getEEnum_3007IncomingLinks(view);
		case EDataType2EditPart.VISUAL_ID:
			return getEDataType_3006IncomingLinks(view);
		case EEnumEditPart.VISUAL_ID:
			return getEEnum_2005IncomingLinks(view);
		case EEnumLiteralEditPart.VISUAL_ID:
			return getEEnumLiteral_3009IncomingLinks(view);
		case EAnnotation2EditPart.VISUAL_ID:
			return getEAnnotation_3003IncomingLinks(view);
		case EAnnotationEditPart.VISUAL_ID:
			return getEAnnotation_2003IncomingLinks(view);
		case EClassEditPart.VISUAL_ID:
			return getEClass_2001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (EcoreVisualIDRegistry.getVisualID(view)) {
		case EReference2EditPart.VISUAL_ID:
			return getEReference_4003OutgoingLinks(view);
		case EDataTypeEditPart.VISUAL_ID:
			return getEDataType_2004OutgoingLinks(view);
		case EStringToStringMapEntryEditPart.VISUAL_ID:
			return getEStringToStringMapEntry_3008OutgoingLinks(view);
		case EPackage2EditPart.VISUAL_ID:
			return getEPackage_2002OutgoingLinks(view);
		case EPackage3EditPart.VISUAL_ID:
			return getEPackage_3005OutgoingLinks(view);
		case EClass2EditPart.VISUAL_ID:
			return getEClass_3004OutgoingLinks(view);
		case EOperationEditPart.VISUAL_ID:
			return getEOperation_3002OutgoingLinks(view);
		case EAttributeEditPart.VISUAL_ID:
			return getEAttribute_3001OutgoingLinks(view);
		case EReferenceEditPart.VISUAL_ID:
			return getEReference_4002OutgoingLinks(view);
		case EEnum2EditPart.VISUAL_ID:
			return getEEnum_3007OutgoingLinks(view);
		case EDataType2EditPart.VISUAL_ID:
			return getEDataType_3006OutgoingLinks(view);
		case EEnumEditPart.VISUAL_ID:
			return getEEnum_2005OutgoingLinks(view);
		case EEnumLiteralEditPart.VISUAL_ID:
			return getEEnumLiteral_3009OutgoingLinks(view);
		case EAnnotation2EditPart.VISUAL_ID:
			return getEAnnotation_3003OutgoingLinks(view);
		case EAnnotationEditPart.VISUAL_ID:
			return getEAnnotation_2003OutgoingLinks(view);
		case EClassEditPart.VISUAL_ID:
			return getEClass_2001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEClass_2001ContainedLinks(View view) {
		EClass modelElement = (EClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotation_2003ContainedLinks(View view) {
		EAnnotation modelElement = (EAnnotation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEDataType_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnum_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAttribute_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEOperation_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotation_3003ContainedLinks(View view) {
		EAnnotation modelElement = (EAnnotation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEClass_3004ContainedLinks(View view) {
		EClass modelElement = (EClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEDataType_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnum_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEStringToStringMapEntry_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnumLiteral_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEReference_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEReference_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEClass_2001IncomingLinks(View view) {
		EClass modelElement = (EClass) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_2002IncomingLinks(View view) {
		EPackage modelElement = (EPackage) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotation_2003IncomingLinks(View view) {
		EAnnotation modelElement = (EAnnotation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEDataType_2004IncomingLinks(View view) {
		EDataType modelElement = (EDataType) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEEnum_2005IncomingLinks(View view) {
		EEnum modelElement = (EEnum) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EReference_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEAttribute_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEOperation_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotation_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEClass_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEDataType_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnum_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEStringToStringMapEntry_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnumLiteral_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEReference_4002IncomingLinks(View view) {
		EReference modelElement = (EReference) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEReference_4003IncomingLinks(View view) {
		EReference modelElement = (EReference) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEClass_2001OutgoingLinks(View view) {
		EClass modelElement = (EClass) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_EReference_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EReference_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotation_2003OutgoingLinks(View view) {
		EAnnotation modelElement = (EAnnotation) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_EAnnotation_References_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getEDataType_2004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnum_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAttribute_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEOperation_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEAnnotation_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEClass_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEPackage_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEDataType_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnum_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEStringToStringMapEntry_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEEnumLiteral_3009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEReference_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getEReference_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_EReference_4002(EClass container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEStructuralFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EReference) {
				continue;
			}
			EReference link = (EReference) linkObject;
			if (EReferenceEditPart.VISUAL_ID != EcoreVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			EClassifier dst = link.getEType();
			result.add(new EcoreLinkDescriptor(container, dst, link, EcoreElementTypes.EReference_4002, EReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_EReference_4003(EClass container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEStructuralFeatures().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EReference) {
				continue;
			}
			EReference link = (EReference) linkObject;
			if (EReference2EditPart.VISUAL_ID != EcoreVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			EClassifier dst = link.getEType();
			result.add(new EcoreLinkDescriptor(container, dst, link, EcoreElementTypes.EReference_4003, EReference2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_EAnnotation_References_4001(EObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == EcorePackage.eINSTANCE.getEAnnotation_References()) {
				result.add(new EcoreLinkDescriptor(setting.getEObject(), target, EcoreElementTypes.EAnnotationReferences_4001, EAnnotationReferencesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_EReference_4002(EClassifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != EcorePackage.eINSTANCE.getETypedElement_EType() || false == setting.getEObject() instanceof EReference) {
				continue;
			}
			EReference link = (EReference) setting.getEObject();
			if (EReferenceEditPart.VISUAL_ID != EcoreVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof EClass) {
				continue;
			}
			EClass container = (EClass) link.eContainer();
			result.add(new EcoreLinkDescriptor(container, target, link, EcoreElementTypes.EReference_4002, EReferenceEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_EReference_4003(EClassifier target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != EcorePackage.eINSTANCE.getETypedElement_EType() || false == setting.getEObject() instanceof EReference) {
				continue;
			}
			EReference link = (EReference) setting.getEObject();
			if (EReference2EditPart.VISUAL_ID != EcoreVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof EClass) {
				continue;
			}
			EClass container = (EClass) link.eContainer();
			result.add(new EcoreLinkDescriptor(container, target, link, EcoreElementTypes.EReference_4003, EReference2EditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_EClass_ESuperTypes_4004(EClass target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == EcorePackage.eINSTANCE.getEClass_ESuperTypes()) {
				result.add(new EcoreLinkDescriptor(setting.getEObject(), target, EcoreElementTypes.EClassESuperTypes_4004, EClassESuperTypesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_EAnnotation_References_4001(EAnnotation source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getReferences().iterator(); destinations.hasNext();) {
			EObject destination = (EObject) destinations.next();
			result.add(new EcoreLinkDescriptor(source, destination, EcoreElementTypes.EAnnotationReferences_4001, EAnnotationReferencesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_EClass_ESuperTypes_4004(EClass source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getESuperTypes().iterator(); destinations.hasNext();) {
			EClass destination = (EClass) destinations.next();
			result.add(new EcoreLinkDescriptor(source, destination, EcoreElementTypes.EClassESuperTypes_4004, EClassESuperTypesEditPart.VISUAL_ID));
		}
		return result;
	}

}
