/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getMemberArguments <em>Member Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMemberPart()
 * @model
 * @generated
 */
public interface MemberPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMemberPart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Member Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Arguments</em>' containment reference.
   * @see #setMemberArguments(MemberArguments)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getMemberPart_MemberArguments()
   * @model containment="true"
   * @generated
   */
  MemberArguments getMemberArguments();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.MemberPart#getMemberArguments <em>Member Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member Arguments</em>' containment reference.
   * @see #getMemberArguments()
   * @generated
   */
  void setMemberArguments(MemberArguments value);

} // MemberPart
