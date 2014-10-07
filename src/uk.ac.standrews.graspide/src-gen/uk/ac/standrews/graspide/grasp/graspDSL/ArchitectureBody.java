/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationStart <em>Declaration Start</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getSystem <em>System</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationEnd <em>Declaration End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitectureBody()
 * @model
 * @generated
 */
public interface ArchitectureBody extends EObject
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitectureBody_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Declaration Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration Start</em>' containment reference.
   * @see #setDeclarationStart(DeclarationStart)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitectureBody_DeclarationStart()
   * @model containment="true"
   * @generated
   */
  DeclarationStart getDeclarationStart();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationStart <em>Declaration Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration Start</em>' containment reference.
   * @see #getDeclarationStart()
   * @generated
   */
  void setDeclarationStart(DeclarationStart value);

  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(uk.ac.standrews.graspide.grasp.graspDSL.System)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitectureBody_System()
   * @model containment="true"
   * @generated
   */
  uk.ac.standrews.graspide.grasp.graspDSL.System getSystem();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(uk.ac.standrews.graspide.grasp.graspDSL.System value);

  /**
   * Returns the value of the '<em><b>Declaration End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration End</em>' containment reference.
   * @see #setDeclarationEnd(DeclarationEnd)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getArchitectureBody_DeclarationEnd()
   * @model containment="true"
   * @generated
   */
  DeclarationEnd getDeclarationEnd();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody#getDeclarationEnd <em>Declaration End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration End</em>' containment reference.
   * @see #getDeclarationEnd()
   * @generated
   */
  void setDeclarationEnd(DeclarationEnd value);

} // ArchitectureBody
