package org.xtext.example.qms.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.qms.services.QmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQmsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'requirement'", "'evidence'", "'qms'", "'bom'", "'repository'", "'type'", "'req'", "'{'", "'}'", "'was'", "'title'", "'weight'", "'evi'", "'text'", "'ref'", "'.'"
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

    	public void setGrammarAccess(QmsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalQms.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalQms.g:54:1: ( ruleModel EOF )
            // InternalQms.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalQms.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalQms.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalQms.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalQms.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalQms.g:69:3: ( rule__Model__Alternatives )
            // InternalQms.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRepository"
    // InternalQms.g:78:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalQms.g:79:1: ( ruleRepository EOF )
            // InternalQms.g:80:1: ruleRepository EOF
            {
             before(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalQms.g:87:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:91:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalQms.g:92:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalQms.g:92:2: ( ( rule__Repository__Group__0 ) )
            // InternalQms.g:93:3: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // InternalQms.g:94:3: ( rule__Repository__Group__0 )
            // InternalQms.g:94:4: rule__Repository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryNode"
    // InternalQms.g:103:1: entryRuleRepositoryNode : ruleRepositoryNode EOF ;
    public final void entryRuleRepositoryNode() throws RecognitionException {
        try {
            // InternalQms.g:104:1: ( ruleRepositoryNode EOF )
            // InternalQms.g:105:1: ruleRepositoryNode EOF
            {
             before(grammarAccess.getRepositoryNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleRepositoryNode();

            state._fsp--;

             after(grammarAccess.getRepositoryNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRepositoryNode"


    // $ANTLR start "ruleRepositoryNode"
    // InternalQms.g:112:1: ruleRepositoryNode : ( ( rule__RepositoryNode__Alternatives ) ) ;
    public final void ruleRepositoryNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:116:2: ( ( ( rule__RepositoryNode__Alternatives ) ) )
            // InternalQms.g:117:2: ( ( rule__RepositoryNode__Alternatives ) )
            {
            // InternalQms.g:117:2: ( ( rule__RepositoryNode__Alternatives ) )
            // InternalQms.g:118:3: ( rule__RepositoryNode__Alternatives )
            {
             before(grammarAccess.getRepositoryNodeAccess().getAlternatives()); 
            // InternalQms.g:119:3: ( rule__RepositoryNode__Alternatives )
            // InternalQms.g:119:4: rule__RepositoryNode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepositoryNode"


    // $ANTLR start "entryRuleRequirementNode"
    // InternalQms.g:128:1: entryRuleRequirementNode : ruleRequirementNode EOF ;
    public final void entryRuleRequirementNode() throws RecognitionException {
        try {
            // InternalQms.g:129:1: ( ruleRequirementNode EOF )
            // InternalQms.g:130:1: ruleRequirementNode EOF
            {
             before(grammarAccess.getRequirementNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirementNode();

            state._fsp--;

             after(grammarAccess.getRequirementNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirementNode"


    // $ANTLR start "ruleRequirementNode"
    // InternalQms.g:137:1: ruleRequirementNode : ( ( rule__RequirementNode__Group__0 ) ) ;
    public final void ruleRequirementNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:141:2: ( ( ( rule__RequirementNode__Group__0 ) ) )
            // InternalQms.g:142:2: ( ( rule__RequirementNode__Group__0 ) )
            {
            // InternalQms.g:142:2: ( ( rule__RequirementNode__Group__0 ) )
            // InternalQms.g:143:3: ( rule__RequirementNode__Group__0 )
            {
             before(grammarAccess.getRequirementNodeAccess().getGroup()); 
            // InternalQms.g:144:3: ( rule__RequirementNode__Group__0 )
            // InternalQms.g:144:4: rule__RequirementNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirementNode"


    // $ANTLR start "entryRuleBomNode"
    // InternalQms.g:153:1: entryRuleBomNode : ruleBomNode EOF ;
    public final void entryRuleBomNode() throws RecognitionException {
        try {
            // InternalQms.g:154:1: ( ruleBomNode EOF )
            // InternalQms.g:155:1: ruleBomNode EOF
            {
             before(grammarAccess.getBomNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleBomNode();

            state._fsp--;

             after(grammarAccess.getBomNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBomNode"


    // $ANTLR start "ruleBomNode"
    // InternalQms.g:162:1: ruleBomNode : ( ( rule__BomNode__Group__0 ) ) ;
    public final void ruleBomNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:166:2: ( ( ( rule__BomNode__Group__0 ) ) )
            // InternalQms.g:167:2: ( ( rule__BomNode__Group__0 ) )
            {
            // InternalQms.g:167:2: ( ( rule__BomNode__Group__0 ) )
            // InternalQms.g:168:3: ( rule__BomNode__Group__0 )
            {
             before(grammarAccess.getBomNodeAccess().getGroup()); 
            // InternalQms.g:169:3: ( rule__BomNode__Group__0 )
            // InternalQms.g:169:4: rule__BomNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BomNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBomNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBomNode"


    // $ANTLR start "entryRuleEvidenceNode"
    // InternalQms.g:178:1: entryRuleEvidenceNode : ruleEvidenceNode EOF ;
    public final void entryRuleEvidenceNode() throws RecognitionException {
        try {
            // InternalQms.g:179:1: ( ruleEvidenceNode EOF )
            // InternalQms.g:180:1: ruleEvidenceNode EOF
            {
             before(grammarAccess.getEvidenceNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleEvidenceNode();

            state._fsp--;

             after(grammarAccess.getEvidenceNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvidenceNode"


    // $ANTLR start "ruleEvidenceNode"
    // InternalQms.g:187:1: ruleEvidenceNode : ( ( rule__EvidenceNode__Group__0 ) ) ;
    public final void ruleEvidenceNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:191:2: ( ( ( rule__EvidenceNode__Group__0 ) ) )
            // InternalQms.g:192:2: ( ( rule__EvidenceNode__Group__0 ) )
            {
            // InternalQms.g:192:2: ( ( rule__EvidenceNode__Group__0 ) )
            // InternalQms.g:193:3: ( rule__EvidenceNode__Group__0 )
            {
             before(grammarAccess.getEvidenceNodeAccess().getGroup()); 
            // InternalQms.g:194:3: ( rule__EvidenceNode__Group__0 )
            // InternalQms.g:194:4: rule__EvidenceNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvidenceNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvidenceNode"


    // $ANTLR start "entryRuleNodeBodyElement"
    // InternalQms.g:203:1: entryRuleNodeBodyElement : ruleNodeBodyElement EOF ;
    public final void entryRuleNodeBodyElement() throws RecognitionException {
        try {
            // InternalQms.g:204:1: ( ruleNodeBodyElement EOF )
            // InternalQms.g:205:1: ruleNodeBodyElement EOF
            {
             before(grammarAccess.getNodeBodyElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeBodyElement();

            state._fsp--;

             after(grammarAccess.getNodeBodyElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeBodyElement"


    // $ANTLR start "ruleNodeBodyElement"
    // InternalQms.g:212:1: ruleNodeBodyElement : ( ( rule__NodeBodyElement__Alternatives ) ) ;
    public final void ruleNodeBodyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:216:2: ( ( ( rule__NodeBodyElement__Alternatives ) ) )
            // InternalQms.g:217:2: ( ( rule__NodeBodyElement__Alternatives ) )
            {
            // InternalQms.g:217:2: ( ( rule__NodeBodyElement__Alternatives ) )
            // InternalQms.g:218:3: ( rule__NodeBodyElement__Alternatives )
            {
             before(grammarAccess.getNodeBodyElementAccess().getAlternatives()); 
            // InternalQms.g:219:3: ( rule__NodeBodyElement__Alternatives )
            // InternalQms.g:219:4: rule__NodeBodyElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NodeBodyElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeBodyElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeBodyElement"


    // $ANTLR start "entryRuleText"
    // InternalQms.g:228:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalQms.g:229:1: ( ruleText EOF )
            // InternalQms.g:230:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalQms.g:237:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:241:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalQms.g:242:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalQms.g:242:2: ( ( rule__Text__Group__0 ) )
            // InternalQms.g:243:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalQms.g:244:3: ( rule__Text__Group__0 )
            // InternalQms.g:244:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNodeReference"
    // InternalQms.g:253:1: entryRuleNodeReference : ruleNodeReference EOF ;
    public final void entryRuleNodeReference() throws RecognitionException {
        try {
            // InternalQms.g:254:1: ( ruleNodeReference EOF )
            // InternalQms.g:255:1: ruleNodeReference EOF
            {
             before(grammarAccess.getNodeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleNodeReference();

            state._fsp--;

             after(grammarAccess.getNodeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeReference"


    // $ANTLR start "ruleNodeReference"
    // InternalQms.g:262:1: ruleNodeReference : ( ( rule__NodeReference__Group__0 ) ) ;
    public final void ruleNodeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:266:2: ( ( ( rule__NodeReference__Group__0 ) ) )
            // InternalQms.g:267:2: ( ( rule__NodeReference__Group__0 ) )
            {
            // InternalQms.g:267:2: ( ( rule__NodeReference__Group__0 ) )
            // InternalQms.g:268:3: ( rule__NodeReference__Group__0 )
            {
             before(grammarAccess.getNodeReferenceAccess().getGroup()); 
            // InternalQms.g:269:3: ( rule__NodeReference__Group__0 )
            // InternalQms.g:269:4: rule__NodeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NodeReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalQms.g:278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalQms.g:279:1: ( ruleQualifiedName EOF )
            // InternalQms.g:280:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalQms.g:287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalQms.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalQms.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalQms.g:293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalQms.g:294:3: ( rule__QualifiedName__Group__0 )
            // InternalQms.g:294:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRepositoryType"
    // InternalQms.g:303:1: ruleRepositoryType : ( ( rule__RepositoryType__Alternatives ) ) ;
    public final void ruleRepositoryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:307:1: ( ( ( rule__RepositoryType__Alternatives ) ) )
            // InternalQms.g:308:2: ( ( rule__RepositoryType__Alternatives ) )
            {
            // InternalQms.g:308:2: ( ( rule__RepositoryType__Alternatives ) )
            // InternalQms.g:309:3: ( rule__RepositoryType__Alternatives )
            {
             before(grammarAccess.getRepositoryTypeAccess().getAlternatives()); 
            // InternalQms.g:310:3: ( rule__RepositoryType__Alternatives )
            // InternalQms.g:310:4: rule__RepositoryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepositoryType"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalQms.g:318:1: rule__Model__Alternatives : ( ( ruleRepository ) | ( ruleRepositoryNode ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:322:1: ( ( ruleRepository ) | ( ruleRepositoryNode ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==14||LA1_0==17||LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQms.g:323:2: ( ruleRepository )
                    {
                    // InternalQms.g:323:2: ( ruleRepository )
                    // InternalQms.g:324:3: ruleRepository
                    {
                     before(grammarAccess.getModelAccess().getRepositoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRepository();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getRepositoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQms.g:329:2: ( ruleRepositoryNode )
                    {
                    // InternalQms.g:329:2: ( ruleRepositoryNode )
                    // InternalQms.g:330:3: ruleRepositoryNode
                    {
                     before(grammarAccess.getModelAccess().getRepositoryNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRepositoryNode();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getRepositoryNodeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__RepositoryNode__Alternatives"
    // InternalQms.g:339:1: rule__RepositoryNode__Alternatives : ( ( ruleRequirementNode ) | ( ruleEvidenceNode ) | ( ruleBomNode ) );
    public final void rule__RepositoryNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:343:1: ( ( ruleRequirementNode ) | ( ruleEvidenceNode ) | ( ruleBomNode ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalQms.g:344:2: ( ruleRequirementNode )
                    {
                    // InternalQms.g:344:2: ( ruleRequirementNode )
                    // InternalQms.g:345:3: ruleRequirementNode
                    {
                     before(grammarAccess.getRepositoryNodeAccess().getRequirementNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRequirementNode();

                    state._fsp--;

                     after(grammarAccess.getRepositoryNodeAccess().getRequirementNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQms.g:350:2: ( ruleEvidenceNode )
                    {
                    // InternalQms.g:350:2: ( ruleEvidenceNode )
                    // InternalQms.g:351:3: ruleEvidenceNode
                    {
                     before(grammarAccess.getRepositoryNodeAccess().getEvidenceNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEvidenceNode();

                    state._fsp--;

                     after(grammarAccess.getRepositoryNodeAccess().getEvidenceNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQms.g:356:2: ( ruleBomNode )
                    {
                    // InternalQms.g:356:2: ( ruleBomNode )
                    // InternalQms.g:357:3: ruleBomNode
                    {
                     before(grammarAccess.getRepositoryNodeAccess().getBomNodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBomNode();

                    state._fsp--;

                     after(grammarAccess.getRepositoryNodeAccess().getBomNodeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryNode__Alternatives"


    // $ANTLR start "rule__NodeBodyElement__Alternatives"
    // InternalQms.g:366:1: rule__NodeBodyElement__Alternatives : ( ( ruleText ) | ( ruleNodeReference ) );
    public final void rule__NodeBodyElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:370:1: ( ( ruleText ) | ( ruleNodeReference ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQms.g:371:2: ( ruleText )
                    {
                    // InternalQms.g:371:2: ( ruleText )
                    // InternalQms.g:372:3: ruleText
                    {
                     before(grammarAccess.getNodeBodyElementAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getNodeBodyElementAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQms.g:377:2: ( ruleNodeReference )
                    {
                    // InternalQms.g:377:2: ( ruleNodeReference )
                    // InternalQms.g:378:3: ruleNodeReference
                    {
                     before(grammarAccess.getNodeBodyElementAccess().getNodeReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNodeReference();

                    state._fsp--;

                     after(grammarAccess.getNodeBodyElementAccess().getNodeReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeBodyElement__Alternatives"


    // $ANTLR start "rule__RepositoryType__Alternatives"
    // InternalQms.g:387:1: rule__RepositoryType__Alternatives : ( ( ( 'requirement' ) ) | ( ( 'evidence' ) ) | ( ( 'qms' ) ) | ( ( 'bom' ) ) );
    public final void rule__RepositoryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:391:1: ( ( ( 'requirement' ) ) | ( ( 'evidence' ) ) | ( ( 'qms' ) ) | ( ( 'bom' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQms.g:392:2: ( ( 'requirement' ) )
                    {
                    // InternalQms.g:392:2: ( ( 'requirement' ) )
                    // InternalQms.g:393:3: ( 'requirement' )
                    {
                     before(grammarAccess.getRepositoryTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 
                    // InternalQms.g:394:3: ( 'requirement' )
                    // InternalQms.g:394:4: 'requirement'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepositoryTypeAccess().getREQUIREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQms.g:398:2: ( ( 'evidence' ) )
                    {
                    // InternalQms.g:398:2: ( ( 'evidence' ) )
                    // InternalQms.g:399:3: ( 'evidence' )
                    {
                     before(grammarAccess.getRepositoryTypeAccess().getEVIDENCEEnumLiteralDeclaration_1()); 
                    // InternalQms.g:400:3: ( 'evidence' )
                    // InternalQms.g:400:4: 'evidence'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepositoryTypeAccess().getEVIDENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQms.g:404:2: ( ( 'qms' ) )
                    {
                    // InternalQms.g:404:2: ( ( 'qms' ) )
                    // InternalQms.g:405:3: ( 'qms' )
                    {
                     before(grammarAccess.getRepositoryTypeAccess().getQMSEnumLiteralDeclaration_2()); 
                    // InternalQms.g:406:3: ( 'qms' )
                    // InternalQms.g:406:4: 'qms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepositoryTypeAccess().getQMSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQms.g:410:2: ( ( 'bom' ) )
                    {
                    // InternalQms.g:410:2: ( ( 'bom' ) )
                    // InternalQms.g:411:3: ( 'bom' )
                    {
                     before(grammarAccess.getRepositoryTypeAccess().getBOMEnumLiteralDeclaration_3()); 
                    // InternalQms.g:412:3: ( 'bom' )
                    // InternalQms.g:412:4: 'bom'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRepositoryTypeAccess().getBOMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryType__Alternatives"


    // $ANTLR start "rule__Repository__Group__0"
    // InternalQms.g:420:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:424:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalQms.g:425:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Repository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__0"


    // $ANTLR start "rule__Repository__Group__0__Impl"
    // InternalQms.g:432:1: rule__Repository__Group__0__Impl : ( 'repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:436:1: ( ( 'repository' ) )
            // InternalQms.g:437:1: ( 'repository' )
            {
            // InternalQms.g:437:1: ( 'repository' )
            // InternalQms.g:438:2: 'repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__0__Impl"


    // $ANTLR start "rule__Repository__Group__1"
    // InternalQms.g:447:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:451:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalQms.g:452:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Repository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__1"


    // $ANTLR start "rule__Repository__Group__1__Impl"
    // InternalQms.g:459:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__NameAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:463:1: ( ( ( rule__Repository__NameAssignment_1 ) ) )
            // InternalQms.g:464:1: ( ( rule__Repository__NameAssignment_1 ) )
            {
            // InternalQms.g:464:1: ( ( rule__Repository__NameAssignment_1 ) )
            // InternalQms.g:465:2: ( rule__Repository__NameAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getNameAssignment_1()); 
            // InternalQms.g:466:2: ( rule__Repository__NameAssignment_1 )
            // InternalQms.g:466:3: rule__Repository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Repository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__1__Impl"


    // $ANTLR start "rule__Repository__Group__2"
    // InternalQms.g:474:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:478:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalQms.g:479:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Repository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__2"


    // $ANTLR start "rule__Repository__Group__2__Impl"
    // InternalQms.g:486:1: rule__Repository__Group__2__Impl : ( 'type' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:490:1: ( ( 'type' ) )
            // InternalQms.g:491:1: ( 'type' )
            {
            // InternalQms.g:491:1: ( 'type' )
            // InternalQms.g:492:2: 'type'
            {
             before(grammarAccess.getRepositoryAccess().getTypeKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__3"
    // InternalQms.g:501:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:505:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalQms.g:506:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Repository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__3"


    // $ANTLR start "rule__Repository__Group__3__Impl"
    // InternalQms.g:513:1: rule__Repository__Group__3__Impl : ( ( rule__Repository__TypeAssignment_3 ) ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:517:1: ( ( ( rule__Repository__TypeAssignment_3 ) ) )
            // InternalQms.g:518:1: ( ( rule__Repository__TypeAssignment_3 ) )
            {
            // InternalQms.g:518:1: ( ( rule__Repository__TypeAssignment_3 ) )
            // InternalQms.g:519:2: ( rule__Repository__TypeAssignment_3 )
            {
             before(grammarAccess.getRepositoryAccess().getTypeAssignment_3()); 
            // InternalQms.g:520:2: ( rule__Repository__TypeAssignment_3 )
            // InternalQms.g:520:3: rule__Repository__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Repository__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__3__Impl"


    // $ANTLR start "rule__Repository__Group__4"
    // InternalQms.g:528:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:532:1: ( rule__Repository__Group__4__Impl )
            // InternalQms.g:533:2: rule__Repository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__4"


    // $ANTLR start "rule__Repository__Group__4__Impl"
    // InternalQms.g:539:1: rule__Repository__Group__4__Impl : ( ( rule__Repository__RootAssignment_4 ) ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:543:1: ( ( ( rule__Repository__RootAssignment_4 ) ) )
            // InternalQms.g:544:1: ( ( rule__Repository__RootAssignment_4 ) )
            {
            // InternalQms.g:544:1: ( ( rule__Repository__RootAssignment_4 ) )
            // InternalQms.g:545:2: ( rule__Repository__RootAssignment_4 )
            {
             before(grammarAccess.getRepositoryAccess().getRootAssignment_4()); 
            // InternalQms.g:546:2: ( rule__Repository__RootAssignment_4 )
            // InternalQms.g:546:3: rule__Repository__RootAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Repository__RootAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getRootAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__4__Impl"


    // $ANTLR start "rule__RequirementNode__Group__0"
    // InternalQms.g:555:1: rule__RequirementNode__Group__0 : rule__RequirementNode__Group__0__Impl rule__RequirementNode__Group__1 ;
    public final void rule__RequirementNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:559:1: ( rule__RequirementNode__Group__0__Impl rule__RequirementNode__Group__1 )
            // InternalQms.g:560:2: rule__RequirementNode__Group__0__Impl rule__RequirementNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RequirementNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__0"


    // $ANTLR start "rule__RequirementNode__Group__0__Impl"
    // InternalQms.g:567:1: rule__RequirementNode__Group__0__Impl : ( 'req' ) ;
    public final void rule__RequirementNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:571:1: ( ( 'req' ) )
            // InternalQms.g:572:1: ( 'req' )
            {
            // InternalQms.g:572:1: ( 'req' )
            // InternalQms.g:573:2: 'req'
            {
             before(grammarAccess.getRequirementNodeAccess().getReqKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getReqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__0__Impl"


    // $ANTLR start "rule__RequirementNode__Group__1"
    // InternalQms.g:582:1: rule__RequirementNode__Group__1 : rule__RequirementNode__Group__1__Impl rule__RequirementNode__Group__2 ;
    public final void rule__RequirementNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:586:1: ( rule__RequirementNode__Group__1__Impl rule__RequirementNode__Group__2 )
            // InternalQms.g:587:2: rule__RequirementNode__Group__1__Impl rule__RequirementNode__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__RequirementNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__1"


    // $ANTLR start "rule__RequirementNode__Group__1__Impl"
    // InternalQms.g:594:1: rule__RequirementNode__Group__1__Impl : ( ( rule__RequirementNode__NameAssignment_1 ) ) ;
    public final void rule__RequirementNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:598:1: ( ( ( rule__RequirementNode__NameAssignment_1 ) ) )
            // InternalQms.g:599:1: ( ( rule__RequirementNode__NameAssignment_1 ) )
            {
            // InternalQms.g:599:1: ( ( rule__RequirementNode__NameAssignment_1 ) )
            // InternalQms.g:600:2: ( rule__RequirementNode__NameAssignment_1 )
            {
             before(grammarAccess.getRequirementNodeAccess().getNameAssignment_1()); 
            // InternalQms.g:601:2: ( rule__RequirementNode__NameAssignment_1 )
            // InternalQms.g:601:3: rule__RequirementNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__1__Impl"


    // $ANTLR start "rule__RequirementNode__Group__2"
    // InternalQms.g:609:1: rule__RequirementNode__Group__2 : rule__RequirementNode__Group__2__Impl rule__RequirementNode__Group__3 ;
    public final void rule__RequirementNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:613:1: ( rule__RequirementNode__Group__2__Impl rule__RequirementNode__Group__3 )
            // InternalQms.g:614:2: rule__RequirementNode__Group__2__Impl rule__RequirementNode__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RequirementNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__2"


    // $ANTLR start "rule__RequirementNode__Group__2__Impl"
    // InternalQms.g:621:1: rule__RequirementNode__Group__2__Impl : ( ( rule__RequirementNode__Group_2__0 )? ) ;
    public final void rule__RequirementNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:625:1: ( ( ( rule__RequirementNode__Group_2__0 )? ) )
            // InternalQms.g:626:1: ( ( rule__RequirementNode__Group_2__0 )? )
            {
            // InternalQms.g:626:1: ( ( rule__RequirementNode__Group_2__0 )? )
            // InternalQms.g:627:2: ( rule__RequirementNode__Group_2__0 )?
            {
             before(grammarAccess.getRequirementNodeAccess().getGroup_2()); 
            // InternalQms.g:628:2: ( rule__RequirementNode__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQms.g:628:3: rule__RequirementNode__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequirementNode__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementNodeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__2__Impl"


    // $ANTLR start "rule__RequirementNode__Group__3"
    // InternalQms.g:636:1: rule__RequirementNode__Group__3 : rule__RequirementNode__Group__3__Impl rule__RequirementNode__Group__4 ;
    public final void rule__RequirementNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:640:1: ( rule__RequirementNode__Group__3__Impl rule__RequirementNode__Group__4 )
            // InternalQms.g:641:2: rule__RequirementNode__Group__3__Impl rule__RequirementNode__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RequirementNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__3"


    // $ANTLR start "rule__RequirementNode__Group__3__Impl"
    // InternalQms.g:648:1: rule__RequirementNode__Group__3__Impl : ( '{' ) ;
    public final void rule__RequirementNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:652:1: ( ( '{' ) )
            // InternalQms.g:653:1: ( '{' )
            {
            // InternalQms.g:653:1: ( '{' )
            // InternalQms.g:654:2: '{'
            {
             before(grammarAccess.getRequirementNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__3__Impl"


    // $ANTLR start "rule__RequirementNode__Group__4"
    // InternalQms.g:663:1: rule__RequirementNode__Group__4 : rule__RequirementNode__Group__4__Impl rule__RequirementNode__Group__5 ;
    public final void rule__RequirementNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:667:1: ( rule__RequirementNode__Group__4__Impl rule__RequirementNode__Group__5 )
            // InternalQms.g:668:2: rule__RequirementNode__Group__4__Impl rule__RequirementNode__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RequirementNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__4"


    // $ANTLR start "rule__RequirementNode__Group__4__Impl"
    // InternalQms.g:675:1: rule__RequirementNode__Group__4__Impl : ( ( rule__RequirementNode__Group_4__0 )? ) ;
    public final void rule__RequirementNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:679:1: ( ( ( rule__RequirementNode__Group_4__0 )? ) )
            // InternalQms.g:680:1: ( ( rule__RequirementNode__Group_4__0 )? )
            {
            // InternalQms.g:680:1: ( ( rule__RequirementNode__Group_4__0 )? )
            // InternalQms.g:681:2: ( rule__RequirementNode__Group_4__0 )?
            {
             before(grammarAccess.getRequirementNodeAccess().getGroup_4()); 
            // InternalQms.g:682:2: ( rule__RequirementNode__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQms.g:682:3: rule__RequirementNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequirementNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__4__Impl"


    // $ANTLR start "rule__RequirementNode__Group__5"
    // InternalQms.g:690:1: rule__RequirementNode__Group__5 : rule__RequirementNode__Group__5__Impl rule__RequirementNode__Group__6 ;
    public final void rule__RequirementNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:694:1: ( rule__RequirementNode__Group__5__Impl rule__RequirementNode__Group__6 )
            // InternalQms.g:695:2: rule__RequirementNode__Group__5__Impl rule__RequirementNode__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__RequirementNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__5"


    // $ANTLR start "rule__RequirementNode__Group__5__Impl"
    // InternalQms.g:702:1: rule__RequirementNode__Group__5__Impl : ( ( rule__RequirementNode__BodyAssignment_5 )* ) ;
    public final void rule__RequirementNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:706:1: ( ( ( rule__RequirementNode__BodyAssignment_5 )* ) )
            // InternalQms.g:707:1: ( ( rule__RequirementNode__BodyAssignment_5 )* )
            {
            // InternalQms.g:707:1: ( ( rule__RequirementNode__BodyAssignment_5 )* )
            // InternalQms.g:708:2: ( rule__RequirementNode__BodyAssignment_5 )*
            {
             before(grammarAccess.getRequirementNodeAccess().getBodyAssignment_5()); 
            // InternalQms.g:709:2: ( rule__RequirementNode__BodyAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQms.g:709:3: rule__RequirementNode__BodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RequirementNode__BodyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRequirementNodeAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__5__Impl"


    // $ANTLR start "rule__RequirementNode__Group__6"
    // InternalQms.g:717:1: rule__RequirementNode__Group__6 : rule__RequirementNode__Group__6__Impl rule__RequirementNode__Group__7 ;
    public final void rule__RequirementNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:721:1: ( rule__RequirementNode__Group__6__Impl rule__RequirementNode__Group__7 )
            // InternalQms.g:722:2: rule__RequirementNode__Group__6__Impl rule__RequirementNode__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__RequirementNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__6"


    // $ANTLR start "rule__RequirementNode__Group__6__Impl"
    // InternalQms.g:729:1: rule__RequirementNode__Group__6__Impl : ( ( rule__RequirementNode__ChildrenAssignment_6 )* ) ;
    public final void rule__RequirementNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:733:1: ( ( ( rule__RequirementNode__ChildrenAssignment_6 )* ) )
            // InternalQms.g:734:1: ( ( rule__RequirementNode__ChildrenAssignment_6 )* )
            {
            // InternalQms.g:734:1: ( ( rule__RequirementNode__ChildrenAssignment_6 )* )
            // InternalQms.g:735:2: ( rule__RequirementNode__ChildrenAssignment_6 )*
            {
             before(grammarAccess.getRequirementNodeAccess().getChildrenAssignment_6()); 
            // InternalQms.g:736:2: ( rule__RequirementNode__ChildrenAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQms.g:736:3: rule__RequirementNode__ChildrenAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RequirementNode__ChildrenAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRequirementNodeAccess().getChildrenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__6__Impl"


    // $ANTLR start "rule__RequirementNode__Group__7"
    // InternalQms.g:744:1: rule__RequirementNode__Group__7 : rule__RequirementNode__Group__7__Impl ;
    public final void rule__RequirementNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:748:1: ( rule__RequirementNode__Group__7__Impl )
            // InternalQms.g:749:2: rule__RequirementNode__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__7"


    // $ANTLR start "rule__RequirementNode__Group__7__Impl"
    // InternalQms.g:755:1: rule__RequirementNode__Group__7__Impl : ( '}' ) ;
    public final void rule__RequirementNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:759:1: ( ( '}' ) )
            // InternalQms.g:760:1: ( '}' )
            {
            // InternalQms.g:760:1: ( '}' )
            // InternalQms.g:761:2: '}'
            {
             before(grammarAccess.getRequirementNodeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group__7__Impl"


    // $ANTLR start "rule__RequirementNode__Group_2__0"
    // InternalQms.g:771:1: rule__RequirementNode__Group_2__0 : rule__RequirementNode__Group_2__0__Impl rule__RequirementNode__Group_2__1 ;
    public final void rule__RequirementNode__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:775:1: ( rule__RequirementNode__Group_2__0__Impl rule__RequirementNode__Group_2__1 )
            // InternalQms.g:776:2: rule__RequirementNode__Group_2__0__Impl rule__RequirementNode__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RequirementNode__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_2__0"


    // $ANTLR start "rule__RequirementNode__Group_2__0__Impl"
    // InternalQms.g:783:1: rule__RequirementNode__Group_2__0__Impl : ( 'was' ) ;
    public final void rule__RequirementNode__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:787:1: ( ( 'was' ) )
            // InternalQms.g:788:1: ( 'was' )
            {
            // InternalQms.g:788:1: ( 'was' )
            // InternalQms.g:789:2: 'was'
            {
             before(grammarAccess.getRequirementNodeAccess().getWasKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getWasKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_2__0__Impl"


    // $ANTLR start "rule__RequirementNode__Group_2__1"
    // InternalQms.g:798:1: rule__RequirementNode__Group_2__1 : rule__RequirementNode__Group_2__1__Impl ;
    public final void rule__RequirementNode__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:802:1: ( rule__RequirementNode__Group_2__1__Impl )
            // InternalQms.g:803:2: rule__RequirementNode__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_2__1"


    // $ANTLR start "rule__RequirementNode__Group_2__1__Impl"
    // InternalQms.g:809:1: rule__RequirementNode__Group_2__1__Impl : ( ( rule__RequirementNode__FormerNameAssignment_2_1 ) ) ;
    public final void rule__RequirementNode__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:813:1: ( ( ( rule__RequirementNode__FormerNameAssignment_2_1 ) ) )
            // InternalQms.g:814:1: ( ( rule__RequirementNode__FormerNameAssignment_2_1 ) )
            {
            // InternalQms.g:814:1: ( ( rule__RequirementNode__FormerNameAssignment_2_1 ) )
            // InternalQms.g:815:2: ( rule__RequirementNode__FormerNameAssignment_2_1 )
            {
             before(grammarAccess.getRequirementNodeAccess().getFormerNameAssignment_2_1()); 
            // InternalQms.g:816:2: ( rule__RequirementNode__FormerNameAssignment_2_1 )
            // InternalQms.g:816:3: rule__RequirementNode__FormerNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__FormerNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementNodeAccess().getFormerNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_2__1__Impl"


    // $ANTLR start "rule__RequirementNode__Group_4__0"
    // InternalQms.g:825:1: rule__RequirementNode__Group_4__0 : rule__RequirementNode__Group_4__0__Impl rule__RequirementNode__Group_4__1 ;
    public final void rule__RequirementNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:829:1: ( rule__RequirementNode__Group_4__0__Impl rule__RequirementNode__Group_4__1 )
            // InternalQms.g:830:2: rule__RequirementNode__Group_4__0__Impl rule__RequirementNode__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__RequirementNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_4__0"


    // $ANTLR start "rule__RequirementNode__Group_4__0__Impl"
    // InternalQms.g:837:1: rule__RequirementNode__Group_4__0__Impl : ( 'title' ) ;
    public final void rule__RequirementNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:841:1: ( ( 'title' ) )
            // InternalQms.g:842:1: ( 'title' )
            {
            // InternalQms.g:842:1: ( 'title' )
            // InternalQms.g:843:2: 'title'
            {
             before(grammarAccess.getRequirementNodeAccess().getTitleKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getTitleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_4__0__Impl"


    // $ANTLR start "rule__RequirementNode__Group_4__1"
    // InternalQms.g:852:1: rule__RequirementNode__Group_4__1 : rule__RequirementNode__Group_4__1__Impl ;
    public final void rule__RequirementNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:856:1: ( rule__RequirementNode__Group_4__1__Impl )
            // InternalQms.g:857:2: rule__RequirementNode__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_4__1"


    // $ANTLR start "rule__RequirementNode__Group_4__1__Impl"
    // InternalQms.g:863:1: rule__RequirementNode__Group_4__1__Impl : ( ( rule__RequirementNode__TitleAssignment_4_1 ) ) ;
    public final void rule__RequirementNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:867:1: ( ( ( rule__RequirementNode__TitleAssignment_4_1 ) ) )
            // InternalQms.g:868:1: ( ( rule__RequirementNode__TitleAssignment_4_1 ) )
            {
            // InternalQms.g:868:1: ( ( rule__RequirementNode__TitleAssignment_4_1 ) )
            // InternalQms.g:869:2: ( rule__RequirementNode__TitleAssignment_4_1 )
            {
             before(grammarAccess.getRequirementNodeAccess().getTitleAssignment_4_1()); 
            // InternalQms.g:870:2: ( rule__RequirementNode__TitleAssignment_4_1 )
            // InternalQms.g:870:3: rule__RequirementNode__TitleAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementNode__TitleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementNodeAccess().getTitleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__Group_4__1__Impl"


    // $ANTLR start "rule__BomNode__Group__0"
    // InternalQms.g:879:1: rule__BomNode__Group__0 : rule__BomNode__Group__0__Impl rule__BomNode__Group__1 ;
    public final void rule__BomNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:883:1: ( rule__BomNode__Group__0__Impl rule__BomNode__Group__1 )
            // InternalQms.g:884:2: rule__BomNode__Group__0__Impl rule__BomNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BomNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__0"


    // $ANTLR start "rule__BomNode__Group__0__Impl"
    // InternalQms.g:891:1: rule__BomNode__Group__0__Impl : ( 'bom' ) ;
    public final void rule__BomNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:895:1: ( ( 'bom' ) )
            // InternalQms.g:896:1: ( 'bom' )
            {
            // InternalQms.g:896:1: ( 'bom' )
            // InternalQms.g:897:2: 'bom'
            {
             before(grammarAccess.getBomNodeAccess().getBomKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getBomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__0__Impl"


    // $ANTLR start "rule__BomNode__Group__1"
    // InternalQms.g:906:1: rule__BomNode__Group__1 : rule__BomNode__Group__1__Impl rule__BomNode__Group__2 ;
    public final void rule__BomNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:910:1: ( rule__BomNode__Group__1__Impl rule__BomNode__Group__2 )
            // InternalQms.g:911:2: rule__BomNode__Group__1__Impl rule__BomNode__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BomNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__1"


    // $ANTLR start "rule__BomNode__Group__1__Impl"
    // InternalQms.g:918:1: rule__BomNode__Group__1__Impl : ( ( rule__BomNode__NameAssignment_1 ) ) ;
    public final void rule__BomNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:922:1: ( ( ( rule__BomNode__NameAssignment_1 ) ) )
            // InternalQms.g:923:1: ( ( rule__BomNode__NameAssignment_1 ) )
            {
            // InternalQms.g:923:1: ( ( rule__BomNode__NameAssignment_1 ) )
            // InternalQms.g:924:2: ( rule__BomNode__NameAssignment_1 )
            {
             before(grammarAccess.getBomNodeAccess().getNameAssignment_1()); 
            // InternalQms.g:925:2: ( rule__BomNode__NameAssignment_1 )
            // InternalQms.g:925:3: rule__BomNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BomNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBomNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__1__Impl"


    // $ANTLR start "rule__BomNode__Group__2"
    // InternalQms.g:933:1: rule__BomNode__Group__2 : rule__BomNode__Group__2__Impl rule__BomNode__Group__3 ;
    public final void rule__BomNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:937:1: ( rule__BomNode__Group__2__Impl rule__BomNode__Group__3 )
            // InternalQms.g:938:2: rule__BomNode__Group__2__Impl rule__BomNode__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__BomNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__2"


    // $ANTLR start "rule__BomNode__Group__2__Impl"
    // InternalQms.g:945:1: rule__BomNode__Group__2__Impl : ( '{' ) ;
    public final void rule__BomNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:949:1: ( ( '{' ) )
            // InternalQms.g:950:1: ( '{' )
            {
            // InternalQms.g:950:1: ( '{' )
            // InternalQms.g:951:2: '{'
            {
             before(grammarAccess.getBomNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__2__Impl"


    // $ANTLR start "rule__BomNode__Group__3"
    // InternalQms.g:960:1: rule__BomNode__Group__3 : rule__BomNode__Group__3__Impl rule__BomNode__Group__4 ;
    public final void rule__BomNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:964:1: ( rule__BomNode__Group__3__Impl rule__BomNode__Group__4 )
            // InternalQms.g:965:2: rule__BomNode__Group__3__Impl rule__BomNode__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__BomNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__3"


    // $ANTLR start "rule__BomNode__Group__3__Impl"
    // InternalQms.g:972:1: rule__BomNode__Group__3__Impl : ( ( rule__BomNode__Group_3__0 )? ) ;
    public final void rule__BomNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:976:1: ( ( ( rule__BomNode__Group_3__0 )? ) )
            // InternalQms.g:977:1: ( ( rule__BomNode__Group_3__0 )? )
            {
            // InternalQms.g:977:1: ( ( rule__BomNode__Group_3__0 )? )
            // InternalQms.g:978:2: ( rule__BomNode__Group_3__0 )?
            {
             before(grammarAccess.getBomNodeAccess().getGroup_3()); 
            // InternalQms.g:979:2: ( rule__BomNode__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQms.g:979:3: rule__BomNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BomNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBomNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__3__Impl"


    // $ANTLR start "rule__BomNode__Group__4"
    // InternalQms.g:987:1: rule__BomNode__Group__4 : rule__BomNode__Group__4__Impl rule__BomNode__Group__5 ;
    public final void rule__BomNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:991:1: ( rule__BomNode__Group__4__Impl rule__BomNode__Group__5 )
            // InternalQms.g:992:2: rule__BomNode__Group__4__Impl rule__BomNode__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__BomNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__4"


    // $ANTLR start "rule__BomNode__Group__4__Impl"
    // InternalQms.g:999:1: rule__BomNode__Group__4__Impl : ( ( rule__BomNode__BodyAssignment_4 )* ) ;
    public final void rule__BomNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1003:1: ( ( ( rule__BomNode__BodyAssignment_4 )* ) )
            // InternalQms.g:1004:1: ( ( rule__BomNode__BodyAssignment_4 )* )
            {
            // InternalQms.g:1004:1: ( ( rule__BomNode__BodyAssignment_4 )* )
            // InternalQms.g:1005:2: ( rule__BomNode__BodyAssignment_4 )*
            {
             before(grammarAccess.getBomNodeAccess().getBodyAssignment_4()); 
            // InternalQms.g:1006:2: ( rule__BomNode__BodyAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQms.g:1006:3: rule__BomNode__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BomNode__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBomNodeAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__4__Impl"


    // $ANTLR start "rule__BomNode__Group__5"
    // InternalQms.g:1014:1: rule__BomNode__Group__5 : rule__BomNode__Group__5__Impl rule__BomNode__Group__6 ;
    public final void rule__BomNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1018:1: ( rule__BomNode__Group__5__Impl rule__BomNode__Group__6 )
            // InternalQms.g:1019:2: rule__BomNode__Group__5__Impl rule__BomNode__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__BomNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__5"


    // $ANTLR start "rule__BomNode__Group__5__Impl"
    // InternalQms.g:1026:1: rule__BomNode__Group__5__Impl : ( 'weight' ) ;
    public final void rule__BomNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1030:1: ( ( 'weight' ) )
            // InternalQms.g:1031:1: ( 'weight' )
            {
            // InternalQms.g:1031:1: ( 'weight' )
            // InternalQms.g:1032:2: 'weight'
            {
             before(grammarAccess.getBomNodeAccess().getWeightKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getWeightKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__5__Impl"


    // $ANTLR start "rule__BomNode__Group__6"
    // InternalQms.g:1041:1: rule__BomNode__Group__6 : rule__BomNode__Group__6__Impl rule__BomNode__Group__7 ;
    public final void rule__BomNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1045:1: ( rule__BomNode__Group__6__Impl rule__BomNode__Group__7 )
            // InternalQms.g:1046:2: rule__BomNode__Group__6__Impl rule__BomNode__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__BomNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__6"


    // $ANTLR start "rule__BomNode__Group__6__Impl"
    // InternalQms.g:1053:1: rule__BomNode__Group__6__Impl : ( ( rule__BomNode__WeightAssignment_6 ) ) ;
    public final void rule__BomNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1057:1: ( ( ( rule__BomNode__WeightAssignment_6 ) ) )
            // InternalQms.g:1058:1: ( ( rule__BomNode__WeightAssignment_6 ) )
            {
            // InternalQms.g:1058:1: ( ( rule__BomNode__WeightAssignment_6 ) )
            // InternalQms.g:1059:2: ( rule__BomNode__WeightAssignment_6 )
            {
             before(grammarAccess.getBomNodeAccess().getWeightAssignment_6()); 
            // InternalQms.g:1060:2: ( rule__BomNode__WeightAssignment_6 )
            // InternalQms.g:1060:3: rule__BomNode__WeightAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BomNode__WeightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBomNodeAccess().getWeightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__6__Impl"


    // $ANTLR start "rule__BomNode__Group__7"
    // InternalQms.g:1068:1: rule__BomNode__Group__7 : rule__BomNode__Group__7__Impl rule__BomNode__Group__8 ;
    public final void rule__BomNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1072:1: ( rule__BomNode__Group__7__Impl rule__BomNode__Group__8 )
            // InternalQms.g:1073:2: rule__BomNode__Group__7__Impl rule__BomNode__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__BomNode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__7"


    // $ANTLR start "rule__BomNode__Group__7__Impl"
    // InternalQms.g:1080:1: rule__BomNode__Group__7__Impl : ( ( rule__BomNode__ChildrenAssignment_7 )* ) ;
    public final void rule__BomNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1084:1: ( ( ( rule__BomNode__ChildrenAssignment_7 )* ) )
            // InternalQms.g:1085:1: ( ( rule__BomNode__ChildrenAssignment_7 )* )
            {
            // InternalQms.g:1085:1: ( ( rule__BomNode__ChildrenAssignment_7 )* )
            // InternalQms.g:1086:2: ( rule__BomNode__ChildrenAssignment_7 )*
            {
             before(grammarAccess.getBomNodeAccess().getChildrenAssignment_7()); 
            // InternalQms.g:1087:2: ( rule__BomNode__ChildrenAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQms.g:1087:3: rule__BomNode__ChildrenAssignment_7
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__BomNode__ChildrenAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBomNodeAccess().getChildrenAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__7__Impl"


    // $ANTLR start "rule__BomNode__Group__8"
    // InternalQms.g:1095:1: rule__BomNode__Group__8 : rule__BomNode__Group__8__Impl ;
    public final void rule__BomNode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1099:1: ( rule__BomNode__Group__8__Impl )
            // InternalQms.g:1100:2: rule__BomNode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BomNode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__8"


    // $ANTLR start "rule__BomNode__Group__8__Impl"
    // InternalQms.g:1106:1: rule__BomNode__Group__8__Impl : ( '}' ) ;
    public final void rule__BomNode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1110:1: ( ( '}' ) )
            // InternalQms.g:1111:1: ( '}' )
            {
            // InternalQms.g:1111:1: ( '}' )
            // InternalQms.g:1112:2: '}'
            {
             before(grammarAccess.getBomNodeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group__8__Impl"


    // $ANTLR start "rule__BomNode__Group_3__0"
    // InternalQms.g:1122:1: rule__BomNode__Group_3__0 : rule__BomNode__Group_3__0__Impl rule__BomNode__Group_3__1 ;
    public final void rule__BomNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1126:1: ( rule__BomNode__Group_3__0__Impl rule__BomNode__Group_3__1 )
            // InternalQms.g:1127:2: rule__BomNode__Group_3__0__Impl rule__BomNode__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__BomNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BomNode__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group_3__0"


    // $ANTLR start "rule__BomNode__Group_3__0__Impl"
    // InternalQms.g:1134:1: rule__BomNode__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__BomNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1138:1: ( ( 'title' ) )
            // InternalQms.g:1139:1: ( 'title' )
            {
            // InternalQms.g:1139:1: ( 'title' )
            // InternalQms.g:1140:2: 'title'
            {
             before(grammarAccess.getBomNodeAccess().getTitleKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group_3__0__Impl"


    // $ANTLR start "rule__BomNode__Group_3__1"
    // InternalQms.g:1149:1: rule__BomNode__Group_3__1 : rule__BomNode__Group_3__1__Impl ;
    public final void rule__BomNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1153:1: ( rule__BomNode__Group_3__1__Impl )
            // InternalQms.g:1154:2: rule__BomNode__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BomNode__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group_3__1"


    // $ANTLR start "rule__BomNode__Group_3__1__Impl"
    // InternalQms.g:1160:1: rule__BomNode__Group_3__1__Impl : ( ( rule__BomNode__TitleAssignment_3_1 ) ) ;
    public final void rule__BomNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1164:1: ( ( ( rule__BomNode__TitleAssignment_3_1 ) ) )
            // InternalQms.g:1165:1: ( ( rule__BomNode__TitleAssignment_3_1 ) )
            {
            // InternalQms.g:1165:1: ( ( rule__BomNode__TitleAssignment_3_1 ) )
            // InternalQms.g:1166:2: ( rule__BomNode__TitleAssignment_3_1 )
            {
             before(grammarAccess.getBomNodeAccess().getTitleAssignment_3_1()); 
            // InternalQms.g:1167:2: ( rule__BomNode__TitleAssignment_3_1 )
            // InternalQms.g:1167:3: rule__BomNode__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BomNode__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBomNodeAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__Group_3__1__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__0"
    // InternalQms.g:1176:1: rule__EvidenceNode__Group__0 : rule__EvidenceNode__Group__0__Impl rule__EvidenceNode__Group__1 ;
    public final void rule__EvidenceNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1180:1: ( rule__EvidenceNode__Group__0__Impl rule__EvidenceNode__Group__1 )
            // InternalQms.g:1181:2: rule__EvidenceNode__Group__0__Impl rule__EvidenceNode__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EvidenceNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__0"


    // $ANTLR start "rule__EvidenceNode__Group__0__Impl"
    // InternalQms.g:1188:1: rule__EvidenceNode__Group__0__Impl : ( 'evi' ) ;
    public final void rule__EvidenceNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1192:1: ( ( 'evi' ) )
            // InternalQms.g:1193:1: ( 'evi' )
            {
            // InternalQms.g:1193:1: ( 'evi' )
            // InternalQms.g:1194:2: 'evi'
            {
             before(grammarAccess.getEvidenceNodeAccess().getEviKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvidenceNodeAccess().getEviKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__0__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__1"
    // InternalQms.g:1203:1: rule__EvidenceNode__Group__1 : rule__EvidenceNode__Group__1__Impl rule__EvidenceNode__Group__2 ;
    public final void rule__EvidenceNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1207:1: ( rule__EvidenceNode__Group__1__Impl rule__EvidenceNode__Group__2 )
            // InternalQms.g:1208:2: rule__EvidenceNode__Group__1__Impl rule__EvidenceNode__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EvidenceNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__1"


    // $ANTLR start "rule__EvidenceNode__Group__1__Impl"
    // InternalQms.g:1215:1: rule__EvidenceNode__Group__1__Impl : ( ( rule__EvidenceNode__NameAssignment_1 ) ) ;
    public final void rule__EvidenceNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1219:1: ( ( ( rule__EvidenceNode__NameAssignment_1 ) ) )
            // InternalQms.g:1220:1: ( ( rule__EvidenceNode__NameAssignment_1 ) )
            {
            // InternalQms.g:1220:1: ( ( rule__EvidenceNode__NameAssignment_1 ) )
            // InternalQms.g:1221:2: ( rule__EvidenceNode__NameAssignment_1 )
            {
             before(grammarAccess.getEvidenceNodeAccess().getNameAssignment_1()); 
            // InternalQms.g:1222:2: ( rule__EvidenceNode__NameAssignment_1 )
            // InternalQms.g:1222:3: rule__EvidenceNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EvidenceNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEvidenceNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__1__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__2"
    // InternalQms.g:1230:1: rule__EvidenceNode__Group__2 : rule__EvidenceNode__Group__2__Impl rule__EvidenceNode__Group__3 ;
    public final void rule__EvidenceNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1234:1: ( rule__EvidenceNode__Group__2__Impl rule__EvidenceNode__Group__3 )
            // InternalQms.g:1235:2: rule__EvidenceNode__Group__2__Impl rule__EvidenceNode__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__EvidenceNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__2"


    // $ANTLR start "rule__EvidenceNode__Group__2__Impl"
    // InternalQms.g:1242:1: rule__EvidenceNode__Group__2__Impl : ( '{' ) ;
    public final void rule__EvidenceNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1246:1: ( ( '{' ) )
            // InternalQms.g:1247:1: ( '{' )
            {
            // InternalQms.g:1247:1: ( '{' )
            // InternalQms.g:1248:2: '{'
            {
             before(grammarAccess.getEvidenceNodeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvidenceNodeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__2__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__3"
    // InternalQms.g:1257:1: rule__EvidenceNode__Group__3 : rule__EvidenceNode__Group__3__Impl rule__EvidenceNode__Group__4 ;
    public final void rule__EvidenceNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1261:1: ( rule__EvidenceNode__Group__3__Impl rule__EvidenceNode__Group__4 )
            // InternalQms.g:1262:2: rule__EvidenceNode__Group__3__Impl rule__EvidenceNode__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__EvidenceNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__3"


    // $ANTLR start "rule__EvidenceNode__Group__3__Impl"
    // InternalQms.g:1269:1: rule__EvidenceNode__Group__3__Impl : ( ( rule__EvidenceNode__Group_3__0 )? ) ;
    public final void rule__EvidenceNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1273:1: ( ( ( rule__EvidenceNode__Group_3__0 )? ) )
            // InternalQms.g:1274:1: ( ( rule__EvidenceNode__Group_3__0 )? )
            {
            // InternalQms.g:1274:1: ( ( rule__EvidenceNode__Group_3__0 )? )
            // InternalQms.g:1275:2: ( rule__EvidenceNode__Group_3__0 )?
            {
             before(grammarAccess.getEvidenceNodeAccess().getGroup_3()); 
            // InternalQms.g:1276:2: ( rule__EvidenceNode__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQms.g:1276:3: rule__EvidenceNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvidenceNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvidenceNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__3__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__4"
    // InternalQms.g:1284:1: rule__EvidenceNode__Group__4 : rule__EvidenceNode__Group__4__Impl rule__EvidenceNode__Group__5 ;
    public final void rule__EvidenceNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1288:1: ( rule__EvidenceNode__Group__4__Impl rule__EvidenceNode__Group__5 )
            // InternalQms.g:1289:2: rule__EvidenceNode__Group__4__Impl rule__EvidenceNode__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__EvidenceNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__4"


    // $ANTLR start "rule__EvidenceNode__Group__4__Impl"
    // InternalQms.g:1296:1: rule__EvidenceNode__Group__4__Impl : ( ( rule__EvidenceNode__BodyAssignment_4 )* ) ;
    public final void rule__EvidenceNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1300:1: ( ( ( rule__EvidenceNode__BodyAssignment_4 )* ) )
            // InternalQms.g:1301:1: ( ( rule__EvidenceNode__BodyAssignment_4 )* )
            {
            // InternalQms.g:1301:1: ( ( rule__EvidenceNode__BodyAssignment_4 )* )
            // InternalQms.g:1302:2: ( rule__EvidenceNode__BodyAssignment_4 )*
            {
             before(grammarAccess.getEvidenceNodeAccess().getBodyAssignment_4()); 
            // InternalQms.g:1303:2: ( rule__EvidenceNode__BodyAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=24 && LA13_0<=25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQms.g:1303:3: rule__EvidenceNode__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EvidenceNode__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEvidenceNodeAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__4__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__5"
    // InternalQms.g:1311:1: rule__EvidenceNode__Group__5 : rule__EvidenceNode__Group__5__Impl rule__EvidenceNode__Group__6 ;
    public final void rule__EvidenceNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1315:1: ( rule__EvidenceNode__Group__5__Impl rule__EvidenceNode__Group__6 )
            // InternalQms.g:1316:2: rule__EvidenceNode__Group__5__Impl rule__EvidenceNode__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__EvidenceNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__5"


    // $ANTLR start "rule__EvidenceNode__Group__5__Impl"
    // InternalQms.g:1323:1: rule__EvidenceNode__Group__5__Impl : ( ( rule__EvidenceNode__ChildrenAssignment_5 )* ) ;
    public final void rule__EvidenceNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1327:1: ( ( ( rule__EvidenceNode__ChildrenAssignment_5 )* ) )
            // InternalQms.g:1328:1: ( ( rule__EvidenceNode__ChildrenAssignment_5 )* )
            {
            // InternalQms.g:1328:1: ( ( rule__EvidenceNode__ChildrenAssignment_5 )* )
            // InternalQms.g:1329:2: ( rule__EvidenceNode__ChildrenAssignment_5 )*
            {
             before(grammarAccess.getEvidenceNodeAccess().getChildrenAssignment_5()); 
            // InternalQms.g:1330:2: ( rule__EvidenceNode__ChildrenAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQms.g:1330:3: rule__EvidenceNode__ChildrenAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__EvidenceNode__ChildrenAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEvidenceNodeAccess().getChildrenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__5__Impl"


    // $ANTLR start "rule__EvidenceNode__Group__6"
    // InternalQms.g:1338:1: rule__EvidenceNode__Group__6 : rule__EvidenceNode__Group__6__Impl ;
    public final void rule__EvidenceNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1342:1: ( rule__EvidenceNode__Group__6__Impl )
            // InternalQms.g:1343:2: rule__EvidenceNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__6"


    // $ANTLR start "rule__EvidenceNode__Group__6__Impl"
    // InternalQms.g:1349:1: rule__EvidenceNode__Group__6__Impl : ( '}' ) ;
    public final void rule__EvidenceNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1353:1: ( ( '}' ) )
            // InternalQms.g:1354:1: ( '}' )
            {
            // InternalQms.g:1354:1: ( '}' )
            // InternalQms.g:1355:2: '}'
            {
             before(grammarAccess.getEvidenceNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvidenceNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group__6__Impl"


    // $ANTLR start "rule__EvidenceNode__Group_3__0"
    // InternalQms.g:1365:1: rule__EvidenceNode__Group_3__0 : rule__EvidenceNode__Group_3__0__Impl rule__EvidenceNode__Group_3__1 ;
    public final void rule__EvidenceNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1369:1: ( rule__EvidenceNode__Group_3__0__Impl rule__EvidenceNode__Group_3__1 )
            // InternalQms.g:1370:2: rule__EvidenceNode__Group_3__0__Impl rule__EvidenceNode__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__EvidenceNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group_3__0"


    // $ANTLR start "rule__EvidenceNode__Group_3__0__Impl"
    // InternalQms.g:1377:1: rule__EvidenceNode__Group_3__0__Impl : ( 'title' ) ;
    public final void rule__EvidenceNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1381:1: ( ( 'title' ) )
            // InternalQms.g:1382:1: ( 'title' )
            {
            // InternalQms.g:1382:1: ( 'title' )
            // InternalQms.g:1383:2: 'title'
            {
             before(grammarAccess.getEvidenceNodeAccess().getTitleKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvidenceNodeAccess().getTitleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group_3__0__Impl"


    // $ANTLR start "rule__EvidenceNode__Group_3__1"
    // InternalQms.g:1392:1: rule__EvidenceNode__Group_3__1 : rule__EvidenceNode__Group_3__1__Impl ;
    public final void rule__EvidenceNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1396:1: ( rule__EvidenceNode__Group_3__1__Impl )
            // InternalQms.g:1397:2: rule__EvidenceNode__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvidenceNode__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group_3__1"


    // $ANTLR start "rule__EvidenceNode__Group_3__1__Impl"
    // InternalQms.g:1403:1: rule__EvidenceNode__Group_3__1__Impl : ( ( rule__EvidenceNode__TitleAssignment_3_1 ) ) ;
    public final void rule__EvidenceNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1407:1: ( ( ( rule__EvidenceNode__TitleAssignment_3_1 ) ) )
            // InternalQms.g:1408:1: ( ( rule__EvidenceNode__TitleAssignment_3_1 ) )
            {
            // InternalQms.g:1408:1: ( ( rule__EvidenceNode__TitleAssignment_3_1 ) )
            // InternalQms.g:1409:2: ( rule__EvidenceNode__TitleAssignment_3_1 )
            {
             before(grammarAccess.getEvidenceNodeAccess().getTitleAssignment_3_1()); 
            // InternalQms.g:1410:2: ( rule__EvidenceNode__TitleAssignment_3_1 )
            // InternalQms.g:1410:3: rule__EvidenceNode__TitleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvidenceNode__TitleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvidenceNodeAccess().getTitleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__Group_3__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalQms.g:1419:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1423:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalQms.g:1424:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalQms.g:1431:1: rule__Text__Group__0__Impl : ( 'text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1435:1: ( ( 'text' ) )
            // InternalQms.g:1436:1: ( 'text' )
            {
            // InternalQms.g:1436:1: ( 'text' )
            // InternalQms.g:1437:2: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalQms.g:1446:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1450:1: ( rule__Text__Group__1__Impl )
            // InternalQms.g:1451:2: rule__Text__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalQms.g:1457:1: rule__Text__Group__1__Impl : ( ( rule__Text__TextAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1461:1: ( ( ( rule__Text__TextAssignment_1 ) ) )
            // InternalQms.g:1462:1: ( ( rule__Text__TextAssignment_1 ) )
            {
            // InternalQms.g:1462:1: ( ( rule__Text__TextAssignment_1 ) )
            // InternalQms.g:1463:2: ( rule__Text__TextAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_1()); 
            // InternalQms.g:1464:2: ( rule__Text__TextAssignment_1 )
            // InternalQms.g:1464:3: rule__Text__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__NodeReference__Group__0"
    // InternalQms.g:1473:1: rule__NodeReference__Group__0 : rule__NodeReference__Group__0__Impl rule__NodeReference__Group__1 ;
    public final void rule__NodeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1477:1: ( rule__NodeReference__Group__0__Impl rule__NodeReference__Group__1 )
            // InternalQms.g:1478:2: rule__NodeReference__Group__0__Impl rule__NodeReference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NodeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NodeReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReference__Group__0"


    // $ANTLR start "rule__NodeReference__Group__0__Impl"
    // InternalQms.g:1485:1: rule__NodeReference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__NodeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1489:1: ( ( 'ref' ) )
            // InternalQms.g:1490:1: ( 'ref' )
            {
            // InternalQms.g:1490:1: ( 'ref' )
            // InternalQms.g:1491:2: 'ref'
            {
             before(grammarAccess.getNodeReferenceAccess().getRefKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNodeReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReference__Group__0__Impl"


    // $ANTLR start "rule__NodeReference__Group__1"
    // InternalQms.g:1500:1: rule__NodeReference__Group__1 : rule__NodeReference__Group__1__Impl ;
    public final void rule__NodeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1504:1: ( rule__NodeReference__Group__1__Impl )
            // InternalQms.g:1505:2: rule__NodeReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NodeReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReference__Group__1"


    // $ANTLR start "rule__NodeReference__Group__1__Impl"
    // InternalQms.g:1511:1: rule__NodeReference__Group__1__Impl : ( ( rule__NodeReference__RefAssignment_1 ) ) ;
    public final void rule__NodeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1515:1: ( ( ( rule__NodeReference__RefAssignment_1 ) ) )
            // InternalQms.g:1516:1: ( ( rule__NodeReference__RefAssignment_1 ) )
            {
            // InternalQms.g:1516:1: ( ( rule__NodeReference__RefAssignment_1 ) )
            // InternalQms.g:1517:2: ( rule__NodeReference__RefAssignment_1 )
            {
             before(grammarAccess.getNodeReferenceAccess().getRefAssignment_1()); 
            // InternalQms.g:1518:2: ( rule__NodeReference__RefAssignment_1 )
            // InternalQms.g:1518:3: rule__NodeReference__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NodeReference__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeReferenceAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReference__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalQms.g:1527:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1531:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalQms.g:1532:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalQms.g:1539:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1543:1: ( ( RULE_ID ) )
            // InternalQms.g:1544:1: ( RULE_ID )
            {
            // InternalQms.g:1544:1: ( RULE_ID )
            // InternalQms.g:1545:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalQms.g:1554:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1558:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalQms.g:1559:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalQms.g:1565:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1569:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalQms.g:1570:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalQms.g:1570:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalQms.g:1571:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalQms.g:1572:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQms.g:1572:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalQms.g:1581:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1585:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalQms.g:1586:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalQms.g:1593:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1597:1: ( ( '.' ) )
            // InternalQms.g:1598:1: ( '.' )
            {
            // InternalQms.g:1598:1: ( '.' )
            // InternalQms.g:1599:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalQms.g:1608:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1612:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalQms.g:1613:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalQms.g:1619:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1623:1: ( ( RULE_ID ) )
            // InternalQms.g:1624:1: ( RULE_ID )
            {
            // InternalQms.g:1624:1: ( RULE_ID )
            // InternalQms.g:1625:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Repository__NameAssignment_1"
    // InternalQms.g:1635:1: rule__Repository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Repository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1639:1: ( ( RULE_ID ) )
            // InternalQms.g:1640:2: ( RULE_ID )
            {
            // InternalQms.g:1640:2: ( RULE_ID )
            // InternalQms.g:1641:3: RULE_ID
            {
             before(grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__NameAssignment_1"


    // $ANTLR start "rule__Repository__TypeAssignment_3"
    // InternalQms.g:1650:1: rule__Repository__TypeAssignment_3 : ( ruleRepositoryType ) ;
    public final void rule__Repository__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1654:1: ( ( ruleRepositoryType ) )
            // InternalQms.g:1655:2: ( ruleRepositoryType )
            {
            // InternalQms.g:1655:2: ( ruleRepositoryType )
            // InternalQms.g:1656:3: ruleRepositoryType
            {
             before(grammarAccess.getRepositoryAccess().getTypeRepositoryTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRepositoryType();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getTypeRepositoryTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__TypeAssignment_3"


    // $ANTLR start "rule__Repository__RootAssignment_4"
    // InternalQms.g:1665:1: rule__Repository__RootAssignment_4 : ( ruleRepositoryNode ) ;
    public final void rule__Repository__RootAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1669:1: ( ( ruleRepositoryNode ) )
            // InternalQms.g:1670:2: ( ruleRepositoryNode )
            {
            // InternalQms.g:1670:2: ( ruleRepositoryNode )
            // InternalQms.g:1671:3: ruleRepositoryNode
            {
             before(grammarAccess.getRepositoryAccess().getRootRepositoryNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRepositoryNode();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getRootRepositoryNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__RootAssignment_4"


    // $ANTLR start "rule__RequirementNode__NameAssignment_1"
    // InternalQms.g:1680:1: rule__RequirementNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequirementNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1684:1: ( ( RULE_ID ) )
            // InternalQms.g:1685:2: ( RULE_ID )
            {
            // InternalQms.g:1685:2: ( RULE_ID )
            // InternalQms.g:1686:3: RULE_ID
            {
             before(grammarAccess.getRequirementNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__NameAssignment_1"


    // $ANTLR start "rule__RequirementNode__FormerNameAssignment_2_1"
    // InternalQms.g:1695:1: rule__RequirementNode__FormerNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__RequirementNode__FormerNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1699:1: ( ( RULE_ID ) )
            // InternalQms.g:1700:2: ( RULE_ID )
            {
            // InternalQms.g:1700:2: ( RULE_ID )
            // InternalQms.g:1701:3: RULE_ID
            {
             before(grammarAccess.getRequirementNodeAccess().getFormerNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getFormerNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__FormerNameAssignment_2_1"


    // $ANTLR start "rule__RequirementNode__TitleAssignment_4_1"
    // InternalQms.g:1710:1: rule__RequirementNode__TitleAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__RequirementNode__TitleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1714:1: ( ( RULE_STRING ) )
            // InternalQms.g:1715:2: ( RULE_STRING )
            {
            // InternalQms.g:1715:2: ( RULE_STRING )
            // InternalQms.g:1716:3: RULE_STRING
            {
             before(grammarAccess.getRequirementNodeAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRequirementNodeAccess().getTitleSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__TitleAssignment_4_1"


    // $ANTLR start "rule__RequirementNode__BodyAssignment_5"
    // InternalQms.g:1725:1: rule__RequirementNode__BodyAssignment_5 : ( ruleNodeBodyElement ) ;
    public final void rule__RequirementNode__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1729:1: ( ( ruleNodeBodyElement ) )
            // InternalQms.g:1730:2: ( ruleNodeBodyElement )
            {
            // InternalQms.g:1730:2: ( ruleNodeBodyElement )
            // InternalQms.g:1731:3: ruleNodeBodyElement
            {
             before(grammarAccess.getRequirementNodeAccess().getBodyNodeBodyElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeBodyElement();

            state._fsp--;

             after(grammarAccess.getRequirementNodeAccess().getBodyNodeBodyElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__BodyAssignment_5"


    // $ANTLR start "rule__RequirementNode__ChildrenAssignment_6"
    // InternalQms.g:1740:1: rule__RequirementNode__ChildrenAssignment_6 : ( ruleRequirementNode ) ;
    public final void rule__RequirementNode__ChildrenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1744:1: ( ( ruleRequirementNode ) )
            // InternalQms.g:1745:2: ( ruleRequirementNode )
            {
            // InternalQms.g:1745:2: ( ruleRequirementNode )
            // InternalQms.g:1746:3: ruleRequirementNode
            {
             before(grammarAccess.getRequirementNodeAccess().getChildrenRequirementNodeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirementNode();

            state._fsp--;

             after(grammarAccess.getRequirementNodeAccess().getChildrenRequirementNodeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequirementNode__ChildrenAssignment_6"


    // $ANTLR start "rule__BomNode__NameAssignment_1"
    // InternalQms.g:1755:1: rule__BomNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BomNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1759:1: ( ( RULE_ID ) )
            // InternalQms.g:1760:2: ( RULE_ID )
            {
            // InternalQms.g:1760:2: ( RULE_ID )
            // InternalQms.g:1761:3: RULE_ID
            {
             before(grammarAccess.getBomNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__NameAssignment_1"


    // $ANTLR start "rule__BomNode__TitleAssignment_3_1"
    // InternalQms.g:1770:1: rule__BomNode__TitleAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__BomNode__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1774:1: ( ( RULE_STRING ) )
            // InternalQms.g:1775:2: ( RULE_STRING )
            {
            // InternalQms.g:1775:2: ( RULE_STRING )
            // InternalQms.g:1776:3: RULE_STRING
            {
             before(grammarAccess.getBomNodeAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__TitleAssignment_3_1"


    // $ANTLR start "rule__BomNode__BodyAssignment_4"
    // InternalQms.g:1785:1: rule__BomNode__BodyAssignment_4 : ( ruleNodeBodyElement ) ;
    public final void rule__BomNode__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1789:1: ( ( ruleNodeBodyElement ) )
            // InternalQms.g:1790:2: ( ruleNodeBodyElement )
            {
            // InternalQms.g:1790:2: ( ruleNodeBodyElement )
            // InternalQms.g:1791:3: ruleNodeBodyElement
            {
             before(grammarAccess.getBomNodeAccess().getBodyNodeBodyElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeBodyElement();

            state._fsp--;

             after(grammarAccess.getBomNodeAccess().getBodyNodeBodyElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__BodyAssignment_4"


    // $ANTLR start "rule__BomNode__WeightAssignment_6"
    // InternalQms.g:1800:1: rule__BomNode__WeightAssignment_6 : ( RULE_INT ) ;
    public final void rule__BomNode__WeightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1804:1: ( ( RULE_INT ) )
            // InternalQms.g:1805:2: ( RULE_INT )
            {
            // InternalQms.g:1805:2: ( RULE_INT )
            // InternalQms.g:1806:3: RULE_INT
            {
             before(grammarAccess.getBomNodeAccess().getWeightINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBomNodeAccess().getWeightINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__WeightAssignment_6"


    // $ANTLR start "rule__BomNode__ChildrenAssignment_7"
    // InternalQms.g:1815:1: rule__BomNode__ChildrenAssignment_7 : ( ruleBomNode ) ;
    public final void rule__BomNode__ChildrenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1819:1: ( ( ruleBomNode ) )
            // InternalQms.g:1820:2: ( ruleBomNode )
            {
            // InternalQms.g:1820:2: ( ruleBomNode )
            // InternalQms.g:1821:3: ruleBomNode
            {
             before(grammarAccess.getBomNodeAccess().getChildrenBomNodeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBomNode();

            state._fsp--;

             after(grammarAccess.getBomNodeAccess().getChildrenBomNodeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BomNode__ChildrenAssignment_7"


    // $ANTLR start "rule__EvidenceNode__NameAssignment_1"
    // InternalQms.g:1830:1: rule__EvidenceNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EvidenceNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1834:1: ( ( RULE_ID ) )
            // InternalQms.g:1835:2: ( RULE_ID )
            {
            // InternalQms.g:1835:2: ( RULE_ID )
            // InternalQms.g:1836:3: RULE_ID
            {
             before(grammarAccess.getEvidenceNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEvidenceNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__NameAssignment_1"


    // $ANTLR start "rule__EvidenceNode__TitleAssignment_3_1"
    // InternalQms.g:1845:1: rule__EvidenceNode__TitleAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__EvidenceNode__TitleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1849:1: ( ( RULE_STRING ) )
            // InternalQms.g:1850:2: ( RULE_STRING )
            {
            // InternalQms.g:1850:2: ( RULE_STRING )
            // InternalQms.g:1851:3: RULE_STRING
            {
             before(grammarAccess.getEvidenceNodeAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEvidenceNodeAccess().getTitleSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__TitleAssignment_3_1"


    // $ANTLR start "rule__EvidenceNode__BodyAssignment_4"
    // InternalQms.g:1860:1: rule__EvidenceNode__BodyAssignment_4 : ( ruleNodeBodyElement ) ;
    public final void rule__EvidenceNode__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1864:1: ( ( ruleNodeBodyElement ) )
            // InternalQms.g:1865:2: ( ruleNodeBodyElement )
            {
            // InternalQms.g:1865:2: ( ruleNodeBodyElement )
            // InternalQms.g:1866:3: ruleNodeBodyElement
            {
             before(grammarAccess.getEvidenceNodeAccess().getBodyNodeBodyElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNodeBodyElement();

            state._fsp--;

             after(grammarAccess.getEvidenceNodeAccess().getBodyNodeBodyElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__BodyAssignment_4"


    // $ANTLR start "rule__EvidenceNode__ChildrenAssignment_5"
    // InternalQms.g:1875:1: rule__EvidenceNode__ChildrenAssignment_5 : ( ruleEvidenceNode ) ;
    public final void rule__EvidenceNode__ChildrenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1879:1: ( ( ruleEvidenceNode ) )
            // InternalQms.g:1880:2: ( ruleEvidenceNode )
            {
            // InternalQms.g:1880:2: ( ruleEvidenceNode )
            // InternalQms.g:1881:3: ruleEvidenceNode
            {
             before(grammarAccess.getEvidenceNodeAccess().getChildrenEvidenceNodeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEvidenceNode();

            state._fsp--;

             after(grammarAccess.getEvidenceNodeAccess().getChildrenEvidenceNodeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvidenceNode__ChildrenAssignment_5"


    // $ANTLR start "rule__Text__TextAssignment_1"
    // InternalQms.g:1890:1: rule__Text__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1894:1: ( ( RULE_STRING ) )
            // InternalQms.g:1895:2: ( RULE_STRING )
            {
            // InternalQms.g:1895:2: ( RULE_STRING )
            // InternalQms.g:1896:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_1"


    // $ANTLR start "rule__NodeReference__RefAssignment_1"
    // InternalQms.g:1905:1: rule__NodeReference__RefAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__NodeReference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQms.g:1909:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQms.g:1910:2: ( ( ruleQualifiedName ) )
            {
            // InternalQms.g:1910:2: ( ( ruleQualifiedName ) )
            // InternalQms.g:1911:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getNodeReferenceAccess().getRefRepositoryNodeCrossReference_1_0()); 
            // InternalQms.g:1912:3: ( ruleQualifiedName )
            // InternalQms.g:1913:4: ruleQualifiedName
            {
             before(grammarAccess.getNodeReferenceAccess().getRefRepositoryNodeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNodeReferenceAccess().getRefRepositoryNodeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNodeReferenceAccess().getRefRepositoryNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeReference__RefAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000824000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000032A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000008A4000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000824002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003A80000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});

}