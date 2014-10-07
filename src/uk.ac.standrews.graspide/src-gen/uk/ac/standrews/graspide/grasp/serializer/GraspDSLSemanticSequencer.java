package uk.ac.standrews.graspide.grasp.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
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
import uk.ac.standrews.graspide.grasp.graspDSL.Connector;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationEnd;
import uk.ac.standrews.graspide.grasp.graspDSL.DeclarationStart;
import uk.ac.standrews.graspide.grasp.graspDSL.EqualityExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspDSLPackage;
import uk.ac.standrews.graspide.grasp.graspDSL.GraspSpecification;
import uk.ac.standrews.graspide.grasp.graspDSL.InhibitsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Layer;
import uk.ac.standrews.graspide.grasp.graspDSL.Link;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.LinkConsumerExpression;
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
import uk.ac.standrews.graspide.grasp.graspDSL.Property;
import uk.ac.standrews.graspide.grasp.graspDSL.Provides;
import uk.ac.standrews.graspide.grasp.graspDSL.ProvidesConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.Qattribute;
import uk.ac.standrews.graspide.grasp.graspDSL.Rationale;
import uk.ac.standrews.graspide.grasp.graspDSL.Reason;
import uk.ac.standrews.graspide.grasp.graspDSL.RelationalExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.Requirement;
import uk.ac.standrews.graspide.grasp.graspDSL.Requires;
import uk.ac.standrews.graspide.grasp.graspDSL.RequiresConstituent;
import uk.ac.standrews.graspide.grasp.graspDSL.SetLiteral;
import uk.ac.standrews.graspide.grasp.graspDSL.SubsetofExpression;
import uk.ac.standrews.graspide.grasp.graspDSL.SupportsClause;
import uk.ac.standrews.graspide.grasp.graspDSL.Template;
import uk.ac.standrews.graspide.grasp.graspDSL.UnaryExpression;
import uk.ac.standrews.graspide.grasp.services.GraspDSLGrammarAccess;

@SuppressWarnings("all")
public class GraspDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GraspDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GraspDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GraspDSLPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.ARCHITECTURE:
				if(context == grammarAccess.getArchitectureRule()) {
					sequence_Architecture(context, (Architecture) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.ARCHITECTURE_BODY:
				if(context == grammarAccess.getArchitectureBodyRule()) {
					sequence_ArchitectureBody(context, (ArchitectureBody) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.ARGUMENT_LIST:
				if(context == grammarAccess.getArgumentListRule()) {
					sequence_ArgumentList(context, (ArgumentList) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBOOLEAN_LITERALRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_BOOLEAN_LITERAL(context, (BOOLEAN_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.BECAUSE_CAUSALCONTEXT:
				if(context == grammarAccess.getBecauseCausalcontextRule()) {
					sequence_BecauseCausalcontext(context, (BecauseCausalcontext) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.BECAUSE_CLAUSE:
				if(context == grammarAccess.getBecauseClauseRule()) {
					sequence_BecauseClause(context, (BecauseClause) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.BITWISE_AND_EXPRESSION:
				if(context == grammarAccess.getBitwiseAndExpressionRule()) {
					sequence_BitwiseAndExpression(context, (BitwiseAndExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.BITWISE_OR_EXPRESSION:
				if(context == grammarAccess.getBitwiseOrExpressionRule()) {
					sequence_BitwiseOrExpression(context, (BitwiseOrExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.BITWISE_XOR_EXPRESSION:
				if(context == grammarAccess.getBitwiseXorExpressionRule()) {
					sequence_BitwiseXorExpression(context, (BitwiseXorExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.CHECK:
				if(context == grammarAccess.getCheckRule() ||
				   context == grammarAccess.getInstantiableConstituentRule() ||
				   context == grammarAccess.getLayerConstituentRule() ||
				   context == grammarAccess.getSystemConstituentRule() ||
				   context == grammarAccess.getTemplateConstituentRule()) {
					sequence_Check(context, (Check) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getCompositionalRule() ||
				   context == grammarAccess.getInstantiableConstituentRule() ||
				   context == grammarAccess.getLayerConstituentRule() ||
				   context == grammarAccess.getLinkConsumerPartRule() ||
				   context == grammarAccess.getLinkProviderPartRule() ||
				   context == grammarAccess.getSystemConstituentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.CONNECTOR:
				if(context == grammarAccess.getCompositionalRule() ||
				   context == grammarAccess.getConnectorRule() ||
				   context == grammarAccess.getInstantiableConstituentRule() ||
				   context == grammarAccess.getLayerConstituentRule() ||
				   context == grammarAccess.getLinkConsumerPartRule() ||
				   context == grammarAccess.getLinkProviderPartRule() ||
				   context == grammarAccess.getSystemConstituentRule()) {
					sequence_Connector(context, (Connector) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.DECLARATION_END:
				if(context == grammarAccess.getDeclarationEndRule()) {
					sequence_DeclarationEnd(context, (DeclarationEnd) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.DECLARATION_START:
				if(context == grammarAccess.getDeclarationStartRule()) {
					sequence_DeclarationStart(context, (DeclarationStart) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getEqualityExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.GRASP_SPECIFICATION:
				if(context == grammarAccess.getGraspSpecificationRule()) {
					sequence_GraspSpecification(context, (GraspSpecification) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.INHIBITS_CLAUSE:
				if(context == grammarAccess.getInhibitsClauseRule()) {
					sequence_InhibitsClause(context, (InhibitsClause) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LAYER:
				if(context == grammarAccess.getCompositionalRule() ||
				   context == grammarAccess.getInstantiableConstituentRule() ||
				   context == grammarAccess.getLayerRule() ||
				   context == grammarAccess.getLayerConstituentRule() ||
				   context == grammarAccess.getLinkConsumerPartRule() ||
				   context == grammarAccess.getLinkProviderPartRule() ||
				   context == grammarAccess.getSystemConstituentRule()) {
					sequence_Layer(context, (Layer) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LINK:
				if(context == grammarAccess.getCompositionalRule() ||
				   context == grammarAccess.getInstantiableConstituentRule() ||
				   context == grammarAccess.getLayerConstituentRule() ||
				   context == grammarAccess.getLinkRule() ||
				   context == grammarAccess.getSystemConstituentRule()) {
					sequence_Link(context, (Link) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LINK_CONSTITUENT:
				if(context == grammarAccess.getLinkConstituentRule()) {
					sequence_LinkConstituent(context, (LinkConstituent) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LINK_CONSUMER_EXPRESSION:
				if(context == grammarAccess.getLinkConsumerExpressionRule()) {
					sequence_LinkConsumerExpression(context, (LinkConsumerExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LINK_PROVIDERS:
				if(context == grammarAccess.getLinkProvidersRule()) {
					sequence_LinkProviders(context, (LinkProviders) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LINK_PROVIDERS_LIST:
				if(context == grammarAccess.getLinkProvidersListRule()) {
					sequence_LinkProvidersList(context, (LinkProvidersList) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LOGICAL_AND_EXPRESSION:
				if(context == grammarAccess.getLogicalAndExpressionRule()) {
					sequence_LogicalAndExpression(context, (LogicalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.LOGICAL_OR_EXPRESSION:
				if(context == grammarAccess.getLogicalOrExpressionRule()) {
					sequence_LogicalOrExpression(context, (LogicalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.MEMBER_ARGUMENTS:
				if(context == grammarAccess.getMemberArgumentsRule()) {
					sequence_MemberArguments(context, (MemberArguments) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.MEMBER_EXPRESSION:
				if(context == grammarAccess.getMemberExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_MemberExpression(context, (MemberExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.MEMBER_PART:
				if(context == grammarAccess.getMemberPartRule()) {
					sequence_MemberPart(context, (MemberPart) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getMultiplicativeExpressionRule()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.NAME_VALUE:
				if(context == grammarAccess.getNameValueRule()) {
					sequence_NameValue(context, (NameValue) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.NAME_VALUES:
				if(context == grammarAccess.getNameValuesRule()) {
					sequence_NameValues(context, (NameValues) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameterListRule()) {
					sequence_ParameterList(context, (ParameterList) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule() ||
				   context == grammarAccess.getTemplateConstituentRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.PROVIDES:
				if(context == grammarAccess.getLinkProviderPartRule() ||
				   context == grammarAccess.getProvidesRule() ||
				   context == grammarAccess.getTemplateConstituentRule()) {
					sequence_Provides(context, (Provides) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.PROVIDES_CONSTITUENT:
				if(context == grammarAccess.getProvidesConstituentRule()) {
					sequence_ProvidesConstituent(context, (ProvidesConstituent) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.QATTRIBUTE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getQattributeRule() ||
				   context == grammarAccess.getRequirementOrQualityRule()) {
					sequence_Qattribute(context, (Qattribute) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.RATIONALE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getRationaleRule()) {
					sequence_Rationale(context, (Rationale) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.REASON:
				if(context == grammarAccess.getReasonRule()) {
					sequence_Reason(context, (Reason) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getRelationalExpressionRule()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.REQUIREMENT:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getRequirementRule() ||
				   context == grammarAccess.getRequirementOrQualityRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.REQUIRES:
				if(context == grammarAccess.getLinkConsumerPartRule() ||
				   context == grammarAccess.getRequiresRule() ||
				   context == grammarAccess.getTemplateConstituentRule()) {
					sequence_Requires(context, (Requires) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.REQUIRES_CONSTITUENT:
				if(context == grammarAccess.getRequiresConstituentRule()) {
					sequence_RequiresConstituent(context, (RequiresConstituent) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.SET_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSetLiteralRule()) {
					sequence_SetLiteral(context, (SetLiteral) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.SUBSETOF_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSubsetofExpressionRule()) {
					sequence_SubsetofExpression(context, (SubsetofExpression) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.SUPPORTS_CLAUSE:
				if(context == grammarAccess.getSupportsClauseRule()) {
					sequence_SupportsClause(context, (SupportsClause) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.SYSTEM:
				if(context == grammarAccess.getSystemRule()) {
					sequence_System(context, (uk.ac.standrews.graspide.grasp.graspDSL.System) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.TEMPLATE:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getTemplateRule() ||
				   context == grammarAccess.getTemplateConstituentRule()) {
					sequence_Template(context, (Template) semanticObject); 
					return; 
				}
				else break;
			case GraspDSLPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (multiplicative+=MultiplicativeExpression ((op+='+' | op+='-') multiplicative+=MultiplicativeExpression)*)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=ID? value=NameValues)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* declarationStart=DeclarationStart system=System declarationEnd=DeclarationEnd)
	 */
	protected void sequence_ArchitectureBody(EObject context, ArchitectureBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=ID architecutrebody=ArchitectureBody)
	 */
	protected void sequence_Architecture(EObject context, Architecture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=MemberExpression members+=MemberExpression*)
	 */
	protected void sequence_ArgumentList(EObject context, ArgumentList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BOOLEAN_LITERAL}
	 */
	protected void sequence_BOOLEAN_LITERAL(EObject context, BOOLEAN_LITERAL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=[Rationale|ID] argumentList=ArgumentList?)
	 */
	protected void sequence_BecauseCausalcontext(EObject context, BecauseCausalcontext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=BecauseCausalcontext members+=BecauseCausalcontext*)
	 */
	protected void sequence_BecauseClause(EObject context, BecauseClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (equality+=EqualityExpression equality+=EqualityExpression*)
	 */
	protected void sequence_BitwiseAndExpression(EObject context, BitwiseAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bitwiseXor+=BitwiseXorExpression bitwiseXor+=BitwiseXorExpression*)
	 */
	protected void sequence_BitwiseOrExpression(EObject context, BitwiseOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bitwiseAnd+=BitwiseAndExpression bitwiseAnd+=BitwiseAndExpression*)
	 */
	protected void sequence_BitwiseXorExpression(EObject context, BitwiseXorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression becauseClause=BecauseClause?)
	 */
	protected void sequence_Check(EObject context, Check semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         value=[Template|ID] 
	 *         argumentList=ArgumentList? 
	 *         becauseClause=BecauseClause? 
	 *         (annotation+=Annotation* instantiableConstituent+=InstantiableConstituent)*
	 *     )
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         value=[Template|ID] 
	 *         argumentList=ArgumentList? 
	 *         becauseClause=BecauseClause? 
	 *         (annotation+=Annotation* instantiableConstituent+=InstantiableConstituent)*
	 *     )
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotation+=Annotation* declaration+=Declaration)*)
	 */
	protected void sequence_DeclarationEnd(EObject context, DeclarationEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((declaration+=Declaration annotation+=Annotation*)*)
	 */
	protected void sequence_DeclarationStart(EObject context, DeclarationStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relational+=RelationalExpression ((op+='==' | op+='!=') relational+=RelationalExpression)*)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     architecture=Architecture
	 */
	protected void sequence_GraspSpecification(EObject context, GraspSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GraspDSLPackage.Literals.GRASP_SPECIFICATION__ARCHITECTURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraspDSLPackage.Literals.GRASP_SPECIFICATION__ARCHITECTURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGraspSpecificationAccess().getArchitectureArchitectureParserRuleCall_0(), semanticObject.getArchitecture());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value+=[RequirementOrQuality|ID] value+=[RequirementOrQuality|ID]*)
	 */
	protected void sequence_InhibitsClause(EObject context, InhibitsClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (superLayer+=[Layer|ID] superLayer+=[Layer|ID]*)? 
	 *         becauseClause=BecauseClause? 
	 *         (layerAnnotation+=Annotation* layerConstituent+=LayerConstituent)*
	 *     )
	 */
	protected void sequence_Layer(EObject context, Layer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* check=Check)
	 */
	protected void sequence_LinkConstituent(EObject context, LinkConstituent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (consumer=[LinkConsumerPart|ID] (rightConsumer+=ID | rightConsumer+='out')*)
	 */
	protected void sequence_LinkConsumerExpression(EObject context, LinkConsumerExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (providers+=LinkProviders providers+=LinkProviders*)
	 */
	protected void sequence_LinkProvidersList(EObject context, LinkProvidersList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (provider=[LinkProviderPart|ID] (rightProvider+=ID | rightProvider+='in')*)
	 */
	protected void sequence_LinkProviders(EObject context, LinkProviders semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID? linkConsumer=LinkConsumerExpression linkProviders=LinkProvidersList becauseClause=BecauseClause? linkConstituent+=LinkConstituent*)
	 */
	protected void sequence_Link(EObject context, Link semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Literal}
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bitwiseOr+=BitwiseOrExpression bitwiseOr+=BitwiseOrExpression*)
	 */
	protected void sequence_LogicalAndExpression(EObject context, LogicalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (logicalAnd+=LogicalAndExpression logicalAnd+=LogicalAndExpression*)
	 */
	protected void sequence_LogicalOrExpression(EObject context, LogicalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=Expression expression+=Expression*)
	 */
	protected void sequence_MemberArguments(EObject context, MemberArguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (member+=MemberPart member+=MemberPart*)
	 */
	protected void sequence_MemberExpression(EObject context, MemberExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MemberPart}
	 */
	protected void sequence_MemberPart(EObject context, MemberPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unary+=UnaryExpression ((op+='*' | op+='/' | op+='%') unary+=UnaryExpression)*)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namePair=ID valuePair=Expression)
	 */
	protected void sequence_NameValue(EObject context, NameValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GraspDSLPackage.Literals.NAME_VALUE__NAME_PAIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraspDSLPackage.Literals.NAME_VALUE__NAME_PAIR));
			if(transientValues.isValueTransient(semanticObject, GraspDSLPackage.Literals.NAME_VALUE__VALUE_PAIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GraspDSLPackage.Literals.NAME_VALUE__VALUE_PAIR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameValueAccess().getNamePairIDTerminalRuleCall_0_0(), semanticObject.getNamePair());
		feeder.accept(grammarAccess.getNameValueAccess().getValuePairExpressionParserRuleCall_2_0(), semanticObject.getValuePair());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (members+=NameValue members+=NameValue*)
	 */
	protected void sequence_NameValues(EObject context, NameValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (names+=ID names+=ID*)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression? becauseClause=BecauseClause?)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (providesAnnotation+=Annotation* check=Check)
	 */
	protected void sequence_ProvidesConstituent(EObject context, ProvidesConstituent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=INTEGER_LITERAL? type=ID? becauseClause=BecauseClause? providesConstituent+=ProvidesConstituent*)
	 */
	protected void sequence_Provides(EObject context, Provides semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression? supportsClause=SupportsClause?)
	 */
	protected void sequence_Qattribute(EObject context, Qattribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameterList=ParameterList? superRationale=[Rationale|ID]? reason+=Reason*)
	 */
	protected void sequence_Rationale(EObject context, Rationale semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reasonAnnotation+=Annotation* (expression=Expression | supportsClause=SupportsClause) inhibitsClause=InhibitsClause?)
	 */
	protected void sequence_Reason(EObject context, Reason semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (additive+=AdditiveExpression ((op+='>' | op+='<' | op+='>=' | op+='<=') additive+=AdditiveExpression)*)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID stringLiteral=STRING?)
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requiresAnnotation+=Annotation* check=Check)
	 */
	protected void sequence_RequiresConstituent(EObject context, RequiresConstituent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID value=ID? becauseRequiresClause=BecauseClause? requiresConstituent+=RequiresConstituent*)
	 */
	protected void sequence_Requires(EObject context, Requires semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((literal+=Literal literal+=Literal*)?)
	 */
	protected void sequence_SetLiteral(EObject context, SetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (logicalOr+=LogicalOrExpression logicalOr+=LogicalOrExpression*)
	 */
	protected void sequence_SubsetofExpression(EObject context, SubsetofExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value+=[RequirementOrQuality|ID] value+=[RequirementOrQuality|ID]*)
	 */
	protected void sequence_SupportsClause(EObject context, SupportsClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID becauseClause=BecauseClause? (systemAnnotation+=Annotation* systemConstituent+=SystemConstituent)*)
	 */
	protected void sequence_System(EObject context, uk.ac.standrews.graspide.grasp.graspDSL.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         integerLiteral=INTEGER_LITERAL? 
	 *         parameterList=ParameterList? 
	 *         superTemplate=[Template|ID]? 
	 *         (templateAnnotation+=Annotation* templateConstituent+=TemplateConstituent)*
	 *     )
	 */
	protected void sequence_Template(EObject context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((op='!' | op='~' | op='+' | op='-')? right=PrimaryExpression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
