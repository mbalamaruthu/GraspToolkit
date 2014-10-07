/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getNamePair <em>Name Pair</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getValuePair <em>Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getNameValue()
 * @model
 * @generated
 */
public interface NameValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Pair</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Pair</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Pair</em>' attribute.
   * @see #setNamePair(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getNameValue_NamePair()
   * @model
   * @generated
   */
  String getNamePair();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getNamePair <em>Name Pair</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Pair</em>' attribute.
   * @see #getNamePair()
   * @generated
   */
  void setNamePair(String value);

  /**
   * Returns the value of the '<em><b>Value Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Pair</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Pair</em>' containment reference.
   * @see #setValuePair(Expression)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getNameValue_ValuePair()
   * @model containment="true"
   * @generated
   */
  Expression getValuePair();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.NameValue#getValuePair <em>Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Pair</em>' containment reference.
   * @see #getValuePair()
   * @generated
   */
  void setValuePair(Expression value);

} // NameValue
