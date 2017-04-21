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



    // $ANTLR start "entryRuleEntities"
    // InternalReqLNG.g:53:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalReqLNG.g:54:1: ( ruleEntities EOF )
            // InternalReqLNG.g:55:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalReqLNG.g:62:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:66:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalReqLNG.g:67:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalReqLNG.g:67:2: ( ( rule__Entities__Group__0 ) )
            // InternalReqLNG.g:68:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalReqLNG.g:69:3: ( rule__Entities__Group__0 )
            // InternalReqLNG.g:69:4: rule__Entities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleActor"
    // InternalReqLNG.g:78:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalReqLNG.g:79:1: ( ruleActor EOF )
            // InternalReqLNG.g:80:1: ruleActor EOF
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
    // InternalReqLNG.g:87:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:91:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalReqLNG.g:92:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalReqLNG.g:92:2: ( ( rule__Actor__Group__0 ) )
            // InternalReqLNG.g:93:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalReqLNG.g:94:3: ( rule__Actor__Group__0 )
            // InternalReqLNG.g:94:4: rule__Actor__Group__0
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
    // InternalReqLNG.g:103:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalReqLNG.g:104:1: ( ruleSystem EOF )
            // InternalReqLNG.g:105:1: ruleSystem EOF
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
    // InternalReqLNG.g:112:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:116:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalReqLNG.g:117:2: ( ( rule__System__Group__0 ) )
            {
            // InternalReqLNG.g:117:2: ( ( rule__System__Group__0 ) )
            // InternalReqLNG.g:118:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalReqLNG.g:119:3: ( rule__System__Group__0 )
            // InternalReqLNG.g:119:4: rule__System__Group__0
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
    // InternalReqLNG.g:128:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalReqLNG.g:129:1: ( ruleDescription EOF )
            // InternalReqLNG.g:130:1: ruleDescription EOF
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
    // InternalReqLNG.g:137:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:141:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalReqLNG.g:142:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalReqLNG.g:142:2: ( ( rule__Description__Group__0 ) )
            // InternalReqLNG.g:143:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalReqLNG.g:144:3: ( rule__Description__Group__0 )
            // InternalReqLNG.g:144:4: rule__Description__Group__0
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
    // InternalReqLNG.g:153:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalReqLNG.g:154:1: ( ruleText EOF )
            // InternalReqLNG.g:155:1: ruleText EOF
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
    // InternalReqLNG.g:162:1: ruleText : ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:166:2: ( ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) ) )
            // InternalReqLNG.g:167:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            {
            // InternalReqLNG.g:167:2: ( ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* ) )
            // InternalReqLNG.g:168:3: ( ( rule__Text__Alternatives ) ) ( ( rule__Text__Alternatives )* )
            {
            // InternalReqLNG.g:168:3: ( ( rule__Text__Alternatives ) )
            // InternalReqLNG.g:169:4: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalReqLNG.g:170:4: ( rule__Text__Alternatives )
            // InternalReqLNG.g:170:5: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }

            // InternalReqLNG.g:173:3: ( ( rule__Text__Alternatives )* )
            // InternalReqLNG.g:174:4: ( rule__Text__Alternatives )*
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalReqLNG.g:175:4: ( rule__Text__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WORD && LA1_0<=RULE_ANY_OTHER)||(LA1_0>=13 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqLNG.g:175:5: rule__Text__Alternatives
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
    // InternalReqLNG.g:185:1: entryRuleSentenceWithReferences : ruleSentenceWithReferences EOF ;
    public final void entryRuleSentenceWithReferences() throws RecognitionException {
        try {
            // InternalReqLNG.g:186:1: ( ruleSentenceWithReferences EOF )
            // InternalReqLNG.g:187:1: ruleSentenceWithReferences EOF
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
    // InternalReqLNG.g:194:1: ruleSentenceWithReferences : ( ( rule__SentenceWithReferences__Group__0 ) ) ;
    public final void ruleSentenceWithReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:198:2: ( ( ( rule__SentenceWithReferences__Group__0 ) ) )
            // InternalReqLNG.g:199:2: ( ( rule__SentenceWithReferences__Group__0 ) )
            {
            // InternalReqLNG.g:199:2: ( ( rule__SentenceWithReferences__Group__0 ) )
            // InternalReqLNG.g:200:3: ( rule__SentenceWithReferences__Group__0 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getGroup()); 
            // InternalReqLNG.g:201:3: ( rule__SentenceWithReferences__Group__0 )
            // InternalReqLNG.g:201:4: rule__SentenceWithReferences__Group__0
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
    // InternalReqLNG.g:210:1: entryRuleTextWithReferences : ruleTextWithReferences EOF ;
    public final void entryRuleTextWithReferences() throws RecognitionException {
        try {
            // InternalReqLNG.g:211:1: ( ruleTextWithReferences EOF )
            // InternalReqLNG.g:212:1: ruleTextWithReferences EOF
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
    // InternalReqLNG.g:219:1: ruleTextWithReferences : ( ( rule__TextWithReferences__Alternatives ) ) ;
    public final void ruleTextWithReferences() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:223:2: ( ( ( rule__TextWithReferences__Alternatives ) ) )
            // InternalReqLNG.g:224:2: ( ( rule__TextWithReferences__Alternatives ) )
            {
            // InternalReqLNG.g:224:2: ( ( rule__TextWithReferences__Alternatives ) )
            // InternalReqLNG.g:225:3: ( rule__TextWithReferences__Alternatives )
            {
             before(grammarAccess.getTextWithReferencesAccess().getAlternatives()); 
            // InternalReqLNG.g:226:3: ( rule__TextWithReferences__Alternatives )
            // InternalReqLNG.g:226:4: rule__TextWithReferences__Alternatives
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
    // InternalReqLNG.g:235:1: entryRuleReferenceCombination : ruleReferenceCombination EOF ;
    public final void entryRuleReferenceCombination() throws RecognitionException {
        try {
            // InternalReqLNG.g:236:1: ( ruleReferenceCombination EOF )
            // InternalReqLNG.g:237:1: ruleReferenceCombination EOF
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
    // InternalReqLNG.g:244:1: ruleReferenceCombination : ( ( rule__ReferenceCombination__Group__0 ) ) ;
    public final void ruleReferenceCombination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:248:2: ( ( ( rule__ReferenceCombination__Group__0 ) ) )
            // InternalReqLNG.g:249:2: ( ( rule__ReferenceCombination__Group__0 ) )
            {
            // InternalReqLNG.g:249:2: ( ( rule__ReferenceCombination__Group__0 ) )
            // InternalReqLNG.g:250:3: ( rule__ReferenceCombination__Group__0 )
            {
             before(grammarAccess.getReferenceCombinationAccess().getGroup()); 
            // InternalReqLNG.g:251:3: ( rule__ReferenceCombination__Group__0 )
            // InternalReqLNG.g:251:4: rule__ReferenceCombination__Group__0
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
    // InternalReqLNG.g:260:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalReqLNG.g:261:1: ( ruleRequirement EOF )
            // InternalReqLNG.g:262:1: ruleRequirement EOF
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
    // InternalReqLNG.g:269:1: ruleRequirement : ( ( rule__Requirement__Alternatives ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:273:2: ( ( ( rule__Requirement__Alternatives ) ) )
            // InternalReqLNG.g:274:2: ( ( rule__Requirement__Alternatives ) )
            {
            // InternalReqLNG.g:274:2: ( ( rule__Requirement__Alternatives ) )
            // InternalReqLNG.g:275:3: ( rule__Requirement__Alternatives )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives()); 
            // InternalReqLNG.g:276:3: ( rule__Requirement__Alternatives )
            // InternalReqLNG.g:276:4: rule__Requirement__Alternatives
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
    // InternalReqLNG.g:285:1: entryRuleConditionalRequirement : ruleConditionalRequirement EOF ;
    public final void entryRuleConditionalRequirement() throws RecognitionException {
        try {
            // InternalReqLNG.g:286:1: ( ruleConditionalRequirement EOF )
            // InternalReqLNG.g:287:1: ruleConditionalRequirement EOF
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
    // InternalReqLNG.g:294:1: ruleConditionalRequirement : ( ( rule__ConditionalRequirement__Group__0 ) ) ;
    public final void ruleConditionalRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:298:2: ( ( ( rule__ConditionalRequirement__Group__0 ) ) )
            // InternalReqLNG.g:299:2: ( ( rule__ConditionalRequirement__Group__0 ) )
            {
            // InternalReqLNG.g:299:2: ( ( rule__ConditionalRequirement__Group__0 ) )
            // InternalReqLNG.g:300:3: ( rule__ConditionalRequirement__Group__0 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getGroup()); 
            // InternalReqLNG.g:301:3: ( rule__ConditionalRequirement__Group__0 )
            // InternalReqLNG.g:301:4: rule__ConditionalRequirement__Group__0
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
    // InternalReqLNG.g:310:1: entryRuleUnconditionalRequirement : ruleUnconditionalRequirement EOF ;
    public final void entryRuleUnconditionalRequirement() throws RecognitionException {
        try {
            // InternalReqLNG.g:311:1: ( ruleUnconditionalRequirement EOF )
            // InternalReqLNG.g:312:1: ruleUnconditionalRequirement EOF
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
    // InternalReqLNG.g:319:1: ruleUnconditionalRequirement : ( ( rule__UnconditionalRequirement__Group__0 ) ) ;
    public final void ruleUnconditionalRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:323:2: ( ( ( rule__UnconditionalRequirement__Group__0 ) ) )
            // InternalReqLNG.g:324:2: ( ( rule__UnconditionalRequirement__Group__0 ) )
            {
            // InternalReqLNG.g:324:2: ( ( rule__UnconditionalRequirement__Group__0 ) )
            // InternalReqLNG.g:325:3: ( rule__UnconditionalRequirement__Group__0 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getGroup()); 
            // InternalReqLNG.g:326:3: ( rule__UnconditionalRequirement__Group__0 )
            // InternalReqLNG.g:326:4: rule__UnconditionalRequirement__Group__0
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
    // InternalReqLNG.g:335:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalReqLNG.g:336:1: ( rulePrecondition EOF )
            // InternalReqLNG.g:337:1: rulePrecondition EOF
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
    // InternalReqLNG.g:344:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:348:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalReqLNG.g:349:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalReqLNG.g:349:2: ( ( rule__Precondition__Group__0 ) )
            // InternalReqLNG.g:350:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalReqLNG.g:351:3: ( rule__Precondition__Group__0 )
            // InternalReqLNG.g:351:4: rule__Precondition__Group__0
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
    // InternalReqLNG.g:360:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalReqLNG.g:361:1: ( ruleConditional EOF )
            // InternalReqLNG.g:362:1: ruleConditional EOF
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
    // InternalReqLNG.g:369:1: ruleConditional : ( 'If' ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:373:2: ( ( 'If' ) )
            // InternalReqLNG.g:374:2: ( 'If' )
            {
            // InternalReqLNG.g:374:2: ( 'If' )
            // InternalReqLNG.g:375:3: 'If'
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
    // InternalReqLNG.g:385:1: entryRuleActorInteraction : ruleActorInteraction EOF ;
    public final void entryRuleActorInteraction() throws RecognitionException {
        try {
            // InternalReqLNG.g:386:1: ( ruleActorInteraction EOF )
            // InternalReqLNG.g:387:1: ruleActorInteraction EOF
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
    // InternalReqLNG.g:394:1: ruleActorInteraction : ( ( rule__ActorInteraction__Group__0 ) ) ;
    public final void ruleActorInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:398:2: ( ( ( rule__ActorInteraction__Group__0 ) ) )
            // InternalReqLNG.g:399:2: ( ( rule__ActorInteraction__Group__0 ) )
            {
            // InternalReqLNG.g:399:2: ( ( rule__ActorInteraction__Group__0 ) )
            // InternalReqLNG.g:400:3: ( rule__ActorInteraction__Group__0 )
            {
             before(grammarAccess.getActorInteractionAccess().getGroup()); 
            // InternalReqLNG.g:401:3: ( rule__ActorInteraction__Group__0 )
            // InternalReqLNG.g:401:4: rule__ActorInteraction__Group__0
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
    // InternalReqLNG.g:410:1: entryRuleRequirementEnd : ruleRequirementEnd EOF ;
    public final void entryRuleRequirementEnd() throws RecognitionException {
        try {
            // InternalReqLNG.g:411:1: ( ruleRequirementEnd EOF )
            // InternalReqLNG.g:412:1: ruleRequirementEnd EOF
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
    // InternalReqLNG.g:419:1: ruleRequirementEnd : ( ( rule__RequirementEnd__Group__0 ) ) ;
    public final void ruleRequirementEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:423:2: ( ( ( rule__RequirementEnd__Group__0 ) ) )
            // InternalReqLNG.g:424:2: ( ( rule__RequirementEnd__Group__0 ) )
            {
            // InternalReqLNG.g:424:2: ( ( rule__RequirementEnd__Group__0 ) )
            // InternalReqLNG.g:425:3: ( rule__RequirementEnd__Group__0 )
            {
             before(grammarAccess.getRequirementEndAccess().getGroup()); 
            // InternalReqLNG.g:426:3: ( rule__RequirementEnd__Group__0 )
            // InternalReqLNG.g:426:4: rule__RequirementEnd__Group__0
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
    // InternalReqLNG.g:435:1: entryRuleTextWithConceptsOrSynonyms : ruleTextWithConceptsOrSynonyms EOF ;
    public final void entryRuleTextWithConceptsOrSynonyms() throws RecognitionException {
        try {
            // InternalReqLNG.g:436:1: ( ruleTextWithConceptsOrSynonyms EOF )
            // InternalReqLNG.g:437:1: ruleTextWithConceptsOrSynonyms EOF
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
    // InternalReqLNG.g:444:1: ruleTextWithConceptsOrSynonyms : ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) ) ;
    public final void ruleTextWithConceptsOrSynonyms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:448:2: ( ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) ) )
            // InternalReqLNG.g:449:2: ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) )
            {
            // InternalReqLNG.g:449:2: ( ( rule__TextWithConceptsOrSynonyms__Alternatives ) )
            // InternalReqLNG.g:450:3: ( rule__TextWithConceptsOrSynonyms__Alternatives )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAlternatives()); 
            // InternalReqLNG.g:451:3: ( rule__TextWithConceptsOrSynonyms__Alternatives )
            // InternalReqLNG.g:451:4: rule__TextWithConceptsOrSynonyms__Alternatives
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
    // InternalReqLNG.g:460:1: entryRuleConceptCombination : ruleConceptCombination EOF ;
    public final void entryRuleConceptCombination() throws RecognitionException {
        try {
            // InternalReqLNG.g:461:1: ( ruleConceptCombination EOF )
            // InternalReqLNG.g:462:1: ruleConceptCombination EOF
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
    // InternalReqLNG.g:469:1: ruleConceptCombination : ( ( rule__ConceptCombination__Group__0 ) ) ;
    public final void ruleConceptCombination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:473:2: ( ( ( rule__ConceptCombination__Group__0 ) ) )
            // InternalReqLNG.g:474:2: ( ( rule__ConceptCombination__Group__0 ) )
            {
            // InternalReqLNG.g:474:2: ( ( rule__ConceptCombination__Group__0 ) )
            // InternalReqLNG.g:475:3: ( rule__ConceptCombination__Group__0 )
            {
             before(grammarAccess.getConceptCombinationAccess().getGroup()); 
            // InternalReqLNG.g:476:3: ( rule__ConceptCombination__Group__0 )
            // InternalReqLNG.g:476:4: rule__ConceptCombination__Group__0
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
    // InternalReqLNG.g:485:1: entryRuleGlossary : ruleGlossary EOF ;
    public final void entryRuleGlossary() throws RecognitionException {
        try {
            // InternalReqLNG.g:486:1: ( ruleGlossary EOF )
            // InternalReqLNG.g:487:1: ruleGlossary EOF
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
    // InternalReqLNG.g:494:1: ruleGlossary : ( ( rule__Glossary__Group__0 ) ) ;
    public final void ruleGlossary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:498:2: ( ( ( rule__Glossary__Group__0 ) ) )
            // InternalReqLNG.g:499:2: ( ( rule__Glossary__Group__0 ) )
            {
            // InternalReqLNG.g:499:2: ( ( rule__Glossary__Group__0 ) )
            // InternalReqLNG.g:500:3: ( rule__Glossary__Group__0 )
            {
             before(grammarAccess.getGlossaryAccess().getGroup()); 
            // InternalReqLNG.g:501:3: ( rule__Glossary__Group__0 )
            // InternalReqLNG.g:501:4: rule__Glossary__Group__0
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
    // InternalReqLNG.g:510:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalReqLNG.g:511:1: ( ruleConcept EOF )
            // InternalReqLNG.g:512:1: ruleConcept EOF
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
    // InternalReqLNG.g:519:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:523:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalReqLNG.g:524:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalReqLNG.g:524:2: ( ( rule__Concept__Alternatives ) )
            // InternalReqLNG.g:525:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalReqLNG.g:526:3: ( rule__Concept__Alternatives )
            // InternalReqLNG.g:526:4: rule__Concept__Alternatives
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
    // InternalReqLNG.g:535:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalReqLNG.g:536:1: ( ruleFunction EOF )
            // InternalReqLNG.g:537:1: ruleFunction EOF
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
    // InternalReqLNG.g:544:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:548:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalReqLNG.g:549:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalReqLNG.g:549:2: ( ( rule__Function__Group__0 ) )
            // InternalReqLNG.g:550:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalReqLNG.g:551:3: ( rule__Function__Group__0 )
            // InternalReqLNG.g:551:4: rule__Function__Group__0
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
    // InternalReqLNG.g:560:1: entryRuleDomainObject : ruleDomainObject EOF ;
    public final void entryRuleDomainObject() throws RecognitionException {
        try {
            // InternalReqLNG.g:561:1: ( ruleDomainObject EOF )
            // InternalReqLNG.g:562:1: ruleDomainObject EOF
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
    // InternalReqLNG.g:569:1: ruleDomainObject : ( ( rule__DomainObject__Group__0 ) ) ;
    public final void ruleDomainObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:573:2: ( ( ( rule__DomainObject__Group__0 ) ) )
            // InternalReqLNG.g:574:2: ( ( rule__DomainObject__Group__0 ) )
            {
            // InternalReqLNG.g:574:2: ( ( rule__DomainObject__Group__0 ) )
            // InternalReqLNG.g:575:3: ( rule__DomainObject__Group__0 )
            {
             before(grammarAccess.getDomainObjectAccess().getGroup()); 
            // InternalReqLNG.g:576:3: ( rule__DomainObject__Group__0 )
            // InternalReqLNG.g:576:4: rule__DomainObject__Group__0
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
    // InternalReqLNG.g:585:1: entryRuleFunctionSynonym : ruleFunctionSynonym EOF ;
    public final void entryRuleFunctionSynonym() throws RecognitionException {
        try {
            // InternalReqLNG.g:586:1: ( ruleFunctionSynonym EOF )
            // InternalReqLNG.g:587:1: ruleFunctionSynonym EOF
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
    // InternalReqLNG.g:594:1: ruleFunctionSynonym : ( ( rule__FunctionSynonym__NameAssignment ) ) ;
    public final void ruleFunctionSynonym() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:598:2: ( ( ( rule__FunctionSynonym__NameAssignment ) ) )
            // InternalReqLNG.g:599:2: ( ( rule__FunctionSynonym__NameAssignment ) )
            {
            // InternalReqLNG.g:599:2: ( ( rule__FunctionSynonym__NameAssignment ) )
            // InternalReqLNG.g:600:3: ( rule__FunctionSynonym__NameAssignment )
            {
             before(grammarAccess.getFunctionSynonymAccess().getNameAssignment()); 
            // InternalReqLNG.g:601:3: ( rule__FunctionSynonym__NameAssignment )
            // InternalReqLNG.g:601:4: rule__FunctionSynonym__NameAssignment
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
    // InternalReqLNG.g:610:1: entryRuleDomainObjectSynonym : ruleDomainObjectSynonym EOF ;
    public final void entryRuleDomainObjectSynonym() throws RecognitionException {
        try {
            // InternalReqLNG.g:611:1: ( ruleDomainObjectSynonym EOF )
            // InternalReqLNG.g:612:1: ruleDomainObjectSynonym EOF
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
    // InternalReqLNG.g:619:1: ruleDomainObjectSynonym : ( ( rule__DomainObjectSynonym__NameAssignment ) ) ;
    public final void ruleDomainObjectSynonym() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:623:2: ( ( ( rule__DomainObjectSynonym__NameAssignment ) ) )
            // InternalReqLNG.g:624:2: ( ( rule__DomainObjectSynonym__NameAssignment ) )
            {
            // InternalReqLNG.g:624:2: ( ( rule__DomainObjectSynonym__NameAssignment ) )
            // InternalReqLNG.g:625:3: ( rule__DomainObjectSynonym__NameAssignment )
            {
             before(grammarAccess.getDomainObjectSynonymAccess().getNameAssignment()); 
            // InternalReqLNG.g:626:3: ( rule__DomainObjectSynonym__NameAssignment )
            // InternalReqLNG.g:626:4: rule__DomainObjectSynonym__NameAssignment
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
    // InternalReqLNG.g:635:1: ruleLiability : ( ( rule__Liability__Alternatives ) ) ;
    public final void ruleLiability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:639:1: ( ( ( rule__Liability__Alternatives ) ) )
            // InternalReqLNG.g:640:2: ( ( rule__Liability__Alternatives ) )
            {
            // InternalReqLNG.g:640:2: ( ( rule__Liability__Alternatives ) )
            // InternalReqLNG.g:641:3: ( rule__Liability__Alternatives )
            {
             before(grammarAccess.getLiabilityAccess().getAlternatives()); 
            // InternalReqLNG.g:642:3: ( rule__Liability__Alternatives )
            // InternalReqLNG.g:642:4: rule__Liability__Alternatives
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


    // $ANTLR start "rule__Entities__Alternatives_0"
    // InternalReqLNG.g:650:1: rule__Entities__Alternatives_0 : ( ( ( rule__Entities__ActorAssignment_0_0 ) ) | ( ( rule__Entities__SystemAssignment_0_1 ) ) | ( ( rule__Entities__RequirementAssignment_0_2 ) ) );
    public final void rule__Entities__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:654:1: ( ( ( rule__Entities__ActorAssignment_0_0 ) ) | ( ( rule__Entities__SystemAssignment_0_1 ) ) | ( ( rule__Entities__RequirementAssignment_0_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case 12:
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
                    // InternalReqLNG.g:655:2: ( ( rule__Entities__ActorAssignment_0_0 ) )
                    {
                    // InternalReqLNG.g:655:2: ( ( rule__Entities__ActorAssignment_0_0 ) )
                    // InternalReqLNG.g:656:3: ( rule__Entities__ActorAssignment_0_0 )
                    {
                     before(grammarAccess.getEntitiesAccess().getActorAssignment_0_0()); 
                    // InternalReqLNG.g:657:3: ( rule__Entities__ActorAssignment_0_0 )
                    // InternalReqLNG.g:657:4: rule__Entities__ActorAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entities__ActorAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntitiesAccess().getActorAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:661:2: ( ( rule__Entities__SystemAssignment_0_1 ) )
                    {
                    // InternalReqLNG.g:661:2: ( ( rule__Entities__SystemAssignment_0_1 ) )
                    // InternalReqLNG.g:662:3: ( rule__Entities__SystemAssignment_0_1 )
                    {
                     before(grammarAccess.getEntitiesAccess().getSystemAssignment_0_1()); 
                    // InternalReqLNG.g:663:3: ( rule__Entities__SystemAssignment_0_1 )
                    // InternalReqLNG.g:663:4: rule__Entities__SystemAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entities__SystemAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntitiesAccess().getSystemAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:667:2: ( ( rule__Entities__RequirementAssignment_0_2 ) )
                    {
                    // InternalReqLNG.g:667:2: ( ( rule__Entities__RequirementAssignment_0_2 ) )
                    // InternalReqLNG.g:668:3: ( rule__Entities__RequirementAssignment_0_2 )
                    {
                     before(grammarAccess.getEntitiesAccess().getRequirementAssignment_0_2()); 
                    // InternalReqLNG.g:669:3: ( rule__Entities__RequirementAssignment_0_2 )
                    // InternalReqLNG.g:669:4: rule__Entities__RequirementAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entities__RequirementAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntitiesAccess().getRequirementAssignment_0_2()); 

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
    // $ANTLR end "rule__Entities__Alternatives_0"


    // $ANTLR start "rule__Text__Alternatives"
    // InternalReqLNG.g:677:1: rule__Text__Alternatives : ( ( 'To' ) | ( 'to' ) | ( 'A' ) | ( 'a' ) | ( 'the' ) | ( 'The' ) | ( RULE_WORD ) | ( RULE_ANY_OTHER ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:681:1: ( ( 'To' ) | ( 'to' ) | ( 'A' ) | ( 'a' ) | ( 'the' ) | ( 'The' ) | ( RULE_WORD ) | ( RULE_ANY_OTHER ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case RULE_WORD:
                {
                alt3=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalReqLNG.g:682:2: ( 'To' )
                    {
                    // InternalReqLNG.g:682:2: ( 'To' )
                    // InternalReqLNG.g:683:3: 'To'
                    {
                     before(grammarAccess.getTextAccess().getToKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getToKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:688:2: ( 'to' )
                    {
                    // InternalReqLNG.g:688:2: ( 'to' )
                    // InternalReqLNG.g:689:3: 'to'
                    {
                     before(grammarAccess.getTextAccess().getToKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getToKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:694:2: ( 'A' )
                    {
                    // InternalReqLNG.g:694:2: ( 'A' )
                    // InternalReqLNG.g:695:3: 'A'
                    {
                     before(grammarAccess.getTextAccess().getAKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getAKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalReqLNG.g:700:2: ( 'a' )
                    {
                    // InternalReqLNG.g:700:2: ( 'a' )
                    // InternalReqLNG.g:701:3: 'a'
                    {
                     before(grammarAccess.getTextAccess().getAKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getAKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalReqLNG.g:706:2: ( 'the' )
                    {
                    // InternalReqLNG.g:706:2: ( 'the' )
                    // InternalReqLNG.g:707:3: 'the'
                    {
                     before(grammarAccess.getTextAccess().getTheKeyword_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getTheKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalReqLNG.g:712:2: ( 'The' )
                    {
                    // InternalReqLNG.g:712:2: ( 'The' )
                    // InternalReqLNG.g:713:3: 'The'
                    {
                     before(grammarAccess.getTextAccess().getTheKeyword_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getTheKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalReqLNG.g:718:2: ( RULE_WORD )
                    {
                    // InternalReqLNG.g:718:2: ( RULE_WORD )
                    // InternalReqLNG.g:719:3: RULE_WORD
                    {
                     before(grammarAccess.getTextAccess().getWORDTerminalRuleCall_6()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTextAccess().getWORDTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalReqLNG.g:724:2: ( RULE_ANY_OTHER )
                    {
                    // InternalReqLNG.g:724:2: ( RULE_ANY_OTHER )
                    // InternalReqLNG.g:725:3: RULE_ANY_OTHER
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
    // InternalReqLNG.g:734:1: rule__SentenceWithReferences__PunctuationAlternatives_1_0 : ( ( '.' ) | ( '!' ) | ( '?' ) );
    public final void rule__SentenceWithReferences__PunctuationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:738:1: ( ( '.' ) | ( '!' ) | ( '?' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalReqLNG.g:739:2: ( '.' )
                    {
                    // InternalReqLNG.g:739:2: ( '.' )
                    // InternalReqLNG.g:740:3: '.'
                    {
                     before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationFullStopKeyword_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationFullStopKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:745:2: ( '!' )
                    {
                    // InternalReqLNG.g:745:2: ( '!' )
                    // InternalReqLNG.g:746:3: '!'
                    {
                     before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationExclamationMarkKeyword_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSentenceWithReferencesAccess().getPunctuationExclamationMarkKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:751:2: ( '?' )
                    {
                    // InternalReqLNG.g:751:2: ( '?' )
                    // InternalReqLNG.g:752:3: '?'
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
    // InternalReqLNG.g:761:1: rule__TextWithReferences__Alternatives : ( ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithReferences__Group_1__0 ) ) );
    public final void rule__TextWithReferences__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:765:1: ( ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithReferences__Group_1__0 ) ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalReqLNG.g:766:2: ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) )
                    {
                    // InternalReqLNG.g:766:2: ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) )
                    // InternalReqLNG.g:767:3: ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* )
                    {
                    // InternalReqLNG.g:767:3: ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) )
                    // InternalReqLNG.g:768:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )
                    {
                     before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:769:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )
                    // InternalReqLNG.g:769:5: rule__TextWithReferences__OnlyRefsAssignment_0
                    {
                    pushFollow(FOLLOW_4);
                    rule__TextWithReferences__OnlyRefsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 

                    }

                    // InternalReqLNG.g:772:3: ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* )
                    // InternalReqLNG.g:773:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )*
                    {
                     before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:774:4: ( rule__TextWithReferences__OnlyRefsAssignment_0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==EOF||LA5_2==RULE_STRING||(LA5_2>=19 && LA5_2<=21)) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqLNG.g:774:5: rule__TextWithReferences__OnlyRefsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__TextWithReferences__OnlyRefsAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:779:2: ( ( rule__TextWithReferences__Group_1__0 ) )
                    {
                    // InternalReqLNG.g:779:2: ( ( rule__TextWithReferences__Group_1__0 ) )
                    // InternalReqLNG.g:780:3: ( rule__TextWithReferences__Group_1__0 )
                    {
                     before(grammarAccess.getTextWithReferencesAccess().getGroup_1()); 
                    // InternalReqLNG.g:781:3: ( rule__TextWithReferences__Group_1__0 )
                    // InternalReqLNG.g:781:4: rule__TextWithReferences__Group_1__0
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
    // InternalReqLNG.g:789:1: rule__Requirement__Alternatives : ( ( ruleConditionalRequirement ) | ( ruleUnconditionalRequirement ) );
    public final void rule__Requirement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:793:1: ( ( ruleConditionalRequirement ) | ( ruleUnconditionalRequirement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqLNG.g:794:2: ( ruleConditionalRequirement )
                    {
                    // InternalReqLNG.g:794:2: ( ruleConditionalRequirement )
                    // InternalReqLNG.g:795:3: ruleConditionalRequirement
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
                    // InternalReqLNG.g:800:2: ( ruleUnconditionalRequirement )
                    {
                    // InternalReqLNG.g:800:2: ( ruleUnconditionalRequirement )
                    // InternalReqLNG.g:801:3: ruleUnconditionalRequirement
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
    // InternalReqLNG.g:810:1: rule__TextWithConceptsOrSynonyms__Alternatives : ( ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) ) );
    public final void rule__TextWithConceptsOrSynonyms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:814:1: ( ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalReqLNG.g:815:2: ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) )
                    {
                    // InternalReqLNG.g:815:2: ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) )
                    // InternalReqLNG.g:816:3: ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* )
                    {
                    // InternalReqLNG.g:816:3: ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) )
                    // InternalReqLNG.g:817:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )
                    {
                     before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:818:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )
                    // InternalReqLNG.g:818:5: rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0
                    {
                    pushFollow(FOLLOW_4);
                    rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 

                    }

                    // InternalReqLNG.g:821:3: ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* )
                    // InternalReqLNG.g:822:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )*
                    {
                     before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 
                    // InternalReqLNG.g:823:4: ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalReqLNG.g:823:5: rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     after(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsAssignment_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:828:2: ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) )
                    {
                    // InternalReqLNG.g:828:2: ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) )
                    // InternalReqLNG.g:829:3: ( rule__TextWithConceptsOrSynonyms__Group_1__0 )
                    {
                     before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getGroup_1()); 
                    // InternalReqLNG.g:830:3: ( rule__TextWithConceptsOrSynonyms__Group_1__0 )
                    // InternalReqLNG.g:830:4: rule__TextWithConceptsOrSynonyms__Group_1__0
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
    // InternalReqLNG.g:838:1: rule__Concept__Alternatives : ( ( ruleFunction ) | ( ruleDomainObject ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:842:1: ( ( ruleFunction ) | ( ruleDomainObject ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalReqLNG.g:843:2: ( ruleFunction )
                    {
                    // InternalReqLNG.g:843:2: ( ruleFunction )
                    // InternalReqLNG.g:844:3: ruleFunction
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
                    // InternalReqLNG.g:849:2: ( ruleDomainObject )
                    {
                    // InternalReqLNG.g:849:2: ( ruleDomainObject )
                    // InternalReqLNG.g:850:3: ruleDomainObject
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
    // InternalReqLNG.g:859:1: rule__Liability__Alternatives : ( ( ( 'shall' ) ) | ( ( 'should' ) ) | ( ( 'will' ) ) );
    public final void rule__Liability__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:863:1: ( ( ( 'shall' ) ) | ( ( 'should' ) ) | ( ( 'will' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalReqLNG.g:864:2: ( ( 'shall' ) )
                    {
                    // InternalReqLNG.g:864:2: ( ( 'shall' ) )
                    // InternalReqLNG.g:865:3: ( 'shall' )
                    {
                     before(grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0()); 
                    // InternalReqLNG.g:866:3: ( 'shall' )
                    // InternalReqLNG.g:866:4: 'shall'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:870:2: ( ( 'should' ) )
                    {
                    // InternalReqLNG.g:870:2: ( ( 'should' ) )
                    // InternalReqLNG.g:871:3: ( 'should' )
                    {
                     before(grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1()); 
                    // InternalReqLNG.g:872:3: ( 'should' )
                    // InternalReqLNG.g:872:4: 'should'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:876:2: ( ( 'will' ) )
                    {
                    // InternalReqLNG.g:876:2: ( ( 'will' ) )
                    // InternalReqLNG.g:877:3: ( 'will' )
                    {
                     before(grammarAccess.getLiabilityAccess().getWillEnumLiteralDeclaration_2()); 
                    // InternalReqLNG.g:878:3: ( 'will' )
                    // InternalReqLNG.g:878:4: 'will'
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


    // $ANTLR start "rule__Entities__Group__0"
    // InternalReqLNG.g:886:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:890:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalReqLNG.g:891:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__1();

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
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // InternalReqLNG.g:898:1: rule__Entities__Group__0__Impl : ( ( rule__Entities__Alternatives_0 )* ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:902:1: ( ( ( rule__Entities__Alternatives_0 )* ) )
            // InternalReqLNG.g:903:1: ( ( rule__Entities__Alternatives_0 )* )
            {
            // InternalReqLNG.g:903:1: ( ( rule__Entities__Alternatives_0 )* )
            // InternalReqLNG.g:904:2: ( rule__Entities__Alternatives_0 )*
            {
             before(grammarAccess.getEntitiesAccess().getAlternatives_0()); 
            // InternalReqLNG.g:905:2: ( rule__Entities__Alternatives_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||LA12_0==12||LA12_0==18||LA12_0==25||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReqLNG.g:905:3: rule__Entities__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Entities__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalReqLNG.g:913:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:917:1: ( rule__Entities__Group__1__Impl )
            // InternalReqLNG.g:918:2: rule__Entities__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__1__Impl();

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
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // InternalReqLNG.g:924:1: rule__Entities__Group__1__Impl : ( ( rule__Entities__GlossaryAssignment_1 ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:928:1: ( ( ( rule__Entities__GlossaryAssignment_1 ) ) )
            // InternalReqLNG.g:929:1: ( ( rule__Entities__GlossaryAssignment_1 ) )
            {
            // InternalReqLNG.g:929:1: ( ( rule__Entities__GlossaryAssignment_1 ) )
            // InternalReqLNG.g:930:2: ( rule__Entities__GlossaryAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getGlossaryAssignment_1()); 
            // InternalReqLNG.g:931:2: ( rule__Entities__GlossaryAssignment_1 )
            // InternalReqLNG.g:931:3: rule__Entities__GlossaryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entities__GlossaryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGlossaryAssignment_1()); 

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
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalReqLNG.g:940:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:944:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalReqLNG.g:945:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
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
    // InternalReqLNG.g:952:1: rule__Actor__Group__0__Impl : ( 'Actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:956:1: ( ( 'Actor' ) )
            // InternalReqLNG.g:957:1: ( 'Actor' )
            {
            // InternalReqLNG.g:957:1: ( 'Actor' )
            // InternalReqLNG.g:958:2: 'Actor'
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
    // InternalReqLNG.g:967:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:971:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalReqLNG.g:972:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
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
    // InternalReqLNG.g:979:1: rule__Actor__Group__1__Impl : ( ':' ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:983:1: ( ( ':' ) )
            // InternalReqLNG.g:984:1: ( ':' )
            {
            // InternalReqLNG.g:984:1: ( ':' )
            // InternalReqLNG.g:985:2: ':'
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
    // InternalReqLNG.g:994:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:998:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalReqLNG.g:999:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
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
    // InternalReqLNG.g:1006:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__NameAssignment_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1010:1: ( ( ( rule__Actor__NameAssignment_2 ) ) )
            // InternalReqLNG.g:1011:1: ( ( rule__Actor__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:1011:1: ( ( rule__Actor__NameAssignment_2 ) )
            // InternalReqLNG.g:1012:2: ( rule__Actor__NameAssignment_2 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:1013:2: ( rule__Actor__NameAssignment_2 )
            // InternalReqLNG.g:1013:3: rule__Actor__NameAssignment_2
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
    // InternalReqLNG.g:1021:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1025:1: ( rule__Actor__Group__3__Impl )
            // InternalReqLNG.g:1026:2: rule__Actor__Group__3__Impl
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
    // InternalReqLNG.g:1032:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__DescriptionAssignment_3 ) ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1036:1: ( ( ( rule__Actor__DescriptionAssignment_3 ) ) )
            // InternalReqLNG.g:1037:1: ( ( rule__Actor__DescriptionAssignment_3 ) )
            {
            // InternalReqLNG.g:1037:1: ( ( rule__Actor__DescriptionAssignment_3 ) )
            // InternalReqLNG.g:1038:2: ( rule__Actor__DescriptionAssignment_3 )
            {
             before(grammarAccess.getActorAccess().getDescriptionAssignment_3()); 
            // InternalReqLNG.g:1039:2: ( rule__Actor__DescriptionAssignment_3 )
            // InternalReqLNG.g:1039:3: rule__Actor__DescriptionAssignment_3
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
    // InternalReqLNG.g:1048:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1052:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalReqLNG.g:1053:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalReqLNG.g:1060:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1064:1: ( ( 'System' ) )
            // InternalReqLNG.g:1065:1: ( 'System' )
            {
            // InternalReqLNG.g:1065:1: ( 'System' )
            // InternalReqLNG.g:1066:2: 'System'
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
    // InternalReqLNG.g:1075:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1079:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalReqLNG.g:1080:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalReqLNG.g:1087:1: rule__System__Group__1__Impl : ( ':' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1091:1: ( ( ':' ) )
            // InternalReqLNG.g:1092:1: ( ':' )
            {
            // InternalReqLNG.g:1092:1: ( ':' )
            // InternalReqLNG.g:1093:2: ':'
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
    // InternalReqLNG.g:1102:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1106:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalReqLNG.g:1107:2: rule__System__Group__2__Impl rule__System__Group__3
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
    // InternalReqLNG.g:1114:1: rule__System__Group__2__Impl : ( ( rule__System__NameAssignment_2 ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1118:1: ( ( ( rule__System__NameAssignment_2 ) ) )
            // InternalReqLNG.g:1119:1: ( ( rule__System__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:1119:1: ( ( rule__System__NameAssignment_2 ) )
            // InternalReqLNG.g:1120:2: ( rule__System__NameAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:1121:2: ( rule__System__NameAssignment_2 )
            // InternalReqLNG.g:1121:3: rule__System__NameAssignment_2
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
    // InternalReqLNG.g:1129:1: rule__System__Group__3 : rule__System__Group__3__Impl ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1133:1: ( rule__System__Group__3__Impl )
            // InternalReqLNG.g:1134:2: rule__System__Group__3__Impl
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
    // InternalReqLNG.g:1140:1: rule__System__Group__3__Impl : ( ( rule__System__DescriptionAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1144:1: ( ( ( rule__System__DescriptionAssignment_3 ) ) )
            // InternalReqLNG.g:1145:1: ( ( rule__System__DescriptionAssignment_3 ) )
            {
            // InternalReqLNG.g:1145:1: ( ( rule__System__DescriptionAssignment_3 ) )
            // InternalReqLNG.g:1146:2: ( rule__System__DescriptionAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getDescriptionAssignment_3()); 
            // InternalReqLNG.g:1147:2: ( rule__System__DescriptionAssignment_3 )
            // InternalReqLNG.g:1147:3: rule__System__DescriptionAssignment_3
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
    // InternalReqLNG.g:1156:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1160:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalReqLNG.g:1161:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalReqLNG.g:1168:1: rule__Description__Group__0__Impl : ( 'Description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1172:1: ( ( 'Description' ) )
            // InternalReqLNG.g:1173:1: ( 'Description' )
            {
            // InternalReqLNG.g:1173:1: ( 'Description' )
            // InternalReqLNG.g:1174:2: 'Description'
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
    // InternalReqLNG.g:1183:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1187:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalReqLNG.g:1188:2: rule__Description__Group__1__Impl rule__Description__Group__2
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
    // InternalReqLNG.g:1195:1: rule__Description__Group__1__Impl : ( ':' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1199:1: ( ( ':' ) )
            // InternalReqLNG.g:1200:1: ( ':' )
            {
            // InternalReqLNG.g:1200:1: ( ':' )
            // InternalReqLNG.g:1201:2: ':'
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
    // InternalReqLNG.g:1210:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1214:1: ( rule__Description__Group__2__Impl )
            // InternalReqLNG.g:1215:2: rule__Description__Group__2__Impl
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
    // InternalReqLNG.g:1221:1: rule__Description__Group__2__Impl : ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1225:1: ( ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) ) )
            // InternalReqLNG.g:1226:1: ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) )
            {
            // InternalReqLNG.g:1226:1: ( ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* ) )
            // InternalReqLNG.g:1227:2: ( ( rule__Description__TextAssignment_2 ) ) ( ( rule__Description__TextAssignment_2 )* )
            {
            // InternalReqLNG.g:1227:2: ( ( rule__Description__TextAssignment_2 ) )
            // InternalReqLNG.g:1228:3: ( rule__Description__TextAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalReqLNG.g:1229:3: ( rule__Description__TextAssignment_2 )
            // InternalReqLNG.g:1229:4: rule__Description__TextAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__Description__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 

            }

            // InternalReqLNG.g:1232:2: ( ( rule__Description__TextAssignment_2 )* )
            // InternalReqLNG.g:1233:3: ( rule__Description__TextAssignment_2 )*
            {
             before(grammarAccess.getDescriptionAccess().getTextAssignment_2()); 
            // InternalReqLNG.g:1234:3: ( rule__Description__TextAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA13_2 = input.LA(2);

                    if ( ((LA13_2>=RULE_WORD && LA13_2<=RULE_STRING)||(LA13_2>=13 && LA13_2<=21)) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (LA13_3==RULE_STRING) ) {
                        int LA13_5 = input.LA(3);

                        if ( ((LA13_5>=RULE_WORD && LA13_5<=RULE_STRING)||(LA13_5>=13 && LA13_5<=21)) ) {
                            alt13=1;
                        }


                    }
                    else if ( ((LA13_3>=RULE_WORD && LA13_3<=RULE_ANY_OTHER)||(LA13_3>=13 && LA13_3<=21)) ) {
                        alt13=1;
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
                    alt13=1;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalReqLNG.g:1234:4: rule__Description__TextAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Description__TextAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalReqLNG.g:1244:1: rule__SentenceWithReferences__Group__0 : rule__SentenceWithReferences__Group__0__Impl rule__SentenceWithReferences__Group__1 ;
    public final void rule__SentenceWithReferences__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1248:1: ( rule__SentenceWithReferences__Group__0__Impl rule__SentenceWithReferences__Group__1 )
            // InternalReqLNG.g:1249:2: rule__SentenceWithReferences__Group__0__Impl rule__SentenceWithReferences__Group__1
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
    // InternalReqLNG.g:1256:1: rule__SentenceWithReferences__Group__0__Impl : ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) ) ;
    public final void rule__SentenceWithReferences__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1260:1: ( ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) ) )
            // InternalReqLNG.g:1261:1: ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) )
            {
            // InternalReqLNG.g:1261:1: ( ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 ) )
            // InternalReqLNG.g:1262:2: ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesAssignment_0()); 
            // InternalReqLNG.g:1263:2: ( rule__SentenceWithReferences__TextWithReferencesAssignment_0 )
            // InternalReqLNG.g:1263:3: rule__SentenceWithReferences__TextWithReferencesAssignment_0
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
    // InternalReqLNG.g:1271:1: rule__SentenceWithReferences__Group__1 : rule__SentenceWithReferences__Group__1__Impl ;
    public final void rule__SentenceWithReferences__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1275:1: ( rule__SentenceWithReferences__Group__1__Impl )
            // InternalReqLNG.g:1276:2: rule__SentenceWithReferences__Group__1__Impl
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
    // InternalReqLNG.g:1282:1: rule__SentenceWithReferences__Group__1__Impl : ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) ) ;
    public final void rule__SentenceWithReferences__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1286:1: ( ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) ) )
            // InternalReqLNG.g:1287:1: ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) )
            {
            // InternalReqLNG.g:1287:1: ( ( rule__SentenceWithReferences__PunctuationAssignment_1 ) )
            // InternalReqLNG.g:1288:2: ( rule__SentenceWithReferences__PunctuationAssignment_1 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAssignment_1()); 
            // InternalReqLNG.g:1289:2: ( rule__SentenceWithReferences__PunctuationAssignment_1 )
            // InternalReqLNG.g:1289:3: rule__SentenceWithReferences__PunctuationAssignment_1
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
    // InternalReqLNG.g:1298:1: rule__TextWithReferences__Group_1__0 : rule__TextWithReferences__Group_1__0__Impl rule__TextWithReferences__Group_1__1 ;
    public final void rule__TextWithReferences__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1302:1: ( rule__TextWithReferences__Group_1__0__Impl rule__TextWithReferences__Group_1__1 )
            // InternalReqLNG.g:1303:2: rule__TextWithReferences__Group_1__0__Impl rule__TextWithReferences__Group_1__1
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
    // InternalReqLNG.g:1310:1: rule__TextWithReferences__Group_1__0__Impl : ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* ) ;
    public final void rule__TextWithReferences__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1314:1: ( ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* ) )
            // InternalReqLNG.g:1315:1: ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* )
            {
            // InternalReqLNG.g:1315:1: ( ( rule__TextWithReferences__RefBeforeAssignment_1_0 )* )
            // InternalReqLNG.g:1316:2: ( rule__TextWithReferences__RefBeforeAssignment_1_0 )*
            {
             before(grammarAccess.getTextWithReferencesAccess().getRefBeforeAssignment_1_0()); 
            // InternalReqLNG.g:1317:2: ( rule__TextWithReferences__RefBeforeAssignment_1_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalReqLNG.g:1317:3: rule__TextWithReferences__RefBeforeAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithReferences__RefBeforeAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalReqLNG.g:1325:1: rule__TextWithReferences__Group_1__1 : rule__TextWithReferences__Group_1__1__Impl rule__TextWithReferences__Group_1__2 ;
    public final void rule__TextWithReferences__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1329:1: ( rule__TextWithReferences__Group_1__1__Impl rule__TextWithReferences__Group_1__2 )
            // InternalReqLNG.g:1330:2: rule__TextWithReferences__Group_1__1__Impl rule__TextWithReferences__Group_1__2
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
    // InternalReqLNG.g:1337:1: rule__TextWithReferences__Group_1__1__Impl : ( ( rule__TextWithReferences__TextAssignment_1_1 ) ) ;
    public final void rule__TextWithReferences__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1341:1: ( ( ( rule__TextWithReferences__TextAssignment_1_1 ) ) )
            // InternalReqLNG.g:1342:1: ( ( rule__TextWithReferences__TextAssignment_1_1 ) )
            {
            // InternalReqLNG.g:1342:1: ( ( rule__TextWithReferences__TextAssignment_1_1 ) )
            // InternalReqLNG.g:1343:2: ( rule__TextWithReferences__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextWithReferencesAccess().getTextAssignment_1_1()); 
            // InternalReqLNG.g:1344:2: ( rule__TextWithReferences__TextAssignment_1_1 )
            // InternalReqLNG.g:1344:3: rule__TextWithReferences__TextAssignment_1_1
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
    // InternalReqLNG.g:1352:1: rule__TextWithReferences__Group_1__2 : rule__TextWithReferences__Group_1__2__Impl rule__TextWithReferences__Group_1__3 ;
    public final void rule__TextWithReferences__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1356:1: ( rule__TextWithReferences__Group_1__2__Impl rule__TextWithReferences__Group_1__3 )
            // InternalReqLNG.g:1357:2: rule__TextWithReferences__Group_1__2__Impl rule__TextWithReferences__Group_1__3
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
    // InternalReqLNG.g:1364:1: rule__TextWithReferences__Group_1__2__Impl : ( ( rule__TextWithReferences__AfterAssignment_1_2 )* ) ;
    public final void rule__TextWithReferences__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1368:1: ( ( ( rule__TextWithReferences__AfterAssignment_1_2 )* ) )
            // InternalReqLNG.g:1369:1: ( ( rule__TextWithReferences__AfterAssignment_1_2 )* )
            {
            // InternalReqLNG.g:1369:1: ( ( rule__TextWithReferences__AfterAssignment_1_2 )* )
            // InternalReqLNG.g:1370:2: ( rule__TextWithReferences__AfterAssignment_1_2 )*
            {
             before(grammarAccess.getTextWithReferencesAccess().getAfterAssignment_1_2()); 
            // InternalReqLNG.g:1371:2: ( rule__TextWithReferences__AfterAssignment_1_2 )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalReqLNG.g:1371:3: rule__TextWithReferences__AfterAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithReferences__AfterAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalReqLNG.g:1379:1: rule__TextWithReferences__Group_1__3 : rule__TextWithReferences__Group_1__3__Impl ;
    public final void rule__TextWithReferences__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1383:1: ( rule__TextWithReferences__Group_1__3__Impl )
            // InternalReqLNG.g:1384:2: rule__TextWithReferences__Group_1__3__Impl
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
    // InternalReqLNG.g:1390:1: rule__TextWithReferences__Group_1__3__Impl : ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* ) ;
    public final void rule__TextWithReferences__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1394:1: ( ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* ) )
            // InternalReqLNG.g:1395:1: ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* )
            {
            // InternalReqLNG.g:1395:1: ( ( rule__TextWithReferences__FinalRefAssignment_1_3 )* )
            // InternalReqLNG.g:1396:2: ( rule__TextWithReferences__FinalRefAssignment_1_3 )*
            {
             before(grammarAccess.getTextWithReferencesAccess().getFinalRefAssignment_1_3()); 
            // InternalReqLNG.g:1397:2: ( rule__TextWithReferences__FinalRefAssignment_1_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_STRING) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==EOF||LA16_2==RULE_STRING||(LA16_2>=19 && LA16_2<=21)) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalReqLNG.g:1397:3: rule__TextWithReferences__FinalRefAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithReferences__FinalRefAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalReqLNG.g:1406:1: rule__ReferenceCombination__Group__0 : rule__ReferenceCombination__Group__0__Impl rule__ReferenceCombination__Group__1 ;
    public final void rule__ReferenceCombination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1410:1: ( rule__ReferenceCombination__Group__0__Impl rule__ReferenceCombination__Group__1 )
            // InternalReqLNG.g:1411:2: rule__ReferenceCombination__Group__0__Impl rule__ReferenceCombination__Group__1
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
    // InternalReqLNG.g:1418:1: rule__ReferenceCombination__Group__0__Impl : ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) ) ;
    public final void rule__ReferenceCombination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1422:1: ( ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) ) )
            // InternalReqLNG.g:1423:1: ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) )
            {
            // InternalReqLNG.g:1423:1: ( ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* ) )
            // InternalReqLNG.g:1424:2: ( ( rule__ReferenceCombination__RefsAssignment_0 ) ) ( ( rule__ReferenceCombination__RefsAssignment_0 )* )
            {
            // InternalReqLNG.g:1424:2: ( ( rule__ReferenceCombination__RefsAssignment_0 ) )
            // InternalReqLNG.g:1425:3: ( rule__ReferenceCombination__RefsAssignment_0 )
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 
            // InternalReqLNG.g:1426:3: ( rule__ReferenceCombination__RefsAssignment_0 )
            // InternalReqLNG.g:1426:4: rule__ReferenceCombination__RefsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__ReferenceCombination__RefsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 

            }

            // InternalReqLNG.g:1429:2: ( ( rule__ReferenceCombination__RefsAssignment_0 )* )
            // InternalReqLNG.g:1430:3: ( rule__ReferenceCombination__RefsAssignment_0 )*
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsAssignment_0()); 
            // InternalReqLNG.g:1431:3: ( rule__ReferenceCombination__RefsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalReqLNG.g:1431:4: rule__ReferenceCombination__RefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ReferenceCombination__RefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalReqLNG.g:1440:1: rule__ReferenceCombination__Group__1 : rule__ReferenceCombination__Group__1__Impl ;
    public final void rule__ReferenceCombination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1444:1: ( rule__ReferenceCombination__Group__1__Impl )
            // InternalReqLNG.g:1445:2: rule__ReferenceCombination__Group__1__Impl
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
    // InternalReqLNG.g:1451:1: rule__ReferenceCombination__Group__1__Impl : ( ( rule__ReferenceCombination__TextAssignment_1 ) ) ;
    public final void rule__ReferenceCombination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1455:1: ( ( ( rule__ReferenceCombination__TextAssignment_1 ) ) )
            // InternalReqLNG.g:1456:1: ( ( rule__ReferenceCombination__TextAssignment_1 ) )
            {
            // InternalReqLNG.g:1456:1: ( ( rule__ReferenceCombination__TextAssignment_1 ) )
            // InternalReqLNG.g:1457:2: ( rule__ReferenceCombination__TextAssignment_1 )
            {
             before(grammarAccess.getReferenceCombinationAccess().getTextAssignment_1()); 
            // InternalReqLNG.g:1458:2: ( rule__ReferenceCombination__TextAssignment_1 )
            // InternalReqLNG.g:1458:3: rule__ReferenceCombination__TextAssignment_1
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
    // InternalReqLNG.g:1467:1: rule__ConditionalRequirement__Group__0 : rule__ConditionalRequirement__Group__0__Impl rule__ConditionalRequirement__Group__1 ;
    public final void rule__ConditionalRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1471:1: ( rule__ConditionalRequirement__Group__0__Impl rule__ConditionalRequirement__Group__1 )
            // InternalReqLNG.g:1472:2: rule__ConditionalRequirement__Group__0__Impl rule__ConditionalRequirement__Group__1
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
    // InternalReqLNG.g:1479:1: rule__ConditionalRequirement__Group__0__Impl : ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? ) ;
    public final void rule__ConditionalRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1483:1: ( ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? ) )
            // InternalReqLNG.g:1484:1: ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? )
            {
            // InternalReqLNG.g:1484:1: ( ( rule__ConditionalRequirement__ConditionAssignment_0 )? )
            // InternalReqLNG.g:1485:2: ( rule__ConditionalRequirement__ConditionAssignment_0 )?
            {
             before(grammarAccess.getConditionalRequirementAccess().getConditionAssignment_0()); 
            // InternalReqLNG.g:1486:2: ( rule__ConditionalRequirement__ConditionAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalReqLNG.g:1486:3: rule__ConditionalRequirement__ConditionAssignment_0
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
    // InternalReqLNG.g:1494:1: rule__ConditionalRequirement__Group__1 : rule__ConditionalRequirement__Group__1__Impl rule__ConditionalRequirement__Group__2 ;
    public final void rule__ConditionalRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1498:1: ( rule__ConditionalRequirement__Group__1__Impl rule__ConditionalRequirement__Group__2 )
            // InternalReqLNG.g:1499:2: rule__ConditionalRequirement__Group__1__Impl rule__ConditionalRequirement__Group__2
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
    // InternalReqLNG.g:1506:1: rule__ConditionalRequirement__Group__1__Impl : ( ( rule__ConditionalRequirement__SystemAssignment_1 ) ) ;
    public final void rule__ConditionalRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1510:1: ( ( ( rule__ConditionalRequirement__SystemAssignment_1 ) ) )
            // InternalReqLNG.g:1511:1: ( ( rule__ConditionalRequirement__SystemAssignment_1 ) )
            {
            // InternalReqLNG.g:1511:1: ( ( rule__ConditionalRequirement__SystemAssignment_1 ) )
            // InternalReqLNG.g:1512:2: ( rule__ConditionalRequirement__SystemAssignment_1 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getSystemAssignment_1()); 
            // InternalReqLNG.g:1513:2: ( rule__ConditionalRequirement__SystemAssignment_1 )
            // InternalReqLNG.g:1513:3: rule__ConditionalRequirement__SystemAssignment_1
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
    // InternalReqLNG.g:1521:1: rule__ConditionalRequirement__Group__2 : rule__ConditionalRequirement__Group__2__Impl rule__ConditionalRequirement__Group__3 ;
    public final void rule__ConditionalRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1525:1: ( rule__ConditionalRequirement__Group__2__Impl rule__ConditionalRequirement__Group__3 )
            // InternalReqLNG.g:1526:2: rule__ConditionalRequirement__Group__2__Impl rule__ConditionalRequirement__Group__3
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
    // InternalReqLNG.g:1533:1: rule__ConditionalRequirement__Group__2__Impl : ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) ) ;
    public final void rule__ConditionalRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1537:1: ( ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) ) )
            // InternalReqLNG.g:1538:1: ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) )
            {
            // InternalReqLNG.g:1538:1: ( ( rule__ConditionalRequirement__LiabilityAssignment_2 ) )
            // InternalReqLNG.g:1539:2: ( rule__ConditionalRequirement__LiabilityAssignment_2 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getLiabilityAssignment_2()); 
            // InternalReqLNG.g:1540:2: ( rule__ConditionalRequirement__LiabilityAssignment_2 )
            // InternalReqLNG.g:1540:3: rule__ConditionalRequirement__LiabilityAssignment_2
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
    // InternalReqLNG.g:1548:1: rule__ConditionalRequirement__Group__3 : rule__ConditionalRequirement__Group__3__Impl ;
    public final void rule__ConditionalRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1552:1: ( rule__ConditionalRequirement__Group__3__Impl )
            // InternalReqLNG.g:1553:2: rule__ConditionalRequirement__Group__3__Impl
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
    // InternalReqLNG.g:1559:1: rule__ConditionalRequirement__Group__3__Impl : ( ( rule__ConditionalRequirement__EndAssignment_3 ) ) ;
    public final void rule__ConditionalRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1563:1: ( ( ( rule__ConditionalRequirement__EndAssignment_3 ) ) )
            // InternalReqLNG.g:1564:1: ( ( rule__ConditionalRequirement__EndAssignment_3 ) )
            {
            // InternalReqLNG.g:1564:1: ( ( rule__ConditionalRequirement__EndAssignment_3 ) )
            // InternalReqLNG.g:1565:2: ( rule__ConditionalRequirement__EndAssignment_3 )
            {
             before(grammarAccess.getConditionalRequirementAccess().getEndAssignment_3()); 
            // InternalReqLNG.g:1566:2: ( rule__ConditionalRequirement__EndAssignment_3 )
            // InternalReqLNG.g:1566:3: rule__ConditionalRequirement__EndAssignment_3
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
    // InternalReqLNG.g:1575:1: rule__UnconditionalRequirement__Group__0 : rule__UnconditionalRequirement__Group__0__Impl rule__UnconditionalRequirement__Group__1 ;
    public final void rule__UnconditionalRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1579:1: ( rule__UnconditionalRequirement__Group__0__Impl rule__UnconditionalRequirement__Group__1 )
            // InternalReqLNG.g:1580:2: rule__UnconditionalRequirement__Group__0__Impl rule__UnconditionalRequirement__Group__1
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
    // InternalReqLNG.g:1587:1: rule__UnconditionalRequirement__Group__0__Impl : ( ( rule__UnconditionalRequirement__TheAssignment_0 ) ) ;
    public final void rule__UnconditionalRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1591:1: ( ( ( rule__UnconditionalRequirement__TheAssignment_0 ) ) )
            // InternalReqLNG.g:1592:1: ( ( rule__UnconditionalRequirement__TheAssignment_0 ) )
            {
            // InternalReqLNG.g:1592:1: ( ( rule__UnconditionalRequirement__TheAssignment_0 ) )
            // InternalReqLNG.g:1593:2: ( rule__UnconditionalRequirement__TheAssignment_0 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getTheAssignment_0()); 
            // InternalReqLNG.g:1594:2: ( rule__UnconditionalRequirement__TheAssignment_0 )
            // InternalReqLNG.g:1594:3: rule__UnconditionalRequirement__TheAssignment_0
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
    // InternalReqLNG.g:1602:1: rule__UnconditionalRequirement__Group__1 : rule__UnconditionalRequirement__Group__1__Impl rule__UnconditionalRequirement__Group__2 ;
    public final void rule__UnconditionalRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1606:1: ( rule__UnconditionalRequirement__Group__1__Impl rule__UnconditionalRequirement__Group__2 )
            // InternalReqLNG.g:1607:2: rule__UnconditionalRequirement__Group__1__Impl rule__UnconditionalRequirement__Group__2
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
    // InternalReqLNG.g:1614:1: rule__UnconditionalRequirement__Group__1__Impl : ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) ) ;
    public final void rule__UnconditionalRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1618:1: ( ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) ) )
            // InternalReqLNG.g:1619:1: ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) )
            {
            // InternalReqLNG.g:1619:1: ( ( rule__UnconditionalRequirement__SystemAssignment_1 ) )
            // InternalReqLNG.g:1620:2: ( rule__UnconditionalRequirement__SystemAssignment_1 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getSystemAssignment_1()); 
            // InternalReqLNG.g:1621:2: ( rule__UnconditionalRequirement__SystemAssignment_1 )
            // InternalReqLNG.g:1621:3: rule__UnconditionalRequirement__SystemAssignment_1
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
    // InternalReqLNG.g:1629:1: rule__UnconditionalRequirement__Group__2 : rule__UnconditionalRequirement__Group__2__Impl rule__UnconditionalRequirement__Group__3 ;
    public final void rule__UnconditionalRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1633:1: ( rule__UnconditionalRequirement__Group__2__Impl rule__UnconditionalRequirement__Group__3 )
            // InternalReqLNG.g:1634:2: rule__UnconditionalRequirement__Group__2__Impl rule__UnconditionalRequirement__Group__3
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
    // InternalReqLNG.g:1641:1: rule__UnconditionalRequirement__Group__2__Impl : ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) ) ;
    public final void rule__UnconditionalRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1645:1: ( ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) ) )
            // InternalReqLNG.g:1646:1: ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) )
            {
            // InternalReqLNG.g:1646:1: ( ( rule__UnconditionalRequirement__LiabilityAssignment_2 ) )
            // InternalReqLNG.g:1647:2: ( rule__UnconditionalRequirement__LiabilityAssignment_2 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getLiabilityAssignment_2()); 
            // InternalReqLNG.g:1648:2: ( rule__UnconditionalRequirement__LiabilityAssignment_2 )
            // InternalReqLNG.g:1648:3: rule__UnconditionalRequirement__LiabilityAssignment_2
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
    // InternalReqLNG.g:1656:1: rule__UnconditionalRequirement__Group__3 : rule__UnconditionalRequirement__Group__3__Impl ;
    public final void rule__UnconditionalRequirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1660:1: ( rule__UnconditionalRequirement__Group__3__Impl )
            // InternalReqLNG.g:1661:2: rule__UnconditionalRequirement__Group__3__Impl
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
    // InternalReqLNG.g:1667:1: rule__UnconditionalRequirement__Group__3__Impl : ( ( rule__UnconditionalRequirement__EndAssignment_3 ) ) ;
    public final void rule__UnconditionalRequirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1671:1: ( ( ( rule__UnconditionalRequirement__EndAssignment_3 ) ) )
            // InternalReqLNG.g:1672:1: ( ( rule__UnconditionalRequirement__EndAssignment_3 ) )
            {
            // InternalReqLNG.g:1672:1: ( ( rule__UnconditionalRequirement__EndAssignment_3 ) )
            // InternalReqLNG.g:1673:2: ( rule__UnconditionalRequirement__EndAssignment_3 )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getEndAssignment_3()); 
            // InternalReqLNG.g:1674:2: ( rule__UnconditionalRequirement__EndAssignment_3 )
            // InternalReqLNG.g:1674:3: rule__UnconditionalRequirement__EndAssignment_3
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
    // InternalReqLNG.g:1683:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1687:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalReqLNG.g:1688:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
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
    // InternalReqLNG.g:1695:1: rule__Precondition__Group__0__Impl : ( ( rule__Precondition__ConditionalAssignment_0 ) ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1699:1: ( ( ( rule__Precondition__ConditionalAssignment_0 ) ) )
            // InternalReqLNG.g:1700:1: ( ( rule__Precondition__ConditionalAssignment_0 ) )
            {
            // InternalReqLNG.g:1700:1: ( ( rule__Precondition__ConditionalAssignment_0 ) )
            // InternalReqLNG.g:1701:2: ( rule__Precondition__ConditionalAssignment_0 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionalAssignment_0()); 
            // InternalReqLNG.g:1702:2: ( rule__Precondition__ConditionalAssignment_0 )
            // InternalReqLNG.g:1702:3: rule__Precondition__ConditionalAssignment_0
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
    // InternalReqLNG.g:1710:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1714:1: ( rule__Precondition__Group__1__Impl )
            // InternalReqLNG.g:1715:2: rule__Precondition__Group__1__Impl
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
    // InternalReqLNG.g:1721:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ConditionAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1725:1: ( ( ( rule__Precondition__ConditionAssignment_1 ) ) )
            // InternalReqLNG.g:1726:1: ( ( rule__Precondition__ConditionAssignment_1 ) )
            {
            // InternalReqLNG.g:1726:1: ( ( rule__Precondition__ConditionAssignment_1 ) )
            // InternalReqLNG.g:1727:2: ( rule__Precondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_1()); 
            // InternalReqLNG.g:1728:2: ( rule__Precondition__ConditionAssignment_1 )
            // InternalReqLNG.g:1728:3: rule__Precondition__ConditionAssignment_1
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
    // InternalReqLNG.g:1737:1: rule__ActorInteraction__Group__0 : rule__ActorInteraction__Group__0__Impl rule__ActorInteraction__Group__1 ;
    public final void rule__ActorInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1741:1: ( rule__ActorInteraction__Group__0__Impl rule__ActorInteraction__Group__1 )
            // InternalReqLNG.g:1742:2: rule__ActorInteraction__Group__0__Impl rule__ActorInteraction__Group__1
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
    // InternalReqLNG.g:1749:1: rule__ActorInteraction__Group__0__Impl : ( ( rule__ActorInteraction__ProvideAssignment_0 ) ) ;
    public final void rule__ActorInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1753:1: ( ( ( rule__ActorInteraction__ProvideAssignment_0 ) ) )
            // InternalReqLNG.g:1754:1: ( ( rule__ActorInteraction__ProvideAssignment_0 ) )
            {
            // InternalReqLNG.g:1754:1: ( ( rule__ActorInteraction__ProvideAssignment_0 ) )
            // InternalReqLNG.g:1755:2: ( rule__ActorInteraction__ProvideAssignment_0 )
            {
             before(grammarAccess.getActorInteractionAccess().getProvideAssignment_0()); 
            // InternalReqLNG.g:1756:2: ( rule__ActorInteraction__ProvideAssignment_0 )
            // InternalReqLNG.g:1756:3: rule__ActorInteraction__ProvideAssignment_0
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
    // InternalReqLNG.g:1764:1: rule__ActorInteraction__Group__1 : rule__ActorInteraction__Group__1__Impl rule__ActorInteraction__Group__2 ;
    public final void rule__ActorInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1768:1: ( rule__ActorInteraction__Group__1__Impl rule__ActorInteraction__Group__2 )
            // InternalReqLNG.g:1769:2: rule__ActorInteraction__Group__1__Impl rule__ActorInteraction__Group__2
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
    // InternalReqLNG.g:1776:1: rule__ActorInteraction__Group__1__Impl : ( ( rule__ActorInteraction__The1Assignment_1 )? ) ;
    public final void rule__ActorInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1780:1: ( ( ( rule__ActorInteraction__The1Assignment_1 )? ) )
            // InternalReqLNG.g:1781:1: ( ( rule__ActorInteraction__The1Assignment_1 )? )
            {
            // InternalReqLNG.g:1781:1: ( ( rule__ActorInteraction__The1Assignment_1 )? )
            // InternalReqLNG.g:1782:2: ( rule__ActorInteraction__The1Assignment_1 )?
            {
             before(grammarAccess.getActorInteractionAccess().getThe1Assignment_1()); 
            // InternalReqLNG.g:1783:2: ( rule__ActorInteraction__The1Assignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalReqLNG.g:1783:3: rule__ActorInteraction__The1Assignment_1
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
    // InternalReqLNG.g:1791:1: rule__ActorInteraction__Group__2 : rule__ActorInteraction__Group__2__Impl rule__ActorInteraction__Group__3 ;
    public final void rule__ActorInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1795:1: ( rule__ActorInteraction__Group__2__Impl rule__ActorInteraction__Group__3 )
            // InternalReqLNG.g:1796:2: rule__ActorInteraction__Group__2__Impl rule__ActorInteraction__Group__3
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
    // InternalReqLNG.g:1803:1: rule__ActorInteraction__Group__2__Impl : ( ( rule__ActorInteraction__ActorAssignment_2 ) ) ;
    public final void rule__ActorInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1807:1: ( ( ( rule__ActorInteraction__ActorAssignment_2 ) ) )
            // InternalReqLNG.g:1808:1: ( ( rule__ActorInteraction__ActorAssignment_2 ) )
            {
            // InternalReqLNG.g:1808:1: ( ( rule__ActorInteraction__ActorAssignment_2 ) )
            // InternalReqLNG.g:1809:2: ( rule__ActorInteraction__ActorAssignment_2 )
            {
             before(grammarAccess.getActorInteractionAccess().getActorAssignment_2()); 
            // InternalReqLNG.g:1810:2: ( rule__ActorInteraction__ActorAssignment_2 )
            // InternalReqLNG.g:1810:3: rule__ActorInteraction__ActorAssignment_2
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
    // InternalReqLNG.g:1818:1: rule__ActorInteraction__Group__3 : rule__ActorInteraction__Group__3__Impl rule__ActorInteraction__Group__4 ;
    public final void rule__ActorInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1822:1: ( rule__ActorInteraction__Group__3__Impl rule__ActorInteraction__Group__4 )
            // InternalReqLNG.g:1823:2: rule__ActorInteraction__Group__3__Impl rule__ActorInteraction__Group__4
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
    // InternalReqLNG.g:1830:1: rule__ActorInteraction__Group__3__Impl : ( ( rule__ActorInteraction__WithAssignment_3 ) ) ;
    public final void rule__ActorInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1834:1: ( ( ( rule__ActorInteraction__WithAssignment_3 ) ) )
            // InternalReqLNG.g:1835:1: ( ( rule__ActorInteraction__WithAssignment_3 ) )
            {
            // InternalReqLNG.g:1835:1: ( ( rule__ActorInteraction__WithAssignment_3 ) )
            // InternalReqLNG.g:1836:2: ( rule__ActorInteraction__WithAssignment_3 )
            {
             before(grammarAccess.getActorInteractionAccess().getWithAssignment_3()); 
            // InternalReqLNG.g:1837:2: ( rule__ActorInteraction__WithAssignment_3 )
            // InternalReqLNG.g:1837:3: rule__ActorInteraction__WithAssignment_3
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
    // InternalReqLNG.g:1845:1: rule__ActorInteraction__Group__4 : rule__ActorInteraction__Group__4__Impl rule__ActorInteraction__Group__5 ;
    public final void rule__ActorInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1849:1: ( rule__ActorInteraction__Group__4__Impl rule__ActorInteraction__Group__5 )
            // InternalReqLNG.g:1850:2: rule__ActorInteraction__Group__4__Impl rule__ActorInteraction__Group__5
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
    // InternalReqLNG.g:1857:1: rule__ActorInteraction__Group__4__Impl : ( ( rule__ActorInteraction__The2Assignment_4 ) ) ;
    public final void rule__ActorInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1861:1: ( ( ( rule__ActorInteraction__The2Assignment_4 ) ) )
            // InternalReqLNG.g:1862:1: ( ( rule__ActorInteraction__The2Assignment_4 ) )
            {
            // InternalReqLNG.g:1862:1: ( ( rule__ActorInteraction__The2Assignment_4 ) )
            // InternalReqLNG.g:1863:2: ( rule__ActorInteraction__The2Assignment_4 )
            {
             before(grammarAccess.getActorInteractionAccess().getThe2Assignment_4()); 
            // InternalReqLNG.g:1864:2: ( rule__ActorInteraction__The2Assignment_4 )
            // InternalReqLNG.g:1864:3: rule__ActorInteraction__The2Assignment_4
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
    // InternalReqLNG.g:1872:1: rule__ActorInteraction__Group__5 : rule__ActorInteraction__Group__5__Impl rule__ActorInteraction__Group__6 ;
    public final void rule__ActorInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1876:1: ( rule__ActorInteraction__Group__5__Impl rule__ActorInteraction__Group__6 )
            // InternalReqLNG.g:1877:2: rule__ActorInteraction__Group__5__Impl rule__ActorInteraction__Group__6
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
    // InternalReqLNG.g:1884:1: rule__ActorInteraction__Group__5__Impl : ( ( rule__ActorInteraction__AbilityAssignment_5 ) ) ;
    public final void rule__ActorInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1888:1: ( ( ( rule__ActorInteraction__AbilityAssignment_5 ) ) )
            // InternalReqLNG.g:1889:1: ( ( rule__ActorInteraction__AbilityAssignment_5 ) )
            {
            // InternalReqLNG.g:1889:1: ( ( rule__ActorInteraction__AbilityAssignment_5 ) )
            // InternalReqLNG.g:1890:2: ( rule__ActorInteraction__AbilityAssignment_5 )
            {
             before(grammarAccess.getActorInteractionAccess().getAbilityAssignment_5()); 
            // InternalReqLNG.g:1891:2: ( rule__ActorInteraction__AbilityAssignment_5 )
            // InternalReqLNG.g:1891:3: rule__ActorInteraction__AbilityAssignment_5
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
    // InternalReqLNG.g:1899:1: rule__ActorInteraction__Group__6 : rule__ActorInteraction__Group__6__Impl ;
    public final void rule__ActorInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1903:1: ( rule__ActorInteraction__Group__6__Impl )
            // InternalReqLNG.g:1904:2: rule__ActorInteraction__Group__6__Impl
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
    // InternalReqLNG.g:1910:1: rule__ActorInteraction__Group__6__Impl : ( ( rule__ActorInteraction__ToAssignment_6 ) ) ;
    public final void rule__ActorInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1914:1: ( ( ( rule__ActorInteraction__ToAssignment_6 ) ) )
            // InternalReqLNG.g:1915:1: ( ( rule__ActorInteraction__ToAssignment_6 ) )
            {
            // InternalReqLNG.g:1915:1: ( ( rule__ActorInteraction__ToAssignment_6 ) )
            // InternalReqLNG.g:1916:2: ( rule__ActorInteraction__ToAssignment_6 )
            {
             before(grammarAccess.getActorInteractionAccess().getToAssignment_6()); 
            // InternalReqLNG.g:1917:2: ( rule__ActorInteraction__ToAssignment_6 )
            // InternalReqLNG.g:1917:3: rule__ActorInteraction__ToAssignment_6
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
    // InternalReqLNG.g:1926:1: rule__RequirementEnd__Group__0 : rule__RequirementEnd__Group__0__Impl rule__RequirementEnd__Group__1 ;
    public final void rule__RequirementEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1930:1: ( rule__RequirementEnd__Group__0__Impl rule__RequirementEnd__Group__1 )
            // InternalReqLNG.g:1931:2: rule__RequirementEnd__Group__0__Impl rule__RequirementEnd__Group__1
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
    // InternalReqLNG.g:1938:1: rule__RequirementEnd__Group__0__Impl : ( ( rule__RequirementEnd__AiAssignment_0 )? ) ;
    public final void rule__RequirementEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1942:1: ( ( ( rule__RequirementEnd__AiAssignment_0 )? ) )
            // InternalReqLNG.g:1943:1: ( ( rule__RequirementEnd__AiAssignment_0 )? )
            {
            // InternalReqLNG.g:1943:1: ( ( rule__RequirementEnd__AiAssignment_0 )? )
            // InternalReqLNG.g:1944:2: ( rule__RequirementEnd__AiAssignment_0 )?
            {
             before(grammarAccess.getRequirementEndAccess().getAiAssignment_0()); 
            // InternalReqLNG.g:1945:2: ( rule__RequirementEnd__AiAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalReqLNG.g:1945:3: rule__RequirementEnd__AiAssignment_0
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
    // InternalReqLNG.g:1953:1: rule__RequirementEnd__Group__1 : rule__RequirementEnd__Group__1__Impl rule__RequirementEnd__Group__2 ;
    public final void rule__RequirementEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1957:1: ( rule__RequirementEnd__Group__1__Impl rule__RequirementEnd__Group__2 )
            // InternalReqLNG.g:1958:2: rule__RequirementEnd__Group__1__Impl rule__RequirementEnd__Group__2
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
    // InternalReqLNG.g:1965:1: rule__RequirementEnd__Group__1__Impl : ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) ) ;
    public final void rule__RequirementEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1969:1: ( ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) ) )
            // InternalReqLNG.g:1970:1: ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) )
            {
            // InternalReqLNG.g:1970:1: ( ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 ) )
            // InternalReqLNG.g:1971:2: ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 )
            {
             before(grammarAccess.getRequirementEndAccess().getObjectWithDetailsAssignment_1()); 
            // InternalReqLNG.g:1972:2: ( rule__RequirementEnd__ObjectWithDetailsAssignment_1 )
            // InternalReqLNG.g:1972:3: rule__RequirementEnd__ObjectWithDetailsAssignment_1
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
    // InternalReqLNG.g:1980:1: rule__RequirementEnd__Group__2 : rule__RequirementEnd__Group__2__Impl ;
    public final void rule__RequirementEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1984:1: ( rule__RequirementEnd__Group__2__Impl )
            // InternalReqLNG.g:1985:2: rule__RequirementEnd__Group__2__Impl
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
    // InternalReqLNG.g:1991:1: rule__RequirementEnd__Group__2__Impl : ( '.' ) ;
    public final void rule__RequirementEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:1995:1: ( ( '.' ) )
            // InternalReqLNG.g:1996:1: ( '.' )
            {
            // InternalReqLNG.g:1996:1: ( '.' )
            // InternalReqLNG.g:1997:2: '.'
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
    // InternalReqLNG.g:2007:1: rule__TextWithConceptsOrSynonyms__Group_1__0 : rule__TextWithConceptsOrSynonyms__Group_1__0__Impl rule__TextWithConceptsOrSynonyms__Group_1__1 ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2011:1: ( rule__TextWithConceptsOrSynonyms__Group_1__0__Impl rule__TextWithConceptsOrSynonyms__Group_1__1 )
            // InternalReqLNG.g:2012:2: rule__TextWithConceptsOrSynonyms__Group_1__0__Impl rule__TextWithConceptsOrSynonyms__Group_1__1
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
    // InternalReqLNG.g:2019:1: rule__TextWithConceptsOrSynonyms__Group_1__0__Impl : ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2023:1: ( ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* ) )
            // InternalReqLNG.g:2024:1: ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* )
            {
            // InternalReqLNG.g:2024:1: ( ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )* )
            // InternalReqLNG.g:2025:2: ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )*
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeAssignment_1_0()); 
            // InternalReqLNG.g:2026:2: ( rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalReqLNG.g:2026:3: rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalReqLNG.g:2034:1: rule__TextWithConceptsOrSynonyms__Group_1__1 : rule__TextWithConceptsOrSynonyms__Group_1__1__Impl rule__TextWithConceptsOrSynonyms__Group_1__2 ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2038:1: ( rule__TextWithConceptsOrSynonyms__Group_1__1__Impl rule__TextWithConceptsOrSynonyms__Group_1__2 )
            // InternalReqLNG.g:2039:2: rule__TextWithConceptsOrSynonyms__Group_1__1__Impl rule__TextWithConceptsOrSynonyms__Group_1__2
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
    // InternalReqLNG.g:2046:1: rule__TextWithConceptsOrSynonyms__Group_1__1__Impl : ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2050:1: ( ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) ) )
            // InternalReqLNG.g:2051:1: ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) )
            {
            // InternalReqLNG.g:2051:1: ( ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 ) )
            // InternalReqLNG.g:2052:2: ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextAssignment_1_1()); 
            // InternalReqLNG.g:2053:2: ( rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 )
            // InternalReqLNG.g:2053:3: rule__TextWithConceptsOrSynonyms__TextAssignment_1_1
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
    // InternalReqLNG.g:2061:1: rule__TextWithConceptsOrSynonyms__Group_1__2 : rule__TextWithConceptsOrSynonyms__Group_1__2__Impl rule__TextWithConceptsOrSynonyms__Group_1__3 ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2065:1: ( rule__TextWithConceptsOrSynonyms__Group_1__2__Impl rule__TextWithConceptsOrSynonyms__Group_1__3 )
            // InternalReqLNG.g:2066:2: rule__TextWithConceptsOrSynonyms__Group_1__2__Impl rule__TextWithConceptsOrSynonyms__Group_1__3
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
    // InternalReqLNG.g:2073:1: rule__TextWithConceptsOrSynonyms__Group_1__2__Impl : ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2077:1: ( ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* ) )
            // InternalReqLNG.g:2078:1: ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* )
            {
            // InternalReqLNG.g:2078:1: ( ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )* )
            // InternalReqLNG.g:2079:2: ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )*
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterAssignment_1_2()); 
            // InternalReqLNG.g:2080:2: ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )*
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalReqLNG.g:2080:3: rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalReqLNG.g:2088:1: rule__TextWithConceptsOrSynonyms__Group_1__3 : rule__TextWithConceptsOrSynonyms__Group_1__3__Impl ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2092:1: ( rule__TextWithConceptsOrSynonyms__Group_1__3__Impl )
            // InternalReqLNG.g:2093:2: rule__TextWithConceptsOrSynonyms__Group_1__3__Impl
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
    // InternalReqLNG.g:2099:1: rule__TextWithConceptsOrSynonyms__Group_1__3__Impl : ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* ) ;
    public final void rule__TextWithConceptsOrSynonyms__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2103:1: ( ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* ) )
            // InternalReqLNG.g:2104:1: ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* )
            {
            // InternalReqLNG.g:2104:1: ( ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )* )
            // InternalReqLNG.g:2105:2: ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )*
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefAssignment_1_3()); 
            // InternalReqLNG.g:2106:2: ( rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalReqLNG.g:2106:3: rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalReqLNG.g:2115:1: rule__ConceptCombination__Group__0 : rule__ConceptCombination__Group__0__Impl rule__ConceptCombination__Group__1 ;
    public final void rule__ConceptCombination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2119:1: ( rule__ConceptCombination__Group__0__Impl rule__ConceptCombination__Group__1 )
            // InternalReqLNG.g:2120:2: rule__ConceptCombination__Group__0__Impl rule__ConceptCombination__Group__1
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
    // InternalReqLNG.g:2127:1: rule__ConceptCombination__Group__0__Impl : ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) ) ;
    public final void rule__ConceptCombination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2131:1: ( ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) ) )
            // InternalReqLNG.g:2132:1: ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) )
            {
            // InternalReqLNG.g:2132:1: ( ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* ) )
            // InternalReqLNG.g:2133:2: ( ( rule__ConceptCombination__ConceptsAssignment_0 ) ) ( ( rule__ConceptCombination__ConceptsAssignment_0 )* )
            {
            // InternalReqLNG.g:2133:2: ( ( rule__ConceptCombination__ConceptsAssignment_0 ) )
            // InternalReqLNG.g:2134:3: ( rule__ConceptCombination__ConceptsAssignment_0 )
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 
            // InternalReqLNG.g:2135:3: ( rule__ConceptCombination__ConceptsAssignment_0 )
            // InternalReqLNG.g:2135:4: rule__ConceptCombination__ConceptsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__ConceptCombination__ConceptsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 

            }

            // InternalReqLNG.g:2138:2: ( ( rule__ConceptCombination__ConceptsAssignment_0 )* )
            // InternalReqLNG.g:2139:3: ( rule__ConceptCombination__ConceptsAssignment_0 )*
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsAssignment_0()); 
            // InternalReqLNG.g:2140:3: ( rule__ConceptCombination__ConceptsAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalReqLNG.g:2140:4: rule__ConceptCombination__ConceptsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ConceptCombination__ConceptsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalReqLNG.g:2149:1: rule__ConceptCombination__Group__1 : rule__ConceptCombination__Group__1__Impl ;
    public final void rule__ConceptCombination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2153:1: ( rule__ConceptCombination__Group__1__Impl )
            // InternalReqLNG.g:2154:2: rule__ConceptCombination__Group__1__Impl
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
    // InternalReqLNG.g:2160:1: rule__ConceptCombination__Group__1__Impl : ( ( rule__ConceptCombination__TextAssignment_1 ) ) ;
    public final void rule__ConceptCombination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2164:1: ( ( ( rule__ConceptCombination__TextAssignment_1 ) ) )
            // InternalReqLNG.g:2165:1: ( ( rule__ConceptCombination__TextAssignment_1 ) )
            {
            // InternalReqLNG.g:2165:1: ( ( rule__ConceptCombination__TextAssignment_1 ) )
            // InternalReqLNG.g:2166:2: ( rule__ConceptCombination__TextAssignment_1 )
            {
             before(grammarAccess.getConceptCombinationAccess().getTextAssignment_1()); 
            // InternalReqLNG.g:2167:2: ( rule__ConceptCombination__TextAssignment_1 )
            // InternalReqLNG.g:2167:3: rule__ConceptCombination__TextAssignment_1
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
    // InternalReqLNG.g:2176:1: rule__Glossary__Group__0 : rule__Glossary__Group__0__Impl rule__Glossary__Group__1 ;
    public final void rule__Glossary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2180:1: ( rule__Glossary__Group__0__Impl rule__Glossary__Group__1 )
            // InternalReqLNG.g:2181:2: rule__Glossary__Group__0__Impl rule__Glossary__Group__1
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
    // InternalReqLNG.g:2188:1: rule__Glossary__Group__0__Impl : ( () ) ;
    public final void rule__Glossary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2192:1: ( ( () ) )
            // InternalReqLNG.g:2193:1: ( () )
            {
            // InternalReqLNG.g:2193:1: ( () )
            // InternalReqLNG.g:2194:2: ()
            {
             before(grammarAccess.getGlossaryAccess().getGlossaryAction_0()); 
            // InternalReqLNG.g:2195:2: ()
            // InternalReqLNG.g:2195:3: 
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
    // InternalReqLNG.g:2203:1: rule__Glossary__Group__1 : rule__Glossary__Group__1__Impl rule__Glossary__Group__2 ;
    public final void rule__Glossary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2207:1: ( rule__Glossary__Group__1__Impl rule__Glossary__Group__2 )
            // InternalReqLNG.g:2208:2: rule__Glossary__Group__1__Impl rule__Glossary__Group__2
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
    // InternalReqLNG.g:2215:1: rule__Glossary__Group__1__Impl : ( 'Glossary' ) ;
    public final void rule__Glossary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2219:1: ( ( 'Glossary' ) )
            // InternalReqLNG.g:2220:1: ( 'Glossary' )
            {
            // InternalReqLNG.g:2220:1: ( 'Glossary' )
            // InternalReqLNG.g:2221:2: 'Glossary'
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
    // InternalReqLNG.g:2230:1: rule__Glossary__Group__2 : rule__Glossary__Group__2__Impl ;
    public final void rule__Glossary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2234:1: ( rule__Glossary__Group__2__Impl )
            // InternalReqLNG.g:2235:2: rule__Glossary__Group__2__Impl
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
    // InternalReqLNG.g:2241:1: rule__Glossary__Group__2__Impl : ( ( rule__Glossary__ConceptsAssignment_2 )* ) ;
    public final void rule__Glossary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2245:1: ( ( ( rule__Glossary__ConceptsAssignment_2 )* ) )
            // InternalReqLNG.g:2246:1: ( ( rule__Glossary__ConceptsAssignment_2 )* )
            {
            // InternalReqLNG.g:2246:1: ( ( rule__Glossary__ConceptsAssignment_2 )* )
            // InternalReqLNG.g:2247:2: ( rule__Glossary__ConceptsAssignment_2 )*
            {
             before(grammarAccess.getGlossaryAccess().getConceptsAssignment_2()); 
            // InternalReqLNG.g:2248:2: ( rule__Glossary__ConceptsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30||LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalReqLNG.g:2248:3: rule__Glossary__ConceptsAssignment_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Glossary__ConceptsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalReqLNG.g:2257:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2261:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalReqLNG.g:2262:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalReqLNG.g:2269:1: rule__Function__Group__0__Impl : ( 'Function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2273:1: ( ( 'Function' ) )
            // InternalReqLNG.g:2274:1: ( 'Function' )
            {
            // InternalReqLNG.g:2274:1: ( 'Function' )
            // InternalReqLNG.g:2275:2: 'Function'
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
    // InternalReqLNG.g:2284:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2288:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalReqLNG.g:2289:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalReqLNG.g:2296:1: rule__Function__Group__1__Impl : ( ':' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2300:1: ( ( ':' ) )
            // InternalReqLNG.g:2301:1: ( ':' )
            {
            // InternalReqLNG.g:2301:1: ( ':' )
            // InternalReqLNG.g:2302:2: ':'
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
    // InternalReqLNG.g:2311:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2315:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalReqLNG.g:2316:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalReqLNG.g:2323:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2327:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalReqLNG.g:2328:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:2328:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalReqLNG.g:2329:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:2330:2: ( rule__Function__NameAssignment_2 )
            // InternalReqLNG.g:2330:3: rule__Function__NameAssignment_2
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
    // InternalReqLNG.g:2338:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2342:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalReqLNG.g:2343:2: rule__Function__Group__3__Impl rule__Function__Group__4
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
    // InternalReqLNG.g:2350:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2354:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalReqLNG.g:2355:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalReqLNG.g:2355:1: ( ( rule__Function__Group_3__0 )? )
            // InternalReqLNG.g:2356:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalReqLNG.g:2357:2: ( rule__Function__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReqLNG.g:2357:3: rule__Function__Group_3__0
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
    // InternalReqLNG.g:2365:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2369:1: ( rule__Function__Group__4__Impl )
            // InternalReqLNG.g:2370:2: rule__Function__Group__4__Impl
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
    // InternalReqLNG.g:2376:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2380:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // InternalReqLNG.g:2381:1: ( ( rule__Function__Group_4__0 )? )
            {
            // InternalReqLNG.g:2381:1: ( ( rule__Function__Group_4__0 )? )
            // InternalReqLNG.g:2382:2: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // InternalReqLNG.g:2383:2: ( rule__Function__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReqLNG.g:2383:3: rule__Function__Group_4__0
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
    // InternalReqLNG.g:2392:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2396:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalReqLNG.g:2397:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
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
    // InternalReqLNG.g:2404:1: rule__Function__Group_3__0__Impl : ( 'Synonyms' ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2408:1: ( ( 'Synonyms' ) )
            // InternalReqLNG.g:2409:1: ( 'Synonyms' )
            {
            // InternalReqLNG.g:2409:1: ( 'Synonyms' )
            // InternalReqLNG.g:2410:2: 'Synonyms'
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
    // InternalReqLNG.g:2419:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl rule__Function__Group_3__2 ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2423:1: ( rule__Function__Group_3__1__Impl rule__Function__Group_3__2 )
            // InternalReqLNG.g:2424:2: rule__Function__Group_3__1__Impl rule__Function__Group_3__2
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
    // InternalReqLNG.g:2431:1: rule__Function__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2435:1: ( ( ':' ) )
            // InternalReqLNG.g:2436:1: ( ':' )
            {
            // InternalReqLNG.g:2436:1: ( ':' )
            // InternalReqLNG.g:2437:2: ':'
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
    // InternalReqLNG.g:2446:1: rule__Function__Group_3__2 : rule__Function__Group_3__2__Impl rule__Function__Group_3__3 ;
    public final void rule__Function__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2450:1: ( rule__Function__Group_3__2__Impl rule__Function__Group_3__3 )
            // InternalReqLNG.g:2451:2: rule__Function__Group_3__2__Impl rule__Function__Group_3__3
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
    // InternalReqLNG.g:2458:1: rule__Function__Group_3__2__Impl : ( ( rule__Function__SynonymsAssignment_3_2 ) ) ;
    public final void rule__Function__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2462:1: ( ( ( rule__Function__SynonymsAssignment_3_2 ) ) )
            // InternalReqLNG.g:2463:1: ( ( rule__Function__SynonymsAssignment_3_2 ) )
            {
            // InternalReqLNG.g:2463:1: ( ( rule__Function__SynonymsAssignment_3_2 ) )
            // InternalReqLNG.g:2464:2: ( rule__Function__SynonymsAssignment_3_2 )
            {
             before(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_2()); 
            // InternalReqLNG.g:2465:2: ( rule__Function__SynonymsAssignment_3_2 )
            // InternalReqLNG.g:2465:3: rule__Function__SynonymsAssignment_3_2
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
    // InternalReqLNG.g:2473:1: rule__Function__Group_3__3 : rule__Function__Group_3__3__Impl ;
    public final void rule__Function__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2477:1: ( rule__Function__Group_3__3__Impl )
            // InternalReqLNG.g:2478:2: rule__Function__Group_3__3__Impl
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
    // InternalReqLNG.g:2484:1: rule__Function__Group_3__3__Impl : ( ( rule__Function__Group_3_3__0 )* ) ;
    public final void rule__Function__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2488:1: ( ( ( rule__Function__Group_3_3__0 )* ) )
            // InternalReqLNG.g:2489:1: ( ( rule__Function__Group_3_3__0 )* )
            {
            // InternalReqLNG.g:2489:1: ( ( rule__Function__Group_3_3__0 )* )
            // InternalReqLNG.g:2490:2: ( rule__Function__Group_3_3__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_3()); 
            // InternalReqLNG.g:2491:2: ( rule__Function__Group_3_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalReqLNG.g:2491:3: rule__Function__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Function__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalReqLNG.g:2500:1: rule__Function__Group_3_3__0 : rule__Function__Group_3_3__0__Impl rule__Function__Group_3_3__1 ;
    public final void rule__Function__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2504:1: ( rule__Function__Group_3_3__0__Impl rule__Function__Group_3_3__1 )
            // InternalReqLNG.g:2505:2: rule__Function__Group_3_3__0__Impl rule__Function__Group_3_3__1
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
    // InternalReqLNG.g:2512:1: rule__Function__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2516:1: ( ( ',' ) )
            // InternalReqLNG.g:2517:1: ( ',' )
            {
            // InternalReqLNG.g:2517:1: ( ',' )
            // InternalReqLNG.g:2518:2: ','
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
    // InternalReqLNG.g:2527:1: rule__Function__Group_3_3__1 : rule__Function__Group_3_3__1__Impl ;
    public final void rule__Function__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2531:1: ( rule__Function__Group_3_3__1__Impl )
            // InternalReqLNG.g:2532:2: rule__Function__Group_3_3__1__Impl
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
    // InternalReqLNG.g:2538:1: rule__Function__Group_3_3__1__Impl : ( ( rule__Function__SynonymsAssignment_3_3_1 ) ) ;
    public final void rule__Function__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2542:1: ( ( ( rule__Function__SynonymsAssignment_3_3_1 ) ) )
            // InternalReqLNG.g:2543:1: ( ( rule__Function__SynonymsAssignment_3_3_1 ) )
            {
            // InternalReqLNG.g:2543:1: ( ( rule__Function__SynonymsAssignment_3_3_1 ) )
            // InternalReqLNG.g:2544:2: ( rule__Function__SynonymsAssignment_3_3_1 )
            {
             before(grammarAccess.getFunctionAccess().getSynonymsAssignment_3_3_1()); 
            // InternalReqLNG.g:2545:2: ( rule__Function__SynonymsAssignment_3_3_1 )
            // InternalReqLNG.g:2545:3: rule__Function__SynonymsAssignment_3_3_1
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
    // InternalReqLNG.g:2554:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2558:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // InternalReqLNG.g:2559:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
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
    // InternalReqLNG.g:2566:1: rule__Function__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2570:1: ( ( 'Description' ) )
            // InternalReqLNG.g:2571:1: ( 'Description' )
            {
            // InternalReqLNG.g:2571:1: ( 'Description' )
            // InternalReqLNG.g:2572:2: 'Description'
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
    // InternalReqLNG.g:2581:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl rule__Function__Group_4__2 ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2585:1: ( rule__Function__Group_4__1__Impl rule__Function__Group_4__2 )
            // InternalReqLNG.g:2586:2: rule__Function__Group_4__1__Impl rule__Function__Group_4__2
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
    // InternalReqLNG.g:2593:1: rule__Function__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2597:1: ( ( ':' ) )
            // InternalReqLNG.g:2598:1: ( ':' )
            {
            // InternalReqLNG.g:2598:1: ( ':' )
            // InternalReqLNG.g:2599:2: ':'
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
    // InternalReqLNG.g:2608:1: rule__Function__Group_4__2 : rule__Function__Group_4__2__Impl ;
    public final void rule__Function__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2612:1: ( rule__Function__Group_4__2__Impl )
            // InternalReqLNG.g:2613:2: rule__Function__Group_4__2__Impl
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
    // InternalReqLNG.g:2619:1: rule__Function__Group_4__2__Impl : ( ( rule__Function__DescriptionAssignment_4_2 )* ) ;
    public final void rule__Function__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2623:1: ( ( ( rule__Function__DescriptionAssignment_4_2 )* ) )
            // InternalReqLNG.g:2624:1: ( ( rule__Function__DescriptionAssignment_4_2 )* )
            {
            // InternalReqLNG.g:2624:1: ( ( rule__Function__DescriptionAssignment_4_2 )* )
            // InternalReqLNG.g:2625:2: ( rule__Function__DescriptionAssignment_4_2 )*
            {
             before(grammarAccess.getFunctionAccess().getDescriptionAssignment_4_2()); 
            // InternalReqLNG.g:2626:2: ( rule__Function__DescriptionAssignment_4_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_STRING)||(LA29_0>=13 && LA29_0<=18)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalReqLNG.g:2626:3: rule__Function__DescriptionAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Function__DescriptionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalReqLNG.g:2635:1: rule__DomainObject__Group__0 : rule__DomainObject__Group__0__Impl rule__DomainObject__Group__1 ;
    public final void rule__DomainObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2639:1: ( rule__DomainObject__Group__0__Impl rule__DomainObject__Group__1 )
            // InternalReqLNG.g:2640:2: rule__DomainObject__Group__0__Impl rule__DomainObject__Group__1
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
    // InternalReqLNG.g:2647:1: rule__DomainObject__Group__0__Impl : ( 'Object' ) ;
    public final void rule__DomainObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2651:1: ( ( 'Object' ) )
            // InternalReqLNG.g:2652:1: ( 'Object' )
            {
            // InternalReqLNG.g:2652:1: ( 'Object' )
            // InternalReqLNG.g:2653:2: 'Object'
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
    // InternalReqLNG.g:2662:1: rule__DomainObject__Group__1 : rule__DomainObject__Group__1__Impl rule__DomainObject__Group__2 ;
    public final void rule__DomainObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2666:1: ( rule__DomainObject__Group__1__Impl rule__DomainObject__Group__2 )
            // InternalReqLNG.g:2667:2: rule__DomainObject__Group__1__Impl rule__DomainObject__Group__2
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
    // InternalReqLNG.g:2674:1: rule__DomainObject__Group__1__Impl : ( ':' ) ;
    public final void rule__DomainObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2678:1: ( ( ':' ) )
            // InternalReqLNG.g:2679:1: ( ':' )
            {
            // InternalReqLNG.g:2679:1: ( ':' )
            // InternalReqLNG.g:2680:2: ':'
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
    // InternalReqLNG.g:2689:1: rule__DomainObject__Group__2 : rule__DomainObject__Group__2__Impl rule__DomainObject__Group__3 ;
    public final void rule__DomainObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2693:1: ( rule__DomainObject__Group__2__Impl rule__DomainObject__Group__3 )
            // InternalReqLNG.g:2694:2: rule__DomainObject__Group__2__Impl rule__DomainObject__Group__3
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
    // InternalReqLNG.g:2701:1: rule__DomainObject__Group__2__Impl : ( ( rule__DomainObject__NameAssignment_2 ) ) ;
    public final void rule__DomainObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2705:1: ( ( ( rule__DomainObject__NameAssignment_2 ) ) )
            // InternalReqLNG.g:2706:1: ( ( rule__DomainObject__NameAssignment_2 ) )
            {
            // InternalReqLNG.g:2706:1: ( ( rule__DomainObject__NameAssignment_2 ) )
            // InternalReqLNG.g:2707:2: ( rule__DomainObject__NameAssignment_2 )
            {
             before(grammarAccess.getDomainObjectAccess().getNameAssignment_2()); 
            // InternalReqLNG.g:2708:2: ( rule__DomainObject__NameAssignment_2 )
            // InternalReqLNG.g:2708:3: rule__DomainObject__NameAssignment_2
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
    // InternalReqLNG.g:2716:1: rule__DomainObject__Group__3 : rule__DomainObject__Group__3__Impl rule__DomainObject__Group__4 ;
    public final void rule__DomainObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2720:1: ( rule__DomainObject__Group__3__Impl rule__DomainObject__Group__4 )
            // InternalReqLNG.g:2721:2: rule__DomainObject__Group__3__Impl rule__DomainObject__Group__4
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
    // InternalReqLNG.g:2728:1: rule__DomainObject__Group__3__Impl : ( ( rule__DomainObject__Group_3__0 )? ) ;
    public final void rule__DomainObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2732:1: ( ( ( rule__DomainObject__Group_3__0 )? ) )
            // InternalReqLNG.g:2733:1: ( ( rule__DomainObject__Group_3__0 )? )
            {
            // InternalReqLNG.g:2733:1: ( ( rule__DomainObject__Group_3__0 )? )
            // InternalReqLNG.g:2734:2: ( rule__DomainObject__Group_3__0 )?
            {
             before(grammarAccess.getDomainObjectAccess().getGroup_3()); 
            // InternalReqLNG.g:2735:2: ( rule__DomainObject__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalReqLNG.g:2735:3: rule__DomainObject__Group_3__0
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
    // InternalReqLNG.g:2743:1: rule__DomainObject__Group__4 : rule__DomainObject__Group__4__Impl ;
    public final void rule__DomainObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2747:1: ( rule__DomainObject__Group__4__Impl )
            // InternalReqLNG.g:2748:2: rule__DomainObject__Group__4__Impl
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
    // InternalReqLNG.g:2754:1: rule__DomainObject__Group__4__Impl : ( ( rule__DomainObject__Group_4__0 )? ) ;
    public final void rule__DomainObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2758:1: ( ( ( rule__DomainObject__Group_4__0 )? ) )
            // InternalReqLNG.g:2759:1: ( ( rule__DomainObject__Group_4__0 )? )
            {
            // InternalReqLNG.g:2759:1: ( ( rule__DomainObject__Group_4__0 )? )
            // InternalReqLNG.g:2760:2: ( rule__DomainObject__Group_4__0 )?
            {
             before(grammarAccess.getDomainObjectAccess().getGroup_4()); 
            // InternalReqLNG.g:2761:2: ( rule__DomainObject__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalReqLNG.g:2761:3: rule__DomainObject__Group_4__0
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
    // InternalReqLNG.g:2770:1: rule__DomainObject__Group_3__0 : rule__DomainObject__Group_3__0__Impl rule__DomainObject__Group_3__1 ;
    public final void rule__DomainObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2774:1: ( rule__DomainObject__Group_3__0__Impl rule__DomainObject__Group_3__1 )
            // InternalReqLNG.g:2775:2: rule__DomainObject__Group_3__0__Impl rule__DomainObject__Group_3__1
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
    // InternalReqLNG.g:2782:1: rule__DomainObject__Group_3__0__Impl : ( 'Synonyms' ) ;
    public final void rule__DomainObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2786:1: ( ( 'Synonyms' ) )
            // InternalReqLNG.g:2787:1: ( 'Synonyms' )
            {
            // InternalReqLNG.g:2787:1: ( 'Synonyms' )
            // InternalReqLNG.g:2788:2: 'Synonyms'
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
    // InternalReqLNG.g:2797:1: rule__DomainObject__Group_3__1 : rule__DomainObject__Group_3__1__Impl rule__DomainObject__Group_3__2 ;
    public final void rule__DomainObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2801:1: ( rule__DomainObject__Group_3__1__Impl rule__DomainObject__Group_3__2 )
            // InternalReqLNG.g:2802:2: rule__DomainObject__Group_3__1__Impl rule__DomainObject__Group_3__2
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
    // InternalReqLNG.g:2809:1: rule__DomainObject__Group_3__1__Impl : ( ':' ) ;
    public final void rule__DomainObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2813:1: ( ( ':' ) )
            // InternalReqLNG.g:2814:1: ( ':' )
            {
            // InternalReqLNG.g:2814:1: ( ':' )
            // InternalReqLNG.g:2815:2: ':'
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
    // InternalReqLNG.g:2824:1: rule__DomainObject__Group_3__2 : rule__DomainObject__Group_3__2__Impl rule__DomainObject__Group_3__3 ;
    public final void rule__DomainObject__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2828:1: ( rule__DomainObject__Group_3__2__Impl rule__DomainObject__Group_3__3 )
            // InternalReqLNG.g:2829:2: rule__DomainObject__Group_3__2__Impl rule__DomainObject__Group_3__3
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
    // InternalReqLNG.g:2836:1: rule__DomainObject__Group_3__2__Impl : ( ( rule__DomainObject__SynonymsAssignment_3_2 ) ) ;
    public final void rule__DomainObject__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2840:1: ( ( ( rule__DomainObject__SynonymsAssignment_3_2 ) ) )
            // InternalReqLNG.g:2841:1: ( ( rule__DomainObject__SynonymsAssignment_3_2 ) )
            {
            // InternalReqLNG.g:2841:1: ( ( rule__DomainObject__SynonymsAssignment_3_2 ) )
            // InternalReqLNG.g:2842:2: ( rule__DomainObject__SynonymsAssignment_3_2 )
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_2()); 
            // InternalReqLNG.g:2843:2: ( rule__DomainObject__SynonymsAssignment_3_2 )
            // InternalReqLNG.g:2843:3: rule__DomainObject__SynonymsAssignment_3_2
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
    // InternalReqLNG.g:2851:1: rule__DomainObject__Group_3__3 : rule__DomainObject__Group_3__3__Impl ;
    public final void rule__DomainObject__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2855:1: ( rule__DomainObject__Group_3__3__Impl )
            // InternalReqLNG.g:2856:2: rule__DomainObject__Group_3__3__Impl
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
    // InternalReqLNG.g:2862:1: rule__DomainObject__Group_3__3__Impl : ( ( rule__DomainObject__Group_3_3__0 )* ) ;
    public final void rule__DomainObject__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2866:1: ( ( ( rule__DomainObject__Group_3_3__0 )* ) )
            // InternalReqLNG.g:2867:1: ( ( rule__DomainObject__Group_3_3__0 )* )
            {
            // InternalReqLNG.g:2867:1: ( ( rule__DomainObject__Group_3_3__0 )* )
            // InternalReqLNG.g:2868:2: ( rule__DomainObject__Group_3_3__0 )*
            {
             before(grammarAccess.getDomainObjectAccess().getGroup_3_3()); 
            // InternalReqLNG.g:2869:2: ( rule__DomainObject__Group_3_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalReqLNG.g:2869:3: rule__DomainObject__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__DomainObject__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalReqLNG.g:2878:1: rule__DomainObject__Group_3_3__0 : rule__DomainObject__Group_3_3__0__Impl rule__DomainObject__Group_3_3__1 ;
    public final void rule__DomainObject__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2882:1: ( rule__DomainObject__Group_3_3__0__Impl rule__DomainObject__Group_3_3__1 )
            // InternalReqLNG.g:2883:2: rule__DomainObject__Group_3_3__0__Impl rule__DomainObject__Group_3_3__1
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
    // InternalReqLNG.g:2890:1: rule__DomainObject__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__DomainObject__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2894:1: ( ( ',' ) )
            // InternalReqLNG.g:2895:1: ( ',' )
            {
            // InternalReqLNG.g:2895:1: ( ',' )
            // InternalReqLNG.g:2896:2: ','
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
    // InternalReqLNG.g:2905:1: rule__DomainObject__Group_3_3__1 : rule__DomainObject__Group_3_3__1__Impl ;
    public final void rule__DomainObject__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2909:1: ( rule__DomainObject__Group_3_3__1__Impl )
            // InternalReqLNG.g:2910:2: rule__DomainObject__Group_3_3__1__Impl
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
    // InternalReqLNG.g:2916:1: rule__DomainObject__Group_3_3__1__Impl : ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) ) ;
    public final void rule__DomainObject__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2920:1: ( ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) ) )
            // InternalReqLNG.g:2921:1: ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) )
            {
            // InternalReqLNG.g:2921:1: ( ( rule__DomainObject__SynonymsAssignment_3_3_1 ) )
            // InternalReqLNG.g:2922:2: ( rule__DomainObject__SynonymsAssignment_3_3_1 )
            {
             before(grammarAccess.getDomainObjectAccess().getSynonymsAssignment_3_3_1()); 
            // InternalReqLNG.g:2923:2: ( rule__DomainObject__SynonymsAssignment_3_3_1 )
            // InternalReqLNG.g:2923:3: rule__DomainObject__SynonymsAssignment_3_3_1
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
    // InternalReqLNG.g:2932:1: rule__DomainObject__Group_4__0 : rule__DomainObject__Group_4__0__Impl rule__DomainObject__Group_4__1 ;
    public final void rule__DomainObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2936:1: ( rule__DomainObject__Group_4__0__Impl rule__DomainObject__Group_4__1 )
            // InternalReqLNG.g:2937:2: rule__DomainObject__Group_4__0__Impl rule__DomainObject__Group_4__1
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
    // InternalReqLNG.g:2944:1: rule__DomainObject__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__DomainObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2948:1: ( ( 'Description' ) )
            // InternalReqLNG.g:2949:1: ( 'Description' )
            {
            // InternalReqLNG.g:2949:1: ( 'Description' )
            // InternalReqLNG.g:2950:2: 'Description'
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
    // InternalReqLNG.g:2959:1: rule__DomainObject__Group_4__1 : rule__DomainObject__Group_4__1__Impl rule__DomainObject__Group_4__2 ;
    public final void rule__DomainObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2963:1: ( rule__DomainObject__Group_4__1__Impl rule__DomainObject__Group_4__2 )
            // InternalReqLNG.g:2964:2: rule__DomainObject__Group_4__1__Impl rule__DomainObject__Group_4__2
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
    // InternalReqLNG.g:2971:1: rule__DomainObject__Group_4__1__Impl : ( ':' ) ;
    public final void rule__DomainObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2975:1: ( ( ':' ) )
            // InternalReqLNG.g:2976:1: ( ':' )
            {
            // InternalReqLNG.g:2976:1: ( ':' )
            // InternalReqLNG.g:2977:2: ':'
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
    // InternalReqLNG.g:2986:1: rule__DomainObject__Group_4__2 : rule__DomainObject__Group_4__2__Impl ;
    public final void rule__DomainObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:2990:1: ( rule__DomainObject__Group_4__2__Impl )
            // InternalReqLNG.g:2991:2: rule__DomainObject__Group_4__2__Impl
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
    // InternalReqLNG.g:2997:1: rule__DomainObject__Group_4__2__Impl : ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) ) ;
    public final void rule__DomainObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3001:1: ( ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) ) )
            // InternalReqLNG.g:3002:1: ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) )
            {
            // InternalReqLNG.g:3002:1: ( ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* ) )
            // InternalReqLNG.g:3003:2: ( ( rule__DomainObject__DescriptionAssignment_4_2 ) ) ( ( rule__DomainObject__DescriptionAssignment_4_2 )* )
            {
            // InternalReqLNG.g:3003:2: ( ( rule__DomainObject__DescriptionAssignment_4_2 ) )
            // InternalReqLNG.g:3004:3: ( rule__DomainObject__DescriptionAssignment_4_2 )
            {
             before(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 
            // InternalReqLNG.g:3005:3: ( rule__DomainObject__DescriptionAssignment_4_2 )
            // InternalReqLNG.g:3005:4: rule__DomainObject__DescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_11);
            rule__DomainObject__DescriptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 

            }

            // InternalReqLNG.g:3008:2: ( ( rule__DomainObject__DescriptionAssignment_4_2 )* )
            // InternalReqLNG.g:3009:3: ( rule__DomainObject__DescriptionAssignment_4_2 )*
            {
             before(grammarAccess.getDomainObjectAccess().getDescriptionAssignment_4_2()); 
            // InternalReqLNG.g:3010:3: ( rule__DomainObject__DescriptionAssignment_4_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_WORD && LA33_0<=RULE_STRING)||(LA33_0>=13 && LA33_0<=18)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalReqLNG.g:3010:4: rule__DomainObject__DescriptionAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DomainObject__DescriptionAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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


    // $ANTLR start "rule__Entities__ActorAssignment_0_0"
    // InternalReqLNG.g:3020:1: rule__Entities__ActorAssignment_0_0 : ( ruleActor ) ;
    public final void rule__Entities__ActorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3024:1: ( ( ruleActor ) )
            // InternalReqLNG.g:3025:2: ( ruleActor )
            {
            // InternalReqLNG.g:3025:2: ( ruleActor )
            // InternalReqLNG.g:3026:3: ruleActor
            {
             before(grammarAccess.getEntitiesAccess().getActorActorParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getActorActorParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Entities__ActorAssignment_0_0"


    // $ANTLR start "rule__Entities__SystemAssignment_0_1"
    // InternalReqLNG.g:3035:1: rule__Entities__SystemAssignment_0_1 : ( ruleSystem ) ;
    public final void rule__Entities__SystemAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3039:1: ( ( ruleSystem ) )
            // InternalReqLNG.g:3040:2: ( ruleSystem )
            {
            // InternalReqLNG.g:3040:2: ( ruleSystem )
            // InternalReqLNG.g:3041:3: ruleSystem
            {
             before(grammarAccess.getEntitiesAccess().getSystemSystemParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getSystemSystemParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Entities__SystemAssignment_0_1"


    // $ANTLR start "rule__Entities__RequirementAssignment_0_2"
    // InternalReqLNG.g:3050:1: rule__Entities__RequirementAssignment_0_2 : ( ruleRequirement ) ;
    public final void rule__Entities__RequirementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3054:1: ( ( ruleRequirement ) )
            // InternalReqLNG.g:3055:2: ( ruleRequirement )
            {
            // InternalReqLNG.g:3055:2: ( ruleRequirement )
            // InternalReqLNG.g:3056:3: ruleRequirement
            {
             before(grammarAccess.getEntitiesAccess().getRequirementRequirementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getRequirementRequirementParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Entities__RequirementAssignment_0_2"


    // $ANTLR start "rule__Entities__GlossaryAssignment_1"
    // InternalReqLNG.g:3065:1: rule__Entities__GlossaryAssignment_1 : ( ruleGlossary ) ;
    public final void rule__Entities__GlossaryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3069:1: ( ( ruleGlossary ) )
            // InternalReqLNG.g:3070:2: ( ruleGlossary )
            {
            // InternalReqLNG.g:3070:2: ( ruleGlossary )
            // InternalReqLNG.g:3071:3: ruleGlossary
            {
             before(grammarAccess.getEntitiesAccess().getGlossaryGlossaryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGlossary();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getGlossaryGlossaryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entities__GlossaryAssignment_1"


    // $ANTLR start "rule__Actor__NameAssignment_2"
    // InternalReqLNG.g:3080:1: rule__Actor__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Actor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3084:1: ( ( ruleText ) )
            // InternalReqLNG.g:3085:2: ( ruleText )
            {
            // InternalReqLNG.g:3085:2: ( ruleText )
            // InternalReqLNG.g:3086:3: ruleText
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
    // InternalReqLNG.g:3095:1: rule__Actor__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Actor__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3099:1: ( ( ruleDescription ) )
            // InternalReqLNG.g:3100:2: ( ruleDescription )
            {
            // InternalReqLNG.g:3100:2: ( ruleDescription )
            // InternalReqLNG.g:3101:3: ruleDescription
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
    // InternalReqLNG.g:3110:1: rule__System__NameAssignment_2 : ( ruleText ) ;
    public final void rule__System__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3114:1: ( ( ruleText ) )
            // InternalReqLNG.g:3115:2: ( ruleText )
            {
            // InternalReqLNG.g:3115:2: ( ruleText )
            // InternalReqLNG.g:3116:3: ruleText
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
    // InternalReqLNG.g:3125:1: rule__System__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__System__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3129:1: ( ( ruleDescription ) )
            // InternalReqLNG.g:3130:2: ( ruleDescription )
            {
            // InternalReqLNG.g:3130:2: ( ruleDescription )
            // InternalReqLNG.g:3131:3: ruleDescription
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
    // InternalReqLNG.g:3140:1: rule__Description__TextAssignment_2 : ( ruleSentenceWithReferences ) ;
    public final void rule__Description__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3144:1: ( ( ruleSentenceWithReferences ) )
            // InternalReqLNG.g:3145:2: ( ruleSentenceWithReferences )
            {
            // InternalReqLNG.g:3145:2: ( ruleSentenceWithReferences )
            // InternalReqLNG.g:3146:3: ruleSentenceWithReferences
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
    // InternalReqLNG.g:3155:1: rule__SentenceWithReferences__TextWithReferencesAssignment_0 : ( ruleTextWithReferences ) ;
    public final void rule__SentenceWithReferences__TextWithReferencesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3159:1: ( ( ruleTextWithReferences ) )
            // InternalReqLNG.g:3160:2: ( ruleTextWithReferences )
            {
            // InternalReqLNG.g:3160:2: ( ruleTextWithReferences )
            // InternalReqLNG.g:3161:3: ruleTextWithReferences
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
    // InternalReqLNG.g:3170:1: rule__SentenceWithReferences__PunctuationAssignment_1 : ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) ) ;
    public final void rule__SentenceWithReferences__PunctuationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3174:1: ( ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) ) )
            // InternalReqLNG.g:3175:2: ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) )
            {
            // InternalReqLNG.g:3175:2: ( ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 ) )
            // InternalReqLNG.g:3176:3: ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 )
            {
             before(grammarAccess.getSentenceWithReferencesAccess().getPunctuationAlternatives_1_0()); 
            // InternalReqLNG.g:3177:3: ( rule__SentenceWithReferences__PunctuationAlternatives_1_0 )
            // InternalReqLNG.g:3177:4: rule__SentenceWithReferences__PunctuationAlternatives_1_0
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
    // InternalReqLNG.g:3185:1: rule__TextWithReferences__OnlyRefsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithReferences__OnlyRefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3189:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3190:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3190:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3191:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitiesCrossReference_0_0()); 
            // InternalReqLNG.g:3192:3: ( RULE_STRING )
            // InternalReqLNG.g:3193:4: RULE_STRING
            {
             before(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitiesSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitiesSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitiesCrossReference_0_0()); 

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
    // InternalReqLNG.g:3204:1: rule__TextWithReferences__RefBeforeAssignment_1_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithReferences__RefBeforeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3208:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3209:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3209:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3210:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitiesCrossReference_1_0_0()); 
            // InternalReqLNG.g:3211:3: ( RULE_STRING )
            // InternalReqLNG.g:3212:4: RULE_STRING
            {
             before(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitiesSTRINGTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitiesSTRINGTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitiesCrossReference_1_0_0()); 

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
    // InternalReqLNG.g:3223:1: rule__TextWithReferences__TextAssignment_1_1 : ( ruleText ) ;
    public final void rule__TextWithReferences__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3227:1: ( ( ruleText ) )
            // InternalReqLNG.g:3228:2: ( ruleText )
            {
            // InternalReqLNG.g:3228:2: ( ruleText )
            // InternalReqLNG.g:3229:3: ruleText
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
    // InternalReqLNG.g:3238:1: rule__TextWithReferences__AfterAssignment_1_2 : ( ruleReferenceCombination ) ;
    public final void rule__TextWithReferences__AfterAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3242:1: ( ( ruleReferenceCombination ) )
            // InternalReqLNG.g:3243:2: ( ruleReferenceCombination )
            {
            // InternalReqLNG.g:3243:2: ( ruleReferenceCombination )
            // InternalReqLNG.g:3244:3: ruleReferenceCombination
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
    // InternalReqLNG.g:3253:1: rule__TextWithReferences__FinalRefAssignment_1_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithReferences__FinalRefAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3257:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3258:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3258:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3259:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithReferencesAccess().getFinalRefEntitiesCrossReference_1_3_0()); 
            // InternalReqLNG.g:3260:3: ( RULE_STRING )
            // InternalReqLNG.g:3261:4: RULE_STRING
            {
             before(grammarAccess.getTextWithReferencesAccess().getFinalRefEntitiesSTRINGTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextWithReferencesAccess().getFinalRefEntitiesSTRINGTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getTextWithReferencesAccess().getFinalRefEntitiesCrossReference_1_3_0()); 

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
    // InternalReqLNG.g:3272:1: rule__ReferenceCombination__RefsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__ReferenceCombination__RefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3276:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3277:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3277:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3278:3: ( RULE_STRING )
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsEntitiesCrossReference_0_0()); 
            // InternalReqLNG.g:3279:3: ( RULE_STRING )
            // InternalReqLNG.g:3280:4: RULE_STRING
            {
             before(grammarAccess.getReferenceCombinationAccess().getRefsEntitiesSTRINGTerminalRuleCall_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceCombinationAccess().getRefsEntitiesSTRINGTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceCombinationAccess().getRefsEntitiesCrossReference_0_0()); 

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
    // InternalReqLNG.g:3291:1: rule__ReferenceCombination__TextAssignment_1 : ( ruleText ) ;
    public final void rule__ReferenceCombination__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3295:1: ( ( ruleText ) )
            // InternalReqLNG.g:3296:2: ( ruleText )
            {
            // InternalReqLNG.g:3296:2: ( ruleText )
            // InternalReqLNG.g:3297:3: ruleText
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
    // InternalReqLNG.g:3306:1: rule__ConditionalRequirement__ConditionAssignment_0 : ( rulePrecondition ) ;
    public final void rule__ConditionalRequirement__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3310:1: ( ( rulePrecondition ) )
            // InternalReqLNG.g:3311:2: ( rulePrecondition )
            {
            // InternalReqLNG.g:3311:2: ( rulePrecondition )
            // InternalReqLNG.g:3312:3: rulePrecondition
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
    // InternalReqLNG.g:3321:1: rule__ConditionalRequirement__SystemAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ConditionalRequirement__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3325:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3326:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3326:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3327:3: ( RULE_STRING )
            {
             before(grammarAccess.getConditionalRequirementAccess().getSystemSystemCrossReference_1_0()); 
            // InternalReqLNG.g:3328:3: ( RULE_STRING )
            // InternalReqLNG.g:3329:4: RULE_STRING
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
    // InternalReqLNG.g:3340:1: rule__ConditionalRequirement__LiabilityAssignment_2 : ( ruleLiability ) ;
    public final void rule__ConditionalRequirement__LiabilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3344:1: ( ( ruleLiability ) )
            // InternalReqLNG.g:3345:2: ( ruleLiability )
            {
            // InternalReqLNG.g:3345:2: ( ruleLiability )
            // InternalReqLNG.g:3346:3: ruleLiability
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
    // InternalReqLNG.g:3355:1: rule__ConditionalRequirement__EndAssignment_3 : ( ruleRequirementEnd ) ;
    public final void rule__ConditionalRequirement__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3359:1: ( ( ruleRequirementEnd ) )
            // InternalReqLNG.g:3360:2: ( ruleRequirementEnd )
            {
            // InternalReqLNG.g:3360:2: ( ruleRequirementEnd )
            // InternalReqLNG.g:3361:3: ruleRequirementEnd
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
    // InternalReqLNG.g:3370:1: rule__UnconditionalRequirement__TheAssignment_0 : ( ( 'The' ) ) ;
    public final void rule__UnconditionalRequirement__TheAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3374:1: ( ( ( 'The' ) ) )
            // InternalReqLNG.g:3375:2: ( ( 'The' ) )
            {
            // InternalReqLNG.g:3375:2: ( ( 'The' ) )
            // InternalReqLNG.g:3376:3: ( 'The' )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0()); 
            // InternalReqLNG.g:3377:3: ( 'The' )
            // InternalReqLNG.g:3378:4: 'The'
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
    // InternalReqLNG.g:3389:1: rule__UnconditionalRequirement__SystemAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__UnconditionalRequirement__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3393:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3394:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3394:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3395:3: ( RULE_STRING )
            {
             before(grammarAccess.getUnconditionalRequirementAccess().getSystemSystemCrossReference_1_0()); 
            // InternalReqLNG.g:3396:3: ( RULE_STRING )
            // InternalReqLNG.g:3397:4: RULE_STRING
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
    // InternalReqLNG.g:3408:1: rule__UnconditionalRequirement__LiabilityAssignment_2 : ( ruleLiability ) ;
    public final void rule__UnconditionalRequirement__LiabilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3412:1: ( ( ruleLiability ) )
            // InternalReqLNG.g:3413:2: ( ruleLiability )
            {
            // InternalReqLNG.g:3413:2: ( ruleLiability )
            // InternalReqLNG.g:3414:3: ruleLiability
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
    // InternalReqLNG.g:3423:1: rule__UnconditionalRequirement__EndAssignment_3 : ( ruleRequirementEnd ) ;
    public final void rule__UnconditionalRequirement__EndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3427:1: ( ( ruleRequirementEnd ) )
            // InternalReqLNG.g:3428:2: ( ruleRequirementEnd )
            {
            // InternalReqLNG.g:3428:2: ( ruleRequirementEnd )
            // InternalReqLNG.g:3429:3: ruleRequirementEnd
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
    // InternalReqLNG.g:3438:1: rule__Precondition__ConditionalAssignment_0 : ( ruleConditional ) ;
    public final void rule__Precondition__ConditionalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3442:1: ( ( ruleConditional ) )
            // InternalReqLNG.g:3443:2: ( ruleConditional )
            {
            // InternalReqLNG.g:3443:2: ( ruleConditional )
            // InternalReqLNG.g:3444:3: ruleConditional
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
    // InternalReqLNG.g:3453:1: rule__Precondition__ConditionAssignment_1 : ( ruleTextWithReferences ) ;
    public final void rule__Precondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3457:1: ( ( ruleTextWithReferences ) )
            // InternalReqLNG.g:3458:2: ( ruleTextWithReferences )
            {
            // InternalReqLNG.g:3458:2: ( ruleTextWithReferences )
            // InternalReqLNG.g:3459:3: ruleTextWithReferences
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
    // InternalReqLNG.g:3468:1: rule__ActorInteraction__ProvideAssignment_0 : ( ( 'provide' ) ) ;
    public final void rule__ActorInteraction__ProvideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3472:1: ( ( ( 'provide' ) ) )
            // InternalReqLNG.g:3473:2: ( ( 'provide' ) )
            {
            // InternalReqLNG.g:3473:2: ( ( 'provide' ) )
            // InternalReqLNG.g:3474:3: ( 'provide' )
            {
             before(grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0()); 
            // InternalReqLNG.g:3475:3: ( 'provide' )
            // InternalReqLNG.g:3476:4: 'provide'
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
    // InternalReqLNG.g:3487:1: rule__ActorInteraction__The1Assignment_1 : ( ( 'the' ) ) ;
    public final void rule__ActorInteraction__The1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3491:1: ( ( ( 'the' ) ) )
            // InternalReqLNG.g:3492:2: ( ( 'the' ) )
            {
            // InternalReqLNG.g:3492:2: ( ( 'the' ) )
            // InternalReqLNG.g:3493:3: ( 'the' )
            {
             before(grammarAccess.getActorInteractionAccess().getThe1TheKeyword_1_0()); 
            // InternalReqLNG.g:3494:3: ( 'the' )
            // InternalReqLNG.g:3495:4: 'the'
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
    // InternalReqLNG.g:3506:1: rule__ActorInteraction__ActorAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ActorInteraction__ActorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3510:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3511:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3511:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3512:3: ( RULE_STRING )
            {
             before(grammarAccess.getActorInteractionAccess().getActorActorCrossReference_2_0()); 
            // InternalReqLNG.g:3513:3: ( RULE_STRING )
            // InternalReqLNG.g:3514:4: RULE_STRING
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
    // InternalReqLNG.g:3525:1: rule__ActorInteraction__WithAssignment_3 : ( ( 'with' ) ) ;
    public final void rule__ActorInteraction__WithAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3529:1: ( ( ( 'with' ) ) )
            // InternalReqLNG.g:3530:2: ( ( 'with' ) )
            {
            // InternalReqLNG.g:3530:2: ( ( 'with' ) )
            // InternalReqLNG.g:3531:3: ( 'with' )
            {
             before(grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0()); 
            // InternalReqLNG.g:3532:3: ( 'with' )
            // InternalReqLNG.g:3533:4: 'with'
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
    // InternalReqLNG.g:3544:1: rule__ActorInteraction__The2Assignment_4 : ( ( 'the' ) ) ;
    public final void rule__ActorInteraction__The2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3548:1: ( ( ( 'the' ) ) )
            // InternalReqLNG.g:3549:2: ( ( 'the' ) )
            {
            // InternalReqLNG.g:3549:2: ( ( 'the' ) )
            // InternalReqLNG.g:3550:3: ( 'the' )
            {
             before(grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0()); 
            // InternalReqLNG.g:3551:3: ( 'the' )
            // InternalReqLNG.g:3552:4: 'the'
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
    // InternalReqLNG.g:3563:1: rule__ActorInteraction__AbilityAssignment_5 : ( ( 'ability' ) ) ;
    public final void rule__ActorInteraction__AbilityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3567:1: ( ( ( 'ability' ) ) )
            // InternalReqLNG.g:3568:2: ( ( 'ability' ) )
            {
            // InternalReqLNG.g:3568:2: ( ( 'ability' ) )
            // InternalReqLNG.g:3569:3: ( 'ability' )
            {
             before(grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0()); 
            // InternalReqLNG.g:3570:3: ( 'ability' )
            // InternalReqLNG.g:3571:4: 'ability'
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
    // InternalReqLNG.g:3582:1: rule__ActorInteraction__ToAssignment_6 : ( ( 'to' ) ) ;
    public final void rule__ActorInteraction__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3586:1: ( ( ( 'to' ) ) )
            // InternalReqLNG.g:3587:2: ( ( 'to' ) )
            {
            // InternalReqLNG.g:3587:2: ( ( 'to' ) )
            // InternalReqLNG.g:3588:3: ( 'to' )
            {
             before(grammarAccess.getActorInteractionAccess().getToToKeyword_6_0()); 
            // InternalReqLNG.g:3589:3: ( 'to' )
            // InternalReqLNG.g:3590:4: 'to'
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
    // InternalReqLNG.g:3601:1: rule__RequirementEnd__AiAssignment_0 : ( ruleActorInteraction ) ;
    public final void rule__RequirementEnd__AiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3605:1: ( ( ruleActorInteraction ) )
            // InternalReqLNG.g:3606:2: ( ruleActorInteraction )
            {
            // InternalReqLNG.g:3606:2: ( ruleActorInteraction )
            // InternalReqLNG.g:3607:3: ruleActorInteraction
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
    // InternalReqLNG.g:3616:1: rule__RequirementEnd__ObjectWithDetailsAssignment_1 : ( ruleTextWithConceptsOrSynonyms ) ;
    public final void rule__RequirementEnd__ObjectWithDetailsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3620:1: ( ( ruleTextWithConceptsOrSynonyms ) )
            // InternalReqLNG.g:3621:2: ( ruleTextWithConceptsOrSynonyms )
            {
            // InternalReqLNG.g:3621:2: ( ruleTextWithConceptsOrSynonyms )
            // InternalReqLNG.g:3622:3: ruleTextWithConceptsOrSynonyms
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
    // InternalReqLNG.g:3631:1: rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3635:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3636:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3636:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3637:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsConceptOrSynonymCrossReference_0_0()); 
            // InternalReqLNG.g:3638:3: ( RULE_STRING )
            // InternalReqLNG.g:3639:4: RULE_STRING
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
    // InternalReqLNG.g:3650:1: rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__RefBeforeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3654:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3655:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3655:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3656:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeConceptOrSynonymCrossReference_1_0_0()); 
            // InternalReqLNG.g:3657:3: ( RULE_STRING )
            // InternalReqLNG.g:3658:4: RULE_STRING
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
    // InternalReqLNG.g:3669:1: rule__TextWithConceptsOrSynonyms__TextAssignment_1_1 : ( ruleText ) ;
    public final void rule__TextWithConceptsOrSynonyms__TextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3673:1: ( ( ruleText ) )
            // InternalReqLNG.g:3674:2: ( ruleText )
            {
            // InternalReqLNG.g:3674:2: ( ruleText )
            // InternalReqLNG.g:3675:3: ruleText
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
    // InternalReqLNG.g:3684:1: rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 : ( ruleConceptCombination ) ;
    public final void rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3688:1: ( ( ruleConceptCombination ) )
            // InternalReqLNG.g:3689:2: ( ruleConceptCombination )
            {
            // InternalReqLNG.g:3689:2: ( ruleConceptCombination )
            // InternalReqLNG.g:3690:3: ruleConceptCombination
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
    // InternalReqLNG.g:3699:1: rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3 : ( ( RULE_STRING ) ) ;
    public final void rule__TextWithConceptsOrSynonyms__FinalRefAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3703:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3704:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3704:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3705:3: ( RULE_STRING )
            {
             before(grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefConceptOrSynonymCrossReference_1_3_0()); 
            // InternalReqLNG.g:3706:3: ( RULE_STRING )
            // InternalReqLNG.g:3707:4: RULE_STRING
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
    // InternalReqLNG.g:3718:1: rule__ConceptCombination__ConceptsAssignment_0 : ( ( RULE_STRING ) ) ;
    public final void rule__ConceptCombination__ConceptsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3722:1: ( ( ( RULE_STRING ) ) )
            // InternalReqLNG.g:3723:2: ( ( RULE_STRING ) )
            {
            // InternalReqLNG.g:3723:2: ( ( RULE_STRING ) )
            // InternalReqLNG.g:3724:3: ( RULE_STRING )
            {
             before(grammarAccess.getConceptCombinationAccess().getConceptsConceptOrSynonymCrossReference_0_0()); 
            // InternalReqLNG.g:3725:3: ( RULE_STRING )
            // InternalReqLNG.g:3726:4: RULE_STRING
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
    // InternalReqLNG.g:3737:1: rule__ConceptCombination__TextAssignment_1 : ( ruleText ) ;
    public final void rule__ConceptCombination__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3741:1: ( ( ruleText ) )
            // InternalReqLNG.g:3742:2: ( ruleText )
            {
            // InternalReqLNG.g:3742:2: ( ruleText )
            // InternalReqLNG.g:3743:3: ruleText
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
    // InternalReqLNG.g:3752:1: rule__Glossary__ConceptsAssignment_2 : ( ruleConcept ) ;
    public final void rule__Glossary__ConceptsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3756:1: ( ( ruleConcept ) )
            // InternalReqLNG.g:3757:2: ( ruleConcept )
            {
            // InternalReqLNG.g:3757:2: ( ruleConcept )
            // InternalReqLNG.g:3758:3: ruleConcept
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
    // InternalReqLNG.g:3767:1: rule__Function__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3771:1: ( ( ruleText ) )
            // InternalReqLNG.g:3772:2: ( ruleText )
            {
            // InternalReqLNG.g:3772:2: ( ruleText )
            // InternalReqLNG.g:3773:3: ruleText
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
    // InternalReqLNG.g:3782:1: rule__Function__SynonymsAssignment_3_2 : ( ruleFunctionSynonym ) ;
    public final void rule__Function__SynonymsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3786:1: ( ( ruleFunctionSynonym ) )
            // InternalReqLNG.g:3787:2: ( ruleFunctionSynonym )
            {
            // InternalReqLNG.g:3787:2: ( ruleFunctionSynonym )
            // InternalReqLNG.g:3788:3: ruleFunctionSynonym
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
    // InternalReqLNG.g:3797:1: rule__Function__SynonymsAssignment_3_3_1 : ( ruleFunctionSynonym ) ;
    public final void rule__Function__SynonymsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3801:1: ( ( ruleFunctionSynonym ) )
            // InternalReqLNG.g:3802:2: ( ruleFunctionSynonym )
            {
            // InternalReqLNG.g:3802:2: ( ruleFunctionSynonym )
            // InternalReqLNG.g:3803:3: ruleFunctionSynonym
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
    // InternalReqLNG.g:3812:1: rule__Function__DescriptionAssignment_4_2 : ( ruleSentenceWithReferences ) ;
    public final void rule__Function__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3816:1: ( ( ruleSentenceWithReferences ) )
            // InternalReqLNG.g:3817:2: ( ruleSentenceWithReferences )
            {
            // InternalReqLNG.g:3817:2: ( ruleSentenceWithReferences )
            // InternalReqLNG.g:3818:3: ruleSentenceWithReferences
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
    // InternalReqLNG.g:3827:1: rule__DomainObject__NameAssignment_2 : ( ruleText ) ;
    public final void rule__DomainObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3831:1: ( ( ruleText ) )
            // InternalReqLNG.g:3832:2: ( ruleText )
            {
            // InternalReqLNG.g:3832:2: ( ruleText )
            // InternalReqLNG.g:3833:3: ruleText
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
    // InternalReqLNG.g:3842:1: rule__DomainObject__SynonymsAssignment_3_2 : ( ruleDomainObjectSynonym ) ;
    public final void rule__DomainObject__SynonymsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3846:1: ( ( ruleDomainObjectSynonym ) )
            // InternalReqLNG.g:3847:2: ( ruleDomainObjectSynonym )
            {
            // InternalReqLNG.g:3847:2: ( ruleDomainObjectSynonym )
            // InternalReqLNG.g:3848:3: ruleDomainObjectSynonym
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
    // InternalReqLNG.g:3857:1: rule__DomainObject__SynonymsAssignment_3_3_1 : ( ruleDomainObjectSynonym ) ;
    public final void rule__DomainObject__SynonymsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3861:1: ( ( ruleDomainObjectSynonym ) )
            // InternalReqLNG.g:3862:2: ( ruleDomainObjectSynonym )
            {
            // InternalReqLNG.g:3862:2: ( ruleDomainObjectSynonym )
            // InternalReqLNG.g:3863:3: ruleDomainObjectSynonym
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
    // InternalReqLNG.g:3872:1: rule__DomainObject__DescriptionAssignment_4_2 : ( ruleSentenceWithReferences ) ;
    public final void rule__DomainObject__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3876:1: ( ( ruleSentenceWithReferences ) )
            // InternalReqLNG.g:3877:2: ( ruleSentenceWithReferences )
            {
            // InternalReqLNG.g:3877:2: ( ruleSentenceWithReferences )
            // InternalReqLNG.g:3878:3: ruleSentenceWithReferences
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
    // InternalReqLNG.g:3887:1: rule__FunctionSynonym__NameAssignment : ( ruleText ) ;
    public final void rule__FunctionSynonym__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3891:1: ( ( ruleText ) )
            // InternalReqLNG.g:3892:2: ( ruleText )
            {
            // InternalReqLNG.g:3892:2: ( ruleText )
            // InternalReqLNG.g:3893:3: ruleText
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
    // InternalReqLNG.g:3902:1: rule__DomainObjectSynonym__NameAssignment : ( ruleText ) ;
    public final void rule__DomainObjectSynonym__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalReqLNG.g:3906:1: ( ( ruleText ) )
            // InternalReqLNG.g:3907:2: ( ruleText )
            {
            // InternalReqLNG.g:3907:2: ( ruleText )
            // InternalReqLNG.g:3908:3: ruleText
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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "761:1: rule__TextWithReferences__Alternatives : ( ( ( ( rule__TextWithReferences__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithReferences__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithReferences__Group_1__0 ) ) );";
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_8;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_9;
        }
        public String getDescription() {
            return "810:1: rule__TextWithConceptsOrSynonyms__Alternatives : ( ( ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 ) ) ( ( rule__TextWithConceptsOrSynonyms__OnlyRefsAssignment_0 )* ) ) | ( ( rule__TextWithConceptsOrSynonyms__Group_1__0 ) ) );";
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_12;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1371:2: ( rule__TextWithReferences__AfterAssignment_1_2 )*";
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_10;
            this.min = dfa_11;
            this.max = dfa_14;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "()* loopback of 2080:2: ( rule__TextWithConceptsOrSynonyms__AfterAssignment_1_2 )*";
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