package org.xtext.example.qms.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.qms.services.QmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQmsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'repository'", "'type'", "'req'", "'was'", "'{'", "'title'", "'}'", "'bom'", "'weight'", "'evi'", "'text'", "'ref'", "'.'", "'requirement'", "'evidence'", "'qms'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQms.g"; }



     	private QmsGrammarAccess grammarAccess;

        public InternalQmsParser(TokenStream input, QmsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected QmsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalQms.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalQms.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalQms.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalQms.g:72:1: ruleModel returns [EObject current=null] : (this_Repository_0= ruleRepository | this_RepositoryNode_1= ruleRepositoryNode ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Repository_0 = null;

        EObject this_RepositoryNode_1 = null;



        	enterRule();

        try {
            // InternalQms.g:78:2: ( (this_Repository_0= ruleRepository | this_RepositoryNode_1= ruleRepositoryNode ) )
            // InternalQms.g:79:2: (this_Repository_0= ruleRepository | this_RepositoryNode_1= ruleRepositoryNode )
            {
            // InternalQms.g:79:2: (this_Repository_0= ruleRepository | this_RepositoryNode_1= ruleRepositoryNode )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==13||LA1_0==18||LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQms.g:80:3: this_Repository_0= ruleRepository
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getRepositoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repository_0=ruleRepository();

                    state._fsp--;


                    			current = this_Repository_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQms.g:89:3: this_RepositoryNode_1= ruleRepositoryNode
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getRepositoryNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepositoryNode_1=ruleRepositoryNode();

                    state._fsp--;


                    			current = this_RepositoryNode_1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRepository"
    // InternalQms.g:101:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalQms.g:101:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalQms.g:102:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalQms.g:108:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleRepositoryType ) ) ( (lv_root_4_0= ruleRepositoryNode ) ) ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_root_4_0 = null;



        	enterRule();

        try {
            // InternalQms.g:114:2: ( (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleRepositoryType ) ) ( (lv_root_4_0= ruleRepositoryNode ) ) ) )
            // InternalQms.g:115:2: (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleRepositoryType ) ) ( (lv_root_4_0= ruleRepositoryNode ) ) )
            {
            // InternalQms.g:115:2: (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleRepositoryType ) ) ( (lv_root_4_0= ruleRepositoryNode ) ) )
            // InternalQms.g:116:3: otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleRepositoryType ) ) ( (lv_root_4_0= ruleRepositoryNode ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
            		
            // InternalQms.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQms.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQms.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalQms.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getTypeKeyword_2());
            		
            // InternalQms.g:142:3: ( (lv_type_3_0= ruleRepositoryType ) )
            // InternalQms.g:143:4: (lv_type_3_0= ruleRepositoryType )
            {
            // InternalQms.g:143:4: (lv_type_3_0= ruleRepositoryType )
            // InternalQms.g:144:5: lv_type_3_0= ruleRepositoryType
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getTypeRepositoryTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_type_3_0=ruleRepositoryType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.qms.Qms.RepositoryType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQms.g:161:3: ( (lv_root_4_0= ruleRepositoryNode ) )
            // InternalQms.g:162:4: (lv_root_4_0= ruleRepositoryNode )
            {
            // InternalQms.g:162:4: (lv_root_4_0= ruleRepositoryNode )
            // InternalQms.g:163:5: lv_root_4_0= ruleRepositoryNode
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getRootRepositoryNodeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_root_4_0=ruleRepositoryNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_4_0,
            						"org.xtext.example.qms.Qms.RepositoryNode");
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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryNode"
    // InternalQms.g:184:1: entryRuleRepositoryNode returns [EObject current=null] : iv_ruleRepositoryNode= ruleRepositoryNode EOF ;
    public final EObject entryRuleRepositoryNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryNode = null;


        try {
            // InternalQms.g:184:55: (iv_ruleRepositoryNode= ruleRepositoryNode EOF )
            // InternalQms.g:185:2: iv_ruleRepositoryNode= ruleRepositoryNode EOF
            {
             newCompositeNode(grammarAccess.getRepositoryNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryNode=ruleRepositoryNode();

            state._fsp--;

             current =iv_ruleRepositoryNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRepositoryNode"


    // $ANTLR start "ruleRepositoryNode"
    // InternalQms.g:191:1: ruleRepositoryNode returns [EObject current=null] : (this_RequirementNode_0= ruleRequirementNode | this_EvidenceNode_1= ruleEvidenceNode | this_BomNode_2= ruleBomNode ) ;
    public final EObject ruleRepositoryNode() throws RecognitionException {
        EObject current = null;

        EObject this_RequirementNode_0 = null;

        EObject this_EvidenceNode_1 = null;

        EObject this_BomNode_2 = null;



        	enterRule();

        try {
            // InternalQms.g:197:2: ( (this_RequirementNode_0= ruleRequirementNode | this_EvidenceNode_1= ruleEvidenceNode | this_BomNode_2= ruleBomNode ) )
            // InternalQms.g:198:2: (this_RequirementNode_0= ruleRequirementNode | this_EvidenceNode_1= ruleEvidenceNode | this_BomNode_2= ruleBomNode )
            {
            // InternalQms.g:198:2: (this_RequirementNode_0= ruleRequirementNode | this_EvidenceNode_1= ruleEvidenceNode | this_BomNode_2= ruleBomNode )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQms.g:199:3: this_RequirementNode_0= ruleRequirementNode
                    {

                    			newCompositeNode(grammarAccess.getRepositoryNodeAccess().getRequirementNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RequirementNode_0=ruleRequirementNode();

                    state._fsp--;


                    			current = this_RequirementNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQms.g:208:3: this_EvidenceNode_1= ruleEvidenceNode
                    {

                    			newCompositeNode(grammarAccess.getRepositoryNodeAccess().getEvidenceNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EvidenceNode_1=ruleEvidenceNode();

                    state._fsp--;


                    			current = this_EvidenceNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQms.g:217:3: this_BomNode_2= ruleBomNode
                    {

                    			newCompositeNode(grammarAccess.getRepositoryNodeAccess().getBomNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BomNode_2=ruleBomNode();

                    state._fsp--;


                    			current = this_BomNode_2;
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
    // $ANTLR end "ruleRepositoryNode"


    // $ANTLR start "entryRuleRequirementNode"
    // InternalQms.g:229:1: entryRuleRequirementNode returns [EObject current=null] : iv_ruleRequirementNode= ruleRequirementNode EOF ;
    public final EObject entryRuleRequirementNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementNode = null;


        try {
            // InternalQms.g:229:56: (iv_ruleRequirementNode= ruleRequirementNode EOF )
            // InternalQms.g:230:2: iv_ruleRequirementNode= ruleRequirementNode EOF
            {
             newCompositeNode(grammarAccess.getRequirementNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementNode=ruleRequirementNode();

            state._fsp--;

             current =iv_ruleRequirementNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequirementNode"


    // $ANTLR start "ruleRequirementNode"
    // InternalQms.g:236:1: ruleRequirementNode returns [EObject current=null] : (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_body_7_0= ruleNodeBodyElement ) )* ( (lv_children_8_0= ruleRequirementNode ) )* otherlv_9= '}' ) ;
    public final EObject ruleRequirementNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_formerName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_9=null;
        EObject lv_body_7_0 = null;

        EObject lv_children_8_0 = null;



        	enterRule();

        try {
            // InternalQms.g:242:2: ( (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_body_7_0= ruleNodeBodyElement ) )* ( (lv_children_8_0= ruleRequirementNode ) )* otherlv_9= '}' ) )
            // InternalQms.g:243:2: (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_body_7_0= ruleNodeBodyElement ) )* ( (lv_children_8_0= ruleRequirementNode ) )* otherlv_9= '}' )
            {
            // InternalQms.g:243:2: (otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_body_7_0= ruleNodeBodyElement ) )* ( (lv_children_8_0= ruleRequirementNode ) )* otherlv_9= '}' )
            // InternalQms.g:244:3: otherlv_0= 'req' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )? ( (lv_body_7_0= ruleNodeBodyElement ) )* ( (lv_children_8_0= ruleRequirementNode ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementNodeAccess().getReqKeyword_0());
            		
            // InternalQms.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQms.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQms.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalQms.g:250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQms.g:266:3: (otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQms.g:267:4: otherlv_2= 'was' ( (lv_formerName_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementNodeAccess().getWasKeyword_2_0());
                    			
                    // InternalQms.g:271:4: ( (lv_formerName_3_0= RULE_ID ) )
                    // InternalQms.g:272:5: (lv_formerName_3_0= RULE_ID )
                    {
                    // InternalQms.g:272:5: (lv_formerName_3_0= RULE_ID )
                    // InternalQms.g:273:6: lv_formerName_3_0= RULE_ID
                    {
                    lv_formerName_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_formerName_3_0, grammarAccess.getRequirementNodeAccess().getFormerNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"formerName",
                    							lv_formerName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRequirementNodeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQms.g:294:3: (otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQms.g:295:4: otherlv_5= 'title' ( (lv_title_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementNodeAccess().getTitleKeyword_4_0());
                    			
                    // InternalQms.g:299:4: ( (lv_title_6_0= RULE_STRING ) )
                    // InternalQms.g:300:5: (lv_title_6_0= RULE_STRING )
                    {
                    // InternalQms.g:300:5: (lv_title_6_0= RULE_STRING )
                    // InternalQms.g:301:6: lv_title_6_0= RULE_STRING
                    {
                    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_title_6_0, grammarAccess.getRequirementNodeAccess().getTitleSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQms.g:318:3: ( (lv_body_7_0= ruleNodeBodyElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQms.g:319:4: (lv_body_7_0= ruleNodeBodyElement )
            	    {
            	    // InternalQms.g:319:4: (lv_body_7_0= ruleNodeBodyElement )
            	    // InternalQms.g:320:5: lv_body_7_0= ruleNodeBodyElement
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementNodeAccess().getBodyNodeBodyElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_body_7_0=ruleNodeBodyElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_7_0,
            	    						"org.xtext.example.qms.Qms.NodeBodyElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalQms.g:337:3: ( (lv_children_8_0= ruleRequirementNode ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQms.g:338:4: (lv_children_8_0= ruleRequirementNode )
            	    {
            	    // InternalQms.g:338:4: (lv_children_8_0= ruleRequirementNode )
            	    // InternalQms.g:339:5: lv_children_8_0= ruleRequirementNode
            	    {

            	    					newCompositeNode(grammarAccess.getRequirementNodeAccess().getChildrenRequirementNodeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_children_8_0=ruleRequirementNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRequirementNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_8_0,
            	    						"org.xtext.example.qms.Qms.RequirementNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRequirementNodeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRequirementNode"


    // $ANTLR start "entryRuleBomNode"
    // InternalQms.g:364:1: entryRuleBomNode returns [EObject current=null] : iv_ruleBomNode= ruleBomNode EOF ;
    public final EObject entryRuleBomNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBomNode = null;


        try {
            // InternalQms.g:364:48: (iv_ruleBomNode= ruleBomNode EOF )
            // InternalQms.g:365:2: iv_ruleBomNode= ruleBomNode EOF
            {
             newCompositeNode(grammarAccess.getBomNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBomNode=ruleBomNode();

            state._fsp--;

             current =iv_ruleBomNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBomNode"


    // $ANTLR start "ruleBomNode"
    // InternalQms.g:371:1: ruleBomNode returns [EObject current=null] : (otherlv_0= 'bom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* otherlv_6= 'weight' ( (lv_weight_7_0= RULE_INT ) ) ( (lv_children_8_0= ruleBomNode ) )* otherlv_9= '}' ) ;
    public final EObject ruleBomNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_6=null;
        Token lv_weight_7_0=null;
        Token otherlv_9=null;
        EObject lv_body_5_0 = null;

        EObject lv_children_8_0 = null;



        	enterRule();

        try {
            // InternalQms.g:377:2: ( (otherlv_0= 'bom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* otherlv_6= 'weight' ( (lv_weight_7_0= RULE_INT ) ) ( (lv_children_8_0= ruleBomNode ) )* otherlv_9= '}' ) )
            // InternalQms.g:378:2: (otherlv_0= 'bom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* otherlv_6= 'weight' ( (lv_weight_7_0= RULE_INT ) ) ( (lv_children_8_0= ruleBomNode ) )* otherlv_9= '}' )
            {
            // InternalQms.g:378:2: (otherlv_0= 'bom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* otherlv_6= 'weight' ( (lv_weight_7_0= RULE_INT ) ) ( (lv_children_8_0= ruleBomNode ) )* otherlv_9= '}' )
            // InternalQms.g:379:3: otherlv_0= 'bom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* otherlv_6= 'weight' ( (lv_weight_7_0= RULE_INT ) ) ( (lv_children_8_0= ruleBomNode ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBomNodeAccess().getBomKeyword_0());
            		
            // InternalQms.g:383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQms.g:384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQms.g:384:4: (lv_name_1_0= RULE_ID )
            // InternalQms.g:385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBomNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBomNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBomNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQms.g:405:3: (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQms.g:406:4: otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getBomNodeAccess().getTitleKeyword_3_0());
                    			
                    // InternalQms.g:410:4: ( (lv_title_4_0= RULE_STRING ) )
                    // InternalQms.g:411:5: (lv_title_4_0= RULE_STRING )
                    {
                    // InternalQms.g:411:5: (lv_title_4_0= RULE_STRING )
                    // InternalQms.g:412:6: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_title_4_0, grammarAccess.getBomNodeAccess().getTitleSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBomNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQms.g:429:3: ( (lv_body_5_0= ruleNodeBodyElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQms.g:430:4: (lv_body_5_0= ruleNodeBodyElement )
            	    {
            	    // InternalQms.g:430:4: (lv_body_5_0= ruleNodeBodyElement )
            	    // InternalQms.g:431:5: lv_body_5_0= ruleNodeBodyElement
            	    {

            	    					newCompositeNode(grammarAccess.getBomNodeAccess().getBodyNodeBodyElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_body_5_0=ruleNodeBodyElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBomNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_5_0,
            	    						"org.xtext.example.qms.Qms.NodeBodyElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getBomNodeAccess().getWeightKeyword_5());
            		
            // InternalQms.g:452:3: ( (lv_weight_7_0= RULE_INT ) )
            // InternalQms.g:453:4: (lv_weight_7_0= RULE_INT )
            {
            // InternalQms.g:453:4: (lv_weight_7_0= RULE_INT )
            // InternalQms.g:454:5: lv_weight_7_0= RULE_INT
            {
            lv_weight_7_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_weight_7_0, grammarAccess.getBomNodeAccess().getWeightINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBomNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"weight",
            						lv_weight_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalQms.g:470:3: ( (lv_children_8_0= ruleBomNode ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQms.g:471:4: (lv_children_8_0= ruleBomNode )
            	    {
            	    // InternalQms.g:471:4: (lv_children_8_0= ruleBomNode )
            	    // InternalQms.g:472:5: lv_children_8_0= ruleBomNode
            	    {

            	    					newCompositeNode(grammarAccess.getBomNodeAccess().getChildrenBomNodeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_children_8_0=ruleBomNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBomNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_8_0,
            	    						"org.xtext.example.qms.Qms.BomNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBomNodeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBomNode"


    // $ANTLR start "entryRuleEvidenceNode"
    // InternalQms.g:497:1: entryRuleEvidenceNode returns [EObject current=null] : iv_ruleEvidenceNode= ruleEvidenceNode EOF ;
    public final EObject entryRuleEvidenceNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvidenceNode = null;


        try {
            // InternalQms.g:497:53: (iv_ruleEvidenceNode= ruleEvidenceNode EOF )
            // InternalQms.g:498:2: iv_ruleEvidenceNode= ruleEvidenceNode EOF
            {
             newCompositeNode(grammarAccess.getEvidenceNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvidenceNode=ruleEvidenceNode();

            state._fsp--;

             current =iv_ruleEvidenceNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvidenceNode"


    // $ANTLR start "ruleEvidenceNode"
    // InternalQms.g:504:1: ruleEvidenceNode returns [EObject current=null] : (otherlv_0= 'evi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* ( (lv_children_6_0= ruleEvidenceNode ) )* otherlv_7= '}' ) ;
    public final EObject ruleEvidenceNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_7=null;
        EObject lv_body_5_0 = null;

        EObject lv_children_6_0 = null;



        	enterRule();

        try {
            // InternalQms.g:510:2: ( (otherlv_0= 'evi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* ( (lv_children_6_0= ruleEvidenceNode ) )* otherlv_7= '}' ) )
            // InternalQms.g:511:2: (otherlv_0= 'evi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* ( (lv_children_6_0= ruleEvidenceNode ) )* otherlv_7= '}' )
            {
            // InternalQms.g:511:2: (otherlv_0= 'evi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* ( (lv_children_6_0= ruleEvidenceNode ) )* otherlv_7= '}' )
            // InternalQms.g:512:3: otherlv_0= 'evi' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )? ( (lv_body_5_0= ruleNodeBodyElement ) )* ( (lv_children_6_0= ruleEvidenceNode ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEvidenceNodeAccess().getEviKeyword_0());
            		
            // InternalQms.g:516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQms.g:517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQms.g:517:4: (lv_name_1_0= RULE_ID )
            // InternalQms.g:518:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEvidenceNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEvidenceNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEvidenceNodeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQms.g:538:3: (otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQms.g:539:4: otherlv_3= 'title' ( (lv_title_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getEvidenceNodeAccess().getTitleKeyword_3_0());
                    			
                    // InternalQms.g:543:4: ( (lv_title_4_0= RULE_STRING ) )
                    // InternalQms.g:544:5: (lv_title_4_0= RULE_STRING )
                    {
                    // InternalQms.g:544:5: (lv_title_4_0= RULE_STRING )
                    // InternalQms.g:545:6: lv_title_4_0= RULE_STRING
                    {
                    lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_title_4_0, grammarAccess.getEvidenceNodeAccess().getTitleSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEvidenceNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQms.g:562:3: ( (lv_body_5_0= ruleNodeBodyElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=21 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQms.g:563:4: (lv_body_5_0= ruleNodeBodyElement )
            	    {
            	    // InternalQms.g:563:4: (lv_body_5_0= ruleNodeBodyElement )
            	    // InternalQms.g:564:5: lv_body_5_0= ruleNodeBodyElement
            	    {

            	    					newCompositeNode(grammarAccess.getEvidenceNodeAccess().getBodyNodeBodyElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_body_5_0=ruleNodeBodyElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvidenceNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_5_0,
            	    						"org.xtext.example.qms.Qms.NodeBodyElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalQms.g:581:3: ( (lv_children_6_0= ruleEvidenceNode ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQms.g:582:4: (lv_children_6_0= ruleEvidenceNode )
            	    {
            	    // InternalQms.g:582:4: (lv_children_6_0= ruleEvidenceNode )
            	    // InternalQms.g:583:5: lv_children_6_0= ruleEvidenceNode
            	    {

            	    					newCompositeNode(grammarAccess.getEvidenceNodeAccess().getChildrenEvidenceNodeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_children_6_0=ruleEvidenceNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEvidenceNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_6_0,
            	    						"org.xtext.example.qms.Qms.EvidenceNode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEvidenceNodeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEvidenceNode"


    // $ANTLR start "entryRuleNodeBodyElement"
    // InternalQms.g:608:1: entryRuleNodeBodyElement returns [EObject current=null] : iv_ruleNodeBodyElement= ruleNodeBodyElement EOF ;
    public final EObject entryRuleNodeBodyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeBodyElement = null;


        try {
            // InternalQms.g:608:56: (iv_ruleNodeBodyElement= ruleNodeBodyElement EOF )
            // InternalQms.g:609:2: iv_ruleNodeBodyElement= ruleNodeBodyElement EOF
            {
             newCompositeNode(grammarAccess.getNodeBodyElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeBodyElement=ruleNodeBodyElement();

            state._fsp--;

             current =iv_ruleNodeBodyElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeBodyElement"


    // $ANTLR start "ruleNodeBodyElement"
    // InternalQms.g:615:1: ruleNodeBodyElement returns [EObject current=null] : (this_Text_0= ruleText | this_NodeReference_1= ruleNodeReference ) ;
    public final EObject ruleNodeBodyElement() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_NodeReference_1 = null;



        	enterRule();

        try {
            // InternalQms.g:621:2: ( (this_Text_0= ruleText | this_NodeReference_1= ruleNodeReference ) )
            // InternalQms.g:622:2: (this_Text_0= ruleText | this_NodeReference_1= ruleNodeReference )
            {
            // InternalQms.g:622:2: (this_Text_0= ruleText | this_NodeReference_1= ruleNodeReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalQms.g:623:3: this_Text_0= ruleText
                    {

                    			newCompositeNode(grammarAccess.getNodeBodyElementAccess().getTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_0=ruleText();

                    state._fsp--;


                    			current = this_Text_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQms.g:632:3: this_NodeReference_1= ruleNodeReference
                    {

                    			newCompositeNode(grammarAccess.getNodeBodyElementAccess().getNodeReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NodeReference_1=ruleNodeReference();

                    state._fsp--;


                    			current = this_NodeReference_1;
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
    // $ANTLR end "ruleNodeBodyElement"


    // $ANTLR start "entryRuleText"
    // InternalQms.g:644:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalQms.g:644:45: (iv_ruleText= ruleText EOF )
            // InternalQms.g:645:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalQms.g:651:1: ruleText returns [EObject current=null] : (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalQms.g:657:2: ( (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalQms.g:658:2: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalQms.g:658:2: (otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) ) )
            // InternalQms.g:659:3: otherlv_0= 'text' ( (lv_text_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalQms.g:663:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalQms.g:664:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalQms.g:664:4: (lv_text_1_0= RULE_STRING )
            // InternalQms.g:665:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNodeReference"
    // InternalQms.g:685:1: entryRuleNodeReference returns [EObject current=null] : iv_ruleNodeReference= ruleNodeReference EOF ;
    public final EObject entryRuleNodeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeReference = null;


        try {
            // InternalQms.g:685:54: (iv_ruleNodeReference= ruleNodeReference EOF )
            // InternalQms.g:686:2: iv_ruleNodeReference= ruleNodeReference EOF
            {
             newCompositeNode(grammarAccess.getNodeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeReference=ruleNodeReference();

            state._fsp--;

             current =iv_ruleNodeReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNodeReference"


    // $ANTLR start "ruleNodeReference"
    // InternalQms.g:692:1: ruleNodeReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleNodeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalQms.g:698:2: ( (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) ) )
            // InternalQms.g:699:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) )
            {
            // InternalQms.g:699:2: (otherlv_0= 'ref' ( ( ruleQualifiedName ) ) )
            // InternalQms.g:700:3: otherlv_0= 'ref' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeReferenceAccess().getRefKeyword_0());
            		
            // InternalQms.g:704:3: ( ( ruleQualifiedName ) )
            // InternalQms.g:705:4: ( ruleQualifiedName )
            {
            // InternalQms.g:705:4: ( ruleQualifiedName )
            // InternalQms.g:706:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNodeReferenceAccess().getRefRepositoryNodeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleNodeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalQms.g:724:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalQms.g:724:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalQms.g:725:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalQms.g:731:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalQms.g:737:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalQms.g:738:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalQms.g:738:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalQms.g:739:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalQms.g:746:3: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQms.g:747:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRepositoryType"
    // InternalQms.g:764:1: ruleRepositoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'requirement' ) | (enumLiteral_1= 'evidence' ) | (enumLiteral_2= 'qms' ) | (enumLiteral_3= 'bom' ) ) ;
    public final Enumerator ruleRepositoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalQms.g:770:2: ( ( (enumLiteral_0= 'requirement' ) | (enumLiteral_1= 'evidence' ) | (enumLiteral_2= 'qms' ) | (enumLiteral_3= 'bom' ) ) )
            // InternalQms.g:771:2: ( (enumLiteral_0= 'requirement' ) | (enumLiteral_1= 'evidence' ) | (enumLiteral_2= 'qms' ) | (enumLiteral_3= 'bom' ) )
            {
            // InternalQms.g:771:2: ( (enumLiteral_0= 'requirement' ) | (enumLiteral_1= 'evidence' ) | (enumLiteral_2= 'qms' ) | (enumLiteral_3= 'bom' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 18:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalQms.g:772:3: (enumLiteral_0= 'requirement' )
                    {
                    // InternalQms.g:772:3: (enumLiteral_0= 'requirement' )
                    // InternalQms.g:773:4: enumLiteral_0= 'requirement'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRepositoryTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQms.g:780:3: (enumLiteral_1= 'evidence' )
                    {
                    // InternalQms.g:780:3: (enumLiteral_1= 'evidence' )
                    // InternalQms.g:781:4: enumLiteral_1= 'evidence'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypeAccess().getEVIDENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRepositoryTypeAccess().getEVIDENCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQms.g:788:3: (enumLiteral_2= 'qms' )
                    {
                    // InternalQms.g:788:3: (enumLiteral_2= 'qms' )
                    // InternalQms.g:789:4: enumLiteral_2= 'qms'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypeAccess().getQMSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRepositoryTypeAccess().getQMSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQms.g:796:3: (enumLiteral_3= 'bom' )
                    {
                    // InternalQms.g:796:3: (enumLiteral_3= 'bom' )
                    // InternalQms.g:797:4: enumLiteral_3= 'bom'
                    {
                    enumLiteral_3=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getRepositoryTypeAccess().getBOMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRepositoryTypeAccess().getBOMEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRepositoryType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000142000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000632000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000622000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000690000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000162000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000730000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000720000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});

}