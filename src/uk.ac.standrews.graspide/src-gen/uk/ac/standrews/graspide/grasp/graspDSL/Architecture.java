/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getArchitecutrebody <em>Architecutrebody</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitecture_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitecture_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Architecutrebody</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Architecutrebody</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecutrebody</em>' containment reference.
   * @see #setArchitecutrebody(ArchitectureBody)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitecture_Architecutrebody()
   * @model containment="true"
   * @generated
   */
  ArchitectureBody getArchitecutrebody();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Architecture#getArchitecutrebody <em>Architecutrebody</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecutrebody</em>' containment reference.
   * @see #getArchitecutrebody()
   * @generated
   */
  void setArchitecutrebody(ArchitectureBody value);

} // Architecture
