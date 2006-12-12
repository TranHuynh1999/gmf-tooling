package org.eclipse.gmf.codegen.templates.lite.commands;

import org.eclipse.emf.common.util.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.gmf.common.codegen.*;

public class CreateNodeCommandGenerator
{
  protected static String nl;
  public static synchronized CreateNodeCommandGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CreateNodeCommandGenerator result = new CreateNodeCommandGenerator();
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
  protected final String TEXT_22 = " notationAddCommand;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate final ";
  protected final String TEXT_23 = " domainModelAddCommand;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_24 = "(";
  protected final String TEXT_25 = " parent, ";
  protected final String TEXT_26 = " request) {" + NL + "\t\tthis(parent, request, null);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_27 = "(";
  protected final String TEXT_28 = " parent, ";
  protected final String TEXT_29 = " request, ";
  protected final String TEXT_30 = " constraint) {" + NL + "\t\t";
  protected final String TEXT_31 = " domainModelEditDomain = ";
  protected final String TEXT_32 = ".getEditingDomain(parent.getDiagram().getElement());";
  protected final String TEXT_33 = NL + "\t\t";
  protected final String TEXT_34 = " createdDomainElement = ";
  protected final String TEXT_35 = ".eINSTANCE.create(" + NL + "\t\t\t";
  protected final String TEXT_36 = ".eINSTANCE.get";
  protected final String TEXT_37 = "());";
  protected final String TEXT_38 = NL + "\t\t";
  protected final String TEXT_39 = " createdDomainElement = ";
  protected final String TEXT_40 = ".eINSTANCE.create";
  protected final String TEXT_41 = "();";
  protected final String TEXT_42 = NL + "\t\t";
  protected final String TEXT_43 = NL + "\t\t";
  protected final String TEXT_44 = ".";
  protected final String TEXT_45 = ".initializeElement(";
  protected final String TEXT_46 = "(";
  protected final String TEXT_47 = ") ";
  protected final String TEXT_48 = "createdDomainElement);";
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = NL + "\t\tif (";
  protected final String TEXT_51 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_52 = NL + "\t\t}";
  protected final String TEXT_53 = NL + "\t\tif (";
  protected final String TEXT_54 = ".size() >= ";
  protected final String TEXT_55 = ".eINSTANCE.get";
  protected final String TEXT_56 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_57 = NL + "\t\t}";
  protected final String TEXT_58 = NL;
  protected final String TEXT_59 = NL + "\t\tif (";
  protected final String TEXT_60 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_61 = NL + "\t\t}";
  protected final String TEXT_62 = NL + "\t\tif (";
  protected final String TEXT_63 = ".size() >= ";
  protected final String TEXT_64 = ".eINSTANCE.get";
  protected final String TEXT_65 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_66 = NL + "\t\t}";
  protected final String TEXT_67 = NL + "\t\t";
  protected final String TEXT_68 = " compoundCommand = new ";
  protected final String TEXT_69 = "();" + NL + "\t\tcompoundCommand.append(";
  protected final String TEXT_70 = ".create(domainModelEditDomain, parent.getElement(), " + NL + "\t\t\t";
  protected final String TEXT_71 = ".eINSTANCE.get";
  protected final String TEXT_72 = "(), createdDomainElement));" + NL + "\t\tcompoundCommand.append(";
  protected final String TEXT_73 = ".create(domainModelEditDomain, parent.getElement(), " + NL + "\t\t\t";
  protected final String TEXT_74 = ".eINSTANCE.get";
  protected final String TEXT_75 = "(), createdDomainElement));" + NL + "\t\tthis.domainModelAddCommand = compoundCommand;";
  protected final String TEXT_76 = NL + "\t\tthis.domainModelAddCommand = ";
  protected final String TEXT_77 = ".create(domainModelEditDomain, parent.getElement(), " + NL + "\t\t\t";
  protected final String TEXT_78 = ".eINSTANCE.get";
  protected final String TEXT_79 = "(), createdDomainElement);";
  protected final String TEXT_80 = NL + "\t\tif (constraint != null) {" + NL + "\t\t\tconstraint = constraint.union(new ";
  protected final String TEXT_81 = "(";
  protected final String TEXT_82 = ", ";
  protected final String TEXT_83 = "));" + NL + "\t\t}" + NL + "\t\tthis.notationAddCommand = new ";
  protected final String TEXT_84 = "(parent, ";
  protected final String TEXT_85 = "(";
  protected final String TEXT_86 = ") ";
  protected final String TEXT_87 = "createdDomainElement, " + NL + "\t\t\tconstraint, ";
  protected final String TEXT_88 = ".INSTANCE);" + NL + "\t\trequest.setCreatedObject(notationAddCommand.getCreatedView());" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean canExecute() {" + NL + "\t\treturn domainModelAddCommand != null" + NL + "\t\t\t\t&& domainModelAddCommand.canExecute() && notationAddCommand != null && notationAddCommand.canExecute();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean canUndo() {" + NL + "\t\treturn domainModelAddCommand != null" + NL + "\t\t\t\t&& domainModelAddCommand.canUndo() && notationAddCommand != null && notationAddCommand.canUndo();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void execute() {" + NL + "\t\tdomainModelAddCommand.execute();" + NL + "\t\tnotationAddCommand.execute();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void undo() {" + NL + "\t\tnotationAddCommand.undo();" + NL + "\t\tdomainModelAddCommand.undo();" + NL + "\t}" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void redo() {" + NL + "\t\texecute();" + NL + "\t}" + NL + "}";
  protected final String TEXT_89 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
GenNode genNode = (GenNode) ((Object[]) argument)[0];
GenDiagram genDiagram = genNode.getDiagram();
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
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.commands.CreateNotationalNodeCommand"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.requests.CreateRequestEx"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.requests.CreateRequestEx"));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Rectangle"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_32);
    
	if (genNode.getDomainMetaClass().isMapEntry()) {
	/*Workaround for Ecore example: map entries cannot be created using factory, only using reflective EFactory.create() method*/

    stringBuffer.append(TEXT_33);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName(genNode.getDomainMetaClass().getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName(genNode.getDomainMetaClass().getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genNode.getDomainMetaClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_37);
    
	} else {

    stringBuffer.append(TEXT_38);
    stringBuffer.append(importManager.getImportedName(genNode.getDomainMetaClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(importManager.getImportedName(genNode.getDomainMetaClass().getGenPackage().getQualifiedFactoryInterfaceName()));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genNode.getDomainMetaClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_41);
    
	}

    stringBuffer.append(TEXT_42);
    /*XXX: Class name DomainElementInitializer should be user-customizable*/
    stringBuffer.append(TEXT_43);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer"));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genNode.getUniqueIdentifier());
    stringBuffer.append(TEXT_45);
    if (genNode.getDomainMetaClass().isExternalInterface()) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_48);
    
	TypeModelFacet facet = genNode.getModelFacet();
	GenFeature childFeature = facet.getChildMetaFeature();
	GenFeature containmentFeature = facet.getContainmentMetaFeature();
	{
		GenFeature _feature = containmentFeature;
		String _ownerInstance = "parent.getElement()";
		String _exceedsUpperBound = "this.domainModelAddCommand = null;this.notationAddCommand = null;return;";
		GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_49);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_50);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_52);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_53);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_56);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_57);
    
	}
}

    
	}
	if (childFeature != null && childFeature != containmentFeature && !childFeature.isDerived()) {
		GenFeature _feature = childFeature;
		String _ownerInstance = "parent.getElement()";
		String _exceedsUpperBound = "this.domainModelAddCommand = null;this.notationAddCommand = null;return;";
		GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_58);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_59);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_61);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_62);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_66);
    
	}
}

    stringBuffer.append(TEXT_67);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_72);
    stringBuffer.append(importManager.getImportedName(childFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_75);
    
	} else {

    stringBuffer.append(TEXT_76);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_78);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_79);
    
	}

    
	int defaultWidth = 40;
	int defaultHeight = 40;
	DefaultSizeAttributes defSizeAttrs = (DefaultSizeAttributes) genNode.getViewmap().find(DefaultSizeAttributes.class);
	if (defSizeAttrs != null) {
		defaultWidth = defSizeAttrs.getWidth();
		defaultHeight = defSizeAttrs.getHeight();
	}

    stringBuffer.append(TEXT_80);
    stringBuffer.append(importManager.getImportedName("org.eclipse.draw2d.geometry.Dimension"));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(defaultWidth);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(defaultHeight);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.commands.CreateNotationalNodeCommand"));
    stringBuffer.append(TEXT_84);
    if (genNode.getDomainMetaClass().isExternalInterface()) {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_86);
    }
    stringBuffer.append(TEXT_87);
    stringBuffer.append(importManager.getImportedName(genNode.getNotationViewFactoryQualifiedClassName()));
    stringBuffer.append(TEXT_88);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_89);
    return stringBuffer.toString();
  }
}
