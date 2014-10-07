/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitwise Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression#getBitwiseXor <em>Bitwise Xor</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBitwiseOrExpression()
 * @model
 * @generated
 */
public interface BitwiseOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Bitwise Xor</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bitwise Xor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bitwise Xor</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBitwiseOrExpression_BitwiseXor()
   * @model containment="true"
   * @generated
   */
  EList<BitwiseXorExpression> getBitwiseXor();

} // BitwiseOrExpression
