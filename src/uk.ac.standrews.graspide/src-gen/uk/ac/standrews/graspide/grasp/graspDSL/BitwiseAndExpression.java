/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitwise And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression#getEquality <em>Equality</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBitwiseAndExpression()
 * @model
 * @generated
 */
public interface BitwiseAndExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Equality</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equality</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equality</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBitwiseAndExpression_Equality()
   * @model containment="true"
   * @generated
   */
  EList<EqualityExpression> getEquality();

} // BitwiseAndExpression
