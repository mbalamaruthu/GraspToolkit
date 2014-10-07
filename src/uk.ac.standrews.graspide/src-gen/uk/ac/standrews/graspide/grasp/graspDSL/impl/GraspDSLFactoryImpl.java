/**
 */
package uk.ac.standrews.graspide.grasp.graspDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.standrews.graspide.grasp.graspDSL.AdditiveExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Annotation;
import uk.ac.standrews.graspide.grasp.graspDSL.Architecture;
import uk.ac.standrews.graspide.grasp.graspDSL.ArchitectureBody;
import uk.ac.standrews.graspide.grasp.graspDSL.ArgumentList;
import uk.ac.standrews.graspide.grasp.graspDSL.BOOLEAN_LITERAL;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraspDSLFactoryImpl extends EFactoryImpl implements GraspDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GraspDSLFactory init()
  {
    try
    {
      GraspDSLFactory theGraspDSLFactory = (GraspDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GraspDSLPackage.eNS_URI);
      if (theGraspDSLFactory != null)
      {
        return theGraspDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GraspDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraspDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GraspDSLPackage.GRASP_SPECIFICATION: return createGraspSpecification();
      case GraspDSLPackage.ARCHITECTURE: return createArchitecture();
      case GraspDSLPackage.ARCHITECTURE_BODY: return createArchitectureBody();
      case GraspDSLPackage.DECLARATION_START: return createDeclarationStart();
      case GraspDSLPackage.DECLARATION_END: return createDeclarationEnd();
      case GraspDSLPackage.DECLARATION: return createDeclaration();
      case GraspDSLPackage.REQUIREMENT_OR_QUALITY: return createRequirementOrQuality();
      case GraspDSLPackage.REQUIREMENT: return createRequirement();
      case GraspDSLPackage.QATTRIBUTE: return createQattribute();
      case GraspDSLPackage.RATIONALE: return createRationale();
      case GraspDSLPackage.REASON: return createReason();
      case GraspDSLPackage.TEMPLATE: return createTemplate();
      case GraspDSLPackage.TEMPLATE_CONSTITUENT: return createTemplateConstituent();
      case GraspDSLPackage.PROVIDES: return createProvides();
      case GraspDSLPackage.PROVIDES_CONSTITUENT: return createProvidesConstituent();
      case GraspDSLPackage.REQUIRES: return createRequires();
      case GraspDSLPackage.REQUIRES_CONSTITUENT: return createRequiresConstituent();
      case GraspDSLPackage.PROPERTY: return createProperty();
      case GraspDSLPackage.CHECK: return createCheck();
      case GraspDSLPackage.SYSTEM: return createSystem();
      case GraspDSLPackage.SYSTEM_CONSTITUENT: return createSystemConstituent();
      case GraspDSLPackage.COMPOSITIONAL: return createCompositional();
      case GraspDSLPackage.LAYER: return createLayer();
      case GraspDSLPackage.LAYER_CONSTITUENT: return createLayerConstituent();
      case GraspDSLPackage.COMPONENT: return createComponent();
      case GraspDSLPackage.CONNECTOR: return createConnector();
      case GraspDSLPackage.INSTANTIABLE_CONSTITUENT: return createInstantiableConstituent();
      case GraspDSLPackage.LINK: return createLink();
      case GraspDSLPackage.LINK_CONSTITUENT: return createLinkConstituent();
      case GraspDSLPackage.LINK_CONSUMER_EXPRESSION: return createLinkConsumerExpression();
      case GraspDSLPackage.LINK_CONSUMER_PART: return createLinkConsumerPart();
      case GraspDSLPackage.LINK_PROVIDERS_LIST: return createLinkProvidersList();
      case GraspDSLPackage.LINK_PROVIDERS: return createLinkProviders();
      case GraspDSLPackage.LINK_PROVIDER_PART: return createLinkProviderPart();
      case GraspDSLPackage.ANNOTATION: return createAnnotation();
      case GraspDSLPackage.NAME_VALUE: return createNameValue();
      case GraspDSLPackage.NAME_VALUES: return createNameValues();
      case GraspDSLPackage.SUPPORTS_CLAUSE: return createSupportsClause();
      case GraspDSLPackage.INHIBITS_CLAUSE: return createInhibitsClause();
      case GraspDSLPackage.BECAUSE_CLAUSE: return createBecauseClause();
      case GraspDSLPackage.BECAUSE_CAUSALCONTEXT: return createBecauseCausalcontext();
      case GraspDSLPackage.PARAMETER_LIST: return createParameterList();
      case GraspDSLPackage.ARGUMENT_LIST: return createArgumentList();
      case GraspDSLPackage.EXPRESSION: return createExpression();
      case GraspDSLPackage.SUBSETOF_EXPRESSION: return createSubsetofExpression();
      case GraspDSLPackage.LOGICAL_OR_EXPRESSION: return createLogicalOrExpression();
      case GraspDSLPackage.LOGICAL_AND_EXPRESSION: return createLogicalAndExpression();
      case GraspDSLPackage.BITWISE_OR_EXPRESSION: return createBitwiseOrExpression();
      case GraspDSLPackage.BITWISE_XOR_EXPRESSION: return createBitwiseXorExpression();
      case GraspDSLPackage.BITWISE_AND_EXPRESSION: return createBitwiseAndExpression();
      case GraspDSLPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case GraspDSLPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
      case GraspDSLPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case GraspDSLPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case GraspDSLPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case GraspDSLPackage.MEMBER_EXPRESSION: return createMemberExpression();
      case GraspDSLPackage.MEMBER_PART: return createMemberPart();
      case GraspDSLPackage.MEMBER_ARGUMENTS: return createMemberArguments();
      case GraspDSLPackage.LITERAL: return createLiteral();
      case GraspDSLPackage.SET_LITERAL: return createSetLiteral();
      case GraspDSLPackage.BOOLEAN_LITERAL: return createBOOLEAN_LITERAL();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraspSpecification createGraspSpecification()
  {
    GraspSpecificationImpl graspSpecification = new GraspSpecificationImpl();
    return graspSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Architecture createArchitecture()
  {
    ArchitectureImpl architecture = new ArchitectureImpl();
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureBody createArchitectureBody()
  {
    ArchitectureBodyImpl architectureBody = new ArchitectureBodyImpl();
    return architectureBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationStart createDeclarationStart()
  {
    DeclarationStartImpl declarationStart = new DeclarationStartImpl();
    return declarationStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationEnd createDeclarationEnd()
  {
    DeclarationEndImpl declarationEnd = new DeclarationEndImpl();
    return declarationEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementOrQuality createRequirementOrQuality()
  {
    RequirementOrQualityImpl requirementOrQuality = new RequirementOrQualityImpl();
    return requirementOrQuality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qattribute createQattribute()
  {
    QattributeImpl qattribute = new QattributeImpl();
    return qattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rationale createRationale()
  {
    RationaleImpl rationale = new RationaleImpl();
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reason createReason()
  {
    ReasonImpl reason = new ReasonImpl();
    return reason;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateConstituent createTemplateConstituent()
  {
    TemplateConstituentImpl templateConstituent = new TemplateConstituentImpl();
    return templateConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Provides createProvides()
  {
    ProvidesImpl provides = new ProvidesImpl();
    return provides;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidesConstituent createProvidesConstituent()
  {
    ProvidesConstituentImpl providesConstituent = new ProvidesConstituentImpl();
    return providesConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requires createRequires()
  {
    RequiresImpl requires = new RequiresImpl();
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiresConstituent createRequiresConstituent()
  {
    RequiresConstituentImpl requiresConstituent = new RequiresConstituentImpl();
    return requiresConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uk.ac.standrews.graspide.grasp.graspDSL.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemConstituent createSystemConstituent()
  {
    SystemConstituentImpl systemConstituent = new SystemConstituentImpl();
    return systemConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compositional createCompositional()
  {
    CompositionalImpl compositional = new CompositionalImpl();
    return compositional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layer createLayer()
  {
    LayerImpl layer = new LayerImpl();
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayerConstituent createLayerConstituent()
  {
    LayerConstituentImpl layerConstituent = new LayerConstituentImpl();
    return layerConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstantiableConstituent createInstantiableConstituent()
  {
    InstantiableConstituentImpl instantiableConstituent = new InstantiableConstituentImpl();
    return instantiableConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkConstituent createLinkConstituent()
  {
    LinkConstituentImpl linkConstituent = new LinkConstituentImpl();
    return linkConstituent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkConsumerExpression createLinkConsumerExpression()
  {
    LinkConsumerExpressionImpl linkConsumerExpression = new LinkConsumerExpressionImpl();
    return linkConsumerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkConsumerPart createLinkConsumerPart()
  {
    LinkConsumerPartImpl linkConsumerPart = new LinkConsumerPartImpl();
    return linkConsumerPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProvidersList createLinkProvidersList()
  {
    LinkProvidersListImpl linkProvidersList = new LinkProvidersListImpl();
    return linkProvidersList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProviders createLinkProviders()
  {
    LinkProvidersImpl linkProviders = new LinkProvidersImpl();
    return linkProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkProviderPart createLinkProviderPart()
  {
    LinkProviderPartImpl linkProviderPart = new LinkProviderPartImpl();
    return linkProviderPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameValue createNameValue()
  {
    NameValueImpl nameValue = new NameValueImpl();
    return nameValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameValues createNameValues()
  {
    NameValuesImpl nameValues = new NameValuesImpl();
    return nameValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportsClause createSupportsClause()
  {
    SupportsClauseImpl supportsClause = new SupportsClauseImpl();
    return supportsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InhibitsClause createInhibitsClause()
  {
    InhibitsClauseImpl inhibitsClause = new InhibitsClauseImpl();
    return inhibitsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecauseClause createBecauseClause()
  {
    BecauseClauseImpl becauseClause = new BecauseClauseImpl();
    return becauseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BecauseCausalcontext createBecauseCausalcontext()
  {
    BecauseCausalcontextImpl becauseCausalcontext = new BecauseCausalcontextImpl();
    return becauseCausalcontext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList createArgumentList()
  {
    ArgumentListImpl argumentList = new ArgumentListImpl();
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubsetofExpression createSubsetofExpression()
  {
    SubsetofExpressionImpl subsetofExpression = new SubsetofExpressionImpl();
    return subsetofExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOrExpression createLogicalOrExpression()
  {
    LogicalOrExpressionImpl logicalOrExpression = new LogicalOrExpressionImpl();
    return logicalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAndExpression createLogicalAndExpression()
  {
    LogicalAndExpressionImpl logicalAndExpression = new LogicalAndExpressionImpl();
    return logicalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseOrExpression createBitwiseOrExpression()
  {
    BitwiseOrExpressionImpl bitwiseOrExpression = new BitwiseOrExpressionImpl();
    return bitwiseOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseXorExpression createBitwiseXorExpression()
  {
    BitwiseXorExpressionImpl bitwiseXorExpression = new BitwiseXorExpressionImpl();
    return bitwiseXorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitwiseAndExpression createBitwiseAndExpression()
  {
    BitwiseAndExpressionImpl bitwiseAndExpression = new BitwiseAndExpressionImpl();
    return bitwiseAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpression createRelationalExpression()
  {
    RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberExpression createMemberExpression()
  {
    MemberExpressionImpl memberExpression = new MemberExpressionImpl();
    return memberExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberPart createMemberPart()
  {
    MemberPartImpl memberPart = new MemberPartImpl();
    return memberPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemberArguments createMemberArguments()
  {
    MemberArgumentsImpl memberArguments = new MemberArgumentsImpl();
    return memberArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetLiteral createSetLiteral()
  {
    SetLiteralImpl setLiteral = new SetLiteralImpl();
    return setLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOLEAN_LITERAL createBOOLEAN_LITERAL()
  {
    BOOLEAN_LITERALImpl booleaN_LITERAL = new BOOLEAN_LITERALImpl();
    return booleaN_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraspDSLPackage getGraspDSLPackage()
  {
    return (GraspDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GraspDSLPackage getPackage()
  {
    return GraspDSLPackage.eINSTANCE;
  }

} //GraspDSLFactoryImpl
