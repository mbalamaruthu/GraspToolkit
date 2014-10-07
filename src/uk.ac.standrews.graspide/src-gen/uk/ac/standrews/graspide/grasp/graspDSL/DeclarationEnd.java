/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getDeclarationEnd()
 * @model
 * @generated
 */
public interface DeclarationEnd extends EObject
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getDeclarationEnd_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getDeclarationEnd_Declaration()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclaration();

} // DeclarationEnd
