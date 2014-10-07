/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bitwise Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression#getBitwiseAnd <em>Bitwise And</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBitwiseXorExpression()
 * @model
 * @generated
 */
public interface BitwiseXorExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Bitwise And</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bitwise And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bitwise And</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBitwiseXorExpression_BitwiseAnd()
   * @model containment="true"
   * @generated
   */
  EList<BitwiseAndExpression> getBitwiseAnd();

} // BitwiseXorExpression
