/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getSuperRationale <em>Super Rationale</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRationale()
 * @model
 * @generated
 */
public interface Rationale extends Declaration
{
  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference.
   * @see #setParameterList(ParameterList)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRationale_ParameterList()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterList();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(ParameterList value);

  /**
   * Returns the value of the '<em><b>Super Rationale</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Rationale</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Rationale</em>' reference.
   * @see #setSuperRationale(Rationale)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRationale_SuperRationale()
   * @model
   * @generated
   */
  Rationale getSuperRationale();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Rationale#getSuperRationale <em>Super Rationale</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Rationale</em>' reference.
   * @see #getSuperRationale()
   * @generated
   */
  void setSuperRationale(Rationale value);

  /**
   * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Reason}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reason</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reason</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getRationale_Reason()
   * @model containment="true"
   * @generated
   */
  EList<Reason> getReason();

} // Rationale
