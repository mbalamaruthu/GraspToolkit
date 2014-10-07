/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Check#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Check#getBecauseClause <em>Because Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends TemplateConstituent, SystemConstituent, LayerConstituent, InstantiableConstituent
{
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getCheck_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Check#getExpression <em>Expression</em>}' containment reference.
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getCheck_BecauseClause()
   * @model containment="true"
   * @generated
   */
  BecauseClause getBecauseClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Check#getBecauseClause <em>Because Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Because Clause</em>' containment reference.
   * @see #getBecauseClause()
   * @generated
   */
  void setBecauseClause(BecauseClause value);

} // Check
