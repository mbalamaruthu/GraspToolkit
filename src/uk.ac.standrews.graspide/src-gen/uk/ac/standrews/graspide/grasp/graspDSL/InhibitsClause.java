/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inhibits Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getInhibitsClause()
 * @model
 * @generated
 */
public interface InhibitsClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getInhibitsClause_Value()
   * @model
   * @generated
   */
  EList<RequirementOrQuality> getValue();

} // InhibitsClause
