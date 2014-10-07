/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Provider Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getBecauseClause <em>Because Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProviderPart()
 * @model
 * @generated
 */
public interface LinkProviderPart extends EObject
{
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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProviderPart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkProviderPart_BecauseClause()
   * @model containment="true"
   * @generated
   */
  BecauseClause getBecauseClause();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart#getBecauseClause <em>Because Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Because Clause</em>' containment reference.
   * @see #getBecauseClause()
   * @generated
   */
  void setBecauseClause(BecauseClause value);

} // LinkProviderPart
