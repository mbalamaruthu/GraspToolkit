/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression#getAdditive <em>Additive</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Additive</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additive</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRelationalExpression_Additive()
   * @model containment="true"
   * @generated
   */
  EList<AdditiveExpression> getAdditive();

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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRelationalExpression_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

} // RelationalExpression
