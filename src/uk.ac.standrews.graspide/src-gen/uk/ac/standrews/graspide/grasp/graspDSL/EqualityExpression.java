/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression#getRelational <em>Relational</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Relational</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getEqualityExpression_Relational()
   * @model containment="true"
   * @generated
   */
  EList<RelationalExpression> getRelational();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getEqualityExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

} // EqualityExpression
