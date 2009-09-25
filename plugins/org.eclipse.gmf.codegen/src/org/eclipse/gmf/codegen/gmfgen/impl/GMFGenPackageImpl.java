/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen.impl;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenFactory;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.validate.GMFValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenPackageImpl extends EPackageImpl implements GMFGenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected String packageFilename = "/models/gmfgen.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditorGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genEditorViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPreferencePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCustomPreferencePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genStandardPreferencePageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDiagramPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genStandardFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCustomFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRGBColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genConstantColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerClassNamesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortcutsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageNamesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorCandiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editPartCandiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDiagramUpdaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicModelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCommonBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDiagramBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContainerBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genTopLevelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildSideAffixedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildLabelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genChildContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNodeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExternalNodeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureLabelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designLabelModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLinkModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureLinkModelFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resizeConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSizeAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelOffsetAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snippetViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass innerClassViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentAssignedViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeledViewmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractToolEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolGroupItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genElementInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureSeqInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureValueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genReferenceNewElementSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genFeatureInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRuleBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genRuleTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDomainElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDiagramElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDomainAttributeTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNotationElementTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMetricContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMetricRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditedMetricTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genAuditContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMeasurableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionProviderContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionProviderBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genJavaExpressionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genExpressionInterpreterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLiteralExpressionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genDomainModelNavigatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNavigatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNavigatorChildReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNavigatorPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genNavigatorPathSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPropertySheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPropertyTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genStandardPropertyTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCustomPropertyTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genPropertyTabFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTabFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTabFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContributionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSharedContributionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genGroupMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCustomActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genCommandActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadResourceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initDiagramActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createShortcutActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genActionFactoryContributionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContributionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genMenuManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genToolBarManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genContextMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genLinkEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genParsersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genParserImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardPreferencePagesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rulerUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jFaceFontEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagramColorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerPriorityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkLabelAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelTextAccessMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewmapLayoutTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum standardEntryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genNavigatorReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generatedTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMFGenPackageImpl() {
		super(eNS_URI, GMFGenFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GMFGenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GMFGenPackage initGen() {
		if (isInited) return (GMFGenPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI);

		// Obtain or create and register package
		GMFGenPackageImpl theGMFGenPackage = (GMFGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GMFGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GMFGenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenModelPackage.eINSTANCE.eClass();

		// Load packages
		theGMFGenPackage.loadPackage();

		// Fix loaded packages
		theGMFGenPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFGenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GMFGenPackage.eNS_URI, theGMFGenPackage);
		return theGMFGenPackage;
	}

	// Overridden generated method to register our validator
	public static GMFGenPackage init() {
		GMFGenPackage p = initGen();
		EValidator.Registry.INSTANCE.put(p, GMFValidator.INSTANCE);
		return p;
	}

	// Overridden generated method to ensure references in our metamodel that point to GenModel objects
	// are resolved. For gmfgen.genmodel to generate code, dependency from EMF's GenModel should be stated
	// in a form of 'development' URI (i.e. platform:/plugin/). Hence, eType of our EReferences is a proxy
	// like platform:/plugin/oe.emf/GenModel.ecore#//GenClass - e.g. GenCommonBase#diagramRunTimeClass
	// Proxies are ok for regular models, but not for 'freezed' metamodels - check ETypedElementImpl#getEType
	// where proxies are resolved only if metamodel is not already frozen.
	//
	// Observed problem: GMF's annotation-based validation failed with message like "can't find ecoreClass" in
	// constraints with "diagramRunTimeClass.ecoreClass...".
	//
	// Note, one can't use EcoreUtil#resolveAll to resolve the proxies, as package's resource has no ResourceSet
	// associated and hence proxy resolution doesn't work (even if it would, platform:/plugin/ would resolve
	// to a different GenModel instance than we had previously with generated metamodel code)
	public void fixPackageContents() {
		fixPackageContentsGen();
		Map<EObject, Collection<Setting>> cr = EcoreUtil.ProxyCrossReferencer.find(this);
		for (Collection<Setting> ss : cr.values()) {
			for (Setting s : ss) {
				if (!s.getEStructuralFeature().isMany() && !s.getEStructuralFeature().isDerived() && s.getEStructuralFeature().isChangeable()) {
					EObject proxy = (EObject) s.get(false);
					if (!proxy.eIsProxy()) {
						continue;
					}
					URI proxyURI = ((InternalEObject) proxy).eProxyURI();
					boolean isGenModel = proxyURI.segmentCount() == 4;
					isGenModel = isGenModel && "org.eclipse.emf.codegen.ecore".equals(proxyURI.segment(1));
					isGenModel = isGenModel && "model".equals(proxyURI.segment(2));
					isGenModel = isGenModel && "GenModel.ecore".equals(proxyURI.segment(3));
					if (isGenModel) {
						EObject genModelObj = GenModelPackage.eINSTANCE.eResource().getEObject(proxyURI.fragment());
						if (genModelObj != null) {
							s.set(genModelObj);
						} else {
							System.out.println("GMFGenPackageImpl.fixPackageContents()");
						}
					}
				}
			}
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditorGenerator() {
		if (genEditorGeneratorEClass == null) {
			genEditorGeneratorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(0);
		}
		return genEditorGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Audits() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Metrics() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Diagram() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Plugin() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Editor() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Navigator() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_DiagramUpdater() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_PropertySheet() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_Application() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_DomainGenModel() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_PackageNamePrefix() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_ModelID() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_SameFileForDiagramAndModel() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DiagramFileExtension() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DomainFileExtension() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_DynamicTemplates() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_TemplateDirectory() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorGenerator_CopyrightText() {
        return (EAttribute)getGenEditorGenerator().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_ExpressionProviders() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_ModelAccess() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_LabelParsers() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorGenerator_ContextMenus() {
        return (EReference)getGenEditorGenerator().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDiagram() {
		if (genDiagramEClass == null) {
			genDiagramEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(1);
		}
		return genDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_EditorGen() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_DomainDiagramElement() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_ChildNodes() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_TopLevelNodes() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Links() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Compartments() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Palette() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagram_Synchronized() {
        return (EAttribute)getGenDiagram().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_Preferences() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagram_PreferencePages() {
        return (EReference)getGenDiagram().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenEditorView() {
		if (genEditorViewEClass == null) {
			genEditorViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(2);
		}
		return genEditorViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenEditorView_EditorGen() {
        return (EReference)getGenEditorView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_PackageName() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ActionBarContributorClassName() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ClassName() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_IconPath() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_IconPathX() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ID() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_EclipseEditor() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenEditorView_ContextID() {
        return (EAttribute)getGenEditorView().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPreferencePage() {
		if (genPreferencePageEClass == null) {
			genPreferencePageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(3);
		}
		return genPreferencePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPreferencePage_ID() {
        return (EAttribute)getGenPreferencePage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPreferencePage_Name() {
        return (EAttribute)getGenPreferencePage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPreferencePage_Children() {
        return (EReference)getGenPreferencePage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPreferencePage_Parent() {
        return (EReference)getGenPreferencePage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCustomPreferencePage() {
		if (genCustomPreferencePageEClass == null) {
			genCustomPreferencePageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(4);
		}
		return genCustomPreferencePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomPreferencePage_QualifiedClassName() {
        return (EAttribute)getGenCustomPreferencePage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomPreferencePage_GenerateBoilerplate() {
        return (EAttribute)getGenCustomPreferencePage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCustomPreferencePage_Preferences() {
        return (EReference)getGenCustomPreferencePage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenStandardPreferencePage() {
		if (genStandardPreferencePageEClass == null) {
			genStandardPreferencePageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(5);
		}
		return genStandardPreferencePageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenStandardPreferencePage_Kind() {
        return (EAttribute)getGenStandardPreferencePage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenStandardPreferencePage_ClassName() {
        return (EAttribute)getGenStandardPreferencePage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDiagramPreferences() {
		if (genDiagramPreferencesEClass == null) {
			genDiagramPreferencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(7);
		}
		return genDiagramPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_LineStyle() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_DefaultFont() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_FontColor() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_FillColor() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_LineColor() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_NoteFillColor() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_NoteLineColor() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_ShowConnectionHandles() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_ShowPopupBars() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_PromptOnDelFromModel() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_PromptOnDelFromDiagram() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_EnableAnimatedLayout() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_EnableAnimatedZoom() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_EnableAntiAlias() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_ShowGrid() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_ShowRulers() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_SnapToGrid() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_SnapToGeometry() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_GridInFront() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_RulerUnits() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_GridSpacing() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramPreferences_GridLineColor() {
        return (EReference)getGenDiagramPreferences().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramPreferences_GridLineStyle() {
        return (EAttribute)getGenDiagramPreferences().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFont() {
		if (genFontEClass == null) {
			genFontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(11);
		}
		return genFontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenStandardFont() {
		if (genStandardFontEClass == null) {
			genStandardFontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(12);
		}
		return genStandardFontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenStandardFont_Name() {
        return (EAttribute)getGenStandardFont().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCustomFont() {
		if (genCustomFontEClass == null) {
			genCustomFontEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(14);
		}
		return genCustomFontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomFont_Name() {
        return (EAttribute)getGenCustomFont().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomFont_Height() {
        return (EAttribute)getGenCustomFont().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomFont_Style() {
        return (EAttribute)getGenCustomFont().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenColor() {
		if (genColorEClass == null) {
			genColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(16);
		}
		return genColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRGBColor() {
		if (genRGBColorEClass == null) {
			genRGBColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(17);
		}
		return genRGBColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRGBColor_Red() {
        return (EAttribute)getGenRGBColor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRGBColor_Green() {
        return (EAttribute)getGenRGBColor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRGBColor_Blue() {
        return (EAttribute)getGenRGBColor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenConstantColor() {
		if (genConstantColorEClass == null) {
			genConstantColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(18);
		}
		return genConstantColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenConstantColor_Name() {
        return (EAttribute)getGenConstantColor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPreference() {
		if (genPreferenceEClass == null) {
			genPreferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(20);
		}
		return genPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPreference_Page() {
        return (EReference)getGenPreference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPreference_Name() {
        return (EAttribute)getGenPreference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPreference_Key() {
        return (EAttribute)getGenPreference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPreference_DefaultValue() {
        return (EAttribute)getGenPreference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchValidation() {
		if (batchValidationEClass == null) {
			batchValidationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(21);
		}
		return batchValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationProviderClassName() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationProviderPriority() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MarkerNavigationProviderClassName() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MarkerNavigationProviderPriority() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationEnabled() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MetricProviderClassName() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_MetricProviderPriority() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationDecoratorProviderClassName() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationDecorators() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_ValidationDecoratorProviderPriority() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatchValidation_LiveValidationUIFeedback() {
        return (EAttribute)getBatchValidation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProviderClassNames() {
		if (providerClassNamesEClass == null) {
			providerClassNamesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(22);
		}
		return providerClassNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ElementTypesClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_NotationViewProviderClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_NotationViewProviderPriority() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_EditPartProviderClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_EditPartProviderPriority() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ModelingAssistantProviderClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ModelingAssistantProviderPriority() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_IconProviderClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_IconProviderPriority() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ParserProviderClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ParserProviderPriority() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProviderClassNames_ContributionItemProviderClassName() {
        return (EAttribute)getProviderClassNames().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortcuts() {
		if (shortcutsEClass == null) {
			shortcutsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(24);
		}
		return shortcutsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsDecoratorProviderClassName() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsDecoratorProviderPriority() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_CreateShortcutActionClassName() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_CreateShortcutDecorationsCommandClassName() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutPropertyTesterClassName() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ContainsShortcutsTo() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortcuts_ShortcutsProvidedFor() {
        return (EAttribute)getShortcuts().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageNames() {
		if (packageNamesEClass == null) {
			packageNamesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(25);
		}
		return packageNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditCommandsPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditHelpersPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditPartsPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_EditPoliciesPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_PreferencesPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_ProvidersPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_ParsersPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageNames_NotationViewFactoriesPackageName() {
        return (EAttribute)getPackageNames().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkConstraints() {
		if (linkConstraintsEClass == null) {
			linkConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(26);
		}
		return linkConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditorCandies() {
		if (editorCandiesEClass == null) {
			editorCandiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(27);
		}
		return editorCandiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardPageClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardIconPath() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardIconPathX() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_CreationWizardCategoryID() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DiagramEditorUtilClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DocumentProviderClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_InitDiagramFileActionClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_NewDiagramFileWizardClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_DiagramContentInitializerClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_MatchingStrategyClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_VisualIDRegistryClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_ElementChooserClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_LoadResourceActionClassName() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditorCandies_EditingDomainID() {
        return (EAttribute)getEditorCandies().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditPartCandies() {
		if (editPartCandiesEClass == null) {
			editPartCandiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(28);
		}
		return editPartCandiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_ReorientConnectionViewCommandClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseEditHelperClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_EditPartFactoryClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseExternalNodeLabelEditPartClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseItemSemanticEditPolicyClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_BaseGraphicalNodeEditPolicyClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_TextSelectionEditPolicyClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditPartCandies_TextNonResizableEditPolicyClassName() {
        return (EAttribute)getEditPartCandies().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUnit() {
		if (measurementUnitEClass == null) {
			measurementUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(29);
		}
		return measurementUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementUnit_Units() {
        return (EAttribute)getMeasurementUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDiagramUpdater() {
		if (genDiagramUpdaterEClass == null) {
			genDiagramUpdaterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(30);
		}
		return genDiagramUpdaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramUpdater_EditorGen() {
        return (EReference)getGenDiagramUpdater().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramUpdater_DiagramUpdaterClassName() {
        return (EAttribute)getGenDiagramUpdater().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramUpdater_NodeDescriptorClassName() {
        return (EAttribute)getGenDiagramUpdater().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramUpdater_LinkDescriptorClassName() {
        return (EAttribute)getGenDiagramUpdater().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramUpdater_UpdateCommandClassName() {
        return (EAttribute)getGenDiagramUpdater().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDiagramUpdater_UpdateCommandID() {
        return (EAttribute)getGenDiagramUpdater().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPlugin() {
		if (genPluginEClass == null) {
			genPluginEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(31);
		}
		return genPluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPlugin_EditorGen() {
        return (EReference)getGenPlugin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_ID() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_Name() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_Provider() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_Version() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_PrintingEnabled() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_RequiredPlugins() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPlugin_ActivatorClassName() {
        return (EAttribute)getGenPlugin().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicModelAccess() {
		if (dynamicModelAccessEClass == null) {
			dynamicModelAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(32);
		}
		return dynamicModelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicModelAccess_EditorGen() {
        return (EReference)getDynamicModelAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicModelAccess_PackageName() {
        return (EAttribute)getDynamicModelAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicModelAccess_ClassName() {
        return (EAttribute)getDynamicModelAccess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		if (elementTypeEClass == null) {
			elementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(52);
		}
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementType_DiagramElement() {
        return (EReference)getElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_UniqueIdentifier() {
        return (EAttribute)getElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_DisplayName() {
        return (EAttribute)getElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_DefinedExternally() {
        return (EAttribute)getElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelType() {
		if (metamodelTypeEClass == null) {
			metamodelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(53);
		}
		return metamodelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelType_EditHelperClassName() {
        return (EAttribute)getMetamodelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecializationType() {
		if (specializationTypeEClass == null) {
			specializationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(54);
		}
		return specializationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecializationType_MetamodelType() {
        return (EReference)getSpecializationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecializationType_EditHelperAdviceClassName() {
        return (EAttribute)getSpecializationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotationType() {
		if (notationTypeEClass == null) {
			notationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(55);
		}
		return notationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCommonBase() {
		if (genCommonBaseEClass == null) {
			genCommonBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(33);
		}
		return genCommonBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_DiagramRunTimeClass() {
        return (EReference)getGenCommonBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_VisualID() {
        return (EAttribute)getGenCommonBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_ElementType() {
        return (EReference)getGenCommonBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_EditPartClassName() {
        return (EAttribute)getGenCommonBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_ItemSemanticEditPolicyClassName() {
        return (EAttribute)getGenCommonBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_NotationViewFactoryClassName() {
        return (EAttribute)getGenCommonBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_Viewmap() {
        return (EReference)getGenCommonBase().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_Styles() {
        return (EReference)getGenCommonBase().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCommonBase_Behaviour() {
        return (EReference)getGenCommonBase().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommonBase_SansDomain() {
        return (EAttribute)getGenCommonBase().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviour() {
		if (behaviourEClass == null) {
			behaviourEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(34);
		}
		return behaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviour_Subject() {
        return (EReference)getBehaviour().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomBehaviour() {
		if (customBehaviourEClass == null) {
			customBehaviourEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(35);
		}
		return customBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomBehaviour_Key() {
        return (EAttribute)getCustomBehaviour().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomBehaviour_EditPolicyQualifiedClassName() {
        return (EAttribute)getCustomBehaviour().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedBehaviour() {
		if (sharedBehaviourEClass == null) {
			sharedBehaviourEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(36);
		}
		return sharedBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedBehaviour_Delegate() {
        return (EReference)getSharedBehaviour().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDiagramBehaviour() {
		if (openDiagramBehaviourEClass == null) {
			openDiagramBehaviourEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(37);
		}
		return openDiagramBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDiagramBehaviour_EditPolicyClassName() {
        return (EAttribute)getOpenDiagramBehaviour().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDiagramBehaviour_DiagramKind() {
        return (EAttribute)getOpenDiagramBehaviour().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDiagramBehaviour_EditorID() {
        return (EAttribute)getOpenDiagramBehaviour().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDiagramBehaviour_OpenAsEclipseEditor() {
        return (EAttribute)getOpenDiagramBehaviour().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContainerBase() {
		if (genContainerBaseEClass == null) {
			genContainerBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(38);
		}
		return genContainerBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContainerBase_ContainedNodes() {
        return (EReference)getGenContainerBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenContainerBase_CanonicalEditPolicyClassName() {
        return (EAttribute)getGenContainerBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNode() {
		if (genNodeEClass == null) {
			genNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(40);
		}
		return genNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_Labels() {
        return (EReference)getGenNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_Compartments() {
        return (EReference)getGenNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_PrimaryDragEditPolicyQualifiedClassName() {
        return (EAttribute)getGenNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_GraphicalNodeEditPolicyClassName() {
        return (EAttribute)getGenNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNode_CreateCommandClassName() {
        return (EAttribute)getGenNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_ReorientedIncomingLinks() {
        return (EReference)getGenNode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenTopLevelNode() {
		if (genTopLevelNodeEClass == null) {
			genTopLevelNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(41);
		}
		return genTopLevelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenTopLevelNode_Diagram() {
        return (EReference)getGenTopLevelNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildNode() {
		if (genChildNodeEClass == null) {
			genChildNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(42);
		}
		return genChildNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildNode_Diagram() {
        return (EReference)getGenChildNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildNode_Containers() {
        return (EReference)getGenChildNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildSideAffixedNode() {
		if (genChildSideAffixedNodeEClass == null) {
			genChildSideAffixedNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(43);
		}
		return genChildSideAffixedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildSideAffixedNode_PreferredSideName() {
        return (EAttribute)getGenChildSideAffixedNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildLabelNode() {
		if (genChildLabelNodeEClass == null) {
			genChildLabelNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(44);
		}
		return genChildLabelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildLabelNode_LabelReadOnly() {
        return (EAttribute)getGenChildLabelNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenChildLabelNode_LabelElementIcon() {
        return (EAttribute)getGenChildLabelNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildLabelNode_LabelModelFacet() {
        return (EReference)getGenChildLabelNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCompartment() {
		if (genCompartmentEClass == null) {
			genCompartmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(45);
		}
		return genCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_Title() {
        return (EAttribute)getGenCompartment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_CanCollapse() {
        return (EAttribute)getGenCompartment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_HideIfEmpty() {
        return (EAttribute)getGenCompartment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_NeedsTitle() {
        return (EAttribute)getGenCompartment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCompartment_Diagram() {
        return (EReference)getGenCompartment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCompartment_Node() {
        return (EReference)getGenCompartment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCompartment_ListLayout() {
        return (EAttribute)getGenCompartment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNode_ModelFacet() {
        return (EReference)getGenNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenChildContainer() {
		if (genChildContainerEClass == null) {
			genChildContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(39);
		}
		return genChildContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenChildContainer_ChildNodes() {
        return (EReference)getGenChildContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLink() {
		if (genLinkEClass == null) {
			genLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(46);
		}
		return genLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_Diagram() {
        return (EReference)getGenLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_ModelFacet() {
        return (EReference)getGenLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_Labels() {
        return (EReference)getGenLink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_OutgoingCreationAllowed() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_IncomingCreationAllowed() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_ViewDirectionAlignedWithModel() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_CreationConstraints() {
        return (EReference)getGenLink().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_TargetReorientingAllowed() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_SourceReorientingAllowed() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_CreateCommandClassName() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_ReorientCommandClassName() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLink_TreeBranch() {
        return (EAttribute)getGenLink().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_Sources() {
        return (EReference)getGenLink().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLink_Targets() {
        return (EReference)getGenLink().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLabel() {
		if (genLabelEClass == null) {
			genLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(47);
		}
		return genLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLabel_ReadOnly() {
        return (EAttribute)getGenLabel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLabel_ElementIcon() {
        return (EAttribute)getGenLabel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLabel_ModelFacet() {
        return (EReference)getGenLabel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNodeLabel() {
		if (genNodeLabelEClass == null) {
			genNodeLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(48);
		}
		return genNodeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNodeLabel_Node() {
        return (EReference)getGenNodeLabel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExternalNodeLabel() {
		if (genExternalNodeLabelEClass == null) {
			genExternalNodeLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(49);
		}
		return genExternalNodeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkLabel() {
		if (genLinkLabelEClass == null) {
			genLinkLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(50);
		}
		return genLinkLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkLabel_Link() {
        return (EReference)getGenLinkLabel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenLinkLabel_Alignment() {
        return (EAttribute)getGenLinkLabel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFacet() {
		if (modelFacetEClass == null) {
			modelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(56);
		}
		return modelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkModelFacet() {
		if (linkModelFacetEClass == null) {
			linkModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(57);
		}
		return linkModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelModelFacet() {
		if (labelModelFacetEClass == null) {
			labelModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(58);
		}
		return labelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelModelFacet_Parser() {
        return (EReference)getLabelModelFacet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeModelFacet() {
		if (typeModelFacetEClass == null) {
			typeModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(59);
		}
		return typeModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_MetaClass() {
        return (EReference)getTypeModelFacet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ContainmentMetaFeature() {
        return (EReference)getTypeModelFacet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ChildMetaFeature() {
        return (EReference)getTypeModelFacet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ModelElementSelector() {
        return (EReference)getTypeModelFacet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeModelFacet_ModelElementInitializer() {
        return (EReference)getTypeModelFacet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureLabelModelFacet() {
		if (featureLabelModelFacetEClass == null) {
			featureLabelModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(62);
		}
		return featureLabelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureLabelModelFacet_MetaFeatures() {
        return (EReference)getFeatureLabelModelFacet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureLabelModelFacet_EditableMetaFeatures() {
        return (EReference)getFeatureLabelModelFacet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_ViewPattern() {
        return (EAttribute)getFeatureLabelModelFacet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_EditorPattern() {
        return (EAttribute)getFeatureLabelModelFacet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_ViewMethod() {
        return (EAttribute)getFeatureLabelModelFacet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_EditPattern() {
        return (EAttribute)getFeatureLabelModelFacet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureLabelModelFacet_EditMethod() {
        return (EAttribute)getFeatureLabelModelFacet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignLabelModelFacet() {
		if (designLabelModelFacetEClass == null) {
			designLabelModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(64);
		}
		return designLabelModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLinkModelFacet() {
		if (typeLinkModelFacetEClass == null) {
			typeLinkModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(60);
		}
		return typeLinkModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLinkModelFacet_SourceMetaFeature() {
        return (EReference)getTypeLinkModelFacet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLinkModelFacet_TargetMetaFeature() {
        return (EReference)getTypeLinkModelFacet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureLinkModelFacet() {
		if (featureLinkModelFacetEClass == null) {
			featureLinkModelFacetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(61);
		}
		return featureLinkModelFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureLinkModelFacet_MetaFeature() {
        return (EReference)getFeatureLinkModelFacet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewmap() {
		if (viewmapEClass == null) {
			viewmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(71);
		}
		return viewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewmap_Attributes() {
        return (EReference)getViewmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewmap_RequiredPluginIDs() {
        return (EAttribute)getViewmap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewmap_LayoutType() {
        return (EAttribute)getViewmap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		if (attributesEClass == null) {
			attributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(65);
		}
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorAttributes() {
		if (colorAttributesEClass == null) {
			colorAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(66);
		}
		return colorAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorAttributes_ForegroundColor() {
        return (EAttribute)getColorAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorAttributes_BackgroundColor() {
        return (EAttribute)getColorAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleAttributes() {
		if (styleAttributesEClass == null) {
			styleAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(67);
		}
		return styleAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAttributes_FixedFont() {
        return (EAttribute)getStyleAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAttributes_FixedForeground() {
        return (EAttribute)getStyleAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleAttributes_FixedBackground() {
        return (EAttribute)getStyleAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResizeConstraints() {
		if (resizeConstraintsEClass == null) {
			resizeConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(68);
		}
		return resizeConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizeConstraints_ResizeHandles() {
        return (EAttribute)getResizeConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizeConstraints_NonResizeHandles() {
        return (EAttribute)getResizeConstraints().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizeConstraints_ResizeHandleNames() {
        return (EAttribute)getResizeConstraints().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResizeConstraints_NonResizeHandleNames() {
        return (EAttribute)getResizeConstraints().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultSizeAttributes() {
		if (defaultSizeAttributesEClass == null) {
			defaultSizeAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(69);
		}
		return defaultSizeAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultSizeAttributes_Width() {
        return (EAttribute)getDefaultSizeAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultSizeAttributes_Height() {
        return (EAttribute)getDefaultSizeAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelOffsetAttributes() {
		if (labelOffsetAttributesEClass == null) {
			labelOffsetAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(70);
		}
		return labelOffsetAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelOffsetAttributes_X() {
        return (EAttribute)getLabelOffsetAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelOffsetAttributes_Y() {
        return (EAttribute)getLabelOffsetAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureViewmap() {
		if (figureViewmapEClass == null) {
			figureViewmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(73);
		}
		return figureViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureViewmap_FigureQualifiedClassName() {
        return (EAttribute)getFigureViewmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnippetViewmap() {
		if (snippetViewmapEClass == null) {
			snippetViewmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(74);
		}
		return snippetViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippetViewmap_Body() {
        return (EAttribute)getSnippetViewmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInnerClassViewmap() {
		if (innerClassViewmapEClass == null) {
			innerClassViewmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(75);
		}
		return innerClassViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerClassViewmap_ClassName() {
        return (EAttribute)getInnerClassViewmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInnerClassViewmap_ClassBody() {
        return (EAttribute)getInnerClassViewmap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentAssignedViewmap() {
		if (parentAssignedViewmapEClass == null) {
			parentAssignedViewmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(76);
		}
		return parentAssignedViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAssignedViewmap_GetterName() {
        return (EAttribute)getParentAssignedViewmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAssignedViewmap_SetterName() {
        return (EAttribute)getParentAssignedViewmap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentAssignedViewmap_FigureQualifiedClassName() {
        return (EAttribute)getParentAssignedViewmap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeledViewmap() {
		if (modeledViewmapEClass == null) {
			modeledViewmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(77);
		}
		return modeledViewmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeledViewmap_FigureModel() {
        return (EReference)getModeledViewmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		if (valueExpressionEClass == null) {
			valueExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(78);
		}
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpression_Body() {
        return (EAttribute)getValueExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpression_LangName() {
        return (EAttribute)getValueExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueExpression_Provider() {
        return (EReference)getValueExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenConstraint() {
		if (genConstraintEClass == null) {
			genConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(79);
		}
		return genConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPalette() {
		if (paletteEClass == null) {
			paletteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(80);
		}
		return paletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Diagram() {
        return (EReference)getPalette().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_Flyout() {
        return (EAttribute)getPalette().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPalette_Groups() {
        return (EReference)getPalette().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_PackageName() {
        return (EAttribute)getPalette().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPalette_FactoryClassName() {
        return (EAttribute)getPalette().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryBase() {
		if (entryBaseEClass == null) {
			entryBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(81);
		}
		return entryBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_Title() {
        return (EAttribute)getEntryBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_Description() {
        return (EAttribute)getEntryBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_LargeIconPath() {
        return (EAttribute)getEntryBase().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_SmallIconPath() {
        return (EAttribute)getEntryBase().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_CreateMethodName() {
        return (EAttribute)getEntryBase().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryBase_Id() {
        return (EAttribute)getEntryBase().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractToolEntry() {
		if (abstractToolEntryEClass == null) {
			abstractToolEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(82);
		}
		return abstractToolEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractToolEntry_Default() {
        return (EAttribute)getAbstractToolEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractToolEntry_QualifiedToolName() {
        return (EAttribute)getAbstractToolEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractToolEntry_Properties() {
        return (EReference)getAbstractToolEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolEntry() {
		if (toolEntryEClass == null) {
			toolEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(83);
		}
		return toolEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_GenNodes() {
        return (EReference)getToolEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_GenLinks() {
        return (EReference)getToolEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolEntry_Elements() {
        return (EReference)getToolEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardEntry() {
		if (standardEntryEClass == null) {
			standardEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(84);
		}
		return standardEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardEntry_Kind() {
        return (EAttribute)getStandardEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolGroupItem() {
		if (toolGroupItemEClass == null) {
			toolGroupItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(86);
		}
		return toolGroupItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroupItem_Group() {
        return (EReference)getToolGroupItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparator() {
		if (separatorEClass == null) {
			separatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(87);
		}
		return separatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToolGroup() {
		if (toolGroupEClass == null) {
			toolGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(88);
		}
		return toolGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroup_Palette() {
        return (EReference)getToolGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_Stack() {
        return (EAttribute)getToolGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_Collapse() {
        return (EAttribute)getToolGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToolGroup_Entries() {
        return (EReference)getToolGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToolGroup_ToolsOnly() {
        return (EAttribute)getToolGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenElementInitializer() {
		if (genElementInitializerEClass == null) {
			genElementInitializerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(89);
		}
		return genElementInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenElementInitializer_TypeModelFacet() {
        return (EReference)getGenElementInitializer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureSeqInitializer() {
		if (genFeatureSeqInitializerEClass == null) {
			genFeatureSeqInitializerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(90);
		}
		return genFeatureSeqInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureSeqInitializer_Initializers() {
        return (EReference)getGenFeatureSeqInitializer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureSeqInitializer_ElementClass() {
        return (EReference)getGenFeatureSeqInitializer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureSeqInitializer_CreatingInitializer() {
        return (EReference)getGenFeatureSeqInitializer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureValueSpec() {
		if (genFeatureValueSpecEClass == null) {
			genFeatureValueSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(91);
		}
		return genFeatureValueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureValueSpec_Value() {
        return (EReference)getGenFeatureValueSpec().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenReferenceNewElementSpec() {
		if (genReferenceNewElementSpecEClass == null) {
			genReferenceNewElementSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(92);
		}
		return genReferenceNewElementSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenReferenceNewElementSpec_NewElementInitializers() {
        return (EReference)getGenReferenceNewElementSpec().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenFeatureInitializer() {
		if (genFeatureInitializerEClass == null) {
			genFeatureInitializerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(93);
		}
		return genFeatureInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureInitializer_Feature() {
        return (EReference)getGenFeatureInitializer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenFeatureInitializer_FeatureSeqInitializer() {
        return (EReference)getGenFeatureInitializer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkConstraints() {
		if (genLinkConstraintsEClass == null) {
			genLinkConstraintsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(94);
		}
		return genLinkConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkConstraints_Link() {
        return (EReference)getGenLinkConstraints().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkConstraints_SourceEnd() {
        return (EReference)getGenLinkConstraints().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkConstraints_TargetEnd() {
        return (EReference)getGenLinkConstraints().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditRoot() {
		if (genAuditRootEClass == null) {
			genAuditRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(95);
		}
		return genAuditRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRoot_EditorGen() {
        return (EReference)getGenAuditRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRoot_Categories() {
        return (EReference)getGenAuditRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRoot_Rules() {
        return (EReference)getGenAuditRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRoot_ClientContexts() {
        return (EReference)getGenAuditRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditContainer() {
		if (genAuditContainerEClass == null) {
			genAuditContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(96);
		}
		return genAuditContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContainer_Root() {
        return (EReference)getGenAuditContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRuleBase() {
		if (genRuleBaseEClass == null) {
			genRuleBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(97);
		}
		return genRuleBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRuleBase_Name() {
        return (EAttribute)getGenRuleBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenRuleBase_Description() {
        return (EAttribute)getGenRuleBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContainer_Id() {
        return (EAttribute)getGenAuditContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContainer_Name() {
        return (EAttribute)getGenAuditContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContainer_Description() {
        return (EAttribute)getGenAuditContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContainer_Path() {
        return (EReference)getGenAuditContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContainer_Audits() {
        return (EReference)getGenAuditContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditRule() {
		if (genAuditRuleEClass == null) {
			genAuditRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(98);
		}
		return genAuditRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Root() {
        return (EReference)getGenAuditRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Id() {
        return (EAttribute)getGenAuditRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Rule() {
        return (EReference)getGenAuditRule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Target() {
        return (EReference)getGenAuditRule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Message() {
        return (EAttribute)getGenAuditRule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_Severity() {
        return (EAttribute)getGenAuditRule().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_UseInLiveMode() {
        return (EAttribute)getGenAuditRule().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditRule_RequiresConstraintAdapter() {
        return (EAttribute)getGenAuditRule().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditRule_Category() {
        return (EReference)getGenAuditRule().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenRuleTarget() {
		if (genRuleTargetEClass == null) {
			genRuleTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(100);
		}
		return genRuleTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDomainElementTarget() {
		if (genDomainElementTargetEClass == null) {
			genDomainElementTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(101);
		}
		return genDomainElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDomainElementTarget_Element() {
        return (EReference)getGenDomainElementTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDiagramElementTarget() {
		if (genDiagramElementTargetEClass == null) {
			genDiagramElementTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(102);
		}
		return genDiagramElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDiagramElementTarget_Element() {
        return (EReference)getGenDiagramElementTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDomainAttributeTarget() {
		if (genDomainAttributeTargetEClass == null) {
			genDomainAttributeTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(103);
		}
		return genDomainAttributeTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenDomainAttributeTarget_Attribute() {
        return (EReference)getGenDomainAttributeTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainAttributeTarget_NullAsError() {
        return (EAttribute)getGenDomainAttributeTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNotationElementTarget() {
		if (genNotationElementTargetEClass == null) {
			genNotationElementTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(104);
		}
		return genNotationElementTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNotationElementTarget_Element() {
        return (EReference)getGenNotationElementTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMetricContainer() {
		if (genMetricContainerEClass == null) {
			genMetricContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(105);
		}
		return genMetricContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricContainer_EditorGen() {
        return (EReference)getGenMetricContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricContainer_Metrics() {
        return (EReference)getGenMetricContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMetricRule() {
		if (genMetricRuleEClass == null) {
			genMetricRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(106);
		}
		return genMetricRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMetricRule_Key() {
        return (EAttribute)getGenMetricRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricRule_Rule() {
        return (EReference)getGenMetricRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricRule_Target() {
        return (EReference)getGenMetricRule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenMetricRule_Container() {
        return (EReference)getGenMetricRule().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMetricRule_LowLimit() {
        return (EAttribute)getGenMetricRule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMetricRule_HighLimit() {
        return (EAttribute)getGenMetricRule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditedMetricTarget() {
		if (genAuditedMetricTargetEClass == null) {
			genAuditedMetricTargetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(107);
		}
		return genAuditedMetricTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditedMetricTarget_Metric() {
        return (EReference)getGenAuditedMetricTarget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditedMetricTarget_MetricValueContext() {
        return (EReference)getGenAuditedMetricTarget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditable() {
		if (genAuditableEClass == null) {
			genAuditableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(108);
		}
		return genAuditableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditable_ContextSelector() {
        return (EReference)getGenAuditable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAuditContext() {
		if (genAuditContextEClass == null) {
			genAuditContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(109);
		}
		return genAuditContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContext_Root() {
        return (EReference)getGenAuditContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContext_Id() {
        return (EAttribute)getGenAuditContext().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAuditContext_ClassName() {
        return (EAttribute)getGenAuditContext().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenAuditContext_RuleTargets() {
        return (EReference)getGenAuditContext().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMeasurable() {
		if (genMeasurableEClass == null) {
			genMeasurableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(110);
		}
		return genMeasurableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpressionProviderContainer() {
		if (genExpressionProviderContainerEClass == null) {
			genExpressionProviderContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(111);
		}
		return genExpressionProviderContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionProviderContainer_ExpressionsPackageName() {
        return (EAttribute)getGenExpressionProviderContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionProviderContainer_AbstractExpressionClassName() {
        return (EAttribute)getGenExpressionProviderContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderContainer_Providers() {
        return (EReference)getGenExpressionProviderContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderContainer_EditorGen() {
        return (EReference)getGenExpressionProviderContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpressionProviderBase() {
		if (genExpressionProviderBaseEClass == null) {
			genExpressionProviderBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(112);
		}
		return genExpressionProviderBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderBase_Expressions() {
        return (EReference)getGenExpressionProviderBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenExpressionProviderBase_Container() {
        return (EReference)getGenExpressionProviderBase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenJavaExpressionProvider() {
		if (genJavaExpressionProviderEClass == null) {
			genJavaExpressionProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(113);
		}
		return genJavaExpressionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJavaExpressionProvider_ThrowException() {
        return (EAttribute)getGenJavaExpressionProvider().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenJavaExpressionProvider_InjectExpressionBody() {
        return (EAttribute)getGenJavaExpressionProvider().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenExpressionInterpreter() {
		if (genExpressionInterpreterEClass == null) {
			genExpressionInterpreterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(114);
		}
		return genExpressionInterpreterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionInterpreter_Language() {
        return (EAttribute)getGenExpressionInterpreter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenExpressionInterpreter_ClassName() {
        return (EAttribute)getGenExpressionInterpreter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLiteralExpressionProvider() {
		if (genLiteralExpressionProviderEClass == null) {
			genLiteralExpressionProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(115);
		}
		return genLiteralExpressionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenDomainModelNavigator() {
		if (genDomainModelNavigatorEClass == null) {
			genDomainModelNavigatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(117);
		}
		return genDomainModelNavigatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_GenerateDomainModelNavigator() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainContentExtensionID() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainContentExtensionName() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainContentExtensionPriority() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainContentProviderClassName() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainLabelProviderClassName() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainModelElementTesterClassName() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenDomainModelNavigator_DomainNavigatorItemClassName() {
        return (EAttribute)getGenDomainModelNavigator().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNavigator() {
		if (genNavigatorEClass == null) {
			genNavigatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(118);
		}
		return genNavigatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigator_EditorGen() {
        return (EReference)getGenNavigator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_ContentExtensionID() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_ContentExtensionName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_ContentExtensionPriority() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_LinkHelperExtensionID() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_SorterExtensionID() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_ActionProviderID() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_ContentProviderClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_LabelProviderClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_LinkHelperClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_SorterClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_ActionProviderClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_AbstractNavigatorItemClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_NavigatorGroupClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_NavigatorItemClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_UriInputTesterClassName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigator_PackageName() {
        return (EAttribute)getGenNavigator().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigator_ChildReferences() {
        return (EReference)getGenNavigator().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNavigatorChildReference() {
		if (genNavigatorChildReferenceEClass == null) {
			genNavigatorChildReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(120);
		}
		return genNavigatorChildReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorChildReference_Navigator() {
        return (EReference)getGenNavigatorChildReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorChildReference_Parent() {
        return (EReference)getGenNavigatorChildReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorChildReference_Child() {
        return (EReference)getGenNavigatorChildReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigatorChildReference_ReferenceType() {
        return (EAttribute)getGenNavigatorChildReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigatorChildReference_GroupName() {
        return (EAttribute)getGenNavigatorChildReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigatorChildReference_GroupIcon() {
        return (EAttribute)getGenNavigatorChildReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenNavigatorChildReference_HideIfEmpty() {
        return (EAttribute)getGenNavigatorChildReference().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNavigatorPath() {
		if (genNavigatorPathEClass == null) {
			genNavigatorPathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(121);
		}
		return genNavigatorPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorPath_Segments() {
        return (EReference)getGenNavigatorPath().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenNavigatorPathSegment() {
		if (genNavigatorPathSegmentEClass == null) {
			genNavigatorPathSegmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(122);
		}
		return genNavigatorPathSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorPathSegment_Path() {
        return (EReference)getGenNavigatorPathSegment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorPathSegment_From() {
        return (EReference)getGenNavigatorPathSegment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenNavigatorPathSegment_To() {
        return (EReference)getGenNavigatorPathSegment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPropertySheet() {
		if (genPropertySheetEClass == null) {
			genPropertySheetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(123);
		}
		return genPropertySheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPropertySheet_EditorGen() {
        return (EReference)getGenPropertySheet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPropertySheet_Tabs() {
        return (EReference)getGenPropertySheet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPropertySheet_PackageName() {
        return (EAttribute)getGenPropertySheet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPropertySheet_ReadOnly() {
        return (EAttribute)getGenPropertySheet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPropertySheet_NeedsCaption() {
        return (EAttribute)getGenPropertySheet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPropertySheet_LabelProviderClassName() {
        return (EAttribute)getGenPropertySheet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPropertyTab() {
		if (genPropertyTabEClass == null) {
			genPropertyTabEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(124);
		}
		return genPropertyTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPropertyTab_Sheet() {
        return (EReference)getGenPropertyTab().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPropertyTab_ID() {
        return (EAttribute)getGenPropertyTab().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenPropertyTab_Label() {
        return (EAttribute)getGenPropertyTab().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenStandardPropertyTab() {
		if (genStandardPropertyTabEClass == null) {
			genStandardPropertyTabEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(125);
		}
		return genStandardPropertyTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCustomPropertyTab() {
		if (genCustomPropertyTabEClass == null) {
			genCustomPropertyTabEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(126);
		}
		return genCustomPropertyTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomPropertyTab_ClassName() {
        return (EAttribute)getGenCustomPropertyTab().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenCustomPropertyTab_Filter() {
        return (EReference)getGenCustomPropertyTab().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomPropertyTab_GenerateBoilerplate() {
        return (EAttribute)getGenCustomPropertyTab().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenPropertyTabFilter() {
		if (genPropertyTabFilterEClass == null) {
			genPropertyTabFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(127);
		}
		return genPropertyTabFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenPropertyTabFilter_Tab() {
        return (EReference)getGenPropertyTabFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeTabFilter() {
		if (typeTabFilterEClass == null) {
			typeTabFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(128);
		}
		return typeTabFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeTabFilter_Types() {
        return (EAttribute)getTypeTabFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeTabFilter_GeneratedTypes() {
        return (EAttribute)getTypeTabFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTabFilter() {
		if (customTabFilterEClass == null) {
			customTabFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(130);
		}
		return customTabFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTabFilter_ClassName() {
        return (EAttribute)getCustomTabFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContributionItem() {
		if (genContributionItemEClass == null) {
			genContributionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(131);
		}
		return genContributionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContributionItem_Owner() {
        return (EReference)getGenContributionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSharedContributionItem() {
		if (genSharedContributionItemEClass == null) {
			genSharedContributionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(132);
		}
		return genSharedContributionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenSharedContributionItem_ActualItem() {
        return (EReference)getGenSharedContributionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenGroupMarker() {
		if (genGroupMarkerEClass == null) {
			genGroupMarkerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(133);
		}
		return genGroupMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGroupMarker_GroupName() {
        return (EAttribute)getGenGroupMarker().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenSeparator() {
		if (genSeparatorEClass == null) {
			genSeparatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(134);
		}
		return genSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenSeparator_GroupName() {
        return (EAttribute)getGenSeparator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCustomAction() {
		if (genCustomActionEClass == null) {
			genCustomActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(135);
		}
		return genCustomActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomAction_QualifiedClassName() {
        return (EAttribute)getGenCustomAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomAction_GenerateBoilerplate() {
        return (EAttribute)getGenCustomAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCustomAction_Name() {
        return (EAttribute)getGenCustomAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenCommandAction() {
		if (genCommandActionEClass == null) {
			genCommandActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(136);
		}
		return genCommandActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommandAction_CommandIdentifier() {
        return (EAttribute)getGenCommandAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenCommandAction_Name() {
        return (EAttribute)getGenCommandAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenAction() {
		if (genActionEClass == null) {
			genActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(137);
		}
		return genActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAction_QualifiedClassName() {
        return (EAttribute)getGenAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenAction_Name() {
        return (EAttribute)getGenAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadResourceAction() {
		if (loadResourceActionEClass == null) {
			loadResourceActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(138);
		}
		return loadResourceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitDiagramAction() {
		if (initDiagramActionEClass == null) {
			initDiagramActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(139);
		}
		return initDiagramActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateShortcutAction() {
		if (createShortcutActionEClass == null) {
			createShortcutActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(140);
		}
		return createShortcutActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenActionFactoryContributionItem() {
		if (genActionFactoryContributionItemEClass == null) {
			genActionFactoryContributionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(141);
		}
		return genActionFactoryContributionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenActionFactoryContributionItem_Name() {
        return (EAttribute)getGenActionFactoryContributionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContributionManager() {
		if (genContributionManagerEClass == null) {
			genContributionManagerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(142);
		}
		return genContributionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenContributionManager_ID() {
        return (EAttribute)getGenContributionManager().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContributionManager_Items() {
        return (EReference)getGenContributionManager().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContributionManager_EditorGen() {
        return (EReference)getGenContributionManager().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenMenuManager() {
		if (genMenuManagerEClass == null) {
			genMenuManagerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(143);
		}
		return genMenuManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenMenuManager_Name() {
        return (EAttribute)getGenMenuManager().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenToolBarManager() {
		if (genToolBarManagerEClass == null) {
			genToolBarManagerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(144);
		}
		return genToolBarManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenContextMenu() {
		if (genContextMenuEClass == null) {
			genContextMenuEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(145);
		}
		return genContextMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenContextMenu_Context() {
        return (EReference)getGenContextMenu().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenApplication() {
		if (genApplicationEClass == null) {
			genApplicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(146);
		}
		return genApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenApplication_EditorGen() {
        return (EReference)getGenApplication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_ID() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_Title() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_PackageName() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_ClassName() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_WorkbenchAdvisorClassName() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_WorkbenchWindowAdvisorClassName() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_ActionBarAdvisorClassName() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_PerspectiveClassName() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_PerspectiveId() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenApplication_SupportFiles() {
        return (EAttribute)getGenApplication().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenApplication_SharedContributionItems() {
        return (EReference)getGenApplication().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenApplication_MainMenu() {
        return (EReference)getGenApplication().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenApplication_MainToolBar() {
        return (EReference)getGenApplication().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenLinkEnd() {
		if (genLinkEndEClass == null) {
			genLinkEndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(147);
		}
		return genLinkEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkEnd_GenOutgoingLinks() {
        return (EReference)getGenLinkEnd().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenLinkEnd_GenIncomingLinks() {
        return (EReference)getGenLinkEnd().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenParsers() {
		if (genParsersEClass == null) {
			genParsersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(148);
		}
		return genParsersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenParsers_EditorGen() {
        return (EReference)getGenParsers().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenParsers_PackageName() {
        return (EAttribute)getGenParsers().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenParsers_ClassName() {
        return (EAttribute)getGenParsers().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenParsers_ExtensibleViaService() {
        return (EAttribute)getGenParsers().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenParsers_ProviderPriority() {
        return (EAttribute)getGenParsers().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenParsers_Implementations() {
        return (EReference)getGenParsers().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenParsers_ImplPackageName() {
        return (EAttribute)getGenParsers().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenParserImplementation() {
		if (genParserImplementationEClass == null) {
			genParserImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(149);
		}
		return genParserImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenParserImplementation_Holder() {
        return (EReference)getGenParserImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenParserImplementation_Uses() {
        return (EReference)getGenParserImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedParser() {
		if (predefinedParserEClass == null) {
			predefinedParserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(150);
		}
		return predefinedParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedParser_ViewMethod() {
        return (EAttribute)getPredefinedParser().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedParser_EditMethod() {
        return (EAttribute)getPredefinedParser().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefinedParser_ClassName() {
        return (EAttribute)getPredefinedParser().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomParser() {
		if (customParserEClass == null) {
			customParserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(151);
		}
		return customParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomParser_QualifiedName() {
        return (EAttribute)getCustomParser().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomParser_GenerateBoilerplate() {
        return (EAttribute)getCustomParser().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalParser() {
		if (externalParserEClass == null) {
			externalParserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(152);
		}
		return externalParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalParser_Hint() {
        return (EAttribute)getExternalParser().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardPreferencePages() {
		if (standardPreferencePagesEEnum == null) {
			standardPreferencePagesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(6);
		}
		return standardPreferencePagesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRulerUnits() {
		if (rulerUnitsEEnum == null) {
			rulerUnitsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(8);
		}
		return rulerUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouting() {
		if (routingEEnum == null) {
			routingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(9);
		}
		return routingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineStyle() {
		if (lineStyleEEnum == null) {
			lineStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(10);
		}
		return lineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJFaceFont() {
		if (jFaceFontEEnum == null) {
			jFaceFontEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(13);
		}
		return jFaceFontEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		if (fontStyleEEnum == null) {
			fontStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(15);
		}
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagramColors() {
		if (diagramColorsEEnum == null) {
			diagramColorsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(19);
		}
		return diagramColorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderPriority() {
		if (providerPriorityEEnum == null) {
			providerPriorityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(23);
		}
		return providerPriorityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkLabelAlignment() {
		if (linkLabelAlignmentEEnum == null) {
			linkLabelAlignmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(51);
		}
		return linkLabelAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelTextAccessMethod() {
		if (labelTextAccessMethodEEnum == null) {
			labelTextAccessMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(63);
		}
		return labelTextAccessMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViewmapLayoutType() {
		if (viewmapLayoutTypeEEnum == null) {
			viewmapLayoutTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(72);
		}
		return viewmapLayoutTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStandardEntryKind() {
		if (standardEntryKindEEnum == null) {
			standardEntryKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(85);
		}
		return standardEntryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenSeverity() {
		if (genSeverityEEnum == null) {
			genSeverityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(99);
		}
		return genSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenLanguage() {
		if (genLanguageEEnum == null) {
			genLanguageEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(116);
		}
		return genLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenNavigatorReferenceType() {
		if (genNavigatorReferenceTypeEEnum == null) {
			genNavigatorReferenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(119);
		}
		return genNavigatorReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneratedType() {
		if (generatedTypeEEnum == null) {
			generatedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI).getEClassifiers().get(129);
		}
		return generatedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenFactory getGMFGenFactory() {
		return (GMFGenFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContentsGen() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.gmf.codegen.gmfgen." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GMFGenPackageImpl