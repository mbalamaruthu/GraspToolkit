/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Because Causalcontext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBecauseCausalcontext()
 * @model
 * @generated
 */
public interface BecauseCausalcontext extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Rationale)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBecauseCausalcontext_Value()
   * @model
   * @generated
   */
  Rationale getValue();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Rationale value);

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference.
   * @see #setArgumentList(ArgumentList)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getBecauseCausalcontext_ArgumentList()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgumentList();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext#getArgumentList <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument List</em>' containment reference.
   * @see #getArgumentList()
   * @generated
   */
  void setArgumentList(ArgumentList value);

} // BecauseCausalcontext
