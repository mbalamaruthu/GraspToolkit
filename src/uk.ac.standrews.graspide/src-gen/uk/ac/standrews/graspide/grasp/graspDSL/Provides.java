/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provides</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getProvidesConstituent <em>Provides Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvides()
 * @model
 * @generated
 */
public interface Provides extends TemplateConstituent, LinkProviderPart
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvides_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvides_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Provides#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Provides Constituent</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provides Constituent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provides Constituent</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getProvides_ProvidesConstituent()
   * @model containment="true"
   * @generated
   */
  EList<ProvidesConstituent> getProvidesConstituent();

} // Provides
