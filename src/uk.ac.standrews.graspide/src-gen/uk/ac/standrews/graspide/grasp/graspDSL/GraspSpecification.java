/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grasp Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getGraspSpecification()
 * @model
 * @generated
 */
public interface GraspSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Architecture</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Architecture</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture</em>' containment reference.
   * @see #setArchitecture(Architecture)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getGraspSpecification_Architecture()
   * @model containment="true"
   * @generated
   */
  Architecture getArchitecture();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification#getArchitecture <em>Architecture</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecture</em>' containment reference.
   * @see #getArchitecture()
   * @generated
   */
  void setArchitecture(Architecture value);

} // GraspSpecification
