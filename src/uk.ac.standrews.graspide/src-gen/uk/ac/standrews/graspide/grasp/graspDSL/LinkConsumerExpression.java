/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Consumer Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getRightConsumer <em>Right Consumer</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkConsumerExpression()
 * @model
 * @generated
 */
public interface LinkConsumerExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Consumer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consumer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consumer</em>' reference.
   * @see #setConsumer(LinkConsumerPart)
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkConsumerExpression_Consumer()
   * @model
   * @generated
   */
  LinkConsumerPart getConsumer();

  /**
   * Sets the value of the '{@link uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression#getConsumer <em>Consumer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consumer</em>' reference.
   * @see #getConsumer()
   * @generated
   */
  void setConsumer(LinkConsumerPart value);

  /**
   * Returns the value of the '<em><b>Right Consumer</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Consumer</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Consumer</em>' attribute list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLinkConsumerExpression_RightConsumer()
   * @model unique="false"
   * @generated
   */
  EList<String> getRightConsumer();

} // LinkConsumerExpression
