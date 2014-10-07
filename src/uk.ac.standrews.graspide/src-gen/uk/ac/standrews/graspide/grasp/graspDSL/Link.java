/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConsumer <em>Link Consumer</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkProviders <em>Link Providers</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getBecauseClause <em>Because Clause</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConstituent <em>Link Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends Compositional
{
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLink_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Link Consumer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Consumer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Consumer</em>' containment reference.
   * @see #setLinkConsumer(LinkConsumerExpression)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLink_LinkConsumer()
   * @model containment="true"
   * @generated
   */
  LinkConsumerExpression getLinkConsumer();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkConsumer <em>Link Consumer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Consumer</em>' containment reference.
   * @see #getLinkConsumer()
   * @generated
   */
  void setLinkConsumer(LinkConsumerExpression value);

  /**
   * Returns the value of the '<em><b>Link Providers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Providers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Providers</em>' containment reference.
   * @see #setLinkProviders(LinkProvidersList)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLink_LinkProviders()
   * @model containment="true"
   * @generated
   */
  LinkProvidersList getLinkProviders();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getLinkProviders <em>Link Providers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Providers</em>' containment reference.
   * @see #getLinkProviders()
   * @generated
   */
  void setLinkProviders(LinkProvidersList value);

  /**
   * Returns the value of the '<em><b>Because Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Because Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Because Clause</em>' containment reference.
   * @see #setBecauseClause(BecauseClause)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLink_BecauseClause()
   * @model containment="true"
   * @generated
   */
  BecauseClause getBecauseClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.Link#getBecauseClause <em>Because Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Because Clause</em>' containment reference.
   * @see #getBecauseClause()
   * @generated
   */
  void setBecauseClause(BecauseClause value);

  /**
   * Returns the value of the '<em><b>Link Constituent</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Constituent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Constituent</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLink_LinkConstituent()
   * @model containment="true"
   * @generated
   */
  EList<LinkConstituent> getLinkConstituent();

} // Link
