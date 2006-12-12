package org.eclipse.gmf.codegen.templates.lite.commands;

import org.eclipse.emf.common.util.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.gmf.common.codegen.*;

public class ReconnectLinkTargetCommandGenerator
{
  protected static String nl;
  public static synchronized ReconnectLinkTargetCommandGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    ReconnectLinkTargetCommandGenerator result = new ReconnectLinkTargetCommandGenerator();
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
  protected final String TEXT_22 = " edge;" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_23 = " newTarget;" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_24 = " oldTarget;" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_25 = "(";
  protected final String TEXT_26 = " request) {" + NL + "\t\tthis((";
  protected final String TEXT_27 = ")request.getConnectionEditPart().getModel(), (";
  protected final String TEXT_28 = ")request.getTarget().getModel());" + NL + "\t}" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_29 = "(";
  protected final String TEXT_30 = " edge, ";
  protected final String TEXT_31 = " newTarget) {" + NL + "\t\tthis.edge = edge;" + NL + "\t\tthis.newTarget = newTarget;" + NL + "\t\tthis.oldTarget = edge.getTarget();" + NL + "\t}" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean prepare() {";
  protected final String TEXT_32 = NL + "\t\tfinal boolean[] resultHolder = new boolean[1];" + NL + "\t\t//To validate the reconnection against constraints, the current link should be deleted. Of course, we must then undo its deletion." + NL + "\t\tfinal ";
  protected final String TEXT_33 = " domainModelEditDomain = ";
  protected final String TEXT_34 = ".getEditingDomain(oldTarget.getDiagram().getElement());" + NL + "\t\t";
  protected final String TEXT_35 = " command = new ";
  protected final String TEXT_36 = "() {" + NL + "\t\t\tprivate ";
  protected final String TEXT_37 = " deleteCommand = createDomainModelRemoveCommand(domainModelEditDomain);" + NL + "\t\t\tpublic boolean canExecute() {" + NL + "\t\t\t\treturn deleteCommand.canExecute();" + NL + "\t\t\t}" + NL + "\t\t\tpublic boolean canUndo() {" + NL + "\t\t\t\treturn true;" + NL + "\t\t\t}" + NL + "\t\t\tpublic void redo() {" + NL + "\t\t\t}" + NL + "\t\t\tpublic void undo() {" + NL + "\t\t\t}" + NL + "\t\t\tpublic void execute() {" + NL + "\t\t\t\tdeleteCommand.execute();" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tresultHolder[0] = canReconnect();" + NL + "\t\t\t\t} finally {" + NL + "\t\t\t\t\tdeleteCommand.undo();" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t};" + NL + "\t\tif (!command.canExecute()) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\tnew ";
  protected final String TEXT_38 = "(domainModelEditDomain, command).execute();" + NL + "\t\tif (!resultHolder[0]) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn super.prepare();";
  protected final String TEXT_39 = NL + "\t\tif (!canReconnect()) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn super.prepare();";
  protected final String TEXT_40 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean canReconnect() {";
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
  protected final String TEXT_51 = NL + "\t\t\tif(!";
  protected final String TEXT_52 = ".canCreateLink(";
  protected final String TEXT_53 = ", ";
  protected final String TEXT_54 = ", false)) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_55 = NL + "\t\treturn true;";
  protected final String TEXT_56 = NL;
  protected final String TEXT_57 = NL + "\t\tif (";
  protected final String TEXT_58 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_59 = NL + "\t\t}";
  protected final String TEXT_60 = NL + "\t\tif (";
  protected final String TEXT_61 = ".size() >= ";
  protected final String TEXT_62 = ".eINSTANCE.get";
  protected final String TEXT_63 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_64 = NL + "\t\t}";
  protected final String TEXT_65 = NL;
  protected final String TEXT_66 = NL + "\t\t\tif(!";
  protected final String TEXT_67 = ".canCreateLink(";
  protected final String TEXT_68 = ", ";
  protected final String TEXT_69 = ", false)) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_70 = NL + "\t\treturn true;";
  protected final String TEXT_71 = NL + "\t\treturn false;";
  protected final String TEXT_72 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_73 = " createCommand() {" + NL + "\t\t";
  protected final String TEXT_74 = " editingDomain = ";
  protected final String TEXT_75 = ".getEditingDomain(oldTarget.getDiagram().getElement());" + NL + "\t\t";
  protected final String TEXT_76 = " result = new ";
  protected final String TEXT_77 = "();" + NL + "\t\tresult.append(new ";
  protected final String TEXT_78 = "(edge, newTarget));";
  protected final String TEXT_79 = NL + "\t\tresult.append(";
  protected final String TEXT_80 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getElement(), ";
  protected final String TEXT_81 = ".eINSTANCE.get";
  protected final String TEXT_82 = "()," + NL + "\t\t\toldTarget.getElement()));" + NL + "\t\tresult.append(";
  protected final String TEXT_83 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getElement(), ";
  protected final String TEXT_84 = ".eINSTANCE.get";
  protected final String TEXT_85 = "()," + NL + "\t\t\tnewTarget.getElement()));";
  protected final String TEXT_86 = NL + "\t\tresult.append(";
  protected final String TEXT_87 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getElement(), ";
  protected final String TEXT_88 = ".eINSTANCE.get";
  protected final String TEXT_89 = "()," + NL + "\t\t\tnewTarget.getElement()));";
  protected final String TEXT_90 = NL + "\t\tresult.append(";
  protected final String TEXT_91 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getSource().getElement(), ";
  protected final String TEXT_92 = ".eINSTANCE.get";
  protected final String TEXT_93 = "(), oldTarget.getElement()));" + NL + "\t\tresult.append(";
  protected final String TEXT_94 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getSource().getElement(), ";
  protected final String TEXT_95 = ".eINSTANCE.get";
  protected final String TEXT_96 = "(), newTarget.getElement()));";
  protected final String TEXT_97 = NL + "\t\tresult.append(";
  protected final String TEXT_98 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getSource().getElement(), ";
  protected final String TEXT_99 = ".eINSTANCE.get";
  protected final String TEXT_100 = "(), newTarget.getElement()));";
  protected final String TEXT_101 = NL + "\t\treturn result;" + NL + "\t}" + NL;
  protected final String TEXT_102 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_103 = NL;
  protected final String TEXT_104 = NL + "\t\t\tprivate ";
  protected final String TEXT_105 = " createDomainModelRemoveCommand(";
  protected final String TEXT_106 = " editingDomain) {";
  protected final String TEXT_107 = NL + "\t\t\t\t";
  protected final String TEXT_108 = " result = new ";
  protected final String TEXT_109 = "();";
  protected final String TEXT_110 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_111 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_112 = ".getElement().eContainer(), ";
  protected final String TEXT_113 = ".eINSTANCE.get";
  protected final String TEXT_114 = "(), ";
  protected final String TEXT_115 = ".getElement()));";
  protected final String TEXT_116 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_117 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_118 = ".getElement().eContainer(), ";
  protected final String TEXT_119 = ".eINSTANCE.get";
  protected final String TEXT_120 = "(), ";
  protected final String TEXT_121 = ".UNSET_VALUE));";
  protected final String TEXT_122 = NL + "\t\t\t\treturn ";
  protected final String TEXT_123 = ".INSTANCE;";
  protected final String TEXT_124 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_125 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_126 = ".getElement().eContainer(), ";
  protected final String TEXT_127 = ".eINSTANCE.get";
  protected final String TEXT_128 = "()," + NL + "\t\t\t\t\t";
  protected final String TEXT_129 = ".getElement()));";
  protected final String TEXT_130 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_131 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_132 = ".getElement().eContainer(), ";
  protected final String TEXT_133 = ".eINSTANCE.get";
  protected final String TEXT_134 = "()," + NL + "\t\t\t\t\t";
  protected final String TEXT_135 = ".UNSET_VALUE));";
  protected final String TEXT_136 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_137 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_138 = ".getElement(), ";
  protected final String TEXT_139 = ".eINSTANCE.get";
  protected final String TEXT_140 = "(), ";
  protected final String TEXT_141 = ".getSource().getElement()));";
  protected final String TEXT_142 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_143 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_144 = ".getElement(), ";
  protected final String TEXT_145 = ".eINSTANCE.get";
  protected final String TEXT_146 = "(), ";
  protected final String TEXT_147 = ".UNSET_VALUE));";
  protected final String TEXT_148 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_149 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_150 = ".getElement(), ";
  protected final String TEXT_151 = ".eINSTANCE.get";
  protected final String TEXT_152 = "(), ";
  protected final String TEXT_153 = ".getTarget().getElement()));";
  protected final String TEXT_154 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_155 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_156 = ".getElement(), ";
  protected final String TEXT_157 = ".eINSTANCE.get";
  protected final String TEXT_158 = "(), ";
  protected final String TEXT_159 = ".UNSET_VALUE));";
  protected final String TEXT_160 = NL + "\t\t\t\treturn result;";
  protected final String TEXT_161 = NL + "\t\t\t\treturn ";
  protected final String TEXT_162 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_163 = ".getSource().getElement(), ";
  protected final String TEXT_164 = ".eINSTANCE.get";
  protected final String TEXT_165 = "(), ";
  protected final String TEXT_166 = ".getTarget().getElement());";
  protected final String TEXT_167 = NL + "\t\t\t\treturn ";
  protected final String TEXT_168 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_169 = ".getSource().getElement(), ";
  protected final String TEXT_170 = ".eINSTANCE.get";
  protected final String TEXT_171 = "(), ";
  protected final String TEXT_172 = ".UNSET_VALUE);";
  protected final String TEXT_173 = NL + "\t\t\t}";
  protected final String TEXT_174 = NL + "}";
  protected final String TEXT_175 = NL;

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
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CommandWrapper"));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.Edge"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gef.requests.ReconnectRequest"));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.Edge"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(importManager.getCompilationUnitName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.Edge"));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.notation.View"));
    stringBuffer.append(TEXT_31);
    
	if (linkConstraints != null) {

    stringBuffer.append(TEXT_32);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.AbstractCommand"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.commands.WrappingCommand"));
    stringBuffer.append(TEXT_38);
    
	} else {

    stringBuffer.append(TEXT_39);
    
	}

    stringBuffer.append(TEXT_40);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			//Need to check the eOpposite() of the target feature
			GenFeature targetFeature = modelFacet.getTargetMetaFeature();
			GenFeature targetReverseFeature = targetFeature == null ? null : targetFeature.getReverse();
			if (targetReverseFeature != null && !targetReverseFeature.isDerived()) {
				GenFeature _feature = targetReverseFeature;
				String _ownerInstance = "newTarget.getElement()";
				String _exceedsUpperBound = "return false;";
				GenClass _ownerGenClass = null;

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
{
	String _source = "edge.getSource().getElement()";
	String _target = "newTarget.getElement()";

    stringBuffer.append(TEXT_50);
    
			if (linkConstraints != null) {

    stringBuffer.append(TEXT_51);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer")+"."+genDiagram.getLinkCreationConstraintsClassName()+"."+linkConstraints.getConstraintsInstanceFieldName());
    stringBuffer.append(TEXT_52);
    stringBuffer.append(_source);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(_target);
    stringBuffer.append(TEXT_54);
    
			}

    
}	//local declarations for linkConstraints.jetinc

    stringBuffer.append(TEXT_55);
    
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			//Need to check eOpposite() of the metaFeature
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
			GenFeature reverseMetaFeature = metaFeature == null ? null : metaFeature.getReverse();
			if (reverseMetaFeature != null && !reverseMetaFeature.isDerived()) {
				GenFeature _feature = reverseMetaFeature;
				String _ownerInstance = "newTarget.getElement()";
				String _exceedsUpperBound = "return false;";
				GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_56);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_57);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_59);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_60);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_61);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_64);
    
	}
}

    
			}
{
	String _source = "edge.getSource().getElement()";
	String _target = "newTarget.getElement()";

    stringBuffer.append(TEXT_65);
    
			if (linkConstraints != null) {

    stringBuffer.append(TEXT_66);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer")+"."+genDiagram.getLinkCreationConstraintsClassName()+"."+linkConstraints.getConstraintsInstanceFieldName());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(_source);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(_target);
    stringBuffer.append(TEXT_69);
    
			}

    
}	//local declarations for linkConstraints.jetinc

    stringBuffer.append(TEXT_70);
    
		} else {

    stringBuffer.append(TEXT_71);
    
		}

    stringBuffer.append(TEXT_72);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_77);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.commands.ReconnectNotationalEdgeTargetCommand"));
    stringBuffer.append(TEXT_78);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			GenFeature targetFeature = modelFacet.getTargetMetaFeature();
			if (targetFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_79);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.AddCommand"));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_85);
    
			} else {

    stringBuffer.append(TEXT_86);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_88);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_89);
    
			}
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
			if (metaFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_90);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.AddCommand"));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_96);
    
			} else {

    stringBuffer.append(TEXT_97);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_100);
    
			}
		}

    stringBuffer.append(TEXT_101);
    
	if (linkConstraints != null) {
		String _edge = "edge";

    stringBuffer.append(TEXT_102);
    stringBuffer.append(TEXT_103);
    
	//input: _edge : String

    stringBuffer.append(TEXT_104);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_106);
    
	if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
		TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
		GenFeature sourceFeature = modelFacet.getSourceMetaFeature();
		GenFeature containmentFeature = modelFacet.getContainmentMetaFeature();
		GenFeature childFeature = modelFacet.getChildMetaFeature();
		GenFeature targetFeature = modelFacet.getTargetMetaFeature();
		//See creation of links in NodeEditPart

		boolean removeSource = sourceFeature != null;
		boolean removeTarget = targetFeature != null;
		boolean removeChild = childFeature != null && childFeature != containmentFeature && !childFeature.isDerived();
		if (containmentFeature != null) {
			if (sourceFeature != null && sourceFeature.getEcoreFeature() instanceof EReference == true) {
				EReference sourceEcoreFeature = (EReference)sourceFeature.getEcoreFeature();
				if (sourceEcoreFeature.getEOpposite() == containmentFeature.getEcoreFeature()) {
					removeSource = false;
				}
			}
			if (targetFeature != null && targetFeature.getEcoreFeature() instanceof EReference == true) {
				EReference targetEcoreFeature = (EReference)targetFeature.getEcoreFeature();
				if (targetEcoreFeature.getEOpposite() == containmentFeature.getEcoreFeature()) {
					removeTarget = false;
				}
			}

    stringBuffer.append(TEXT_107);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_109);
    
			if (containmentFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_110);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_112);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_113);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_115);
    
			} else {

    stringBuffer.append(TEXT_116);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_118);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_121);
    
			}
		} else {

    stringBuffer.append(TEXT_122);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.UnexecutableCommand"));
    stringBuffer.append(TEXT_123);
    
		}
		if (removeChild) {
			if (childFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_124);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_126);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_128);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_129);
    
			} else {

    stringBuffer.append(TEXT_130);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_131);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_135);
    
			}
		}
		if (removeSource) {
			if (sourceFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_136);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_141);
    
			} else {

    stringBuffer.append(TEXT_142);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_147);
    
			}
		}
		if (removeTarget) {
			if (targetFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_148);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_153);
    
			} else {

    stringBuffer.append(TEXT_154);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_159);
    
			}
		}

    stringBuffer.append(TEXT_160);
    
	} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
		GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
		if (metaFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_161);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_163);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_164);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_165);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_166);
    
		} else {

    stringBuffer.append(TEXT_167);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_168);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_171);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_172);
    
		}

    
	}

    stringBuffer.append(TEXT_173);
    
	}

    stringBuffer.append(TEXT_174);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_175);
    return stringBuffer.toString();
  }
}
