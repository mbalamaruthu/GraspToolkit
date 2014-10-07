/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' attribute.
   * @see #setAnnotation(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getAnnotation_Annotation()
   * @model
   * @generated
   */
  String getAnnotation();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getAnnotation <em>Annotation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' attribute.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(NameValues)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getAnnotation_Value()
   * @model containment="true"
   * @generated
   */
  NameValues getValue();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NameValues value);

} // Annotation
