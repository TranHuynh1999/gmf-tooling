package org.eclipse.gmf.codegen.templates.lite.commands;

import org.eclipse.emf.common.util.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.gmf.common.codegen.*;

public class CreateLinkCompleteCommandGenerator
{
  protected static String nl;
  public static synchronized CreateLinkCompleteCommandGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CreateLinkCompleteCommandGenerator result = new CreateLinkCompleteCommandGenerator();
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
  protected final String TEXT_21 = " {" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_22 = " source;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_23 = " target;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_24 = " createdEdge;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_25 = " domainModelAddCommand;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_26 = "(";
  protected final String TEXT_27 = " requestEx) {" + NL + "\t\tif (requestEx.getSourceEditPart().getModel() instanceof ";
  protected final String TEXT_28 = ") {" + NL + "\t\t\tsource = (";
  protected final String TEXT_29 = ")requestEx.getSourceEditPart().getModel();" + NL + "\t\t} else {" + NL + "\t\t\tsource = null;" + NL + "\t\t}" + NL + "\t\tif (requestEx.getTargetEditPart().getModel() instanceof ";
  protected final String TEXT_30 = ") {" + NL + "\t\t\ttarget = (";
  protected final String TEXT_31 = ")requestEx.getTargetEditPart().getModel();" + NL + "\t\t} else {" + NL + "\t\t\ttarget = null;" + NL + "\t\t}" + NL + "\t\tif (source == null || target == null) {" + NL + "\t\t\tcreatedEdge = null;" + NL + "\t\t\tdomainModelAddCommand = ";
  protected final String TEXT_32 = ".INSTANCE;" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\tcreatedEdge = ";
  protected final String TEXT_33 = ".eINSTANCE.createEdge();";
  protected final String TEXT_34 = NL + "\t\t";
  protected final String TEXT_35 = " createdDomainElement = ";
  protected final String TEXT_36 = ".eINSTANCE.create";
  protected final String TEXT_37 = "();" + NL + "\t\tcreatedEdge.setElement(";
  protected final String TEXT_38 = "(";
  protected final String TEXT_39 = ") ";
  protected final String TEXT_40 = "createdDomainElement);" + NL + "\t\t";
  protected final String TEXT_41 = NL + "\t\t";
  protected final String TEXT_42 = ".";
  protected final String TEXT_43 = ".initializeElement(";
  protected final String TEXT_44 = "(";
  protected final String TEXT_45 = ") ";
  protected final String TEXT_46 = "createdDomainElement);";
  protected final String TEXT_47 = NL + "\t\tcreatedEdge.setElement(null);";
  protected final String TEXT_48 = NL + "\t\t";
  protected final String TEXT_49 = ".INSTANCE.decorateView(createdEdge);" + NL + "\t\t";
  protected final String TEXT_50 = " domainModelEditDomain = ";
  protected final String TEXT_51 = ".getEditingDomain(source.getDiagram().getElement());";
  protected final String TEXT_52 = NL + "\t\torg.eclipse.emf.common.command.CompoundCommand addLinkEndsCommand = new org.eclipse.emf.common.command.CompoundCommand();";
  protected final String TEXT_53 = NL + "\t\t";
  protected final String TEXT_54 = " container = getRelationshipContainer(source.getElement(), ";
  protected final String TEXT_55 = ".eINSTANCE.get";
  protected final String TEXT_56 = "());" + NL + "\t\tif (container == null) {" + NL + "\t\t\tdomainModelAddCommand = null;" + NL + "\t\t\treturn;" + NL + "\t\t}" + NL + "\t\taddLinkEndsCommand.append(";
  protected final String TEXT_57 = ".create(domainModelEditDomain, " + NL + "\t\t\tcontainer, ";
  protected final String TEXT_58 = ".eINSTANCE.get";
  protected final String TEXT_59 = "(), createdDomainElement));";
  protected final String TEXT_60 = NL + "\t\taddLinkEndsCommand.append(";
  protected final String TEXT_61 = ".create(domainModelEditDomain," + NL + "\t\t\tcontainer, ";
  protected final String TEXT_62 = ".eINSTANCE.get";
  protected final String TEXT_63 = "(), createdDomainElement));";
  protected final String TEXT_64 = NL;
  protected final String TEXT_65 = NL + "\t\tif (";
  protected final String TEXT_66 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_67 = NL + "\t\t}";
  protected final String TEXT_68 = NL + "\t\tif (";
  protected final String TEXT_69 = ".size() >= ";
  protected final String TEXT_70 = ".eINSTANCE.get";
  protected final String TEXT_71 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_72 = NL + "\t\t}";
  protected final String TEXT_73 = NL + "\t\taddLinkEndsCommand.append(";
  protected final String TEXT_74 = ".create(domainModelEditDomain, " + NL + "\t\t\tcreatedDomainElement, ";
  protected final String TEXT_75 = ".eINSTANCE.get";
  protected final String TEXT_76 = "(), source.getElement()));";
  protected final String TEXT_77 = NL;
  protected final String TEXT_78 = NL + "\t\tif (";
  protected final String TEXT_79 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_80 = NL + "\t\t}";
  protected final String TEXT_81 = NL + "\t\tif (";
  protected final String TEXT_82 = ".size() >= ";
  protected final String TEXT_83 = ".eINSTANCE.get";
  protected final String TEXT_84 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_85 = NL + "\t\t}";
  protected final String TEXT_86 = NL;
  protected final String TEXT_87 = NL + "\t\tif (";
  protected final String TEXT_88 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_89 = NL + "\t\t}";
  protected final String TEXT_90 = NL + "\t\tif (";
  protected final String TEXT_91 = ".size() >= ";
  protected final String TEXT_92 = ".eINSTANCE.get";
  protected final String TEXT_93 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_94 = NL + "\t\t}";
  protected final String TEXT_95 = NL + "\t\taddLinkEndsCommand.append(";
  protected final String TEXT_96 = ".create(domainModelEditDomain, " + NL + "\t\t\tcreatedDomainElement, ";
  protected final String TEXT_97 = ".eINSTANCE.get";
  protected final String TEXT_98 = "(), target.getElement()));";
  protected final String TEXT_99 = NL + "\t\tdomainModelAddCommand = addLinkEndsCommand;";
  protected final String TEXT_100 = NL;
  protected final String TEXT_101 = NL + "\t\tif (";
  protected final String TEXT_102 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_103 = NL + "\t\t}";
  protected final String TEXT_104 = NL + "\t\tif (";
  protected final String TEXT_105 = ".size() >= ";
  protected final String TEXT_106 = ".eINSTANCE.get";
  protected final String TEXT_107 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_108 = NL + "\t\t}";
  protected final String TEXT_109 = NL + "\t\tdomainModelAddCommand = ";
  protected final String TEXT_110 = ".create(domainModelEditDomain, source.getElement(), " + NL + "\t\t\t";
  protected final String TEXT_111 = ".eINSTANCE.get";
  protected final String TEXT_112 = "(), target.getElement());";
  protected final String TEXT_113 = NL + "\t}" + NL;
  protected final String TEXT_114 = NL;
  protected final String TEXT_115 = NL + "\t\t/**" + NL + "\t\t * Finds container element for the relationship of the specified type." + NL + "\t\t * Default implementation goes up by containment hierarchy starting from" + NL + "\t\t * the specified element and returns the first element that is instance of" + NL + "\t\t * the specified container class." + NL + "\t\t * " + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_116 = " getRelationshipContainer(";
  protected final String TEXT_117 = " element, ";
  protected final String TEXT_118 = " containerClass) {" + NL + "\t\t\tfor (; element != null; element = element.eContainer()) {" + NL + "\t\t\t\tif (containerClass.isSuperTypeOf(element.eClass())) {" + NL + "\t\t\t\t\treturn element;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn null;" + NL + "\t\t}";
  protected final String TEXT_119 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean canExecute() {" + NL + "\t\tif (source == null || target == null || createdEdge == null || domainModelAddCommand == null || !domainModelAddCommand.canExecute()) {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_120 = NL;
  protected final String TEXT_121 = NL + "\t\t\tif(!";
  protected final String TEXT_122 = ".canCreateLink(";
  protected final String TEXT_123 = ", ";
  protected final String TEXT_124 = ", false)) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_125 = NL + "\t\treturn true;" + NL + "\t}" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean canUndo() {" + NL + "\t\treturn source != null && target != null && createdEdge != null && domainModelAddCommand != null && domainModelAddCommand.canUndo();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void execute() {" + NL + "\t\tdomainModelAddCommand.execute();" + NL + "\t\tsource.getDiagram().insertEdge(createdEdge);" + NL + "\t\tcreatedEdge.setSource(source);" + NL + "\t\tcreatedEdge.setTarget(target);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void undo() {" + NL + "\t\tdomainModelAddCommand.undo();" + NL + "\t\tsource.getDiagram().removeEdge(createdEdge);" + NL + "\t\tcreatedEdge.setSource(null);" + NL + "\t\tcreatedEdge.setTarget(null);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void redo() {" + NL + "\t\texecute();" + NL + "\t}" + NL + "}";
  protected final String TEXT_126 = NL;

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
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.AbstractCommand"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.Edge"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.requests.CreateConnectionRequestEx"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.UnexecutableCommand"));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.NotationFactory"));
    stringBuffer.append(TEXT_33);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			GenClass linkClass = modelFacet.getMetaClass();

    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName(importManager.getImportedName(linkClass.getQualifiedInterfaceName())));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName(linkClass.getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(linkClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_37);
    if (linkClass.isExternalInterface()) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    /*XXX: Class name DomainElementInitializer should be user-customizable*/
    stringBuffer.append(TEXT_41);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer"));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genLink.getUniqueIdentifier());
    stringBuffer.append(TEXT_43);
    if (linkClass.isExternalInterface()) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_45);
    }
    stringBuffer.append(TEXT_46);
    
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {

    stringBuffer.append(TEXT_47);
    
		}

    stringBuffer.append(TEXT_48);
    stringBuffer.append(importManager.getImportedName(genLink.getNotationViewFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_51);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {

    stringBuffer.append(TEXT_52);
    
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			GenFeature sourceFeature = modelFacet.getSourceMetaFeature();
			GenFeature containmentFeature = modelFacet.getContainmentMetaFeature();
			GenFeature childFeature = modelFacet.getChildMetaFeature();
			GenFeature targetFeature = modelFacet.getTargetMetaFeature();
			//source/link features seem to be pointing from link to its ends, not vice versa.
			//Anyway, if there is containment feature and it is not opposite to either the source/target, we should add containment, 
			//otherwise we will have problems with saving uncontained EObjects.
			boolean addSource = sourceFeature != null;
			boolean addTarget = targetFeature != null;
			boolean addChild = childFeature != null && childFeature != containmentFeature && !childFeature.isDerived();
			if (containmentFeature != null) {
				if (sourceFeature != null && sourceFeature.getEcoreFeature() instanceof EReference == true) {
					EReference sourceEcoreFeature = (EReference)sourceFeature.getEcoreFeature();
					if (sourceEcoreFeature.getEOpposite() == containmentFeature.getEcoreFeature()) {
						addSource = false;
					}
				}
				if (targetFeature != null && targetFeature.getEcoreFeature() instanceof EReference == true) {
					EReference targetEcoreFeature = (EReference)targetFeature.getEcoreFeature();
					if (targetEcoreFeature.getEOpposite() == containmentFeature.getEcoreFeature()) {
						addTarget = false;
					}
				}

    stringBuffer.append(TEXT_53);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(containmentFeature.getGenClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_59);
    
			}
			if (addChild) {

    stringBuffer.append(TEXT_60);
    stringBuffer.append(importManager.getImportedName(childFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_63);
    
			}
			if (addSource) {
				{
					GenFeature _feature = sourceFeature;
					String _ownerInstance = "createdDomainElement";
					String _exceedsUpperBound = "domainModelAddCommand = null;\nreturn;";
					GenClass _ownerGenClass = modelFacet.getMetaClass();

    stringBuffer.append(TEXT_64);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_65);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_67);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_68);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_72);
    
	}
}

    
				}

    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_76);
    
			}
			if (addTarget) {
				{
					GenFeature _feature = targetFeature;
					String _ownerInstance = "createdDomainElement";
					String _exceedsUpperBound = "domainModelAddCommand = null;\nreturn;";
					GenClass _ownerGenClass = modelFacet.getMetaClass();

    stringBuffer.append(TEXT_77);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_78);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_80);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_81);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_84);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_85);
    
	}
}

    
				}
				//Need to check the eOpposite() of the target feature
				GenFeature targetReverseFeature = targetFeature == null ? null : targetFeature.getReverse();
				if (targetReverseFeature != null && !targetReverseFeature.isDerived()) {
					GenFeature _feature = targetReverseFeature;
					String _ownerInstance = "target.getElement()";
					String _exceedsUpperBound = "domainModelAddCommand = null;\nreturn;";
					GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_86);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_87);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_89);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_90);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_94);
    
	}
}

    
				}

    stringBuffer.append(TEXT_95);
    stringBuffer.append(importManager.getImportedName(targetFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_96);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_98);
    
			}

    stringBuffer.append(TEXT_99);
    
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
			//Need to check eOpposite() of the metaFeature
			GenFeature reverseMetaFeature = metaFeature == null ? null : metaFeature.getReverse();
			if (reverseMetaFeature != null && !reverseMetaFeature.isDerived()) {
				GenFeature _feature = reverseMetaFeature;
				String _ownerInstance = "target.getElement()";
				String _exceedsUpperBound = "domainModelAddCommand = null;\nreturn;";
				GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_100);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_101);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_103);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_104);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_105);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_108);
    
	}
}

    
			}

    stringBuffer.append(TEXT_109);
    stringBuffer.append(importManager.getImportedName(metaFeature.getEcoreFeature().isMany()? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_112);
    
		}

    stringBuffer.append(TEXT_113);
    stringBuffer.append(TEXT_114);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {

    stringBuffer.append(TEXT_115);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_118);
    
		}

    stringBuffer.append(TEXT_119);
    
{
	String _source = "source.getElement()";
	String _target = "target.getElement()";

    stringBuffer.append(TEXT_120);
    
			if (linkConstraints != null) {

    stringBuffer.append(TEXT_121);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer")+"."+genDiagram.getLinkCreationConstraintsClassName()+"."+linkConstraints.getConstraintsInstanceFieldName());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(_source);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(_target);
    stringBuffer.append(TEXT_124);
    
			}

    
}	//local declarations for linkConstraints.jetinc

    stringBuffer.append(TEXT_125);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_126);
    return stringBuffer.toString();
  }
}
