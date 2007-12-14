/*
 * Copyright (c) 2005, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Artem Tikhomirov (Borland) - initial API and implementation
 */
package org.eclipse.gmf.tests.gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.codegen.gmfgen.DefaultSizeAttributes;
import org.eclipse.gmf.codegen.gmfgen.FigureViewmap;
import org.eclipse.gmf.codegen.gmfgen.InnerClassViewmap;
import org.eclipse.gmf.codegen.gmfgen.ParentAssignedViewmap;
import org.eclipse.gmf.codegen.gmfgen.ResizeConstraints;
import org.eclipse.gmf.codegen.gmfgen.StyleAttributes;
import org.eclipse.gmf.codegen.gmfgen.Viewmap;
import org.eclipse.gmf.codegen.gmfgen.ViewmapLayoutType;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.ColorConstants;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.ConnectionFigure;
import org.eclipse.gmf.gmfgraph.ConstantColor;
import org.eclipse.gmf.gmfgraph.CustomConnection;
import org.eclipse.gmf.gmfgraph.CustomFigure;
import org.eclipse.gmf.gmfgraph.DefaultSizeFacet;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.Direction;
import org.eclipse.gmf.gmfgraph.Ellipse;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureAccessor;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Layout;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;
import org.eclipse.gmf.internal.bridge.genmodel.InnerClassViewmapProducer;
import org.eclipse.gmf.internal.bridge.genmodel.ViewmapProducer;
import org.eclipse.gmf.tests.setup.DiaDefSetup;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * @author artem
 *
 */
public class ViewmapProducersTest extends TestCase {
	private ViewmapProducer myProducer;

	public ViewmapProducersTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		myProducer = new InnerClassViewmapProducer();
	}

	public void testInnerViewmapProducerBareFigure() {
		final Ellipse ellipseFig = GMFGraphFactory.eINSTANCE.createEllipse();
		ellipseFig.setName("elli");
		Node n = createNode("n1", ellipseFig);
		Viewmap v = getProducer().create(n);
		assertNotNull(v);
		assertTrue(v.getClass().getName(), v instanceof FigureViewmap);
		assertEquals("org.eclipse.draw2d.Ellipse", ((FigureViewmap) v).getFigureQualifiedClassName());
	}

	public void testAbleToProcessFigureAccessor() {
		final CustomFigure nodeFigure = GMFGraphFactory.eINSTANCE.createCustomFigure();
		Node n = createNode("n1", nodeFigure);
		nodeFigure.setName("ScrollPane");
		nodeFigure.setQualifiedClassName("org.eclipse.draw2d.ScrollPane");
		final FigureAccessor figureAccess1 = GMFGraphFactory.eINSTANCE.createFigureAccessor();
		nodeFigure.getCustomChildren().add(figureAccess1);
		figureAccess1.setAccessor("getContents");

		// XXX this is to create ChildAccess, but there should be means to point to FigureAccess
		// without typedFigure
		final CustomFigure accessor1Type = GMFGraphFactory.eINSTANCE.createCustomFigure();
		accessor1Type.setName("Accessor1Type");
		accessor1Type.setQualifiedClassName("org.eclipse.draw2d.Figure");
		figureAccess1.setTypedFigure(accessor1Type);

		final CustomFigure accessor2Type = GMFGraphFactory.eINSTANCE.createCustomFigure();
		accessor2Type.setQualifiedClassName("org.eclipse.draw2d.Viewport");

		final FigureAccessor figureAccess2 = GMFGraphFactory.eINSTANCE.createFigureAccessor();
		figureAccess2.setAccessor("getViewport");
		figureAccess2.setTypedFigure(accessor2Type);
		nodeFigure.getCustomChildren().add(figureAccess2);

		final DiagramLabel l1 = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		l1.setName("L1");
		l1.setFigure(n.getFigure());
		l1.setAccessor(DiaDefSetup.newAccess(n.getFigure(), figureAccess1.getTypedFigure()));
		final DiagramLabel l2 = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		l2.setName("L2");
		l2.setFigure(n.getFigure());
		l2.setAccessor(DiaDefSetup.newAccess(n.getFigure(), figureAccess2.getTypedFigure()));

		final Viewmap nodeViewmap = getProducer().create(n);
		final Viewmap label1Viewmap = getProducer().create(l1);
		final Viewmap label2Viewmap = getProducer().create(l2);
		assertNotNull(nodeViewmap);
		assertNotNull(label1Viewmap);
		assertNotNull(label2Viewmap);
		// don't care about kind of nodeViewmap, should be insignificant
		assertTrue(label1Viewmap.getClass().getName(), label1Viewmap instanceof ParentAssignedViewmap);
		assertTrue(label2Viewmap.getClass().getName(), label2Viewmap instanceof ParentAssignedViewmap);

		assertEquals(figureAccess1.getAccessor(), ((ParentAssignedViewmap) label1Viewmap).getGetterName());

		// XXX If we decide to make FigureAccessor#typedFigure optional some day, we might want to
		// assertNull instead of assertNotNull
		//assertNull(((ParentAssignedViewmap) label1Viewmap).getFigureQualifiedClassName());
		assertNotNull(((ParentAssignedViewmap) label1Viewmap).getFigureQualifiedClassName());

		assertNull(((ParentAssignedViewmap) label1Viewmap).getSetterName());

		assertEquals(figureAccess2.getAccessor(), ((ParentAssignedViewmap) label2Viewmap).getGetterName());
		assertNotNull(((ParentAssignedViewmap) label2Viewmap).getFigureQualifiedClassName());
		assertEquals(((CustomFigure) figureAccess2.getTypedFigure()).getQualifiedClassName(), ((ParentAssignedViewmap) label2Viewmap).getFigureQualifiedClassName());
		assertNull(((ParentAssignedViewmap) label2Viewmap).getSetterName());
	}

	/**
	 * check that viewmap producer correctly processes labels inside nodes
	 * and produces {@link ParentAssignedViewmap} to handle their placement correctly
	 */
	public void testRecognizesParentAssignedCases() {
		final RoundedRectangle rootRect = GMFGraphFactory.eINSTANCE.createRoundedRectangle();
		final Node n = createNode("n1", rootRect);
		rootRect.setName("RouRe");

		final Label lf = GMFGraphFactory.eINSTANCE.createLabel();
		lf.setName("Lf");
		rootRect.getChildren().add(lf);
		final DiagramLabel innerLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		innerLabel.setName("DL1");
		innerLabel.setFigure(n.getFigure());
		innerLabel.setAccessor(DiaDefSetup.newAccess(n.getFigure(), lf));

		final Label topLevelLabelFigure = GMFGraphFactory.eINSTANCE.createLabel();
		topLevelLabelFigure.setName("topLevelLabelFigure");
		final DiagramLabel externalLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		externalLabel.setName("DL2");
		externalLabel.setFigure(DiaDefSetup.newDescriptor(topLevelLabelFigure));

		final ViewmapProducer p = getProducer();
		p.create(n);
		Viewmap innerLabelViewmap = p.create(innerLabel);
		Viewmap externalLabelViewmap = p.create(externalLabel);
		

		assertNotNull(innerLabelViewmap);
		assertTrue(innerLabelViewmap.getClass().getName(), innerLabelViewmap instanceof ParentAssignedViewmap);
		ParentAssignedViewmap pav = (ParentAssignedViewmap) innerLabelViewmap;
		assertEquals(innerLabel.getAccessor().getAccessor(), pav.getGetterName());
		assertNotNull(pav.getFigureQualifiedClassName());
		assertEquals("org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel", pav.getFigureQualifiedClassName());

		assertNotNull(externalLabelViewmap);
		assertFalse(externalLabelViewmap instanceof ParentAssignedViewmap);
	}

	public void testFindAncestorGallery(){
		Figure external = GMFGraphFactory.eINSTANCE.createRectangle();
		assertNull(InnerClassViewmapProducer.findAncestorFigureGallery(external));
		
		FigureGallery figureGallery = GMFGraphFactory.eINSTANCE.createFigureGallery();
		figureGallery.setName("Any");
		
		RealFigure normal = GMFGraphFactory.eINSTANCE.createRectangle();
		normal.setName("Normal");
		figureGallery.getFigures().add(normal);
		
		RealFigure deep = GMFGraphFactory.eINSTANCE.createRectangle();
		deep.setName("Deep");
		normal.getChildren().add(deep);
		
		assertSame(figureGallery, InnerClassViewmapProducer.findAncestorFigureGallery(normal));
		assertSame(figureGallery, InnerClassViewmapProducer.findAncestorFigureGallery(deep));
	}

	public void testViewmapRequiredPluginIDs() {
		final String BUNDLE = "com.mycompany.figures";
		
		FigureGallery figureGallery = GMFGraphFactory.eINSTANCE.createFigureGallery();
		figureGallery.setName("Any");
		figureGallery.setImplementationBundle(BUNDLE);

		CustomFigure customFigure = GMFGraphFactory.eINSTANCE.createCustomFigure();
		customFigure.setName("ExternalFigure");
		customFigure.setQualifiedClassName("com.mycompany.figures.TheFigure");
		

		Node node = GMFGraphFactory.eINSTANCE.createNode();
		node.setName("Node");
		node.setFigure(DiaDefSetup.newDescriptor(customFigure));
		figureGallery.getDescriptors().add(node.getFigure());

		Compartment compartment = GMFGraphFactory.eINSTANCE.createCompartment();
		compartment.setName("Compartment");
		compartment.setFigure(DiaDefSetup.newDescriptor((CustomFigure) EcoreUtil.copy(customFigure)));
		figureGallery.getDescriptors().add(compartment.getFigure());

		Connection connection = GMFGraphFactory.eINSTANCE.createConnection();
		connection.setName("Link");
		CustomConnection customLinkFigure = GMFGraphFactory.eINSTANCE.createCustomConnection();
		customLinkFigure.setName("ExternalLink");
		customLinkFigure.setQualifiedClassName("com.mycompany.figures.TheLink");
		connection.setFigure(DiaDefSetup.newDescriptor(customLinkFigure));
		figureGallery.getDescriptors().add(connection.getFigure());

		class Checker extends Assert {
			public void checkViewmap(Viewmap viewmap) {
				assertNotNull(viewmap);
				assertTrue(viewmap.getRequiredPluginIDs().contains(BUNDLE));
			}
		}

		Checker checker = new Checker();

		checker.checkViewmap(getProducer().create(node));
		checker.checkViewmap(getProducer().create(compartment));
		checker.checkViewmap(getProducer().create(connection));
	}

	public void testInnerViewmapProducerForNode() {
		RealFigure figure;
		Node node = createNode("n1", figure = GMFGraphFactory.eINSTANCE.createRoundedRectangle());
		ConstantColor c = GMFGraphFactory.eINSTANCE.createConstantColor();
		c.setValue(ColorConstants.CYAN_LITERAL);
		figure.setBackgroundColor(c);
		figure.setName("RouRec1");
		Viewmap v = getProducer().create(node);
		assertNotNull(v);
		assertTrue(v instanceof InnerClassViewmap);
		InnerClassViewmap icv = (InnerClassViewmap) v;
		assertNotNull(icv.getClassName());
		assertNotNull(icv.getClassBody());
		TypeDeclaration typeDecl = parseFirstType(icv.getClassBody());
		assertNotNull(typeDecl);
		String innerClassGenName = typeDecl.getName().getFullyQualifiedName();
		assertEquals(icv.getClassName(), innerClassGenName);
	}
	
	public void testPinnedCompartment(){
		final Rectangle rect = GMFGraphFactory.eINSTANCE.createRectangle();
		Node rootNode = createNode("Root", rect);
		rect.setName("RootFig");
		RealFigure compartmentPaneA = GMFGraphFactory.eINSTANCE.createRectangle();
		compartmentPaneA.setName("CompartmentA");
		rect.getChildren().add(compartmentPaneA);
		
		RealFigure intermediate = GMFGraphFactory.eINSTANCE.createEllipse();
		intermediate.setName("Intermediate");
		rect.getChildren().add(intermediate);
		RealFigure compartmentPaneB = GMFGraphFactory.eINSTANCE.createRectangle();
		compartmentPaneB.setName("CompartmentB");
		intermediate.getChildren().add(compartmentPaneB);
		
		Compartment compartmentA = createCompartment("CompartmentA", rootNode.getFigure(), compartmentPaneA);
		Compartment compartmentB = createCompartment("CompartmentB", rootNode.getFigure(), compartmentPaneB);

		getProducer().create(rootNode);
		Viewmap viewmapA = getProducer().create(compartmentA); 
		Viewmap viewmapB = getProducer().create(compartmentB);

		assertNotNull(viewmapA);
		assertNotNull(viewmapB);
		assertTrue(viewmapA.getClass().getName(), viewmapA instanceof ParentAssignedViewmap);
		assertTrue(viewmapB.getClass().getName(), viewmapB instanceof ParentAssignedViewmap);

		assertEquals(((ParentAssignedViewmap) viewmapA).getGetterName(), compartmentA.getAccessor().getAccessor());
		assertEquals(((ParentAssignedViewmap) viewmapB).getGetterName(), compartmentB.getAccessor().getAccessor());
	}
	
	public void testFloatingCompartment(){
		Compartment compartment = createCompartment("Floating", null, GMFGraphFactory.eINSTANCE.createEllipse());
		final Viewmap viewmapFloat = getProducer().create(compartment);
		assertNotNull(viewmapFloat);
		assertFalse(ParentAssignedViewmap.class.getName(), viewmapFloat instanceof ParentAssignedViewmap);
		
		Compartment noFigure = createCompartment("NoFigure", null, GMFGraphFactory.eINSTANCE.createCustomFigure());
		noFigure.setFigure(null);
		final Viewmap viewmapNoFigure = getProducer().create(noFigure);
		assertNotNull(viewmapNoFigure);
		assertFalse(ParentAssignedViewmap.class.getName(), viewmapNoFigure instanceof ParentAssignedViewmap);
	}
	
	public void testResizeConstaintsSingleDiagonals(){
		RealFigure f = GMFGraphFactory.eINSTANCE.createRoundedRectangle();
		f.setName("Figure");
		
		new ResizeConstraintsChecker(new Direction[] {
				Direction.NORTH_LITERAL, 
				Direction.WEST_LITERAL, 
		}).checkNode(createNode("NW", f, Direction.NORTH_WEST_LITERAL));

		new ResizeConstraintsChecker(new Direction[] {
				Direction.NORTH_LITERAL, 
				Direction.EAST_LITERAL, 
		}).checkNode(createNode("NE", f, Direction.NORTH_EAST_LITERAL));

		new ResizeConstraintsChecker(new Direction[] {
				Direction.SOUTH_LITERAL, 
				Direction.WEST_LITERAL, 
		}).checkNode(createNode("SW", f, Direction.SOUTH_WEST_LITERAL));

		new ResizeConstraintsChecker(new Direction[] {
				Direction.SOUTH_LITERAL, 
				Direction.EAST_LITERAL, 
		}).checkNode(createNode("SE", f, Direction.SOUTH_EAST_LITERAL));
	}
	
	public void testResizeConstraintsMulty(){
		Node explicitAny = createNode("ExplicitAll", GMFGraphFactory.eINSTANCE.createRoundedRectangle(), Direction.NSEW_LITERAL);
		Node implicitAny = createNode("ImplicitAll", GMFGraphFactory.eINSTANCE.createRoundedRectangle(), null);
		Node horizontal = createNode("Horizontal", GMFGraphFactory.eINSTANCE.createRoundedRectangle(), Direction.EAST_WEST_LITERAL);
		Node vertical = createNode("Vertical", GMFGraphFactory.eINSTANCE.createRoundedRectangle(), Direction.NORTH_SOUTH_LITERAL);
		
		NoUselessResizeConstraintsChecker allDirectionsChecker = new NoUselessResizeConstraintsChecker();

		allDirectionsChecker.checkNode(implicitAny);
		allDirectionsChecker.checkNode(explicitAny);
		new ResizeConstraintsChecker(new Direction[] {Direction.EAST_LITERAL, Direction.WEST_LITERAL}).checkNode(horizontal);
		new ResizeConstraintsChecker(new Direction[] {Direction.SOUTH_LITERAL, Direction.NORTH_LITERAL}).checkNode(vertical);
	}
	
	public void testResizeConstaintsSingleCartesians(){
		RealFigure f = GMFGraphFactory.eINSTANCE.createRoundedRectangle();
		f.setName("Figure");

		Direction[] CARTESIANS = new Direction[] {
				Direction.NORTH_LITERAL, 
				Direction.SOUTH_LITERAL,  
				Direction.EAST_LITERAL, 
				Direction.WEST_LITERAL, 
			};

		for (int i = 0; i < CARTESIANS.length; i++){
			Direction next = CARTESIANS[i];
			Node node = createNode("Single" + next.getName(), f, next);
			new ResizeConstraintsChecker(next).checkNode(node);
		}
	}
	
	public void testDefaultSizeAttribute(){
		Dimension DIMENSION = GMFGraphFactory.eINSTANCE.createDimension();
		DIMENSION.setDx(321);
		DIMENSION.setDy(123);
		
		class Checker {
			private final Dimension myExpectedSize;

			public Checker(Figure expected){
				this(expected.getPreferredSize());
			}
			
			public Checker(Dimension expected){
				myExpectedSize = expected == null ? null : (Dimension)EcoreUtil.copy(expected);
			}
			
			public void check(RealFigure figure){
				check(getProducer().create(createNode(figure.getName(), figure)));
			}
			
			public void check(Viewmap viewmap){
				DefaultSizeAttributes actual = (DefaultSizeAttributes) viewmap.find(DefaultSizeAttributes.class);
				if (myExpectedSize == null){
					assertNull(actual);
				} else {
					assertNotNull(actual);
					assertEquals(myExpectedSize.getDx(), actual.getWidth());
					assertEquals(myExpectedSize.getDy(), actual.getHeight());
				}
			}
		}
		
		RealFigure withPrefSize = GMFGraphFactory.eINSTANCE.createRoundedRectangle();
		withPrefSize.setName("WithPreferredSize");
		withPrefSize.setPreferredSize((Dimension) EcoreUtil.copy(DIMENSION));
		new Checker(withPrefSize).check(withPrefSize);
		
		RealFigure noPrefSize = GMFGraphFactory.eINSTANCE.createRectangle();
		noPrefSize.setName("NoPrefSize");
		new Checker(noPrefSize).check(noPrefSize);
		
		RealFigure childHasPrefSizeButFigureDoesNot = GMFGraphFactory.eINSTANCE.createEllipse();
		childHasPrefSizeButFigureDoesNot.setName("Parent");
		RealFigure child = GMFGraphFactory.eINSTANCE.createRectangle();
		child.setName("child");
		child.setPreferredSize((Dimension) EcoreUtil.copy(DIMENSION));
		new Checker((Dimension)null).check(childHasPrefSizeButFigureDoesNot);
		new Checker(DIMENSION).check(child);
		
		RealFigure noPrefSizeButFacet = GMFGraphFactory.eINSTANCE.createScalablePolygon();
		Node facetNode = createNode("NoPrefSizeButFacet", noPrefSizeButFacet);
		DefaultSizeFacet facet = GMFGraphFactory.eINSTANCE.createDefaultSizeFacet();
		facet.setDefaultSize((Dimension) EcoreUtil.copy(DIMENSION));
		facetNode.getFacets().add(facet);
		new Checker(DIMENSION).check(getProducer().create(facetNode));
		
		final int FACET_VALUE = 42;
		final int PREF_SIZE_VALUE = 42 * 2;
		RealFigure bothFacetAndPrefSize = GMFGraphFactory.eINSTANCE.createRectangle();
		Node bothSizesNode = createNode("BothPrefSizeAndFacet", bothFacetAndPrefSize);
		facet = GMFGraphFactory.eINSTANCE.createDefaultSizeFacet();
		facet.setDefaultSize(GMFGraphFactory.eINSTANCE.createDimension());
		facet.getDefaultSize().setDx(FACET_VALUE);
		facet.getDefaultSize().setDy(FACET_VALUE);
		bothSizesNode.getFacets().add(facet);
		
		Dimension prefSize = GMFGraphFactory.eINSTANCE.createDimension();
		prefSize.setDx(PREF_SIZE_VALUE);
		prefSize.setDy(PREF_SIZE_VALUE);
		bothFacetAndPrefSize.setPreferredSize(prefSize);
		
		//facet should have a precedence
		new Checker(facet.getDefaultSize()).check(getProducer().create(bothSizesNode));
	}
	
	public void testViewmapLayoutType(){
		ViewmapLayoutTypeChecker checker = new ViewmapLayoutTypeChecker();
		GMFGraphFactory gmf = GMFGraphFactory.eINSTANCE;
		checker.check(null, ViewmapLayoutType.UNKNOWN_LITERAL);
		checker.check(gmf.createCustomLayout(), ViewmapLayoutType.UNKNOWN_LITERAL);
		checker.check(gmf.createGridLayout(), ViewmapLayoutType.UNKNOWN_LITERAL);
		checker.check(gmf.createBorderLayout(), ViewmapLayoutType.UNKNOWN_LITERAL);
		
		checker.check(gmf.createXYLayout(), ViewmapLayoutType.XY_LAYOUT_LITERAL);
		
		FlowLayout flow = gmf.createFlowLayout();
		flow.setForceSingleLine(false);
		checker.check(flow, ViewmapLayoutType.FLOW_LAYOUT_LITERAL);
		
		FlowLayout toolbar = gmf.createFlowLayout();
		toolbar.setForceSingleLine(true);
		checker.check(toolbar, ViewmapLayoutType.TOOLBAR_LAYOUT_LITERAL);
	}
	
	public void testStyleAttributes(){
		class Checker {
			public void check(Viewmap viewmap, boolean font, boolean fore, boolean back){
				StyleAttributes attributes = (StyleAttributes) viewmap.find(StyleAttributes.class);
				if (font || fore || back){
					assertNotNull(attributes);
					assertEquals(font, attributes.isFixedFont());
					assertEquals(fore, attributes.isFixedForeground());
					assertEquals(back, attributes.isFixedBackground());
				} else {
					assertNull(attributes);
				}
			}
			
			public void check(Node node, boolean font, boolean fore, boolean back){
				Viewmap viewmap = getProducer().create(node);
				check(viewmap, font, fore, back);
			}
			
			public void check(Connection link, boolean font, boolean fore, boolean back){
				Viewmap viewmap = getProducer().create(link);
				check(viewmap, font, fore, back);
			}
		}
		
		Checker checker = new Checker();
		
		checker.check(createNode("NODE_Empty", GMFGraphFactory.eINSTANCE.createRectangle()), false, false, false);
		checker.check(createLink("LINK_Empty", GMFGraphFactory.eINSTANCE.createPolylineConnection()), false, false, false);
	
		RealFigure hasFont = GMFGraphFactory.eINSTANCE.createRectangle();
		BasicFont font = GMFGraphFactory.eINSTANCE.createBasicFont(); 
		font.setFaceName("Arial");
		font.setHeight(12);
		font.setStyle(FontStyle.BOLD_LITERAL);
		hasFont.setFont(font);
		checker.check(createNode("NODE_Font", hasFont), true, false, false);

		RealFigure hasFore = GMFGraphFactory.eINSTANCE.createRectangle();
		hasFore.setForegroundColor(createColor(ColorConstants.GRAY_LITERAL));
		checker.check(createNode("NODE_Fore_Color", hasFore), false, true, false);

		RealFigure hasBack = GMFGraphFactory.eINSTANCE.createRectangle();
		hasBack.setBackgroundColor(createColor(ColorConstants.LIGHT_BLUE_LITERAL)) ;
		checker.check(createNode("NODE_Back_Color", hasBack), false, false, true);
		
		ConnectionFigure polylineWithFont = GMFGraphFactory.eINSTANCE.createPolylineConnection();
		polylineWithFont.setFont(font);
		checker.check(createLink("Link_Font", polylineWithFont), true, false, false);
		
		ConnectionFigure polylineWithColor = GMFGraphFactory.eINSTANCE.createPolylineConnection();
		polylineWithColor.setForegroundColor(createColor(ColorConstants.RED_LITERAL));
		checker.check(createLink("Link_Font", polylineWithColor), false, true, false);
		
		RealFigure parent = GMFGraphFactory.eINSTANCE.createRoundedRectangle();
		parent.setName("ParentNoColor");
		RealFigure child = GMFGraphFactory.eINSTANCE.createEllipse();
		child.setName("ChildWithColor");
		child.setForegroundColor(createColor(ColorConstants.GREEN_LITERAL));
		parent.getChildren().add(child);
		//only properties of top-level figure should be considered
		checker.check(createNode("ParentOfColoredChild", parent), false, false, false);
		
		Label externalWithFont = GMFGraphFactory.eINSTANCE.createLabel();
		externalWithFont.setText("LabelText");
		externalWithFont.setName("ExternalWithFont");
		externalWithFont.setFont(font);
		DiagramLabel diagramExternalLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		diagramExternalLabel.setName("DiagramExternalLabelWithFont");
		diagramExternalLabel.setFigure(DiaDefSetup.newDescriptor(externalWithFont));
		checker.check(getProducer().create(diagramExternalLabel), true, false, false);
		
		RealFigure labelParent = GMFGraphFactory.eINSTANCE.createRectangle();
		labelParent.setName("LabelParent");
		Label innerWithFont = (Label) EcoreUtil.copy(externalWithFont);
		labelParent.getChildren().add(innerWithFont);
		DiagramLabel diagramInnerLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		diagramInnerLabel.setName("DiagramInnerLabelWithFont");
		final FigureDescriptor fd = DiaDefSetup.newDescriptor(labelParent);
		ChildAccess ca = DiaDefSetup.newAccess(fd, innerWithFont);
		diagramInnerLabel.setFigure(fd);
		diagramInnerLabel.setAccessor(ca);
		checker.check(getProducer().create(diagramInnerLabel), true, false, false);
	}
	
	
	private TypeDeclaration parseFirstType(String classContents) {
		ASTParser p = ASTParser.newParser(AST.JLS3);
		p.setSource(classContents.toCharArray());
		p.setKind(ASTParser.K_COMPILATION_UNIT);
		ASTNode astNode = p.createAST(null);
		assertEquals(ASTNode.COMPILATION_UNIT, astNode.getNodeType());
		CompilationUnit cu = (CompilationUnit) astNode;
		assertNull(cu.getPackage());
		assertTrue(cu.types().size() > 0);
		assertTrue(cu.types().get(0) instanceof TypeDeclaration);
		return (TypeDeclaration) cu.types().get(0);
	}
	
	private static Node createNode(String name, RealFigure figure){
		return createNode(name, figure, null);
	}
	
	private static Connection createLink(String name, ConnectionFigure connectionFigure) {
		Connection connection = GMFGraphFactory.eINSTANCE.createConnection();
		connectionFigure.setName(name);
		connection.setName(name);
		connection.setFigure(DiaDefSetup.newDescriptor(connectionFigure));
		return connection;
	}

	private static Compartment createCompartment(String name, FigureDescriptor owner, RealFigure figure){
		assertNotNull(name);
		assertNotNull(figure);
		Compartment result = GMFGraphFactory.eINSTANCE.createCompartment();
		result.setName(name);
		if (owner == null) {
			result.setFigure(DiaDefSetup.newDescriptor(name + "Fig", figure));
		} else {
			result.setFigure(owner);
			result.setAccessor(DiaDefSetup.newAccess(owner, figure));
		}
		return result;
	}
	
	private static Node createNode(String name, RealFigure figure, Direction optionalConstaint){
		assertNotNull(name);
		assertNotNull(figure);
		Node result = GMFGraphFactory.eINSTANCE.createNode();
		result.setName(name);
		figure.setName(name);
		
		result.setFigure(DiaDefSetup.newDescriptor(figure));
		if (optionalConstaint != null){
			result.setResizeConstraint(optionalConstaint);
		}
		return result;
	}

	protected ViewmapProducer getProducer() {
		return myProducer;
	}
	
	private static Color createColor(ColorConstants color) {
		ConstantColor result = GMFGraphFactory.eINSTANCE.createConstantColor();
		result.setValue(color);
		return result;
	}

	private class ResizeConstraintsChecker {
		private final List<String> myExpectedNames;

		public ResizeConstraintsChecker(Direction[] expectedDirectionNames){
			myExpectedNames = new ArrayList<String>(expectedDirectionNames.length);
			for (int i = 0; i < expectedDirectionNames.length; i++){
				myExpectedNames.add(expectedDirectionNames[i].getName());
			}
		}
		
		public ResizeConstraintsChecker(Direction theOnly){
			this(new Direction[] {theOnly});
		}

		protected ResizeConstraintsChecker() {
			myExpectedNames = Collections.emptyList();
		}

		public void checkNode(Node node){
			Viewmap viewmap = getProducer().create(node);
			checkViewmap(node.getName(), viewmap);
		}
		
		public void checkViewmap(String nodeName, Viewmap v){
			assertNotNull(v);
			ResizeConstraints genConstraint = (ResizeConstraints)v.find(ResizeConstraints.class); 
			assertNotNull("Problem node:" + nodeName, genConstraint);
			assertEquals("Problem node:" + nodeName, myExpectedNames.size(), genConstraint.getResizeHandleNames().size());
			assertTrue("Problem node:" + nodeName, genConstraint.getResizeHandleNames().containsAll(myExpectedNames));
		}
	}
	
	private class NoUselessResizeConstraintsChecker extends ResizeConstraintsChecker {
		public NoUselessResizeConstraintsChecker() {
		}

		public void checkViewmap(String nodeName, Viewmap v){
			assertNotNull(v);
			ResizeConstraints genConstraint = (ResizeConstraints)v.find(ResizeConstraints.class);
			assertNull("Problem node:" + nodeName, genConstraint);
		}
	}
	
	private class ViewmapLayoutTypeChecker {
		private final RealFigure myFigure;
		private final Node myNode;
		
		public ViewmapLayoutTypeChecker(){
			this(GMFGraphFactory.eINSTANCE.createRectangle(), GMFGraphFactory.eINSTANCE.createNode());
		}

		public ViewmapLayoutTypeChecker(RealFigure figure, Node node){
			myFigure = figure;
			myFigure.setName("Figure");
			myNode = node;
			myNode.setName("Node");
			myNode.setFigure(DiaDefSetup.newDescriptor(myFigure));
		}
		
		public void check(Layout graphLayout, ViewmapLayoutType expected){
			myFigure.setLayout(graphLayout);
			ViewmapLayoutType actual = getProducer().create(myNode).getLayoutType();
			assertNotNull(actual);
			assertEquals(expected, actual);
		}
	}
}
