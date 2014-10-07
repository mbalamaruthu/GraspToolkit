/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Providers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getProvider <em>Provider</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getRightProvider <em>Right Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProviders()
 * @model
 * @generated
 */
public interface LinkProviders extends EObject
{
  /**
   * Returns the value of the '<em><b>Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' reference.
   * @see #setProvider(LinkProviderPart)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProviders_Provider()
   * @model
   * @generated
   */
  LinkProviderPart getProvider();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders#getProvider <em>Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provider</em>' reference.
   * @see #getProvider()
   * @generated
   */
  void setProvider(LinkProviderPart value);

  /**
   * Returns the value of the '<em><b>Right Provider</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Provider</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Provider</em>' attribute list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProviders_RightProvider()
   * @model unique="false"
   * @generated
   */
  EList<String> getRightProvider();

} // LinkProviders
