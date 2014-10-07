/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression#getUnary <em>Unary</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Unary</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMultiplicativeExpression_Unary()
   * @model containment="true"
   * @generated
   */
  EList<UnaryExpression> getUnary();

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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMultiplicativeExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

} // MultiplicativeExpression
