/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression#getBitwiseOr <em>Bitwise Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLogicalAndExpression()
 * @model
 * @generated
 */
public interface LogicalAndExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Bitwise Or</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bitwise Or</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bitwise Or</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLogicalAndExpression_BitwiseOr()
   * @model containment="true"
   * @generated
   */
  EList<BitwiseOrExpression> getBitwiseOr();

} // LogicalAndExpression
