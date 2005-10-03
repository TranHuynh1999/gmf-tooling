/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.codegen.gmfgen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Node Viewmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBasicNodeViewmap()
 * @model
 * @generated
 */
public interface BasicNodeViewmap extends Viewmap, FigureViewmap {
	/**
	 * Returns the value of the '<em><b>Figure Qualified Class Name</b></em>' attribute.
	 * The default value is <code>"org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Qualified Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #setFigureQualifiedClassName(String)
	 * @see org.eclipse.gmf.codegen.gmfgen.GMFGenPackage#getBasicNodeViewmap_FigureQualifiedClassName()
	 * @model default="org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure"
	 * @generated
	 */
	String getFigureQualifiedClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.codegen.gmfgen.BasicNodeViewmap#getFigureQualifiedClassName <em>Figure Qualified Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Qualified Class Name</em>' attribute.
	 * @see #getFigureQualifiedClassName()
	 * @generated
	 */
	void setFigureQualifiedClassName(String value);

} // BasicNodeViewmap
