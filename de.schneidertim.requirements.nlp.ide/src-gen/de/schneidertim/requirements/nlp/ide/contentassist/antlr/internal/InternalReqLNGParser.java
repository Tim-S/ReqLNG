package de.schneidertim.requirements.nlp.ide.contentassist.antlr.internal;

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
import de.schneidertim.requirements.nlp.services.ReqLNGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLNGParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'If'", "'To'", "'to'", "'A'", "'a'", "'the'", "'The'", "'.'", "'!'", "'?'", "'shall'", "'should'", "'will'", "'Actor'", "':'", "'System'", "'Description'", "'Glossary'", "'Function'", "'Synonyms'", "','", "'Object'", "'provide'", "'with'", "'ability'"
    };
    public static final int RULE_WORD=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReqLNGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqLNGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqLNGParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReqLNG.g"; }


    	private ReqLNGGrammarAccess grammarAccess;

    	public void setGrammarAccess(ReqLNGGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRequirementDocument"
    // InternalReqLNG.g:53:1: entryRuleRequirementDocument : ruleRequirementDocument EOF ;
    public final void entryRuleRequirementDocument() throws RecognitionException {
        try {
            // InternalReqLNG.g:54:1: ( ruleRequirementDocument EOF )
            // InternalReqLNG.g:55:1: ruleRequirementDocument EOF
            {
             before(grammarAccess.getRequirementDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirementDocument();

            state._fsp--;

             after(grammarAccess.getRequirementDocumentRule()); 
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
    // $ANTLR end "entryRuleRequirementDocument"


    // $ANTLR start "ruleRequirementDocument"
    // InternalReqLNG.g:62:1: ruleRequirementDocument : ( ( rule__RequirementDocument__Group__0 ) ) ;
    public final void ruleRequirementDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:66:2: ( ( ( rule__RequirementDocument__Group__0 ) ) )
            // InternalReqLNG.g:67:2: ( ( rule__RequirementDocument__Group__0 ) )
            {
            // InternalReqLNG.g:67:2: ( ( rule__RequirementDocument__Group__0 ) )
            // InternalReqLNG.g:68:3: ( rule__RequirementDocument__Group__0 )
            {
             before(grammarAccess.getRequirementDocumentAccess().getGroup()); 
            // InternalReqLNG.g:69:3: ( rule__RequirementDocument__Group__0 )
            // InternalReqLNG.g:69:4: rule__RequirementDocument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequirementDocument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementDocumentAccess().getGroup()); 

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
    // $ANTLR end "ruleRequirementDocument"


    // $ANTLR start "entryRuleEntity"
    // InternalReqLNG.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalReqLNG.g:79:1: ( ruleEntity EOF )
            // InternalReqLNG.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalReqLNG.g:87:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:91:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalReqLNG.g:92:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalReqLNG.g:92:2: ( ( rule__Entity__Alternatives ) )
            // InternalReqLNG.g:93:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalReqLNG.g:94:3: ( rule__Entity__Alternatives )
            // InternalReqLNG.g:94:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleActor"
    // InternalReqLNG.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalReqLNG.g:104:1: ( ruleActor EOF )
            // InternalReqLNG.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalReqLNG.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalReqLNG.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalReqLNG.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalReqLNG.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalReqLNG.g:119:3: ( rule__Actor__Group__0 )
            // InternalReqLNG.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleSystem"
    // InternalReqLNG.g:128:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalReqLNG.g:129:1: ( ruleSystem EOF )
            // InternalReqLNG.g:130:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalReqLNG.g:137:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:141:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalReqLNG.g:142:2: ( ( rule__System__Group__0 ) )
            {
            // InternalReqLNG.g:142:2: ( ( rule__System__Group__0 ) )
            // InternalReqLNG.g:143:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalReqLNG.g:144:3: ( rule__System__Group__0 )
            // InternalReqLNG.g:144:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDescription"
    // InternalReqLNG.g:153:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalReqLNG.g:154:1: ( ruleDescription EOF )
            // InternalReqLNG.g:155:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalReqLNG.g:162:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:166:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalReqLNG.g:167:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalReqLNG.g:167:2: ( ( rule__Description__Group__0 ) )
            // InternalReqLNG.g:168:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalReqLNG.g:169:3: ( rule__Description__Group__0 )
            // InternalReqLNG.g:169:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleText"
    // InternalReqLNG.g:178:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalReqLNG.g:179:1: ( ruleText EOF )
            // InternalReqLNG.g:180:1: ruleText EOF
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
    // InternalReqLNG.g:187:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:191:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // InternalReqLNG.g:192:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // InternalReqLNG.g:192:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // InternalReqLNG.g:193:3: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // InternalReqLNG.g:193:3: ( ( rule__Text__Alternatives ) )
            // InternalReqLNG.g:194:4: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalReqLNG.g:195:4: ( rule__Text__Alternatives )
            // InternalReqLNG.g:195:5: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // InternalReqLNG.g:198:3: ( ( rule__Text__Alternatives )* )
            // InternalReqLNG.g:199:4: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalReqLNG.g:200:4: ( rule__Text__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=13 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqLNG.g:200:5: rule__Text__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Text__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }


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


    // $ANTLR start "entryRuleSentenceWithReferences"
    // InternalReqLNG.g:210:1: entryRuleSentenceWithReferences : ruleSentenceWithReferences EOF ;
    public final void entryRuleSentenceWithReferences() throws RecognitionException {
        try {
            // InternalReqLNG.g:211:1: ( ruleSentenceWithReferences EOF )
            // InternalReqLNG.g:212:1: ruleSentenceWithReferences EOF
            {
             before(grammarAccess.getSentenceWithReferencesRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceWithReferences();

            state._fsp--;

             after(grammarAccess.getSentenceWithReferencesRule()); 
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
    // $ANTLR end "entryRuleSentenceWithReferences"


    // $ANTLR start "ruleSentenceWithReferences"
    // InternalReqLNG.g:219:1: ruleSentenceWithReferences : ( ( rule__SentenceWithReferences__Group__0 ) ) ;
    public final void ruleSentenceWithReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:223:2: ( ( ( rule__SentenceWithReferences__Group__0 ) ) )
            // InternalReqLNG.g:224:2: ( ( rule__SentenceWithReferences__Group__0 ) )
            {
            // InternalReqLNG.g:224:2: ( ( rule__SentenceWithReferences__Group__0 ) )
            // InternalReqLNG.g:225:3: ( rule__SentenceWithReferences__Group__0 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getGroup()); 
            // InternalReqLNG.g:226:3: ( rule__SentenceWithReferences__Group__0 )
            // InternalReqLNG.g:226:4: rule__SentenceWithReferences__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SentenceWithReferences__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceWithReferencesAccess().getGroup()); 

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
    // $ANTLR end "ruleSentenceWithReferences"


    // $ANTLR start "entryRuleTextWithReferences"
    // InternalReqLNG.g:235:1: entryRuleTextWithReferences : ruleTextWithReferences EOF ;
    public final void entryRuleTextWithReferences() throws RecognitionException {
        try {
            // InternalReqLNG.g:236:1: ( ruleTextWithReferences EOF )
            // InternalReqLNG.g:237:1: ruleTextWithReferences EOF
            {
             before(grammarAccess.getTextWithReferencesRule()); 
            pushFollow(FOLLOW_1);
            ruleTextWithReferences();

            state._fsp--;

             after(grammarAccess.getTextWithReferencesRule()); 
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
    // $ANTLR end "entryRuleTextWithReferences"


    // $ANTLR start "ruleTextWithReferences"
    // InternalReqLNG.g:244:1: ruleTextWithReferences : ( ( rule__TextWithReferences__Alternatives ) ) ;
    public final void ruleTextWithReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:248:2: ( ( ( rule__TextWithReferences__Alternatives ) ) )
            // InternalReqLNG.g:249:2: ( ( rule__TextWithReferences__Alternatives ) )
            {
            // InternalReqLNG.g:249:2: ( ( rule__TextWithReferences__Alternatives ) )
            // InternalReqLNG.g:250:3: ( rule__TextWithReferences__Alternatives )
            {
             before(grammarAccess.getTextWithReferencesAccess().getAlternatives()); 
            // InternalReqLNG.g:251:3: ( rule__TextWithReferences__Alternatives )
            // InternalReqLNG.g:251:4: rule__TextWithReferences__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextWithReferences__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextWithReferencesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTextWithReferences"


    // $ANTLR start "entryRuleReferenceCombination"
    // InternalReqLNG.g:260:1: entryRuleReferenceCombination : ruleReferenceCombination EOF ;
    public final void entryRuleReferenceCombination() throws RecognitionException {
        try {
            // InternalReqLNG.g:261:1: ( ruleReferenceCombination EOF )
            // InternalReqLNG.g:262:1: ruleReferenceCombination EOF
            {
             before(grammarAccess.getReferenceCombinationRule()); 
            pushFollow(FOLLOW_1);
            ruleReferenceCombination();

            state._fsp--;

             after(grammarAccess.getReferenceCombinationRule()); 
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
    // $ANTLR end "entryRuleReferenceCombination"


    // $ANTLR start "ruleReferenceCombination"
    // InternalReqLNG.g:269:1: ruleReferenceCombination : ( ( rule__ReferenceCombination__Group__0 ) ) ;
    public final void ruleReferenceCombination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:273:2: ( ( ( rule__ReferenceCombination__Group__0 ) ) )
            // InternalReqLNG.g:274:2: ( ( rule__ReferenceCombination__Group__0 ) )
            {
            // InternalReqLNG.g:274:2: ( ( rule__ReferenceCombination__Group__0 ) )
            // InternalReqLNG.g:275:3: ( rule__ReferenceCombination__Group__0 )
            {
             before(grammarAccess.getReferenceCombinationAccess().getGroup()); 
            // InternalReqLNG.g:276:3: ( rule__ReferenceCombination__Group__0 )
            // InternalReqLNG.g:276:4: rule__ReferenceCombination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCombination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceCombinationAccess().getGroup()); 

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
    // $ANTLR end "ruleReferenceCombination"


    // $ANTLR start "entryRuleRequirement"
    // InternalReqLNG.g:285:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalReqLNG.g:286:1: ( ruleRequirement EOF )
            // InternalReqLNG.g:287:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalReqLNG.g:294:1: ruleRequirement : ( ( rule__Requirement__Alternatives ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:298:2: ( ( ( rule__Requirement__Alternatives ) ) )
            // InternalReqLNG.g:299:2: ( ( rule__Requirement__Alternatives ) )
            {
            // InternalReqLNG.g:299:2: ( ( rule__Requirement__Alternatives ) )
            // InternalReqLNG.g:300:3: ( rule__Requirement__Alternatives )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives()); 
            // InternalReqLNG.g:301:3: ( rule__Requirement__Alternatives )
            // InternalReqLNG.g:301:4: rule__Requirement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleConditionalRequirement"
    // InternalReqLNG.g:310:1: entryRuleConditionalRequirement : ruleConditionalRequirement EOF ;
    public final void entryRuleConditionalRequirement() throws RecognitionException {
        try {
            // InternalReqLNG.g:311:1: ( ruleConditionalRequirement EOF )
            // InternalReqLNG.g:312:1: ruleConditionalRequirement EOF
            {
             before(grammarAccess.getConditionalRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalRequirement();

            state._fsp--;

             after(grammarAccess.getConditionalRequirementRule()); 
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
    // $ANTLR end "entryRuleConditionalRequirement"


    // $ANTLR start "ruleConditionalRequirement"
    // InternalReqLNG.g:319:1: ruleConditionalRequirement : ( ( rule__ConditionalRequirement__Group__0 ) ) ;
    public final void ruleConditionalRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:323:2: ( ( ( rule__ConditionalRequirement__Group__0 ) ) )
            // InternalReqLNG.g:324:2: ( ( rule__ConditionalRequirement__Group__0 ) )
            {
            // InternalReqLNG.g:324:2: ( ( rule__ConditionalRequirement__Group__0 ) )
            // InternalReqLNG.g:325:3: ( rule__ConditionalRequirement__Group__0 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getGroup()); 
            // InternalReqLNG.g:326:3: ( rule__ConditionalRequirement__Group__0 )
            // InternalReqLNG.g:326:4: rule__ConditionalRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRequirementAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalRequirement"


    // $ANTLR start "entryRuleUnconditionalRequirement"
    // InternalReqLNG.g:335:1: entryRuleUnconditionalRequirement : ruleUnconditionalRequirement EOF ;
    public final void entryRuleUnconditionalRequirement() throws RecognitionException {
        try {
            // InternalReqLNG.g:336:1: ( ruleUnconditionalRequirement EOF )
            // InternalReqLNG.g:337:1: ruleUnconditionalRequirement EOF
            {
             before(grammarAccess.getUnconditionalRequirementRule()); 
            pushFollow(FOLLOW_1);
            ruleUnconditionalRequirement();

            state._fsp--;

             after(grammarAccess.getUnconditionalRequirementRule()); 
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
    // $ANTLR end "entryRuleUnconditionalRequirement"


    // $ANTLR start "ruleUnconditionalRequirement"
    // InternalReqLNG.g:344:1: ruleUnconditionalRequirement : ( ( rule__UnconditionalRequirement__Group__0 ) ) ;
    public final void ruleUnconditionalRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:348:2: ( ( ( rule__UnconditionalRequirement__Group__0 ) ) )
            // InternalReqLNG.g:349:2: ( ( rule__UnconditionalRequirement__Group__0 ) )
            {
            // InternalReqLNG.g:349:2: ( ( rule__UnconditionalRequirement__Group__0 ) )
            // InternalReqLNG.g:350:3: ( rule__UnconditionalRequirement__Group__0 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getGroup()); 
            // InternalReqLNG.g:351:3: ( rule__UnconditionalRequirement__Group__0 )
            // InternalReqLNG.g:351:4: rule__UnconditionalRequirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRequirementAccess().getGroup()); 

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
    // $ANTLR end "ruleUnconditionalRequirement"


    // $ANTLR start "entryRulePrecondition"
    // InternalReqLNG.g:360:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalReqLNG.g:361:1: ( rulePrecondition EOF )
            // InternalReqLNG.g:362:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalReqLNG.g:369:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:373:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalReqLNG.g:374:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalReqLNG.g:374:2: ( ( rule__Precondition__Group__0 ) )
            // InternalReqLNG.g:375:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalReqLNG.g:376:3: ( rule__Precondition__Group__0 )
            // InternalReqLNG.g:376:4: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRuleConditional"
    // InternalReqLNG.g:385:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalReqLNG.g:386:1: ( ruleConditional EOF )
            // InternalReqLNG.g:387:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalReqLNG.g:394:1: ruleConditional : ( 'If' ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:398:2: ( ( 'If' ) )
            // InternalReqLNG.g:399:2: ( 'If' )
            {
            // InternalReqLNG.g:399:2: ( 'If' )
            // InternalReqLNG.g:400:3: 'If'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getIfKeyword()); 

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleActorInteraction"
    // InternalReqLNG.g:410:1: entryRuleActorInteraction : ruleActorInteraction EOF ;
    public final void entryRuleActorInteraction() throws RecognitionException {
        try {
            // InternalReqLNG.g:411:1: ( ruleActorInteraction EOF )
            // InternalReqLNG.g:412:1: ruleActorInteraction EOF
            {
             before(grammarAccess.getActorInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleActorInteraction();

            state._fsp--;

             after(grammarAccess.getActorInteractionRule()); 
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
    // $ANTLR end "entryRuleActorInteraction"


    // $ANTLR start "ruleActorInteraction"
    // InternalReqLNG.g:419:1: ruleActorInteraction : ( ( rule__ActorInteraction__Group__0 ) ) ;
    public final void ruleActorInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:423:2: ( ( ( rule__ActorInteraction__Group__0 ) ) )
            // InternalReqLNG.g:424:2: ( ( rule__ActorInteraction__Group__0 ) )
            {
            // InternalReqLNG.g:424:2: ( ( rule__ActorInteraction__Group__0 ) )
            // InternalReqLNG.g:425:3: ( rule__ActorInteraction__Group__0 )
            {
             before(grammarAccess.getActorInteractionAccess().getGroup()); 
            // InternalReqLNG.g:426:3: ( rule__ActorInteraction__Group__0 )
            // InternalReqLNG.g:426:4: rule__ActorInteraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getGroup()); 

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
    // $ANTLR end "ruleActorInteraction"


    // $ANTLR start "entryRuleRequirementEnd"
    // InternalReqLNG.g:435:1: entryRuleRequirementEnd : ruleRequirementEnd EOF ;
    public final void entryRuleRequirementEnd() throws RecognitionException {
        try {
            // InternalReqLNG.g:436:1: ( ruleRequirementEnd EOF )
            // InternalReqLNG.g:437:1: ruleRequirementEnd EOF
            {
             before(grammarAccess.getRequirementEndRule()); 
            pushFollow(FOLLOW_1);
            ruleRequirementEnd();

            state._fsp--;

             after(grammarAccess.getRequirementEndRule()); 
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
    // $ANTLR end "entryRuleRequirementEnd"


    // $ANTLR start "ruleRequirementEnd"
    // InternalReqLNG.g:444:1: ruleRequirementEnd : ( ( rule__RequirementEnd__Group__0 ) ) ;
    public final void ruleRequirementEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:448:2: ( ( ( rule__RequirementEnd__Group__0 ) ) )
            // InternalReqLNG.g:449:2: ( ( rule__RequirementEnd__Group__0 ) )
            {
            // InternalReqLNG.g:449:2: ( ( rule__RequirementEnd__Group__0 ) )
            // InternalReqLNG.g:450:3: ( rule__RequirementEnd__Group__0 )
            {
             before(grammarAccess.getRequirementEndAccess().getGroup()); 
            // InternalReqLNG.g:451:3: ( rule__RequirementEnd__Group__0 )
            // InternalReqLNG.g:451:4: rule__RequirementEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequirementEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementEndAccess().getGroup()); 

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
    // $ANTLR end "ruleRequirementEnd"


    // $ANTLR start "entryRuleTextWithConceptsOrSynonyms"
    // InternalReqLNG.g:460:1: entryRuleTextWithConceptsOrSynonyms : ruleTextWithConceptsOrSynonyms EOF ;
    public final void entryRuleTextWithConceptsOrSynonyms() throws RecognitionException {
        try {
            // InternalReqLNG.g:461:1: ( ruleTextWithConceptsOrSynonyms EOF )
            // InternalReqLNG.g:462:1: ruleTextWithConceptsOrSynonyms EOF
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsRule()); 
            pushFollow(FOLLOW_1);
            ruleTextWithConceptsOrSynonyms();

            state._fsp--;

             after(grammarAccess.getTextWithConceptsOrSynonymsRule()); 
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
    // $ANTLR end "entryRuleTextWithConceptsOrSynonyms"


    // $ANTLR start "ruleTextWithConceptsOrSynonyms"
    // InternalReqLNG.g:469:1: ruleTextWithConceptsOrSynonyms : ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) ) ;
    public final void ruleTextWithConceptsOrSynonyms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:473:2: ( ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) ) )
            // InternalReqLNG.g:474:2: ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) )
            {
            // InternalReqLNG.g:474:2: ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) )
            // InternalReqLNG.g:475:3: ( rule__TextWithConceptsOrSynonyms__Alternatives )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAlternatives()); 
            // InternalReqLNG.g:476:3: ( rule__TextWithConceptsOrSynonyms__Alternatives )
            // InternalReqLNG.g:476:4: rule__TextWithConceptsOrSynonyms__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextWithConceptsOrSynonyms__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTextWithConceptsOrSynonyms"


    // $ANTLR start "entryRuleConceptCombination"
    // InternalReqLNG.g:485:1: entryRuleConceptCombination : ruleConceptCombination EOF ;
    public final void entryRuleConceptCombination() throws RecognitionException {
        try {
            // InternalReqLNG.g:486:1: ( ruleConceptCombination EOF )
            // InternalReqLNG.g:487:1: ruleConceptCombination EOF
            {
             before(grammarAccess.getConceptCombinationRule()); 
            pushFollow(FOLLOW_1);
            ruleConceptCombination();

            state._fsp--;

             after(grammarAccess.getConceptCombinationRule()); 
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
    // $ANTLR end "entryRuleConceptCombination"


    // $ANTLR start "ruleConceptCombination"
    // InternalReqLNG.g:494:1: ruleConceptCombination : ( ( rule__ConceptCombination__Group__0 ) ) ;
    public final void ruleConceptCombination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:498:2: ( ( ( rule__ConceptCombination__Group__0 ) ) )
            // InternalReqLNG.g:499:2: ( ( rule__ConceptCombination__Group__0 ) )
            {
            // InternalReqLNG.g:499:2: ( ( rule__ConceptCombination__Group__0 ) )
            // InternalReqLNG.g:500:3: ( rule__ConceptCombination__Group__0 )
            {
             before(grammarAccess.getConceptCombinationAccess().getGroup()); 
            // InternalReqLNG.g:501:3: ( rule__ConceptCombination__Group__0 )
            // InternalReqLNG.g:501:4: rule__ConceptCombination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConceptCombination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptCombinationAccess().getGroup()); 

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
    // $ANTLR end "ruleConceptCombination"


    // $ANTLR start "entryRuleGlossary"
    // InternalReqLNG.g:510:1: entryRuleGlossary : ruleGlossary EOF ;
    public final void entryRuleGlossary() throws RecognitionException {
        try {
            // InternalReqLNG.g:511:1: ( ruleGlossary EOF )
            // InternalReqLNG.g:512:1: ruleGlossary EOF
            {
             before(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_1);
            ruleGlossary();

            state._fsp--;

             after(grammarAccess.getGlossaryRule()); 
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
    // $ANTLR end "entryRuleGlossary"


    // $ANTLR start "ruleGlossary"
    // InternalReqLNG.g:519:1: ruleGlossary : ( ( rule__Glossary__Group__0 ) ) ;
    public final void ruleGlossary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:523:2: ( ( ( rule__Glossary__Group__0 ) ) )
            // InternalReqLNG.g:524:2: ( ( rule__Glossary__Group__0 ) )
            {
            // InternalReqLNG.g:524:2: ( ( rule__Glossary__Group__0 ) )
            // InternalReqLNG.g:525:3: ( rule__Glossary__Group__0 )
            {
             before(grammarAccess.getGlossaryAccess().getGroup()); 
            // InternalReqLNG.g:526:3: ( rule__Glossary__Group__0 )
            // InternalReqLNG.g:526:4: rule__Glossary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Glossary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlossaryAccess().getGroup()); 

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
    // $ANTLR end "ruleGlossary"


    // $ANTLR start "entryRuleConcept"
    // InternalReqLNG.g:535:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalReqLNG.g:536:1: ( ruleConcept EOF )
            // InternalReqLNG.g:537:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalReqLNG.g:544:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:548:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalReqLNG.g:549:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalReqLNG.g:549:2: ( ( rule__Concept__Alternatives ) )
            // InternalReqLNG.g:550:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalReqLNG.g:551:3: ( rule__Concept__Alternatives )
            // InternalReqLNG.g:551:4: rule__Concept__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleFunction"
    // InternalReqLNG.g:560:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalReqLNG.g:561:1: ( ruleFunction EOF )
            // InternalReqLNG.g:562:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalReqLNG.g:569:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:573:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalReqLNG.g:574:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalReqLNG.g:574:2: ( ( rule__Function__Group__0 ) )
            // InternalReqLNG.g:575:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalReqLNG.g:576:3: ( rule__Function__Group__0 )
            // InternalReqLNG.g:576:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDomainObject"
    // InternalReqLNG.g:585:1: entryRuleDomainObject : ruleDomainObject EOF ;
    public final void entryRuleDomainObject() throws RecognitionException {
        try {
            // InternalReqLNG.g:586:1: ( ruleDomainObject EOF )
            // InternalReqLNG.g:587:1: ruleDomainObject EOF
            {
             before(grammarAccess.getDomainObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainObject();

            state._fsp--;

             after(grammarAccess.getDomainObjectRule()); 
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
    // $ANTLR end "entryRuleDomainObject"


    // $ANTLR start "ruleDomainObject"
    // InternalReqLNG.g:594:1: ruleDomainObject : ( ( rule__DomainObject__Group__0 ) ) ;
    public final void ruleDomainObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:598:2: ( ( ( rule__DomainObject__Group__0 ) ) )
            // InternalReqLNG.g:599:2: ( ( rule__DomainObject__Group__0 ) )
            {
            // InternalReqLNG.g:599:2: ( ( rule__DomainObject__Group__0 ) )
            // InternalReqLNG.g:600:3: ( rule__DomainObject__Group__0 )
            {
             before(grammarAccess.getDomainObjectAccess().getGroup()); 
            // InternalReqLNG.g:601:3: ( rule__DomainObject__Group__0 )
            // InternalReqLNG.g:601:4: rule__DomainObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainObject"


    // $ANTLR start "entryRuleFunctionSynonym"
    // InternalReqLNG.g:610:1: entryRuleFunctionSynonym : ruleFunctionSynonym EOF ;
    public final void entryRuleFunctionSynonym() throws RecognitionException {
        try {
            // InternalReqLNG.g:611:1: ( ruleFunctionSynonym EOF )
            // InternalReqLNG.g:612:1: ruleFunctionSynonym EOF
            {
             before(grammarAccess.getFunctionSynonymRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionSynonym();

            state._fsp--;

             after(grammarAccess.getFunctionSynonymRule()); 
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
    // $ANTLR end "entryRuleFunctionSynonym"


    // $ANTLR start "ruleFunctionSynonym"
    // InternalReqLNG.g:619:1: ruleFunctionSynonym : ( ( rule__FunctionSynonym__NameAssignment ) ) ;
    public final void ruleFunctionSynonym() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:623:2: ( ( ( rule__FunctionSynonym__NameAssignment ) ) )
            // InternalReqLNG.g:624:2: ( ( rule__FunctionSynonym__NameAssignment ) )
            {
            // InternalReqLNG.g:624:2: ( ( rule__FunctionSynonym__NameAssignment ) )
            // InternalReqLNG.g:625:3: ( rule__FunctionSynonym__NameAssignment )
            {
             before(grammarAccess.getFunctionSynonymAccess().getNameAssignment()); 
            // InternalReqLNG.g:626:3: ( rule__FunctionSynonym__NameAssignment )
            // InternalReqLNG.g:626:4: rule__FunctionSynonym__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FunctionSynonym__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctionSynonymAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFunctionSynonym"


    // $ANTLR start "entryRuleDomainObjectSynonym"
    // InternalReqLNG.g:635:1: entryRuleDomainObjectSynonym : ruleDomainObjectSynonym EOF ;
    public final void entryRuleDomainObjectSynonym() throws RecognitionException {
        try {
            // InternalReqLNG.g:636:1: ( ruleDomainObjectSynonym EOF )
            // InternalReqLNG.g:637:1: ruleDomainObjectSynonym EOF
            {
             before(grammarAccess.getDomainObjectSynonymRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainObjectSynonym();

            state._fsp--;

             after(grammarAccess.getDomainObjectSynonymRule()); 
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
    // $ANTLR end "entryRuleDomainObjectSynonym"


    // $ANTLR start "ruleDomainObjectSynonym"
    // InternalReqLNG.g:644:1: ruleDomainObjectSynonym : ( ( rule__DomainObjectSynonym__NameAssignment ) ) ;
    public final void ruleDomainObjectSynonym() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:648:2: ( ( ( rule__DomainObjectSynonym__NameAssignment ) ) )
            // InternalReqLNG.g:649:2: ( ( rule__DomainObjectSynonym__NameAssignment ) )
            {
            // InternalReqLNG.g:649:2: ( ( rule__DomainObjectSynonym__NameAssignment ) )
            // InternalReqLNG.g:650:3: ( rule__DomainObjectSynonym__NameAssignment )
            {
             before(grammarAccess.getDomainObjectSynonymAccess().getNameAssignment()); 
            // InternalReqLNG.g:651:3: ( rule__DomainObjectSynonym__NameAssignment )
            // InternalReqLNG.g:651:4: rule__DomainObjectSynonym__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DomainObjectSynonym__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectSynonymAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleDomainObjectSynonym"


    // $ANTLR start "ruleLiability"
    // InternalReqLNG.g:660:1: ruleLiability : ( ( rule__Liability__Alternatives ) ) ;
    public final void ruleLiability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:664:1: ( ( ( rule__Liability__Alternatives ) ) )
            // InternalReqLNG.g:665:2: ( ( rule__Liability__Alternatives ) )
            {
            // InternalReqLNG.g:665:2: ( ( rule__Liability__Alternatives ) )
            // InternalReqLNG.g:666:3: ( rule__Liability__Alternatives )
            {
             before(grammarAccess.getLiabilityAccess().getAlternatives()); 
            // InternalReqLNG.g:667:3: ( rule__Liability__Alternatives )
            // InternalReqLNG.g:667:4: rule__Liability__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Liability__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiability"


    // $ANTLR start "rule__RequirementDocument__Alternatives_0"
    // InternalReqLNG.g:675:1: rule__RequirementDocument__Alternatives_0 : ( ( ( rule__RequirementDocument__EntitiesAssignment_0_0 ) ) | ( ( rule__RequirementDocument__RequirementAssignment_0_1 ) ) );
    public final void rule__RequirementDocument__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:679:1: ( ( ( rule__RequirementDocument__EntitiesAssignment_0_0 ) ) | ( ( rule__RequirementDocument__RequirementAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25||LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING||LA2_0==12||LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqLNG.g:680:2: ( ( rule__RequirementDocument__EntitiesAssignment_0_0 ) )
                    {
                    // InternalReqLNG.g:680:2: ( ( rule__RequirementDocument__EntitiesAssignment_0_0 ) )
                    // InternalReqLNG.g:681:3: ( rule__RequirementDocument__EntitiesAssignment_0_0 )
                    {
                     before(grammarAccess.getRequirementDocumentAccess().getEntitiesAssignment_0_0()); 
                    // InternalReqLNG.g:682:3: ( rule__RequirementDocument__EntitiesAssignment_0_0 )
                    // InternalReqLNG.g:682:4: rule__RequirementDocument__EntitiesAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequirementDocument__EntitiesAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequirementDocumentAccess().getEntitiesAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:686:2: ( ( rule__RequirementDocument__RequirementAssignment_0_1 ) )
                    {
                    // InternalReqLNG.g:686:2: ( ( rule__RequirementDocument__RequirementAssignment_0_1 ) )
                    // InternalReqLNG.g:687:3: ( rule__RequirementDocument__RequirementAssignment_0_1 )
                    {
                     before(grammarAccess.getRequirementDocumentAccess().getRequirementAssignment_0_1()); 
                    // InternalReqLNG.g:688:3: ( rule__RequirementDocument__RequirementAssignment_0_1 )
                    // InternalReqLNG.g:688:4: rule__RequirementDocument__RequirementAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequirementDocument__RequirementAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequirementDocumentAccess().getRequirementAssignment_0_1()); 

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
    // $ANTLR end "rule__RequirementDocument__Alternatives_0"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalReqLNG.g:696:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleSystem ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:700:1: ( ( ruleActor ) | ( ruleSystem ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalReqLNG.g:701:2: ( ruleActor )
                    {
                    // InternalReqLNG.g:701:2: ( ruleActor )
                    // InternalReqLNG.g:702:3: ruleActor
                    {
                     before(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:707:2: ( ruleSystem )
                    {
                    // InternalReqLNG.g:707:2: ( ruleSystem )
                    // InternalReqLNG.g:708:3: ruleSystem
                    {
                     before(grammarAccess.getEntityAccess().getSystemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystem();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getSystemParserRuleCall_1()); 

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
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Text__Alternatives"
    // InternalReqLNG.g:717:1: rule__Text__Alternatives : ( ( 'To' ) | ( 'to' ) | ( 'A' ) | ( 'a' ) | ( 'the' ) | ( 'The' ) | ( RULE_WORD ) | ( RULE_ANY_OTHER ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:721:1: ( ( 'To' ) | ( 'to' ) | ( 'A' ) | ( 'a' ) | ( 'the' ) | ( 'The' ) | ( RULE_WORD ) | ( RULE_ANY_OTHER ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case RULE_WORD:
                {
                alt4=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalReqLNG.g:722:2: ( 'To' )
                    {
                    // InternalReqLNG.g:722:2: ( 'To' )
                    // InternalReqLNG.g:723:3: 'To'
                    {
                     before(grammarAccess.getTextAccess().getToKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getToKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:728:2: ( 'to' )
                    {
                    // InternalReqLNG.g:728:2: ( 'to' )
                    // InternalReqLNG.g:729:3: 'to'
                    {
                     before(grammarAccess.getTextAccess().getToKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getToKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:734:2: ( 'A' )
                    {
                    // InternalReqLNG.g:734:2: ( 'A' )
                    // InternalReqLNG.g:735:3: 'A'
                    {
                     before(grammarAccess.getTextAccess().getAKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getAKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReqLNG.g:740:2: ( 'a' )
                    {
                    // InternalReqLNG.g:740:2: ( 'a' )
                    // InternalReqLNG.g:741:3: 'a'
                    {
                     before(grammarAccess.getTextAccess().getAKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getAKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReqLNG.g:746:2: ( 'the' )
                    {
                    // InternalReqLNG.g:746:2: ( 'the' )
                    // InternalReqLNG.g:747:3: 'the'
                    {
                     before(grammarAccess.getTextAccess().getTheKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getTheKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReqLNG.g:752:2: ( 'The' )
                    {
                    // InternalReqLNG.g:752:2: ( 'The' )
                    // InternalReqLNG.g:753:3: 'The'
                    {
                     before(grammarAccess.getTextAccess().getTheKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getTheKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalReqLNG.g:758:2: ( RULE_WORD )
                    {
                    // InternalReqLNG.g:758:2: ( RULE_WORD )
                    // InternalReqLNG.g:759:3: RULE_WORD
                    {
                     before(grammarAccess.getTextAccess().getWORDTerminalRuleCall_6()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getWORDTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalReqLNG.g:764:2: ( RULE_ANY_OTHER )
                    {
                    // InternalReqLNG.g:764:2: ( RULE_ANY_OTHER )
                    // InternalReqLNG.g:765:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_7()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__SentenceWithReferences__PunctuationAlternatives_1_0"
    // InternalReqLNG.g:774:1: rule__SentenceWithReferences__PunctuationAlternatives_1_0 : ( ( '.' ) | ( '!' ) | ( '?' ) );
    public final void rule__SentenceWithReferences__PunctuationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:778:1: ( ( '.' ) | ( '!' ) | ( '?' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalReqLNG.g:779:2: ( '.' )
                    {
                    // InternalReqLNG.g:779:2: ( '.' )
                    // InternalReqLNG.g:780:3: '.'
                    {
                     before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationFullStopKeyword_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:785:2: ( '!' )
                    {
                    // InternalReqLNG.g:785:2: ( '!' )
                    // InternalReqLNG.g:786:3: '!'
                    {
                     before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationExclamationMarkKeyword_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationExclamationMarkKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:791:2: ( '?' )
                    {
                    // InternalReqLNG.g:791:2: ( '?' )
                    // InternalReqLNG.g:792:3: '?'
                    {
                     before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationQuestionMarkKeyword_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationQuestionMarkKeyword_1_0_2()); 

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
    // $ANTLR end "rule__SentenceWithReferences__PunctuationAlternatives_1_0"


    // $ANTLR start "rule__TextWithReferences__Alternatives"
    // InternalReqLNG.g:801:1: rule__TextWithReferences__Alternatives : ( ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithReferences__Group_1__0 ) ) );
    public final void rule__TextWithReferences__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:805:1: ( ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithReferences__Group_1__0 ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalReqLNG.g:806:2: ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) )
                    {
                    // InternalReqLNG.g:806:2: ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) )
                    // InternalReqLNG.g:807:3: ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* )
                    {
                    // InternalReqLNG.g:807:3: ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) )
                    // InternalReqLNG.g:808:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )
                    {
                     before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:809:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )
                    // InternalReqLNG.g:809:5: rule__TextWithReferences__OnlyRefsAssignment_0
                    {
                    pushFollow(FOLLOW_4);
                    rule__TextWithReferences__OnlyRefsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 

                    }

                    // InternalReqLNG.g:812:3: ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* )
                    // InternalReqLNG.g:813:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )*
                    {
                     before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:814:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==EOF||LA6_2==RULE_STRING||(LA6_2>=19 && LA6_2<=21)) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalReqLNG.g:814:5: rule__TextWithReferences__OnlyRefsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__TextWithReferences__OnlyRefsAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:819:2: ( ( rule__TextWithReferences__Group_1__0 ) )
                    {
                    // InternalReqLNG.g:819:2: ( ( rule__TextWithReferences__Group_1__0 ) )
                    // InternalReqLNG.g:820:3: ( rule__TextWithReferences__Group_1__0 )
                    {
                     before(grammarAccess.getTextWithReferencesAccess().getGroup_1()); 
                    // InternalReqLNG.g:821:3: ( rule__TextWithReferences__Group_1__0 )
                    // InternalReqLNG.g:821:4: rule__TextWithReferences__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextWithReferences__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextWithReferencesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TextWithReferences__Alternatives"


    // $ANTLR start "rule__Requirement__Alternatives"
    // InternalReqLNG.g:829:1: rule__Requirement__Alternatives : ( ( ruleConditionalRequirement ) | ( ruleUnconditionalRequirement ) );
    public final void rule__Requirement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:833:1: ( ( ruleConditionalRequirement ) | ( ruleUnconditionalRequirement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||LA8_0==12) ) {
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
                    // InternalReqLNG.g:834:2: ( ruleConditionalRequirement )
                    {
                    // InternalReqLNG.g:834:2: ( ruleConditionalRequirement )
                    // InternalReqLNG.g:835:3: ruleConditionalRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getConditionalRequirementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConditionalRequirement();

                    state._fsp--;

                     after(grammarAccess.getRequirementAccess().getConditionalRequirementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:840:2: ( ruleUnconditionalRequirement )
                    {
                    // InternalReqLNG.g:840:2: ( ruleUnconditionalRequirement )
                    // InternalReqLNG.g:841:3: ruleUnconditionalRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getUnconditionalRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnconditionalRequirement();

                    state._fsp--;

                     after(grammarAccess.getRequirementAccess().getUnconditionalRequirementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Requirement__Alternatives"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Alternatives"
    // InternalReqLNG.g:850:1: rule__TextWithConceptsOrSynonyms__Alternatives : ( ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) ) );
    public final void rule__TextWithConceptsOrSynonyms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:854:1: ( ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalReqLNG.g:855:2: ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) )
                    {
                    // InternalReqLNG.g:855:2: ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) )
                    // InternalReqLNG.g:856:3: ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* )
                    {
                    // InternalReqLNG.g:856:3: ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) )
                    // InternalReqLNG.g:857:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )
                    {
                     before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:858:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )
                    // InternalReqLNG.g:858:5: rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0
                    {
                    pushFollow(FOLLOW_4);
                    rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 

                    }

                    // InternalReqLNG.g:861:3: ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* )
                    // InternalReqLNG.g:862:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )*
                    {
                     before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:863:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalReqLNG.g:863:5: rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:868:2: ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) )
                    {
                    // InternalReqLNG.g:868:2: ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) )
                    // InternalReqLNG.g:869:3: ( rule__TextWithConceptsOrSynonyms__Group_1__0 )
                    {
                     before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getGroup_1()); 
                    // InternalReqLNG.g:870:3: ( rule__TextWithConceptsOrSynonyms__Group_1__0 )
                    // InternalReqLNG.g:870:4: rule__TextWithConceptsOrSynonyms__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextWithConceptsOrSynonyms__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Alternatives"


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalReqLNG.g:878:1: rule__Concept__Alternatives : ( ( ruleFunction ) | ( ruleDomainObject ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:882:1: ( ( ruleFunction ) | ( ruleDomainObject ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqLNG.g:883:2: ( ruleFunction )
                    {
                    // InternalReqLNG.g:883:2: ( ruleFunction )
                    // InternalReqLNG.g:884:3: ruleFunction
                    {
                     before(grammarAccess.getConceptAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:889:2: ( ruleDomainObject )
                    {
                    // InternalReqLNG.g:889:2: ( ruleDomainObject )
                    // InternalReqLNG.g:890:3: ruleDomainObject
                    {
                     before(grammarAccess.getConceptAccess().getDomainObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainObject();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getDomainObjectParserRuleCall_1()); 

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
    // $ANTLR end "rule__Concept__Alternatives"


    // $ANTLR start "rule__Liability__Alternatives"
    // InternalReqLNG.g:899:1: rule__Liability__Alternatives : ( ( ( 'shall' ) ) | ( ( 'should' ) ) | ( ( 'will' ) ) );
    public final void rule__Liability__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:903:1: ( ( ( 'shall' ) ) | ( ( 'should' ) ) | ( ( 'will' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalReqLNG.g:904:2: ( ( 'shall' ) )
                    {
                    // InternalReqLNG.g:904:2: ( ( 'shall' ) )
                    // InternalReqLNG.g:905:3: ( 'shall' )
                    {
                     before(grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0()); 
                    // InternalReqLNG.g:906:3: ( 'shall' )
                    // InternalReqLNG.g:906:4: 'shall'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:910:2: ( ( 'should' ) )
                    {
                    // InternalReqLNG.g:910:2: ( ( 'should' ) )
                    // InternalReqLNG.g:911:3: ( 'should' )
                    {
                     before(grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1()); 
                    // InternalReqLNG.g:912:3: ( 'should' )
                    // InternalReqLNG.g:912:4: 'should'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:916:2: ( ( 'will' ) )
                    {
                    // InternalReqLNG.g:916:2: ( ( 'will' ) )
                    // InternalReqLNG.g:917:3: ( 'will' )
                    {
                     before(grammarAccess.getLiabilityAccess().getWillEnumLiteralDeclaration_2()); 
                    // InternalReqLNG.g:918:3: ( 'will' )
                    // InternalReqLNG.g:918:4: 'will'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getLiabilityAccess().getWillEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Liability__Alternatives"


    // $ANTLR start "rule__RequirementDocument__Group__0"
    // InternalReqLNG.g:926:1: rule__RequirementDocument__Group__0 : rule__RequirementDocument__Group__0__Impl rule__RequirementDocument__Group__1 ;
    public final void rule__RequirementDocument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:930:1: ( rule__RequirementDocument__Group__0__Impl rule__RequirementDocument__Group__1 )
            // InternalReqLNG.g:931:2: rule__RequirementDocument__Group__0__Impl rule__RequirementDocument__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RequirementDocument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementDocument__Group__1();

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
    // $ANTLR end "rule__RequirementDocument__Group__0"


    // $ANTLR start "rule__RequirementDocument__Group__0__Impl"
    // InternalReqLNG.g:938:1: rule__RequirementDocument__Group__0__Impl : ( ( rule__RequirementDocument__Alternatives_0 )* ) ;
    public final void rule__RequirementDocument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:942:1: ( ( ( rule__RequirementDocument__Alternatives_0 )* ) )
            // InternalReqLNG.g:943:1: ( ( rule__RequirementDocument__Alternatives_0 )* )
            {
            // InternalReqLNG.g:943:1: ( ( rule__RequirementDocument__Alternatives_0 )* )
            // InternalReqLNG.g:944:2: ( rule__RequirementDocument__Alternatives_0 )*
            {
             before(grammarAccess.getRequirementDocumentAccess().getAlternatives_0()); 
            // InternalReqLNG.g:945:2: ( rule__RequirementDocument__Alternatives_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==12||LA13_0==18||LA13_0==25||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalReqLNG.g:945:3: rule__RequirementDocument__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RequirementDocument__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRequirementDocumentAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__RequirementDocument__Group__0__Impl"


    // $ANTLR start "rule__RequirementDocument__Group__1"
    // InternalReqLNG.g:953:1: rule__RequirementDocument__Group__1 : rule__RequirementDocument__Group__1__Impl ;
    public final void rule__RequirementDocument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:957:1: ( rule__RequirementDocument__Group__1__Impl )
            // InternalReqLNG.g:958:2: rule__RequirementDocument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementDocument__Group__1__Impl();

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
    // $ANTLR end "rule__RequirementDocument__Group__1"


    // $ANTLR start "rule__RequirementDocument__Group__1__Impl"
    // InternalReqLNG.g:964:1: rule__RequirementDocument__Group__1__Impl : ( ( rule__RequirementDocument__GlossaryAssignment_1 ) ) ;
    public final void rule__RequirementDocument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:968:1: ( ( ( rule__RequirementDocument__GlossaryAssignment_1 ) ) )
            // InternalReqLNG.g:969:1: ( ( rule__RequirementDocument__GlossaryAssignment_1 ) )
            {
            // InternalReqLNG.g:969:1: ( ( rule__RequirementDocument__GlossaryAssignment_1 ) )
            // InternalReqLNG.g:970:2: ( rule__RequirementDocument__GlossaryAssignment_1 )
            {
             before(grammarAccess.getRequirementDocumentAccess().getGlossaryAssignment_1()); 
            // InternalReqLNG.g:971:2: ( rule__RequirementDocument__GlossaryAssignment_1 )
            // InternalReqLNG.g:971:3: rule__RequirementDocument__GlossaryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementDocument__GlossaryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementDocumentAccess().getGlossaryAssignment_1()); 

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
    // $ANTLR end "rule__RequirementDocument__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalReqLNG.g:980:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:984:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalReqLNG.g:985:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalReqLNG.g:992:1: rule__Actor__Group__0__Impl : ( 'Actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:996:1: ( ( 'Actor' ) )
            // InternalReqLNG.g:997:1: ( 'Actor' )
            {
            // InternalReqLNG.g:997:1: ( 'Actor' )
            // InternalReqLNG.g:998:2: 'Actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

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
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalReqLNG.g:1007:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1011:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalReqLNG.g:1012:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalReqLNG.g:1019:1: rule__Actor__Group__1__Impl : ( ':' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1023:1: ( ( ':' ) )
            // InternalReqLNG.g:1024:1: ( ':' )
            {
            // InternalReqLNG.g:1024:1: ( ':' )
            // InternalReqLNG.g:1025:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalReqLNG.g:1034:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1038:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalReqLNG.g:1039:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalReqLNG.g:1046:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__NameAssignment_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1050:1: ( ( ( rule__Actor__NameAssignment_2 ) ) )
            // InternalReqLNG.g:1051:1: ( ( rule__Actor__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:1051:1: ( ( rule__Actor__NameAssignment_2 ) )
            // InternalReqLNG.g:1052:2: ( rule__Actor__NameAssignment_2 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:1053:2: ( rule__Actor__NameAssignment_2 )
            // InternalReqLNG.g:1053:3: rule__Actor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalReqLNG.g:1061:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1065:1: ( rule__Actor__Group__3__Impl )
            // InternalReqLNG.g:1066:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__3__Impl();

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
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalReqLNG.g:1072:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__DescriptionAssignment_3 ) ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1076:1: ( ( ( rule__Actor__DescriptionAssignment_3 ) ) )
            // InternalReqLNG.g:1077:1: ( ( rule__Actor__DescriptionAssignment_3 ) )
            {
            // InternalReqLNG.g:1077:1: ( ( rule__Actor__DescriptionAssignment_3 ) )
            // InternalReqLNG.g:1078:2: ( rule__Actor__DescriptionAssignment_3 )
            {
             before(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
            // InternalReqLNG.g:1079:2: ( rule__Actor__DescriptionAssignment_3 )
            // InternalReqLNG.g:1079:3: rule__Actor__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Actor__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__System__Group__0"
    // InternalReqLNG.g:1088:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1092:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalReqLNG.g:1093:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalReqLNG.g:1100:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1104:1: ( ( 'System' ) )
            // InternalReqLNG.g:1105:1: ( 'System' )
            {
            // InternalReqLNG.g:1105:1: ( 'System' )
            // InternalReqLNG.g:1106:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalReqLNG.g:1115:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1119:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalReqLNG.g:1120:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalReqLNG.g:1127:1: rule__System__Group__1__Impl : ( ':' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1131:1: ( ( ':' ) )
            // InternalReqLNG.g:1132:1: ( ':' )
            {
            // InternalReqLNG.g:1132:1: ( ':' )
            // InternalReqLNG.g:1133:2: ':'
            {
             before(grammarAccess.getSystemAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalReqLNG.g:1142:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1146:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalReqLNG.g:1147:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalReqLNG.g:1154:1: rule__System__Group__2__Impl : ( ( rule__System__NameAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1158:1: ( ( ( rule__System__NameAssignment_2 ) ) )
            // InternalReqLNG.g:1159:1: ( ( rule__System__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:1159:1: ( ( rule__System__NameAssignment_2 ) )
            // InternalReqLNG.g:1160:2: ( rule__System__NameAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:1161:2: ( rule__System__NameAssignment_2 )
            // InternalReqLNG.g:1161:3: rule__System__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalReqLNG.g:1169:1: rule__System__Group__3 : rule__System__Group__3__Impl ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1173:1: ( rule__System__Group__3__Impl )
            // InternalReqLNG.g:1174:2: rule__System__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__3__Impl();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalReqLNG.g:1180:1: rule__System__Group__3__Impl : ( ( rule__System__DescriptionAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1184:1: ( ( ( rule__System__DescriptionAssignment_3 ) ) )
            // InternalReqLNG.g:1185:1: ( ( rule__System__DescriptionAssignment_3 ) )
            {
            // InternalReqLNG.g:1185:1: ( ( rule__System__DescriptionAssignment_3 ) )
            // InternalReqLNG.g:1186:2: ( rule__System__DescriptionAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getDescriptionAssignment_3()); 
            // InternalReqLNG.g:1187:2: ( rule__System__DescriptionAssignment_3 )
            // InternalReqLNG.g:1187:3: rule__System__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__System__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalReqLNG.g:1196:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1200:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalReqLNG.g:1201:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalReqLNG.g:1208:1: rule__Description__Group__0__Impl : ( 'Description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1212:1: ( ( 'Description' ) )
            // InternalReqLNG.g:1213:1: ( 'Description' )
            {
            // InternalReqLNG.g:1213:1: ( 'Description' )
            // InternalReqLNG.g:1214:2: 'Description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalReqLNG.g:1223:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1227:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalReqLNG.g:1228:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalReqLNG.g:1235:1: rule__Description__Group__1__Impl : ( ':' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1239:1: ( ( ':' ) )
            // InternalReqLNG.g:1240:1: ( ':' )
            {
            // InternalReqLNG.g:1240:1: ( ':' )
            // InternalReqLNG.g:1241:2: ':'
            {
             before(grammarAccess.getDescriptionAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalReqLNG.g:1250:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1254:1: ( rule__Description__Group__2__Impl )
            // InternalReqLNG.g:1255:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__2__Impl();

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
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalReqLNG.g:1261:1: rule__Description__Group__2__Impl : ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1265:1: ( ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) ) )
            // InternalReqLNG.g:1266:1: ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) )
            {
            // InternalReqLNG.g:1266:1: ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) )
            // InternalReqLNG.g:1267:2: ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* )
            {
            // InternalReqLNG.g:1267:2: ( ( rule__Description__TextAssignment_2 ) )
            // InternalReqLNG.g:1268:3: ( rule__Description__TextAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalReqLNG.g:1269:3: ( rule__Description__TextAssignment_2 )
            // InternalReqLNG.g:1269:4: rule__Description__TextAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__Description__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 

            }

            // InternalReqLNG.g:1272:2: ( ( rule__Description__TextAssignment_2 )* )
            // InternalReqLNG.g:1273:3: ( rule__Description__TextAssignment_2 )*
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalReqLNG.g:1274:3: ( rule__Description__TextAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=RULE_WORD && LA14_2<=RULE_STRING)||(LA14_2>=13 && LA14_2<=21)) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA14_3 = input.LA(2);

                    if ( ((LA14_3>=RULE_WORD && LA14_3<=RULE_ANY_OTHER)||(LA14_3>=13 && LA14_3<=21)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_3==RULE_STRING) ) {
                        int LA14_5 = input.LA(3);

                        if ( ((LA14_5>=RULE_WORD && LA14_5<=RULE_STRING)||(LA14_5>=13 && LA14_5<=21)) ) {
                            alt14=1;
                        }


                    }


                    }
                    break;
                case RULE_WORD:
                case RULE_ANY_OTHER:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalReqLNG.g:1274:4: rule__Description__TextAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Description__TextAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 

            }


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
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__SentenceWithReferences__Group__0"
    // InternalReqLNG.g:1284:1: rule__SentenceWithReferences__Group__0 : rule__SentenceWithReferences__Group__0__Impl rule__SentenceWithReferences__Group__1 ;
    public final void rule__SentenceWithReferences__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1288:1: ( rule__SentenceWithReferences__Group__0__Impl rule__SentenceWithReferences__Group__1 )
            // InternalReqLNG.g:1289:2: rule__SentenceWithReferences__Group__0__Impl rule__SentenceWithReferences__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SentenceWithReferences__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SentenceWithReferences__Group__1();

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
    // $ANTLR end "rule__SentenceWithReferences__Group__0"


    // $ANTLR start "rule__SentenceWithReferences__Group__0__Impl"
    // InternalReqLNG.g:1296:1: rule__SentenceWithReferences__Group__0__Impl : ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) ) ;
    public final void rule__SentenceWithReferences__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1300:1: ( ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) ) )
            // InternalReqLNG.g:1301:1: ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) )
            {
            // InternalReqLNG.g:1301:1: ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) )
            // InternalReqLNG.g:1302:2: ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesAssignment_0()); 
            // InternalReqLNG.g:1303:2: ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 )
            // InternalReqLNG.g:1303:3: rule__SentenceWithReferences__TextWithReferencesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SentenceWithReferences__TextWithReferencesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesAssignment_0()); 

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
    // $ANTLR end "rule__SentenceWithReferences__Group__0__Impl"


    // $ANTLR start "rule__SentenceWithReferences__Group__1"
    // InternalReqLNG.g:1311:1: rule__SentenceWithReferences__Group__1 : rule__SentenceWithReferences__Group__1__Impl ;
    public final void rule__SentenceWithReferences__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1315:1: ( rule__SentenceWithReferences__Group__1__Impl )
            // InternalReqLNG.g:1316:2: rule__SentenceWithReferences__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SentenceWithReferences__Group__1__Impl();

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
    // $ANTLR end "rule__SentenceWithReferences__Group__1"


    // $ANTLR start "rule__SentenceWithReferences__Group__1__Impl"
    // InternalReqLNG.g:1322:1: rule__SentenceWithReferences__Group__1__Impl : ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) ) ;
    public final void rule__SentenceWithReferences__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1326:1: ( ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) ) )
            // InternalReqLNG.g:1327:1: ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) )
            {
            // InternalReqLNG.g:1327:1: ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) )
            // InternalReqLNG.g:1328:2: ( rule__SentenceWithReferences__PunctuationAssignment_1 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAssignment_1()); 
            // InternalReqLNG.g:1329:2: ( rule__SentenceWithReferences__PunctuationAssignment_1 )
            // InternalReqLNG.g:1329:3: rule__SentenceWithReferences__PunctuationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SentenceWithReferences__PunctuationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAssignment_1()); 

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
    // $ANTLR end "rule__SentenceWithReferences__Group__1__Impl"


    // $ANTLR start "rule__TextWithReferences__Group_1__0"
    // InternalReqLNG.g:1338:1: rule__TextWithReferences__Group_1__0 : rule__TextWithReferences__Group_1__0__Impl rule__TextWithReferences__Group_1__1 ;
    public final void rule__TextWithReferences__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1342:1: ( rule__TextWithReferences__Group_1__0__Impl rule__TextWithReferences__Group_1__1 )
            // InternalReqLNG.g:1343:2: rule__TextWithReferences__Group_1__0__Impl rule__TextWithReferences__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__TextWithReferences__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextWithReferences__Group_1__1();

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
    // $ANTLR end "rule__TextWithReferences__Group_1__0"


    // $ANTLR start "rule__TextWithReferences__Group_1__0__Impl"
    // InternalReqLNG.g:1350:1: rule__TextWithReferences__Group_1__0__Impl : ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* ) ;
    public final void rule__TextWithReferences__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1354:1: ( ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* ) )
            // InternalReqLNG.g:1355:1: ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* )
            {
            // InternalReqLNG.g:1355:1: ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* )
            // InternalReqLNG.g:1356:2: ( rule__TextWithReferences__RefBeforeAssignment_1_0 )*
            {
             before(grammarAccess.getTextWithReferencesAccess().getRefBeforeAssignment_1_0()); 
            // InternalReqLNG.g:1357:2: ( rule__TextWithReferences__RefBeforeAssignment_1_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalReqLNG.g:1357:3: rule__TextWithReferences__RefBeforeAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithReferences__RefBeforeAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTextWithReferencesAccess().getRefBeforeAssignment_1_0()); 

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
    // $ANTLR end "rule__TextWithReferences__Group_1__0__Impl"


    // $ANTLR start "rule__TextWithReferences__Group_1__1"
    // InternalReqLNG.g:1365:1: rule__TextWithReferences__Group_1__1 : rule__TextWithReferences__Group_1__1__Impl rule__TextWithReferences__Group_1__2 ;
    public final void rule__TextWithReferences__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1369:1: ( rule__TextWithReferences__Group_1__1__Impl rule__TextWithReferences__Group_1__2 )
            // InternalReqLNG.g:1370:2: rule__TextWithReferences__Group_1__1__Impl rule__TextWithReferences__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__TextWithReferences__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextWithReferences__Group_1__2();

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
    // $ANTLR end "rule__TextWithReferences__Group_1__1"


    // $ANTLR start "rule__TextWithReferences__Group_1__1__Impl"
    // InternalReqLNG.g:1377:1: rule__TextWithReferences__Group_1__1__Impl : ( ( rule__TextWithReferences__TextAssignment_1_1 ) ) ;
    public final void rule__TextWithReferences__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1381:1: ( ( ( rule__TextWithReferences__TextAssignment_1_1 ) ) )
            // InternalReqLNG.g:1382:1: ( ( rule__TextWithReferences__TextAssignment_1_1 ) )
            {
            // InternalReqLNG.g:1382:1: ( ( rule__TextWithReferences__TextAssignment_1_1 ) )
            // InternalReqLNG.g:1383:2: ( rule__TextWithReferences__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextWithReferencesAccess().getTextAssignment_1_1()); 
            // InternalReqLNG.g:1384:2: ( rule__TextWithReferences__TextAssignment_1_1 )
            // InternalReqLNG.g:1384:3: rule__TextWithReferences__TextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TextWithReferences__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTextWithReferencesAccess().getTextAssignment_1_1()); 

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
    // $ANTLR end "rule__TextWithReferences__Group_1__1__Impl"


    // $ANTLR start "rule__TextWithReferences__Group_1__2"
    // InternalReqLNG.g:1392:1: rule__TextWithReferences__Group_1__2 : rule__TextWithReferences__Group_1__2__Impl rule__TextWithReferences__Group_1__3 ;
    public final void rule__TextWithReferences__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1396:1: ( rule__TextWithReferences__Group_1__2__Impl rule__TextWithReferences__Group_1__3 )
            // InternalReqLNG.g:1397:2: rule__TextWithReferences__Group_1__2__Impl rule__TextWithReferences__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__TextWithReferences__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextWithReferences__Group_1__3();

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
    // $ANTLR end "rule__TextWithReferences__Group_1__2"


    // $ANTLR start "rule__TextWithReferences__Group_1__2__Impl"
    // InternalReqLNG.g:1404:1: rule__TextWithReferences__Group_1__2__Impl : ( ( rule__TextWithReferences__AfterAssignment_1_2 )* ) ;
    public final void rule__TextWithReferences__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1408:1: ( ( ( rule__TextWithReferences__AfterAssignment_1_2 )* ) )
            // InternalReqLNG.g:1409:1: ( ( rule__TextWithReferences__AfterAssignment_1_2 )* )
            {
            // InternalReqLNG.g:1409:1: ( ( rule__TextWithReferences__AfterAssignment_1_2 )* )
            // InternalReqLNG.g:1410:2: ( rule__TextWithReferences__AfterAssignment_1_2 )*
            {
             before(grammarAccess.getTextWithReferencesAccess().getAfterAssignment_1_2()); 
            // InternalReqLNG.g:1411:2: ( rule__TextWithReferences__AfterAssignment_1_2 )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalReqLNG.g:1411:3: rule__TextWithReferences__AfterAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithReferences__AfterAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTextWithReferencesAccess().getAfterAssignment_1_2()); 

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
    // $ANTLR end "rule__TextWithReferences__Group_1__2__Impl"


    // $ANTLR start "rule__TextWithReferences__Group_1__3"
    // InternalReqLNG.g:1419:1: rule__TextWithReferences__Group_1__3 : rule__TextWithReferences__Group_1__3__Impl ;
    public final void rule__TextWithReferences__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1423:1: ( rule__TextWithReferences__Group_1__3__Impl )
            // InternalReqLNG.g:1424:2: rule__TextWithReferences__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextWithReferences__Group_1__3__Impl();

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
    // $ANTLR end "rule__TextWithReferences__Group_1__3"


    // $ANTLR start "rule__TextWithReferences__Group_1__3__Impl"
    // InternalReqLNG.g:1430:1: rule__TextWithReferences__Group_1__3__Impl : ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* ) ;
    public final void rule__TextWithReferences__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1434:1: ( ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* ) )
            // InternalReqLNG.g:1435:1: ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* )
            {
            // InternalReqLNG.g:1435:1: ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* )
            // InternalReqLNG.g:1436:2: ( rule__TextWithReferences__FinalRefAssignment_1_3 )*
            {
             before(grammarAccess.getTextWithReferencesAccess().getFinalRefAssignment_1_3()); 
            // InternalReqLNG.g:1437:2: ( rule__TextWithReferences__FinalRefAssignment_1_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==EOF||LA17_2==RULE_STRING||(LA17_2>=19 && LA17_2<=21)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalReqLNG.g:1437:3: rule__TextWithReferences__FinalRefAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithReferences__FinalRefAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTextWithReferencesAccess().getFinalRefAssignment_1_3()); 

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
    // $ANTLR end "rule__TextWithReferences__Group_1__3__Impl"


    // $ANTLR start "rule__ReferenceCombination__Group__0"
    // InternalReqLNG.g:1446:1: rule__ReferenceCombination__Group__0 : rule__ReferenceCombination__Group__0__Impl rule__ReferenceCombination__Group__1 ;
    public final void rule__ReferenceCombination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1450:1: ( rule__ReferenceCombination__Group__0__Impl rule__ReferenceCombination__Group__1 )
            // InternalReqLNG.g:1451:2: rule__ReferenceCombination__Group__0__Impl rule__ReferenceCombination__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ReferenceCombination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReferenceCombination__Group__1();

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
    // $ANTLR end "rule__ReferenceCombination__Group__0"


    // $ANTLR start "rule__ReferenceCombination__Group__0__Impl"
    // InternalReqLNG.g:1458:1: rule__ReferenceCombination__Group__0__Impl : ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) ) ;
    public final void rule__ReferenceCombination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1462:1: ( ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) ) )
            // InternalReqLNG.g:1463:1: ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) )
            {
            // InternalReqLNG.g:1463:1: ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) )
            // InternalReqLNG.g:1464:2: ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* )
            {
            // InternalReqLNG.g:1464:2: ( ( rule__ReferenceCombination__RefsAssignment_0 ) )
            // InternalReqLNG.g:1465:3: ( rule__ReferenceCombination__RefsAssignment_0 )
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 
            // InternalReqLNG.g:1466:3: ( rule__ReferenceCombination__RefsAssignment_0 )
            // InternalReqLNG.g:1466:4: rule__ReferenceCombination__RefsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceCombination__RefsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 

            }

            // InternalReqLNG.g:1469:2: ( ( rule__ReferenceCombination__RefsAssignment_0 )* )
            // InternalReqLNG.g:1470:3: ( rule__ReferenceCombination__RefsAssignment_0 )*
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 
            // InternalReqLNG.g:1471:3: ( rule__ReferenceCombination__RefsAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalReqLNG.g:1471:4: rule__ReferenceCombination__RefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ReferenceCombination__RefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 

            }


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
    // $ANTLR end "rule__ReferenceCombination__Group__0__Impl"


    // $ANTLR start "rule__ReferenceCombination__Group__1"
    // InternalReqLNG.g:1480:1: rule__ReferenceCombination__Group__1 : rule__ReferenceCombination__Group__1__Impl ;
    public final void rule__ReferenceCombination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1484:1: ( rule__ReferenceCombination__Group__1__Impl )
            // InternalReqLNG.g:1485:2: rule__ReferenceCombination__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCombination__Group__1__Impl();

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
    // $ANTLR end "rule__ReferenceCombination__Group__1"


    // $ANTLR start "rule__ReferenceCombination__Group__1__Impl"
    // InternalReqLNG.g:1491:1: rule__ReferenceCombination__Group__1__Impl : ( ( rule__ReferenceCombination__TextAssignment_1 ) ) ;
    public final void rule__ReferenceCombination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1495:1: ( ( ( rule__ReferenceCombination__TextAssignment_1 ) ) )
            // InternalReqLNG.g:1496:1: ( ( rule__ReferenceCombination__TextAssignment_1 ) )
            {
            // InternalReqLNG.g:1496:1: ( ( rule__ReferenceCombination__TextAssignment_1 ) )
            // InternalReqLNG.g:1497:2: ( rule__ReferenceCombination__TextAssignment_1 )
            {
             before(grammarAccess.getReferenceCombinationAccess().getTextAssignment_1()); 
            // InternalReqLNG.g:1498:2: ( rule__ReferenceCombination__TextAssignment_1 )
            // InternalReqLNG.g:1498:3: rule__ReferenceCombination__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceCombination__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceCombinationAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__ReferenceCombination__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRequirement__Group__0"
    // InternalReqLNG.g:1507:1: rule__ConditionalRequirement__Group__0 : rule__ConditionalRequirement__Group__0__Impl rule__ConditionalRequirement__Group__1 ;
    public final void rule__ConditionalRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1511:1: ( rule__ConditionalRequirement__Group__0__Impl rule__ConditionalRequirement__Group__1 )
            // InternalReqLNG.g:1512:2: rule__ConditionalRequirement__Group__0__Impl rule__ConditionalRequirement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ConditionalRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__Group__1();

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
    // $ANTLR end "rule__ConditionalRequirement__Group__0"


    // $ANTLR start "rule__ConditionalRequirement__Group__0__Impl"
    // InternalReqLNG.g:1519:1: rule__ConditionalRequirement__Group__0__Impl : ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? ) ;
    public final void rule__ConditionalRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1523:1: ( ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? ) )
            // InternalReqLNG.g:1524:1: ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? )
            {
            // InternalReqLNG.g:1524:1: ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? )
            // InternalReqLNG.g:1525:2: ( rule__ConditionalRequirement__ConditionAssignment_0 )?
            {
             before(grammarAccess.getConditionalRequirementAccess().getConditionAssignment_0()); 
            // InternalReqLNG.g:1526:2: ( rule__ConditionalRequirement__ConditionAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReqLNG.g:1526:3: rule__ConditionalRequirement__ConditionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalRequirement__ConditionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalRequirementAccess().getConditionAssignment_0()); 

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
    // $ANTLR end "rule__ConditionalRequirement__Group__0__Impl"


    // $ANTLR start "rule__ConditionalRequirement__Group__1"
    // InternalReqLNG.g:1534:1: rule__ConditionalRequirement__Group__1 : rule__ConditionalRequirement__Group__1__Impl rule__ConditionalRequirement__Group__2 ;
    public final void rule__ConditionalRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1538:1: ( rule__ConditionalRequirement__Group__1__Impl rule__ConditionalRequirement__Group__2 )
            // InternalReqLNG.g:1539:2: rule__ConditionalRequirement__Group__1__Impl rule__ConditionalRequirement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ConditionalRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__Group__2();

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
    // $ANTLR end "rule__ConditionalRequirement__Group__1"


    // $ANTLR start "rule__ConditionalRequirement__Group__1__Impl"
    // InternalReqLNG.g:1546:1: rule__ConditionalRequirement__Group__1__Impl : ( ( rule__ConditionalRequirement__SystemAssignment_1 ) ) ;
    public final void rule__ConditionalRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1550:1: ( ( ( rule__ConditionalRequirement__SystemAssignment_1 ) ) )
            // InternalReqLNG.g:1551:1: ( ( rule__ConditionalRequirement__SystemAssignment_1 ) )
            {
            // InternalReqLNG.g:1551:1: ( ( rule__ConditionalRequirement__SystemAssignment_1 ) )
            // InternalReqLNG.g:1552:2: ( rule__ConditionalRequirement__SystemAssignment_1 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getSystemAssignment_1()); 
            // InternalReqLNG.g:1553:2: ( rule__ConditionalRequirement__SystemAssignment_1 )
            // InternalReqLNG.g:1553:3: rule__ConditionalRequirement__SystemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__SystemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRequirementAccess().getSystemAssignment_1()); 

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
    // $ANTLR end "rule__ConditionalRequirement__Group__1__Impl"


    // $ANTLR start "rule__ConditionalRequirement__Group__2"
    // InternalReqLNG.g:1561:1: rule__ConditionalRequirement__Group__2 : rule__ConditionalRequirement__Group__2__Impl rule__ConditionalRequirement__Group__3 ;
    public final void rule__ConditionalRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1565:1: ( rule__ConditionalRequirement__Group__2__Impl rule__ConditionalRequirement__Group__3 )
            // InternalReqLNG.g:1566:2: rule__ConditionalRequirement__Group__2__Impl rule__ConditionalRequirement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ConditionalRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__Group__3();

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
    // $ANTLR end "rule__ConditionalRequirement__Group__2"


    // $ANTLR start "rule__ConditionalRequirement__Group__2__Impl"
    // InternalReqLNG.g:1573:1: rule__ConditionalRequirement__Group__2__Impl : ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) ) ;
    public final void rule__ConditionalRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1577:1: ( ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) ) )
            // InternalReqLNG.g:1578:1: ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) )
            {
            // InternalReqLNG.g:1578:1: ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) )
            // InternalReqLNG.g:1579:2: ( rule__ConditionalRequirement__LiabilityAssignment_2 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getLiabilityAssignment_2()); 
            // InternalReqLNG.g:1580:2: ( rule__ConditionalRequirement__LiabilityAssignment_2 )
            // InternalReqLNG.g:1580:3: rule__ConditionalRequirement__LiabilityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__LiabilityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRequirementAccess().getLiabilityAssignment_2()); 

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
    // $ANTLR end "rule__ConditionalRequirement__Group__2__Impl"


    // $ANTLR start "rule__ConditionalRequirement__Group__3"
    // InternalReqLNG.g:1588:1: rule__ConditionalRequirement__Group__3 : rule__ConditionalRequirement__Group__3__Impl ;
    public final void rule__ConditionalRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1592:1: ( rule__ConditionalRequirement__Group__3__Impl )
            // InternalReqLNG.g:1593:2: rule__ConditionalRequirement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__Group__3__Impl();

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
    // $ANTLR end "rule__ConditionalRequirement__Group__3"


    // $ANTLR start "rule__ConditionalRequirement__Group__3__Impl"
    // InternalReqLNG.g:1599:1: rule__ConditionalRequirement__Group__3__Impl : ( ( rule__ConditionalRequirement__EndAssignment_3 ) ) ;
    public final void rule__ConditionalRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1603:1: ( ( ( rule__ConditionalRequirement__EndAssignment_3 ) ) )
            // InternalReqLNG.g:1604:1: ( ( rule__ConditionalRequirement__EndAssignment_3 ) )
            {
            // InternalReqLNG.g:1604:1: ( ( rule__ConditionalRequirement__EndAssignment_3 ) )
            // InternalReqLNG.g:1605:2: ( rule__ConditionalRequirement__EndAssignment_3 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getEndAssignment_3()); 
            // InternalReqLNG.g:1606:2: ( rule__ConditionalRequirement__EndAssignment_3 )
            // InternalReqLNG.g:1606:3: rule__ConditionalRequirement__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalRequirement__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalRequirementAccess().getEndAssignment_3()); 

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
    // $ANTLR end "rule__ConditionalRequirement__Group__3__Impl"


    // $ANTLR start "rule__UnconditionalRequirement__Group__0"
    // InternalReqLNG.g:1615:1: rule__UnconditionalRequirement__Group__0 : rule__UnconditionalRequirement__Group__0__Impl rule__UnconditionalRequirement__Group__1 ;
    public final void rule__UnconditionalRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1619:1: ( rule__UnconditionalRequirement__Group__0__Impl rule__UnconditionalRequirement__Group__1 )
            // InternalReqLNG.g:1620:2: rule__UnconditionalRequirement__Group__0__Impl rule__UnconditionalRequirement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__UnconditionalRequirement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__Group__1();

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__0"


    // $ANTLR start "rule__UnconditionalRequirement__Group__0__Impl"
    // InternalReqLNG.g:1627:1: rule__UnconditionalRequirement__Group__0__Impl : ( ( rule__UnconditionalRequirement__TheAssignment_0 ) ) ;
    public final void rule__UnconditionalRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1631:1: ( ( ( rule__UnconditionalRequirement__TheAssignment_0 ) ) )
            // InternalReqLNG.g:1632:1: ( ( rule__UnconditionalRequirement__TheAssignment_0 ) )
            {
            // InternalReqLNG.g:1632:1: ( ( rule__UnconditionalRequirement__TheAssignment_0 ) )
            // InternalReqLNG.g:1633:2: ( rule__UnconditionalRequirement__TheAssignment_0 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getTheAssignment_0()); 
            // InternalReqLNG.g:1634:2: ( rule__UnconditionalRequirement__TheAssignment_0 )
            // InternalReqLNG.g:1634:3: rule__UnconditionalRequirement__TheAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__TheAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRequirementAccess().getTheAssignment_0()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__0__Impl"


    // $ANTLR start "rule__UnconditionalRequirement__Group__1"
    // InternalReqLNG.g:1642:1: rule__UnconditionalRequirement__Group__1 : rule__UnconditionalRequirement__Group__1__Impl rule__UnconditionalRequirement__Group__2 ;
    public final void rule__UnconditionalRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1646:1: ( rule__UnconditionalRequirement__Group__1__Impl rule__UnconditionalRequirement__Group__2 )
            // InternalReqLNG.g:1647:2: rule__UnconditionalRequirement__Group__1__Impl rule__UnconditionalRequirement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__UnconditionalRequirement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__Group__2();

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__1"


    // $ANTLR start "rule__UnconditionalRequirement__Group__1__Impl"
    // InternalReqLNG.g:1654:1: rule__UnconditionalRequirement__Group__1__Impl : ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) ) ;
    public final void rule__UnconditionalRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1658:1: ( ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) ) )
            // InternalReqLNG.g:1659:1: ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) )
            {
            // InternalReqLNG.g:1659:1: ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) )
            // InternalReqLNG.g:1660:2: ( rule__UnconditionalRequirement__SystemAssignment_1 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getSystemAssignment_1()); 
            // InternalReqLNG.g:1661:2: ( rule__UnconditionalRequirement__SystemAssignment_1 )
            // InternalReqLNG.g:1661:3: rule__UnconditionalRequirement__SystemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__SystemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRequirementAccess().getSystemAssignment_1()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__1__Impl"


    // $ANTLR start "rule__UnconditionalRequirement__Group__2"
    // InternalReqLNG.g:1669:1: rule__UnconditionalRequirement__Group__2 : rule__UnconditionalRequirement__Group__2__Impl rule__UnconditionalRequirement__Group__3 ;
    public final void rule__UnconditionalRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1673:1: ( rule__UnconditionalRequirement__Group__2__Impl rule__UnconditionalRequirement__Group__3 )
            // InternalReqLNG.g:1674:2: rule__UnconditionalRequirement__Group__2__Impl rule__UnconditionalRequirement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__UnconditionalRequirement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__Group__3();

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__2"


    // $ANTLR start "rule__UnconditionalRequirement__Group__2__Impl"
    // InternalReqLNG.g:1681:1: rule__UnconditionalRequirement__Group__2__Impl : ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) ) ;
    public final void rule__UnconditionalRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1685:1: ( ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) ) )
            // InternalReqLNG.g:1686:1: ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) )
            {
            // InternalReqLNG.g:1686:1: ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) )
            // InternalReqLNG.g:1687:2: ( rule__UnconditionalRequirement__LiabilityAssignment_2 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getLiabilityAssignment_2()); 
            // InternalReqLNG.g:1688:2: ( rule__UnconditionalRequirement__LiabilityAssignment_2 )
            // InternalReqLNG.g:1688:3: rule__UnconditionalRequirement__LiabilityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__LiabilityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRequirementAccess().getLiabilityAssignment_2()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__2__Impl"


    // $ANTLR start "rule__UnconditionalRequirement__Group__3"
    // InternalReqLNG.g:1696:1: rule__UnconditionalRequirement__Group__3 : rule__UnconditionalRequirement__Group__3__Impl ;
    public final void rule__UnconditionalRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1700:1: ( rule__UnconditionalRequirement__Group__3__Impl )
            // InternalReqLNG.g:1701:2: rule__UnconditionalRequirement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__Group__3__Impl();

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__3"


    // $ANTLR start "rule__UnconditionalRequirement__Group__3__Impl"
    // InternalReqLNG.g:1707:1: rule__UnconditionalRequirement__Group__3__Impl : ( ( rule__UnconditionalRequirement__EndAssignment_3 ) ) ;
    public final void rule__UnconditionalRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1711:1: ( ( ( rule__UnconditionalRequirement__EndAssignment_3 ) ) )
            // InternalReqLNG.g:1712:1: ( ( rule__UnconditionalRequirement__EndAssignment_3 ) )
            {
            // InternalReqLNG.g:1712:1: ( ( rule__UnconditionalRequirement__EndAssignment_3 ) )
            // InternalReqLNG.g:1713:2: ( rule__UnconditionalRequirement__EndAssignment_3 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getEndAssignment_3()); 
            // InternalReqLNG.g:1714:2: ( rule__UnconditionalRequirement__EndAssignment_3 )
            // InternalReqLNG.g:1714:3: rule__UnconditionalRequirement__EndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UnconditionalRequirement__EndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnconditionalRequirementAccess().getEndAssignment_3()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__Group__3__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalReqLNG.g:1723:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1727:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalReqLNG.g:1728:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1();

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
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // InternalReqLNG.g:1735:1: rule__Precondition__Group__0__Impl : ( ( rule__Precondition__ConditionalAssignment_0 ) ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1739:1: ( ( ( rule__Precondition__ConditionalAssignment_0 ) ) )
            // InternalReqLNG.g:1740:1: ( ( rule__Precondition__ConditionalAssignment_0 ) )
            {
            // InternalReqLNG.g:1740:1: ( ( rule__Precondition__ConditionalAssignment_0 ) )
            // InternalReqLNG.g:1741:2: ( rule__Precondition__ConditionalAssignment_0 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionalAssignment_0()); 
            // InternalReqLNG.g:1742:2: ( rule__Precondition__ConditionalAssignment_0 )
            // InternalReqLNG.g:1742:3: rule__Precondition__ConditionalAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__ConditionalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getConditionalAssignment_0()); 

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
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // InternalReqLNG.g:1750:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1754:1: ( rule__Precondition__Group__1__Impl )
            // InternalReqLNG.g:1755:2: rule__Precondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1__Impl();

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
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // InternalReqLNG.g:1761:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ConditionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1765:1: ( ( ( rule__Precondition__ConditionAssignment_1 ) ) )
            // InternalReqLNG.g:1766:1: ( ( rule__Precondition__ConditionAssignment_1 ) )
            {
            // InternalReqLNG.g:1766:1: ( ( rule__Precondition__ConditionAssignment_1 ) )
            // InternalReqLNG.g:1767:2: ( rule__Precondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_1()); 
            // InternalReqLNG.g:1768:2: ( rule__Precondition__ConditionAssignment_1 )
            // InternalReqLNG.g:1768:3: rule__Precondition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__0"
    // InternalReqLNG.g:1777:1: rule__ActorInteraction__Group__0 : rule__ActorInteraction__Group__0__Impl rule__ActorInteraction__Group__1 ;
    public final void rule__ActorInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1781:1: ( rule__ActorInteraction__Group__0__Impl rule__ActorInteraction__Group__1 )
            // InternalReqLNG.g:1782:2: rule__ActorInteraction__Group__0__Impl rule__ActorInteraction__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ActorInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__1();

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
    // $ANTLR end "rule__ActorInteraction__Group__0"


    // $ANTLR start "rule__ActorInteraction__Group__0__Impl"
    // InternalReqLNG.g:1789:1: rule__ActorInteraction__Group__0__Impl : ( ( rule__ActorInteraction__ProvideAssignment_0 ) ) ;
    public final void rule__ActorInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1793:1: ( ( ( rule__ActorInteraction__ProvideAssignment_0 ) ) )
            // InternalReqLNG.g:1794:1: ( ( rule__ActorInteraction__ProvideAssignment_0 ) )
            {
            // InternalReqLNG.g:1794:1: ( ( rule__ActorInteraction__ProvideAssignment_0 ) )
            // InternalReqLNG.g:1795:2: ( rule__ActorInteraction__ProvideAssignment_0 )
            {
             before(grammarAccess.getActorInteractionAccess().getProvideAssignment_0()); 
            // InternalReqLNG.g:1796:2: ( rule__ActorInteraction__ProvideAssignment_0 )
            // InternalReqLNG.g:1796:3: rule__ActorInteraction__ProvideAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__ProvideAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getProvideAssignment_0()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__0__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__1"
    // InternalReqLNG.g:1804:1: rule__ActorInteraction__Group__1 : rule__ActorInteraction__Group__1__Impl rule__ActorInteraction__Group__2 ;
    public final void rule__ActorInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1808:1: ( rule__ActorInteraction__Group__1__Impl rule__ActorInteraction__Group__2 )
            // InternalReqLNG.g:1809:2: rule__ActorInteraction__Group__1__Impl rule__ActorInteraction__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ActorInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__2();

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
    // $ANTLR end "rule__ActorInteraction__Group__1"


    // $ANTLR start "rule__ActorInteraction__Group__1__Impl"
    // InternalReqLNG.g:1816:1: rule__ActorInteraction__Group__1__Impl : ( ( rule__ActorInteraction__The1Assignment_1 )? ) ;
    public final void rule__ActorInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1820:1: ( ( ( rule__ActorInteraction__The1Assignment_1 )? ) )
            // InternalReqLNG.g:1821:1: ( ( rule__ActorInteraction__The1Assignment_1 )? )
            {
            // InternalReqLNG.g:1821:1: ( ( rule__ActorInteraction__The1Assignment_1 )? )
            // InternalReqLNG.g:1822:2: ( rule__ActorInteraction__The1Assignment_1 )?
            {
             before(grammarAccess.getActorInteractionAccess().getThe1Assignment_1()); 
            // InternalReqLNG.g:1823:2: ( rule__ActorInteraction__The1Assignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReqLNG.g:1823:3: rule__ActorInteraction__The1Assignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActorInteraction__The1Assignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorInteractionAccess().getThe1Assignment_1()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__1__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__2"
    // InternalReqLNG.g:1831:1: rule__ActorInteraction__Group__2 : rule__ActorInteraction__Group__2__Impl rule__ActorInteraction__Group__3 ;
    public final void rule__ActorInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1835:1: ( rule__ActorInteraction__Group__2__Impl rule__ActorInteraction__Group__3 )
            // InternalReqLNG.g:1836:2: rule__ActorInteraction__Group__2__Impl rule__ActorInteraction__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ActorInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__3();

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
    // $ANTLR end "rule__ActorInteraction__Group__2"


    // $ANTLR start "rule__ActorInteraction__Group__2__Impl"
    // InternalReqLNG.g:1843:1: rule__ActorInteraction__Group__2__Impl : ( ( rule__ActorInteraction__ActorAssignment_2 ) ) ;
    public final void rule__ActorInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1847:1: ( ( ( rule__ActorInteraction__ActorAssignment_2 ) ) )
            // InternalReqLNG.g:1848:1: ( ( rule__ActorInteraction__ActorAssignment_2 ) )
            {
            // InternalReqLNG.g:1848:1: ( ( rule__ActorInteraction__ActorAssignment_2 ) )
            // InternalReqLNG.g:1849:2: ( rule__ActorInteraction__ActorAssignment_2 )
            {
             before(grammarAccess.getActorInteractionAccess().getActorAssignment_2()); 
            // InternalReqLNG.g:1850:2: ( rule__ActorInteraction__ActorAssignment_2 )
            // InternalReqLNG.g:1850:3: rule__ActorInteraction__ActorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__ActorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getActorAssignment_2()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__2__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__3"
    // InternalReqLNG.g:1858:1: rule__ActorInteraction__Group__3 : rule__ActorInteraction__Group__3__Impl rule__ActorInteraction__Group__4 ;
    public final void rule__ActorInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1862:1: ( rule__ActorInteraction__Group__3__Impl rule__ActorInteraction__Group__4 )
            // InternalReqLNG.g:1863:2: rule__ActorInteraction__Group__3__Impl rule__ActorInteraction__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ActorInteraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__4();

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
    // $ANTLR end "rule__ActorInteraction__Group__3"


    // $ANTLR start "rule__ActorInteraction__Group__3__Impl"
    // InternalReqLNG.g:1870:1: rule__ActorInteraction__Group__3__Impl : ( ( rule__ActorInteraction__WithAssignment_3 ) ) ;
    public final void rule__ActorInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1874:1: ( ( ( rule__ActorInteraction__WithAssignment_3 ) ) )
            // InternalReqLNG.g:1875:1: ( ( rule__ActorInteraction__WithAssignment_3 ) )
            {
            // InternalReqLNG.g:1875:1: ( ( rule__ActorInteraction__WithAssignment_3 ) )
            // InternalReqLNG.g:1876:2: ( rule__ActorInteraction__WithAssignment_3 )
            {
             before(grammarAccess.getActorInteractionAccess().getWithAssignment_3()); 
            // InternalReqLNG.g:1877:2: ( rule__ActorInteraction__WithAssignment_3 )
            // InternalReqLNG.g:1877:3: rule__ActorInteraction__WithAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__WithAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getWithAssignment_3()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__3__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__4"
    // InternalReqLNG.g:1885:1: rule__ActorInteraction__Group__4 : rule__ActorInteraction__Group__4__Impl rule__ActorInteraction__Group__5 ;
    public final void rule__ActorInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1889:1: ( rule__ActorInteraction__Group__4__Impl rule__ActorInteraction__Group__5 )
            // InternalReqLNG.g:1890:2: rule__ActorInteraction__Group__4__Impl rule__ActorInteraction__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ActorInteraction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__5();

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
    // $ANTLR end "rule__ActorInteraction__Group__4"


    // $ANTLR start "rule__ActorInteraction__Group__4__Impl"
    // InternalReqLNG.g:1897:1: rule__ActorInteraction__Group__4__Impl : ( ( rule__ActorInteraction__The2Assignment_4 ) ) ;
    public final void rule__ActorInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1901:1: ( ( ( rule__ActorInteraction__The2Assignment_4 ) ) )
            // InternalReqLNG.g:1902:1: ( ( rule__ActorInteraction__The2Assignment_4 ) )
            {
            // InternalReqLNG.g:1902:1: ( ( rule__ActorInteraction__The2Assignment_4 ) )
            // InternalReqLNG.g:1903:2: ( rule__ActorInteraction__The2Assignment_4 )
            {
             before(grammarAccess.getActorInteractionAccess().getThe2Assignment_4()); 
            // InternalReqLNG.g:1904:2: ( rule__ActorInteraction__The2Assignment_4 )
            // InternalReqLNG.g:1904:3: rule__ActorInteraction__The2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__The2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getThe2Assignment_4()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__4__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__5"
    // InternalReqLNG.g:1912:1: rule__ActorInteraction__Group__5 : rule__ActorInteraction__Group__5__Impl rule__ActorInteraction__Group__6 ;
    public final void rule__ActorInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1916:1: ( rule__ActorInteraction__Group__5__Impl rule__ActorInteraction__Group__6 )
            // InternalReqLNG.g:1917:2: rule__ActorInteraction__Group__5__Impl rule__ActorInteraction__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__ActorInteraction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__6();

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
    // $ANTLR end "rule__ActorInteraction__Group__5"


    // $ANTLR start "rule__ActorInteraction__Group__5__Impl"
    // InternalReqLNG.g:1924:1: rule__ActorInteraction__Group__5__Impl : ( ( rule__ActorInteraction__AbilityAssignment_5 ) ) ;
    public final void rule__ActorInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1928:1: ( ( ( rule__ActorInteraction__AbilityAssignment_5 ) ) )
            // InternalReqLNG.g:1929:1: ( ( rule__ActorInteraction__AbilityAssignment_5 ) )
            {
            // InternalReqLNG.g:1929:1: ( ( rule__ActorInteraction__AbilityAssignment_5 ) )
            // InternalReqLNG.g:1930:2: ( rule__ActorInteraction__AbilityAssignment_5 )
            {
             before(grammarAccess.getActorInteractionAccess().getAbilityAssignment_5()); 
            // InternalReqLNG.g:1931:2: ( rule__ActorInteraction__AbilityAssignment_5 )
            // InternalReqLNG.g:1931:3: rule__ActorInteraction__AbilityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__AbilityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getAbilityAssignment_5()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__5__Impl"


    // $ANTLR start "rule__ActorInteraction__Group__6"
    // InternalReqLNG.g:1939:1: rule__ActorInteraction__Group__6 : rule__ActorInteraction__Group__6__Impl ;
    public final void rule__ActorInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1943:1: ( rule__ActorInteraction__Group__6__Impl )
            // InternalReqLNG.g:1944:2: rule__ActorInteraction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__Group__6__Impl();

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
    // $ANTLR end "rule__ActorInteraction__Group__6"


    // $ANTLR start "rule__ActorInteraction__Group__6__Impl"
    // InternalReqLNG.g:1950:1: rule__ActorInteraction__Group__6__Impl : ( ( rule__ActorInteraction__ToAssignment_6 ) ) ;
    public final void rule__ActorInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1954:1: ( ( ( rule__ActorInteraction__ToAssignment_6 ) ) )
            // InternalReqLNG.g:1955:1: ( ( rule__ActorInteraction__ToAssignment_6 ) )
            {
            // InternalReqLNG.g:1955:1: ( ( rule__ActorInteraction__ToAssignment_6 ) )
            // InternalReqLNG.g:1956:2: ( rule__ActorInteraction__ToAssignment_6 )
            {
             before(grammarAccess.getActorInteractionAccess().getToAssignment_6()); 
            // InternalReqLNG.g:1957:2: ( rule__ActorInteraction__ToAssignment_6 )
            // InternalReqLNG.g:1957:3: rule__ActorInteraction__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ActorInteraction__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActorInteractionAccess().getToAssignment_6()); 

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
    // $ANTLR end "rule__ActorInteraction__Group__6__Impl"


    // $ANTLR start "rule__RequirementEnd__Group__0"
    // InternalReqLNG.g:1966:1: rule__RequirementEnd__Group__0 : rule__RequirementEnd__Group__0__Impl rule__RequirementEnd__Group__1 ;
    public final void rule__RequirementEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1970:1: ( rule__RequirementEnd__Group__0__Impl rule__RequirementEnd__Group__1 )
            // InternalReqLNG.g:1971:2: rule__RequirementEnd__Group__0__Impl rule__RequirementEnd__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RequirementEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementEnd__Group__1();

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
    // $ANTLR end "rule__RequirementEnd__Group__0"


    // $ANTLR start "rule__RequirementEnd__Group__0__Impl"
    // InternalReqLNG.g:1978:1: rule__RequirementEnd__Group__0__Impl : ( ( rule__RequirementEnd__AiAssignment_0 )? ) ;
    public final void rule__RequirementEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1982:1: ( ( ( rule__RequirementEnd__AiAssignment_0 )? ) )
            // InternalReqLNG.g:1983:1: ( ( rule__RequirementEnd__AiAssignment_0 )? )
            {
            // InternalReqLNG.g:1983:1: ( ( rule__RequirementEnd__AiAssignment_0 )? )
            // InternalReqLNG.g:1984:2: ( rule__RequirementEnd__AiAssignment_0 )?
            {
             before(grammarAccess.getRequirementEndAccess().getAiAssignment_0()); 
            // InternalReqLNG.g:1985:2: ( rule__RequirementEnd__AiAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalReqLNG.g:1985:3: rule__RequirementEnd__AiAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequirementEnd__AiAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementEndAccess().getAiAssignment_0()); 

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
    // $ANTLR end "rule__RequirementEnd__Group__0__Impl"


    // $ANTLR start "rule__RequirementEnd__Group__1"
    // InternalReqLNG.g:1993:1: rule__RequirementEnd__Group__1 : rule__RequirementEnd__Group__1__Impl rule__RequirementEnd__Group__2 ;
    public final void rule__RequirementEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1997:1: ( rule__RequirementEnd__Group__1__Impl rule__RequirementEnd__Group__2 )
            // InternalReqLNG.g:1998:2: rule__RequirementEnd__Group__1__Impl rule__RequirementEnd__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RequirementEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequirementEnd__Group__2();

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
    // $ANTLR end "rule__RequirementEnd__Group__1"


    // $ANTLR start "rule__RequirementEnd__Group__1__Impl"
    // InternalReqLNG.g:2005:1: rule__RequirementEnd__Group__1__Impl : ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) ) ;
    public final void rule__RequirementEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2009:1: ( ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) ) )
            // InternalReqLNG.g:2010:1: ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) )
            {
            // InternalReqLNG.g:2010:1: ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) )
            // InternalReqLNG.g:2011:2: ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 )
            {
             before(grammarAccess.getRequirementEndAccess().getObjectWithDetailsAssignment_1()); 
            // InternalReqLNG.g:2012:2: ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 )
            // InternalReqLNG.g:2012:3: rule__RequirementEnd__ObjectWithDetailsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequirementEnd__ObjectWithDetailsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequirementEndAccess().getObjectWithDetailsAssignment_1()); 

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
    // $ANTLR end "rule__RequirementEnd__Group__1__Impl"


    // $ANTLR start "rule__RequirementEnd__Group__2"
    // InternalReqLNG.g:2020:1: rule__RequirementEnd__Group__2 : rule__RequirementEnd__Group__2__Impl ;
    public final void rule__RequirementEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2024:1: ( rule__RequirementEnd__Group__2__Impl )
            // InternalReqLNG.g:2025:2: rule__RequirementEnd__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequirementEnd__Group__2__Impl();

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
    // $ANTLR end "rule__RequirementEnd__Group__2"


    // $ANTLR start "rule__RequirementEnd__Group__2__Impl"
    // InternalReqLNG.g:2031:1: rule__RequirementEnd__Group__2__Impl : ( '.' ) ;
    public final void rule__RequirementEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2035:1: ( ( '.' ) )
            // InternalReqLNG.g:2036:1: ( '.' )
            {
            // InternalReqLNG.g:2036:1: ( '.' )
            // InternalReqLNG.g:2037:2: '.'
            {
             before(grammarAccess.getRequirementEndAccess().getFullStopKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRequirementEndAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__RequirementEnd__Group__2__Impl"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__0"
    // InternalReqLNG.g:2047:1: rule__TextWithConceptsOrSynonyms__Group_1__0 : rule__TextWithConceptsOrSynonyms__Group_1__0__Impl rule__TextWithConceptsOrSynonyms__Group_1__1 ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2051:1: ( rule__TextWithConceptsOrSynonyms__Group_1__0__Impl rule__TextWithConceptsOrSynonyms__Group_1__1 )
            // InternalReqLNG.g:2052:2: rule__TextWithConceptsOrSynonyms__Group_1__0__Impl rule__TextWithConceptsOrSynonyms__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__TextWithConceptsOrSynonyms__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextWithConceptsOrSynonyms__Group_1__1();

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__0"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__0__Impl"
    // InternalReqLNG.g:2059:1: rule__TextWithConceptsOrSynonyms__Group_1__0__Impl : ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2063:1: ( ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* ) )
            // InternalReqLNG.g:2064:1: ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* )
            {
            // InternalReqLNG.g:2064:1: ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* )
            // InternalReqLNG.g:2065:2: ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )*
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeAssignment_1_0()); 
            // InternalReqLNG.g:2066:2: ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReqLNG.g:2066:3: rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeAssignment_1_0()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__0__Impl"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__1"
    // InternalReqLNG.g:2074:1: rule__TextWithConceptsOrSynonyms__Group_1__1 : rule__TextWithConceptsOrSynonyms__Group_1__1__Impl rule__TextWithConceptsOrSynonyms__Group_1__2 ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2078:1: ( rule__TextWithConceptsOrSynonyms__Group_1__1__Impl rule__TextWithConceptsOrSynonyms__Group_1__2 )
            // InternalReqLNG.g:2079:2: rule__TextWithConceptsOrSynonyms__Group_1__1__Impl rule__TextWithConceptsOrSynonyms__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__TextWithConceptsOrSynonyms__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextWithConceptsOrSynonyms__Group_1__2();

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__1"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__1__Impl"
    // InternalReqLNG.g:2086:1: rule__TextWithConceptsOrSynonyms__Group_1__1__Impl : ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2090:1: ( ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) ) )
            // InternalReqLNG.g:2091:1: ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) )
            {
            // InternalReqLNG.g:2091:1: ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) )
            // InternalReqLNG.g:2092:2: ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextAssignment_1_1()); 
            // InternalReqLNG.g:2093:2: ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 )
            // InternalReqLNG.g:2093:3: rule__TextWithConceptsOrSynonyms__TextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TextWithConceptsOrSynonyms__TextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextAssignment_1_1()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__1__Impl"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__2"
    // InternalReqLNG.g:2101:1: rule__TextWithConceptsOrSynonyms__Group_1__2 : rule__TextWithConceptsOrSynonyms__Group_1__2__Impl rule__TextWithConceptsOrSynonyms__Group_1__3 ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2105:1: ( rule__TextWithConceptsOrSynonyms__Group_1__2__Impl rule__TextWithConceptsOrSynonyms__Group_1__3 )
            // InternalReqLNG.g:2106:2: rule__TextWithConceptsOrSynonyms__Group_1__2__Impl rule__TextWithConceptsOrSynonyms__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__TextWithConceptsOrSynonyms__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextWithConceptsOrSynonyms__Group_1__3();

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__2"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__2__Impl"
    // InternalReqLNG.g:2113:1: rule__TextWithConceptsOrSynonyms__Group_1__2__Impl : ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2117:1: ( ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* ) )
            // InternalReqLNG.g:2118:1: ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* )
            {
            // InternalReqLNG.g:2118:1: ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* )
            // InternalReqLNG.g:2119:2: ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )*
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterAssignment_1_2()); 
            // InternalReqLNG.g:2120:2: ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalReqLNG.g:2120:3: rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterAssignment_1_2()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__2__Impl"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__3"
    // InternalReqLNG.g:2128:1: rule__TextWithConceptsOrSynonyms__Group_1__3 : rule__TextWithConceptsOrSynonyms__Group_1__3__Impl ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2132:1: ( rule__TextWithConceptsOrSynonyms__Group_1__3__Impl )
            // InternalReqLNG.g:2133:2: rule__TextWithConceptsOrSynonyms__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextWithConceptsOrSynonyms__Group_1__3__Impl();

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__3"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__Group_1__3__Impl"
    // InternalReqLNG.g:2139:1: rule__TextWithConceptsOrSynonyms__Group_1__3__Impl : ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2143:1: ( ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* ) )
            // InternalReqLNG.g:2144:1: ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* )
            {
            // InternalReqLNG.g:2144:1: ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* )
            // InternalReqLNG.g:2145:2: ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )*
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefAssignment_1_3()); 
            // InternalReqLNG.g:2146:2: ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReqLNG.g:2146:3: rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefAssignment_1_3()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__Group_1__3__Impl"


    // $ANTLR start "rule__ConceptCombination__Group__0"
    // InternalReqLNG.g:2155:1: rule__ConceptCombination__Group__0 : rule__ConceptCombination__Group__0__Impl rule__ConceptCombination__Group__1 ;
    public final void rule__ConceptCombination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2159:1: ( rule__ConceptCombination__Group__0__Impl rule__ConceptCombination__Group__1 )
            // InternalReqLNG.g:2160:2: rule__ConceptCombination__Group__0__Impl rule__ConceptCombination__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ConceptCombination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConceptCombination__Group__1();

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
    // $ANTLR end "rule__ConceptCombination__Group__0"


    // $ANTLR start "rule__ConceptCombination__Group__0__Impl"
    // InternalReqLNG.g:2167:1: rule__ConceptCombination__Group__0__Impl : ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) ) ;
    public final void rule__ConceptCombination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2171:1: ( ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) ) )
            // InternalReqLNG.g:2172:1: ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) )
            {
            // InternalReqLNG.g:2172:1: ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) )
            // InternalReqLNG.g:2173:2: ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* )
            {
            // InternalReqLNG.g:2173:2: ( ( rule__ConceptCombination__ConceptsAssignment_0 ) )
            // InternalReqLNG.g:2174:3: ( rule__ConceptCombination__ConceptsAssignment_0 )
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 
            // InternalReqLNG.g:2175:3: ( rule__ConceptCombination__ConceptsAssignment_0 )
            // InternalReqLNG.g:2175:4: rule__ConceptCombination__ConceptsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__ConceptCombination__ConceptsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 

            }

            // InternalReqLNG.g:2178:2: ( ( rule__ConceptCombination__ConceptsAssignment_0 )* )
            // InternalReqLNG.g:2179:3: ( rule__ConceptCombination__ConceptsAssignment_0 )*
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 
            // InternalReqLNG.g:2180:3: ( rule__ConceptCombination__ConceptsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalReqLNG.g:2180:4: rule__ConceptCombination__ConceptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ConceptCombination__ConceptsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 

            }


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
    // $ANTLR end "rule__ConceptCombination__Group__0__Impl"


    // $ANTLR start "rule__ConceptCombination__Group__1"
    // InternalReqLNG.g:2189:1: rule__ConceptCombination__Group__1 : rule__ConceptCombination__Group__1__Impl ;
    public final void rule__ConceptCombination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2193:1: ( rule__ConceptCombination__Group__1__Impl )
            // InternalReqLNG.g:2194:2: rule__ConceptCombination__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConceptCombination__Group__1__Impl();

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
    // $ANTLR end "rule__ConceptCombination__Group__1"


    // $ANTLR start "rule__ConceptCombination__Group__1__Impl"
    // InternalReqLNG.g:2200:1: rule__ConceptCombination__Group__1__Impl : ( ( rule__ConceptCombination__TextAssignment_1 ) ) ;
    public final void rule__ConceptCombination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2204:1: ( ( ( rule__ConceptCombination__TextAssignment_1 ) ) )
            // InternalReqLNG.g:2205:1: ( ( rule__ConceptCombination__TextAssignment_1 ) )
            {
            // InternalReqLNG.g:2205:1: ( ( rule__ConceptCombination__TextAssignment_1 ) )
            // InternalReqLNG.g:2206:2: ( rule__ConceptCombination__TextAssignment_1 )
            {
             before(grammarAccess.getConceptCombinationAccess().getTextAssignment_1()); 
            // InternalReqLNG.g:2207:2: ( rule__ConceptCombination__TextAssignment_1 )
            // InternalReqLNG.g:2207:3: rule__ConceptCombination__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConceptCombination__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptCombinationAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__ConceptCombination__Group__1__Impl"


    // $ANTLR start "rule__Glossary__Group__0"
    // InternalReqLNG.g:2216:1: rule__Glossary__Group__0 : rule__Glossary__Group__0__Impl rule__Glossary__Group__1 ;
    public final void rule__Glossary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2220:1: ( rule__Glossary__Group__0__Impl rule__Glossary__Group__1 )
            // InternalReqLNG.g:2221:2: rule__Glossary__Group__0__Impl rule__Glossary__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Glossary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Glossary__Group__1();

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
    // $ANTLR end "rule__Glossary__Group__0"


    // $ANTLR start "rule__Glossary__Group__0__Impl"
    // InternalReqLNG.g:2228:1: rule__Glossary__Group__0__Impl : ( () ) ;
    public final void rule__Glossary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2232:1: ( ( () ) )
            // InternalReqLNG.g:2233:1: ( () )
            {
            // InternalReqLNG.g:2233:1: ( () )
            // InternalReqLNG.g:2234:2: ()
            {
             before(grammarAccess.getGlossaryAccess().getGlossaryAction_0()); 
            // InternalReqLNG.g:2235:2: ()
            // InternalReqLNG.g:2235:3: 
            {
            }

             after(grammarAccess.getGlossaryAccess().getGlossaryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Glossary__Group__0__Impl"


    // $ANTLR start "rule__Glossary__Group__1"
    // InternalReqLNG.g:2243:1: rule__Glossary__Group__1 : rule__Glossary__Group__1__Impl rule__Glossary__Group__2 ;
    public final void rule__Glossary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2247:1: ( rule__Glossary__Group__1__Impl rule__Glossary__Group__2 )
            // InternalReqLNG.g:2248:2: rule__Glossary__Group__1__Impl rule__Glossary__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Glossary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Glossary__Group__2();

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
    // $ANTLR end "rule__Glossary__Group__1"


    // $ANTLR start "rule__Glossary__Group__1__Impl"
    // InternalReqLNG.g:2255:1: rule__Glossary__Group__1__Impl : ( 'Glossary' ) ;
    public final void rule__Glossary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2259:1: ( ( 'Glossary' ) )
            // InternalReqLNG.g:2260:1: ( 'Glossary' )
            {
            // InternalReqLNG.g:2260:1: ( 'Glossary' )
            // InternalReqLNG.g:2261:2: 'Glossary'
            {
             before(grammarAccess.getGlossaryAccess().getGlossaryKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGlossaryAccess().getGlossaryKeyword_1()); 

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
    // $ANTLR end "rule__Glossary__Group__1__Impl"


    // $ANTLR start "rule__Glossary__Group__2"
    // InternalReqLNG.g:2270:1: rule__Glossary__Group__2 : rule__Glossary__Group__2__Impl ;
    public final void rule__Glossary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2274:1: ( rule__Glossary__Group__2__Impl )
            // InternalReqLNG.g:2275:2: rule__Glossary__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Glossary__Group__2__Impl();

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
    // $ANTLR end "rule__Glossary__Group__2"


    // $ANTLR start "rule__Glossary__Group__2__Impl"
    // InternalReqLNG.g:2281:1: rule__Glossary__Group__2__Impl : ( ( rule__Glossary__ConceptsAssignment_2 )* ) ;
    public final void rule__Glossary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2285:1: ( ( ( rule__Glossary__ConceptsAssignment_2 )* ) )
            // InternalReqLNG.g:2286:1: ( ( rule__Glossary__ConceptsAssignment_2 )* )
            {
            // InternalReqLNG.g:2286:1: ( ( rule__Glossary__ConceptsAssignment_2 )* )
            // InternalReqLNG.g:2287:2: ( rule__Glossary__ConceptsAssignment_2 )*
            {
             before(grammarAccess.getGlossaryAccess().getConceptsAssignment_2()); 
            // InternalReqLNG.g:2288:2: ( rule__Glossary__ConceptsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30||LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalReqLNG.g:2288:3: rule__Glossary__ConceptsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Glossary__ConceptsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGlossaryAccess().getConceptsAssignment_2()); 

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
    // $ANTLR end "rule__Glossary__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalReqLNG.g:2297:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2301:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalReqLNG.g:2302:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalReqLNG.g:2309:1: rule__Function__Group__0__Impl : ( 'Function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2313:1: ( ( 'Function' ) )
            // InternalReqLNG.g:2314:1: ( 'Function' )
            {
            // InternalReqLNG.g:2314:1: ( 'Function' )
            // InternalReqLNG.g:2315:2: 'Function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalReqLNG.g:2324:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2328:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalReqLNG.g:2329:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalReqLNG.g:2336:1: rule__Function__Group__1__Impl : ( ':' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2340:1: ( ( ':' ) )
            // InternalReqLNG.g:2341:1: ( ':' )
            {
            // InternalReqLNG.g:2341:1: ( ':' )
            // InternalReqLNG.g:2342:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalReqLNG.g:2351:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2355:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalReqLNG.g:2356:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalReqLNG.g:2363:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2367:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalReqLNG.g:2368:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:2368:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalReqLNG.g:2369:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:2370:2: ( rule__Function__NameAssignment_2 )
            // InternalReqLNG.g:2370:3: rule__Function__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalReqLNG.g:2378:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2382:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalReqLNG.g:2383:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalReqLNG.g:2390:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2394:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalReqLNG.g:2395:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalReqLNG.g:2395:1: ( ( rule__Function__Group_3__0 )? )
            // InternalReqLNG.g:2396:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalReqLNG.g:2397:2: ( rule__Function__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReqLNG.g:2397:3: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalReqLNG.g:2405:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2409:1: ( rule__Function__Group__4__Impl )
            // InternalReqLNG.g:2410:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__4__Impl();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalReqLNG.g:2416:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2420:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // InternalReqLNG.g:2421:1: ( ( rule__Function__Group_4__0 )? )
            {
            // InternalReqLNG.g:2421:1: ( ( rule__Function__Group_4__0 )? )
            // InternalReqLNG.g:2422:2: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // InternalReqLNG.g:2423:2: ( rule__Function__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalReqLNG.g:2423:3: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // InternalReqLNG.g:2432:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2436:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalReqLNG.g:2437:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1();

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
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // InternalReqLNG.g:2444:1: rule__Function__Group_3__0__Impl : ( 'Synonyms' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2448:1: ( ( 'Synonyms' ) )
            // InternalReqLNG.g:2449:1: ( 'Synonyms' )
            {
            // InternalReqLNG.g:2449:1: ( 'Synonyms' )
            // InternalReqLNG.g:2450:2: 'Synonyms'
            {
             before(grammarAccess.getFunctionAccess().getSynonymsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSynonymsKeyword_3_0()); 

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
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // InternalReqLNG.g:2459:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl rule__Function__Group_3__2 ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2463:1: ( rule__Function__Group_3__1__Impl rule__Function__Group_3__2 )
            // InternalReqLNG.g:2464:2: rule__Function__Group_3__1__Impl rule__Function__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__2();

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
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // InternalReqLNG.g:2471:1: rule__Function__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2475:1: ( ( ':' ) )
            // InternalReqLNG.g:2476:1: ( ':' )
            {
            // InternalReqLNG.g:2476:1: ( ':' )
            // InternalReqLNG.g:2477:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_3__2"
    // InternalReqLNG.g:2486:1: rule__Function__Group_3__2 : rule__Function__Group_3__2__Impl rule__Function__Group_3__3 ;
    public final void rule__Function__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2490:1: ( rule__Function__Group_3__2__Impl rule__Function__Group_3__3 )
            // InternalReqLNG.g:2491:2: rule__Function__Group_3__2__Impl rule__Function__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__Function__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__3();

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
    // $ANTLR end "rule__Function__Group_3__2"


    // $ANTLR start "rule__Function__Group_3__2__Impl"
    // InternalReqLNG.g:2498:1: rule__Function__Group_3__2__Impl : ( ( rule__Function__SynonymsAssignment_3_2 ) ) ;
    public final void rule__Function__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2502:1: ( ( ( rule__Function__SynonymsAssignment_3_2 ) ) )
            // InternalReqLNG.g:2503:1: ( ( rule__Function__SynonymsAssignment_3_2 ) )
            {
            // InternalReqLNG.g:2503:1: ( ( rule__Function__SynonymsAssignment_3_2 ) )
            // InternalReqLNG.g:2504:2: ( rule__Function__SynonymsAssignment_3_2 )
            {
             before(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_2()); 
            // InternalReqLNG.g:2505:2: ( rule__Function__SynonymsAssignment_3_2 )
            // InternalReqLNG.g:2505:3: rule__Function__SynonymsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__SynonymsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_2()); 

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
    // $ANTLR end "rule__Function__Group_3__2__Impl"


    // $ANTLR start "rule__Function__Group_3__3"
    // InternalReqLNG.g:2513:1: rule__Function__Group_3__3 : rule__Function__Group_3__3__Impl ;
    public final void rule__Function__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2517:1: ( rule__Function__Group_3__3__Impl )
            // InternalReqLNG.g:2518:2: rule__Function__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3__3__Impl();

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
    // $ANTLR end "rule__Function__Group_3__3"


    // $ANTLR start "rule__Function__Group_3__3__Impl"
    // InternalReqLNG.g:2524:1: rule__Function__Group_3__3__Impl : ( ( rule__Function__Group_3_3__0 )* ) ;
    public final void rule__Function__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2528:1: ( ( ( rule__Function__Group_3_3__0 )* ) )
            // InternalReqLNG.g:2529:1: ( ( rule__Function__Group_3_3__0 )* )
            {
            // InternalReqLNG.g:2529:1: ( ( rule__Function__Group_3_3__0 )* )
            // InternalReqLNG.g:2530:2: ( rule__Function__Group_3_3__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_3()); 
            // InternalReqLNG.g:2531:2: ( rule__Function__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalReqLNG.g:2531:3: rule__Function__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Function__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Function__Group_3__3__Impl"


    // $ANTLR start "rule__Function__Group_3_3__0"
    // InternalReqLNG.g:2540:1: rule__Function__Group_3_3__0 : rule__Function__Group_3_3__0__Impl rule__Function__Group_3_3__1 ;
    public final void rule__Function__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2544:1: ( rule__Function__Group_3_3__0__Impl rule__Function__Group_3_3__1 )
            // InternalReqLNG.g:2545:2: rule__Function__Group_3_3__0__Impl rule__Function__Group_3_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3_3__1();

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
    // $ANTLR end "rule__Function__Group_3_3__0"


    // $ANTLR start "rule__Function__Group_3_3__0__Impl"
    // InternalReqLNG.g:2552:1: rule__Function__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2556:1: ( ( ',' ) )
            // InternalReqLNG.g:2557:1: ( ',' )
            {
            // InternalReqLNG.g:2557:1: ( ',' )
            // InternalReqLNG.g:2558:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Function__Group_3_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3_3__1"
    // InternalReqLNG.g:2567:1: rule__Function__Group_3_3__1 : rule__Function__Group_3_3__1__Impl ;
    public final void rule__Function__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2571:1: ( rule__Function__Group_3_3__1__Impl )
            // InternalReqLNG.g:2572:2: rule__Function__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3_3__1"


    // $ANTLR start "rule__Function__Group_3_3__1__Impl"
    // InternalReqLNG.g:2578:1: rule__Function__Group_3_3__1__Impl : ( ( rule__Function__SynonymsAssignment_3_3_1 ) ) ;
    public final void rule__Function__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2582:1: ( ( ( rule__Function__SynonymsAssignment_3_3_1 ) ) )
            // InternalReqLNG.g:2583:1: ( ( rule__Function__SynonymsAssignment_3_3_1 ) )
            {
            // InternalReqLNG.g:2583:1: ( ( rule__Function__SynonymsAssignment_3_3_1 ) )
            // InternalReqLNG.g:2584:2: ( rule__Function__SynonymsAssignment_3_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_3_1()); 
            // InternalReqLNG.g:2585:2: ( rule__Function__SynonymsAssignment_3_3_1 )
            // InternalReqLNG.g:2585:3: rule__Function__SynonymsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__SynonymsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Function__Group_3_3__1__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // InternalReqLNG.g:2594:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2598:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // InternalReqLNG.g:2599:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4__1();

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
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // InternalReqLNG.g:2606:1: rule__Function__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2610:1: ( ( 'Description' ) )
            // InternalReqLNG.g:2611:1: ( 'Description' )
            {
            // InternalReqLNG.g:2611:1: ( 'Description' )
            // InternalReqLNG.g:2612:2: 'Description'
            {
             before(grammarAccess.getFunctionAccess().getDescriptionKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getDescriptionKeyword_4_0()); 

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
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // InternalReqLNG.g:2621:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl rule__Function__Group_4__2 ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2625:1: ( rule__Function__Group_4__1__Impl rule__Function__Group_4__2 )
            // InternalReqLNG.g:2626:2: rule__Function__Group_4__1__Impl rule__Function__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4__2();

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
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // InternalReqLNG.g:2633:1: rule__Function__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2637:1: ( ( ':' ) )
            // InternalReqLNG.g:2638:1: ( ':' )
            {
            // InternalReqLNG.g:2638:1: ( ':' )
            // InternalReqLNG.g:2639:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Function__Group_4__2"
    // InternalReqLNG.g:2648:1: rule__Function__Group_4__2 : rule__Function__Group_4__2__Impl ;
    public final void rule__Function__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2652:1: ( rule__Function__Group_4__2__Impl )
            // InternalReqLNG.g:2653:2: rule__Function__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_4__2__Impl();

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
    // $ANTLR end "rule__Function__Group_4__2"


    // $ANTLR start "rule__Function__Group_4__2__Impl"
    // InternalReqLNG.g:2659:1: rule__Function__Group_4__2__Impl : ( ( rule__Function__DescriptionAssignment_4_2 )* ) ;
    public final void rule__Function__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2663:1: ( ( ( rule__Function__DescriptionAssignment_4_2 )* ) )
            // InternalReqLNG.g:2664:1: ( ( rule__Function__DescriptionAssignment_4_2 )* )
            {
            // InternalReqLNG.g:2664:1: ( ( rule__Function__DescriptionAssignment_4_2 )* )
            // InternalReqLNG.g:2665:2: ( rule__Function__DescriptionAssignment_4_2 )*
            {
             before(grammarAccess.getFunctionAccess().getDescriptionAssignment_4_2()); 
            // InternalReqLNG.g:2666:2: ( rule__Function__DescriptionAssignment_4_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_STRING)||(LA30_0>=13 && LA30_0<=18)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalReqLNG.g:2666:3: rule__Function__DescriptionAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Function__DescriptionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getDescriptionAssignment_4_2()); 

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
    // $ANTLR end "rule__Function__Group_4__2__Impl"


    // $ANTLR start "rule__DomainObject__Group__0"
    // InternalReqLNG.g:2675:1: rule__DomainObject__Group__0 : rule__DomainObject__Group__0__Impl rule__DomainObject__Group__1 ;
    public final void rule__DomainObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2679:1: ( rule__DomainObject__Group__0__Impl rule__DomainObject__Group__1 )
            // InternalReqLNG.g:2680:2: rule__DomainObject__Group__0__Impl rule__DomainObject__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group__1();

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
    // $ANTLR end "rule__DomainObject__Group__0"


    // $ANTLR start "rule__DomainObject__Group__0__Impl"
    // InternalReqLNG.g:2687:1: rule__DomainObject__Group__0__Impl : ( 'Object' ) ;
    public final void rule__DomainObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2691:1: ( ( 'Object' ) )
            // InternalReqLNG.g:2692:1: ( 'Object' )
            {
            // InternalReqLNG.g:2692:1: ( 'Object' )
            // InternalReqLNG.g:2693:2: 'Object'
            {
             before(grammarAccess.getDomainObjectAccess().getObjectKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getObjectKeyword_0()); 

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
    // $ANTLR end "rule__DomainObject__Group__0__Impl"


    // $ANTLR start "rule__DomainObject__Group__1"
    // InternalReqLNG.g:2702:1: rule__DomainObject__Group__1 : rule__DomainObject__Group__1__Impl rule__DomainObject__Group__2 ;
    public final void rule__DomainObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2706:1: ( rule__DomainObject__Group__1__Impl rule__DomainObject__Group__2 )
            // InternalReqLNG.g:2707:2: rule__DomainObject__Group__1__Impl rule__DomainObject__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__DomainObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group__2();

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
    // $ANTLR end "rule__DomainObject__Group__1"


    // $ANTLR start "rule__DomainObject__Group__1__Impl"
    // InternalReqLNG.g:2714:1: rule__DomainObject__Group__1__Impl : ( ':' ) ;
    public final void rule__DomainObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2718:1: ( ( ':' ) )
            // InternalReqLNG.g:2719:1: ( ':' )
            {
            // InternalReqLNG.g:2719:1: ( ':' )
            // InternalReqLNG.g:2720:2: ':'
            {
             before(grammarAccess.getDomainObjectAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__DomainObject__Group__1__Impl"


    // $ANTLR start "rule__DomainObject__Group__2"
    // InternalReqLNG.g:2729:1: rule__DomainObject__Group__2 : rule__DomainObject__Group__2__Impl rule__DomainObject__Group__3 ;
    public final void rule__DomainObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2733:1: ( rule__DomainObject__Group__2__Impl rule__DomainObject__Group__3 )
            // InternalReqLNG.g:2734:2: rule__DomainObject__Group__2__Impl rule__DomainObject__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__DomainObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group__3();

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
    // $ANTLR end "rule__DomainObject__Group__2"


    // $ANTLR start "rule__DomainObject__Group__2__Impl"
    // InternalReqLNG.g:2741:1: rule__DomainObject__Group__2__Impl : ( ( rule__DomainObject__NameAssignment_2 ) ) ;
    public final void rule__DomainObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2745:1: ( ( ( rule__DomainObject__NameAssignment_2 ) ) )
            // InternalReqLNG.g:2746:1: ( ( rule__DomainObject__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:2746:1: ( ( rule__DomainObject__NameAssignment_2 ) )
            // InternalReqLNG.g:2747:2: ( rule__DomainObject__NameAssignment_2 )
            {
             before(grammarAccess.getDomainObjectAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:2748:2: ( rule__DomainObject__NameAssignment_2 )
            // InternalReqLNG.g:2748:3: rule__DomainObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DomainObject__Group__2__Impl"


    // $ANTLR start "rule__DomainObject__Group__3"
    // InternalReqLNG.g:2756:1: rule__DomainObject__Group__3 : rule__DomainObject__Group__3__Impl rule__DomainObject__Group__4 ;
    public final void rule__DomainObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2760:1: ( rule__DomainObject__Group__3__Impl rule__DomainObject__Group__4 )
            // InternalReqLNG.g:2761:2: rule__DomainObject__Group__3__Impl rule__DomainObject__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DomainObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group__4();

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
    // $ANTLR end "rule__DomainObject__Group__3"


    // $ANTLR start "rule__DomainObject__Group__3__Impl"
    // InternalReqLNG.g:2768:1: rule__DomainObject__Group__3__Impl : ( ( rule__DomainObject__Group_3__0 )? ) ;
    public final void rule__DomainObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2772:1: ( ( ( rule__DomainObject__Group_3__0 )? ) )
            // InternalReqLNG.g:2773:1: ( ( rule__DomainObject__Group_3__0 )? )
            {
            // InternalReqLNG.g:2773:1: ( ( rule__DomainObject__Group_3__0 )? )
            // InternalReqLNG.g:2774:2: ( rule__DomainObject__Group_3__0 )?
            {
             before(grammarAccess.getDomainObjectAccess().getGroup_3()); 
            // InternalReqLNG.g:2775:2: ( rule__DomainObject__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalReqLNG.g:2775:3: rule__DomainObject__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainObject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainObjectAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DomainObject__Group__3__Impl"


    // $ANTLR start "rule__DomainObject__Group__4"
    // InternalReqLNG.g:2783:1: rule__DomainObject__Group__4 : rule__DomainObject__Group__4__Impl ;
    public final void rule__DomainObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2787:1: ( rule__DomainObject__Group__4__Impl )
            // InternalReqLNG.g:2788:2: rule__DomainObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__Group__4__Impl();

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
    // $ANTLR end "rule__DomainObject__Group__4"


    // $ANTLR start "rule__DomainObject__Group__4__Impl"
    // InternalReqLNG.g:2794:1: rule__DomainObject__Group__4__Impl : ( ( rule__DomainObject__Group_4__0 )? ) ;
    public final void rule__DomainObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2798:1: ( ( ( rule__DomainObject__Group_4__0 )? ) )
            // InternalReqLNG.g:2799:1: ( ( rule__DomainObject__Group_4__0 )? )
            {
            // InternalReqLNG.g:2799:1: ( ( rule__DomainObject__Group_4__0 )? )
            // InternalReqLNG.g:2800:2: ( rule__DomainObject__Group_4__0 )?
            {
             before(grammarAccess.getDomainObjectAccess().getGroup_4()); 
            // InternalReqLNG.g:2801:2: ( rule__DomainObject__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalReqLNG.g:2801:3: rule__DomainObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainObjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DomainObject__Group__4__Impl"


    // $ANTLR start "rule__DomainObject__Group_3__0"
    // InternalReqLNG.g:2810:1: rule__DomainObject__Group_3__0 : rule__DomainObject__Group_3__0__Impl rule__DomainObject__Group_3__1 ;
    public final void rule__DomainObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2814:1: ( rule__DomainObject__Group_3__0__Impl rule__DomainObject__Group_3__1 )
            // InternalReqLNG.g:2815:2: rule__DomainObject__Group_3__0__Impl rule__DomainObject__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_3__1();

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
    // $ANTLR end "rule__DomainObject__Group_3__0"


    // $ANTLR start "rule__DomainObject__Group_3__0__Impl"
    // InternalReqLNG.g:2822:1: rule__DomainObject__Group_3__0__Impl : ( 'Synonyms' ) ;
    public final void rule__DomainObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2826:1: ( ( 'Synonyms' ) )
            // InternalReqLNG.g:2827:1: ( 'Synonyms' )
            {
            // InternalReqLNG.g:2827:1: ( 'Synonyms' )
            // InternalReqLNG.g:2828:2: 'Synonyms'
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getSynonymsKeyword_3_0()); 

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
    // $ANTLR end "rule__DomainObject__Group_3__0__Impl"


    // $ANTLR start "rule__DomainObject__Group_3__1"
    // InternalReqLNG.g:2837:1: rule__DomainObject__Group_3__1 : rule__DomainObject__Group_3__1__Impl rule__DomainObject__Group_3__2 ;
    public final void rule__DomainObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2841:1: ( rule__DomainObject__Group_3__1__Impl rule__DomainObject__Group_3__2 )
            // InternalReqLNG.g:2842:2: rule__DomainObject__Group_3__1__Impl rule__DomainObject__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__DomainObject__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_3__2();

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
    // $ANTLR end "rule__DomainObject__Group_3__1"


    // $ANTLR start "rule__DomainObject__Group_3__1__Impl"
    // InternalReqLNG.g:2849:1: rule__DomainObject__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DomainObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2853:1: ( ( ':' ) )
            // InternalReqLNG.g:2854:1: ( ':' )
            {
            // InternalReqLNG.g:2854:1: ( ':' )
            // InternalReqLNG.g:2855:2: ':'
            {
             before(grammarAccess.getDomainObjectAccess().getColonKeyword_3_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getColonKeyword_3_1()); 

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
    // $ANTLR end "rule__DomainObject__Group_3__1__Impl"


    // $ANTLR start "rule__DomainObject__Group_3__2"
    // InternalReqLNG.g:2864:1: rule__DomainObject__Group_3__2 : rule__DomainObject__Group_3__2__Impl rule__DomainObject__Group_3__3 ;
    public final void rule__DomainObject__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2868:1: ( rule__DomainObject__Group_3__2__Impl rule__DomainObject__Group_3__3 )
            // InternalReqLNG.g:2869:2: rule__DomainObject__Group_3__2__Impl rule__DomainObject__Group_3__3
            {
            pushFollow(FOLLOW_26);
            rule__DomainObject__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_3__3();

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
    // $ANTLR end "rule__DomainObject__Group_3__2"


    // $ANTLR start "rule__DomainObject__Group_3__2__Impl"
    // InternalReqLNG.g:2876:1: rule__DomainObject__Group_3__2__Impl : ( ( rule__DomainObject__SynonymsAssignment_3_2 ) ) ;
    public final void rule__DomainObject__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2880:1: ( ( ( rule__DomainObject__SynonymsAssignment_3_2 ) ) )
            // InternalReqLNG.g:2881:1: ( ( rule__DomainObject__SynonymsAssignment_3_2 ) )
            {
            // InternalReqLNG.g:2881:1: ( ( rule__DomainObject__SynonymsAssignment_3_2 ) )
            // InternalReqLNG.g:2882:2: ( rule__DomainObject__SynonymsAssignment_3_2 )
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_2()); 
            // InternalReqLNG.g:2883:2: ( rule__DomainObject__SynonymsAssignment_3_2 )
            // InternalReqLNG.g:2883:3: rule__DomainObject__SynonymsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__SynonymsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_2()); 

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
    // $ANTLR end "rule__DomainObject__Group_3__2__Impl"


    // $ANTLR start "rule__DomainObject__Group_3__3"
    // InternalReqLNG.g:2891:1: rule__DomainObject__Group_3__3 : rule__DomainObject__Group_3__3__Impl ;
    public final void rule__DomainObject__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2895:1: ( rule__DomainObject__Group_3__3__Impl )
            // InternalReqLNG.g:2896:2: rule__DomainObject__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_3__3__Impl();

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
    // $ANTLR end "rule__DomainObject__Group_3__3"


    // $ANTLR start "rule__DomainObject__Group_3__3__Impl"
    // InternalReqLNG.g:2902:1: rule__DomainObject__Group_3__3__Impl : ( ( rule__DomainObject__Group_3_3__0 )* ) ;
    public final void rule__DomainObject__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2906:1: ( ( ( rule__DomainObject__Group_3_3__0 )* ) )
            // InternalReqLNG.g:2907:1: ( ( rule__DomainObject__Group_3_3__0 )* )
            {
            // InternalReqLNG.g:2907:1: ( ( rule__DomainObject__Group_3_3__0 )* )
            // InternalReqLNG.g:2908:2: ( rule__DomainObject__Group_3_3__0 )*
            {
             before(grammarAccess.getDomainObjectAccess().getGroup_3_3()); 
            // InternalReqLNG.g:2909:2: ( rule__DomainObject__Group_3_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==32) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalReqLNG.g:2909:3: rule__DomainObject__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__DomainObject__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getDomainObjectAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__DomainObject__Group_3__3__Impl"


    // $ANTLR start "rule__DomainObject__Group_3_3__0"
    // InternalReqLNG.g:2918:1: rule__DomainObject__Group_3_3__0 : rule__DomainObject__Group_3_3__0__Impl rule__DomainObject__Group_3_3__1 ;
    public final void rule__DomainObject__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2922:1: ( rule__DomainObject__Group_3_3__0__Impl rule__DomainObject__Group_3_3__1 )
            // InternalReqLNG.g:2923:2: rule__DomainObject__Group_3_3__0__Impl rule__DomainObject__Group_3_3__1
            {
            pushFollow(FOLLOW_8);
            rule__DomainObject__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_3_3__1();

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
    // $ANTLR end "rule__DomainObject__Group_3_3__0"


    // $ANTLR start "rule__DomainObject__Group_3_3__0__Impl"
    // InternalReqLNG.g:2930:1: rule__DomainObject__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__DomainObject__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2934:1: ( ( ',' ) )
            // InternalReqLNG.g:2935:1: ( ',' )
            {
            // InternalReqLNG.g:2935:1: ( ',' )
            // InternalReqLNG.g:2936:2: ','
            {
             before(grammarAccess.getDomainObjectAccess().getCommaKeyword_3_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__DomainObject__Group_3_3__0__Impl"


    // $ANTLR start "rule__DomainObject__Group_3_3__1"
    // InternalReqLNG.g:2945:1: rule__DomainObject__Group_3_3__1 : rule__DomainObject__Group_3_3__1__Impl ;
    public final void rule__DomainObject__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2949:1: ( rule__DomainObject__Group_3_3__1__Impl )
            // InternalReqLNG.g:2950:2: rule__DomainObject__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__DomainObject__Group_3_3__1"


    // $ANTLR start "rule__DomainObject__Group_3_3__1__Impl"
    // InternalReqLNG.g:2956:1: rule__DomainObject__Group_3_3__1__Impl : ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) ) ;
    public final void rule__DomainObject__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2960:1: ( ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) ) )
            // InternalReqLNG.g:2961:1: ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) )
            {
            // InternalReqLNG.g:2961:1: ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) )
            // InternalReqLNG.g:2962:2: ( rule__DomainObject__SynonymsAssignment_3_3_1 )
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_3_1()); 
            // InternalReqLNG.g:2963:2: ( rule__DomainObject__SynonymsAssignment_3_3_1 )
            // InternalReqLNG.g:2963:3: rule__DomainObject__SynonymsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__SynonymsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__DomainObject__Group_3_3__1__Impl"


    // $ANTLR start "rule__DomainObject__Group_4__0"
    // InternalReqLNG.g:2972:1: rule__DomainObject__Group_4__0 : rule__DomainObject__Group_4__0__Impl rule__DomainObject__Group_4__1 ;
    public final void rule__DomainObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2976:1: ( rule__DomainObject__Group_4__0__Impl rule__DomainObject__Group_4__1 )
            // InternalReqLNG.g:2977:2: rule__DomainObject__Group_4__0__Impl rule__DomainObject__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_4__1();

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
    // $ANTLR end "rule__DomainObject__Group_4__0"


    // $ANTLR start "rule__DomainObject__Group_4__0__Impl"
    // InternalReqLNG.g:2984:1: rule__DomainObject__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__DomainObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2988:1: ( ( 'Description' ) )
            // InternalReqLNG.g:2989:1: ( 'Description' )
            {
            // InternalReqLNG.g:2989:1: ( 'Description' )
            // InternalReqLNG.g:2990:2: 'Description'
            {
             before(grammarAccess.getDomainObjectAccess().getDescriptionKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getDescriptionKeyword_4_0()); 

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
    // $ANTLR end "rule__DomainObject__Group_4__0__Impl"


    // $ANTLR start "rule__DomainObject__Group_4__1"
    // InternalReqLNG.g:2999:1: rule__DomainObject__Group_4__1 : rule__DomainObject__Group_4__1__Impl rule__DomainObject__Group_4__2 ;
    public final void rule__DomainObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3003:1: ( rule__DomainObject__Group_4__1__Impl rule__DomainObject__Group_4__2 )
            // InternalReqLNG.g:3004:2: rule__DomainObject__Group_4__1__Impl rule__DomainObject__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__DomainObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_4__2();

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
    // $ANTLR end "rule__DomainObject__Group_4__1"


    // $ANTLR start "rule__DomainObject__Group_4__1__Impl"
    // InternalReqLNG.g:3011:1: rule__DomainObject__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DomainObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3015:1: ( ( ':' ) )
            // InternalReqLNG.g:3016:1: ( ':' )
            {
            // InternalReqLNG.g:3016:1: ( ':' )
            // InternalReqLNG.g:3017:2: ':'
            {
             before(grammarAccess.getDomainObjectAccess().getColonKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDomainObjectAccess().getColonKeyword_4_1()); 

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
    // $ANTLR end "rule__DomainObject__Group_4__1__Impl"


    // $ANTLR start "rule__DomainObject__Group_4__2"
    // InternalReqLNG.g:3026:1: rule__DomainObject__Group_4__2 : rule__DomainObject__Group_4__2__Impl ;
    public final void rule__DomainObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3030:1: ( rule__DomainObject__Group_4__2__Impl )
            // InternalReqLNG.g:3031:2: rule__DomainObject__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainObject__Group_4__2__Impl();

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
    // $ANTLR end "rule__DomainObject__Group_4__2"


    // $ANTLR start "rule__DomainObject__Group_4__2__Impl"
    // InternalReqLNG.g:3037:1: rule__DomainObject__Group_4__2__Impl : ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) ) ;
    public final void rule__DomainObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3041:1: ( ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) ) )
            // InternalReqLNG.g:3042:1: ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) )
            {
            // InternalReqLNG.g:3042:1: ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) )
            // InternalReqLNG.g:3043:2: ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* )
            {
            // InternalReqLNG.g:3043:2: ( ( rule__DomainObject__DescriptionAssignment_4_2 ) )
            // InternalReqLNG.g:3044:3: ( rule__DomainObject__DescriptionAssignment_4_2 )
            {
             before(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 
            // InternalReqLNG.g:3045:3: ( rule__DomainObject__DescriptionAssignment_4_2 )
            // InternalReqLNG.g:3045:4: rule__DomainObject__DescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_11);
            rule__DomainObject__DescriptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 

            }

            // InternalReqLNG.g:3048:2: ( ( rule__DomainObject__DescriptionAssignment_4_2 )* )
            // InternalReqLNG.g:3049:3: ( rule__DomainObject__DescriptionAssignment_4_2 )*
            {
             before(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 
            // InternalReqLNG.g:3050:3: ( rule__DomainObject__DescriptionAssignment_4_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_WORD && LA34_0<=RULE_STRING)||(LA34_0>=13 && LA34_0<=18)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalReqLNG.g:3050:4: rule__DomainObject__DescriptionAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DomainObject__DescriptionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 

            }


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
    // $ANTLR end "rule__DomainObject__Group_4__2__Impl"


    // $ANTLR start "rule__RequirementDocument__EntitiesAssignment_0_0"
    // InternalReqLNG.g:3060:1: rule__RequirementDocument__EntitiesAssignment_0_0 : ( ruleEntity ) ;
    public final void rule__RequirementDocument__EntitiesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3064:1: ( ( ruleEntity ) )
            // InternalReqLNG.g:3065:2: ( ruleEntity )
            {
            // InternalReqLNG.g:3065:2: ( ruleEntity )
            // InternalReqLNG.g:3066:3: ruleEntity
            {
             before(grammarAccess.getRequirementDocumentAccess().getEntitiesEntityParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getRequirementDocumentAccess().getEntitiesEntityParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__RequirementDocument__EntitiesAssignment_0_0"


    // $ANTLR start "rule__RequirementDocument__RequirementAssignment_0_1"
    // InternalReqLNG.g:3075:1: rule__RequirementDocument__RequirementAssignment_0_1 : ( ruleRequirement ) ;
    public final void rule__RequirementDocument__RequirementAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3079:1: ( ( ruleRequirement ) )
            // InternalReqLNG.g:3080:2: ( ruleRequirement )
            {
            // InternalReqLNG.g:3080:2: ( ruleRequirement )
            // InternalReqLNG.g:3081:3: ruleRequirement
            {
             before(grammarAccess.getRequirementDocumentAccess().getRequirementRequirementParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementDocumentAccess().getRequirementRequirementParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__RequirementDocument__RequirementAssignment_0_1"


    // $ANTLR start "rule__RequirementDocument__GlossaryAssignment_1"
    // InternalReqLNG.g:3090:1: rule__RequirementDocument__GlossaryAssignment_1 : ( ruleGlossary ) ;
    public final void rule__RequirementDocument__GlossaryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3094:1: ( ( ruleGlossary ) )
            // InternalReqLNG.g:3095:2: ( ruleGlossary )
            {
            // InternalReqLNG.g:3095:2: ( ruleGlossary )
            // InternalReqLNG.g:3096:3: ruleGlossary
            {
             before(grammarAccess.getRequirementDocumentAccess().getGlossaryGlossaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGlossary();

            state._fsp--;

             after(grammarAccess.getRequirementDocumentAccess().getGlossaryGlossaryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RequirementDocument__GlossaryAssignment_1"


    // $ANTLR start "rule__Actor__NameAssignment_2"
    // InternalReqLNG.g:3105:1: rule__Actor__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Actor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3109:1: ( ( ruleText ) )
            // InternalReqLNG.g:3110:2: ( ruleText )
            {
            // InternalReqLNG.g:3110:2: ( ruleText )
            // InternalReqLNG.g:3111:3: ruleText
            {
             before(grammarAccess.getActorAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getActorAccess().getNameTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Actor__NameAssignment_2"


    // $ANTLR start "rule__Actor__DescriptionAssignment_3"
    // InternalReqLNG.g:3120:1: rule__Actor__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Actor__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3124:1: ( ( ruleDescription ) )
            // InternalReqLNG.g:3125:2: ( ruleDescription )
            {
            // InternalReqLNG.g:3125:2: ( ruleDescription )
            // InternalReqLNG.g:3126:3: ruleDescription
            {
             before(grammarAccess.getActorAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getActorAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Actor__DescriptionAssignment_3"


    // $ANTLR start "rule__System__NameAssignment_2"
    // InternalReqLNG.g:3135:1: rule__System__NameAssignment_2 : ( ruleText ) ;
    public final void rule__System__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3139:1: ( ( ruleText ) )
            // InternalReqLNG.g:3140:2: ( ruleText )
            {
            // InternalReqLNG.g:3140:2: ( ruleText )
            // InternalReqLNG.g:3141:3: ruleText
            {
             before(grammarAccess.getSystemAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNameTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_2"


    // $ANTLR start "rule__System__DescriptionAssignment_3"
    // InternalReqLNG.g:3150:1: rule__System__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__System__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3154:1: ( ( ruleDescription ) )
            // InternalReqLNG.g:3155:2: ( ruleDescription )
            {
            // InternalReqLNG.g:3155:2: ( ruleDescription )
            // InternalReqLNG.g:3156:3: ruleDescription
            {
             before(grammarAccess.getSystemAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__DescriptionAssignment_3"


    // $ANTLR start "rule__Description__TextAssignment_2"
    // InternalReqLNG.g:3165:1: rule__Description__TextAssignment_2 : ( ruleSentenceWithReferences ) ;
    public final void rule__Description__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3169:1: ( ( ruleSentenceWithReferences ) )
            // InternalReqLNG.g:3170:2: ( ruleSentenceWithReferences )
            {
            // InternalReqLNG.g:3170:2: ( ruleSentenceWithReferences )
            // InternalReqLNG.g:3171:3: ruleSentenceWithReferences
            {
             before(grammarAccess.getDescriptionAccess().getTextSentenceWithReferencesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenceWithReferences();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getTextSentenceWithReferencesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Description__TextAssignment_2"


    // $ANTLR start "rule__SentenceWithReferences__TextWithReferencesAssignment_0"
    // InternalReqLNG.g:3180:1: rule__SentenceWithReferences__TextWithReferencesAssignment_0 : ( ruleTextWithReferences ) ;
    public final void rule__SentenceWithReferences__TextWithReferencesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3184:1: ( ( ruleTextWithReferences ) )
            // InternalReqLNG.g:3185:2: ( ruleTextWithReferences )
            {
            // InternalReqLNG.g:3185:2: ( ruleTextWithReferences )
            // InternalReqLNG.g:3186:3: ruleTextWithReferences
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesTextWithReferencesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextWithReferences();

            state._fsp--;

             after(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesTextWithReferencesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SentenceWithReferences__TextWithReferencesAssignment_0"


    // $ANTLR start "rule__SentenceWithReferences__PunctuationAssignment_1"
    // InternalReqLNG.g:3195:1: rule__SentenceWithReferences__PunctuationAssignment_1 : ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) ) ;
    public final void rule__SentenceWithReferences__PunctuationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3199:1: ( ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) ) )
            // InternalReqLNG.g:3200:2: ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) )
            {
            // InternalReqLNG.g:3200:2: ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) )
            // InternalReqLNG.g:3201:3: ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAlternatives_1_0()); 
            // InternalReqLNG.g:3202:3: ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 )
            // InternalReqLNG.g:3202:4: rule__SentenceWithReferences__PunctuationAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SentenceWithReferences__PunctuationAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAlternatives_1_0()); 

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
    // $ANTLR end "rule__SentenceWithReferences__PunctuationAssignment_1"


    // $ANTLR start "rule__TextWithReferences__OnlyRefsAssignment_0"
    // InternalReqLNG.g:3210:1: rule__TextWithReferences__OnlyRefsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithReferences__OnlyRefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3214:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3215:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3215:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3216:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntityCrossReference_0_0()); 
            // InternalReqLNG.g:3217:3: ( RULE_STRING )
            // InternalReqLNG.g:3218:4: RULE_STRING
            {
             before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitySTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitySTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntityCrossReference_0_0()); 

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
    // $ANTLR end "rule__TextWithReferences__OnlyRefsAssignment_0"


    // $ANTLR start "rule__TextWithReferences__RefBeforeAssignment_1_0"
    // InternalReqLNG.g:3229:1: rule__TextWithReferences__RefBeforeAssignment_1_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithReferences__RefBeforeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3233:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3234:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3234:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3235:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntityCrossReference_1_0_0()); 
            // InternalReqLNG.g:3236:3: ( RULE_STRING )
            // InternalReqLNG.g:3237:4: RULE_STRING
            {
             before(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitySTRINGTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitySTRINGTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntityCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__TextWithReferences__RefBeforeAssignment_1_0"


    // $ANTLR start "rule__TextWithReferences__TextAssignment_1_1"
    // InternalReqLNG.g:3248:1: rule__TextWithReferences__TextAssignment_1_1 : ( ruleText ) ;
    public final void rule__TextWithReferences__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3252:1: ( ( ruleText ) )
            // InternalReqLNG.g:3253:2: ( ruleText )
            {
            // InternalReqLNG.g:3253:2: ( ruleText )
            // InternalReqLNG.g:3254:3: ruleText
            {
             before(grammarAccess.getTextWithReferencesAccess().getTextTextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextWithReferencesAccess().getTextTextParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TextWithReferences__TextAssignment_1_1"


    // $ANTLR start "rule__TextWithReferences__AfterAssignment_1_2"
    // InternalReqLNG.g:3263:1: rule__TextWithReferences__AfterAssignment_1_2 : ( ruleReferenceCombination ) ;
    public final void rule__TextWithReferences__AfterAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3267:1: ( ( ruleReferenceCombination ) )
            // InternalReqLNG.g:3268:2: ( ruleReferenceCombination )
            {
            // InternalReqLNG.g:3268:2: ( ruleReferenceCombination )
            // InternalReqLNG.g:3269:3: ruleReferenceCombination
            {
             before(grammarAccess.getTextWithReferencesAccess().getAfterReferenceCombinationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReferenceCombination();

            state._fsp--;

             after(grammarAccess.getTextWithReferencesAccess().getAfterReferenceCombinationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__TextWithReferences__AfterAssignment_1_2"


    // $ANTLR start "rule__TextWithReferences__FinalRefAssignment_1_3"
    // InternalReqLNG.g:3278:1: rule__TextWithReferences__FinalRefAssignment_1_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithReferences__FinalRefAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3282:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3283:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3283:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3284:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithReferencesAccess().getFinalRefEntityCrossReference_1_3_0()); 
            // InternalReqLNG.g:3285:3: ( RULE_STRING )
            // InternalReqLNG.g:3286:4: RULE_STRING
            {
             before(grammarAccess.getTextWithReferencesAccess().getFinalRefEntitySTRINGTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithReferencesAccess().getFinalRefEntitySTRINGTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getTextWithReferencesAccess().getFinalRefEntityCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__TextWithReferences__FinalRefAssignment_1_3"


    // $ANTLR start "rule__ReferenceCombination__RefsAssignment_0"
    // InternalReqLNG.g:3297:1: rule__ReferenceCombination__RefsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__ReferenceCombination__RefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3301:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3302:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3302:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3303:3: ( RULE_STRING )
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsEntityCrossReference_0_0()); 
            // InternalReqLNG.g:3304:3: ( RULE_STRING )
            // InternalReqLNG.g:3305:4: RULE_STRING
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsEntitySTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceCombinationAccess().getRefsEntitySTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceCombinationAccess().getRefsEntityCrossReference_0_0()); 

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
    // $ANTLR end "rule__ReferenceCombination__RefsAssignment_0"


    // $ANTLR start "rule__ReferenceCombination__TextAssignment_1"
    // InternalReqLNG.g:3316:1: rule__ReferenceCombination__TextAssignment_1 : ( ruleText ) ;
    public final void rule__ReferenceCombination__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3320:1: ( ( ruleText ) )
            // InternalReqLNG.g:3321:2: ( ruleText )
            {
            // InternalReqLNG.g:3321:2: ( ruleText )
            // InternalReqLNG.g:3322:3: ruleText
            {
             before(grammarAccess.getReferenceCombinationAccess().getTextTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getReferenceCombinationAccess().getTextTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ReferenceCombination__TextAssignment_1"


    // $ANTLR start "rule__ConditionalRequirement__ConditionAssignment_0"
    // InternalReqLNG.g:3331:1: rule__ConditionalRequirement__ConditionAssignment_0 : ( rulePrecondition ) ;
    public final void rule__ConditionalRequirement__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3335:1: ( ( rulePrecondition ) )
            // InternalReqLNG.g:3336:2: ( rulePrecondition )
            {
            // InternalReqLNG.g:3336:2: ( rulePrecondition )
            // InternalReqLNG.g:3337:3: rulePrecondition
            {
             before(grammarAccess.getConditionalRequirementAccess().getConditionPreconditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getConditionalRequirementAccess().getConditionPreconditionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalRequirement__ConditionAssignment_0"


    // $ANTLR start "rule__ConditionalRequirement__SystemAssignment_1"
    // InternalReqLNG.g:3346:1: rule__ConditionalRequirement__SystemAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ConditionalRequirement__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3350:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3351:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3351:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3352:3: ( RULE_STRING )
            {
             before(grammarAccess.getConditionalRequirementAccess().getSystemSystemCrossReference_1_0()); 
            // InternalReqLNG.g:3353:3: ( RULE_STRING )
            // InternalReqLNG.g:3354:4: RULE_STRING
            {
             before(grammarAccess.getConditionalRequirementAccess().getSystemSystemSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionalRequirementAccess().getSystemSystemSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConditionalRequirementAccess().getSystemSystemCrossReference_1_0()); 

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
    // $ANTLR end "rule__ConditionalRequirement__SystemAssignment_1"


    // $ANTLR start "rule__ConditionalRequirement__LiabilityAssignment_2"
    // InternalReqLNG.g:3365:1: rule__ConditionalRequirement__LiabilityAssignment_2 : ( ruleLiability ) ;
    public final void rule__ConditionalRequirement__LiabilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3369:1: ( ( ruleLiability ) )
            // InternalReqLNG.g:3370:2: ( ruleLiability )
            {
            // InternalReqLNG.g:3370:2: ( ruleLiability )
            // InternalReqLNG.g:3371:3: ruleLiability
            {
             before(grammarAccess.getConditionalRequirementAccess().getLiabilityLiabilityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiability();

            state._fsp--;

             after(grammarAccess.getConditionalRequirementAccess().getLiabilityLiabilityEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConditionalRequirement__LiabilityAssignment_2"


    // $ANTLR start "rule__ConditionalRequirement__EndAssignment_3"
    // InternalReqLNG.g:3380:1: rule__ConditionalRequirement__EndAssignment_3 : ( ruleRequirementEnd ) ;
    public final void rule__ConditionalRequirement__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3384:1: ( ( ruleRequirementEnd ) )
            // InternalReqLNG.g:3385:2: ( ruleRequirementEnd )
            {
            // InternalReqLNG.g:3385:2: ( ruleRequirementEnd )
            // InternalReqLNG.g:3386:3: ruleRequirementEnd
            {
             before(grammarAccess.getConditionalRequirementAccess().getEndRequirementEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirementEnd();

            state._fsp--;

             after(grammarAccess.getConditionalRequirementAccess().getEndRequirementEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConditionalRequirement__EndAssignment_3"


    // $ANTLR start "rule__UnconditionalRequirement__TheAssignment_0"
    // InternalReqLNG.g:3395:1: rule__UnconditionalRequirement__TheAssignment_0 : ( ( 'The' ) ) ;
    public final void rule__UnconditionalRequirement__TheAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3399:1: ( ( ( 'The' ) ) )
            // InternalReqLNG.g:3400:2: ( ( 'The' ) )
            {
            // InternalReqLNG.g:3400:2: ( ( 'The' ) )
            // InternalReqLNG.g:3401:3: ( 'The' )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0()); 
            // InternalReqLNG.g:3402:3: ( 'The' )
            // InternalReqLNG.g:3403:4: 'The'
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0()); 

            }

             after(grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__TheAssignment_0"


    // $ANTLR start "rule__UnconditionalRequirement__SystemAssignment_1"
    // InternalReqLNG.g:3414:1: rule__UnconditionalRequirement__SystemAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__UnconditionalRequirement__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3418:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3419:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3419:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3420:3: ( RULE_STRING )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getSystemSystemCrossReference_1_0()); 
            // InternalReqLNG.g:3421:3: ( RULE_STRING )
            // InternalReqLNG.g:3422:4: RULE_STRING
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getSystemSystemSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUnconditionalRequirementAccess().getSystemSystemSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUnconditionalRequirementAccess().getSystemSystemCrossReference_1_0()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__SystemAssignment_1"


    // $ANTLR start "rule__UnconditionalRequirement__LiabilityAssignment_2"
    // InternalReqLNG.g:3433:1: rule__UnconditionalRequirement__LiabilityAssignment_2 : ( ruleLiability ) ;
    public final void rule__UnconditionalRequirement__LiabilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3437:1: ( ( ruleLiability ) )
            // InternalReqLNG.g:3438:2: ( ruleLiability )
            {
            // InternalReqLNG.g:3438:2: ( ruleLiability )
            // InternalReqLNG.g:3439:3: ruleLiability
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getLiabilityLiabilityEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiability();

            state._fsp--;

             after(grammarAccess.getUnconditionalRequirementAccess().getLiabilityLiabilityEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__LiabilityAssignment_2"


    // $ANTLR start "rule__UnconditionalRequirement__EndAssignment_3"
    // InternalReqLNG.g:3448:1: rule__UnconditionalRequirement__EndAssignment_3 : ( ruleRequirementEnd ) ;
    public final void rule__UnconditionalRequirement__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3452:1: ( ( ruleRequirementEnd ) )
            // InternalReqLNG.g:3453:2: ( ruleRequirementEnd )
            {
            // InternalReqLNG.g:3453:2: ( ruleRequirementEnd )
            // InternalReqLNG.g:3454:3: ruleRequirementEnd
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getEndRequirementEndParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirementEnd();

            state._fsp--;

             after(grammarAccess.getUnconditionalRequirementAccess().getEndRequirementEndParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UnconditionalRequirement__EndAssignment_3"


    // $ANTLR start "rule__Precondition__ConditionalAssignment_0"
    // InternalReqLNG.g:3463:1: rule__Precondition__ConditionalAssignment_0 : ( ruleConditional ) ;
    public final void rule__Precondition__ConditionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3467:1: ( ( ruleConditional ) )
            // InternalReqLNG.g:3468:2: ( ruleConditional )
            {
            // InternalReqLNG.g:3468:2: ( ruleConditional )
            // InternalReqLNG.g:3469:3: ruleConditional
            {
             before(grammarAccess.getPreconditionAccess().getConditionalConditionalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getConditionalConditionalParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Precondition__ConditionalAssignment_0"


    // $ANTLR start "rule__Precondition__ConditionAssignment_1"
    // InternalReqLNG.g:3478:1: rule__Precondition__ConditionAssignment_1 : ( ruleTextWithReferences ) ;
    public final void rule__Precondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3482:1: ( ( ruleTextWithReferences ) )
            // InternalReqLNG.g:3483:2: ( ruleTextWithReferences )
            {
            // InternalReqLNG.g:3483:2: ( ruleTextWithReferences )
            // InternalReqLNG.g:3484:3: ruleTextWithReferences
            {
             before(grammarAccess.getPreconditionAccess().getConditionTextWithReferencesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextWithReferences();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getConditionTextWithReferencesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Precondition__ConditionAssignment_1"


    // $ANTLR start "rule__ActorInteraction__ProvideAssignment_0"
    // InternalReqLNG.g:3493:1: rule__ActorInteraction__ProvideAssignment_0 : ( ( 'provide' ) ) ;
    public final void rule__ActorInteraction__ProvideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3497:1: ( ( ( 'provide' ) ) )
            // InternalReqLNG.g:3498:2: ( ( 'provide' ) )
            {
            // InternalReqLNG.g:3498:2: ( ( 'provide' ) )
            // InternalReqLNG.g:3499:3: ( 'provide' )
            {
             before(grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0()); 
            // InternalReqLNG.g:3500:3: ( 'provide' )
            // InternalReqLNG.g:3501:4: 'provide'
            {
             before(grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0()); 

            }

             after(grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0()); 

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
    // $ANTLR end "rule__ActorInteraction__ProvideAssignment_0"


    // $ANTLR start "rule__ActorInteraction__The1Assignment_1"
    // InternalReqLNG.g:3512:1: rule__ActorInteraction__The1Assignment_1 : ( ( 'the' ) ) ;
    public final void rule__ActorInteraction__The1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3516:1: ( ( ( 'the' ) ) )
            // InternalReqLNG.g:3517:2: ( ( 'the' ) )
            {
            // InternalReqLNG.g:3517:2: ( ( 'the' ) )
            // InternalReqLNG.g:3518:3: ( 'the' )
            {
             before(grammarAccess.getActorInteractionAccess().getThe1TheKeyword_1_0()); 
            // InternalReqLNG.g:3519:3: ( 'the' )
            // InternalReqLNG.g:3520:4: 'the'
            {
             before(grammarAccess.getActorInteractionAccess().getThe1TheKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getThe1TheKeyword_1_0()); 

            }

             after(grammarAccess.getActorInteractionAccess().getThe1TheKeyword_1_0()); 

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
    // $ANTLR end "rule__ActorInteraction__The1Assignment_1"


    // $ANTLR start "rule__ActorInteraction__ActorAssignment_2"
    // InternalReqLNG.g:3531:1: rule__ActorInteraction__ActorAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ActorInteraction__ActorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3535:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3536:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3536:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3537:3: ( RULE_STRING )
            {
             before(grammarAccess.getActorInteractionAccess().getActorActorCrossReference_2_0()); 
            // InternalReqLNG.g:3538:3: ( RULE_STRING )
            // InternalReqLNG.g:3539:4: RULE_STRING
            {
             before(grammarAccess.getActorInteractionAccess().getActorActorSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getActorActorSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getActorInteractionAccess().getActorActorCrossReference_2_0()); 

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
    // $ANTLR end "rule__ActorInteraction__ActorAssignment_2"


    // $ANTLR start "rule__ActorInteraction__WithAssignment_3"
    // InternalReqLNG.g:3550:1: rule__ActorInteraction__WithAssignment_3 : ( ( 'with' ) ) ;
    public final void rule__ActorInteraction__WithAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3554:1: ( ( ( 'with' ) ) )
            // InternalReqLNG.g:3555:2: ( ( 'with' ) )
            {
            // InternalReqLNG.g:3555:2: ( ( 'with' ) )
            // InternalReqLNG.g:3556:3: ( 'with' )
            {
             before(grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0()); 
            // InternalReqLNG.g:3557:3: ( 'with' )
            // InternalReqLNG.g:3558:4: 'with'
            {
             before(grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0()); 

            }

             after(grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0()); 

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
    // $ANTLR end "rule__ActorInteraction__WithAssignment_3"


    // $ANTLR start "rule__ActorInteraction__The2Assignment_4"
    // InternalReqLNG.g:3569:1: rule__ActorInteraction__The2Assignment_4 : ( ( 'the' ) ) ;
    public final void rule__ActorInteraction__The2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3573:1: ( ( ( 'the' ) ) )
            // InternalReqLNG.g:3574:2: ( ( 'the' ) )
            {
            // InternalReqLNG.g:3574:2: ( ( 'the' ) )
            // InternalReqLNG.g:3575:3: ( 'the' )
            {
             before(grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0()); 
            // InternalReqLNG.g:3576:3: ( 'the' )
            // InternalReqLNG.g:3577:4: 'the'
            {
             before(grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0()); 

            }

             after(grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0()); 

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
    // $ANTLR end "rule__ActorInteraction__The2Assignment_4"


    // $ANTLR start "rule__ActorInteraction__AbilityAssignment_5"
    // InternalReqLNG.g:3588:1: rule__ActorInteraction__AbilityAssignment_5 : ( ( 'ability' ) ) ;
    public final void rule__ActorInteraction__AbilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3592:1: ( ( ( 'ability' ) ) )
            // InternalReqLNG.g:3593:2: ( ( 'ability' ) )
            {
            // InternalReqLNG.g:3593:2: ( ( 'ability' ) )
            // InternalReqLNG.g:3594:3: ( 'ability' )
            {
             before(grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0()); 
            // InternalReqLNG.g:3595:3: ( 'ability' )
            // InternalReqLNG.g:3596:4: 'ability'
            {
             before(grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0()); 

            }

             after(grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0()); 

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
    // $ANTLR end "rule__ActorInteraction__AbilityAssignment_5"


    // $ANTLR start "rule__ActorInteraction__ToAssignment_6"
    // InternalReqLNG.g:3607:1: rule__ActorInteraction__ToAssignment_6 : ( ( 'to' ) ) ;
    public final void rule__ActorInteraction__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3611:1: ( ( ( 'to' ) ) )
            // InternalReqLNG.g:3612:2: ( ( 'to' ) )
            {
            // InternalReqLNG.g:3612:2: ( ( 'to' ) )
            // InternalReqLNG.g:3613:3: ( 'to' )
            {
             before(grammarAccess.getActorInteractionAccess().getToToKeyword_6_0()); 
            // InternalReqLNG.g:3614:3: ( 'to' )
            // InternalReqLNG.g:3615:4: 'to'
            {
             before(grammarAccess.getActorInteractionAccess().getToToKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getActorInteractionAccess().getToToKeyword_6_0()); 

            }

             after(grammarAccess.getActorInteractionAccess().getToToKeyword_6_0()); 

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
    // $ANTLR end "rule__ActorInteraction__ToAssignment_6"


    // $ANTLR start "rule__RequirementEnd__AiAssignment_0"
    // InternalReqLNG.g:3626:1: rule__RequirementEnd__AiAssignment_0 : ( ruleActorInteraction ) ;
    public final void rule__RequirementEnd__AiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3630:1: ( ( ruleActorInteraction ) )
            // InternalReqLNG.g:3631:2: ( ruleActorInteraction )
            {
            // InternalReqLNG.g:3631:2: ( ruleActorInteraction )
            // InternalReqLNG.g:3632:3: ruleActorInteraction
            {
             before(grammarAccess.getRequirementEndAccess().getAiActorInteractionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActorInteraction();

            state._fsp--;

             after(grammarAccess.getRequirementEndAccess().getAiActorInteractionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RequirementEnd__AiAssignment_0"


    // $ANTLR start "rule__RequirementEnd__ObjectWithDetailsAssignment_1"
    // InternalReqLNG.g:3641:1: rule__RequirementEnd__ObjectWithDetailsAssignment_1 : ( ruleTextWithConceptsOrSynonyms ) ;
    public final void rule__RequirementEnd__ObjectWithDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3645:1: ( ( ruleTextWithConceptsOrSynonyms ) )
            // InternalReqLNG.g:3646:2: ( ruleTextWithConceptsOrSynonyms )
            {
            // InternalReqLNG.g:3646:2: ( ruleTextWithConceptsOrSynonyms )
            // InternalReqLNG.g:3647:3: ruleTextWithConceptsOrSynonyms
            {
             before(grammarAccess.getRequirementEndAccess().getObjectWithDetailsTextWithConceptsOrSynonymsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTextWithConceptsOrSynonyms();

            state._fsp--;

             after(grammarAccess.getRequirementEndAccess().getObjectWithDetailsTextWithConceptsOrSynonymsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RequirementEnd__ObjectWithDetailsAssignment_1"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0"
    // InternalReqLNG.g:3656:1: rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3660:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3661:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3661:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3662:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsConceptOrSynonymCrossReference_0_0()); 
            // InternalReqLNG.g:3663:3: ( RULE_STRING )
            // InternalReqLNG.g:3664:4: RULE_STRING
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsConceptOrSynonymSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsConceptOrSynonymSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsConceptOrSynonymCrossReference_0_0()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0"
    // InternalReqLNG.g:3675:1: rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3679:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3680:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3680:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3681:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeConceptOrSynonymCrossReference_1_0_0()); 
            // InternalReqLNG.g:3682:3: ( RULE_STRING )
            // InternalReqLNG.g:3683:4: RULE_STRING
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeConceptOrSynonymSTRINGTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeConceptOrSynonymSTRINGTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeConceptOrSynonymCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__TextAssignment_1_1"
    // InternalReqLNG.g:3694:1: rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 : ( ruleText ) ;
    public final void rule__TextWithConceptsOrSynonyms__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3698:1: ( ( ruleText ) )
            // InternalReqLNG.g:3699:2: ( ruleText )
            {
            // InternalReqLNG.g:3699:2: ( ruleText )
            // InternalReqLNG.g:3700:3: ruleText
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextTextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextTextParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__TextAssignment_1_1"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2"
    // InternalReqLNG.g:3709:1: rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 : ( ruleConceptCombination ) ;
    public final void rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3713:1: ( ( ruleConceptCombination ) )
            // InternalReqLNG.g:3714:2: ( ruleConceptCombination )
            {
            // InternalReqLNG.g:3714:2: ( ruleConceptCombination )
            // InternalReqLNG.g:3715:3: ruleConceptCombination
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterConceptCombinationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConceptCombination();

            state._fsp--;

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterConceptCombinationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2"


    // $ANTLR start "rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3"
    // InternalReqLNG.g:3724:1: rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3728:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3729:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3729:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3730:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefConceptOrSynonymCrossReference_1_3_0()); 
            // InternalReqLNG.g:3731:3: ( RULE_STRING )
            // InternalReqLNG.g:3732:4: RULE_STRING
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefConceptOrSynonymSTRINGTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefConceptOrSynonymSTRINGTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefConceptOrSynonymCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3"


    // $ANTLR start "rule__ConceptCombination__ConceptsAssignment_0"
    // InternalReqLNG.g:3743:1: rule__ConceptCombination__ConceptsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__ConceptCombination__ConceptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3747:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3748:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3748:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3749:3: ( RULE_STRING )
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsConceptOrSynonymCrossReference_0_0()); 
            // InternalReqLNG.g:3750:3: ( RULE_STRING )
            // InternalReqLNG.g:3751:4: RULE_STRING
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsConceptOrSynonymSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConceptCombinationAccess().getConceptsConceptOrSynonymSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConceptCombinationAccess().getConceptsConceptOrSynonymCrossReference_0_0()); 

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
    // $ANTLR end "rule__ConceptCombination__ConceptsAssignment_0"


    // $ANTLR start "rule__ConceptCombination__TextAssignment_1"
    // InternalReqLNG.g:3762:1: rule__ConceptCombination__TextAssignment_1 : ( ruleText ) ;
    public final void rule__ConceptCombination__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3766:1: ( ( ruleText ) )
            // InternalReqLNG.g:3767:2: ( ruleText )
            {
            // InternalReqLNG.g:3767:2: ( ruleText )
            // InternalReqLNG.g:3768:3: ruleText
            {
             before(grammarAccess.getConceptCombinationAccess().getTextTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getConceptCombinationAccess().getTextTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConceptCombination__TextAssignment_1"


    // $ANTLR start "rule__Glossary__ConceptsAssignment_2"
    // InternalReqLNG.g:3777:1: rule__Glossary__ConceptsAssignment_2 : ( ruleConcept ) ;
    public final void rule__Glossary__ConceptsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3781:1: ( ( ruleConcept ) )
            // InternalReqLNG.g:3782:2: ( ruleConcept )
            {
            // InternalReqLNG.g:3782:2: ( ruleConcept )
            // InternalReqLNG.g:3783:3: ruleConcept
            {
             before(grammarAccess.getGlossaryAccess().getConceptsConceptParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getGlossaryAccess().getConceptsConceptParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Glossary__ConceptsAssignment_2"


    // $ANTLR start "rule__Function__NameAssignment_2"
    // InternalReqLNG.g:3792:1: rule__Function__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3796:1: ( ( ruleText ) )
            // InternalReqLNG.g:3797:2: ( ruleText )
            {
            // InternalReqLNG.g:3797:2: ( ruleText )
            // InternalReqLNG.g:3798:3: ruleText
            {
             before(grammarAccess.getFunctionAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNameTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_2"


    // $ANTLR start "rule__Function__SynonymsAssignment_3_2"
    // InternalReqLNG.g:3807:1: rule__Function__SynonymsAssignment_3_2 : ( ruleFunctionSynonym ) ;
    public final void rule__Function__SynonymsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3811:1: ( ( ruleFunctionSynonym ) )
            // InternalReqLNG.g:3812:2: ( ruleFunctionSynonym )
            {
            // InternalReqLNG.g:3812:2: ( ruleFunctionSynonym )
            // InternalReqLNG.g:3813:3: ruleFunctionSynonym
            {
             before(grammarAccess.getFunctionAccess().getSynonymsFunctionSynonymParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionSynonym();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getSynonymsFunctionSynonymParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Function__SynonymsAssignment_3_2"


    // $ANTLR start "rule__Function__SynonymsAssignment_3_3_1"
    // InternalReqLNG.g:3822:1: rule__Function__SynonymsAssignment_3_3_1 : ( ruleFunctionSynonym ) ;
    public final void rule__Function__SynonymsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3826:1: ( ( ruleFunctionSynonym ) )
            // InternalReqLNG.g:3827:2: ( ruleFunctionSynonym )
            {
            // InternalReqLNG.g:3827:2: ( ruleFunctionSynonym )
            // InternalReqLNG.g:3828:3: ruleFunctionSynonym
            {
             before(grammarAccess.getFunctionAccess().getSynonymsFunctionSynonymParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionSynonym();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getSynonymsFunctionSynonymParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Function__SynonymsAssignment_3_3_1"


    // $ANTLR start "rule__Function__DescriptionAssignment_4_2"
    // InternalReqLNG.g:3837:1: rule__Function__DescriptionAssignment_4_2 : ( ruleSentenceWithReferences ) ;
    public final void rule__Function__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3841:1: ( ( ruleSentenceWithReferences ) )
            // InternalReqLNG.g:3842:2: ( ruleSentenceWithReferences )
            {
            // InternalReqLNG.g:3842:2: ( ruleSentenceWithReferences )
            // InternalReqLNG.g:3843:3: ruleSentenceWithReferences
            {
             before(grammarAccess.getFunctionAccess().getDescriptionSentenceWithReferencesParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenceWithReferences();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDescriptionSentenceWithReferencesParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Function__DescriptionAssignment_4_2"


    // $ANTLR start "rule__DomainObject__NameAssignment_2"
    // InternalReqLNG.g:3852:1: rule__DomainObject__NameAssignment_2 : ( ruleText ) ;
    public final void rule__DomainObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3856:1: ( ( ruleText ) )
            // InternalReqLNG.g:3857:2: ( ruleText )
            {
            // InternalReqLNG.g:3857:2: ( ruleText )
            // InternalReqLNG.g:3858:3: ruleText
            {
             before(grammarAccess.getDomainObjectAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDomainObjectAccess().getNameTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DomainObject__NameAssignment_2"


    // $ANTLR start "rule__DomainObject__SynonymsAssignment_3_2"
    // InternalReqLNG.g:3867:1: rule__DomainObject__SynonymsAssignment_3_2 : ( ruleDomainObjectSynonym ) ;
    public final void rule__DomainObject__SynonymsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3871:1: ( ( ruleDomainObjectSynonym ) )
            // InternalReqLNG.g:3872:2: ( ruleDomainObjectSynonym )
            {
            // InternalReqLNG.g:3872:2: ( ruleDomainObjectSynonym )
            // InternalReqLNG.g:3873:3: ruleDomainObjectSynonym
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsDomainObjectSynonymParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainObjectSynonym();

            state._fsp--;

             after(grammarAccess.getDomainObjectAccess().getSynonymsDomainObjectSynonymParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__DomainObject__SynonymsAssignment_3_2"


    // $ANTLR start "rule__DomainObject__SynonymsAssignment_3_3_1"
    // InternalReqLNG.g:3882:1: rule__DomainObject__SynonymsAssignment_3_3_1 : ( ruleDomainObjectSynonym ) ;
    public final void rule__DomainObject__SynonymsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3886:1: ( ( ruleDomainObjectSynonym ) )
            // InternalReqLNG.g:3887:2: ( ruleDomainObjectSynonym )
            {
            // InternalReqLNG.g:3887:2: ( ruleDomainObjectSynonym )
            // InternalReqLNG.g:3888:3: ruleDomainObjectSynonym
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsDomainObjectSynonymParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainObjectSynonym();

            state._fsp--;

             after(grammarAccess.getDomainObjectAccess().getSynonymsDomainObjectSynonymParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__DomainObject__SynonymsAssignment_3_3_1"


    // $ANTLR start "rule__DomainObject__DescriptionAssignment_4_2"
    // InternalReqLNG.g:3897:1: rule__DomainObject__DescriptionAssignment_4_2 : ( ruleSentenceWithReferences ) ;
    public final void rule__DomainObject__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3901:1: ( ( ruleSentenceWithReferences ) )
            // InternalReqLNG.g:3902:2: ( ruleSentenceWithReferences )
            {
            // InternalReqLNG.g:3902:2: ( ruleSentenceWithReferences )
            // InternalReqLNG.g:3903:3: ruleSentenceWithReferences
            {
             before(grammarAccess.getDomainObjectAccess().getDescriptionSentenceWithReferencesParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentenceWithReferences();

            state._fsp--;

             after(grammarAccess.getDomainObjectAccess().getDescriptionSentenceWithReferencesParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DomainObject__DescriptionAssignment_4_2"


    // $ANTLR start "rule__FunctionSynonym__NameAssignment"
    // InternalReqLNG.g:3912:1: rule__FunctionSynonym__NameAssignment : ( ruleText ) ;
    public final void rule__FunctionSynonym__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3916:1: ( ( ruleText ) )
            // InternalReqLNG.g:3917:2: ( ruleText )
            {
            // InternalReqLNG.g:3917:2: ( ruleText )
            // InternalReqLNG.g:3918:3: ruleText
            {
             before(grammarAccess.getFunctionSynonymAccess().getNameTextParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getFunctionSynonymAccess().getNameTextParserRuleCall_0()); 

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
    // $ANTLR end "rule__FunctionSynonym__NameAssignment"


    // $ANTLR start "rule__DomainObjectSynonym__NameAssignment"
    // InternalReqLNG.g:3927:1: rule__DomainObjectSynonym__NameAssignment : ( ruleText ) ;
    public final void rule__DomainObjectSynonym__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3931:1: ( ( ruleText ) )
            // InternalReqLNG.g:3932:2: ( ruleText )
            {
            // InternalReqLNG.g:3932:2: ( ruleText )
            // InternalReqLNG.g:3933:3: ruleText
            {
             before(grammarAccess.getDomainObjectSynonymAccess().getNameTextParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getDomainObjectSynonymAccess().getNameTextParserRuleCall_0()); 

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
    // $ANTLR end "rule__DomainObjectSynonym__NameAssignment"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\22\1\25\1\uffff\1\30\1\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\1\6\uffff\6\2",
            "\2\2\1\3\6\uffff\6\2\3\4",
            "",
            "\2\2\1\3\6\uffff\6\2\6\4",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "801:1: rule__TextWithReferences__Alternatives : ( ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithReferences__Group_1__0 ) ) );";
        }
    }
    static final String dfa_8s = "\1\22\1\23\1\uffff\1\23\1\uffff";
    static final String[] dfa_9s = {
            "\2\2\1\1\6\uffff\6\2",
            "\2\2\1\3\6\uffff\6\2\1\4",
            "",
            "\2\2\1\3\6\uffff\6\2\1\4",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final short[][] dfa_9 = unpackEncodedStringArray(dfa_9s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "850:1: rule__TextWithConceptsOrSynonyms__Alternatives : ( ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) ) );";
        }
    }
    static final String dfa_10s = "\2\2\1\uffff\1\2\1\uffff";
    static final String dfa_11s = "\1\6\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_12s = "\1\25\1\30\1\uffff\1\30\1\uffff";
    static final String[] dfa_13s = {
            "\1\1\14\uffff\3\2",
            "\2\4\1\3\6\uffff\6\4\6\2",
            "",
            "\2\4\1\3\6\uffff\6\4\6\2",
            ""
    };
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final char[] dfa_12 = DFA.unpackEncodedStringToUnsignedChars(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1411:2: ( rule__TextWithReferences__AfterAssignment_1_2 )*";
        }
    }
    static final String dfa_14s = "\2\23\1\uffff\1\23\1\uffff";
    static final String[] dfa_15s = {
            "\1\1\14\uffff\1\2",
            "\2\4\1\3\6\uffff\6\4\1\2",
            "",
            "\2\4\1\3\6\uffff\6\4\1\2",
            ""
    };
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_14;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "()* loopback of 2120:2: ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000007E032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000A041042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000007E030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000007E070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007E072L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000040007E070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});

}