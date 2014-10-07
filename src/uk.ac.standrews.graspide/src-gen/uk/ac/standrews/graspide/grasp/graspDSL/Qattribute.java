/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qattribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getExpression <em>Expression</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getSupportsClause <em>Supports Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getQattribute()
 * @model
 * @generated
 */
public interface Qattribute extends RequirementOrQuality
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getQattribute_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Supports Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supports Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supports Clause</em>' containment reference.
   * @see #setSupportsClause(SupportsClause)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getQattribute_SupportsClause()
   * @model containment="true"
   * @generated
   */
  SupportsClause getSupportsClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Qattribute#getSupportsClause <em>Supports Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supports Clause</em>' containment reference.
   * @see #getSupportsClause()
   * @generated
   */
  void setSupportsClause(SupportsClause value);

} // Qattribute
