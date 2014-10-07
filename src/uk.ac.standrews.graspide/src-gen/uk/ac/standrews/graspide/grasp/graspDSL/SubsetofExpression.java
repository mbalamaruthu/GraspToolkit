/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsetof Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression#getLogicalOr <em>Logical Or</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getSubsetofExpression()
 * @model
 * @generated
 */
public interface SubsetofExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Logical Or</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Or</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Or</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getSubsetofExpression_LogicalOr()
   * @model containment="true"
   * @generated
   */
  EList<LogicalOrExpression> getLogicalOr();

} // SubsetofExpression
