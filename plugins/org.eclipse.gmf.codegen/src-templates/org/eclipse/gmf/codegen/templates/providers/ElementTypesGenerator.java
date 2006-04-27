package org.eclipse.gmf.codegen.templates.providers;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.gmf.codegen.gmfgen.*;
import org.eclipse.gmf.common.codegen.*;

public class ElementTypesGenerator
{
  protected static String nl;
  public static synchronized ElementTypesGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    ElementTypesGenerator result = new ElementTypesGenerator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "/*" + NL + " * ";
  protected final String TEXT_3 = NL + " */";
  protected final String TEXT_4 = NL + "package ";
  protected final String TEXT_5 = ";" + NL;
  protected final String TEXT_6 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_7 = " {" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate ";
  protected final String TEXT_8 = "() {}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static Map elements;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static ImageRegistry imageRegistry;" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static ImageRegistry getImageRegistry() {" + NL + "\t\tif (imageRegistry == null) {" + NL + "\t\t\timageRegistry = new ImageRegistry();" + NL + "\t\t}" + NL + "\t\treturn imageRegistry;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static String getImageRegistryKey(ENamedElement element) {" + NL + "\t\treturn element.getName();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {" + NL + "\t\tif (element instanceof EStructuralFeature) {" + NL + "\t\t\telement = ((EStructuralFeature) element).getEContainingClass();" + NL + "\t\t}" + NL + "\t\tif (element instanceof EClass) {";
  protected final String TEXT_9 = NL + "\t\t\tEClass eClass = (EClass) element;" + NL + "\t\t\tif (!eClass.isAbstract()) {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_10 = ".getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t// TODO : support structural features" + NL + "\t\treturn null;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ImageDescriptor getImageDescriptor(ENamedElement element) {" + NL + "\t\tString key = getImageRegistryKey(element);" + NL + "\t\tImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);" + NL + "\t\tif (imageDescriptor == null) {" + NL + "\t\t\timageDescriptor = getProvidedImageDescriptor(element);" + NL + "\t\t\tif (imageDescriptor == null) {" + NL + "\t\t\t\timageDescriptor = ImageDescriptor.getMissingImageDescriptor();" + NL + "\t\t\t}" + NL + "\t\t\tgetImageRegistry().put(key, imageDescriptor);" + NL + "\t\t}" + NL + "\t\treturn imageDescriptor;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static Image getImage(ENamedElement element) {" + NL + "\t\tString key = getImageRegistryKey(element);" + NL + "\t\tImage image = getImageRegistry().get(key);" + NL + "\t\tif (image == null) {" + NL + "\t\t\tImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);" + NL + "\t\t\tif (imageDescriptor == null) {" + NL + "\t\t\t\timageDescriptor = ImageDescriptor.getMissingImageDescriptor();" + NL + "\t\t\t}" + NL + "\t\t\tgetImageRegistry().put(key, imageDescriptor);" + NL + "\t\t\timage = getImageRegistry().get(key);" + NL + "\t\t}" + NL + "\t\treturn image;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ImageDescriptor getImageDescriptor(IAdaptable hint) {" + NL + "\t\tENamedElement element = getElement(hint);" + NL + "\t\tif (element == null) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\treturn getImageDescriptor(element);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static Image getImage(IAdaptable hint) {" + NL + "\t\tENamedElement element = getElement(hint);" + NL + "\t\tif (element == null) {" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t\treturn getImage(element);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns 'type' of the ecore object associated with the hint." + NL + "\t * " + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static ENamedElement getElement(IAdaptable hint) {" + NL + "\t\tObject type = hint.getAdapter(IElementType.class);" + NL + "\t\tif (elements == null) {" + NL + "\t\t\telements = new IdentityHashMap();";
  protected final String TEXT_11 = NL + "\t\t\telements.put(";
  protected final String TEXT_12 = ", ";
  protected final String TEXT_13 = ".eINSTANCE.get";
  protected final String TEXT_14 = "());";
  protected final String TEXT_15 = NL + "\t\t\telements.put(";
  protected final String TEXT_16 = ", ";
  protected final String TEXT_17 = ".eINSTANCE.get";
  protected final String TEXT_18 = "());";
  protected final String TEXT_19 = NL + "\t\t\telements.put(";
  protected final String TEXT_20 = ", ";
  protected final String TEXT_21 = ".eINSTANCE.get";
  protected final String TEXT_22 = "());";
  protected final String TEXT_23 = NL + "\t\t}" + NL + "\t\treturn (ENamedElement) elements.get(type);" + NL + "\t}";
  protected final String TEXT_24 = NL;
  protected final String TEXT_25 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final IElementType ";
  protected final String TEXT_26 = " = getElementType(\"";
  protected final String TEXT_27 = "\");";
  protected final String TEXT_28 = NL;
  protected final String TEXT_29 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final IElementType ";
  protected final String TEXT_30 = " = getElementType(\"";
  protected final String TEXT_31 = "\");";
  protected final String TEXT_32 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static IElementType getElementType(String id) {" + NL + "\t\treturn ElementTypeRegistry.getInstance().getType(id);" + NL + "\t}";
  protected final String TEXT_33 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Initializers {";
  protected final String TEXT_34 = NL + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static final ObjectInitializer ";
  protected final String TEXT_35 = " = new ObjectInitializer(new FeatureInitializer[] {";
  protected final String TEXT_36 = NL + "\t\t\tnew FeatureInitializer(" + NL + "\t\t\t\t";
  protected final String TEXT_37 = "null";
  protected final String TEXT_38 = ".";
  protected final String TEXT_39 = "(\"";
  protected final String TEXT_40 = "\", //$NON-NLS-1$" + NL + "\t";
  protected final String TEXT_41 = ", ";
  protected final String TEXT_42 = ")";
  protected final String TEXT_43 = ".";
  protected final String TEXT_44 = "(\"";
  protected final String TEXT_45 = "\", //$NON-NLS-1$" + NL + "\t";
  protected final String TEXT_46 = ")";
  protected final String TEXT_47 = "new ";
  protected final String TEXT_48 = "(";
  protected final String TEXT_49 = ") {" + NL + "\tprotected Object doEvaluate(Object context, ";
  protected final String TEXT_50 = " env) {\t" + NL + "\t\t";
  protected final String TEXT_51 = " self = (";
  protected final String TEXT_52 = ")context;";
  protected final String TEXT_53 = "\t" + NL + "\t\t";
  protected final String TEXT_54 = " ";
  protected final String TEXT_55 = " = (";
  protected final String TEXT_56 = ")env.get(\"";
  protected final String TEXT_57 = "\"); //$NON-NLS-1$";
  protected final String TEXT_58 = NL + "\t\treturn ";
  protected final String TEXT_59 = ".";
  protected final String TEXT_60 = "(self";
  protected final String TEXT_61 = ", ";
  protected final String TEXT_62 = ");" + NL + "\t}" + NL + "}";
  protected final String TEXT_63 = NL + "," + NL + "\t\t\t\t";
  protected final String TEXT_64 = ")";
  protected final String TEXT_65 = NL + "\t\t});";
  protected final String TEXT_66 = NL + "\t" + NL + "\t\t/** " + NL + "\t\t * @generated" + NL + "\t\t */\t" + NL + "\t\tprivate Initializers() {" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/** " + NL + "\t\t * @generated" + NL + "\t\t */\t" + NL + "\t\tpublic static class ObjectInitializer {" + NL + "\t\t\t/** " + NL + "\t\t\t * @generated" + NL + "\t\t\t */\t\t" + NL + "\t\t\tprivate FeatureInitializer[] initExpressions;\t" + NL + "\t\t\t" + NL + "\t\t\t/** " + NL + "\t\t\t * @generated" + NL + "\t\t\t */\t\t" + NL + "\t\t\tObjectInitializer(FeatureInitializer[] initExpressions) {" + NL + "\t\t\t\tthis.initExpressions = initExpressions;" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t/** " + NL + "\t\t\t * @generated" + NL + "\t\t\t */\t\t" + NL + "\t\t\tpublic void init(";
  protected final String TEXT_67 = " instance) {" + NL + "\t\t\t\tfor (int i = 0; i < initExpressions.length; i++) {" + NL + "\t\t\t\t\tFeatureInitializer nextExpr = initExpressions[i];" + NL + "\t\t\t\t\tnextExpr.init(instance);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t} // end of ObjectInitializer" + NL + "\t\t" + NL + "\t\t/** " + NL + "\t\t * @generated" + NL + "\t\t */\t" + NL + "\t\tstatic class FeatureInitializer {" + NL + "\t\t\t/** " + NL + "\t\t\t * @generated" + NL + "\t\t\t */\t\t" + NL + "\t\t\tprivate ";
  protected final String TEXT_68 = " sFeature;" + NL + "\t\t\t/** " + NL + "\t\t\t * @generated" + NL + "\t\t\t */" + NL + "\t\t\tprivate ";
  protected final String TEXT_69 = " expression;\t\t" + NL + "\t\t\t/**" + NL + "\t\t\t * @generated" + NL + "\t\t\t */\t\t" + NL + "\t\t\tFeatureInitializer(";
  protected final String TEXT_70 = " expression, " + NL + "\t\t\t\t";
  protected final String TEXT_71 = " sFeature) {" + NL + "\t\t\t\tthis.sFeature = sFeature;" + NL + "\t\t\t\tthis.expression = expression;" + NL + "\t\t\t}" + NL + "\t\t\t/** " + NL + "\t\t\t * @generated" + NL + "\t\t\t */" + NL + "\t\t\tvoid init(";
  protected final String TEXT_72 = " contextInstance) {" + NL + "\t\t\t\tObject value = expression.evaluate(contextInstance);" + NL + "\t\t\t\tif(sFeature.getEType() instanceof ";
  protected final String TEXT_73 = " && " + NL + "\t\t\t\t\tvalue instanceof ";
  protected final String TEXT_74 = ") {" + NL + "\t\t\t\t\tvalue = ((";
  protected final String TEXT_75 = ")value).getInstance();" + NL + "\t\t\t\t} else if(value != null && sFeature.isMany()) {" + NL + "\t\t\t\t\tvalue = new ";
  protected final String TEXT_76 = "((";
  protected final String TEXT_77 = ")value);" + NL + "\t\t\t\t}" + NL + "\t\t\t\tcontextInstance.eSet(sFeature, value);" + NL + "\t\t\t}" + NL + "\t\t} // end of FeatureInitializer";
  protected final String TEXT_78 = NL + "\t\t/** " + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tstatic class ";
  protected final String TEXT_79 = " {";
  protected final String TEXT_80 = NL;
  protected final String TEXT_81 = NL + "/**" + NL + " * @generated" + NL + " */" + NL + "private static ";
  protected final String TEXT_82 = " ";
  protected final String TEXT_83 = "(";
  protected final String TEXT_84 = " self";
  protected final String TEXT_85 = ", ";
  protected final String TEXT_86 = " ";
  protected final String TEXT_87 = ") {" + NL + "\t// TODO: implement this method" + NL + "\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t" + NL + "\tthrow new UnsupportedOperationException(\"No user implementation provided in '";
  protected final String TEXT_88 = "' operation\"); //$NON-NLS-1$" + NL + "}";
  protected final String TEXT_89 = NL + "\t\t} //";
  protected final String TEXT_90 = NL + "\t} // end of Initializers";
  protected final String TEXT_91 = NL + "}";
  protected final String TEXT_92 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    GenDiagram genDiagram = (GenDiagram) ((Object[]) argument)[0];
    stringBuffer.append(TEXT_1);
    
String copyrightText = genDiagram.getEditorGen().getCopyrightText();
if (copyrightText != null && copyrightText.trim().length() > 0) {

    stringBuffer.append(TEXT_2);
    stringBuffer.append(copyrightText.replaceAll("\n", "\n * "));
    stringBuffer.append(TEXT_3);
    }
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genDiagram.getProvidersPackageName());
    stringBuffer.append(TEXT_5);
    ImportUtil importManager = new ImportUtil(genDiagram.getProvidersPackageName());
importManager.registerInnerClass("Initializers");
importManager.registerInnerClass("ObjectInitializer");
importManager.registerInnerClass("FeatureInitializer");
final String javaExprContainer = "Java";
importManager.registerInnerClass(javaExprContainer);

importManager.addImport("java.util.IdentityHashMap");
importManager.addImport("java.util.Map");
importManager.addImport("org.eclipse.core.runtime.IAdaptable");
importManager.addImport("org.eclipse.emf.ecore.EClass");
importManager.addImport("org.eclipse.emf.ecore.ENamedElement");
importManager.addImport("org.eclipse.emf.ecore.EStructuralFeature");
importManager.addImport("org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry");
importManager.addImport("org.eclipse.gmf.runtime.emf.type.core.IElementType");
importManager.addImport("org.eclipse.jface.resource.ImageDescriptor");
importManager.addImport("org.eclipse.jface.resource.ImageRegistry");
importManager.addImport("org.eclipse.swt.graphics.Image");
importManager.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genDiagram.getElementTypesClassName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genDiagram.getElementTypesClassName());
    stringBuffer.append(TEXT_8);
    String pluginClassName = importManager.getImportedName(genDiagram.getEditorGen().getPlugin().getActivatorQualifiedClassName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(pluginClassName);
    stringBuffer.append(TEXT_10);
    
GenClass diagramElement = genDiagram.getDomainDiagramElement();
if (diagramElement != null) {
	String semanticPackageInterfaceName = importManager.getImportedName(diagramElement.getGenPackage().getQualifiedPackageInterfaceName());

    stringBuffer.append(TEXT_11);
    stringBuffer.append(genDiagram.getUniqueIdentifier());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(semanticPackageInterfaceName);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(diagramElement.getClassifierAccessorName());
    stringBuffer.append(TEXT_14);
    
}
for (Iterator contents = genDiagram.eAllContents(); contents.hasNext(); ) {
	Object next = contents.next();
	String id = null;
	ModelFacet modelFacet = null;
	if (next instanceof GenNode) {
		id = ((GenNode) next).getUniqueIdentifier();
		modelFacet = ((GenNode) next).getModelFacet();
	} else if (next instanceof GenLink) {
		id = ((GenLink) next).getUniqueIdentifier();
		modelFacet = ((GenLink) next).getModelFacet();
	}
	if (modelFacet instanceof TypeModelFacet) {
		GenClass metaClass = ((TypeModelFacet) modelFacet).getMetaClass();
		String semanticPackageInterfaceName = importManager.getImportedName(metaClass.getGenPackage().getQualifiedPackageInterfaceName());

    stringBuffer.append(TEXT_15);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(semanticPackageInterfaceName);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(metaClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_18);
    
	} else if (modelFacet instanceof FeatureModelFacet) {
		GenFeature metaFeature = ((FeatureModelFacet) modelFacet).getMetaFeature();
		String semanticPackageInterfaceName = importManager.getImportedName(metaFeature.getGenPackage().getQualifiedPackageInterfaceName());

    stringBuffer.append(TEXT_19);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(semanticPackageInterfaceName);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(metaFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_22);
    
	}
}

    stringBuffer.append(TEXT_23);
    
int elementInitializerCount = 0;
GenCommonBase genElement = genDiagram;
    stringBuffer.append(TEXT_24);
    if (genElement.getElementType() != null) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genElement.getUniqueIdentifier());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genElement.getElementType().getUniqueIdentifier());
    stringBuffer.append(TEXT_27);
    }
    
for (Iterator contents = genDiagram.eAllContents(); contents.hasNext(); ) {
	Object next = contents.next();
	TypeModelFacet typeModelFacet = null;
	if (next instanceof GenNode) {
		genElement = (GenCommonBase) next;
		typeModelFacet = ((GenNode) next).getModelFacet();
	} else if (next instanceof GenLink) {
		genElement = (GenCommonBase) next;
		ModelFacet modelFacet = ((GenLink) next).getModelFacet();
		if (modelFacet instanceof TypeLinkModelFacet) {
			typeModelFacet = (TypeLinkModelFacet) ((GenLink) next).getModelFacet();
		}
	} else {
		continue;
	}
	if (typeModelFacet != null && typeModelFacet.getModelElementInitializer() != null) {
		elementInitializerCount++;
	}

    stringBuffer.append(TEXT_28);
    if (genElement.getElementType() != null) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genElement.getUniqueIdentifier());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genElement.getElementType().getUniqueIdentifier());
    stringBuffer.append(TEXT_31);
    }
    }
    stringBuffer.append(TEXT_32);
    if(elementInitializerCount > 0) {
    stringBuffer.append(TEXT_33);
    
final GenExpressionProviderContainer expressionProviders = genDiagram.getEditorGen().getExpressionProviders();
final Map javaInitializers = new HashMap();
final Map __exprEnvVariables = Collections.EMPTY_MAP;
final String __outEnvVarName = ""; // no env to setup;
final String __javaOperationContainer = javaExprContainer; // place java expression methods here
for (Iterator it = genDiagram.eAllContents(); it.hasNext(); ) {
	Object next = it.next();
	String id = null;
	TypeModelFacet modelFacet = null;
	if (next instanceof GenNode) {
		id = ((GenNode) next).getUniqueIdentifier();
		modelFacet = ((GenNode) next).getModelFacet();
	} else if (next instanceof GenLink && ((GenLink) next).getModelFacet() instanceof TypeLinkModelFacet) {
		id = ((GenLink) next).getUniqueIdentifier();
		modelFacet = (TypeLinkModelFacet) ((GenLink) next).getModelFacet();
	}
	if (modelFacet != null && modelFacet.getModelElementInitializer() instanceof GenFeatureSeqInitializer) {				
		GenFeatureSeqInitializer ftInitializer = (GenFeatureSeqInitializer)modelFacet.getModelElementInitializer();		
		if(expressionProviders == null) continue;		

    stringBuffer.append(TEXT_34);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_35);
    
		GenClassifier __genExprContext = ftInitializer.getTypeModelFacet().getMetaClass();
		for(Iterator featInitIt = ftInitializer.getInitializers().iterator(); featInitIt.hasNext();) {		 
			GenFeatureValueSpec __genValueExpression = (GenFeatureValueSpec)featInitIt.next();
			String metaFeatureAccess = importManager.getImportedName(__genValueExpression.getFeatureQualifiedPackageInterfaceName())+".eINSTANCE.get"+__genValueExpression.getFeature().getFeatureAccessorName()+"()"; 

    stringBuffer.append(TEXT_36);
    
{ /*begin the scope*/
/*
ValueExpression __genValueExpression;
GenClassifier __genExprContext
java.util.Map __exprEnvVariables
String __outEnvVarName;
String __javaOperationContainer;
*/
	org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase __genExprProvider = (genDiagram.getEditorGen().getExpressionProviders() != null) ? genDiagram.getEditorGen().getExpressionProviders().getProvider(__genValueExpression) : null;
	String __ctxEClassifierAccess = importManager.getImportedName(__genExprContext.getGenPackage().getQualifiedPackageInterfaceName()) + ".eINSTANCE.get" + __genExprContext.getClassifierAccessorName()+"()";
	String __importedAbstractClass = __genExprProvider != null ? importManager.getImportedName(__genExprProvider.getContainer().getAbstractExpressionQualifiedClassName()) : null;

	if(__genExprProvider == null || __importedAbstractClass == null) {

    stringBuffer.append(TEXT_37);
    
	} else if(__genExprProvider instanceof org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter) {
		org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter interpreter = (org.eclipse.gmf.codegen.gmfgen.GenExpressionInterpreter)__genExprProvider;
		String __expressionAccessor = interpreter.getExpressionAccessor(__genValueExpression);
		String providerImportedClass = importManager.getImportedName(interpreter.getQualifiedClassName());
		if(!__exprEnvVariables.isEmpty()) {			

    stringBuffer.append(providerImportedClass);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(__expressionAccessor);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(__genValueExpression.getBody());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(__ctxEClassifierAccess);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(__outEnvVarName);
    stringBuffer.append(TEXT_42);
    
		} else { 		

    stringBuffer.append(providerImportedClass);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(__expressionAccessor);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(__genValueExpression.getBody());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(__ctxEClassifierAccess);
    stringBuffer.append(TEXT_46);
    
		}
	} else if(__genExprProvider instanceof org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider) { /*inlined java expression adapter*/
		String evalCtxQualifiedName = __genExprProvider.getQualifiedInstanceClassName(__genExprContext);
		String __exprJavaOperName = ((org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider)__genExprProvider).getOperationName(__genValueExpression);	


    stringBuffer.append(TEXT_47);
    stringBuffer.append(__importedAbstractClass);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(__ctxEClassifierAccess);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(importManager.getImportedName("java.util.Map"));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(importManager.getImportedName(evalCtxQualifiedName));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(importManager.getImportedName(evalCtxQualifiedName));
    stringBuffer.append(TEXT_52);
    	
		for(java.util.Iterator envVarIt = __exprEnvVariables.keySet().iterator(); envVarIt.hasNext();) {
			String nextVariableName = (String)envVarIt.next();
			org.eclipse.emf.codegen.ecore.genmodel.GenClassifier nextVariableType = (org.eclipse.emf.codegen.ecore.genmodel.GenClassifier)__exprEnvVariables.get(nextVariableName);
			String qualifiedTypeName = __genExprProvider.getQualifiedInstanceClassName(nextVariableType);

    stringBuffer.append(TEXT_53);
    stringBuffer.append(importManager.getImportedName(qualifiedTypeName));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(nextVariableName);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(importManager.getImportedName(qualifiedTypeName));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(nextVariableName);
    stringBuffer.append(TEXT_57);
    		} 
    stringBuffer.append(TEXT_58);
    
		if(__javaOperationContainer != null && __javaOperationContainer.length() > 0) { 
    stringBuffer.append(__javaOperationContainer);
    stringBuffer.append(TEXT_59);
    
		} 
    stringBuffer.append(__exprJavaOperName);
    stringBuffer.append(TEXT_60);
    
		for(java.util.Iterator envVarIt = __exprEnvVariables.keySet().iterator(); envVarIt.hasNext();){
    stringBuffer.append(TEXT_61);
    stringBuffer.append((String)envVarIt.next());
    }
    stringBuffer.append(TEXT_62);
    }
    } /*end of scope*/
    stringBuffer.append(TEXT_63);
    stringBuffer.append(metaFeatureAccess);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(featInitIt.hasNext() ? "," : "");
    
			if(expressionProviders.getProvider(__genValueExpression) instanceof GenJavaExpressionProvider) {
				javaInitializers.put(__genValueExpression, __genExprContext);
			}
		} // end of GenFeatureValueSpec iteration

    stringBuffer.append(TEXT_65);
    
	} // end of GenFeatureSeqInitializer 
} // end of getGenEntities iteration

    stringBuffer.append(TEXT_66);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(importManager.getImportedName(expressionProviders.getAbstractExpressionQualifiedClassName()));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(importManager.getImportedName(expressionProviders.getAbstractExpressionQualifiedClassName()));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EEnum"));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EEnumLiteral"));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.ecore.EEnumLiteral"));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(importManager.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(importManager.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_77);
    
	if(!javaInitializers.isEmpty()) {

    stringBuffer.append(TEXT_78);
    stringBuffer.append(javaExprContainer);
    stringBuffer.append(TEXT_79);
    
		for(Iterator javaExprIt = javaInitializers.keySet().iterator(); javaExprIt.hasNext();) {
			GenFeatureValueSpec __genValueExpression = (GenFeatureValueSpec)javaExprIt.next();
			GenClassifier __genExprContext = (GenClassifier)javaInitializers.get(__genValueExpression);
			GenClassifier __genExprResultType = __genValueExpression.getFeature().getTypeGenClassifier();

    stringBuffer.append(TEXT_80);
    
/* 
ValueExpression __genValueExpression
java.util.Map __exprEnvVariables
GenClassifier __genExprContext
GenClassifier || String/qualifiedClassName/__genExprResultType
*/
org.eclipse.gmf.codegen.gmfgen.GenExpressionProviderBase __genExprProvider = (genDiagram.getEditorGen().getExpressionProviders() != null) ? genDiagram.getEditorGen().getExpressionProviders().getProvider(__genValueExpression) : null;
if(__genExprProvider instanceof org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider) {
	String evalCtxQualifiedName = __genExprProvider.getQualifiedInstanceClassName(__genExprContext);
	// support GenClassifier and also String based qualified java class name
	Object __genExprResultTypeObj = __genExprResultType;
	String __exprResultTypeQualifiedName = null;
	if(__genExprResultTypeObj instanceof String) 
		__exprResultTypeQualifiedName = (String)__genExprResultTypeObj;
	else if(__genExprResultTypeObj instanceof org.eclipse.emf.codegen.ecore.genmodel.GenClassifier)
		__exprResultTypeQualifiedName = __genExprProvider.getQualifiedInstanceClassName((org.eclipse.emf.codegen.ecore.genmodel.GenClassifier)__genExprResultTypeObj);
	String __exprJavaOperName = ((org.eclipse.gmf.codegen.gmfgen.GenJavaExpressionProvider)__genExprProvider).getOperationName(__genValueExpression);

    stringBuffer.append(TEXT_81);
    stringBuffer.append(importManager.getImportedName(__exprResultTypeQualifiedName));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(__exprJavaOperName);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(importManager.getImportedName(evalCtxQualifiedName));
    stringBuffer.append(TEXT_84);
    
	for(java.util.Iterator envVarIt = __exprEnvVariables.keySet().iterator(); envVarIt.hasNext();) {
		String __nextVarName = (String)envVarIt.next();
		org.eclipse.emf.codegen.ecore.genmodel.GenClassifier nextVariableType = (org.eclipse.emf.codegen.ecore.genmodel.GenClassifier)__exprEnvVariables.get(__nextVarName);
		String qualifiedTypeName = __genExprProvider.getQualifiedInstanceClassName(nextVariableType);

	
    stringBuffer.append(TEXT_85);
    stringBuffer.append(importManager.getImportedName(qualifiedTypeName));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(__nextVarName);
    	} 

    stringBuffer.append(TEXT_87);
    stringBuffer.append(__exprJavaOperName);
    stringBuffer.append(TEXT_88);
    
}

    
		}

    stringBuffer.append(TEXT_89);
    stringBuffer.append(javaExprContainer);
    	} /* end of javaInitializers */ 
    stringBuffer.append(TEXT_90);
    }
    stringBuffer.append(TEXT_91);
    importManager.emitSortedImports();
    stringBuffer.append(TEXT_92);
    return stringBuffer.toString();
  }
}
