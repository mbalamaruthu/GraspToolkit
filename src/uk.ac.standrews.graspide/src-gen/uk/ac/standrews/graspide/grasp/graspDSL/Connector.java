/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getArgumentList <em>Argument List</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getInstantiableConstituent <em>Instantiable Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Compositional, LinkConsumerPart, LinkProviderPart
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
   * @see #setValue(Template)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getConnector_Value()
   * @model
   * @generated
   */
  Template getValue();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Template value);

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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getConnector_ArgumentList()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgumentList();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Connector#getArgumentList <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument List</em>' containment reference.
   * @see #getArgumentList()
   * @generated
   */
  void setArgumentList(ArgumentList value);

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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getConnector_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

  /**
   * Returns the value of the '<em><b>Instantiable Constituent</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiable Constituent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiable Constituent</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getConnector_InstantiableConstituent()
   * @model containment="true"
   * @generated
   */
  EList<InstantiableConstituent> getInstantiableConstituent();

} // Connector
