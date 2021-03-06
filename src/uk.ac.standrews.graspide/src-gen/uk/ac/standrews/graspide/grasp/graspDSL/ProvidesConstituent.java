/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides Constituent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getProvidesAnnotation <em>Provides Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getCheck <em>Check</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvidesConstituent()
 * @model
 * @generated
 */
public interface ProvidesConstituent extends EObject
{
  /**
   * Returns the value of the '<em><b>Provides Annotation</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provides Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provides Annotation</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvidesConstituent_ProvidesAnnotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getProvidesAnnotation();

  /**
   * Returns the value of the '<em><b>Check</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check</em>' containment reference.
   * @see #setCheck(Check)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvidesConstituent_Check()
   * @model containment="true"
   * @generated
   */
  Check getCheck();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent#getCheck <em>Check</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check</em>' containment reference.
   * @see #getCheck()
   * @generated
   */
  void setCheck(Check value);

} // ProvidesConstituent
