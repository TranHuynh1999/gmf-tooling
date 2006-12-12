package org.eclipse.gmf.codegen.templates.lite.commands;

import org.eclipse.emf.common.util.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.gmf.common.codegen.*;

public class CreateLinkStartCommandGenerator
{
  protected static String nl;
  public static synchronized CreateLinkStartCommandGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CreateLinkStartCommandGenerator result = new CreateLinkStartCommandGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "/*" + NL + " * ";
  protected final String TEXT_3 = NL + " */";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = "((";
  protected final String TEXT_6 = ")";
  protected final String TEXT_7 = "((";
  protected final String TEXT_8 = ")";
  protected final String TEXT_9 = ")";
  protected final String TEXT_10 = ".eGet(";
  protected final String TEXT_11 = ".eINSTANCE.get";
  protected final String TEXT_12 = "())";
  protected final String TEXT_13 = ")";
  protected final String TEXT_14 = "((";
  protected final String TEXT_15 = ")";
  protected final String TEXT_16 = ")";
  protected final String TEXT_17 = ".";
  protected final String TEXT_18 = "()";
  protected final String TEXT_19 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_20 = " extends ";
  protected final String TEXT_21 = " {" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_22 = " source;" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_23 = "(";
  protected final String TEXT_24 = " requestEx) {" + NL + "\t\t//Until the mouse button is pressed, the source of the connection is in request.getTargetEditPart(), not in request.getSourceEditPart()." + NL + "\t\tsource = (";
  protected final String TEXT_25 = ")requestEx.getTargetEditPart().getModel();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean shouldExecute() {" + NL + "\t\tif (source == null) {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_26 = NL + "\t\treturn false;";
  protected final String TEXT_27 = NL + "\t\t";
  protected final String TEXT_28 = " container = (";
  protected final String TEXT_29 = ")getRelationshipContainer(source.getElement(), ";
  protected final String TEXT_30 = ".eINSTANCE.get";
  protected final String TEXT_31 = "());" + NL + "\t\tif (container == null) {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_32 = NL;
  protected final String TEXT_33 = NL + "\t\tif (";
  protected final String TEXT_34 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_35 = NL + "\t\t}";
  protected final String TEXT_36 = NL + "\t\tif (";
  protected final String TEXT_37 = ".size() >= ";
  protected final String TEXT_38 = ".eINSTANCE.get";
  protected final String TEXT_39 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_40 = NL + "\t\t}";
  protected final String TEXT_41 = NL;
  protected final String TEXT_42 = NL + "\t\tif (";
  protected final String TEXT_43 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_44 = NL + "\t\t}";
  protected final String TEXT_45 = NL + "\t\tif (";
  protected final String TEXT_46 = ".size() >= ";
  protected final String TEXT_47 = ".eINSTANCE.get";
  protected final String TEXT_48 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_49 = NL + "\t\t}";
  protected final String TEXT_50 = NL;
  protected final String TEXT_51 = NL + "\t\tif (";
  protected final String TEXT_52 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_53 = NL + "\t\t}";
  protected final String TEXT_54 = NL + "\t\tif (";
  protected final String TEXT_55 = ".size() >= ";
  protected final String TEXT_56 = ".eINSTANCE.get";
  protected final String TEXT_57 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_58 = NL + "\t\t}";
  protected final String TEXT_59 = NL;
  protected final String TEXT_60 = NL + "\t\t\tif(!";
  protected final String TEXT_61 = ".canCreateLink(";
  protected final String TEXT_62 = ", ";
  protected final String TEXT_63 = ", false)) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_64 = NL + "\t\treturn true;";
  protected final String TEXT_65 = NL;
  protected final String TEXT_66 = NL + "\t\tif (";
  protected final String TEXT_67 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_68 = NL + "\t\t}";
  protected final String TEXT_69 = NL + "\t\tif (";
  protected final String TEXT_70 = ".size() >= ";
  protected final String TEXT_71 = ".eINSTANCE.get";
  protected final String TEXT_72 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_73 = NL + "\t\t}";
  protected final String TEXT_74 = NL;
  protected final String TEXT_75 = NL + "\t\t\tif(!";
  protected final String TEXT_76 = ".canCreateLink(";
  protected final String TEXT_77 = ", ";
  protected final String TEXT_78 = ", false)) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_79 = NL + "\t\treturn true;";
  protected final String TEXT_80 = NL + "\t\treturn false;";
  protected final String TEXT_81 = NL + "\t}";
  protected final String TEXT_82 = NL;
  protected final String TEXT_83 = NL + "\t\t/**" + NL + "\t\t * Finds container element for the relationship of the specified type." + NL + "\t\t * Default implementation goes up by containment hierarchy starting from" + NL + "\t\t * the specified element and returns the first element that is instance of" + NL + "\t\t * the specified container class." + NL + "\t\t * " + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_84 = " getRelationshipContainer(";
  protected final String TEXT_85 = " element, ";
  protected final String TEXT_86 = " containerClass) {" + NL + "\t\t\tfor (; element != null; element = element.eContainer()) {" + NL + "\t\t\t\tif (containerClass.isSuperTypeOf(element.eClass())) {" + NL + "\t\t\t\t\treturn element;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn null;" + NL + "\t\t}";
  protected final String TEXT_87 = NL + "}";
  protected final String TEXT_88 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
GenLink genLink = (GenLink) ((Object[]) argument)[0];
GenDiagram genDiagram = genLink.getDiagram();
GenLinkConstraints linkConstraints = genLink.getCreationConstraints();
final ImportAssistant importManager = (ImportAssistant) ((Object[]) argument)[1];

    stringBuffer.append(TEXT_1);
    
String copyrightText = genDiagram.getEditorGen().getCopyrightText();
if (copyrightText != null && copyrightText.trim().length() > 0) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append(copyrightText.replaceAll("\n", "\n * "));
    stringBuffer.append(TEXT_3);
    }
    
importManager.emitPackageStatement(stringBuffer);
importManager.markImportLocation(stringBuffer);

    stringBuffer.append(TEXT_4);
    
class FeatureGetAccessorHelper {
	/**
	 * @param containerName the name of the container
	 * @param feature the feature whose value is in interest
	 * @param containerMetaClass the <code>GenClass</code> of the container, or <code>null</code>, if the container is declared as an <code>EObject</code>.
	 * @param needsCastToResultType whether the cast to the result type is required (this parameter is only used if the <code>EClass</code> this feature belongs to is an external interface). 
	 */
	public void appendFeatureValueGetter(String containerName, GenFeature feature, GenClass containerMetaClass, boolean needsCastToResultType) {
		if (feature.getGenClass().isExternalInterface()) {
			boolean needsCastToEObject = containerMetaClass != null && containerMetaClass.isExternalInterface();
			if (needsCastToResultType) {

    stringBuffer.append(TEXT_5);
    stringBuffer.append(importManager.getImportedName(feature.isListType() ? "java.util.Collection" : feature.getTypeGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_6);
    
			}
			if (needsCastToEObject) {

    stringBuffer.append(TEXT_7);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_8);
    
			}

    stringBuffer.append(containerName);
    
			if (needsCastToEObject) {

    stringBuffer.append(TEXT_9);
    
			}

    stringBuffer.append(TEXT_10);
    stringBuffer.append(importManager.getImportedName(feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_12);
    
			if (needsCastToResultType) {

    stringBuffer.append(TEXT_13);
    
			}
		} else {
			boolean needsCastToFeatureGenType = containerMetaClass == null || containerMetaClass.isExternalInterface();
			if (needsCastToFeatureGenType) {

    stringBuffer.append(TEXT_14);
    stringBuffer.append(importManager.getImportedName(feature.getGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_15);
    
			}

    stringBuffer.append(containerName);
    
			if (needsCastToFeatureGenType) {

    stringBuffer.append(TEXT_16);
    
			}

    stringBuffer.append(TEXT_17);
    stringBuffer.append(feature.getGetAccessor());
    stringBuffer.append(TEXT_18);
    
		}
	}
}
final FeatureGetAccessorHelper myFeatureGetAccessorHelper = new FeatureGetAccessorHelper();

    stringBuffer.append(TEXT_19);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.commands.VetoCommand"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.requests.CreateConnectionRequestEx"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_25);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			GenFeature containmentFeature = modelFacet.getContainmentMetaFeature();
			if (containmentFeature == null) {

    stringBuffer.append(TEXT_26);
    
			} else {

    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(containmentFeature.getGenClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_31);
    
				{
					GenFeature _feature = containmentFeature;
					String _ownerInstance = "container";
					String _exceedsUpperBound = "return false;";
					GenClass _ownerGenClass = containmentFeature.getGenClass();

    stringBuffer.append(TEXT_32);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_33);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_35);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_36);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_40);
    
	}
}

    
				}
				GenFeature childFeature = modelFacet.getChildMetaFeature();
				if (childFeature != null && childFeature != containmentFeature && !childFeature.isDerived()) {
					{
						GenFeature _feature = childFeature;
						String _ownerInstance = "container";
						String _exceedsUpperBound = "return false;";
						GenClass _ownerGenClass = containmentFeature.getGenClass();

    stringBuffer.append(TEXT_41);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_42);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_44);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_45);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_49);
    
	}
}

    
					}
				}
				//Need to check the eOpposite() of the source feature
				GenFeature sourceFeature = modelFacet.getSourceMetaFeature();
				GenFeature sourceReverseFeature = sourceFeature == null ? null : sourceFeature.getReverse();
				if (sourceReverseFeature != null && !sourceReverseFeature.isDerived() && sourceReverseFeature != containmentFeature && sourceReverseFeature != childFeature) {
					GenFeature _feature = sourceReverseFeature;
					String _ownerInstance = "source.getElement()";
					String _exceedsUpperBound = "return false;";
					GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_50);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_51);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_53);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_54);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_58);
    
	}
}

    
				}
{
	String _source = "source.getElement()";
	String _target = "null";

    stringBuffer.append(TEXT_59);
    
			if (linkConstraints != null) {

    stringBuffer.append(TEXT_60);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer")+"."+genDiagram.getLinkCreationConstraintsClassName()+"."+linkConstraints.getConstraintsInstanceFieldName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(_source);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(_target);
    stringBuffer.append(TEXT_63);
    
			}

    
}	//local declarations for ../common/linkConstraints.jetinc

    stringBuffer.append(TEXT_64);
    
			}
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
		{
			GenFeature _feature = metaFeature;
			String _ownerInstance = "source.getElement()";
			String _exceedsUpperBound = "return false;";
			GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_65);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_66);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_68);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_69);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_73);
    
	}
}

    
		}
{
	String _source = "source.getElement()";
	String _target = "null";

    stringBuffer.append(TEXT_74);
    
			if (linkConstraints != null) {

    stringBuffer.append(TEXT_75);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer")+"."+genDiagram.getLinkCreationConstraintsClassName()+"."+linkConstraints.getConstraintsInstanceFieldName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(_source);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(_target);
    stringBuffer.append(TEXT_78);
    
			}

    
}	//local declarations for ../common/linkConstraints.jetinc

    stringBuffer.append(TEXT_79);
    
		} else {

    stringBuffer.append(TEXT_80);
    
		}

    stringBuffer.append(TEXT_81);
    stringBuffer.append(TEXT_82);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {

    stringBuffer.append(TEXT_83);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_86);
    
		}

    stringBuffer.append(TEXT_87);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_88);
    return stringBuffer.toString();
  }
}
