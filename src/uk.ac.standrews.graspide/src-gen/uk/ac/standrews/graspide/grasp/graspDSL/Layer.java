/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer#getSuperLayer <em>Super Layer</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer#getLayerAnnotation <em>Layer Annotation</em>}</li>
 *   <li>{@link uk.ac.standrews.graspide.grasp.graspDSL.Layer#getLayerConstituent <em>Layer Constituent</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends Compositional, LinkConsumerPart, LinkProviderPart
{
  /**
   * Returns the value of the '<em><b>Super Layer</b></em>' reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Layer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Layer</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Layer</em>' reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLayer_SuperLayer()
   * @model
   * @generated
   */
  EList<Layer> getSuperLayer();

  /**
   * Returns the value of the '<em><b>Layer Annotation</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Annotation</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLayer_LayerAnnotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getLayerAnnotation();

  /**
   * Returns the value of the '<em><b>Layer Constituent</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer Constituent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Constituent</em>' containment reference list.
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#getLayer_LayerConstituent()
   * @model containment="true"
   * @generated
   */
  EList<LayerConstituent> getLayerConstituent();

} // Layer
