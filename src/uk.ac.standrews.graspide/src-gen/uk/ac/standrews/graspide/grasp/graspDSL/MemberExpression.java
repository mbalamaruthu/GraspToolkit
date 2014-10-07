/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMemberExpression()
 * @model
 * @generated
 */
public interface MemberExpression extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Member</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMemberExpression_Member()
   * @model containment="true"
   * @generated
   */
  EList<MemberPart> getMember();

} // MemberExpression
