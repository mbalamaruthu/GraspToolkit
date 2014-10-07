/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getBecauseClause <em>Because Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends TemplateConstituent
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProperty_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Because Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Because Clause</em>' containment reference.
   * @see #setBecauseClause(BecauseClause)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProperty_BecauseClause()
   * @model containment="true"
   * @generated
   */
  BecauseClause getBecauseClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Property#getBecauseClause <em>Because Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Because Clause</em>' containment reference.
   * @see #getBecauseClause()
   * @generated
   */
  void setBecauseClause(BecauseClause value);

} // Property
