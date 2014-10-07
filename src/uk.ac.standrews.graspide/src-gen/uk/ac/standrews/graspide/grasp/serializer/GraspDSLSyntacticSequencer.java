package uk.ac.standrews.graspide.grasp.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import uk.ac.standrews.graspide.grasp.services.GraspDSLGrammarAccess;

@SuppressWarnings("all")
public class GraspDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GraspDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BOOLEAN_LITERAL___FalseKeyword_2_1_or_TrueKeyword_1_1___or___NumberSignKeyword_0_1_STRINGTerminalRuleCall_0_2__;
	protected AbstractElementAlias match_Component_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__;
	protected AbstractElementAlias match_Connector_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__;
	protected AbstractElementAlias match_Link_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__;
	protected AbstractElementAlias match_Literal_INTEGER_LITERALParserRuleCall_1_1_or_REAL_LITERALParserRuleCall_2_1_or_STRINGTerminalRuleCall_4_1;
	protected AbstractElementAlias match_MemberPart_InKeyword_2_1_or_OutKeyword_3_1;
	protected AbstractElementAlias match_Provides_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_Requires_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GraspDSLGrammarAccess) access;
		match_BOOLEAN_LITERAL___FalseKeyword_2_1_or_TrueKeyword_1_1___or___NumberSignKeyword_0_1_STRINGTerminalRuleCall_0_2__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBOOLEAN_LITERALAccess().getNumberSignKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getBOOLEAN_LITERALAccess().getSTRINGTerminalRuleCall_0_2())));
		match_Component_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_0_0()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_0_2())), new TokenAlias(false, false, grammarAccess.getComponentAccess().getSemicolonKeyword_8_1()));
		match_Connector_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_8_0_0()), new TokenAlias(false, false, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8_0_2())), new TokenAlias(false, false, grammarAccess.getConnectorAccess().getSemicolonKeyword_8_1()));
		match_Link_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6_0_2())), new TokenAlias(false, false, grammarAccess.getLinkAccess().getSemicolonKeyword_6_1()));
		match_Literal_INTEGER_LITERALParserRuleCall_1_1_or_REAL_LITERALParserRuleCall_2_1_or_STRINGTerminalRuleCall_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralAccess().getINTEGER_LITERALParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getLiteralAccess().getREAL_LITERALParserRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_4_1()));
		match_MemberPart_InKeyword_2_1_or_OutKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMemberPartAccess().getInKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getMemberPartAccess().getOutKeyword_3_1()));
		match_Provides_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getProvidesAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getProvidesAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getProvidesAccess().getSemicolonKeyword_5_1()));
		match_Requires_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRequiresAccess().getLeftCurlyBracketKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getRequiresAccess().getRightCurlyBracketKeyword_4_0_2())), new TokenAlias(false, false, grammarAccess.getRequiresAccess().getSemicolonKeyword_4_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTEGER_LITERALRule())
			return getINTEGER_LITERALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getREAL_LITERALRule())
			return getREAL_LITERALToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * INTEGER_LITERAL  :  INT
	 * ;
	 */
	protected String getINTEGER_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * REAL_LITERAL  : INT* '.' INT
	 * ;
	 */
	protected String getREAL_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_BOOLEAN_LITERAL___FalseKeyword_2_1_or_TrueKeyword_1_1___or___NumberSignKeyword_0_1_STRINGTerminalRuleCall_0_2__.equals(syntax))
				emit_BOOLEAN_LITERAL___FalseKeyword_2_1_or_TrueKeyword_1_1___or___NumberSignKeyword_0_1_STRINGTerminalRuleCall_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__.equals(syntax))
				emit_Component_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Connector_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__.equals(syntax))
				emit_Connector_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Link_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__.equals(syntax))
				emit_Link_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Literal_INTEGER_LITERALParserRuleCall_1_1_or_REAL_LITERALParserRuleCall_2_1_or_STRINGTerminalRuleCall_4_1.equals(syntax))
				emit_Literal_INTEGER_LITERALParserRuleCall_1_1_or_REAL_LITERALParserRuleCall_2_1_or_STRINGTerminalRuleCall_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MemberPart_InKeyword_2_1_or_OutKeyword_3_1.equals(syntax))
				emit_MemberPart_InKeyword_2_1_or_OutKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Provides_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_Provides_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requires_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__.equals(syntax))
				emit_Requires_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('false' | 'true') | ('#' STRING)
	 */
	protected void emit_BOOLEAN_LITERAL___FalseKeyword_2_1_or_TrueKeyword_1_1___or___NumberSignKeyword_0_1_STRINGTerminalRuleCall_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_Component_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Connector_SemicolonKeyword_8_1_or___LeftCurlyBracketKeyword_8_0_0_RightCurlyBracketKeyword_8_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_Link_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     REAL_LITERAL | STRING | INTEGER_LITERAL
	 */
	protected void emit_Literal_INTEGER_LITERALParserRuleCall_1_1_or_REAL_LITERALParserRuleCall_2_1_or_STRINGTerminalRuleCall_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'out' | 'in'
	 */
	protected void emit_MemberPart_InKeyword_2_1_or_OutKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}') | ';'
	 */
	protected void emit_Provides_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ('{' '}')
	 */
	protected void emit_Requires_SemicolonKeyword_4_1_or___LeftCurlyBracketKeyword_4_0_0_RightCurlyBracketKeyword_4_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
