package org.eclipse.gmf.codegen.templates.lite.commands;

import org.eclipse.emf.common.util.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.gmf.common.codegen.*;

public class ReconnectLinkSourceCommandGenerator
{
  protected static String nl;
  public static synchronized ReconnectLinkSourceCommandGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    ReconnectLinkSourceCommandGenerator result = new ReconnectLinkSourceCommandGenerator();
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
  protected final String TEXT_23 = " newSource;" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_24 = " oldSource;" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_25 = "(";
  protected final String TEXT_26 = " request) {" + NL + "\t\tthis((";
  protected final String TEXT_27 = ")request.getConnectionEditPart().getModel(), (";
  protected final String TEXT_28 = ")request.getTarget().getModel());" + NL + "\t}" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_29 = "(";
  protected final String TEXT_30 = " edge, ";
  protected final String TEXT_31 = " newSource) {" + NL + "\t\tthis.edge = edge;" + NL + "\t\tthis.newSource = newSource;" + NL + "\t\tthis.oldSource = edge.getSource();" + NL + "\t}" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean prepare() {";
  protected final String TEXT_32 = NL + "\t\tfinal boolean[] resultHolder = new boolean[1];" + NL + "\t\t//To validate the reconnection against constraints, the current link should be deleted. Of course, we must then undo its deletion." + NL + "\t\tfinal ";
  protected final String TEXT_33 = " domainModelEditDomain = ";
  protected final String TEXT_34 = ".getEditingDomain(oldSource.getDiagram().getElement());" + NL + "\t\t";
  protected final String TEXT_35 = " command = new ";
  protected final String TEXT_36 = "() {" + NL + "\t\t\tprivate ";
  protected final String TEXT_37 = " deleteCommand = createDomainModelRemoveCommand(domainModelEditDomain);" + NL + "\t\t\tpublic boolean canExecute() {" + NL + "\t\t\t\treturn deleteCommand.canExecute();" + NL + "\t\t\t}" + NL + "\t\t\tpublic boolean canUndo() {" + NL + "\t\t\t\treturn true;" + NL + "\t\t\t}" + NL + "\t\t\tpublic void redo() {" + NL + "\t\t\t}" + NL + "\t\t\tpublic void undo() {" + NL + "\t\t\t}" + NL + "\t\t\tpublic void execute() {" + NL + "\t\t\t\tdeleteCommand.execute();" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tresultHolder[0] = canReconnect();" + NL + "\t\t\t\t} finally {" + NL + "\t\t\t\t\tdeleteCommand.undo();" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t};" + NL + "\t\tif (!command.canExecute()) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\tnew ";
  protected final String TEXT_38 = "(domainModelEditDomain, command).execute();" + NL + "\t\tif (!resultHolder[0]) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn super.prepare();";
  protected final String TEXT_39 = NL + "\t\tif (!canReconnect()) {" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn super.prepare();";
  protected final String TEXT_40 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate boolean canReconnect() {";
  protected final String TEXT_41 = NL + "\t\treturn false;";
  protected final String TEXT_42 = NL + "\t\t";
  protected final String TEXT_43 = " container = (";
  protected final String TEXT_44 = ")getRelationshipContainer(newSource.getElement(), ";
  protected final String TEXT_45 = ".eINSTANCE.get";
  protected final String TEXT_46 = "());" + NL + "\t\tif (container == null) {" + NL + "\t\t\treturn false;" + NL + "\t\t}";
  protected final String TEXT_47 = NL;
  protected final String TEXT_48 = NL + "\t\tif (";
  protected final String TEXT_49 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_50 = NL + "\t\t}";
  protected final String TEXT_51 = NL + "\t\tif (";
  protected final String TEXT_52 = ".size() >= ";
  protected final String TEXT_53 = ".eINSTANCE.get";
  protected final String TEXT_54 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_55 = NL + "\t\t}";
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
  protected final String TEXT_80 = NL;
  protected final String TEXT_81 = NL + "\t\tif (";
  protected final String TEXT_82 = " != null) {" + NL + "\t\t\t";
  protected final String TEXT_83 = NL + "\t\t}";
  protected final String TEXT_84 = NL + "\t\tif (";
  protected final String TEXT_85 = ".size() >= ";
  protected final String TEXT_86 = ".eINSTANCE.get";
  protected final String TEXT_87 = "().getUpperBound()) {" + NL + "\t\t\t";
  protected final String TEXT_88 = NL + "\t\t}";
  protected final String TEXT_89 = NL;
  protected final String TEXT_90 = NL + "\t\t\tif(!";
  protected final String TEXT_91 = ".canCreateLink(";
  protected final String TEXT_92 = ", ";
  protected final String TEXT_93 = ", false)) {" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}";
  protected final String TEXT_94 = NL + "\t\treturn true;";
  protected final String TEXT_95 = NL + "\t\treturn false;";
  protected final String TEXT_96 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_97 = " createCommand() {" + NL + "\t\t";
  protected final String TEXT_98 = " editingDomain = ";
  protected final String TEXT_99 = ".getEditingDomain(oldSource.getDiagram().getElement());" + NL + "\t\t";
  protected final String TEXT_100 = " result = new ";
  protected final String TEXT_101 = "();" + NL + "\t\tresult.append(new ";
  protected final String TEXT_102 = "(edge, newSource));";
  protected final String TEXT_103 = NL + "\t\t";
  protected final String TEXT_104 = " container = getRelationshipContainer(newSource.getElement(), ";
  protected final String TEXT_105 = ".eINSTANCE.get";
  protected final String TEXT_106 = "());" + NL + "\t\tif (container == null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_107 = ".INSTANCE;" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_108 = " oldContainer = edge.getElement().eContainer();" + NL + "\t\tif (oldContainer == null) {" + NL + "\t\t\treturn ";
  protected final String TEXT_109 = ".INSTANCE;" + NL + "\t\t}" + NL + "\t\tif (oldContainer != container) {";
  protected final String TEXT_110 = NL + "\t\t\tresult.append(";
  protected final String TEXT_111 = ".create(" + NL + "\t\t\t\teditingDomain," + NL + "\t\t\t\tedge.getElement().eContainer(), ";
  protected final String TEXT_112 = ".eINSTANCE.get";
  protected final String TEXT_113 = "(), edge.getElement()));";
  protected final String TEXT_114 = NL + "\t\t\tresult.append(";
  protected final String TEXT_115 = ".create(" + NL + "\t\t\t\teditingDomain," + NL + "\t\t\t\tedge.getElement().eContainer(), ";
  protected final String TEXT_116 = ".eINSTANCE.get";
  protected final String TEXT_117 = "(), ";
  protected final String TEXT_118 = ".UNSET_VALUE));";
  protected final String TEXT_119 = NL + "\t\t\tresult.append(";
  protected final String TEXT_120 = ".create(" + NL + "\t\t\t\teditingDomain," + NL + "\t\t\t\tcontainer, ";
  protected final String TEXT_121 = ".eINSTANCE.get";
  protected final String TEXT_122 = "(), edge.getElement()));";
  protected final String TEXT_123 = NL + "\t\t\tresult.append(";
  protected final String TEXT_124 = ".create(" + NL + "\t\t\t\teditingDomain," + NL + "\t\t\t\tedge.getElement().eContainer(), ";
  protected final String TEXT_125 = ".eINSTANCE.get";
  protected final String TEXT_126 = "()," + NL + "\t\t\t\tedge.getElement()));";
  protected final String TEXT_127 = NL + "\t\t\tresult.append(";
  protected final String TEXT_128 = ".create(" + NL + "\t\t\t\teditingDomain," + NL + "\t\t\t\tedge.getElement().eContainer(), ";
  protected final String TEXT_129 = ".eINSTANCE.get";
  protected final String TEXT_130 = "()," + NL + "\t\t\t\t";
  protected final String TEXT_131 = ".UNSET_VALUE));";
  protected final String TEXT_132 = NL + "\t\t\tresult.append(";
  protected final String TEXT_133 = ".create(" + NL + "\t\t\t\teditingDomain," + NL + "\t\t\t\tcontainer, ";
  protected final String TEXT_134 = ".eINSTANCE.get";
  protected final String TEXT_135 = "(), edge.getElement()));";
  protected final String TEXT_136 = NL + "\t\t}";
  protected final String TEXT_137 = NL + "\t\tresult.append(";
  protected final String TEXT_138 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getElement(), ";
  protected final String TEXT_139 = ".eINSTANCE.get";
  protected final String TEXT_140 = "()," + NL + "\t\t\toldSource.getElement()));" + NL + "\t\tresult.append(";
  protected final String TEXT_141 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getElement(), ";
  protected final String TEXT_142 = ".eINSTANCE.get";
  protected final String TEXT_143 = "()," + NL + "\t\t\tnewSource.getElement()));";
  protected final String TEXT_144 = NL + "\t\tresult.append(";
  protected final String TEXT_145 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tedge.getElement(), ";
  protected final String TEXT_146 = ".eINSTANCE.get";
  protected final String TEXT_147 = "()," + NL + "\t\t\tnewSource.getElement()));";
  protected final String TEXT_148 = NL + "\t\tresult.append(";
  protected final String TEXT_149 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\toldSource.getElement(), ";
  protected final String TEXT_150 = ".eINSTANCE.get";
  protected final String TEXT_151 = "(), edge.getTarget().getElement()));" + NL + "\t\tresult.append(";
  protected final String TEXT_152 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tnewSource.getElement(), ";
  protected final String TEXT_153 = ".eINSTANCE.get";
  protected final String TEXT_154 = "(), edge.getTarget().getElement()));";
  protected final String TEXT_155 = NL + "\t\tresult.append(";
  protected final String TEXT_156 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\toldSource.getElement(), ";
  protected final String TEXT_157 = ".eINSTANCE.get";
  protected final String TEXT_158 = "(), ";
  protected final String TEXT_159 = ".UNSET_VALUE));" + NL + "\t\tresult.append(";
  protected final String TEXT_160 = ".create(" + NL + "\t\t\teditingDomain," + NL + "\t\t\tnewSource.getElement(), ";
  protected final String TEXT_161 = ".eINSTANCE.get";
  protected final String TEXT_162 = "(), edge.getTarget().getElement()));";
  protected final String TEXT_163 = NL + "\t\treturn result;" + NL + "\t}" + NL;
  protected final String TEXT_164 = NL;
  protected final String TEXT_165 = NL + "\t\t/**" + NL + "\t\t * Finds container element for the relationship of the specified type." + NL + "\t\t * Default implementation goes up by containment hierarchy starting from" + NL + "\t\t * the specified element and returns the first element that is instance of" + NL + "\t\t * the specified container class." + NL + "\t\t * " + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprotected ";
  protected final String TEXT_166 = " getRelationshipContainer(";
  protected final String TEXT_167 = " element, ";
  protected final String TEXT_168 = " containerClass) {" + NL + "\t\t\tfor (; element != null; element = element.eContainer()) {" + NL + "\t\t\t\tif (containerClass.isSuperTypeOf(element.eClass())) {" + NL + "\t\t\t\t\treturn element;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn null;" + NL + "\t\t}";
  protected final String TEXT_169 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_170 = NL;
  protected final String TEXT_171 = NL + "\t\t\tprivate ";
  protected final String TEXT_172 = " createDomainModelRemoveCommand(";
  protected final String TEXT_173 = " editingDomain) {";
  protected final String TEXT_174 = NL + "\t\t\t\t";
  protected final String TEXT_175 = " result = new ";
  protected final String TEXT_176 = "();";
  protected final String TEXT_177 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_178 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_179 = ".getElement().eContainer(), ";
  protected final String TEXT_180 = ".eINSTANCE.get";
  protected final String TEXT_181 = "(), ";
  protected final String TEXT_182 = ".getElement()));";
  protected final String TEXT_183 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_184 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_185 = ".getElement().eContainer(), ";
  protected final String TEXT_186 = ".eINSTANCE.get";
  protected final String TEXT_187 = "(), ";
  protected final String TEXT_188 = ".UNSET_VALUE));";
  protected final String TEXT_189 = NL + "\t\t\t\treturn ";
  protected final String TEXT_190 = ".INSTANCE;";
  protected final String TEXT_191 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_192 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_193 = ".getElement().eContainer(), ";
  protected final String TEXT_194 = ".eINSTANCE.get";
  protected final String TEXT_195 = "()," + NL + "\t\t\t\t\t";
  protected final String TEXT_196 = ".getElement()));";
  protected final String TEXT_197 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_198 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_199 = ".getElement().eContainer(), ";
  protected final String TEXT_200 = ".eINSTANCE.get";
  protected final String TEXT_201 = "()," + NL + "\t\t\t\t\t";
  protected final String TEXT_202 = ".UNSET_VALUE));";
  protected final String TEXT_203 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_204 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_205 = ".getElement(), ";
  protected final String TEXT_206 = ".eINSTANCE.get";
  protected final String TEXT_207 = "(), ";
  protected final String TEXT_208 = ".getSource().getElement()));";
  protected final String TEXT_209 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_210 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_211 = ".getElement(), ";
  protected final String TEXT_212 = ".eINSTANCE.get";
  protected final String TEXT_213 = "(), ";
  protected final String TEXT_214 = ".UNSET_VALUE));";
  protected final String TEXT_215 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_216 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_217 = ".getElement(), ";
  protected final String TEXT_218 = ".eINSTANCE.get";
  protected final String TEXT_219 = "(), ";
  protected final String TEXT_220 = ".getTarget().getElement()));";
  protected final String TEXT_221 = NL + "\t\t\t\tresult.append(";
  protected final String TEXT_222 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_223 = ".getElement(), ";
  protected final String TEXT_224 = ".eINSTANCE.get";
  protected final String TEXT_225 = "(), ";
  protected final String TEXT_226 = ".UNSET_VALUE));";
  protected final String TEXT_227 = NL + "\t\t\t\treturn result;";
  protected final String TEXT_228 = NL + "\t\t\t\treturn ";
  protected final String TEXT_229 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_230 = ".getSource().getElement(), ";
  protected final String TEXT_231 = ".eINSTANCE.get";
  protected final String TEXT_232 = "(), ";
  protected final String TEXT_233 = ".getTarget().getElement());";
  protected final String TEXT_234 = NL + "\t\t\t\treturn ";
  protected final String TEXT_235 = ".create(" + NL + "\t\t\t\t\teditingDomain," + NL + "\t\t\t\t\t";
  protected final String TEXT_236 = ".getSource().getElement(), ";
  protected final String TEXT_237 = ".eINSTANCE.get";
  protected final String TEXT_238 = "(), ";
  protected final String TEXT_239 = ".UNSET_VALUE);";
  protected final String TEXT_240 = NL + "\t\t\t}";
  protected final String TEXT_241 = NL + "}";
  protected final String TEXT_242 = NL;

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
			GenFeature containmentFeature = modelFacet.getContainmentMetaFeature();
			GenFeature childFeature = modelFacet.getChildMetaFeature();
			if (containmentFeature == null) {

    stringBuffer.append(TEXT_41);
    
			} else {

    stringBuffer.append(TEXT_42);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(containmentFeature.getGenClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_46);
    
				{
					GenFeature _feature = containmentFeature;
					String _ownerInstance = "container";
					String _exceedsUpperBound = "return false;";
					GenClass _ownerGenClass = containmentFeature.getGenClass();

    stringBuffer.append(TEXT_47);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_48);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_50);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_51);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_55);
    
	}
}

    
				}
				if (childFeature != null && childFeature != containmentFeature && !childFeature.isDerived()) {
					{
						GenFeature _feature = childFeature;
						String _ownerInstance = "container";
						String _exceedsUpperBound = "return false;";
						GenClass _ownerGenClass = containmentFeature.getGenClass();

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
				}
			}
			//No need to check the size of the source or target features: their size does not change
			//Still need to check the eOpposite() of the source feature
			GenFeature sourceFeature = modelFacet.getSourceMetaFeature();
			GenFeature sourceReverseFeature = sourceFeature == null ? null : sourceFeature.getReverse();
			if (sourceReverseFeature != null && !sourceReverseFeature.isDerived() && sourceReverseFeature != containmentFeature && sourceReverseFeature != childFeature) {
				GenFeature _feature = sourceReverseFeature;
				String _ownerInstance = "newSource.getElement()";
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
	String _source = "newSource.getElement()";
	String _target = "edge.getTarget().getElement()";

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

    
}	//local declarations for linkConstraints.jetinc

    stringBuffer.append(TEXT_79);
    
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
			{
				GenFeature _feature = metaFeature;
				String _ownerInstance = "newSource.getElement()";
				String _exceedsUpperBound = "return false;";
				GenClass _ownerGenClass = null;

    stringBuffer.append(TEXT_80);
    
int upperBound = _feature.getEcoreFeature().getUpperBound();
if (upperBound == 1) {

    stringBuffer.append(TEXT_81);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, false);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_83);
    
} else {
	if (upperBound > 0) {

    stringBuffer.append(TEXT_84);
    myFeatureGetAccessorHelper.appendFeatureValueGetter(_ownerInstance, _feature, _ownerGenClass, true);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName(_feature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(_feature.getFeatureAccessorName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(_exceedsUpperBound);
    stringBuffer.append(TEXT_88);
    
	}
}

    
			}
{
	String _source = "newSource.getElement()";
	String _target = "edge.getTarget().getElement()";

    stringBuffer.append(TEXT_89);
    
			if (linkConstraints != null) {

    stringBuffer.append(TEXT_90);
    stringBuffer.append(importManager.getImportedName(genDiagram.getNotationViewFactoriesPackageName() + ".DomainElementInitializer")+"."+genDiagram.getLinkCreationConstraintsClassName()+"."+linkConstraints.getConstraintsInstanceFieldName());
    stringBuffer.append(TEXT_91);
    stringBuffer.append(_source);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(_target);
    stringBuffer.append(TEXT_93);
    
			}

    
}	//local declarations for linkConstraints.jetinc

    stringBuffer.append(TEXT_94);
    
		} else {

    stringBuffer.append(TEXT_95);
    
		}

    stringBuffer.append(TEXT_96);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_98);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.util.TransactionUtil"));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(importManager.getImportedName("org.eclipse.gmf.runtime.lite.commands.ReconnectNotationalEdgeSourceCommand"));
    stringBuffer.append(TEXT_102);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {
			TypeLinkModelFacet modelFacet = (TypeLinkModelFacet) genLink.getModelFacet();
			GenFeature sourceFeature = modelFacet.getSourceMetaFeature();
			GenFeature containmentFeature = modelFacet.getContainmentMetaFeature();
			GenFeature childFeature = modelFacet.getChildMetaFeature();
			boolean setSource = sourceFeature != null;
			boolean setChild = childFeature != null && childFeature != containmentFeature && !childFeature.isDerived();
			if (containmentFeature != null) {
				if (sourceFeature != null && sourceFeature.getEcoreFeature() instanceof EReference == true) {
					EReference sourceEcoreFeature = (EReference)sourceFeature.getEcoreFeature();
					if (sourceEcoreFeature.getEOpposite() == containmentFeature.getEcoreFeature()) {
						setSource = false;
					}
				}
			}
			if (containmentFeature != null || setChild) {

    stringBuffer.append(TEXT_103);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenClass().getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(containmentFeature.getGenClass().getClassifierAccessorName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.UnexecutableCommand"));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.UnexecutableCommand"));
    stringBuffer.append(TEXT_109);
    
			}
			if (containmentFeature != null) {
				if (containmentFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_110);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_112);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_113);
    
				} else {

    stringBuffer.append(TEXT_114);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_117);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_118);
    
				}

    stringBuffer.append(TEXT_119);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_122);
    
			}
			if (setChild) {
				if (childFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_123);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_125);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_126);
    
				} else {

    stringBuffer.append(TEXT_127);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_131);
    
				}

    stringBuffer.append(TEXT_132);
    stringBuffer.append(importManager.getImportedName(childFeature.getEcoreFeature().isMany() ? "org.eclipse.emf.edit.command.AddCommand" : "org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_135);
    
			}

    stringBuffer.append(TEXT_136);
    
			if (setSource) {
				if (sourceFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_137);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.AddCommand"));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_143);
    
				} else {

    stringBuffer.append(TEXT_144);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_147);
    
				}
			}
		} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
			GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
			if (metaFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_148);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.AddCommand"));
    stringBuffer.append(TEXT_152);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_154);
    
			} else {

    stringBuffer.append(TEXT_155);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_157);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_158);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_162);
    
			}
		}

    stringBuffer.append(TEXT_163);
    stringBuffer.append(TEXT_164);
    
		if (genLink.getModelFacet() instanceof TypeLinkModelFacet) {

    stringBuffer.append(TEXT_165);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_168);
    
		}

    
	if (linkConstraints != null) {
		String _edge = "edge";

    stringBuffer.append(TEXT_169);
    stringBuffer.append(TEXT_170);
    
	//input: _edge : String

    stringBuffer.append(TEXT_171);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.Command"));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.transaction.TransactionalEditingDomain"));
    stringBuffer.append(TEXT_173);
    
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

    stringBuffer.append(TEXT_174);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.CompoundCommand"));
    stringBuffer.append(TEXT_176);
    
			if (containmentFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_177);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_178);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_179);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_182);
    
			} else {

    stringBuffer.append(TEXT_183);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_185);
    stringBuffer.append(importManager.getImportedName(containmentFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_186);
    stringBuffer.append(containmentFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_187);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_188);
    
			}
		} else {

    stringBuffer.append(TEXT_189);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.command.UnexecutableCommand"));
    stringBuffer.append(TEXT_190);
    
		}
		if (removeChild) {
			if (childFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_191);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_192);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_193);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_195);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_196);
    
			} else {

    stringBuffer.append(TEXT_197);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_198);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_199);
    stringBuffer.append(importManager.getImportedName(childFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_200);
    stringBuffer.append(childFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_201);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_202);
    
			}
		}
		if (removeSource) {
			if (sourceFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_203);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_204);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_205);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_206);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_207);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_208);
    
			} else {

    stringBuffer.append(TEXT_209);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_210);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_211);
    stringBuffer.append(importManager.getImportedName(sourceFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_212);
    stringBuffer.append(sourceFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_214);
    
			}
		}
		if (removeTarget) {
			if (targetFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_215);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_216);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_217);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_218);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_219);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_220);
    
			} else {

    stringBuffer.append(TEXT_221);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_222);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_223);
    stringBuffer.append(importManager.getImportedName(targetFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(targetFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_225);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_226);
    
			}
		}

    stringBuffer.append(TEXT_227);
    
	} else if (genLink.getModelFacet() instanceof FeatureLinkModelFacet) {
		GenFeature metaFeature = ((FeatureLinkModelFacet) genLink.getModelFacet()).getMetaFeature();
		if (metaFeature.getEcoreFeature().isMany()) {

    stringBuffer.append(TEXT_228);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.RemoveCommand"));
    stringBuffer.append(TEXT_229);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_230);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_231);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_233);
    
		} else {

    stringBuffer.append(TEXT_234);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(_edge);
    stringBuffer.append(TEXT_236);
    stringBuffer.append(importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName()));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_238);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.edit.command.SetCommand"));
    stringBuffer.append(TEXT_239);
    
		}

    
	}

    stringBuffer.append(TEXT_240);
    
	}

    stringBuffer.append(TEXT_241);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_242);
    return stringBuffer.toString();
  }
}
