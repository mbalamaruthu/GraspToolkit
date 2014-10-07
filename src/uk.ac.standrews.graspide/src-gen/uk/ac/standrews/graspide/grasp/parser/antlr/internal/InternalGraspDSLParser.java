package uk.ac.standrews.graspide.grasp.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.standrews.graspide.grasp.services.GraspDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraspDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_KEYWORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architecture'", "'{'", "'}'", "'requirement'", "'='", "';'", "'quality_attribute'", "'rationale'", "'('", "')'", "'extends'", "'reason'", "'template'", "':'", "'provides'", "'requires'", "'property'", "'check'", "'system'", "'layer'", "'over'", "','", "'component'", "'connector'", "'link'", "'to'", "'.'", "'out'", "'in'", "'@'", "'supports'", "'inhibits'", "'because'", "'subsetof'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'['", "']'", "'#'", "'true'", "'false'"
    };
    public static final int T__68=68;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int RULE_KEYWORD=7;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalGraspDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGraspDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGraspDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g"; }



     	private GraspDSLGrammarAccess grammarAccess;
     	
        public InternalGraspDSLParser(TokenStream input, GraspDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GraspSpecification";	
       	}
       	
       	@Override
       	protected GraspDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGraspSpecification"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:67:1: entryRuleGraspSpecification returns [EObject current=null] : iv_ruleGraspSpecification= ruleGraspSpecification EOF ;
    public final EObject entryRuleGraspSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraspSpecification = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:68:2: (iv_ruleGraspSpecification= ruleGraspSpecification EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:69:2: iv_ruleGraspSpecification= ruleGraspSpecification EOF
            {
             newCompositeNode(grammarAccess.getGraspSpecificationRule()); 
            pushFollow(FOLLOW_ruleGraspSpecification_in_entryRuleGraspSpecification75);
            iv_ruleGraspSpecification=ruleGraspSpecification();

            state._fsp--;

             current =iv_ruleGraspSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraspSpecification85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraspSpecification"


    // $ANTLR start "ruleGraspSpecification"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:76:1: ruleGraspSpecification returns [EObject current=null] : ( (lv_architecture_0_0= ruleArchitecture ) ) ;
    public final EObject ruleGraspSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_architecture_0_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:79:28: ( ( (lv_architecture_0_0= ruleArchitecture ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:80:1: ( (lv_architecture_0_0= ruleArchitecture ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:80:1: ( (lv_architecture_0_0= ruleArchitecture ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:81:1: (lv_architecture_0_0= ruleArchitecture )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:81:1: (lv_architecture_0_0= ruleArchitecture )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:82:3: lv_architecture_0_0= ruleArchitecture
            {
             
            	        newCompositeNode(grammarAccess.getGraspSpecificationAccess().getArchitectureArchitectureParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleArchitecture_in_ruleGraspSpecification130);
            lv_architecture_0_0=ruleArchitecture();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGraspSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"architecture",
                    		lv_architecture_0_0, 
                    		"Architecture");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraspSpecification"


    // $ANTLR start "entryRuleArchitecture"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:106:1: entryRuleArchitecture returns [EObject current=null] : iv_ruleArchitecture= ruleArchitecture EOF ;
    public final EObject entryRuleArchitecture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitecture = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:107:2: (iv_ruleArchitecture= ruleArchitecture EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:108:2: iv_ruleArchitecture= ruleArchitecture EOF
            {
             newCompositeNode(grammarAccess.getArchitectureRule()); 
            pushFollow(FOLLOW_ruleArchitecture_in_entryRuleArchitecture165);
            iv_ruleArchitecture=ruleArchitecture();

            state._fsp--;

             current =iv_ruleArchitecture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitecture175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:115:1: ruleArchitecture returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_architecutrebody_4_0= ruleArchitectureBody ) ) otherlv_5= '}' ) ;
    public final EObject ruleArchitecture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_architecutrebody_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:118:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_architecutrebody_4_0= ruleArchitectureBody ) ) otherlv_5= '}' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:119:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_architecutrebody_4_0= ruleArchitectureBody ) ) otherlv_5= '}' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:119:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_architecutrebody_4_0= ruleArchitectureBody ) ) otherlv_5= '}' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:119:2: ( (lv_annotation_0_0= ruleAnnotation ) )* otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_architecutrebody_4_0= ruleArchitectureBody ) ) otherlv_5= '}'
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:119:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:120:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:120:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:121:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchitectureAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleArchitecture221);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleArchitecture234); 

                	newLeafNode(otherlv_1, grammarAccess.getArchitectureAccess().getArchitectureKeyword_1());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:141:1: ( (lv_name_2_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:142:1: (lv_name_2_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:142:1: (lv_name_2_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:143:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArchitecture251); 

            			newLeafNode(lv_name_2_0, grammarAccess.getArchitectureAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArchitectureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleArchitecture268); 

                	newLeafNode(otherlv_3, grammarAccess.getArchitectureAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:163:1: ( (lv_architecutrebody_4_0= ruleArchitectureBody ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:164:1: (lv_architecutrebody_4_0= ruleArchitectureBody )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:164:1: (lv_architecutrebody_4_0= ruleArchitectureBody )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:165:3: lv_architecutrebody_4_0= ruleArchitectureBody
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureAccess().getArchitecutrebodyArchitectureBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleArchitectureBody_in_ruleArchitecture289);
            lv_architecutrebody_4_0=ruleArchitectureBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureRule());
            	        }
                   		set(
                   			current, 
                   			"architecutrebody",
                    		lv_architecutrebody_4_0, 
                    		"ArchitectureBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleArchitecture301); 

                	newLeafNode(otherlv_5, grammarAccess.getArchitectureAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleArchitectureBody"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:193:1: entryRuleArchitectureBody returns [EObject current=null] : iv_ruleArchitectureBody= ruleArchitectureBody EOF ;
    public final EObject entryRuleArchitectureBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureBody = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:194:2: (iv_ruleArchitectureBody= ruleArchitectureBody EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:195:2: iv_ruleArchitectureBody= ruleArchitectureBody EOF
            {
             newCompositeNode(grammarAccess.getArchitectureBodyRule()); 
            pushFollow(FOLLOW_ruleArchitectureBody_in_entryRuleArchitectureBody337);
            iv_ruleArchitectureBody=ruleArchitectureBody();

            state._fsp--;

             current =iv_ruleArchitectureBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureBody347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureBody"


    // $ANTLR start "ruleArchitectureBody"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:202:1: ruleArchitectureBody returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_declarationStart_1_0= ruleDeclarationStart ) ) ( (lv_system_2_0= ruleSystem ) ) ( (lv_declarationEnd_3_0= ruleDeclarationEnd ) ) ) ;
    public final EObject ruleArchitectureBody() throws RecognitionException {
        EObject current = null;

        EObject lv_annotation_0_0 = null;

        EObject lv_declarationStart_1_0 = null;

        EObject lv_system_2_0 = null;

        EObject lv_declarationEnd_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:205:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_declarationStart_1_0= ruleDeclarationStart ) ) ( (lv_system_2_0= ruleSystem ) ) ( (lv_declarationEnd_3_0= ruleDeclarationEnd ) ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:206:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_declarationStart_1_0= ruleDeclarationStart ) ) ( (lv_system_2_0= ruleSystem ) ) ( (lv_declarationEnd_3_0= ruleDeclarationEnd ) ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:206:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_declarationStart_1_0= ruleDeclarationStart ) ) ( (lv_system_2_0= ruleSystem ) ) ( (lv_declarationEnd_3_0= ruleDeclarationEnd ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:206:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_declarationStart_1_0= ruleDeclarationStart ) ) ( (lv_system_2_0= ruleSystem ) ) ( (lv_declarationEnd_3_0= ruleDeclarationEnd ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:206:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:207:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:207:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:208:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArchitectureBodyAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleArchitectureBody393);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArchitectureBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:224:3: ( (lv_declarationStart_1_0= ruleDeclarationStart ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:225:1: (lv_declarationStart_1_0= ruleDeclarationStart )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:225:1: (lv_declarationStart_1_0= ruleDeclarationStart )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:226:3: lv_declarationStart_1_0= ruleDeclarationStart
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureBodyAccess().getDeclarationStartDeclarationStartParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclarationStart_in_ruleArchitectureBody415);
            lv_declarationStart_1_0=ruleDeclarationStart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureBodyRule());
            	        }
                   		set(
                   			current, 
                   			"declarationStart",
                    		lv_declarationStart_1_0, 
                    		"DeclarationStart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:242:2: ( (lv_system_2_0= ruleSystem ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:243:1: (lv_system_2_0= ruleSystem )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:243:1: (lv_system_2_0= ruleSystem )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:244:3: lv_system_2_0= ruleSystem
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureBodyAccess().getSystemSystemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSystem_in_ruleArchitectureBody436);
            lv_system_2_0=ruleSystem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureBodyRule());
            	        }
                   		set(
                   			current, 
                   			"system",
                    		lv_system_2_0, 
                    		"System");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:260:2: ( (lv_declarationEnd_3_0= ruleDeclarationEnd ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:261:1: (lv_declarationEnd_3_0= ruleDeclarationEnd )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:261:1: (lv_declarationEnd_3_0= ruleDeclarationEnd )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:262:3: lv_declarationEnd_3_0= ruleDeclarationEnd
            {
             
            	        newCompositeNode(grammarAccess.getArchitectureBodyAccess().getDeclarationEndDeclarationEndParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclarationEnd_in_ruleArchitectureBody457);
            lv_declarationEnd_3_0=ruleDeclarationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArchitectureBodyRule());
            	        }
                   		set(
                   			current, 
                   			"declarationEnd",
                    		lv_declarationEnd_3_0, 
                    		"DeclarationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureBody"


    // $ANTLR start "entryRuleDeclarationStart"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:286:1: entryRuleDeclarationStart returns [EObject current=null] : iv_ruleDeclarationStart= ruleDeclarationStart EOF ;
    public final EObject entryRuleDeclarationStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationStart = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:287:2: (iv_ruleDeclarationStart= ruleDeclarationStart EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:288:2: iv_ruleDeclarationStart= ruleDeclarationStart EOF
            {
             newCompositeNode(grammarAccess.getDeclarationStartRule()); 
            pushFollow(FOLLOW_ruleDeclarationStart_in_entryRuleDeclarationStart493);
            iv_ruleDeclarationStart=ruleDeclarationStart();

            state._fsp--;

             current =iv_ruleDeclarationStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationStart503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationStart"


    // $ANTLR start "ruleDeclarationStart"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:295:1: ruleDeclarationStart returns [EObject current=null] : ( () ( ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )* )* ) ;
    public final EObject ruleDeclarationStart() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_1_0 = null;

        EObject lv_annotation_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:298:28: ( ( () ( ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )* )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:299:1: ( () ( ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )* )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:299:1: ( () ( ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )* )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:299:2: () ( ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )* )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:299:2: ()
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:300:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeclarationStartAccess().getDeclarationStartAction_0(),
                        current);
                

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:305:2: ( ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||(LA4_0>=18 && LA4_0<=19)||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:305:3: ( (lv_declaration_1_0= ruleDeclaration ) ) ( (lv_annotation_2_0= ruleAnnotation ) )*
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:305:3: ( (lv_declaration_1_0= ruleDeclaration ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:306:1: (lv_declaration_1_0= ruleDeclaration )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:306:1: (lv_declaration_1_0= ruleDeclaration )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:307:3: lv_declaration_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationStartAccess().getDeclarationDeclarationParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleDeclarationStart559);
            	    lv_declaration_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationStartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_1_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:323:2: ( (lv_annotation_2_0= ruleAnnotation ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==41) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:324:1: (lv_annotation_2_0= ruleAnnotation )
            	    	    {
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:324:1: (lv_annotation_2_0= ruleAnnotation )
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:325:3: lv_annotation_2_0= ruleAnnotation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationStartAccess().getAnnotationAnnotationParserRuleCall_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDeclarationStart580);
            	    	    lv_annotation_2_0=ruleAnnotation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationStartRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"annotation",
            	    	            		lv_annotation_2_0, 
            	    	            		"Annotation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationStart"


    // $ANTLR start "entryRuleDeclarationEnd"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:349:1: entryRuleDeclarationEnd returns [EObject current=null] : iv_ruleDeclarationEnd= ruleDeclarationEnd EOF ;
    public final EObject entryRuleDeclarationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationEnd = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:350:2: (iv_ruleDeclarationEnd= ruleDeclarationEnd EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:351:2: iv_ruleDeclarationEnd= ruleDeclarationEnd EOF
            {
             newCompositeNode(grammarAccess.getDeclarationEndRule()); 
            pushFollow(FOLLOW_ruleDeclarationEnd_in_entryRuleDeclarationEnd619);
            iv_ruleDeclarationEnd=ruleDeclarationEnd();

            state._fsp--;

             current =iv_ruleDeclarationEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationEnd629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationEnd"


    // $ANTLR start "ruleDeclarationEnd"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:358:1: ruleDeclarationEnd returns [EObject current=null] : ( () ( ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) ) )* ) ;
    public final EObject ruleDeclarationEnd() throws RecognitionException {
        EObject current = null;

        EObject lv_annotation_1_0 = null;

        EObject lv_declaration_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:361:28: ( ( () ( ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:362:1: ( () ( ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:362:1: ( () ( ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:362:2: () ( ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:362:2: ()
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:363:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeclarationEndAccess().getDeclarationEndAction_0(),
                        current);
                

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:368:2: ( ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||(LA6_0>=18 && LA6_0<=19)||LA6_0==24||LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:368:3: ( (lv_annotation_1_0= ruleAnnotation ) )* ( (lv_declaration_2_0= ruleDeclaration ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:368:3: ( (lv_annotation_1_0= ruleAnnotation ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==41) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:369:1: (lv_annotation_1_0= ruleAnnotation )
            	    	    {
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:369:1: (lv_annotation_1_0= ruleAnnotation )
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:370:3: lv_annotation_1_0= ruleAnnotation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeclarationEndAccess().getAnnotationAnnotationParserRuleCall_1_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDeclarationEnd685);
            	    	    lv_annotation_1_0=ruleAnnotation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeclarationEndRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"annotation",
            	    	            		lv_annotation_1_0, 
            	    	            		"Annotation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:386:3: ( (lv_declaration_2_0= ruleDeclaration ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:387:1: (lv_declaration_2_0= ruleDeclaration )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:387:1: (lv_declaration_2_0= ruleDeclaration )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:388:3: lv_declaration_2_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeclarationEndAccess().getDeclarationDeclarationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleDeclarationEnd707);
            	    lv_declaration_2_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeclarationEndRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaration",
            	            		lv_declaration_2_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationEnd"


    // $ANTLR start "entryRuleDeclaration"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:412:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:413:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:414:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration745);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration755); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:421:1: ruleDeclaration returns [EObject current=null] : (this_RequirementOrQuality_0= ruleRequirementOrQuality | this_Rationale_1= ruleRationale | this_Template_2= ruleTemplate ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_RequirementOrQuality_0 = null;

        EObject this_Rationale_1 = null;

        EObject this_Template_2 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:424:28: ( (this_RequirementOrQuality_0= ruleRequirementOrQuality | this_Rationale_1= ruleRationale | this_Template_2= ruleTemplate ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:425:1: (this_RequirementOrQuality_0= ruleRequirementOrQuality | this_Rationale_1= ruleRationale | this_Template_2= ruleTemplate )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:425:1: (this_RequirementOrQuality_0= ruleRequirementOrQuality | this_Rationale_1= ruleRationale | this_Template_2= ruleTemplate )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:426:5: this_RequirementOrQuality_0= ruleRequirementOrQuality
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getRequirementOrQualityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRequirementOrQuality_in_ruleDeclaration802);
                    this_RequirementOrQuality_0=ruleRequirementOrQuality();

                    state._fsp--;

                     
                            current = this_RequirementOrQuality_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:436:5: this_Rationale_1= ruleRationale
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getRationaleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRationale_in_ruleDeclaration829);
                    this_Rationale_1=ruleRationale();

                    state._fsp--;

                     
                            current = this_Rationale_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:446:5: this_Template_2= ruleTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getTemplateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTemplate_in_ruleDeclaration856);
                    this_Template_2=ruleTemplate();

                    state._fsp--;

                     
                            current = this_Template_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRequirementOrQuality"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:462:1: entryRuleRequirementOrQuality returns [EObject current=null] : iv_ruleRequirementOrQuality= ruleRequirementOrQuality EOF ;
    public final EObject entryRuleRequirementOrQuality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementOrQuality = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:463:2: (iv_ruleRequirementOrQuality= ruleRequirementOrQuality EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:464:2: iv_ruleRequirementOrQuality= ruleRequirementOrQuality EOF
            {
             newCompositeNode(grammarAccess.getRequirementOrQualityRule()); 
            pushFollow(FOLLOW_ruleRequirementOrQuality_in_entryRuleRequirementOrQuality891);
            iv_ruleRequirementOrQuality=ruleRequirementOrQuality();

            state._fsp--;

             current =iv_ruleRequirementOrQuality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementOrQuality901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirementOrQuality"


    // $ANTLR start "ruleRequirementOrQuality"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:471:1: ruleRequirementOrQuality returns [EObject current=null] : (this_Requirement_0= ruleRequirement | this_Qattribute_1= ruleQattribute ) ;
    public final EObject ruleRequirementOrQuality() throws RecognitionException {
        EObject current = null;

        EObject this_Requirement_0 = null;

        EObject this_Qattribute_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:474:28: ( (this_Requirement_0= ruleRequirement | this_Qattribute_1= ruleQattribute ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:475:1: (this_Requirement_0= ruleRequirement | this_Qattribute_1= ruleQattribute )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:475:1: (this_Requirement_0= ruleRequirement | this_Qattribute_1= ruleQattribute )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:476:5: this_Requirement_0= ruleRequirement
                    {
                     
                            newCompositeNode(grammarAccess.getRequirementOrQualityAccess().getRequirementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRequirement_in_ruleRequirementOrQuality948);
                    this_Requirement_0=ruleRequirement();

                    state._fsp--;

                     
                            current = this_Requirement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:486:5: this_Qattribute_1= ruleQattribute
                    {
                     
                            newCompositeNode(grammarAccess.getRequirementOrQualityAccess().getQattributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQattribute_in_ruleRequirementOrQuality975);
                    this_Qattribute_1=ruleQattribute();

                    state._fsp--;

                     
                            current = this_Qattribute_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirementOrQuality"


    // $ANTLR start "entryRuleRequirement"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:502:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:503:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:504:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement1010);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement1020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:511:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_stringLiteral_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:514:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) ) )? otherlv_4= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:515:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:515:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) ) )? otherlv_4= ';' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:515:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRequirement1057); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:519:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:520:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:520:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:521:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1074); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:537:2: (otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:537:4: otherlv_2= '=' ( (lv_stringLiteral_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRequirement1092); 

                        	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getEqualsSignKeyword_2_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:541:1: ( (lv_stringLiteral_3_0= RULE_STRING ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:542:1: (lv_stringLiteral_3_0= RULE_STRING )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:542:1: (lv_stringLiteral_3_0= RULE_STRING )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:543:3: lv_stringLiteral_3_0= RULE_STRING
                    {
                    lv_stringLiteral_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequirement1109); 

                    			newLeafNode(lv_stringLiteral_3_0, grammarAccess.getRequirementAccess().getStringLiteralSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringLiteral",
                            		lv_stringLiteral_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRequirement1128); 

                	newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleQattribute"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:571:1: entryRuleQattribute returns [EObject current=null] : iv_ruleQattribute= ruleQattribute EOF ;
    public final EObject entryRuleQattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQattribute = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:572:2: (iv_ruleQattribute= ruleQattribute EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:573:2: iv_ruleQattribute= ruleQattribute EOF
            {
             newCompositeNode(grammarAccess.getQattributeRule()); 
            pushFollow(FOLLOW_ruleQattribute_in_entryRuleQattribute1164);
            iv_ruleQattribute=ruleQattribute();

            state._fsp--;

             current =iv_ruleQattribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQattribute1174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQattribute"


    // $ANTLR start "ruleQattribute"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:580:1: ruleQattribute returns [EObject current=null] : (otherlv_0= 'quality_attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_supportsClause_4_0= ruleSupportsClause ) )? otherlv_5= ';' ) ;
    public final EObject ruleQattribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;

        EObject lv_supportsClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:583:28: ( (otherlv_0= 'quality_attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_supportsClause_4_0= ruleSupportsClause ) )? otherlv_5= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:584:1: (otherlv_0= 'quality_attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_supportsClause_4_0= ruleSupportsClause ) )? otherlv_5= ';' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:584:1: (otherlv_0= 'quality_attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_supportsClause_4_0= ruleSupportsClause ) )? otherlv_5= ';' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:584:3: otherlv_0= 'quality_attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_supportsClause_4_0= ruleSupportsClause ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleQattribute1211); 

                	newLeafNode(otherlv_0, grammarAccess.getQattributeAccess().getQuality_attributeKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:588:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:589:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:589:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:590:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQattribute1228); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQattributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQattributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:606:2: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:606:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleQattribute1246); 

                        	newLeafNode(otherlv_2, grammarAccess.getQattributeAccess().getEqualsSignKeyword_2_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:610:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:611:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:611:1: (lv_expression_3_0= ruleExpression )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:612:3: lv_expression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getQattributeAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleQattribute1267);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQattributeRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:628:4: ( (lv_supportsClause_4_0= ruleSupportsClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:629:1: (lv_supportsClause_4_0= ruleSupportsClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:629:1: (lv_supportsClause_4_0= ruleSupportsClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:630:3: lv_supportsClause_4_0= ruleSupportsClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getQattributeAccess().getSupportsClauseSupportsClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSupportsClause_in_ruleQattribute1290);
                    lv_supportsClause_4_0=ruleSupportsClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQattributeRule());
                    	        }
                           		set(
                           			current, 
                           			"supportsClause",
                            		lv_supportsClause_4_0, 
                            		"SupportsClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleQattribute1303); 

                	newLeafNode(otherlv_5, grammarAccess.getQattributeAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQattribute"


    // $ANTLR start "entryRuleRationale"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:658:1: entryRuleRationale returns [EObject current=null] : iv_ruleRationale= ruleRationale EOF ;
    public final EObject entryRuleRationale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationale = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:659:2: (iv_ruleRationale= ruleRationale EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:660:2: iv_ruleRationale= ruleRationale EOF
            {
             newCompositeNode(grammarAccess.getRationaleRule()); 
            pushFollow(FOLLOW_ruleRationale_in_entryRuleRationale1339);
            iv_ruleRationale=ruleRationale();

            state._fsp--;

             current =iv_ruleRationale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRationale1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRationale"


    // $ANTLR start "ruleRationale"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:667:1: ruleRationale returns [EObject current=null] : (otherlv_0= 'rationale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterList_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_reason_8_0= ruleReason ) )* otherlv_9= '}' ) ;
    public final EObject ruleRationale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameterList_3_0 = null;

        EObject lv_reason_8_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:670:28: ( (otherlv_0= 'rationale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterList_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_reason_8_0= ruleReason ) )* otherlv_9= '}' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:671:1: (otherlv_0= 'rationale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterList_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_reason_8_0= ruleReason ) )* otherlv_9= '}' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:671:1: (otherlv_0= 'rationale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterList_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_reason_8_0= ruleReason ) )* otherlv_9= '}' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:671:3: otherlv_0= 'rationale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameterList_3_0= ruleParameterList ) )? otherlv_4= ')' (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_reason_8_0= ruleReason ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRationale1386); 

                	newLeafNode(otherlv_0, grammarAccess.getRationaleAccess().getRationaleKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:675:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:676:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:676:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:677:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRationale1403); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRationaleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRationaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleRationale1420); 

                	newLeafNode(otherlv_2, grammarAccess.getRationaleAccess().getLeftParenthesisKeyword_2());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:697:1: ( (lv_parameterList_3_0= ruleParameterList ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:698:1: (lv_parameterList_3_0= ruleParameterList )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:698:1: (lv_parameterList_3_0= ruleParameterList )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:699:3: lv_parameterList_3_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getRationaleAccess().getParameterListParameterListParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleRationale1441);
                    lv_parameterList_3_0=ruleParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRationaleRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterList",
                            		lv_parameterList_3_0, 
                            		"ParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRationale1454); 

                	newLeafNode(otherlv_4, grammarAccess.getRationaleAccess().getRightParenthesisKeyword_4());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:719:1: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:719:3: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleRationale1467); 

                        	newLeafNode(otherlv_5, grammarAccess.getRationaleAccess().getExtendsKeyword_5_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:723:1: ( (otherlv_6= RULE_ID ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:724:1: (otherlv_6= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:724:1: (otherlv_6= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:725:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRationaleRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRationale1487); 

                    		newLeafNode(otherlv_6, grammarAccess.getRationaleAccess().getSuperRationaleRationaleCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRationale1501); 

                	newLeafNode(otherlv_7, grammarAccess.getRationaleAccess().getLeftCurlyBracketKeyword_6());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:740:1: ( (lv_reason_8_0= ruleReason ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:741:1: (lv_reason_8_0= ruleReason )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:741:1: (lv_reason_8_0= ruleReason )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:742:3: lv_reason_8_0= ruleReason
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRationaleAccess().getReasonReasonParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleReason_in_ruleRationale1522);
            	    lv_reason_8_0=ruleReason();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRationaleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reason",
            	            		lv_reason_8_0, 
            	            		"Reason");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRationale1535); 

                	newLeafNode(otherlv_9, grammarAccess.getRationaleAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRationale"


    // $ANTLR start "entryRuleReason"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:770:1: entryRuleReason returns [EObject current=null] : iv_ruleReason= ruleReason EOF ;
    public final EObject entryRuleReason() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReason = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:771:2: (iv_ruleReason= ruleReason EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:772:2: iv_ruleReason= ruleReason EOF
            {
             newCompositeNode(grammarAccess.getReasonRule()); 
            pushFollow(FOLLOW_ruleReason_in_entryRuleReason1571);
            iv_ruleReason=ruleReason();

            state._fsp--;

             current =iv_ruleReason; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReason1581); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReason"


    // $ANTLR start "ruleReason"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:779:1: ruleReason returns [EObject current=null] : ( ( (lv_reasonAnnotation_0_0= ruleAnnotation ) )* otherlv_1= 'reason' ( ( (lv_expression_2_0= ruleExpression ) ) | ( (lv_supportsClause_3_0= ruleSupportsClause ) ) ) ( (lv_inhibitsClause_4_0= ruleInhibitsClause ) )? otherlv_5= ';' ) ;
    public final EObject ruleReason() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_reasonAnnotation_0_0 = null;

        EObject lv_expression_2_0 = null;

        EObject lv_supportsClause_3_0 = null;

        EObject lv_inhibitsClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:782:28: ( ( ( (lv_reasonAnnotation_0_0= ruleAnnotation ) )* otherlv_1= 'reason' ( ( (lv_expression_2_0= ruleExpression ) ) | ( (lv_supportsClause_3_0= ruleSupportsClause ) ) ) ( (lv_inhibitsClause_4_0= ruleInhibitsClause ) )? otherlv_5= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:783:1: ( ( (lv_reasonAnnotation_0_0= ruleAnnotation ) )* otherlv_1= 'reason' ( ( (lv_expression_2_0= ruleExpression ) ) | ( (lv_supportsClause_3_0= ruleSupportsClause ) ) ) ( (lv_inhibitsClause_4_0= ruleInhibitsClause ) )? otherlv_5= ';' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:783:1: ( ( (lv_reasonAnnotation_0_0= ruleAnnotation ) )* otherlv_1= 'reason' ( ( (lv_expression_2_0= ruleExpression ) ) | ( (lv_supportsClause_3_0= ruleSupportsClause ) ) ) ( (lv_inhibitsClause_4_0= ruleInhibitsClause ) )? otherlv_5= ';' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:783:2: ( (lv_reasonAnnotation_0_0= ruleAnnotation ) )* otherlv_1= 'reason' ( ( (lv_expression_2_0= ruleExpression ) ) | ( (lv_supportsClause_3_0= ruleSupportsClause ) ) ) ( (lv_inhibitsClause_4_0= ruleInhibitsClause ) )? otherlv_5= ';'
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:783:2: ( (lv_reasonAnnotation_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:784:1: (lv_reasonAnnotation_0_0= ruleAnnotation )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:784:1: (lv_reasonAnnotation_0_0= ruleAnnotation )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:785:3: lv_reasonAnnotation_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReasonAccess().getReasonAnnotationAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleReason1627);
            	    lv_reasonAnnotation_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReasonRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reasonAnnotation",
            	            		lv_reasonAnnotation_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleReason1640); 

                	newLeafNode(otherlv_1, grammarAccess.getReasonAccess().getReasonKeyword_1());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:805:1: ( ( (lv_expression_2_0= ruleExpression ) ) | ( (lv_supportsClause_3_0= ruleSupportsClause ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==20||(LA16_0>=38 && LA16_0<=40)||(LA16_0>=57 && LA16_0<=58)||(LA16_0>=62 && LA16_0<=64)||(LA16_0>=66 && LA16_0<=68)) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:805:2: ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:805:2: ( (lv_expression_2_0= ruleExpression ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:806:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:806:1: (lv_expression_2_0= ruleExpression )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:807:3: lv_expression_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getReasonAccess().getExpressionExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleReason1662);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReasonRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:824:6: ( (lv_supportsClause_3_0= ruleSupportsClause ) )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:824:6: ( (lv_supportsClause_3_0= ruleSupportsClause ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:825:1: (lv_supportsClause_3_0= ruleSupportsClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:825:1: (lv_supportsClause_3_0= ruleSupportsClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:826:3: lv_supportsClause_3_0= ruleSupportsClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getReasonAccess().getSupportsClauseSupportsClauseParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSupportsClause_in_ruleReason1689);
                    lv_supportsClause_3_0=ruleSupportsClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReasonRule());
                    	        }
                           		set(
                           			current, 
                           			"supportsClause",
                            		lv_supportsClause_3_0, 
                            		"SupportsClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:842:3: ( (lv_inhibitsClause_4_0= ruleInhibitsClause ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:843:1: (lv_inhibitsClause_4_0= ruleInhibitsClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:843:1: (lv_inhibitsClause_4_0= ruleInhibitsClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:844:3: lv_inhibitsClause_4_0= ruleInhibitsClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getReasonAccess().getInhibitsClauseInhibitsClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInhibitsClause_in_ruleReason1711);
                    lv_inhibitsClause_4_0=ruleInhibitsClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReasonRule());
                    	        }
                           		set(
                           			current, 
                           			"inhibitsClause",
                            		lv_inhibitsClause_4_0, 
                            		"InhibitsClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleReason1724); 

                	newLeafNode(otherlv_5, grammarAccess.getReasonAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReason"


    // $ANTLR start "entryRuleTemplate"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:872:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:873:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:874:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate1760);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate1770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:881:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) ) )? otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) )? otherlv_6= ')' (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_integerLiteral_3_0 = null;

        EObject lv_parameterList_5_0 = null;

        EObject lv_templateAnnotation_10_0 = null;

        EObject lv_templateConstituent_11_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:884:28: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) ) )? otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) )? otherlv_6= ')' (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) ) )* otherlv_12= '}' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:885:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) ) )? otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) )? otherlv_6= ')' (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) ) )* otherlv_12= '}' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:885:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) ) )? otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) )? otherlv_6= ')' (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) ) )* otherlv_12= '}' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:885:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) ) )? otherlv_4= '(' ( (lv_parameterList_5_0= ruleParameterList ) )? otherlv_6= ')' (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTemplate1807); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:889:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:890:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:890:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:891:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplate1824); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:907:2: (otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:907:4: otherlv_2= ':' ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTemplate1842); 

                        	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getColonKeyword_2_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:911:1: ( (lv_integerLiteral_3_0= ruleINTEGER_LITERAL ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:912:1: (lv_integerLiteral_3_0= ruleINTEGER_LITERAL )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:912:1: (lv_integerLiteral_3_0= ruleINTEGER_LITERAL )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:913:3: lv_integerLiteral_3_0= ruleINTEGER_LITERAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplateAccess().getIntegerLiteralINTEGER_LITERALParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_ruleTemplate1863);
                    lv_integerLiteral_3_0=ruleINTEGER_LITERAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
                    	        }
                           		set(
                           			current, 
                           			"integerLiteral",
                            		lv_integerLiteral_3_0, 
                            		"INTEGER_LITERAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTemplate1877); 

                	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getLeftParenthesisKeyword_3());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:933:1: ( (lv_parameterList_5_0= ruleParameterList ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:934:1: (lv_parameterList_5_0= ruleParameterList )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:934:1: (lv_parameterList_5_0= ruleParameterList )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:935:3: lv_parameterList_5_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplateAccess().getParameterListParameterListParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleTemplate1898);
                    lv_parameterList_5_0=ruleParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterList",
                            		lv_parameterList_5_0, 
                            		"ParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTemplate1911); 

                	newLeafNode(otherlv_6, grammarAccess.getTemplateAccess().getRightParenthesisKeyword_5());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:955:1: (otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:955:3: otherlv_7= 'extends' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleTemplate1924); 

                        	newLeafNode(otherlv_7, grammarAccess.getTemplateAccess().getExtendsKeyword_6_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:959:1: ( (otherlv_8= RULE_ID ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:960:1: (otherlv_8= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:960:1: (otherlv_8= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:961:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTemplateRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplate1944); 

                    		newLeafNode(otherlv_8, grammarAccess.getTemplateAccess().getSuperTemplateTemplateCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleTemplate1958); 

                	newLeafNode(otherlv_9, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_7());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:976:1: ( ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24||(LA22_0>=26 && LA22_0<=29)||LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:976:2: ( (lv_templateAnnotation_10_0= ruleAnnotation ) )* ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:976:2: ( (lv_templateAnnotation_10_0= ruleAnnotation ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==41) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:977:1: (lv_templateAnnotation_10_0= ruleAnnotation )
            	    	    {
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:977:1: (lv_templateAnnotation_10_0= ruleAnnotation )
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:978:3: lv_templateAnnotation_10_0= ruleAnnotation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTemplateAccess().getTemplateAnnotationAnnotationParserRuleCall_8_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTemplate1980);
            	    	    lv_templateAnnotation_10_0=ruleAnnotation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"templateAnnotation",
            	    	            		lv_templateAnnotation_10_0, 
            	    	            		"Annotation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:994:3: ( (lv_templateConstituent_11_0= ruleTemplateConstituent ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:995:1: (lv_templateConstituent_11_0= ruleTemplateConstituent )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:995:1: (lv_templateConstituent_11_0= ruleTemplateConstituent )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:996:3: lv_templateConstituent_11_0= ruleTemplateConstituent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getTemplateConstituentTemplateConstituentParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemplateConstituent_in_ruleTemplate2002);
            	    lv_templateConstituent_11_0=ruleTemplateConstituent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"templateConstituent",
            	            		lv_templateConstituent_11_0, 
            	            		"TemplateConstituent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_14_in_ruleTemplate2016); 

                	newLeafNode(otherlv_12, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleTemplateConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1024:1: entryRuleTemplateConstituent returns [EObject current=null] : iv_ruleTemplateConstituent= ruleTemplateConstituent EOF ;
    public final EObject entryRuleTemplateConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1025:2: (iv_ruleTemplateConstituent= ruleTemplateConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1026:2: iv_ruleTemplateConstituent= ruleTemplateConstituent EOF
            {
             newCompositeNode(grammarAccess.getTemplateConstituentRule()); 
            pushFollow(FOLLOW_ruleTemplateConstituent_in_entryRuleTemplateConstituent2052);
            iv_ruleTemplateConstituent=ruleTemplateConstituent();

            state._fsp--;

             current =iv_ruleTemplateConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateConstituent2062); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateConstituent"


    // $ANTLR start "ruleTemplateConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1033:1: ruleTemplateConstituent returns [EObject current=null] : (this_Template_0= ruleTemplate | this_Provides_1= ruleProvides | this_Requires_2= ruleRequires | this_Property_3= ruleProperty | this_Check_4= ruleCheck ) ;
    public final EObject ruleTemplateConstituent() throws RecognitionException {
        EObject current = null;

        EObject this_Template_0 = null;

        EObject this_Provides_1 = null;

        EObject this_Requires_2 = null;

        EObject this_Property_3 = null;

        EObject this_Check_4 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1036:28: ( (this_Template_0= ruleTemplate | this_Provides_1= ruleProvides | this_Requires_2= ruleRequires | this_Property_3= ruleProperty | this_Check_4= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1037:1: (this_Template_0= ruleTemplate | this_Provides_1= ruleProvides | this_Requires_2= ruleRequires | this_Property_3= ruleProperty | this_Check_4= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1037:1: (this_Template_0= ruleTemplate | this_Provides_1= ruleProvides | this_Requires_2= ruleRequires | this_Property_3= ruleProperty | this_Check_4= ruleCheck )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt23=1;
                }
                break;
            case 26:
                {
                alt23=2;
                }
                break;
            case 27:
                {
                alt23=3;
                }
                break;
            case 28:
                {
                alt23=4;
                }
                break;
            case 29:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1038:5: this_Template_0= ruleTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateConstituentAccess().getTemplateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTemplate_in_ruleTemplateConstituent2109);
                    this_Template_0=ruleTemplate();

                    state._fsp--;

                     
                            current = this_Template_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1048:5: this_Provides_1= ruleProvides
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateConstituentAccess().getProvidesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProvides_in_ruleTemplateConstituent2136);
                    this_Provides_1=ruleProvides();

                    state._fsp--;

                     
                            current = this_Provides_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1058:5: this_Requires_2= ruleRequires
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateConstituentAccess().getRequiresParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRequires_in_ruleTemplateConstituent2163);
                    this_Requires_2=ruleRequires();

                    state._fsp--;

                     
                            current = this_Requires_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1068:5: this_Property_3= ruleProperty
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateConstituentAccess().getPropertyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleProperty_in_ruleTemplateConstituent2190);
                    this_Property_3=ruleProperty();

                    state._fsp--;

                     
                            current = this_Property_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1078:5: this_Check_4= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateConstituentAccess().getCheckParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleTemplateConstituent2217);
                    this_Check_4=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateConstituent"


    // $ANTLR start "entryRuleProvides"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1094:1: entryRuleProvides returns [EObject current=null] : iv_ruleProvides= ruleProvides EOF ;
    public final EObject entryRuleProvides() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvides = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1095:2: (iv_ruleProvides= ruleProvides EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1096:2: iv_ruleProvides= ruleProvides EOF
            {
             newCompositeNode(grammarAccess.getProvidesRule()); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides2252);
            iv_ruleProvides=ruleProvides();

            state._fsp--;

             current =iv_ruleProvides; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides2262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvides"


    // $ANTLR start "ruleProvides"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1103:1: ruleProvides returns [EObject current=null] : (otherlv_0= 'provides' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) ) )? ( (lv_type_4_0= RULE_ID ) )? ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) ) ;
    public final EObject ruleProvides() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        EObject lv_becauseClause_5_0 = null;

        EObject lv_providesConstituent_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1106:28: ( (otherlv_0= 'provides' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) ) )? ( (lv_type_4_0= RULE_ID ) )? ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1107:1: (otherlv_0= 'provides' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) ) )? ( (lv_type_4_0= RULE_ID ) )? ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1107:1: (otherlv_0= 'provides' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) ) )? ( (lv_type_4_0= RULE_ID ) )? ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1107:3: otherlv_0= 'provides' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) ) )? ( (lv_type_4_0= RULE_ID ) )? ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleProvides2299); 

                	newLeafNode(otherlv_0, grammarAccess.getProvidesAccess().getProvidesKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1111:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1112:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1112:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1113:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides2316); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProvidesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProvidesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1129:2: (otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1129:4: otherlv_2= ':' ( (lv_value_3_0= ruleINTEGER_LITERAL ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleProvides2334); 

                        	newLeafNode(otherlv_2, grammarAccess.getProvidesAccess().getColonKeyword_2_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1133:1: ( (lv_value_3_0= ruleINTEGER_LITERAL ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1134:1: (lv_value_3_0= ruleINTEGER_LITERAL )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1134:1: (lv_value_3_0= ruleINTEGER_LITERAL )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1135:3: lv_value_3_0= ruleINTEGER_LITERAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getProvidesAccess().getValueINTEGER_LITERALParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_ruleProvides2355);
                    lv_value_3_0=ruleINTEGER_LITERAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProvidesRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"INTEGER_LITERAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1151:4: ( (lv_type_4_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1152:1: (lv_type_4_0= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1152:1: (lv_type_4_0= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1153:3: lv_type_4_0= RULE_ID
                    {
                    lv_type_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvides2374); 

                    			newLeafNode(lv_type_4_0, grammarAccess.getProvidesAccess().getTypeIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProvidesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1169:3: ( (lv_becauseClause_5_0= ruleBecauseClause ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1170:1: (lv_becauseClause_5_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1170:1: (lv_becauseClause_5_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1171:3: lv_becauseClause_5_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getProvidesAccess().getBecauseClauseBecauseClauseParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleProvides2401);
                    lv_becauseClause_5_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProvidesRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_5_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1187:3: ( (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            else if ( (LA28_0==17) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1187:4: (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1187:4: (otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1187:6: otherlv_6= '{' ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleProvides2416); 

                        	newLeafNode(otherlv_6, grammarAccess.getProvidesAccess().getLeftCurlyBracketKeyword_5_0_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1191:1: ( (lv_providesConstituent_7_0= ruleProvidesConstituent ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==29||LA27_0==41) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1192:1: (lv_providesConstituent_7_0= ruleProvidesConstituent )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1192:1: (lv_providesConstituent_7_0= ruleProvidesConstituent )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1193:3: lv_providesConstituent_7_0= ruleProvidesConstituent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProvidesAccess().getProvidesConstituentProvidesConstituentParserRuleCall_5_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProvidesConstituent_in_ruleProvides2437);
                    	    lv_providesConstituent_7_0=ruleProvidesConstituent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProvidesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"providesConstituent",
                    	            		lv_providesConstituent_7_0, 
                    	            		"ProvidesConstituent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleProvides2450); 

                        	newLeafNode(otherlv_8, grammarAccess.getProvidesAccess().getRightCurlyBracketKeyword_5_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1214:7: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleProvides2469); 

                        	newLeafNode(otherlv_9, grammarAccess.getProvidesAccess().getSemicolonKeyword_5_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvides"


    // $ANTLR start "entryRuleProvidesConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1226:1: entryRuleProvidesConstituent returns [EObject current=null] : iv_ruleProvidesConstituent= ruleProvidesConstituent EOF ;
    public final EObject entryRuleProvidesConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidesConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1227:2: (iv_ruleProvidesConstituent= ruleProvidesConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1228:2: iv_ruleProvidesConstituent= ruleProvidesConstituent EOF
            {
             newCompositeNode(grammarAccess.getProvidesConstituentRule()); 
            pushFollow(FOLLOW_ruleProvidesConstituent_in_entryRuleProvidesConstituent2506);
            iv_ruleProvidesConstituent=ruleProvidesConstituent();

            state._fsp--;

             current =iv_ruleProvidesConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidesConstituent2516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidesConstituent"


    // $ANTLR start "ruleProvidesConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1235:1: ruleProvidesConstituent returns [EObject current=null] : ( ( (lv_providesAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) ) ;
    public final EObject ruleProvidesConstituent() throws RecognitionException {
        EObject current = null;

        EObject lv_providesAnnotation_0_0 = null;

        EObject lv_check_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1238:28: ( ( ( (lv_providesAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1239:1: ( ( (lv_providesAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1239:1: ( ( (lv_providesAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1239:2: ( (lv_providesAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1239:2: ( (lv_providesAnnotation_0_0= ruleAnnotation ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1240:1: (lv_providesAnnotation_0_0= ruleAnnotation )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1240:1: (lv_providesAnnotation_0_0= ruleAnnotation )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1241:3: lv_providesAnnotation_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProvidesConstituentAccess().getProvidesAnnotationAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleProvidesConstituent2562);
            	    lv_providesAnnotation_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProvidesConstituentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providesAnnotation",
            	            		lv_providesAnnotation_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1257:3: ( (lv_check_1_0= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1258:1: (lv_check_1_0= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1258:1: (lv_check_1_0= ruleCheck )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1259:3: lv_check_1_0= ruleCheck
            {
             
            	        newCompositeNode(grammarAccess.getProvidesConstituentAccess().getCheckCheckParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCheck_in_ruleProvidesConstituent2584);
            lv_check_1_0=ruleCheck();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProvidesConstituentRule());
            	        }
                   		set(
                   			current, 
                   			"check",
                    		lv_check_1_0, 
                    		"Check");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidesConstituent"


    // $ANTLR start "entryRuleRequires"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1283:1: entryRuleRequires returns [EObject current=null] : iv_ruleRequires= ruleRequires EOF ;
    public final EObject entryRuleRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequires = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1284:2: (iv_ruleRequires= ruleRequires EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1285:2: iv_ruleRequires= ruleRequires EOF
            {
             newCompositeNode(grammarAccess.getRequiresRule()); 
            pushFollow(FOLLOW_ruleRequires_in_entryRuleRequires2620);
            iv_ruleRequires=ruleRequires();

            state._fsp--;

             current =iv_ruleRequires; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequires2630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequires"


    // $ANTLR start "ruleRequires"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1292:1: ruleRequires returns [EObject current=null] : (otherlv_0= 'requires' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_ID ) )? ( (lv_becauseRequiresClause_3_0= ruleBecauseClause ) )? ( (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) ;
    public final EObject ruleRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_becauseRequiresClause_3_0 = null;

        EObject lv_requiresConstituent_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1295:28: ( (otherlv_0= 'requires' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_ID ) )? ( (lv_becauseRequiresClause_3_0= ruleBecauseClause ) )? ( (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' ) | otherlv_7= ';' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1296:1: (otherlv_0= 'requires' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_ID ) )? ( (lv_becauseRequiresClause_3_0= ruleBecauseClause ) )? ( (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' ) | otherlv_7= ';' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1296:1: (otherlv_0= 'requires' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_ID ) )? ( (lv_becauseRequiresClause_3_0= ruleBecauseClause ) )? ( (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' ) | otherlv_7= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1296:3: otherlv_0= 'requires' ( (lv_type_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_ID ) )? ( (lv_becauseRequiresClause_3_0= ruleBecauseClause ) )? ( (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' ) | otherlv_7= ';' )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleRequires2667); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiresAccess().getRequiresKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1300:1: ( (lv_type_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1301:1: (lv_type_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1301:1: (lv_type_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1302:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequires2684); 

            			newLeafNode(lv_type_1_0, grammarAccess.getRequiresAccess().getTypeIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequiresRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1318:2: ( (lv_value_2_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1319:1: (lv_value_2_0= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1319:1: (lv_value_2_0= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1320:3: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequires2706); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getRequiresAccess().getValueIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiresRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1336:3: ( (lv_becauseRequiresClause_3_0= ruleBecauseClause ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1337:1: (lv_becauseRequiresClause_3_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1337:1: (lv_becauseRequiresClause_3_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1338:3: lv_becauseRequiresClause_3_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequiresAccess().getBecauseRequiresClauseBecauseClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleRequires2733);
                    lv_becauseRequiresClause_3_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequiresRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseRequiresClause",
                            		lv_becauseRequiresClause_3_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1354:3: ( (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' ) | otherlv_7= ';' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13) ) {
                alt33=1;
            }
            else if ( (LA33_0==17) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1354:4: (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1354:4: (otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1354:6: otherlv_4= '{' ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRequires2748); 

                        	newLeafNode(otherlv_4, grammarAccess.getRequiresAccess().getLeftCurlyBracketKeyword_4_0_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1358:1: ( (lv_requiresConstituent_5_0= ruleRequiresConstituent ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==29||LA32_0==41) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1359:1: (lv_requiresConstituent_5_0= ruleRequiresConstituent )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1359:1: (lv_requiresConstituent_5_0= ruleRequiresConstituent )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1360:3: lv_requiresConstituent_5_0= ruleRequiresConstituent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequiresAccess().getRequiresConstituentRequiresConstituentParserRuleCall_4_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRequiresConstituent_in_ruleRequires2769);
                    	    lv_requiresConstituent_5_0=ruleRequiresConstituent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequiresRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiresConstituent",
                    	            		lv_requiresConstituent_5_0, 
                    	            		"RequiresConstituent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleRequires2782); 

                        	newLeafNode(otherlv_6, grammarAccess.getRequiresAccess().getRightCurlyBracketKeyword_4_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1381:7: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleRequires2801); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequiresAccess().getSemicolonKeyword_4_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequires"


    // $ANTLR start "entryRuleRequiresConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1393:1: entryRuleRequiresConstituent returns [EObject current=null] : iv_ruleRequiresConstituent= ruleRequiresConstituent EOF ;
    public final EObject entryRuleRequiresConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiresConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1394:2: (iv_ruleRequiresConstituent= ruleRequiresConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1395:2: iv_ruleRequiresConstituent= ruleRequiresConstituent EOF
            {
             newCompositeNode(grammarAccess.getRequiresConstituentRule()); 
            pushFollow(FOLLOW_ruleRequiresConstituent_in_entryRuleRequiresConstituent2838);
            iv_ruleRequiresConstituent=ruleRequiresConstituent();

            state._fsp--;

             current =iv_ruleRequiresConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiresConstituent2848); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiresConstituent"


    // $ANTLR start "ruleRequiresConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1402:1: ruleRequiresConstituent returns [EObject current=null] : ( ( (lv_requiresAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) ) ;
    public final EObject ruleRequiresConstituent() throws RecognitionException {
        EObject current = null;

        EObject lv_requiresAnnotation_0_0 = null;

        EObject lv_check_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1405:28: ( ( ( (lv_requiresAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1406:1: ( ( (lv_requiresAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1406:1: ( ( (lv_requiresAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1406:2: ( (lv_requiresAnnotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1406:2: ( (lv_requiresAnnotation_0_0= ruleAnnotation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1407:1: (lv_requiresAnnotation_0_0= ruleAnnotation )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1407:1: (lv_requiresAnnotation_0_0= ruleAnnotation )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1408:3: lv_requiresAnnotation_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequiresConstituentAccess().getRequiresAnnotationAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleRequiresConstituent2894);
            	    lv_requiresAnnotation_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequiresConstituentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requiresAnnotation",
            	            		lv_requiresAnnotation_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1424:3: ( (lv_check_1_0= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1425:1: (lv_check_1_0= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1425:1: (lv_check_1_0= ruleCheck )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1426:3: lv_check_1_0= ruleCheck
            {
             
            	        newCompositeNode(grammarAccess.getRequiresConstituentAccess().getCheckCheckParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCheck_in_ruleRequiresConstituent2916);
            lv_check_1_0=ruleCheck();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiresConstituentRule());
            	        }
                   		set(
                   			current, 
                   			"check",
                    		lv_check_1_0, 
                    		"Check");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiresConstituent"


    // $ANTLR start "entryRuleProperty"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1450:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1451:2: (iv_ruleProperty= ruleProperty EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1452:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2952);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1459:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_becauseClause_4_0= ruleBecauseClause ) )? otherlv_5= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_expression_3_0 = null;

        EObject lv_becauseClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1462:28: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_becauseClause_4_0= ruleBecauseClause ) )? otherlv_5= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1463:1: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_becauseClause_4_0= ruleBecauseClause ) )? otherlv_5= ';' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1463:1: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_becauseClause_4_0= ruleBecauseClause ) )? otherlv_5= ';' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1463:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ( (lv_becauseClause_4_0= ruleBecauseClause ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleProperty2999); 

                	newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1467:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1468:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1468:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1469:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty3016); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1485:2: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1485:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleProperty3034); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1489:1: ( (lv_expression_3_0= ruleExpression ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1490:1: (lv_expression_3_0= ruleExpression )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1490:1: (lv_expression_3_0= ruleExpression )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1491:3: lv_expression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleProperty3055);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1507:4: ( (lv_becauseClause_4_0= ruleBecauseClause ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1508:1: (lv_becauseClause_4_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1508:1: (lv_becauseClause_4_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1509:3: lv_becauseClause_4_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getBecauseClauseBecauseClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleProperty3078);
                    lv_becauseClause_4_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_4_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleProperty3091); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCheck"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1537:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1538:2: (iv_ruleCheck= ruleCheck EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1539:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck3127);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck3137); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1546:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= ';' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_1_0 = null;

        EObject lv_becauseClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1549:28: ( (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1550:1: (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= ';' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1550:1: (otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= ';' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1550:3: otherlv_0= 'check' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleCheck3174); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1554:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1555:1: (lv_expression_1_0= ruleExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1555:1: (lv_expression_1_0= ruleExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1556:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCheckAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCheck3195);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCheckRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1572:2: ( (lv_becauseClause_2_0= ruleBecauseClause ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1573:1: (lv_becauseClause_2_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1573:1: (lv_becauseClause_2_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1574:3: lv_becauseClause_2_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getBecauseClauseBecauseClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleCheck3216);
                    lv_becauseClause_2_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_2_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCheck3229); 

                	newLeafNode(otherlv_3, grammarAccess.getCheckAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleSystem"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1602:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1603:2: (iv_ruleSystem= ruleSystem EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1604:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem3265);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem3275); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1611:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= '{' ( ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_becauseClause_2_0 = null;

        EObject lv_systemAnnotation_4_0 = null;

        EObject lv_systemConstituent_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1614:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= '{' ( ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) ) )* otherlv_6= '}' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1615:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= '{' ( ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) ) )* otherlv_6= '}' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1615:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= '{' ( ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) ) )* otherlv_6= '}' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1615:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_becauseClause_2_0= ruleBecauseClause ) )? otherlv_3= '{' ( ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSystem3312); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1619:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1620:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1620:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1621:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem3329); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1637:2: ( (lv_becauseClause_2_0= ruleBecauseClause ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1638:1: (lv_becauseClause_2_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1638:1: (lv_becauseClause_2_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1639:3: lv_becauseClause_2_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSystemAccess().getBecauseClauseBecauseClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleSystem3355);
                    lv_becauseClause_2_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSystemRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_2_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSystem3368); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1659:1: ( ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==29||LA40_0==31||(LA40_0>=34 && LA40_0<=36)||LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1659:2: ( (lv_systemAnnotation_4_0= ruleAnnotation ) )* ( (lv_systemConstituent_5_0= ruleSystemConstituent ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1659:2: ( (lv_systemAnnotation_4_0= ruleAnnotation ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==41) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1660:1: (lv_systemAnnotation_4_0= ruleAnnotation )
            	    	    {
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1660:1: (lv_systemAnnotation_4_0= ruleAnnotation )
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1661:3: lv_systemAnnotation_4_0= ruleAnnotation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSystemAccess().getSystemAnnotationAnnotationParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSystem3390);
            	    	    lv_systemAnnotation_4_0=ruleAnnotation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"systemAnnotation",
            	    	            		lv_systemAnnotation_4_0, 
            	    	            		"Annotation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1677:3: ( (lv_systemConstituent_5_0= ruleSystemConstituent ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1678:1: (lv_systemConstituent_5_0= ruleSystemConstituent )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1678:1: (lv_systemConstituent_5_0= ruleSystemConstituent )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1679:3: lv_systemConstituent_5_0= ruleSystemConstituent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getSystemConstituentSystemConstituentParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystemConstituent_in_ruleSystem3412);
            	    lv_systemConstituent_5_0=ruleSystemConstituent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systemConstituent",
            	            		lv_systemConstituent_5_0, 
            	            		"SystemConstituent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSystem3426); 

                	newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1707:1: entryRuleSystemConstituent returns [EObject current=null] : iv_ruleSystemConstituent= ruleSystemConstituent EOF ;
    public final EObject entryRuleSystemConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1708:2: (iv_ruleSystemConstituent= ruleSystemConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1709:2: iv_ruleSystemConstituent= ruleSystemConstituent EOF
            {
             newCompositeNode(grammarAccess.getSystemConstituentRule()); 
            pushFollow(FOLLOW_ruleSystemConstituent_in_entryRuleSystemConstituent3462);
            iv_ruleSystemConstituent=ruleSystemConstituent();

            state._fsp--;

             current =iv_ruleSystemConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemConstituent3472); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemConstituent"


    // $ANTLR start "ruleSystemConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1716:1: ruleSystemConstituent returns [EObject current=null] : (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck ) ;
    public final EObject ruleSystemConstituent() throws RecognitionException {
        EObject current = null;

        EObject this_Compositional_0 = null;

        EObject this_Check_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1719:28: ( (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1720:1: (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1720:1: (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31||(LA41_0>=34 && LA41_0<=36)) ) {
                alt41=1;
            }
            else if ( (LA41_0==29) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1721:5: this_Compositional_0= ruleCompositional
                    {
                     
                            newCompositeNode(grammarAccess.getSystemConstituentAccess().getCompositionalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompositional_in_ruleSystemConstituent3519);
                    this_Compositional_0=ruleCompositional();

                    state._fsp--;

                     
                            current = this_Compositional_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1731:5: this_Check_1= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getSystemConstituentAccess().getCheckParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleSystemConstituent3546);
                    this_Check_1=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemConstituent"


    // $ANTLR start "entryRuleCompositional"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1747:1: entryRuleCompositional returns [EObject current=null] : iv_ruleCompositional= ruleCompositional EOF ;
    public final EObject entryRuleCompositional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositional = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1748:2: (iv_ruleCompositional= ruleCompositional EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1749:2: iv_ruleCompositional= ruleCompositional EOF
            {
             newCompositeNode(grammarAccess.getCompositionalRule()); 
            pushFollow(FOLLOW_ruleCompositional_in_entryRuleCompositional3581);
            iv_ruleCompositional=ruleCompositional();

            state._fsp--;

             current =iv_ruleCompositional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositional3591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositional"


    // $ANTLR start "ruleCompositional"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1756:1: ruleCompositional returns [EObject current=null] : (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_Connector_2= ruleConnector | this_Link_3= ruleLink ) ;
    public final EObject ruleCompositional() throws RecognitionException {
        EObject current = null;

        EObject this_Layer_0 = null;

        EObject this_Component_1 = null;

        EObject this_Connector_2 = null;

        EObject this_Link_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1759:28: ( (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_Connector_2= ruleConnector | this_Link_3= ruleLink ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1760:1: (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_Connector_2= ruleConnector | this_Link_3= ruleLink )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1760:1: (this_Layer_0= ruleLayer | this_Component_1= ruleComponent | this_Connector_2= ruleConnector | this_Link_3= ruleLink )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt42=1;
                }
                break;
            case 34:
                {
                alt42=2;
                }
                break;
            case 35:
                {
                alt42=3;
                }
                break;
            case 36:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1761:5: this_Layer_0= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getCompositionalAccess().getLayerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLayer_in_ruleCompositional3638);
                    this_Layer_0=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1771:5: this_Component_1= ruleComponent
                    {
                     
                            newCompositeNode(grammarAccess.getCompositionalAccess().getComponentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComponent_in_ruleCompositional3665);
                    this_Component_1=ruleComponent();

                    state._fsp--;

                     
                            current = this_Component_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1781:5: this_Connector_2= ruleConnector
                    {
                     
                            newCompositeNode(grammarAccess.getCompositionalAccess().getConnectorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConnector_in_ruleCompositional3692);
                    this_Connector_2=ruleConnector();

                    state._fsp--;

                     
                            current = this_Connector_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1791:5: this_Link_3= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getCompositionalAccess().getLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleCompositional3719);
                    this_Link_3=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositional"


    // $ANTLR start "entryRuleLayer"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1807:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1808:2: (iv_ruleLayer= ruleLayer EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1809:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_ruleLayer_in_entryRuleLayer3754);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayer3764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1816:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_becauseClause_6_0= ruleBecauseClause ) )? otherlv_7= '{' ( ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_becauseClause_6_0 = null;

        EObject lv_layerAnnotation_8_0 = null;

        EObject lv_layerConstituent_9_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1819:28: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_becauseClause_6_0= ruleBecauseClause ) )? otherlv_7= '{' ( ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) ) )* otherlv_10= '}' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1820:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_becauseClause_6_0= ruleBecauseClause ) )? otherlv_7= '{' ( ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) ) )* otherlv_10= '}' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1820:1: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_becauseClause_6_0= ruleBecauseClause ) )? otherlv_7= '{' ( ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) ) )* otherlv_10= '}' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1820:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ( (lv_becauseClause_6_0= ruleBecauseClause ) )? otherlv_7= '{' ( ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleLayer3801); 

                	newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1824:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1825:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1825:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1826:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer3818); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1842:2: (otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1842:4: otherlv_2= 'over' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleLayer3836); 

                        	newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getOverKeyword_2_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1846:1: ( (otherlv_3= RULE_ID ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1847:1: (otherlv_3= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1847:1: (otherlv_3= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1848:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer3856); 

                    		newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getSuperLayerLayerCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1859:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==33) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1859:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleLayer3869); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1863:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1864:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1864:1: (otherlv_5= RULE_ID )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1865:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getLayerRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLayer3889); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getSuperLayerLayerCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1876:6: ( (lv_becauseClause_6_0= ruleBecauseClause ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1877:1: (lv_becauseClause_6_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1877:1: (lv_becauseClause_6_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1878:3: lv_becauseClause_6_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayerAccess().getBecauseClauseBecauseClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleLayer3914);
                    lv_becauseClause_6_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayerRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_6_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleLayer3927); 

                	newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_4());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1898:1: ( ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==29||LA47_0==31||(LA47_0>=34 && LA47_0<=36)||LA47_0==41) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1898:2: ( (lv_layerAnnotation_8_0= ruleAnnotation ) )* ( (lv_layerConstituent_9_0= ruleLayerConstituent ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1898:2: ( (lv_layerAnnotation_8_0= ruleAnnotation ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==41) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1899:1: (lv_layerAnnotation_8_0= ruleAnnotation )
            	    	    {
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1899:1: (lv_layerAnnotation_8_0= ruleAnnotation )
            	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1900:3: lv_layerAnnotation_8_0= ruleAnnotation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getLayerAccess().getLayerAnnotationAnnotationParserRuleCall_5_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleLayer3949);
            	    	    lv_layerAnnotation_8_0=ruleAnnotation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getLayerRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"layerAnnotation",
            	    	            		lv_layerAnnotation_8_0, 
            	    	            		"Annotation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1916:3: ( (lv_layerConstituent_9_0= ruleLayerConstituent ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1917:1: (lv_layerConstituent_9_0= ruleLayerConstituent )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1917:1: (lv_layerConstituent_9_0= ruleLayerConstituent )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1918:3: lv_layerConstituent_9_0= ruleLayerConstituent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayerAccess().getLayerConstituentLayerConstituentParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLayerConstituent_in_ruleLayer3971);
            	    lv_layerConstituent_9_0=ruleLayerConstituent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"layerConstituent",
            	            		lv_layerConstituent_9_0, 
            	            		"LayerConstituent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleLayer3985); 

                	newLeafNode(otherlv_10, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleLayerConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1946:1: entryRuleLayerConstituent returns [EObject current=null] : iv_ruleLayerConstituent= ruleLayerConstituent EOF ;
    public final EObject entryRuleLayerConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayerConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1947:2: (iv_ruleLayerConstituent= ruleLayerConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1948:2: iv_ruleLayerConstituent= ruleLayerConstituent EOF
            {
             newCompositeNode(grammarAccess.getLayerConstituentRule()); 
            pushFollow(FOLLOW_ruleLayerConstituent_in_entryRuleLayerConstituent4021);
            iv_ruleLayerConstituent=ruleLayerConstituent();

            state._fsp--;

             current =iv_ruleLayerConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLayerConstituent4031); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayerConstituent"


    // $ANTLR start "ruleLayerConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1955:1: ruleLayerConstituent returns [EObject current=null] : (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck ) ;
    public final EObject ruleLayerConstituent() throws RecognitionException {
        EObject current = null;

        EObject this_Compositional_0 = null;

        EObject this_Check_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1958:28: ( (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1959:1: (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1959:1: (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31||(LA48_0>=34 && LA48_0<=36)) ) {
                alt48=1;
            }
            else if ( (LA48_0==29) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1960:5: this_Compositional_0= ruleCompositional
                    {
                     
                            newCompositeNode(grammarAccess.getLayerConstituentAccess().getCompositionalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompositional_in_ruleLayerConstituent4078);
                    this_Compositional_0=ruleCompositional();

                    state._fsp--;

                     
                            current = this_Compositional_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1970:5: this_Check_1= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getLayerConstituentAccess().getCheckParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleLayerConstituent4105);
                    this_Check_1=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerConstituent"


    // $ANTLR start "entryRuleComponent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1986:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1987:2: (iv_ruleComponent= ruleComponent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1988:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent4140);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent4150); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1995:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_argumentList_5_0 = null;

        EObject lv_becauseClause_7_0 = null;

        EObject lv_annotation_9_0 = null;

        EObject lv_instantiableConstituent_10_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1998:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1999:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1999:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:1999:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleComponent4187); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2003:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2004:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2004:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2005:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent4204); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleComponent4221); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getEqualsSignKeyword_2());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2025:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2026:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2026:1: (otherlv_3= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2027:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent4241); 

            		newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getValueTemplateCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleComponent4253); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2042:1: ( (lv_argumentList_5_0= ruleArgumentList ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||(LA49_0>=39 && LA49_0<=40)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2043:1: (lv_argumentList_5_0= ruleArgumentList )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2043:1: (lv_argumentList_5_0= ruleArgumentList )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2044:3: lv_argumentList_5_0= ruleArgumentList
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getArgumentListArgumentListParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentList_in_ruleComponent4274);
                    lv_argumentList_5_0=ruleArgumentList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"argumentList",
                            		lv_argumentList_5_0, 
                            		"ArgumentList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleComponent4287); 

                	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRightParenthesisKeyword_6());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2064:1: ( (lv_becauseClause_7_0= ruleBecauseClause ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2065:1: (lv_becauseClause_7_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2065:1: (lv_becauseClause_7_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2066:3: lv_becauseClause_7_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentAccess().getBecauseClauseBecauseClauseParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleComponent4308);
                    lv_becauseClause_7_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_7_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2082:3: ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==13) ) {
                alt53=1;
            }
            else if ( (LA53_0==17) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2082:4: (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2082:4: (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2082:6: otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleComponent4323); 

                        	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_8_0_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2086:1: ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==29||LA52_0==31||(LA52_0>=34 && LA52_0<=36)||LA52_0==41) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2086:2: ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2086:2: ( (lv_annotation_9_0= ruleAnnotation ) )*
                    	    loop51:
                    	    do {
                    	        int alt51=2;
                    	        int LA51_0 = input.LA(1);

                    	        if ( (LA51_0==41) ) {
                    	            alt51=1;
                    	        }


                    	        switch (alt51) {
                    	    	case 1 :
                    	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2087:1: (lv_annotation_9_0= ruleAnnotation )
                    	    	    {
                    	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2087:1: (lv_annotation_9_0= ruleAnnotation )
                    	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2088:3: lv_annotation_9_0= ruleAnnotation
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getComponentAccess().getAnnotationAnnotationParserRuleCall_8_0_1_0_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleComponent4345);
                    	    	    lv_annotation_9_0=ruleAnnotation();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"annotation",
                    	    	            		lv_annotation_9_0, 
                    	    	            		"Annotation");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop51;
                    	        }
                    	    } while (true);

                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2104:3: ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2105:1: (lv_instantiableConstituent_10_0= ruleInstantiableConstituent )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2105:1: (lv_instantiableConstituent_10_0= ruleInstantiableConstituent )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2106:3: lv_instantiableConstituent_10_0= ruleInstantiableConstituent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getInstantiableConstituentInstantiableConstituentParserRuleCall_8_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiableConstituent_in_ruleComponent4367);
                    	    lv_instantiableConstituent_10_0=ruleInstantiableConstituent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instantiableConstituent",
                    	            		lv_instantiableConstituent_10_0, 
                    	            		"InstantiableConstituent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleComponent4381); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2127:7: otherlv_12= ';'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleComponent4400); 

                        	newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getSemicolonKeyword_8_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnector"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2139:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2140:2: (iv_ruleConnector= ruleConnector EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2141:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector4437);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector4447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2148:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_argumentList_5_0 = null;

        EObject lv_becauseClause_7_0 = null;

        EObject lv_annotation_9_0 = null;

        EObject lv_instantiableConstituent_10_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2151:28: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2152:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2152:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2152:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_argumentList_5_0= ruleArgumentList ) )? otherlv_6= ')' ( (lv_becauseClause_7_0= ruleBecauseClause ) )? ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleConnector4484); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2156:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2157:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2157:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2158:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector4501); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleConnector4518); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getEqualsSignKeyword_2());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2178:1: ( (otherlv_3= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2179:1: (otherlv_3= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2179:1: (otherlv_3= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2180:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector4538); 

            		newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getValueTemplateCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConnector4550); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getLeftParenthesisKeyword_4());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2195:1: ( (lv_argumentList_5_0= ruleArgumentList ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||(LA54_0>=39 && LA54_0<=40)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2196:1: (lv_argumentList_5_0= ruleArgumentList )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2196:1: (lv_argumentList_5_0= ruleArgumentList )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2197:3: lv_argumentList_5_0= ruleArgumentList
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorAccess().getArgumentListArgumentListParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentList_in_ruleConnector4571);
                    lv_argumentList_5_0=ruleArgumentList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	        }
                           		set(
                           			current, 
                           			"argumentList",
                            		lv_argumentList_5_0, 
                            		"ArgumentList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleConnector4584); 

                	newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getRightParenthesisKeyword_6());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2217:1: ( (lv_becauseClause_7_0= ruleBecauseClause ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==44) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2218:1: (lv_becauseClause_7_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2218:1: (lv_becauseClause_7_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2219:3: lv_becauseClause_7_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorAccess().getBecauseClauseBecauseClauseParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleConnector4605);
                    lv_becauseClause_7_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_7_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2235:3: ( (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' ) | otherlv_12= ';' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==13) ) {
                alt58=1;
            }
            else if ( (LA58_0==17) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2235:4: (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2235:4: (otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2235:6: otherlv_8= '{' ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleConnector4620); 

                        	newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_8_0_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2239:1: ( ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==29||LA57_0==31||(LA57_0>=34 && LA57_0<=36)||LA57_0==41) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2239:2: ( (lv_annotation_9_0= ruleAnnotation ) )* ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2239:2: ( (lv_annotation_9_0= ruleAnnotation ) )*
                    	    loop56:
                    	    do {
                    	        int alt56=2;
                    	        int LA56_0 = input.LA(1);

                    	        if ( (LA56_0==41) ) {
                    	            alt56=1;
                    	        }


                    	        switch (alt56) {
                    	    	case 1 :
                    	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2240:1: (lv_annotation_9_0= ruleAnnotation )
                    	    	    {
                    	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2240:1: (lv_annotation_9_0= ruleAnnotation )
                    	    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2241:3: lv_annotation_9_0= ruleAnnotation
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getConnectorAccess().getAnnotationAnnotationParserRuleCall_8_0_1_0_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleConnector4642);
                    	    	    lv_annotation_9_0=ruleAnnotation();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"annotation",
                    	    	            		lv_annotation_9_0, 
                    	    	            		"Annotation");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop56;
                    	        }
                    	    } while (true);

                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2257:3: ( (lv_instantiableConstituent_10_0= ruleInstantiableConstituent ) )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2258:1: (lv_instantiableConstituent_10_0= ruleInstantiableConstituent )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2258:1: (lv_instantiableConstituent_10_0= ruleInstantiableConstituent )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2259:3: lv_instantiableConstituent_10_0= ruleInstantiableConstituent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnectorAccess().getInstantiableConstituentInstantiableConstituentParserRuleCall_8_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiableConstituent_in_ruleConnector4664);
                    	    lv_instantiableConstituent_10_0=ruleInstantiableConstituent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instantiableConstituent",
                    	            		lv_instantiableConstituent_10_0, 
                    	            		"InstantiableConstituent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleConnector4678); 

                        	newLeafNode(otherlv_11, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2280:7: otherlv_12= ';'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleConnector4697); 

                        	newLeafNode(otherlv_12, grammarAccess.getConnectorAccess().getSemicolonKeyword_8_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleInstantiableConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2292:1: entryRuleInstantiableConstituent returns [EObject current=null] : iv_ruleInstantiableConstituent= ruleInstantiableConstituent EOF ;
    public final EObject entryRuleInstantiableConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiableConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2293:2: (iv_ruleInstantiableConstituent= ruleInstantiableConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2294:2: iv_ruleInstantiableConstituent= ruleInstantiableConstituent EOF
            {
             newCompositeNode(grammarAccess.getInstantiableConstituentRule()); 
            pushFollow(FOLLOW_ruleInstantiableConstituent_in_entryRuleInstantiableConstituent4734);
            iv_ruleInstantiableConstituent=ruleInstantiableConstituent();

            state._fsp--;

             current =iv_ruleInstantiableConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiableConstituent4744); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstantiableConstituent"


    // $ANTLR start "ruleInstantiableConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2301:1: ruleInstantiableConstituent returns [EObject current=null] : (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck ) ;
    public final EObject ruleInstantiableConstituent() throws RecognitionException {
        EObject current = null;

        EObject this_Compositional_0 = null;

        EObject this_Check_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2304:28: ( (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2305:1: (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2305:1: (this_Compositional_0= ruleCompositional | this_Check_1= ruleCheck )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==31||(LA59_0>=34 && LA59_0<=36)) ) {
                alt59=1;
            }
            else if ( (LA59_0==29) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2306:5: this_Compositional_0= ruleCompositional
                    {
                     
                            newCompositeNode(grammarAccess.getInstantiableConstituentAccess().getCompositionalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompositional_in_ruleInstantiableConstituent4791);
                    this_Compositional_0=ruleCompositional();

                    state._fsp--;

                     
                            current = this_Compositional_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2316:5: this_Check_1= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInstantiableConstituentAccess().getCheckParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleInstantiableConstituent4818);
                    this_Check_1=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstantiableConstituent"


    // $ANTLR start "entryRuleLink"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2332:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2333:2: (iv_ruleLink= ruleLink EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2334:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink4853);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink4863); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2341:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_type_1_0= RULE_ID ) )? ( (lv_linkConsumer_2_0= ruleLinkConsumerExpression ) ) otherlv_3= 'to' ( (lv_linkProviders_4_0= ruleLinkProvidersList ) ) ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_linkConsumer_2_0 = null;

        EObject lv_linkProviders_4_0 = null;

        EObject lv_becauseClause_5_0 = null;

        EObject lv_linkConstituent_7_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2344:28: ( (otherlv_0= 'link' ( (lv_type_1_0= RULE_ID ) )? ( (lv_linkConsumer_2_0= ruleLinkConsumerExpression ) ) otherlv_3= 'to' ( (lv_linkProviders_4_0= ruleLinkProvidersList ) ) ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2345:1: (otherlv_0= 'link' ( (lv_type_1_0= RULE_ID ) )? ( (lv_linkConsumer_2_0= ruleLinkConsumerExpression ) ) otherlv_3= 'to' ( (lv_linkProviders_4_0= ruleLinkProvidersList ) ) ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2345:1: (otherlv_0= 'link' ( (lv_type_1_0= RULE_ID ) )? ( (lv_linkConsumer_2_0= ruleLinkConsumerExpression ) ) otherlv_3= 'to' ( (lv_linkProviders_4_0= ruleLinkProvidersList ) ) ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2345:3: otherlv_0= 'link' ( (lv_type_1_0= RULE_ID ) )? ( (lv_linkConsumer_2_0= ruleLinkConsumerExpression ) ) otherlv_3= 'to' ( (lv_linkProviders_4_0= ruleLinkProvidersList ) ) ( (lv_becauseClause_5_0= ruleBecauseClause ) )? ( (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleLink4900); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2349:1: ( (lv_type_1_0= RULE_ID ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==RULE_ID) ) {
                    alt60=1;
                }
            }
            switch (alt60) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2350:1: (lv_type_1_0= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2350:1: (lv_type_1_0= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2351:3: lv_type_1_0= RULE_ID
                    {
                    lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLink4917); 

                    			newLeafNode(lv_type_1_0, grammarAccess.getLinkAccess().getTypeIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2367:3: ( (lv_linkConsumer_2_0= ruleLinkConsumerExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2368:1: (lv_linkConsumer_2_0= ruleLinkConsumerExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2368:1: (lv_linkConsumer_2_0= ruleLinkConsumerExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2369:3: lv_linkConsumer_2_0= ruleLinkConsumerExpression
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getLinkConsumerLinkConsumerExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkConsumerExpression_in_ruleLink4944);
            lv_linkConsumer_2_0=ruleLinkConsumerExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"linkConsumer",
                    		lv_linkConsumer_2_0, 
                    		"LinkConsumerExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleLink4956); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getToKeyword_3());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2389:1: ( (lv_linkProviders_4_0= ruleLinkProvidersList ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2390:1: (lv_linkProviders_4_0= ruleLinkProvidersList )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2390:1: (lv_linkProviders_4_0= ruleLinkProvidersList )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2391:3: lv_linkProviders_4_0= ruleLinkProvidersList
            {
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getLinkProvidersLinkProvidersListParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProvidersList_in_ruleLink4977);
            lv_linkProviders_4_0=ruleLinkProvidersList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkRule());
            	        }
                   		set(
                   			current, 
                   			"linkProviders",
                    		lv_linkProviders_4_0, 
                    		"LinkProvidersList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2407:2: ( (lv_becauseClause_5_0= ruleBecauseClause ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==44) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2408:1: (lv_becauseClause_5_0= ruleBecauseClause )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2408:1: (lv_becauseClause_5_0= ruleBecauseClause )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2409:3: lv_becauseClause_5_0= ruleBecauseClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getLinkAccess().getBecauseClauseBecauseClauseParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBecauseClause_in_ruleLink4998);
                    lv_becauseClause_5_0=ruleBecauseClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"becauseClause",
                            		lv_becauseClause_5_0, 
                            		"BecauseClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2425:3: ( (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' ) | otherlv_9= ';' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==13) ) {
                alt63=1;
            }
            else if ( (LA63_0==17) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2425:4: (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2425:4: (otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2425:6: otherlv_6= '{' ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )* otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleLink5013); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_6_0_0());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2429:1: ( (lv_linkConstituent_7_0= ruleLinkConstituent ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==29||LA62_0==41) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2430:1: (lv_linkConstituent_7_0= ruleLinkConstituent )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2430:1: (lv_linkConstituent_7_0= ruleLinkConstituent )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2431:3: lv_linkConstituent_7_0= ruleLinkConstituent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLinkAccess().getLinkConstituentLinkConstituentParserRuleCall_6_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLinkConstituent_in_ruleLink5034);
                    	    lv_linkConstituent_7_0=ruleLinkConstituent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"linkConstituent",
                    	            		lv_linkConstituent_7_0, 
                    	            		"LinkConstituent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleLink5047); 

                        	newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_6_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2452:7: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleLink5066); 

                        	newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getSemicolonKeyword_6_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleLinkConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2464:1: entryRuleLinkConstituent returns [EObject current=null] : iv_ruleLinkConstituent= ruleLinkConstituent EOF ;
    public final EObject entryRuleLinkConstituent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkConstituent = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2465:2: (iv_ruleLinkConstituent= ruleLinkConstituent EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2466:2: iv_ruleLinkConstituent= ruleLinkConstituent EOF
            {
             newCompositeNode(grammarAccess.getLinkConstituentRule()); 
            pushFollow(FOLLOW_ruleLinkConstituent_in_entryRuleLinkConstituent5103);
            iv_ruleLinkConstituent=ruleLinkConstituent();

            state._fsp--;

             current =iv_ruleLinkConstituent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkConstituent5113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkConstituent"


    // $ANTLR start "ruleLinkConstituent"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2473:1: ruleLinkConstituent returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) ) ;
    public final EObject ruleLinkConstituent() throws RecognitionException {
        EObject current = null;

        EObject lv_annotation_0_0 = null;

        EObject lv_check_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2476:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2477:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2477:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2477:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( (lv_check_1_0= ruleCheck ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2477:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==41) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2478:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2478:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2479:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkConstituentAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleLinkConstituent5159);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkConstituentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotation",
            	            		lv_annotation_0_0, 
            	            		"Annotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2495:3: ( (lv_check_1_0= ruleCheck ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2496:1: (lv_check_1_0= ruleCheck )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2496:1: (lv_check_1_0= ruleCheck )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2497:3: lv_check_1_0= ruleCheck
            {
             
            	        newCompositeNode(grammarAccess.getLinkConstituentAccess().getCheckCheckParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCheck_in_ruleLinkConstituent5181);
            lv_check_1_0=ruleCheck();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkConstituentRule());
            	        }
                   		set(
                   			current, 
                   			"check",
                    		lv_check_1_0, 
                    		"Check");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkConstituent"


    // $ANTLR start "entryRuleLinkConsumerExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2521:1: entryRuleLinkConsumerExpression returns [EObject current=null] : iv_ruleLinkConsumerExpression= ruleLinkConsumerExpression EOF ;
    public final EObject entryRuleLinkConsumerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkConsumerExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2522:2: (iv_ruleLinkConsumerExpression= ruleLinkConsumerExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2523:2: iv_ruleLinkConsumerExpression= ruleLinkConsumerExpression EOF
            {
             newCompositeNode(grammarAccess.getLinkConsumerExpressionRule()); 
            pushFollow(FOLLOW_ruleLinkConsumerExpression_in_entryRuleLinkConsumerExpression5217);
            iv_ruleLinkConsumerExpression=ruleLinkConsumerExpression();

            state._fsp--;

             current =iv_ruleLinkConsumerExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkConsumerExpression5227); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkConsumerExpression"


    // $ANTLR start "ruleLinkConsumerExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2530:1: ruleLinkConsumerExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) ) )* ) ;
    public final EObject ruleLinkConsumerExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rightConsumer_2_1=null;
        Token lv_rightConsumer_2_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2533:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2534:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2534:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2534:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2534:2: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2535:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2535:1: (otherlv_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2536:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkConsumerExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkConsumerExpression5272); 

            		newLeafNode(otherlv_0, grammarAccess.getLinkConsumerExpressionAccess().getConsumerLinkConsumerPartCrossReference_0_0()); 
            	

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2547:2: (otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==38) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2547:4: otherlv_1= '.' ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLinkConsumerExpression5285); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLinkConsumerExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2551:1: ( ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2552:1: ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2552:1: ( (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2553:1: (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2553:1: (lv_rightConsumer_2_1= RULE_ID | lv_rightConsumer_2_2= 'out' )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_ID) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==39) ) {
            	        alt65=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2554:3: lv_rightConsumer_2_1= RULE_ID
            	            {
            	            lv_rightConsumer_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkConsumerExpression5304); 

            	            			newLeafNode(lv_rightConsumer_2_1, grammarAccess.getLinkConsumerExpressionAccess().getRightConsumerIDTerminalRuleCall_1_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLinkConsumerExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"rightConsumer",
            	                    		lv_rightConsumer_2_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2569:8: lv_rightConsumer_2_2= 'out'
            	            {
            	            lv_rightConsumer_2_2=(Token)match(input,39,FOLLOW_39_in_ruleLinkConsumerExpression5325); 

            	                    newLeafNode(lv_rightConsumer_2_2, grammarAccess.getLinkConsumerExpressionAccess().getRightConsumerOutKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLinkConsumerExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "rightConsumer", lv_rightConsumer_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkConsumerExpression"


    // $ANTLR start "entryRuleLinkProvidersList"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2594:1: entryRuleLinkProvidersList returns [EObject current=null] : iv_ruleLinkProvidersList= ruleLinkProvidersList EOF ;
    public final EObject entryRuleLinkProvidersList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProvidersList = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2595:2: (iv_ruleLinkProvidersList= ruleLinkProvidersList EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2596:2: iv_ruleLinkProvidersList= ruleLinkProvidersList EOF
            {
             newCompositeNode(grammarAccess.getLinkProvidersListRule()); 
            pushFollow(FOLLOW_ruleLinkProvidersList_in_entryRuleLinkProvidersList5381);
            iv_ruleLinkProvidersList=ruleLinkProvidersList();

            state._fsp--;

             current =iv_ruleLinkProvidersList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProvidersList5391); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkProvidersList"


    // $ANTLR start "ruleLinkProvidersList"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2603:1: ruleLinkProvidersList returns [EObject current=null] : ( ( (lv_providers_0_0= ruleLinkProviders ) ) (otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) ) )* ) ;
    public final EObject ruleLinkProvidersList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_providers_0_0 = null;

        EObject lv_providers_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2606:28: ( ( ( (lv_providers_0_0= ruleLinkProviders ) ) (otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2607:1: ( ( (lv_providers_0_0= ruleLinkProviders ) ) (otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2607:1: ( ( (lv_providers_0_0= ruleLinkProviders ) ) (otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2607:2: ( (lv_providers_0_0= ruleLinkProviders ) ) (otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2607:2: ( (lv_providers_0_0= ruleLinkProviders ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2608:1: (lv_providers_0_0= ruleLinkProviders )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2608:1: (lv_providers_0_0= ruleLinkProviders )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2609:3: lv_providers_0_0= ruleLinkProviders
            {
             
            	        newCompositeNode(grammarAccess.getLinkProvidersListAccess().getProvidersLinkProvidersParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProviders_in_ruleLinkProvidersList5437);
            lv_providers_0_0=ruleLinkProviders();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkProvidersListRule());
            	        }
                   		add(
                   			current, 
                   			"providers",
                    		lv_providers_0_0, 
                    		"LinkProviders");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2625:2: (otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==33) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2625:4: otherlv_1= ',' ( (lv_providers_2_0= ruleLinkProviders ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleLinkProvidersList5450); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLinkProvidersListAccess().getCommaKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2629:1: ( (lv_providers_2_0= ruleLinkProviders ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2630:1: (lv_providers_2_0= ruleLinkProviders )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2630:1: (lv_providers_2_0= ruleLinkProviders )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2631:3: lv_providers_2_0= ruleLinkProviders
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkProvidersListAccess().getProvidersLinkProvidersParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkProviders_in_ruleLinkProvidersList5471);
            	    lv_providers_2_0=ruleLinkProviders();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkProvidersListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"providers",
            	            		lv_providers_2_0, 
            	            		"LinkProviders");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkProvidersList"


    // $ANTLR start "entryRuleLinkProviders"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2655:1: entryRuleLinkProviders returns [EObject current=null] : iv_ruleLinkProviders= ruleLinkProviders EOF ;
    public final EObject entryRuleLinkProviders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProviders = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2656:2: (iv_ruleLinkProviders= ruleLinkProviders EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2657:2: iv_ruleLinkProviders= ruleLinkProviders EOF
            {
             newCompositeNode(grammarAccess.getLinkProvidersRule()); 
            pushFollow(FOLLOW_ruleLinkProviders_in_entryRuleLinkProviders5509);
            iv_ruleLinkProviders=ruleLinkProviders();

            state._fsp--;

             current =iv_ruleLinkProviders; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProviders5519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkProviders"


    // $ANTLR start "ruleLinkProviders"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2664:1: ruleLinkProviders returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) ) )* ) ;
    public final EObject ruleLinkProviders() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_rightProvider_2_1=null;
        Token lv_rightProvider_2_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2667:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2668:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2668:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2668:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2668:2: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2669:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2669:1: (otherlv_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2670:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkProvidersRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProviders5564); 

            		newLeafNode(otherlv_0, grammarAccess.getLinkProvidersAccess().getProviderLinkProviderPartCrossReference_0_0()); 
            	

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2681:2: (otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==38) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2681:4: otherlv_1= '.' ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleLinkProviders5577); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLinkProvidersAccess().getFullStopKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2685:1: ( ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2686:1: ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2686:1: ( (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2687:1: (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2687:1: (lv_rightProvider_2_1= RULE_ID | lv_rightProvider_2_2= 'in' )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==RULE_ID) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==40) ) {
            	        alt68=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2688:3: lv_rightProvider_2_1= RULE_ID
            	            {
            	            lv_rightProvider_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProviders5596); 

            	            			newLeafNode(lv_rightProvider_2_1, grammarAccess.getLinkProvidersAccess().getRightProviderIDTerminalRuleCall_1_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLinkProvidersRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"rightProvider",
            	                    		lv_rightProvider_2_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2703:8: lv_rightProvider_2_2= 'in'
            	            {
            	            lv_rightProvider_2_2=(Token)match(input,40,FOLLOW_40_in_ruleLinkProviders5617); 

            	                    newLeafNode(lv_rightProvider_2_2, grammarAccess.getLinkProvidersAccess().getRightProviderInKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLinkProvidersRule());
            	            	        }
            	                   		addWithLastConsumed(current, "rightProvider", lv_rightProvider_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkProviders"


    // $ANTLR start "entryRuleAnnotation"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2728:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2729:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2730:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation5673);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation5683); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2737:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_annotation_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_value_3_0= ruleNameValues ) ) otherlv_4= ')' ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_annotation_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2740:28: ( (otherlv_0= '@' ( (lv_annotation_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_value_3_0= ruleNameValues ) ) otherlv_4= ')' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2741:1: (otherlv_0= '@' ( (lv_annotation_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_value_3_0= ruleNameValues ) ) otherlv_4= ')' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2741:1: (otherlv_0= '@' ( (lv_annotation_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_value_3_0= ruleNameValues ) ) otherlv_4= ')' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2741:3: otherlv_0= '@' ( (lv_annotation_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_value_3_0= ruleNameValues ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleAnnotation5720); 

                	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2745:1: ( (lv_annotation_1_0= RULE_ID ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2746:1: (lv_annotation_1_0= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2746:1: (lv_annotation_1_0= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2747:3: lv_annotation_1_0= RULE_ID
                    {
                    lv_annotation_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation5737); 

                    			newLeafNode(lv_annotation_1_0, grammarAccess.getAnnotationAccess().getAnnotationIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"annotation",
                            		lv_annotation_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAnnotation5755); 

                	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2767:1: ( (lv_value_3_0= ruleNameValues ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2768:1: (lv_value_3_0= ruleNameValues )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2768:1: (lv_value_3_0= ruleNameValues )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2769:3: lv_value_3_0= ruleNameValues
            {
             
            	        newCompositeNode(grammarAccess.getAnnotationAccess().getValueNameValuesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNameValues_in_ruleAnnotation5776);
            lv_value_3_0=ruleNameValues();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"NameValues");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAnnotation5788); 

                	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleNameValue"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2797:1: entryRuleNameValue returns [EObject current=null] : iv_ruleNameValue= ruleNameValue EOF ;
    public final EObject entryRuleNameValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameValue = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2798:2: (iv_ruleNameValue= ruleNameValue EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2799:2: iv_ruleNameValue= ruleNameValue EOF
            {
             newCompositeNode(grammarAccess.getNameValueRule()); 
            pushFollow(FOLLOW_ruleNameValue_in_entryRuleNameValue5824);
            iv_ruleNameValue=ruleNameValue();

            state._fsp--;

             current =iv_ruleNameValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameValue5834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameValue"


    // $ANTLR start "ruleNameValue"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2806:1: ruleNameValue returns [EObject current=null] : ( ( (lv_namePair_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valuePair_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNameValue() throws RecognitionException {
        EObject current = null;

        Token lv_namePair_0_0=null;
        Token otherlv_1=null;
        EObject lv_valuePair_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2809:28: ( ( ( (lv_namePair_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valuePair_2_0= ruleExpression ) ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2810:1: ( ( (lv_namePair_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valuePair_2_0= ruleExpression ) ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2810:1: ( ( (lv_namePair_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valuePair_2_0= ruleExpression ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2810:2: ( (lv_namePair_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valuePair_2_0= ruleExpression ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2810:2: ( (lv_namePair_0_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2811:1: (lv_namePair_0_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2811:1: (lv_namePair_0_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2812:3: lv_namePair_0_0= RULE_ID
            {
            lv_namePair_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameValue5876); 

            			newLeafNode(lv_namePair_0_0, grammarAccess.getNameValueAccess().getNamePairIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"namePair",
                    		lv_namePair_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleNameValue5893); 

                	newLeafNode(otherlv_1, grammarAccess.getNameValueAccess().getEqualsSignKeyword_1());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2832:1: ( (lv_valuePair_2_0= ruleExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2833:1: (lv_valuePair_2_0= ruleExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2833:1: (lv_valuePair_2_0= ruleExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2834:3: lv_valuePair_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getNameValueAccess().getValuePairExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleNameValue5914);
            lv_valuePair_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNameValueRule());
            	        }
                   		set(
                   			current, 
                   			"valuePair",
                    		lv_valuePair_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameValue"


    // $ANTLR start "entryRuleNameValues"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2858:1: entryRuleNameValues returns [EObject current=null] : iv_ruleNameValues= ruleNameValues EOF ;
    public final EObject entryRuleNameValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameValues = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2859:2: (iv_ruleNameValues= ruleNameValues EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2860:2: iv_ruleNameValues= ruleNameValues EOF
            {
             newCompositeNode(grammarAccess.getNameValuesRule()); 
            pushFollow(FOLLOW_ruleNameValues_in_entryRuleNameValues5950);
            iv_ruleNameValues=ruleNameValues();

            state._fsp--;

             current =iv_ruleNameValues; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameValues5960); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameValues"


    // $ANTLR start "ruleNameValues"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2867:1: ruleNameValues returns [EObject current=null] : ( ( (lv_members_0_0= ruleNameValue ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) ) )* ) ;
    public final EObject ruleNameValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_members_0_0 = null;

        EObject lv_members_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2870:28: ( ( ( (lv_members_0_0= ruleNameValue ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2871:1: ( ( (lv_members_0_0= ruleNameValue ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2871:1: ( ( (lv_members_0_0= ruleNameValue ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2871:2: ( (lv_members_0_0= ruleNameValue ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2871:2: ( (lv_members_0_0= ruleNameValue ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2872:1: (lv_members_0_0= ruleNameValue )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2872:1: (lv_members_0_0= ruleNameValue )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2873:3: lv_members_0_0= ruleNameValue
            {
             
            	        newCompositeNode(grammarAccess.getNameValuesAccess().getMembersNameValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNameValue_in_ruleNameValues6006);
            lv_members_0_0=ruleNameValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNameValuesRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_0_0, 
                    		"NameValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2889:2: (otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==33) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2889:4: otherlv_1= ',' ( (lv_members_2_0= ruleNameValue ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleNameValues6019); 

            	        	newLeafNode(otherlv_1, grammarAccess.getNameValuesAccess().getCommaKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2893:1: ( (lv_members_2_0= ruleNameValue ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2894:1: (lv_members_2_0= ruleNameValue )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2894:1: (lv_members_2_0= ruleNameValue )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2895:3: lv_members_2_0= ruleNameValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNameValuesAccess().getMembersNameValueParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNameValue_in_ruleNameValues6040);
            	    lv_members_2_0=ruleNameValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNameValuesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_2_0, 
            	            		"NameValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameValues"


    // $ANTLR start "entryRuleSupportsClause"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2919:1: entryRuleSupportsClause returns [EObject current=null] : iv_ruleSupportsClause= ruleSupportsClause EOF ;
    public final EObject entryRuleSupportsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportsClause = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2920:2: (iv_ruleSupportsClause= ruleSupportsClause EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2921:2: iv_ruleSupportsClause= ruleSupportsClause EOF
            {
             newCompositeNode(grammarAccess.getSupportsClauseRule()); 
            pushFollow(FOLLOW_ruleSupportsClause_in_entryRuleSupportsClause6078);
            iv_ruleSupportsClause=ruleSupportsClause();

            state._fsp--;

             current =iv_ruleSupportsClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportsClause6088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupportsClause"


    // $ANTLR start "ruleSupportsClause"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2928:1: ruleSupportsClause returns [EObject current=null] : (otherlv_0= 'supports' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleSupportsClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2931:28: ( (otherlv_0= 'supports' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2932:1: (otherlv_0= 'supports' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2932:1: (otherlv_0= 'supports' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2932:3: otherlv_0= 'supports' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleSupportsClause6125); 

                	newLeafNode(otherlv_0, grammarAccess.getSupportsClauseAccess().getSupportsKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2936:1: ( (otherlv_1= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2937:1: (otherlv_1= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2937:1: (otherlv_1= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2938:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSupportsClauseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSupportsClause6145); 

            		newLeafNode(otherlv_1, grammarAccess.getSupportsClauseAccess().getValueRequirementOrQualityCrossReference_1_0()); 
            	

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2949:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==33) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2949:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSupportsClause6158); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSupportsClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2953:1: ( (otherlv_3= RULE_ID ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2954:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2954:1: (otherlv_3= RULE_ID )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2955:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSupportsClauseRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSupportsClause6178); 

            	    		newLeafNode(otherlv_3, grammarAccess.getSupportsClauseAccess().getValueRequirementOrQualityCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportsClause"


    // $ANTLR start "entryRuleInhibitsClause"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2974:1: entryRuleInhibitsClause returns [EObject current=null] : iv_ruleInhibitsClause= ruleInhibitsClause EOF ;
    public final EObject entryRuleInhibitsClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInhibitsClause = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2975:2: (iv_ruleInhibitsClause= ruleInhibitsClause EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2976:2: iv_ruleInhibitsClause= ruleInhibitsClause EOF
            {
             newCompositeNode(grammarAccess.getInhibitsClauseRule()); 
            pushFollow(FOLLOW_ruleInhibitsClause_in_entryRuleInhibitsClause6216);
            iv_ruleInhibitsClause=ruleInhibitsClause();

            state._fsp--;

             current =iv_ruleInhibitsClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInhibitsClause6226); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInhibitsClause"


    // $ANTLR start "ruleInhibitsClause"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2983:1: ruleInhibitsClause returns [EObject current=null] : (otherlv_0= 'inhibits' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleInhibitsClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2986:28: ( (otherlv_0= 'inhibits' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2987:1: (otherlv_0= 'inhibits' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2987:1: (otherlv_0= 'inhibits' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2987:3: otherlv_0= 'inhibits' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleInhibitsClause6263); 

                	newLeafNode(otherlv_0, grammarAccess.getInhibitsClauseAccess().getInhibitsKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2991:1: ( (otherlv_1= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2992:1: (otherlv_1= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2992:1: (otherlv_1= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:2993:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInhibitsClauseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInhibitsClause6283); 

            		newLeafNode(otherlv_1, grammarAccess.getInhibitsClauseAccess().getValueRequirementOrQualityCrossReference_1_0()); 
            	

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3004:2: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==33) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3004:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInhibitsClause6296); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInhibitsClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3008:1: ( (otherlv_3= RULE_ID ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3009:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3009:1: (otherlv_3= RULE_ID )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3010:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInhibitsClauseRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInhibitsClause6316); 

            	    		newLeafNode(otherlv_3, grammarAccess.getInhibitsClauseAccess().getValueRequirementOrQualityCrossReference_2_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInhibitsClause"


    // $ANTLR start "entryRuleBecauseClause"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3029:1: entryRuleBecauseClause returns [EObject current=null] : iv_ruleBecauseClause= ruleBecauseClause EOF ;
    public final EObject entryRuleBecauseClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecauseClause = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3030:2: (iv_ruleBecauseClause= ruleBecauseClause EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3031:2: iv_ruleBecauseClause= ruleBecauseClause EOF
            {
             newCompositeNode(grammarAccess.getBecauseClauseRule()); 
            pushFollow(FOLLOW_ruleBecauseClause_in_entryRuleBecauseClause6354);
            iv_ruleBecauseClause=ruleBecauseClause();

            state._fsp--;

             current =iv_ruleBecauseClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBecauseClause6364); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecauseClause"


    // $ANTLR start "ruleBecauseClause"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3038:1: ruleBecauseClause returns [EObject current=null] : (otherlv_0= 'because' ( (lv_members_1_0= ruleBecauseCausalcontext ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) ) )* ) ;
    public final EObject ruleBecauseClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3041:28: ( (otherlv_0= 'because' ( (lv_members_1_0= ruleBecauseCausalcontext ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3042:1: (otherlv_0= 'because' ( (lv_members_1_0= ruleBecauseCausalcontext ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3042:1: (otherlv_0= 'because' ( (lv_members_1_0= ruleBecauseCausalcontext ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3042:3: otherlv_0= 'because' ( (lv_members_1_0= ruleBecauseCausalcontext ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) ) )*
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleBecauseClause6401); 

                	newLeafNode(otherlv_0, grammarAccess.getBecauseClauseAccess().getBecauseKeyword_0());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3046:1: ( (lv_members_1_0= ruleBecauseCausalcontext ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3047:1: (lv_members_1_0= ruleBecauseCausalcontext )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3047:1: (lv_members_1_0= ruleBecauseCausalcontext )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3048:3: lv_members_1_0= ruleBecauseCausalcontext
            {
             
            	        newCompositeNode(grammarAccess.getBecauseClauseAccess().getMembersBecauseCausalcontextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBecauseCausalcontext_in_ruleBecauseClause6422);
            lv_members_1_0=ruleBecauseCausalcontext();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBecauseClauseRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"BecauseCausalcontext");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3064:2: (otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==33) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3064:4: otherlv_2= ',' ( (lv_members_3_0= ruleBecauseCausalcontext ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleBecauseClause6435); 

            	        	newLeafNode(otherlv_2, grammarAccess.getBecauseClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3068:1: ( (lv_members_3_0= ruleBecauseCausalcontext ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3069:1: (lv_members_3_0= ruleBecauseCausalcontext )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3069:1: (lv_members_3_0= ruleBecauseCausalcontext )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3070:3: lv_members_3_0= ruleBecauseCausalcontext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBecauseClauseAccess().getMembersBecauseCausalcontextParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBecauseCausalcontext_in_ruleBecauseClause6456);
            	    lv_members_3_0=ruleBecauseCausalcontext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBecauseClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"BecauseCausalcontext");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecauseClause"


    // $ANTLR start "entryRuleBecauseCausalcontext"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3094:1: entryRuleBecauseCausalcontext returns [EObject current=null] : iv_ruleBecauseCausalcontext= ruleBecauseCausalcontext EOF ;
    public final EObject entryRuleBecauseCausalcontext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBecauseCausalcontext = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3095:2: (iv_ruleBecauseCausalcontext= ruleBecauseCausalcontext EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3096:2: iv_ruleBecauseCausalcontext= ruleBecauseCausalcontext EOF
            {
             newCompositeNode(grammarAccess.getBecauseCausalcontextRule()); 
            pushFollow(FOLLOW_ruleBecauseCausalcontext_in_entryRuleBecauseCausalcontext6494);
            iv_ruleBecauseCausalcontext=ruleBecauseCausalcontext();

            state._fsp--;

             current =iv_ruleBecauseCausalcontext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBecauseCausalcontext6504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBecauseCausalcontext"


    // $ANTLR start "ruleBecauseCausalcontext"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3103:1: ruleBecauseCausalcontext returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_argumentList_2_0= ruleArgumentList ) )? otherlv_3= ')' ) ;
    public final EObject ruleBecauseCausalcontext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_argumentList_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3106:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_argumentList_2_0= ruleArgumentList ) )? otherlv_3= ')' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3107:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_argumentList_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3107:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_argumentList_2_0= ruleArgumentList ) )? otherlv_3= ')' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3107:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_argumentList_2_0= ruleArgumentList ) )? otherlv_3= ')'
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3107:2: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3108:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3108:1: (otherlv_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3109:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBecauseCausalcontextRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBecauseCausalcontext6549); 

            		newLeafNode(otherlv_0, grammarAccess.getBecauseCausalcontextAccess().getValueRationaleCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleBecauseCausalcontext6561); 

                	newLeafNode(otherlv_1, grammarAccess.getBecauseCausalcontextAccess().getLeftParenthesisKeyword_1());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3124:1: ( (lv_argumentList_2_0= ruleArgumentList ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||(LA75_0>=39 && LA75_0<=40)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3125:1: (lv_argumentList_2_0= ruleArgumentList )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3125:1: (lv_argumentList_2_0= ruleArgumentList )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3126:3: lv_argumentList_2_0= ruleArgumentList
                    {
                     
                    	        newCompositeNode(grammarAccess.getBecauseCausalcontextAccess().getArgumentListArgumentListParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgumentList_in_ruleBecauseCausalcontext6582);
                    lv_argumentList_2_0=ruleArgumentList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBecauseCausalcontextRule());
                    	        }
                           		set(
                           			current, 
                           			"argumentList",
                            		lv_argumentList_2_0, 
                            		"ArgumentList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBecauseCausalcontext6595); 

                	newLeafNode(otherlv_3, grammarAccess.getBecauseCausalcontextAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBecauseCausalcontext"


    // $ANTLR start "entryRuleParameterList"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3154:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3155:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3156:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList6631);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList6641); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3163:1: ruleParameterList returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3166:28: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3167:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3167:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3167:2: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3167:2: ( (lv_names_0_0= RULE_ID ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3168:1: (lv_names_0_0= RULE_ID )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3168:1: (lv_names_0_0= RULE_ID )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3169:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterList6683); 

            			newLeafNode(lv_names_0_0, grammarAccess.getParameterListAccess().getNamesIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterListRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_0_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3185:2: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==33) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3185:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleParameterList6701); 

            	        	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3189:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3190:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3190:1: (lv_names_2_0= RULE_ID )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3191:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterList6718); 

            	    			newLeafNode(lv_names_2_0, grammarAccess.getParameterListAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getParameterListRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleArgumentList"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3215:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3216:2: (iv_ruleArgumentList= ruleArgumentList EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3217:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
             newCompositeNode(grammarAccess.getArgumentListRule()); 
            pushFollow(FOLLOW_ruleArgumentList_in_entryRuleArgumentList6761);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;

             current =iv_ruleArgumentList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentList6771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3224:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_members_0_0= ruleMemberExpression ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_members_0_0 = null;

        EObject lv_members_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3227:28: ( ( ( (lv_members_0_0= ruleMemberExpression ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3228:1: ( ( (lv_members_0_0= ruleMemberExpression ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3228:1: ( ( (lv_members_0_0= ruleMemberExpression ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3228:2: ( (lv_members_0_0= ruleMemberExpression ) ) (otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3228:2: ( (lv_members_0_0= ruleMemberExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3229:1: (lv_members_0_0= ruleMemberExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3229:1: (lv_members_0_0= ruleMemberExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3230:3: lv_members_0_0= ruleMemberExpression
            {
             
            	        newCompositeNode(grammarAccess.getArgumentListAccess().getMembersMemberExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMemberExpression_in_ruleArgumentList6817);
            lv_members_0_0=ruleMemberExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArgumentListRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_0_0, 
                    		"MemberExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3246:2: (otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==33) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3246:4: otherlv_1= ',' ( (lv_members_2_0= ruleMemberExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleArgumentList6830); 

            	        	newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3250:1: ( (lv_members_2_0= ruleMemberExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3251:1: (lv_members_2_0= ruleMemberExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3251:1: (lv_members_2_0= ruleMemberExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3252:3: lv_members_2_0= ruleMemberExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArgumentListAccess().getMembersMemberExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMemberExpression_in_ruleArgumentList6851);
            	    lv_members_2_0=ruleMemberExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArgumentListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_2_0, 
            	            		"MemberExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3276:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3277:2: (iv_ruleExpression= ruleExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3278:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6889);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3285:1: ruleExpression returns [EObject current=null] : this_SubsetofExpression_0= ruleSubsetofExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubsetofExpression_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3288:28: (this_SubsetofExpression_0= ruleSubsetofExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3290:5: this_SubsetofExpression_0= ruleSubsetofExpression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getSubsetofExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSubsetofExpression_in_ruleExpression6945);
            this_SubsetofExpression_0=ruleSubsetofExpression();

            state._fsp--;

             
                    current = this_SubsetofExpression_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSubsetofExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3306:1: entryRuleSubsetofExpression returns [EObject current=null] : iv_ruleSubsetofExpression= ruleSubsetofExpression EOF ;
    public final EObject entryRuleSubsetofExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsetofExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3307:2: (iv_ruleSubsetofExpression= ruleSubsetofExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3308:2: iv_ruleSubsetofExpression= ruleSubsetofExpression EOF
            {
             newCompositeNode(grammarAccess.getSubsetofExpressionRule()); 
            pushFollow(FOLLOW_ruleSubsetofExpression_in_entryRuleSubsetofExpression6979);
            iv_ruleSubsetofExpression=ruleSubsetofExpression();

            state._fsp--;

             current =iv_ruleSubsetofExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsetofExpression6989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsetofExpression"


    // $ANTLR start "ruleSubsetofExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3315:1: ruleSubsetofExpression returns [EObject current=null] : ( ( (lv_logicalOr_0_0= ruleLogicalOrExpression ) ) (otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) ) )* ) ;
    public final EObject ruleSubsetofExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_logicalOr_0_0 = null;

        EObject lv_logicalOr_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3318:28: ( ( ( (lv_logicalOr_0_0= ruleLogicalOrExpression ) ) (otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3319:1: ( ( (lv_logicalOr_0_0= ruleLogicalOrExpression ) ) (otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3319:1: ( ( (lv_logicalOr_0_0= ruleLogicalOrExpression ) ) (otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3319:2: ( (lv_logicalOr_0_0= ruleLogicalOrExpression ) ) (otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3319:2: ( (lv_logicalOr_0_0= ruleLogicalOrExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3320:1: (lv_logicalOr_0_0= ruleLogicalOrExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3320:1: (lv_logicalOr_0_0= ruleLogicalOrExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3321:3: lv_logicalOr_0_0= ruleLogicalOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getSubsetofExpressionAccess().getLogicalOrLogicalOrExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleSubsetofExpression7035);
            lv_logicalOr_0_0=ruleLogicalOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsetofExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"logicalOr",
                    		lv_logicalOr_0_0, 
                    		"LogicalOrExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3337:2: (otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==45) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3337:4: otherlv_1= 'subsetof' ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleSubsetofExpression7048); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSubsetofExpressionAccess().getSubsetofKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3341:1: ( (lv_logicalOr_2_0= ruleLogicalOrExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3342:1: (lv_logicalOr_2_0= ruleLogicalOrExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3342:1: (lv_logicalOr_2_0= ruleLogicalOrExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3343:3: lv_logicalOr_2_0= ruleLogicalOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsetofExpressionAccess().getLogicalOrLogicalOrExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleSubsetofExpression7069);
            	    lv_logicalOr_2_0=ruleLogicalOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsetofExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"logicalOr",
            	            		lv_logicalOr_2_0, 
            	            		"LogicalOrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsetofExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3367:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3368:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3369:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7107);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;

             current =iv_ruleLogicalOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression7117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3376:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_logicalAnd_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_logicalAnd_0_0 = null;

        EObject lv_logicalAnd_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3379:28: ( ( ( (lv_logicalAnd_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3380:1: ( ( (lv_logicalAnd_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3380:1: ( ( (lv_logicalAnd_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3380:2: ( (lv_logicalAnd_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3380:2: ( (lv_logicalAnd_0_0= ruleLogicalAndExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3381:1: (lv_logicalAnd_0_0= ruleLogicalAndExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3381:1: (lv_logicalAnd_0_0= ruleLogicalAndExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3382:3: lv_logicalAnd_0_0= ruleLogicalAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndLogicalAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7163);
            lv_logicalAnd_0_0=ruleLogicalAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"logicalAnd",
                    		lv_logicalAnd_0_0, 
                    		"LogicalAndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3398:2: (otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==46) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3398:4: otherlv_1= '||' ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleLogicalOrExpression7176); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3402:1: ( (lv_logicalAnd_2_0= ruleLogicalAndExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3403:1: (lv_logicalAnd_2_0= ruleLogicalAndExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3403:1: (lv_logicalAnd_2_0= ruleLogicalAndExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3404:3: lv_logicalAnd_2_0= ruleLogicalAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndLogicalAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7197);
            	    lv_logicalAnd_2_0=ruleLogicalAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"logicalAnd",
            	            		lv_logicalAnd_2_0, 
            	            		"LogicalAndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3428:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3429:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3430:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7235);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;

             current =iv_ruleLogicalAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression7245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3437:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_bitwiseOr_0_0= ruleBitwiseOrExpression ) ) (otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bitwiseOr_0_0 = null;

        EObject lv_bitwiseOr_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3440:28: ( ( ( (lv_bitwiseOr_0_0= ruleBitwiseOrExpression ) ) (otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3441:1: ( ( (lv_bitwiseOr_0_0= ruleBitwiseOrExpression ) ) (otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3441:1: ( ( (lv_bitwiseOr_0_0= ruleBitwiseOrExpression ) ) (otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3441:2: ( (lv_bitwiseOr_0_0= ruleBitwiseOrExpression ) ) (otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3441:2: ( (lv_bitwiseOr_0_0= ruleBitwiseOrExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3442:1: (lv_bitwiseOr_0_0= ruleBitwiseOrExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3442:1: (lv_bitwiseOr_0_0= ruleBitwiseOrExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3443:3: lv_bitwiseOr_0_0= ruleBitwiseOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrBitwiseOrExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression7291);
            lv_bitwiseOr_0_0=ruleBitwiseOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"bitwiseOr",
                    		lv_bitwiseOr_0_0, 
                    		"BitwiseOrExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3459:2: (otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==47) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3459:4: otherlv_1= '&&' ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleLogicalAndExpression7304); 

            	        	newLeafNode(otherlv_1, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3463:1: ( (lv_bitwiseOr_2_0= ruleBitwiseOrExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3464:1: (lv_bitwiseOr_2_0= ruleBitwiseOrExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3464:1: (lv_bitwiseOr_2_0= ruleBitwiseOrExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3465:3: lv_bitwiseOr_2_0= ruleBitwiseOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrBitwiseOrExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression7325);
            	    lv_bitwiseOr_2_0=ruleBitwiseOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bitwiseOr",
            	            		lv_bitwiseOr_2_0, 
            	            		"BitwiseOrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3489:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3490:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3491:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
             newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            pushFollow(FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7363);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;

             current =iv_ruleBitwiseOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOrExpression7373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3498:1: ruleBitwiseOrExpression returns [EObject current=null] : ( ( (lv_bitwiseXor_0_0= ruleBitwiseXorExpression ) ) (otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) ) )* ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bitwiseXor_0_0 = null;

        EObject lv_bitwiseXor_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3501:28: ( ( ( (lv_bitwiseXor_0_0= ruleBitwiseXorExpression ) ) (otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3502:1: ( ( (lv_bitwiseXor_0_0= ruleBitwiseXorExpression ) ) (otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3502:1: ( ( (lv_bitwiseXor_0_0= ruleBitwiseXorExpression ) ) (otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3502:2: ( (lv_bitwiseXor_0_0= ruleBitwiseXorExpression ) ) (otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3502:2: ( (lv_bitwiseXor_0_0= ruleBitwiseXorExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3503:1: (lv_bitwiseXor_0_0= ruleBitwiseXorExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3503:1: (lv_bitwiseXor_0_0= ruleBitwiseXorExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3504:3: lv_bitwiseXor_0_0= ruleBitwiseXorExpression
            {
             
            	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXorBitwiseXorExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleBitwiseOrExpression7419);
            lv_bitwiseXor_0_0=ruleBitwiseXorExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"bitwiseXor",
                    		lv_bitwiseXor_0_0, 
                    		"BitwiseXorExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3520:2: (otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==48) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3520:4: otherlv_1= '|' ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleBitwiseOrExpression7432); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3524:1: ( (lv_bitwiseXor_2_0= ruleBitwiseXorExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3525:1: (lv_bitwiseXor_2_0= ruleBitwiseXorExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3525:1: (lv_bitwiseXor_2_0= ruleBitwiseXorExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3526:3: lv_bitwiseXor_2_0= ruleBitwiseXorExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXorBitwiseXorExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBitwiseXorExpression_in_ruleBitwiseOrExpression7453);
            	    lv_bitwiseXor_2_0=ruleBitwiseXorExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bitwiseXor",
            	            		lv_bitwiseXor_2_0, 
            	            		"BitwiseXorExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseXorExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3550:1: entryRuleBitwiseXorExpression returns [EObject current=null] : iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF ;
    public final EObject entryRuleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXorExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3551:2: (iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3552:2: iv_ruleBitwiseXorExpression= ruleBitwiseXorExpression EOF
            {
             newCompositeNode(grammarAccess.getBitwiseXorExpressionRule()); 
            pushFollow(FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7491);
            iv_ruleBitwiseXorExpression=ruleBitwiseXorExpression();

            state._fsp--;

             current =iv_ruleBitwiseXorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseXorExpression7501); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseXorExpression"


    // $ANTLR start "ruleBitwiseXorExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3559:1: ruleBitwiseXorExpression returns [EObject current=null] : ( ( (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression ) ) (otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) ) )* ) ;
    public final EObject ruleBitwiseXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bitwiseAnd_0_0 = null;

        EObject lv_bitwiseAnd_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3562:28: ( ( ( (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression ) ) (otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3563:1: ( ( (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression ) ) (otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3563:1: ( ( (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression ) ) (otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3563:2: ( (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression ) ) (otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3563:2: ( (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3564:1: (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3564:1: (lv_bitwiseAnd_0_0= ruleBitwiseAndExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3565:3: lv_bitwiseAnd_0_0= ruleBitwiseAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseAndBitwiseAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseXorExpression7547);
            lv_bitwiseAnd_0_0=ruleBitwiseAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBitwiseXorExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"bitwiseAnd",
                    		lv_bitwiseAnd_0_0, 
                    		"BitwiseAndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3581:2: (otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==49) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3581:4: otherlv_1= '^' ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleBitwiseXorExpression7560); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBitwiseXorExpressionAccess().getCircumflexAccentKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3585:1: ( (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3586:1: (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3586:1: (lv_bitwiseAnd_2_0= ruleBitwiseAndExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3587:3: lv_bitwiseAnd_2_0= ruleBitwiseAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBitwiseXorExpressionAccess().getBitwiseAndBitwiseAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseXorExpression7581);
            	    lv_bitwiseAnd_2_0=ruleBitwiseAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBitwiseXorExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bitwiseAnd",
            	            		lv_bitwiseAnd_2_0, 
            	            		"BitwiseAndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseXorExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3611:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3612:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3613:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
             newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            pushFollow(FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7619);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;

             current =iv_ruleBitwiseAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseAndExpression7629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3620:1: ruleBitwiseAndExpression returns [EObject current=null] : ( ( (lv_equality_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_equality_0_0 = null;

        EObject lv_equality_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3623:28: ( ( ( (lv_equality_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3624:1: ( ( (lv_equality_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3624:1: ( ( (lv_equality_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3624:2: ( (lv_equality_0_0= ruleEqualityExpression ) ) (otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3624:2: ( (lv_equality_0_0= ruleEqualityExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3625:1: (lv_equality_0_0= ruleEqualityExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3625:1: (lv_equality_0_0= ruleEqualityExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3626:3: lv_equality_0_0= ruleEqualityExpression
            {
             
            	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getEqualityEqualityExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleBitwiseAndExpression7675);
            lv_equality_0_0=ruleEqualityExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"equality",
                    		lv_equality_0_0, 
                    		"EqualityExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3642:2: (otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==50) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3642:4: otherlv_1= '&' ( (lv_equality_2_0= ruleEqualityExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleBitwiseAndExpression7688); 

            	        	newLeafNode(otherlv_1, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3646:1: ( (lv_equality_2_0= ruleEqualityExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3647:1: (lv_equality_2_0= ruleEqualityExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3647:1: (lv_equality_2_0= ruleEqualityExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3648:3: lv_equality_2_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getEqualityEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleBitwiseAndExpression7709);
            	    lv_equality_2_0=ruleEqualityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"equality",
            	            		lv_equality_2_0, 
            	            		"EqualityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3672:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3673:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3674:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression7747);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression7757); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3681:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_relational_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_relational_0_0 = null;

        EObject lv_relational_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3684:28: ( ( ( (lv_relational_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3685:1: ( ( (lv_relational_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3685:1: ( ( (lv_relational_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3685:2: ( (lv_relational_0_0= ruleRelationalExpression ) ) ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3685:2: ( (lv_relational_0_0= ruleRelationalExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3686:1: (lv_relational_0_0= ruleRelationalExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3686:1: (lv_relational_0_0= ruleRelationalExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3687:3: lv_relational_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression7803);
            lv_relational_0_0=ruleRelationalExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"relational",
                    		lv_relational_0_0, 
                    		"RelationalExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3703:2: ( ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=51 && LA85_0<=52)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3703:3: ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) ) ( (lv_relational_2_0= ruleRelationalExpression ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3703:3: ( ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3704:1: ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3704:1: ( (lv_op_1_1= '==' | lv_op_1_2= '!=' ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3705:1: (lv_op_1_1= '==' | lv_op_1_2= '!=' )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3705:1: (lv_op_1_1= '==' | lv_op_1_2= '!=' )
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==51) ) {
            	        alt84=1;
            	    }
            	    else if ( (LA84_0==52) ) {
            	        alt84=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 84, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3706:3: lv_op_1_1= '=='
            	            {
            	            lv_op_1_1=(Token)match(input,51,FOLLOW_51_in_ruleEqualityExpression7824); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3718:8: lv_op_1_2= '!='
            	            {
            	            lv_op_1_2=(Token)match(input,52,FOLLOW_52_in_ruleEqualityExpression7853); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3733:2: ( (lv_relational_2_0= ruleRelationalExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3734:1: (lv_relational_2_0= ruleRelationalExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3734:1: (lv_relational_2_0= ruleRelationalExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3735:3: lv_relational_2_0= ruleRelationalExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalRelationalExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression7890);
            	    lv_relational_2_0=ruleRelationalExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relational",
            	            		lv_relational_2_0, 
            	            		"RelationalExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3759:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3760:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3761:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression7928);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression7938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3768:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_additive_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        Token lv_op_1_4=null;
        EObject lv_additive_0_0 = null;

        EObject lv_additive_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3771:28: ( ( ( (lv_additive_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3772:1: ( ( (lv_additive_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3772:1: ( ( (lv_additive_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3772:2: ( (lv_additive_0_0= ruleAdditiveExpression ) ) ( ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3772:2: ( (lv_additive_0_0= ruleAdditiveExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3773:1: (lv_additive_0_0= ruleAdditiveExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3773:1: (lv_additive_0_0= ruleAdditiveExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3774:3: lv_additive_0_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveAdditiveExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression7984);
            lv_additive_0_0=ruleAdditiveExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"additive",
                    		lv_additive_0_0, 
                    		"AdditiveExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3790:2: ( ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( ((LA87_0>=53 && LA87_0<=56)) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3790:3: ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) ) ( (lv_additive_2_0= ruleAdditiveExpression ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3790:3: ( ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3791:1: ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3791:1: ( (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3792:1: (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3792:1: (lv_op_1_1= '>' | lv_op_1_2= '<' | lv_op_1_3= '>=' | lv_op_1_4= '<=' )
            	    int alt86=4;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt86=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt86=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt86=3;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt86=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 86, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt86) {
            	        case 1 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3793:3: lv_op_1_1= '>'
            	            {
            	            lv_op_1_1=(Token)match(input,53,FOLLOW_53_in_ruleRelationalExpression8005); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3805:8: lv_op_1_2= '<'
            	            {
            	            lv_op_1_2=(Token)match(input,54,FOLLOW_54_in_ruleRelationalExpression8034); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3817:8: lv_op_1_3= '>='
            	            {
            	            lv_op_1_3=(Token)match(input,55,FOLLOW_55_in_ruleRelationalExpression8063); 

            	                    newLeafNode(lv_op_1_3, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3829:8: lv_op_1_4= '<='
            	            {
            	            lv_op_1_4=(Token)match(input,56,FOLLOW_56_in_ruleRelationalExpression8092); 

            	                    newLeafNode(lv_op_1_4, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_0_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3844:2: ( (lv_additive_2_0= ruleAdditiveExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3845:1: (lv_additive_2_0= ruleAdditiveExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3845:1: (lv_additive_2_0= ruleAdditiveExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3846:3: lv_additive_2_0= ruleAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveAdditiveExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression8129);
            	    lv_additive_2_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additive",
            	            		lv_additive_2_0, 
            	            		"AdditiveExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3870:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3871:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3872:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression8167);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression8177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3879:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_multiplicative_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_multiplicative_0_0 = null;

        EObject lv_multiplicative_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3882:28: ( ( ( (lv_multiplicative_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3883:1: ( ( (lv_multiplicative_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3883:1: ( ( (lv_multiplicative_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3883:2: ( (lv_multiplicative_0_0= ruleMultiplicativeExpression ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3883:2: ( (lv_multiplicative_0_0= ruleMultiplicativeExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3884:1: (lv_multiplicative_0_0= ruleMultiplicativeExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3884:1: (lv_multiplicative_0_0= ruleMultiplicativeExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3885:3: lv_multiplicative_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression8223);
            lv_multiplicative_0_0=ruleMultiplicativeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"multiplicative",
                    		lv_multiplicative_0_0, 
                    		"MultiplicativeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3901:2: ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=57 && LA89_0<=58)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3901:3: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3901:3: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3902:1: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3902:1: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3903:1: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3903:1: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    int alt88=2;
            	    int LA88_0 = input.LA(1);

            	    if ( (LA88_0==57) ) {
            	        alt88=1;
            	    }
            	    else if ( (LA88_0==58) ) {
            	        alt88=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 88, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt88) {
            	        case 1 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3904:3: lv_op_1_1= '+'
            	            {
            	            lv_op_1_1=(Token)match(input,57,FOLLOW_57_in_ruleAdditiveExpression8244); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3916:8: lv_op_1_2= '-'
            	            {
            	            lv_op_1_2=(Token)match(input,58,FOLLOW_58_in_ruleAdditiveExpression8273); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3931:2: ( (lv_multiplicative_2_0= ruleMultiplicativeExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3932:1: (lv_multiplicative_2_0= ruleMultiplicativeExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3932:1: (lv_multiplicative_2_0= ruleMultiplicativeExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3933:3: lv_multiplicative_2_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression8310);
            	    lv_multiplicative_2_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"multiplicative",
            	            		lv_multiplicative_2_0, 
            	            		"MultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3957:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3958:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3959:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression8348);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression8358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3966:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_unary_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_unary_0_0 = null;

        EObject lv_unary_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3969:28: ( ( ( (lv_unary_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3970:1: ( ( (lv_unary_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3970:1: ( ( (lv_unary_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3970:2: ( (lv_unary_0_0= ruleUnaryExpression ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3970:2: ( (lv_unary_0_0= ruleUnaryExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3971:1: (lv_unary_0_0= ruleUnaryExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3971:1: (lv_unary_0_0= ruleUnaryExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3972:3: lv_unary_0_0= ruleUnaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryUnaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8404);
            lv_unary_0_0=ruleUnaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"unary",
                    		lv_unary_0_0, 
                    		"UnaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3988:2: ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=59 && LA91_0<=61)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3988:3: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) ) ( (lv_unary_2_0= ruleUnaryExpression ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3988:3: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3989:1: ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3989:1: ( (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3990:1: (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3990:1: (lv_op_1_1= '*' | lv_op_1_2= '/' | lv_op_1_3= '%' )
            	    int alt90=3;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt90=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt90=2;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt90=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 90, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt90) {
            	        case 1 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:3991:3: lv_op_1_1= '*'
            	            {
            	            lv_op_1_1=(Token)match(input,59,FOLLOW_59_in_ruleMultiplicativeExpression8425); 

            	                    newLeafNode(lv_op_1_1, grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4003:8: lv_op_1_2= '/'
            	            {
            	            lv_op_1_2=(Token)match(input,60,FOLLOW_60_in_ruleMultiplicativeExpression8454); 

            	                    newLeafNode(lv_op_1_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4015:8: lv_op_1_3= '%'
            	            {
            	            lv_op_1_3=(Token)match(input,61,FOLLOW_61_in_ruleMultiplicativeExpression8483); 

            	                    newLeafNode(lv_op_1_3, grammarAccess.getMultiplicativeExpressionAccess().getOpPercentSignKeyword_1_0_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "op", lv_op_1_3, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4030:2: ( (lv_unary_2_0= ruleUnaryExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4031:1: (lv_unary_2_0= ruleUnaryExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4031:1: (lv_unary_2_0= ruleUnaryExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4032:3: lv_unary_2_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8520);
            	    lv_unary_2_0=ruleUnaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"unary",
            	            		lv_unary_2_0, 
            	            		"UnaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4056:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4057:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4058:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression8558);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression8568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4065:1: ruleUnaryExpression returns [EObject current=null] : ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) ) )? ( (lv_right_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        Token lv_op_0_4=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4068:28: ( ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) ) )? ( (lv_right_1_0= rulePrimaryExpression ) ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4069:1: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) ) )? ( (lv_right_1_0= rulePrimaryExpression ) ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4069:1: ( ( ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) ) )? ( (lv_right_1_0= rulePrimaryExpression ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4069:2: ( ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) ) )? ( (lv_right_1_0= rulePrimaryExpression ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4069:2: ( ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=57 && LA93_0<=58)||(LA93_0>=62 && LA93_0<=63)) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4070:1: ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4070:1: ( (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4071:1: (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4071:1: (lv_op_0_1= '!' | lv_op_0_2= '~' | lv_op_0_3= '+' | lv_op_0_4= '-' )
                    int alt92=4;
                    switch ( input.LA(1) ) {
                    case 62:
                        {
                        alt92=1;
                        }
                        break;
                    case 63:
                        {
                        alt92=2;
                        }
                        break;
                    case 57:
                        {
                        alt92=3;
                        }
                        break;
                    case 58:
                        {
                        alt92=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }

                    switch (alt92) {
                        case 1 :
                            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4072:3: lv_op_0_1= '!'
                            {
                            lv_op_0_1=(Token)match(input,62,FOLLOW_62_in_ruleUnaryExpression8613); 

                                    newLeafNode(lv_op_0_1, grammarAccess.getUnaryExpressionAccess().getOpExclamationMarkKeyword_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4084:8: lv_op_0_2= '~'
                            {
                            lv_op_0_2=(Token)match(input,63,FOLLOW_63_in_ruleUnaryExpression8642); 

                                    newLeafNode(lv_op_0_2, grammarAccess.getUnaryExpressionAccess().getOpTildeKeyword_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4096:8: lv_op_0_3= '+'
                            {
                            lv_op_0_3=(Token)match(input,57,FOLLOW_57_in_ruleUnaryExpression8671); 

                                    newLeafNode(lv_op_0_3, grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_0_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_3, null);
                            	    

                            }
                            break;
                        case 4 :
                            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4108:8: lv_op_0_4= '-'
                            {
                            lv_op_0_4=(Token)match(input,58,FOLLOW_58_in_ruleUnaryExpression8700); 

                                    newLeafNode(lv_op_0_4, grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_0_0_3());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "op", lv_op_0_4, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4123:3: ( (lv_right_1_0= rulePrimaryExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4124:1: (lv_right_1_0= rulePrimaryExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4124:1: (lv_right_1_0= rulePrimaryExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4125:3: lv_right_1_0= rulePrimaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression8738);
            lv_right_1_0=rulePrimaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_1_0, 
                    		"PrimaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4149:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4150:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4151:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8774);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression8784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4158:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_MemberExpression_3= ruleMemberExpression | this_Literal_4= ruleLiteral ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_MemberExpression_3 = null;

        EObject this_Literal_4 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4161:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_MemberExpression_3= ruleMemberExpression | this_Literal_4= ruleLiteral ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4162:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_MemberExpression_3= ruleMemberExpression | this_Literal_4= ruleLiteral )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4162:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_MemberExpression_3= ruleMemberExpression | this_Literal_4= ruleLiteral )
            int alt94=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt94=1;
                }
                break;
            case RULE_ID:
            case 39:
            case 40:
                {
                alt94=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 38:
            case 64:
            case 66:
            case 67:
            case 68:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4162:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4162:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4162:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulePrimaryExpression8822); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression8844);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression8855); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4181:5: this_MemberExpression_3= ruleMemberExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMemberExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMemberExpression_in_rulePrimaryExpression8884);
                    this_MemberExpression_3=ruleMemberExpression();

                    state._fsp--;

                     
                            current = this_MemberExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4191:5: this_Literal_4= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression8911);
                    this_Literal_4=ruleLiteral();

                    state._fsp--;

                     
                            current = this_Literal_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleMemberExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4207:1: entryRuleMemberExpression returns [EObject current=null] : iv_ruleMemberExpression= ruleMemberExpression EOF ;
    public final EObject entryRuleMemberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberExpression = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4208:2: (iv_ruleMemberExpression= ruleMemberExpression EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4209:2: iv_ruleMemberExpression= ruleMemberExpression EOF
            {
             newCompositeNode(grammarAccess.getMemberExpressionRule()); 
            pushFollow(FOLLOW_ruleMemberExpression_in_entryRuleMemberExpression8946);
            iv_ruleMemberExpression=ruleMemberExpression();

            state._fsp--;

             current =iv_ruleMemberExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberExpression8956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberExpression"


    // $ANTLR start "ruleMemberExpression"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4216:1: ruleMemberExpression returns [EObject current=null] : ( ( (lv_member_0_0= ruleMemberPart ) ) (otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) ) )* ) ;
    public final EObject ruleMemberExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_member_0_0 = null;

        EObject lv_member_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4219:28: ( ( ( (lv_member_0_0= ruleMemberPart ) ) (otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4220:1: ( ( (lv_member_0_0= ruleMemberPart ) ) (otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4220:1: ( ( (lv_member_0_0= ruleMemberPart ) ) (otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4220:2: ( (lv_member_0_0= ruleMemberPart ) ) (otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4220:2: ( (lv_member_0_0= ruleMemberPart ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4221:1: (lv_member_0_0= ruleMemberPart )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4221:1: (lv_member_0_0= ruleMemberPart )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4222:3: lv_member_0_0= ruleMemberPart
            {
             
            	        newCompositeNode(grammarAccess.getMemberExpressionAccess().getMemberMemberPartParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMemberPart_in_ruleMemberExpression9002);
            lv_member_0_0=ruleMemberPart();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"member",
                    		lv_member_0_0, 
                    		"MemberPart");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4238:2: (otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==38) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4238:4: otherlv_1= '.' ( (lv_member_2_0= ruleMemberPart ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleMemberExpression9015); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMemberExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4242:1: ( (lv_member_2_0= ruleMemberPart ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4243:1: (lv_member_2_0= ruleMemberPart )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4243:1: (lv_member_2_0= ruleMemberPart )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4244:3: lv_member_2_0= ruleMemberPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMemberExpressionAccess().getMemberMemberPartParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMemberPart_in_ruleMemberExpression9036);
            	    lv_member_2_0=ruleMemberPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMemberExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"member",
            	            		lv_member_2_0, 
            	            		"MemberPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberExpression"


    // $ANTLR start "entryRuleMemberPart"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4268:1: entryRuleMemberPart returns [EObject current=null] : iv_ruleMemberPart= ruleMemberPart EOF ;
    public final EObject entryRuleMemberPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberPart = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4269:2: (iv_ruleMemberPart= ruleMemberPart EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4270:2: iv_ruleMemberPart= ruleMemberPart EOF
            {
             newCompositeNode(grammarAccess.getMemberPartRule()); 
            pushFollow(FOLLOW_ruleMemberPart_in_entryRuleMemberPart9074);
            iv_ruleMemberPart=ruleMemberPart();

            state._fsp--;

             current =iv_ruleMemberPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberPart9084); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberPart"


    // $ANTLR start "ruleMemberPart"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4277:1: ruleMemberPart returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= 'out' ) ) ;
    public final EObject ruleMemberPart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_memberArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4280:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= 'out' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4281:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= 'out' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4281:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')' ) | ( () otherlv_6= 'in' ) | ( () otherlv_8= 'out' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==20) ) {
                    alt96=2;
                }
                else if ( (LA96_1==EOF||LA96_1==17||LA96_1==21||LA96_1==33||LA96_1==38||(LA96_1>=42 && LA96_1<=61)) ) {
                    alt96=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt96=3;
                }
                break;
            case 39:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4281:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4281:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4282:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4282:1: (lv_name_0_0= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4283:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMemberPart9126); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getMemberPartAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberPartRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4300:6: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4300:6: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4300:7: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_memberArguments_3_0= ruleMemberArguments ) ) otherlv_4= ')'
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4300:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4301:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4301:1: (lv_name_1_0= RULE_ID )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4302:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMemberPart9155); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getMemberPartAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberPartRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMemberPart9172); 

                        	newLeafNode(otherlv_2, grammarAccess.getMemberPartAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4322:1: ( (lv_memberArguments_3_0= ruleMemberArguments ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4323:1: (lv_memberArguments_3_0= ruleMemberArguments )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4323:1: (lv_memberArguments_3_0= ruleMemberArguments )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4324:3: lv_memberArguments_3_0= ruleMemberArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getMemberPartAccess().getMemberArgumentsMemberArgumentsParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMemberArguments_in_ruleMemberPart9193);
                    lv_memberArguments_3_0=ruleMemberArguments();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMemberPartRule());
                    	        }
                           		set(
                           			current, 
                           			"memberArguments",
                            		lv_memberArguments_3_0, 
                            		"MemberArguments");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMemberPart9205); 

                        	newLeafNode(otherlv_4, grammarAccess.getMemberPartAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4345:6: ( () otherlv_6= 'in' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4345:6: ( () otherlv_6= 'in' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4345:7: () otherlv_6= 'in'
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4345:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4346:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMemberPartAccess().getMemberPartAction_2_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleMemberPart9234); 

                        	newLeafNode(otherlv_6, grammarAccess.getMemberPartAccess().getInKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4356:6: ( () otherlv_8= 'out' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4356:6: ( () otherlv_8= 'out' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4356:7: () otherlv_8= 'out'
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4356:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4357:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMemberPartAccess().getMemberPartAction_3_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleMemberPart9263); 

                        	newLeafNode(otherlv_8, grammarAccess.getMemberPartAccess().getOutKeyword_3_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberPart"


    // $ANTLR start "entryRuleMemberArguments"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4374:1: entryRuleMemberArguments returns [EObject current=null] : iv_ruleMemberArguments= ruleMemberArguments EOF ;
    public final EObject entryRuleMemberArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberArguments = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4375:2: (iv_ruleMemberArguments= ruleMemberArguments EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4376:2: iv_ruleMemberArguments= ruleMemberArguments EOF
            {
             newCompositeNode(grammarAccess.getMemberArgumentsRule()); 
            pushFollow(FOLLOW_ruleMemberArguments_in_entryRuleMemberArguments9300);
            iv_ruleMemberArguments=ruleMemberArguments();

            state._fsp--;

             current =iv_ruleMemberArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberArguments9310); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberArguments"


    // $ANTLR start "ruleMemberArguments"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4383:1: ruleMemberArguments returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleMemberArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4386:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4387:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4387:1: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )* )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4387:2: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4387:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4388:1: (lv_expression_0_0= ruleExpression )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4388:1: (lv_expression_0_0= ruleExpression )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4389:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getMemberArgumentsAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleMemberArguments9356);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberArgumentsRule());
            	        }
                   		add(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4405:2: (otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==33) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4405:4: otherlv_1= ',' ( (lv_expression_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMemberArguments9369); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMemberArgumentsAccess().getCommaKeyword_1_0());
            	        
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4409:1: ( (lv_expression_2_0= ruleExpression ) )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4410:1: (lv_expression_2_0= ruleExpression )
            	    {
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4410:1: (lv_expression_2_0= ruleExpression )
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4411:3: lv_expression_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMemberArgumentsAccess().getExpressionExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberArguments9390);
            	    lv_expression_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMemberArgumentsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expression",
            	            		lv_expression_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberArguments"


    // $ANTLR start "entryRuleLiteral"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4435:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4436:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4437:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral9428);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral9438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4444:1: ruleLiteral returns [EObject current=null] : (this_SetLiteral_0= ruleSetLiteral | ( () ruleINTEGER_LITERAL ) | ( () ruleREAL_LITERAL ) | this_BOOLEAN_LITERAL_5= ruleBOOLEAN_LITERAL | ( () this_STRING_7= RULE_STRING ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_7=null;
        EObject this_SetLiteral_0 = null;

        EObject this_BOOLEAN_LITERAL_5 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4447:28: ( (this_SetLiteral_0= ruleSetLiteral | ( () ruleINTEGER_LITERAL ) | ( () ruleREAL_LITERAL ) | this_BOOLEAN_LITERAL_5= ruleBOOLEAN_LITERAL | ( () this_STRING_7= RULE_STRING ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4448:1: (this_SetLiteral_0= ruleSetLiteral | ( () ruleINTEGER_LITERAL ) | ( () ruleREAL_LITERAL ) | this_BOOLEAN_LITERAL_5= ruleBOOLEAN_LITERAL | ( () this_STRING_7= RULE_STRING ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4448:1: (this_SetLiteral_0= ruleSetLiteral | ( () ruleINTEGER_LITERAL ) | ( () ruleREAL_LITERAL ) | this_BOOLEAN_LITERAL_5= ruleBOOLEAN_LITERAL | ( () this_STRING_7= RULE_STRING ) )
            int alt98=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt98=1;
                }
                break;
            case RULE_INT:
                {
                int LA98_2 = input.LA(2);

                if ( (LA98_2==RULE_INT||LA98_2==38) ) {
                    alt98=3;
                }
                else if ( (LA98_2==EOF||LA98_2==17||LA98_2==21||LA98_2==33||(LA98_2>=42 && LA98_2<=61)||LA98_2==65) ) {
                    alt98=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt98=3;
                }
                break;
            case 66:
            case 67:
            case 68:
                {
                alt98=4;
                }
                break;
            case RULE_STRING:
                {
                alt98=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4449:5: this_SetLiteral_0= ruleSetLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getSetLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSetLiteral_in_ruleLiteral9485);
                    this_SetLiteral_0=ruleSetLiteral();

                    state._fsp--;

                     
                            current = this_SetLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4458:6: ( () ruleINTEGER_LITERAL )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4458:6: ( () ruleINTEGER_LITERAL )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4458:7: () ruleINTEGER_LITERAL
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4458:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4459:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getINTEGER_LITERALParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_ruleLiteral9516);
                    ruleINTEGER_LITERAL();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4473:6: ( () ruleREAL_LITERAL )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4473:6: ( () ruleREAL_LITERAL )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4473:7: () ruleREAL_LITERAL
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4473:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4474:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getREAL_LITERALParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleREAL_LITERAL_in_ruleLiteral9548);
                    ruleREAL_LITERAL();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4489:5: this_BOOLEAN_LITERAL_5= ruleBOOLEAN_LITERAL
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBOOLEAN_LITERALParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_ruleLiteral9576);
                    this_BOOLEAN_LITERAL_5=ruleBOOLEAN_LITERAL();

                    state._fsp--;

                     
                            current = this_BOOLEAN_LITERAL_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4498:6: ( () this_STRING_7= RULE_STRING )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4498:6: ( () this_STRING_7= RULE_STRING )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4498:7: () this_STRING_7= RULE_STRING
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4498:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4499:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_4_0(),
                                current);
                        

                    }

                    this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral9602); 
                     
                        newLeafNode(this_STRING_7, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_4_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleSetLiteral"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4516:1: entryRuleSetLiteral returns [EObject current=null] : iv_ruleSetLiteral= ruleSetLiteral EOF ;
    public final EObject entryRuleSetLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLiteral = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4517:2: (iv_ruleSetLiteral= ruleSetLiteral EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4518:2: iv_ruleSetLiteral= ruleSetLiteral EOF
            {
             newCompositeNode(grammarAccess.getSetLiteralRule()); 
            pushFollow(FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral9638);
            iv_ruleSetLiteral=ruleSetLiteral();

            state._fsp--;

             current =iv_ruleSetLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLiteral9648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLiteral"


    // $ANTLR start "ruleSetLiteral"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4525:1: ruleSetLiteral returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleSetLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literal_2_0 = null;

        EObject lv_literal_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4528:28: ( ( () otherlv_1= '[' ( ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* )? otherlv_5= ']' ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4529:1: ( () otherlv_1= '[' ( ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* )? otherlv_5= ']' )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4529:1: ( () otherlv_1= '[' ( ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* )? otherlv_5= ']' )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4529:2: () otherlv_1= '[' ( ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* )? otherlv_5= ']'
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4529:2: ()
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4530:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSetLiteralAccess().getSetLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleSetLiteral9694); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLiteralAccess().getLeftSquareBracketKeyword_1());
                
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4539:1: ( ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=RULE_STRING && LA100_0<=RULE_INT)||LA100_0==38||LA100_0==64||(LA100_0>=66 && LA100_0<=68)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4539:2: ( (lv_literal_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )*
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4539:2: ( (lv_literal_2_0= ruleLiteral ) )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4540:1: (lv_literal_2_0= ruleLiteral )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4540:1: (lv_literal_2_0= ruleLiteral )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4541:3: lv_literal_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getLiteralLiteralParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleSetLiteral9716);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"literal",
                            		lv_literal_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4557:2: (otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==33) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4557:4: otherlv_3= ',' ( (lv_literal_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleSetLiteral9729); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getSetLiteralAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4561:1: ( (lv_literal_4_0= ruleLiteral ) )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4562:1: (lv_literal_4_0= ruleLiteral )
                    	    {
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4562:1: (lv_literal_4_0= ruleLiteral )
                    	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4563:3: lv_literal_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetLiteralAccess().getLiteralLiteralParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleSetLiteral9750);
                    	    lv_literal_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"literal",
                    	            		lv_literal_4_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleSetLiteral9766); 

                	newLeafNode(otherlv_5, grammarAccess.getSetLiteralAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLiteral"


    // $ANTLR start "entryRuleINTEGER_LITERAL"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4591:1: entryRuleINTEGER_LITERAL returns [String current=null] : iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF ;
    public final String entryRuleINTEGER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER_LITERAL = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4592:2: (iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4593:2: iv_ruleINTEGER_LITERAL= ruleINTEGER_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getINTEGER_LITERALRule()); 
            pushFollow(FOLLOW_ruleINTEGER_LITERAL_in_entryRuleINTEGER_LITERAL9803);
            iv_ruleINTEGER_LITERAL=ruleINTEGER_LITERAL();

            state._fsp--;

             current =iv_ruleINTEGER_LITERAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER_LITERAL9814); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTEGER_LITERAL"


    // $ANTLR start "ruleINTEGER_LITERAL"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4600:1: ruleINTEGER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleINTEGER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4603:28: (this_INT_0= RULE_INT )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4604:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTEGER_LITERAL9853); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getINTEGER_LITERALAccess().getINTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTEGER_LITERAL"


    // $ANTLR start "entryRuleREAL_LITERAL"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4619:1: entryRuleREAL_LITERAL returns [String current=null] : iv_ruleREAL_LITERAL= ruleREAL_LITERAL EOF ;
    public final String entryRuleREAL_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL_LITERAL = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4620:2: (iv_ruleREAL_LITERAL= ruleREAL_LITERAL EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4621:2: iv_ruleREAL_LITERAL= ruleREAL_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getREAL_LITERALRule()); 
            pushFollow(FOLLOW_ruleREAL_LITERAL_in_entryRuleREAL_LITERAL9898);
            iv_ruleREAL_LITERAL=ruleREAL_LITERAL();

            state._fsp--;

             current =iv_ruleREAL_LITERAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL_LITERAL9909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleREAL_LITERAL"


    // $ANTLR start "ruleREAL_LITERAL"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4628:1: ruleREAL_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )* kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4631:28: ( ( (this_INT_0= RULE_INT )* kw= '.' this_INT_2= RULE_INT ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4632:1: ( (this_INT_0= RULE_INT )* kw= '.' this_INT_2= RULE_INT )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4632:1: ( (this_INT_0= RULE_INT )* kw= '.' this_INT_2= RULE_INT )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4632:2: (this_INT_0= RULE_INT )* kw= '.' this_INT_2= RULE_INT
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4632:2: (this_INT_0= RULE_INT )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==RULE_INT) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4632:7: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL_LITERAL9950); 

            	    		current.merge(this_INT_0);
            	        
            	     
            	        newLeafNode(this_INT_0, grammarAccess.getREAL_LITERALAccess().getINTTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            kw=(Token)match(input,38,FOLLOW_38_in_ruleREAL_LITERAL9970); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getREAL_LITERALAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL_LITERAL9985); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getREAL_LITERALAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleREAL_LITERAL"


    // $ANTLR start "entryRuleBOOLEAN_LITERAL"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4660:1: entryRuleBOOLEAN_LITERAL returns [EObject current=null] : iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF ;
    public final EObject entryRuleBOOLEAN_LITERAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOLEAN_LITERAL = null;


        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4661:2: (iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4662:2: iv_ruleBOOLEAN_LITERAL= ruleBOOLEAN_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getBOOLEAN_LITERALRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL10030);
            iv_ruleBOOLEAN_LITERAL=ruleBOOLEAN_LITERAL();

            state._fsp--;

             current =iv_ruleBOOLEAN_LITERAL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL10040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOLEAN_LITERAL"


    // $ANTLR start "ruleBOOLEAN_LITERAL"
    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4669:1: ruleBOOLEAN_LITERAL returns [EObject current=null] : ( ( () otherlv_1= '#' this_STRING_2= RULE_STRING ) | ( () otherlv_4= 'true' ) | ( () otherlv_6= 'false' ) ) ;
    public final EObject ruleBOOLEAN_LITERAL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_STRING_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4672:28: ( ( ( () otherlv_1= '#' this_STRING_2= RULE_STRING ) | ( () otherlv_4= 'true' ) | ( () otherlv_6= 'false' ) ) )
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4673:1: ( ( () otherlv_1= '#' this_STRING_2= RULE_STRING ) | ( () otherlv_4= 'true' ) | ( () otherlv_6= 'false' ) )
            {
            // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4673:1: ( ( () otherlv_1= '#' this_STRING_2= RULE_STRING ) | ( () otherlv_4= 'true' ) | ( () otherlv_6= 'false' ) )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt102=1;
                }
                break;
            case 67:
                {
                alt102=2;
                }
                break;
            case 68:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4673:2: ( () otherlv_1= '#' this_STRING_2= RULE_STRING )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4673:2: ( () otherlv_1= '#' this_STRING_2= RULE_STRING )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4673:3: () otherlv_1= '#' this_STRING_2= RULE_STRING
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4673:3: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4674:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBOOLEAN_LITERALAccess().getBOOLEAN_LITERALAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleBOOLEAN_LITERAL10087); 

                        	newLeafNode(otherlv_1, grammarAccess.getBOOLEAN_LITERALAccess().getNumberSignKeyword_0_1());
                        
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBOOLEAN_LITERAL10098); 
                     
                        newLeafNode(this_STRING_2, grammarAccess.getBOOLEAN_LITERALAccess().getSTRINGTerminalRuleCall_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4688:6: ( () otherlv_4= 'true' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4688:6: ( () otherlv_4= 'true' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4688:7: () otherlv_4= 'true'
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4688:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4689:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBOOLEAN_LITERALAccess().getBOOLEAN_LITERALAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,67,FOLLOW_67_in_ruleBOOLEAN_LITERAL10126); 

                        	newLeafNode(otherlv_4, grammarAccess.getBOOLEAN_LITERALAccess().getTrueKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4699:6: ( () otherlv_6= 'false' )
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4699:6: ( () otherlv_6= 'false' )
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4699:7: () otherlv_6= 'false'
                    {
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4699:7: ()
                    // ../uk.ac.standrews.graspide/src-gen/uk/ac/standrews/graspide/grasp/parser/antlr/internal/InternalGraspDSL.g:4700:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBOOLEAN_LITERALAccess().getBOOLEAN_LITERALAction_2_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleBOOLEAN_LITERAL10155); 

                        	newLeafNode(otherlv_6, grammarAccess.getBOOLEAN_LITERALAccess().getFalseKeyword_2_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN_LITERAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGraspSpecification_in_entryRuleGraspSpecification75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraspSpecification85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitecture_in_ruleGraspSpecification130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitecture_in_entryRuleArchitecture165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitecture175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleArchitecture221 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_12_in_ruleArchitecture234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArchitecture251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArchitecture268 = new BitSet(new long[]{0x00000200410C9000L});
    public static final BitSet FOLLOW_ruleArchitectureBody_in_ruleArchitecture289 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleArchitecture301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureBody_in_entryRuleArchitectureBody337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureBody347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleArchitectureBody393 = new BitSet(new long[]{0x00000200410C9000L});
    public static final BitSet FOLLOW_ruleDeclarationStart_in_ruleArchitectureBody415 = new BitSet(new long[]{0x00000200410C9000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleArchitectureBody436 = new BitSet(new long[]{0x00000200010C9000L});
    public static final BitSet FOLLOW_ruleDeclarationEnd_in_ruleArchitectureBody457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationStart_in_entryRuleDeclarationStart493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationStart503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDeclarationStart559 = new BitSet(new long[]{0x00000200010C9002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclarationStart580 = new BitSet(new long[]{0x00000200010C9002L});
    public static final BitSet FOLLOW_ruleDeclarationEnd_in_entryRuleDeclarationEnd619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationEnd629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclarationEnd685 = new BitSet(new long[]{0x00000200010C9000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDeclarationEnd707 = new BitSet(new long[]{0x00000200010C9002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementOrQuality_in_ruleDeclaration802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRationale_in_ruleDeclaration829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleDeclaration856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementOrQuality_in_entryRuleRequirementOrQuality891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementOrQuality901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleRequirementOrQuality948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQattribute_in_ruleRequirementOrQuality975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement1010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRequirement1057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1074 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRequirement1092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequirement1109 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequirement1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQattribute_in_entryRuleQattribute1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQattribute1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQattribute1211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQattribute1228 = new BitSet(new long[]{0x0000040000030000L});
    public static final BitSet FOLLOW_16_in_ruleQattribute1246 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleQattribute1267 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_ruleSupportsClause_in_ruleQattribute1290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQattribute1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRationale_in_entryRuleRationale1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRationale1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRationale1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRationale1403 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRationale1420 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleRationale1441 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRationale1454 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleRationale1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRationale1487 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRationale1501 = new BitSet(new long[]{0x0000020000805000L});
    public static final BitSet FOLLOW_ruleReason_in_ruleRationale1522 = new BitSet(new long[]{0x0000020000805000L});
    public static final BitSet FOLLOW_14_in_ruleRationale1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReason_in_entryRuleReason1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReason1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleReason1627 = new BitSet(new long[]{0x0000020000801000L});
    public static final BitSet FOLLOW_23_in_ruleReason1640 = new BitSet(new long[]{0xC60005C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReason1662 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_ruleSupportsClause_in_ruleReason1689 = new BitSet(new long[]{0x0000080000020000L});
    public static final BitSet FOLLOW_ruleInhibitsClause_in_ruleReason1711 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleReason1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTemplate1807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplate1824 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleTemplate1842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_ruleTemplate1863 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTemplate1877 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleTemplate1898 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTemplate1911 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_ruleTemplate1924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplate1944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTemplate1958 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTemplate1980 = new BitSet(new long[]{0x000002003D0C9000L});
    public static final BitSet FOLLOW_ruleTemplateConstituent_in_ruleTemplate2002 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_14_in_ruleTemplate2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateConstituent_in_entryRuleTemplateConstituent2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateConstituent2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleTemplateConstituent2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_ruleTemplateConstituent2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequires_in_ruleTemplateConstituent2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleTemplateConstituent2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleTemplateConstituent2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleProvides2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides2316 = new BitSet(new long[]{0x0000100002022010L});
    public static final BitSet FOLLOW_25_in_ruleProvides2334 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_ruleProvides2355 = new BitSet(new long[]{0x0000100000022010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvides2374 = new BitSet(new long[]{0x0000100000022000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleProvides2401 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleProvides2416 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_ruleProvidesConstituent_in_ruleProvides2437 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_14_in_ruleProvides2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleProvides2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidesConstituent_in_entryRuleProvidesConstituent2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidesConstituent2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleProvidesConstituent2562 = new BitSet(new long[]{0x000002003D0C9000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleProvidesConstituent2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequires_in_entryRuleRequires2620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequires2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRequires2667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequires2684 = new BitSet(new long[]{0x0000100000022010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequires2706 = new BitSet(new long[]{0x0000100000022000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleRequires2733 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleRequires2748 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_ruleRequiresConstituent_in_ruleRequires2769 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_14_in_ruleRequires2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRequires2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiresConstituent_in_entryRuleRequiresConstituent2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiresConstituent2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleRequiresConstituent2894 = new BitSet(new long[]{0x000002003D0C9000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleRequiresConstituent2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleProperty2999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty3016 = new BitSet(new long[]{0x0000100000030000L});
    public static final BitSet FOLLOW_16_in_ruleProperty3034 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProperty3055 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleProperty3078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProperty3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck3127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCheck3174 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCheck3195 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleCheck3216 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCheck3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSystem3312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem3329 = new BitSet(new long[]{0x0000100000002000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleSystem3355 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem3368 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSystem3390 = new BitSet(new long[]{0x0000021CBD0C9000L});
    public static final BitSet FOLLOW_ruleSystemConstituent_in_ruleSystem3412 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_14_in_ruleSystem3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemConstituent_in_entryRuleSystemConstituent3462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemConstituent3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositional_in_ruleSystemConstituent3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleSystemConstituent3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositional_in_entryRuleCompositional3581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositional3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_ruleCompositional3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleCompositional3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleCompositional3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleCompositional3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayer_in_entryRuleLayer3754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayer3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleLayer3801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer3818 = new BitSet(new long[]{0x0000100100002000L});
    public static final BitSet FOLLOW_32_in_ruleLayer3836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer3856 = new BitSet(new long[]{0x0000100200002000L});
    public static final BitSet FOLLOW_33_in_ruleLayer3869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLayer3889 = new BitSet(new long[]{0x0000100200002000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleLayer3914 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLayer3927 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLayer3949 = new BitSet(new long[]{0x0000021CBD0C9000L});
    public static final BitSet FOLLOW_ruleLayerConstituent_in_ruleLayer3971 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_14_in_ruleLayer3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLayerConstituent_in_entryRuleLayerConstituent4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLayerConstituent4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositional_in_ruleLayerConstituent4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleLayerConstituent4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent4140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleComponent4187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent4204 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleComponent4221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent4241 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleComponent4253 = new BitSet(new long[]{0x0000018000200010L});
    public static final BitSet FOLLOW_ruleArgumentList_in_ruleComponent4274 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleComponent4287 = new BitSet(new long[]{0x0000100000022000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleComponent4308 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleComponent4323 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleComponent4345 = new BitSet(new long[]{0x0000021CBD0C9000L});
    public static final BitSet FOLLOW_ruleInstantiableConstituent_in_ruleComponent4367 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_14_in_ruleComponent4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleComponent4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector4437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleConnector4484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector4501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConnector4518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector4538 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConnector4550 = new BitSet(new long[]{0x0000018000200010L});
    public static final BitSet FOLLOW_ruleArgumentList_in_ruleConnector4571 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConnector4584 = new BitSet(new long[]{0x0000100000022000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleConnector4605 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleConnector4620 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleConnector4642 = new BitSet(new long[]{0x0000021CBD0C9000L});
    public static final BitSet FOLLOW_ruleInstantiableConstituent_in_ruleConnector4664 = new BitSet(new long[]{0x0000021CBD0CD000L});
    public static final BitSet FOLLOW_14_in_ruleConnector4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConnector4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiableConstituent_in_entryRuleInstantiableConstituent4734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiableConstituent4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositional_in_ruleInstantiableConstituent4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleInstantiableConstituent4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink4853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleLink4900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLink4917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLinkConsumerExpression_in_ruleLink4944 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLink4956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLinkProvidersList_in_ruleLink4977 = new BitSet(new long[]{0x0000100000022000L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_ruleLink4998 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleLink5013 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_ruleLinkConstituent_in_ruleLink5034 = new BitSet(new long[]{0x000002003D0CD000L});
    public static final BitSet FOLLOW_14_in_ruleLink5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLink5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkConstituent_in_entryRuleLinkConstituent5103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkConstituent5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleLinkConstituent5159 = new BitSet(new long[]{0x000002003D0C9000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleLinkConstituent5181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkConsumerExpression_in_entryRuleLinkConsumerExpression5217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkConsumerExpression5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkConsumerExpression5272 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleLinkConsumerExpression5285 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkConsumerExpression5304 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_39_in_ruleLinkConsumerExpression5325 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleLinkProvidersList_in_entryRuleLinkProvidersList5381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProvidersList5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProviders_in_ruleLinkProvidersList5437 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleLinkProvidersList5450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLinkProviders_in_ruleLinkProvidersList5471 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleLinkProviders_in_entryRuleLinkProviders5509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProviders5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProviders5564 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleLinkProviders5577 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProviders5596 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40_in_ruleLinkProviders5617 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation5673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnnotation5720 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation5737 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation5755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNameValues_in_ruleAnnotation5776 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAnnotation5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameValue_in_entryRuleNameValue5824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameValue5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameValue5876 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNameValue5893 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleNameValue5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameValues_in_entryRuleNameValues5950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameValues5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameValue_in_ruleNameValues6006 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleNameValues6019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNameValue_in_ruleNameValues6040 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleSupportsClause_in_entryRuleSupportsClause6078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportsClause6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSupportsClause6125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSupportsClause6145 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleSupportsClause6158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSupportsClause6178 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleInhibitsClause_in_entryRuleInhibitsClause6216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInhibitsClause6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInhibitsClause6263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInhibitsClause6283 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleInhibitsClause6296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInhibitsClause6316 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleBecauseClause_in_entryRuleBecauseClause6354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBecauseClause6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBecauseClause6401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBecauseCausalcontext_in_ruleBecauseClause6422 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleBecauseClause6435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBecauseCausalcontext_in_ruleBecauseClause6456 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleBecauseCausalcontext_in_entryRuleBecauseCausalcontext6494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBecauseCausalcontext6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBecauseCausalcontext6549 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBecauseCausalcontext6561 = new BitSet(new long[]{0x0000018000200010L});
    public static final BitSet FOLLOW_ruleArgumentList_in_ruleBecauseCausalcontext6582 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBecauseCausalcontext6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList6631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterList6683 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleParameterList6701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterList6718 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleArgumentList_in_entryRuleArgumentList6761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentList6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberExpression_in_ruleArgumentList6817 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleArgumentList6830 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_ruleMemberExpression_in_ruleArgumentList6851 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsetofExpression_in_ruleExpression6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsetofExpression_in_entryRuleSubsetofExpression6979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsetofExpression6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleSubsetofExpression7035 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleSubsetofExpression7048 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleSubsetofExpression7069 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression7107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7163 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleLogicalOrExpression7176 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression7197 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression7235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression7291 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleLogicalAndExpression7304 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression7325 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression7363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleBitwiseOrExpression7419 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBitwiseOrExpression7432 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_ruleBitwiseOrExpression7453 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseXorExpression_in_entryRuleBitwiseXorExpression7491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseXorExpression7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseXorExpression7547 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBitwiseXorExpression7560 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseXorExpression7581 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression7619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleBitwiseAndExpression7675 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBitwiseAndExpression7688 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleBitwiseAndExpression7709 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression7747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression7803 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEqualityExpression7824 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_52_in_ruleEqualityExpression7853 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression7890 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression7928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression7938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression7984 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_53_in_ruleRelationalExpression8005 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_54_in_ruleRelationalExpression8034 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_55_in_ruleRelationalExpression8063 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_56_in_ruleRelationalExpression8092 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression8129 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression8167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression8223 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAdditiveExpression8244 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_58_in_ruleAdditiveExpression8273 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression8310 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression8348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8404 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMultiplicativeExpression8425 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_60_in_ruleMultiplicativeExpression8454 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_61_in_ruleMultiplicativeExpression8483 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression8520 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression8558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleUnaryExpression8613 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_63_in_ruleUnaryExpression8642 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_57_in_ruleUnaryExpression8671 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_58_in_ruleUnaryExpression8700 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimaryExpression8822 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression8844 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberExpression_in_rulePrimaryExpression8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberExpression_in_entryRuleMemberExpression8946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberExpression8956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberPart_in_ruleMemberExpression9002 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleMemberExpression9015 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_ruleMemberPart_in_ruleMemberExpression9036 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleMemberPart_in_entryRuleMemberPart9074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberPart9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMemberPart9126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMemberPart9155 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMemberPart9172 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleMemberArguments_in_ruleMemberPart9193 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMemberPart9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMemberPart9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMemberPart9263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberArguments_in_entryRuleMemberArguments9300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberArguments9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberArguments9356 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleMemberArguments9369 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberArguments9390 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral9428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_ruleLiteral9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_ruleLiteral9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_LITERAL_in_ruleLiteral9548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_ruleLiteral9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLiteral_in_entryRuleSetLiteral9638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLiteral9648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSetLiteral9694 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleSetLiteral9716 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSetLiteral9729 = new BitSet(new long[]{0xC60001C000100070L,0x000000000000001DL});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleSetLiteral9750 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSetLiteral9766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_LITERAL_in_entryRuleINTEGER_LITERAL9803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_LITERAL9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER_LITERAL9853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_LITERAL_in_entryRuleREAL_LITERAL9898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL_LITERAL9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL_LITERAL9950 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_38_in_ruleREAL_LITERAL9970 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL_LITERAL9985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_LITERAL_in_entryRuleBOOLEAN_LITERAL10030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN_LITERAL10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBOOLEAN_LITERAL10087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBOOLEAN_LITERAL10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBOOLEAN_LITERAL10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBOOLEAN_LITERAL10155 = new BitSet(new long[]{0x0000000000000002L});

}