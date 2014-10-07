/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseCausalcontext;
import uk.ac.standrews.graspide.grasp.graspDSL.BecauseClause;
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseAndExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseOrExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.BitwiseXorExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Check;
import uk.ac.standrews.graspide.grasp.graspDSL.Component;
import uk.ac.standrews.graspide.grasp.graspDSL.Compositional;
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.Declaration;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Expression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLFactory;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.InstantiableConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.LayerConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviderPart;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProviders;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkProvidersList;
import uk.ac.standrews.graspide.grasp.graspDSL.Literal;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalAndExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.LogicalOrExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberArguments;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.MemberPart;
import uk.ac.standrews.graspide.grasp.graspDSL.MultiplicativeExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.NameValue;
import uk.ac.standrews.graspide.grasp.graspDSL.NameValues;
import uk.ac.standrews.graspide.grasp.graspDSL.ParameterList;
import uk.ac.standrews.graspide.grasp.graspDSL.PrimaryExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Property;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement;
import uk.ac.standrews.graspide.grasp.graspDSL.RequirementOrQuality;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral;
import uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.SystemConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.graspDSL.TemplateConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraspDSLPackageImpl extends EPackageImpl implements GraspDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graspSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementOrQualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qattributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rationaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reasonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providesConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiresConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass checkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layerConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instantiableConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkConstituentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkConsumerExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkConsumerPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkProvidersListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkProvidersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkProviderPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameValuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supportsClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inhibitsClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass becauseClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass becauseCausalcontextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subsetofExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseXorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitwiseAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalityExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleaN_LITERALEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GraspDSLPackageImpl()
  {
    super(eNS_URI, GraspDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GraspDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GraspDSLPackage init()
  {
    if (isInited) return (GraspDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GraspDSLPackage.eNS_URI);

    // Obtain or create and register package
    GraspDSLPackageImpl theGraspDSLPackage = (GraspDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraspDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraspDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGraspDSLPackage.createPackageContents();

    // Initialize created meta-data
    theGraspDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGraspDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GraspDSLPackage.eNS_URI, theGraspDSLPackage);
    return theGraspDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGraspSpecification()
  {
    return graspSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGraspSpecification_Architecture()
  {
    return (EReference)graspSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitecture()
  {
    return architectureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitecture_Annotation()
  {
    return (EReference)architectureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchitecture_Name()
  {
    return (EAttribute)architectureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitecture_Architecutrebody()
  {
    return (EReference)architectureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitectureBody()
  {
    return architectureBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureBody_Annotation()
  {
    return (EReference)architectureBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureBody_DeclarationStart()
  {
    return (EReference)architectureBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureBody_System()
  {
    return (EReference)architectureBodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureBody_DeclarationEnd()
  {
    return (EReference)architectureBodyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarationStart()
  {
    return declarationStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationStart_Declaration()
  {
    return (EReference)declarationStartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationStart_Annotation()
  {
    return (EReference)declarationStartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarationEnd()
  {
    return declarationEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationEnd_Annotation()
  {
    return (EReference)declarationEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarationEnd_Declaration()
  {
    return (EReference)declarationEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_Name()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementOrQuality()
  {
    return requirementOrQualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_StringLiteral()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQattribute()
  {
    return qattributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQattribute_Expression()
  {
    return (EReference)qattributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQattribute_SupportsClause()
  {
    return (EReference)qattributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRationale()
  {
    return rationaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRationale_ParameterList()
  {
    return (EReference)rationaleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRationale_SuperRationale()
  {
    return (EReference)rationaleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRationale_Reason()
  {
    return (EReference)rationaleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReason()
  {
    return reasonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReason_ReasonAnnotation()
  {
    return (EReference)reasonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReason_Expression()
  {
    return (EReference)reasonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReason_SupportsClause()
  {
    return (EReference)reasonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReason_InhibitsClause()
  {
    return (EReference)reasonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplate()
  {
    return templateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplate_IntegerLiteral()
  {
    return (EAttribute)templateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_ParameterList()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_SuperTemplate()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_TemplateAnnotation()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_TemplateConstituent()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateConstituent()
  {
    return templateConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvides()
  {
    return providesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvides_Value()
  {
    return (EAttribute)providesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvides_Type()
  {
    return (EAttribute)providesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvides_ProvidesConstituent()
  {
    return (EReference)providesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvidesConstituent()
  {
    return providesConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidesConstituent_ProvidesAnnotation()
  {
    return (EReference)providesConstituentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProvidesConstituent_Check()
  {
    return (EReference)providesConstituentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequires()
  {
    return requiresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequires_Type()
  {
    return (EAttribute)requiresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequires_Value()
  {
    return (EAttribute)requiresEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequires_BecauseRequiresClause()
  {
    return (EReference)requiresEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequires_RequiresConstituent()
  {
    return (EReference)requiresEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiresConstituent()
  {
    return requiresConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiresConstituent_RequiresAnnotation()
  {
    return (EReference)requiresConstituentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequiresConstituent_Check()
  {
    return (EReference)requiresConstituentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Expression()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_BecauseClause()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCheck()
  {
    return checkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheck_Expression()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCheck_BecauseClause()
  {
    return (EReference)checkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystem()
  {
    return systemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystem_Name()
  {
    return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_BecauseClause()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_SystemAnnotation()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystem_SystemConstituent()
  {
    return (EReference)systemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemConstituent()
  {
    return systemConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositional()
  {
    return compositionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayer()
  {
    return layerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_SuperLayer()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_LayerAnnotation()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_LayerConstituent()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayerConstituent()
  {
    return layerConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Value()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_ArgumentList()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Annotation()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_InstantiableConstituent()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnector()
  {
    return connectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Value()
  {
    return (EReference)connectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_ArgumentList()
  {
    return (EReference)connectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Annotation()
  {
    return (EReference)connectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_InstantiableConstituent()
  {
    return (EReference)connectorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstantiableConstituent()
  {
    return instantiableConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Type()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_LinkConsumer()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_LinkProviders()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_BecauseClause()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_LinkConstituent()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkConstituent()
  {
    return linkConstituentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkConstituent_Annotation()
  {
    return (EReference)linkConstituentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkConstituent_Check()
  {
    return (EReference)linkConstituentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkConsumerExpression()
  {
    return linkConsumerExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkConsumerExpression_Consumer()
  {
    return (EReference)linkConsumerExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkConsumerExpression_RightConsumer()
  {
    return (EAttribute)linkConsumerExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkConsumerPart()
  {
    return linkConsumerPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkProvidersList()
  {
    return linkProvidersListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkProvidersList_Providers()
  {
    return (EReference)linkProvidersListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkProviders()
  {
    return linkProvidersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkProviders_Provider()
  {
    return (EReference)linkProvidersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkProviders_RightProvider()
  {
    return (EAttribute)linkProvidersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkProviderPart()
  {
    return linkProviderPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkProviderPart_Name()
  {
    return (EAttribute)linkProviderPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkProviderPart_BecauseClause()
  {
    return (EReference)linkProviderPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Annotation()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Value()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameValue()
  {
    return nameValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameValue_NamePair()
  {
    return (EAttribute)nameValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameValue_ValuePair()
  {
    return (EReference)nameValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameValues()
  {
    return nameValuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNameValues_Members()
  {
    return (EReference)nameValuesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupportsClause()
  {
    return supportsClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupportsClause_Value()
  {
    return (EReference)supportsClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInhibitsClause()
  {
    return inhibitsClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInhibitsClause_Value()
  {
    return (EReference)inhibitsClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBecauseClause()
  {
    return becauseClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecauseClause_Members()
  {
    return (EReference)becauseClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBecauseCausalcontext()
  {
    return becauseCausalcontextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecauseCausalcontext_Value()
  {
    return (EReference)becauseCausalcontextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBecauseCausalcontext_ArgumentList()
  {
    return (EReference)becauseCausalcontextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterList_Names()
  {
    return (EAttribute)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentList()
  {
    return argumentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentList_Members()
  {
    return (EReference)argumentListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubsetofExpression()
  {
    return subsetofExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubsetofExpression_LogicalOr()
  {
    return (EReference)subsetofExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalOrExpression()
  {
    return logicalOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalOrExpression_LogicalAnd()
  {
    return (EReference)logicalOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalAndExpression()
  {
    return logicalAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalAndExpression_BitwiseOr()
  {
    return (EReference)logicalAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseOrExpression()
  {
    return bitwiseOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseOrExpression_BitwiseXor()
  {
    return (EReference)bitwiseOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseXorExpression()
  {
    return bitwiseXorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseXorExpression_BitwiseAnd()
  {
    return (EReference)bitwiseXorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitwiseAndExpression()
  {
    return bitwiseAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitwiseAndExpression_Equality()
  {
    return (EReference)bitwiseAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualityExpression()
  {
    return equalityExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualityExpression_Relational()
  {
    return (EReference)equalityExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEqualityExpression_Op()
  {
    return (EAttribute)equalityExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalExpression()
  {
    return relationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExpression_Additive()
  {
    return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationalExpression_Op()
  {
    return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_Multiplicative()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpression_Op()
  {
    return (EAttribute)additiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExpression_Unary()
  {
    return (EReference)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicativeExpression_Op()
  {
    return (EAttribute)multiplicativeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpression_Op()
  {
    return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_Right()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberExpression()
  {
    return memberExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberExpression_Member()
  {
    return (EReference)memberExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberPart()
  {
    return memberPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMemberPart_Name()
  {
    return (EAttribute)memberPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberPart_MemberArguments()
  {
    return (EReference)memberPartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMemberArguments()
  {
    return memberArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMemberArguments_Expression()
  {
    return (EReference)memberArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetLiteral()
  {
    return setLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetLiteral_Literal()
  {
    return (EReference)setLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBOOLEAN_LITERAL()
  {
    return booleaN_LITERALEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraspDSLFactory getGraspDSLFactory()
  {
    return (GraspDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    graspSpecificationEClass = createEClass(GRASP_SPECIFICATION);
    createEReference(graspSpecificationEClass, GRASP_SPECIFICATION__ARCHITECTURE);

    architectureEClass = createEClass(ARCHITECTURE);
    createEReference(architectureEClass, ARCHITECTURE__ANNOTATION);
    createEAttribute(architectureEClass, ARCHITECTURE__NAME);
    createEReference(architectureEClass, ARCHITECTURE__ARCHITECUTREBODY);

    architectureBodyEClass = createEClass(ARCHITECTURE_BODY);
    createEReference(architectureBodyEClass, ARCHITECTURE_BODY__ANNOTATION);
    createEReference(architectureBodyEClass, ARCHITECTURE_BODY__DECLARATION_START);
    createEReference(architectureBodyEClass, ARCHITECTURE_BODY__SYSTEM);
    createEReference(architectureBodyEClass, ARCHITECTURE_BODY__DECLARATION_END);

    declarationStartEClass = createEClass(DECLARATION_START);
    createEReference(declarationStartEClass, DECLARATION_START__DECLARATION);
    createEReference(declarationStartEClass, DECLARATION_START__ANNOTATION);

    declarationEndEClass = createEClass(DECLARATION_END);
    createEReference(declarationEndEClass, DECLARATION_END__ANNOTATION);
    createEReference(declarationEndEClass, DECLARATION_END__DECLARATION);

    declarationEClass = createEClass(DECLARATION);
    createEAttribute(declarationEClass, DECLARATION__NAME);

    requirementOrQualityEClass = createEClass(REQUIREMENT_OR_QUALITY);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__STRING_LITERAL);

    qattributeEClass = createEClass(QATTRIBUTE);
    createEReference(qattributeEClass, QATTRIBUTE__EXPRESSION);
    createEReference(qattributeEClass, QATTRIBUTE__SUPPORTS_CLAUSE);

    rationaleEClass = createEClass(RATIONALE);
    createEReference(rationaleEClass, RATIONALE__PARAMETER_LIST);
    createEReference(rationaleEClass, RATIONALE__SUPER_RATIONALE);
    createEReference(rationaleEClass, RATIONALE__REASON);

    reasonEClass = createEClass(REASON);
    createEReference(reasonEClass, REASON__REASON_ANNOTATION);
    createEReference(reasonEClass, REASON__EXPRESSION);
    createEReference(reasonEClass, REASON__SUPPORTS_CLAUSE);
    createEReference(reasonEClass, REASON__INHIBITS_CLAUSE);

    templateEClass = createEClass(TEMPLATE);
    createEAttribute(templateEClass, TEMPLATE__INTEGER_LITERAL);
    createEReference(templateEClass, TEMPLATE__PARAMETER_LIST);
    createEReference(templateEClass, TEMPLATE__SUPER_TEMPLATE);
    createEReference(templateEClass, TEMPLATE__TEMPLATE_ANNOTATION);
    createEReference(templateEClass, TEMPLATE__TEMPLATE_CONSTITUENT);

    templateConstituentEClass = createEClass(TEMPLATE_CONSTITUENT);

    providesEClass = createEClass(PROVIDES);
    createEAttribute(providesEClass, PROVIDES__VALUE);
    createEAttribute(providesEClass, PROVIDES__TYPE);
    createEReference(providesEClass, PROVIDES__PROVIDES_CONSTITUENT);

    providesConstituentEClass = createEClass(PROVIDES_CONSTITUENT);
    createEReference(providesConstituentEClass, PROVIDES_CONSTITUENT__PROVIDES_ANNOTATION);
    createEReference(providesConstituentEClass, PROVIDES_CONSTITUENT__CHECK);

    requiresEClass = createEClass(REQUIRES);
    createEAttribute(requiresEClass, REQUIRES__TYPE);
    createEAttribute(requiresEClass, REQUIRES__VALUE);
    createEReference(requiresEClass, REQUIRES__BECAUSE_REQUIRES_CLAUSE);
    createEReference(requiresEClass, REQUIRES__REQUIRES_CONSTITUENT);

    requiresConstituentEClass = createEClass(REQUIRES_CONSTITUENT);
    createEReference(requiresConstituentEClass, REQUIRES_CONSTITUENT__REQUIRES_ANNOTATION);
    createEReference(requiresConstituentEClass, REQUIRES_CONSTITUENT__CHECK);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__EXPRESSION);
    createEReference(propertyEClass, PROPERTY__BECAUSE_CLAUSE);

    checkEClass = createEClass(CHECK);
    createEReference(checkEClass, CHECK__EXPRESSION);
    createEReference(checkEClass, CHECK__BECAUSE_CLAUSE);

    systemEClass = createEClass(SYSTEM);
    createEAttribute(systemEClass, SYSTEM__NAME);
    createEReference(systemEClass, SYSTEM__BECAUSE_CLAUSE);
    createEReference(systemEClass, SYSTEM__SYSTEM_ANNOTATION);
    createEReference(systemEClass, SYSTEM__SYSTEM_CONSTITUENT);

    systemConstituentEClass = createEClass(SYSTEM_CONSTITUENT);

    compositionalEClass = createEClass(COMPOSITIONAL);

    layerEClass = createEClass(LAYER);
    createEReference(layerEClass, LAYER__SUPER_LAYER);
    createEReference(layerEClass, LAYER__LAYER_ANNOTATION);
    createEReference(layerEClass, LAYER__LAYER_CONSTITUENT);

    layerConstituentEClass = createEClass(LAYER_CONSTITUENT);

    componentEClass = createEClass(COMPONENT);
    createEReference(componentEClass, COMPONENT__VALUE);
    createEReference(componentEClass, COMPONENT__ARGUMENT_LIST);
    createEReference(componentEClass, COMPONENT__ANNOTATION);
    createEReference(componentEClass, COMPONENT__INSTANTIABLE_CONSTITUENT);

    connectorEClass = createEClass(CONNECTOR);
    createEReference(connectorEClass, CONNECTOR__VALUE);
    createEReference(connectorEClass, CONNECTOR__ARGUMENT_LIST);
    createEReference(connectorEClass, CONNECTOR__ANNOTATION);
    createEReference(connectorEClass, CONNECTOR__INSTANTIABLE_CONSTITUENT);

    instantiableConstituentEClass = createEClass(INSTANTIABLE_CONSTITUENT);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__TYPE);
    createEReference(linkEClass, LINK__LINK_CONSUMER);
    createEReference(linkEClass, LINK__LINK_PROVIDERS);
    createEReference(linkEClass, LINK__BECAUSE_CLAUSE);
    createEReference(linkEClass, LINK__LINK_CONSTITUENT);

    linkConstituentEClass = createEClass(LINK_CONSTITUENT);
    createEReference(linkConstituentEClass, LINK_CONSTITUENT__ANNOTATION);
    createEReference(linkConstituentEClass, LINK_CONSTITUENT__CHECK);

    linkConsumerExpressionEClass = createEClass(LINK_CONSUMER_EXPRESSION);
    createEReference(linkConsumerExpressionEClass, LINK_CONSUMER_EXPRESSION__CONSUMER);
    createEAttribute(linkConsumerExpressionEClass, LINK_CONSUMER_EXPRESSION__RIGHT_CONSUMER);

    linkConsumerPartEClass = createEClass(LINK_CONSUMER_PART);

    linkProvidersListEClass = createEClass(LINK_PROVIDERS_LIST);
    createEReference(linkProvidersListEClass, LINK_PROVIDERS_LIST__PROVIDERS);

    linkProvidersEClass = createEClass(LINK_PROVIDERS);
    createEReference(linkProvidersEClass, LINK_PROVIDERS__PROVIDER);
    createEAttribute(linkProvidersEClass, LINK_PROVIDERS__RIGHT_PROVIDER);

    linkProviderPartEClass = createEClass(LINK_PROVIDER_PART);
    createEAttribute(linkProviderPartEClass, LINK_PROVIDER_PART__NAME);
    createEReference(linkProviderPartEClass, LINK_PROVIDER_PART__BECAUSE_CLAUSE);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__VALUE);

    nameValueEClass = createEClass(NAME_VALUE);
    createEAttribute(nameValueEClass, NAME_VALUE__NAME_PAIR);
    createEReference(nameValueEClass, NAME_VALUE__VALUE_PAIR);

    nameValuesEClass = createEClass(NAME_VALUES);
    createEReference(nameValuesEClass, NAME_VALUES__MEMBERS);

    supportsClauseEClass = createEClass(SUPPORTS_CLAUSE);
    createEReference(supportsClauseEClass, SUPPORTS_CLAUSE__VALUE);

    inhibitsClauseEClass = createEClass(INHIBITS_CLAUSE);
    createEReference(inhibitsClauseEClass, INHIBITS_CLAUSE__VALUE);

    becauseClauseEClass = createEClass(BECAUSE_CLAUSE);
    createEReference(becauseClauseEClass, BECAUSE_CLAUSE__MEMBERS);

    becauseCausalcontextEClass = createEClass(BECAUSE_CAUSALCONTEXT);
    createEReference(becauseCausalcontextEClass, BECAUSE_CAUSALCONTEXT__VALUE);
    createEReference(becauseCausalcontextEClass, BECAUSE_CAUSALCONTEXT__ARGUMENT_LIST);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEAttribute(parameterListEClass, PARAMETER_LIST__NAMES);

    argumentListEClass = createEClass(ARGUMENT_LIST);
    createEReference(argumentListEClass, ARGUMENT_LIST__MEMBERS);

    expressionEClass = createEClass(EXPRESSION);

    subsetofExpressionEClass = createEClass(SUBSETOF_EXPRESSION);
    createEReference(subsetofExpressionEClass, SUBSETOF_EXPRESSION__LOGICAL_OR);

    logicalOrExpressionEClass = createEClass(LOGICAL_OR_EXPRESSION);
    createEReference(logicalOrExpressionEClass, LOGICAL_OR_EXPRESSION__LOGICAL_AND);

    logicalAndExpressionEClass = createEClass(LOGICAL_AND_EXPRESSION);
    createEReference(logicalAndExpressionEClass, LOGICAL_AND_EXPRESSION__BITWISE_OR);

    bitwiseOrExpressionEClass = createEClass(BITWISE_OR_EXPRESSION);
    createEReference(bitwiseOrExpressionEClass, BITWISE_OR_EXPRESSION__BITWISE_XOR);

    bitwiseXorExpressionEClass = createEClass(BITWISE_XOR_EXPRESSION);
    createEReference(bitwiseXorExpressionEClass, BITWISE_XOR_EXPRESSION__BITWISE_AND);

    bitwiseAndExpressionEClass = createEClass(BITWISE_AND_EXPRESSION);
    createEReference(bitwiseAndExpressionEClass, BITWISE_AND_EXPRESSION__EQUALITY);

    equalityExpressionEClass = createEClass(EQUALITY_EXPRESSION);
    createEReference(equalityExpressionEClass, EQUALITY_EXPRESSION__RELATIONAL);
    createEAttribute(equalityExpressionEClass, EQUALITY_EXPRESSION__OP);

    relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
    createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__ADDITIVE);
    createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OP);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__MULTIPLICATIVE);
    createEAttribute(additiveExpressionEClass, ADDITIVE_EXPRESSION__OP);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEReference(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__UNARY);
    createEAttribute(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__OP);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OP);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__RIGHT);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);

    memberExpressionEClass = createEClass(MEMBER_EXPRESSION);
    createEReference(memberExpressionEClass, MEMBER_EXPRESSION__MEMBER);

    memberPartEClass = createEClass(MEMBER_PART);
    createEAttribute(memberPartEClass, MEMBER_PART__NAME);
    createEReference(memberPartEClass, MEMBER_PART__MEMBER_ARGUMENTS);

    memberArgumentsEClass = createEClass(MEMBER_ARGUMENTS);
    createEReference(memberArgumentsEClass, MEMBER_ARGUMENTS__EXPRESSION);

    literalEClass = createEClass(LITERAL);

    setLiteralEClass = createEClass(SET_LITERAL);
    createEReference(setLiteralEClass, SET_LITERAL__LITERAL);

    booleaN_LITERALEClass = createEClass(BOOLEAN_LITERAL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    requirementOrQualityEClass.getESuperTypes().add(this.getDeclaration());
    requirementEClass.getESuperTypes().add(this.getRequirementOrQuality());
    qattributeEClass.getESuperTypes().add(this.getRequirementOrQuality());
    rationaleEClass.getESuperTypes().add(this.getDeclaration());
    templateEClass.getESuperTypes().add(this.getDeclaration());
    templateEClass.getESuperTypes().add(this.getTemplateConstituent());
    providesEClass.getESuperTypes().add(this.getTemplateConstituent());
    providesEClass.getESuperTypes().add(this.getLinkProviderPart());
    requiresEClass.getESuperTypes().add(this.getTemplateConstituent());
    requiresEClass.getESuperTypes().add(this.getLinkConsumerPart());
    propertyEClass.getESuperTypes().add(this.getTemplateConstituent());
    checkEClass.getESuperTypes().add(this.getTemplateConstituent());
    checkEClass.getESuperTypes().add(this.getSystemConstituent());
    checkEClass.getESuperTypes().add(this.getLayerConstituent());
    checkEClass.getESuperTypes().add(this.getInstantiableConstituent());
    compositionalEClass.getESuperTypes().add(this.getSystemConstituent());
    compositionalEClass.getESuperTypes().add(this.getLayerConstituent());
    compositionalEClass.getESuperTypes().add(this.getInstantiableConstituent());
    layerEClass.getESuperTypes().add(this.getCompositional());
    layerEClass.getESuperTypes().add(this.getLinkConsumerPart());
    layerEClass.getESuperTypes().add(this.getLinkProviderPart());
    componentEClass.getESuperTypes().add(this.getCompositional());
    componentEClass.getESuperTypes().add(this.getLinkConsumerPart());
    componentEClass.getESuperTypes().add(this.getLinkProviderPart());
    connectorEClass.getESuperTypes().add(this.getCompositional());
    connectorEClass.getESuperTypes().add(this.getLinkConsumerPart());
    connectorEClass.getESuperTypes().add(this.getLinkProviderPart());
    linkEClass.getESuperTypes().add(this.getCompositional());
    expressionEClass.getESuperTypes().add(this.getPrimaryExpression());
    subsetofExpressionEClass.getESuperTypes().add(this.getExpression());
    memberExpressionEClass.getESuperTypes().add(this.getPrimaryExpression());
    literalEClass.getESuperTypes().add(this.getPrimaryExpression());
    setLiteralEClass.getESuperTypes().add(this.getLiteral());
    booleaN_LITERALEClass.getESuperTypes().add(this.getLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(graspSpecificationEClass, GraspSpecification.class, "GraspSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGraspSpecification_Architecture(), this.getArchitecture(), null, "architecture", null, 0, 1, GraspSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArchitecture_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArchitecture_Name(), ecorePackage.getEString(), "name", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitecture_Architecutrebody(), this.getArchitectureBody(), null, "architecutrebody", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(architectureBodyEClass, ArchitectureBody.class, "ArchitectureBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArchitectureBody_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, ArchitectureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureBody_DeclarationStart(), this.getDeclarationStart(), null, "declarationStart", null, 0, 1, ArchitectureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureBody_System(), this.getSystem(), null, "system", null, 0, 1, ArchitectureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureBody_DeclarationEnd(), this.getDeclarationEnd(), null, "declarationEnd", null, 0, 1, ArchitectureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationStartEClass, DeclarationStart.class, "DeclarationStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarationStart_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, DeclarationStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationStart_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, DeclarationStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEndEClass, DeclarationEnd.class, "DeclarationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarationEnd_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, DeclarationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarationEnd_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, DeclarationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementOrQualityEClass, RequirementOrQuality.class, "RequirementOrQuality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_StringLiteral(), ecorePackage.getEString(), "stringLiteral", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qattributeEClass, Qattribute.class, "Qattribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQattribute_Expression(), this.getExpression(), null, "expression", null, 0, 1, Qattribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQattribute_SupportsClause(), this.getSupportsClause(), null, "supportsClause", null, 0, 1, Qattribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRationale_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRationale_SuperRationale(), this.getRationale(), null, "superRationale", null, 0, 1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRationale_Reason(), this.getReason(), null, "reason", null, 0, -1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reasonEClass, Reason.class, "Reason", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReason_ReasonAnnotation(), this.getAnnotation(), null, "reasonAnnotation", null, 0, -1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReason_Expression(), this.getExpression(), null, "expression", null, 0, 1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReason_SupportsClause(), this.getSupportsClause(), null, "supportsClause", null, 0, 1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReason_InhibitsClause(), this.getInhibitsClause(), null, "inhibitsClause", null, 0, 1, Reason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplate_IntegerLiteral(), ecorePackage.getEString(), "integerLiteral", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplate_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplate_SuperTemplate(), this.getTemplate(), null, "superTemplate", null, 0, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplate_TemplateAnnotation(), this.getAnnotation(), null, "templateAnnotation", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplate_TemplateConstituent(), this.getTemplateConstituent(), null, "templateConstituent", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateConstituentEClass, TemplateConstituent.class, "TemplateConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(providesEClass, Provides.class, "Provides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvides_Value(), ecorePackage.getEString(), "value", null, 0, 1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvides_Type(), ecorePackage.getEString(), "type", null, 0, 1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvides_ProvidesConstituent(), this.getProvidesConstituent(), null, "providesConstituent", null, 0, -1, Provides.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providesConstituentEClass, ProvidesConstituent.class, "ProvidesConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProvidesConstituent_ProvidesAnnotation(), this.getAnnotation(), null, "providesAnnotation", null, 0, -1, ProvidesConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProvidesConstituent_Check(), this.getCheck(), null, "check", null, 0, 1, ProvidesConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequires_Type(), ecorePackage.getEString(), "type", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequires_Value(), ecorePackage.getEString(), "value", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequires_BecauseRequiresClause(), this.getBecauseClause(), null, "becauseRequiresClause", null, 0, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequires_RequiresConstituent(), this.getRequiresConstituent(), null, "requiresConstituent", null, 0, -1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requiresConstituentEClass, RequiresConstituent.class, "RequiresConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequiresConstituent_RequiresAnnotation(), this.getAnnotation(), null, "requiresAnnotation", null, 0, -1, RequiresConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequiresConstituent_Check(), this.getCheck(), null, "check", null, 0, 1, RequiresConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Expression(), this.getExpression(), null, "expression", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_BecauseClause(), this.getBecauseClause(), null, "becauseClause", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCheck_Expression(), this.getExpression(), null, "expression", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCheck_BecauseClause(), this.getBecauseClause(), null, "becauseClause", null, 0, 1, Check.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemEClass, uk.ac.standrews.graspide.grasp.graspDSL.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, uk.ac.standrews.graspide.grasp.graspDSL.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_BecauseClause(), this.getBecauseClause(), null, "becauseClause", null, 0, 1, uk.ac.standrews.graspide.grasp.graspDSL.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_SystemAnnotation(), this.getAnnotation(), null, "systemAnnotation", null, 0, -1, uk.ac.standrews.graspide.grasp.graspDSL.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystem_SystemConstituent(), this.getSystemConstituent(), null, "systemConstituent", null, 0, -1, uk.ac.standrews.graspide.grasp.graspDSL.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemConstituentEClass, SystemConstituent.class, "SystemConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compositionalEClass, Compositional.class, "Compositional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLayer_SuperLayer(), this.getLayer(), null, "superLayer", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_LayerAnnotation(), this.getAnnotation(), null, "layerAnnotation", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_LayerConstituent(), this.getLayerConstituent(), null, "layerConstituent", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layerConstituentEClass, LayerConstituent.class, "LayerConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponent_Value(), this.getTemplate(), null, "value", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_InstantiableConstituent(), this.getInstantiableConstituent(), null, "instantiableConstituent", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConnector_Value(), this.getTemplate(), null, "value", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnector_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnector_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnector_InstantiableConstituent(), this.getInstantiableConstituent(), null, "instantiableConstituent", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instantiableConstituentEClass, InstantiableConstituent.class, "InstantiableConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLink_Type(), ecorePackage.getEString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_LinkConsumer(), this.getLinkConsumerExpression(), null, "linkConsumer", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_LinkProviders(), this.getLinkProvidersList(), null, "linkProviders", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_BecauseClause(), this.getBecauseClause(), null, "becauseClause", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_LinkConstituent(), this.getLinkConstituent(), null, "linkConstituent", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkConstituentEClass, LinkConstituent.class, "LinkConstituent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkConstituent_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, LinkConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinkConstituent_Check(), this.getCheck(), null, "check", null, 0, 1, LinkConstituent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkConsumerExpressionEClass, LinkConsumerExpression.class, "LinkConsumerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkConsumerExpression_Consumer(), this.getLinkConsumerPart(), null, "consumer", null, 0, 1, LinkConsumerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinkConsumerExpression_RightConsumer(), ecorePackage.getEString(), "rightConsumer", null, 0, -1, LinkConsumerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkConsumerPartEClass, LinkConsumerPart.class, "LinkConsumerPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linkProvidersListEClass, LinkProvidersList.class, "LinkProvidersList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkProvidersList_Providers(), this.getLinkProviders(), null, "providers", null, 0, -1, LinkProvidersList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkProvidersEClass, LinkProviders.class, "LinkProviders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkProviders_Provider(), this.getLinkProviderPart(), null, "provider", null, 0, 1, LinkProviders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinkProviders_RightProvider(), ecorePackage.getEString(), "rightProvider", null, 0, -1, LinkProviders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkProviderPartEClass, LinkProviderPart.class, "LinkProviderPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkProviderPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, LinkProviderPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinkProviderPart_BecauseClause(), this.getBecauseClause(), null, "becauseClause", null, 0, 1, LinkProviderPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotation_Value(), this.getNameValues(), null, "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameValueEClass, NameValue.class, "NameValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameValue_NamePair(), ecorePackage.getEString(), "namePair", null, 0, 1, NameValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameValue_ValuePair(), this.getExpression(), null, "valuePair", null, 0, 1, NameValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameValuesEClass, NameValues.class, "NameValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameValues_Members(), this.getNameValue(), null, "members", null, 0, -1, NameValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(supportsClauseEClass, SupportsClause.class, "SupportsClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupportsClause_Value(), this.getRequirementOrQuality(), null, "value", null, 0, -1, SupportsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inhibitsClauseEClass, InhibitsClause.class, "InhibitsClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInhibitsClause_Value(), this.getRequirementOrQuality(), null, "value", null, 0, -1, InhibitsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(becauseClauseEClass, BecauseClause.class, "BecauseClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBecauseClause_Members(), this.getBecauseCausalcontext(), null, "members", null, 0, -1, BecauseClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(becauseCausalcontextEClass, BecauseCausalcontext.class, "BecauseCausalcontext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBecauseCausalcontext_Value(), this.getRationale(), null, "value", null, 0, 1, BecauseCausalcontext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBecauseCausalcontext_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, BecauseCausalcontext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterList_Names(), ecorePackage.getEString(), "names", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentListEClass, ArgumentList.class, "ArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgumentList_Members(), this.getMemberExpression(), null, "members", null, 0, -1, ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subsetofExpressionEClass, SubsetofExpression.class, "SubsetofExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubsetofExpression_LogicalOr(), this.getLogicalOrExpression(), null, "logicalOr", null, 0, -1, SubsetofExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalOrExpressionEClass, LogicalOrExpression.class, "LogicalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalOrExpression_LogicalAnd(), this.getLogicalAndExpression(), null, "logicalAnd", null, 0, -1, LogicalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalAndExpressionEClass, LogicalAndExpression.class, "LogicalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalAndExpression_BitwiseOr(), this.getBitwiseOrExpression(), null, "bitwiseOr", null, 0, -1, LogicalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitwiseOrExpressionEClass, BitwiseOrExpression.class, "BitwiseOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitwiseOrExpression_BitwiseXor(), this.getBitwiseXorExpression(), null, "bitwiseXor", null, 0, -1, BitwiseOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitwiseXorExpressionEClass, BitwiseXorExpression.class, "BitwiseXorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitwiseXorExpression_BitwiseAnd(), this.getBitwiseAndExpression(), null, "bitwiseAnd", null, 0, -1, BitwiseXorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitwiseAndExpressionEClass, BitwiseAndExpression.class, "BitwiseAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitwiseAndExpression_Equality(), this.getEqualityExpression(), null, "equality", null, 0, -1, BitwiseAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalityExpressionEClass, EqualityExpression.class, "EqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEqualityExpression_Relational(), this.getRelationalExpression(), null, "relational", null, 0, -1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEqualityExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, EqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationalExpression_Additive(), this.getAdditiveExpression(), null, "additive", null, 0, -1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationalExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpression_Multiplicative(), this.getMultiplicativeExpression(), null, "multiplicative", null, 0, -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditiveExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpression_Unary(), this.getUnaryExpression(), null, "unary", null, 0, -1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicativeExpression_Op(), ecorePackage.getEString(), "op", null, 0, -1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_Right(), this.getPrimaryExpression(), null, "right", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(memberExpressionEClass, MemberExpression.class, "MemberExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMemberExpression_Member(), this.getMemberPart(), null, "member", null, 0, -1, MemberExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberPartEClass, MemberPart.class, "MemberPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemberPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, MemberPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemberPart_MemberArguments(), this.getMemberArguments(), null, "memberArguments", null, 0, 1, MemberPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberArgumentsEClass, MemberArguments.class, "MemberArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMemberArguments_Expression(), this.getExpression(), null, "expression", null, 0, -1, MemberArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetLiteral_Literal(), this.getLiteral(), null, "literal", null, 0, -1, SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleaN_LITERALEClass, uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL.class, "BOOLEAN_LITERAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GraspDSLPackageImpl
