/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Providers List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList#getProviders <em>Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProvidersList()
 * @model
 * @generated
 */
public interface LinkProvidersList extends EObject
{
  /**
   * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Providers</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProvidersList_Providers()
   * @model containment="true"
   * @generated
   */
  EList<LinkProviders> getProviders();

} // LinkProvidersList
