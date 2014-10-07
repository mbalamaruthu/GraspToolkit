/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression#getLogicalAnd <em>Logical And</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLogicalOrExpression()
 * @model
 * @generated
 */
public interface LogicalOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Logical And</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical And</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical And</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLogicalOrExpression_LogicalAnd()
   * @model containment="true"
   * @generated
   */
  EList<LogicalAndExpression> getLogicalAnd();

} // LogicalOrExpression
