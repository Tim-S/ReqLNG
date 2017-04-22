package de.schneidertim.requirements.nlp.parser.antlr.internal;

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
import de.schneidertim.requirements.nlp.services.ReqLNGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLNGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ANY_OTHER", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Actor'", "':'", "'System'", "'Description'", "'To'", "'to'", "'A'", "'a'", "'the'", "'The'", "'.'", "'!'", "'?'", "'If'", "'provide'", "'with'", "'ability'", "'Glossary'", "'Function'", "'Synonyms'", "','", "'Object'", "'shall'", "'should'", "'will'"
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

        public InternalReqLNGParser(TokenStream input, ReqLNGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RequirementDocument";
       	}

       	@Override
       	protected ReqLNGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRequirementDocument"
    // InternalReqLNG.g:65:1: entryRuleRequirementDocument returns [EObject current=null] : iv_ruleRequirementDocument= ruleRequirementDocument EOF ;
    public final EObject entryRuleRequirementDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementDocument = null;


        try {
            // InternalReqLNG.g:65:60: (iv_ruleRequirementDocument= ruleRequirementDocument EOF )
            // InternalReqLNG.g:66:2: iv_ruleRequirementDocument= ruleRequirementDocument EOF
            {
             newCompositeNode(grammarAccess.getRequirementDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementDocument=ruleRequirementDocument();

            state._fsp--;

             current =iv_ruleRequirementDocument; 
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
    // $ANTLR end "entryRuleRequirementDocument"


    // $ANTLR start "ruleRequirementDocument"
    // InternalReqLNG.g:72:1: ruleRequirementDocument returns [EObject current=null] : ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_requirement_1_0= ruleRequirement ) ) )* ( (lv_glossary_2_0= ruleGlossary ) ) ) ;
    public final EObject ruleRequirementDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_requirement_1_0 = null;

        EObject lv_glossary_2_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:78:2: ( ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_requirement_1_0= ruleRequirement ) ) )* ( (lv_glossary_2_0= ruleGlossary ) ) ) )
            // InternalReqLNG.g:79:2: ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_requirement_1_0= ruleRequirement ) ) )* ( (lv_glossary_2_0= ruleGlossary ) ) )
            {
            // InternalReqLNG.g:79:2: ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_requirement_1_0= ruleRequirement ) ) )* ( (lv_glossary_2_0= ruleGlossary ) ) )
            // InternalReqLNG.g:80:3: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_requirement_1_0= ruleRequirement ) ) )* ( (lv_glossary_2_0= ruleGlossary ) )
            {
            // InternalReqLNG.g:80:3: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_requirement_1_0= ruleRequirement ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_STRING||LA1_0==21||LA1_0==25) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqLNG.g:81:4: ( (lv_entities_0_0= ruleEntity ) )
            	    {
            	    // InternalReqLNG.g:81:4: ( (lv_entities_0_0= ruleEntity ) )
            	    // InternalReqLNG.g:82:5: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalReqLNG.g:82:5: (lv_entities_0_0= ruleEntity )
            	    // InternalReqLNG.g:83:6: lv_entities_0_0= ruleEntity
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementDocumentAccess().getEntitiesEntityParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementDocumentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_0_0,
            	    							"de.schneidertim.requirements.nlp.ReqLNG.Entity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalReqLNG.g:101:4: ( (lv_requirement_1_0= ruleRequirement ) )
            	    {
            	    // InternalReqLNG.g:101:4: ( (lv_requirement_1_0= ruleRequirement ) )
            	    // InternalReqLNG.g:102:5: (lv_requirement_1_0= ruleRequirement )
            	    {
            	    // InternalReqLNG.g:102:5: (lv_requirement_1_0= ruleRequirement )
            	    // InternalReqLNG.g:103:6: lv_requirement_1_0= ruleRequirement
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementDocumentAccess().getRequirementRequirementParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_requirement_1_0=ruleRequirement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementDocumentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"requirement",
            	    							lv_requirement_1_0,
            	    							"de.schneidertim.requirements.nlp.ReqLNG.Requirement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalReqLNG.g:121:3: ( (lv_glossary_2_0= ruleGlossary ) )
            // InternalReqLNG.g:122:4: (lv_glossary_2_0= ruleGlossary )
            {
            // InternalReqLNG.g:122:4: (lv_glossary_2_0= ruleGlossary )
            // InternalReqLNG.g:123:5: lv_glossary_2_0= ruleGlossary
            {

            					newCompositeNode(grammarAccess.getRequirementDocumentAccess().getGlossaryGlossaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_glossary_2_0=ruleGlossary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementDocumentRule());
            					}
            					set(
            						current,
            						"glossary",
            						lv_glossary_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Glossary");
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
    // $ANTLR end "ruleRequirementDocument"


    // $ANTLR start "entryRuleEntity"
    // InternalReqLNG.g:144:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalReqLNG.g:144:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalReqLNG.g:145:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalReqLNG.g:151:1: ruleEntity returns [EObject current=null] : (this_Actor_0= ruleActor | this_System_1= ruleSystem ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_System_1 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:157:2: ( (this_Actor_0= ruleActor | this_System_1= ruleSystem ) )
            // InternalReqLNG.g:158:2: (this_Actor_0= ruleActor | this_System_1= ruleSystem )
            {
            // InternalReqLNG.g:158:2: (this_Actor_0= ruleActor | this_System_1= ruleSystem )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqLNG.g:159:3: this_Actor_0= ruleActor
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getActorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actor_0=ruleActor();

                    state._fsp--;


                    			current = this_Actor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:168:3: this_System_1= ruleSystem
                    {

                    			newCompositeNode(grammarAccess.getEntityAccess().getSystemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_System_1=ruleSystem();

                    state._fsp--;


                    			current = this_System_1;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleActor"
    // InternalReqLNG.g:180:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalReqLNG.g:180:46: (iv_ruleActor= ruleActor EOF )
            // InternalReqLNG.g:181:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalReqLNG.g:187:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:193:2: ( (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalReqLNG.g:194:2: (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalReqLNG.g:194:2: (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            // InternalReqLNG.g:195:3: otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:203:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:204:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:204:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:205:5: lv_name_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getActorAccess().getNameTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:222:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalReqLNG.g:223:4: (lv_description_3_0= ruleDescription )
            {
            // InternalReqLNG.g:223:4: (lv_description_3_0= ruleDescription )
            // InternalReqLNG.g:224:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getActorAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Description");
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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleSystem"
    // InternalReqLNG.g:245:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalReqLNG.g:245:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalReqLNG.g:246:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalReqLNG.g:252:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:258:2: ( (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalReqLNG.g:259:2: (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalReqLNG.g:259:2: (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            // InternalReqLNG.g:260:3: otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:268:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:269:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:269:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:270:5: lv_name_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getNameTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:287:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalReqLNG.g:288:4: (lv_description_3_0= ruleDescription )
            {
            // InternalReqLNG.g:288:4: (lv_description_3_0= ruleDescription )
            // InternalReqLNG.g:289:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getSystemAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Description");
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleDescription"
    // InternalReqLNG.g:310:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalReqLNG.g:310:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalReqLNG.g:311:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalReqLNG.g:317:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:323:2: ( (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ ) )
            // InternalReqLNG.g:324:2: (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ )
            {
            // InternalReqLNG.g:324:2: (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ )
            // InternalReqLNG.g:325:3: otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:333:3: ( (lv_text_2_0= ruleSentenceWithReferences ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA3_2 = input.LA(2);

                    if ( ((LA3_2>=RULE_WORD && LA3_2<=RULE_STRING)||(LA3_2>=16 && LA3_2<=24)) ) {
                        alt3=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3==RULE_STRING) ) {
                        int LA3_5 = input.LA(3);

                        if ( ((LA3_5>=RULE_WORD && LA3_5<=RULE_STRING)||(LA3_5>=16 && LA3_5<=24)) ) {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_3>=RULE_WORD && LA3_3<=RULE_ANY_OTHER)||(LA3_3>=16 && LA3_3<=24)) ) {
                        alt3=1;
                    }


                    }
                    break;
                case RULE_WORD:
                case RULE_ANY_OTHER:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalReqLNG.g:334:4: (lv_text_2_0= ruleSentenceWithReferences )
            	    {
            	    // InternalReqLNG.g:334:4: (lv_text_2_0= ruleSentenceWithReferences )
            	    // InternalReqLNG.g:335:5: lv_text_2_0= ruleSentenceWithReferences
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionAccess().getTextSentenceWithReferencesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_text_2_0=ruleSentenceWithReferences();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"text",
            	    						lv_text_2_0,
            	    						"de.schneidertim.requirements.nlp.ReqLNG.SentenceWithReferences");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleText"
    // InternalReqLNG.g:356:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalReqLNG.g:356:44: (iv_ruleText= ruleText EOF )
            // InternalReqLNG.g:357:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
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
    // InternalReqLNG.g:363:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WORD_6=null;
        Token this_ANY_OTHER_7=null;


        	enterRule();

        try {
            // InternalReqLNG.g:369:2: ( (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+ )
            // InternalReqLNG.g:370:2: (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+
            {
            // InternalReqLNG.g:370:2: (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+
            int cnt4=0;
            loop4:
            do {
                int alt4=9;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case 17:
                    {
                    alt4=2;
                    }
                    break;
                case 18:
                    {
                    alt4=3;
                    }
                    break;
                case 19:
                    {
                    alt4=4;
                    }
                    break;
                case 20:
                    {
                    alt4=5;
                    }
                    break;
                case 21:
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

                }

                switch (alt4) {
            	case 1 :
            	    // InternalReqLNG.g:371:3: kw= 'To'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getToKeyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalReqLNG.g:377:3: kw= 'to'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getToKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalReqLNG.g:383:3: kw= 'A'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getAKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalReqLNG.g:389:3: kw= 'a'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getAKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalReqLNG.g:395:3: kw= 'the'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getTheKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalReqLNG.g:401:3: kw= 'The'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getTheKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalReqLNG.g:407:3: this_WORD_6= RULE_WORD
            	    {
            	    this_WORD_6=(Token)match(input,RULE_WORD,FOLLOW_9); 

            	    			current.merge(this_WORD_6);
            	    		

            	    			newLeafNode(this_WORD_6, grammarAccess.getTextAccess().getWORDTerminalRuleCall_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalReqLNG.g:415:3: this_ANY_OTHER_7= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_7=(Token)match(input,RULE_ANY_OTHER,FOLLOW_9); 

            	    			current.merge(this_ANY_OTHER_7);
            	    		

            	    			newLeafNode(this_ANY_OTHER_7, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_7());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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


    // $ANTLR start "entryRuleSentenceWithReferences"
    // InternalReqLNG.g:426:1: entryRuleSentenceWithReferences returns [EObject current=null] : iv_ruleSentenceWithReferences= ruleSentenceWithReferences EOF ;
    public final EObject entryRuleSentenceWithReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceWithReferences = null;


        try {
            // InternalReqLNG.g:426:63: (iv_ruleSentenceWithReferences= ruleSentenceWithReferences EOF )
            // InternalReqLNG.g:427:2: iv_ruleSentenceWithReferences= ruleSentenceWithReferences EOF
            {
             newCompositeNode(grammarAccess.getSentenceWithReferencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenceWithReferences=ruleSentenceWithReferences();

            state._fsp--;

             current =iv_ruleSentenceWithReferences; 
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
    // $ANTLR end "entryRuleSentenceWithReferences"


    // $ANTLR start "ruleSentenceWithReferences"
    // InternalReqLNG.g:433:1: ruleSentenceWithReferences returns [EObject current=null] : ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) ) ;
    public final EObject ruleSentenceWithReferences() throws RecognitionException {
        EObject current = null;

        Token lv_punctuation_1_1=null;
        Token lv_punctuation_1_2=null;
        Token lv_punctuation_1_3=null;
        EObject lv_textWithReferences_0_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:439:2: ( ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) ) )
            // InternalReqLNG.g:440:2: ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) )
            {
            // InternalReqLNG.g:440:2: ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) )
            // InternalReqLNG.g:441:3: ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) )
            {
            // InternalReqLNG.g:441:3: ( (lv_textWithReferences_0_0= ruleTextWithReferences ) )
            // InternalReqLNG.g:442:4: (lv_textWithReferences_0_0= ruleTextWithReferences )
            {
            // InternalReqLNG.g:442:4: (lv_textWithReferences_0_0= ruleTextWithReferences )
            // InternalReqLNG.g:443:5: lv_textWithReferences_0_0= ruleTextWithReferences
            {

            					newCompositeNode(grammarAccess.getSentenceWithReferencesAccess().getTextWithReferencesTextWithReferencesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_textWithReferences_0_0=ruleTextWithReferences();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSentenceWithReferencesRule());
            					}
            					set(
            						current,
            						"textWithReferences",
            						lv_textWithReferences_0_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.TextWithReferences");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:460:3: ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) )
            // InternalReqLNG.g:461:4: ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) )
            {
            // InternalReqLNG.g:461:4: ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) )
            // InternalReqLNG.g:462:5: (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' )
            {
            // InternalReqLNG.g:462:5: (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
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
                    // InternalReqLNG.g:463:6: lv_punctuation_1_1= '.'
                    {
                    lv_punctuation_1_1=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_punctuation_1_1, grammarAccess.getSentenceWithReferencesAccess().getPunctuationFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSentenceWithReferencesRule());
                    						}
                    						setWithLastConsumed(current, "punctuation", lv_punctuation_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:474:6: lv_punctuation_1_2= '!'
                    {
                    lv_punctuation_1_2=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_punctuation_1_2, grammarAccess.getSentenceWithReferencesAccess().getPunctuationExclamationMarkKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSentenceWithReferencesRule());
                    						}
                    						setWithLastConsumed(current, "punctuation", lv_punctuation_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:485:6: lv_punctuation_1_3= '?'
                    {
                    lv_punctuation_1_3=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_punctuation_1_3, grammarAccess.getSentenceWithReferencesAccess().getPunctuationQuestionMarkKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSentenceWithReferencesRule());
                    						}
                    						setWithLastConsumed(current, "punctuation", lv_punctuation_1_3, null);
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleSentenceWithReferences"


    // $ANTLR start "entryRuleTextWithReferences"
    // InternalReqLNG.g:502:1: entryRuleTextWithReferences returns [EObject current=null] : iv_ruleTextWithReferences= ruleTextWithReferences EOF ;
    public final EObject entryRuleTextWithReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextWithReferences = null;


        try {
            // InternalReqLNG.g:502:59: (iv_ruleTextWithReferences= ruleTextWithReferences EOF )
            // InternalReqLNG.g:503:2: iv_ruleTextWithReferences= ruleTextWithReferences EOF
            {
             newCompositeNode(grammarAccess.getTextWithReferencesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextWithReferences=ruleTextWithReferences();

            state._fsp--;

             current =iv_ruleTextWithReferences; 
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
    // $ANTLR end "entryRuleTextWithReferences"


    // $ANTLR start "ruleTextWithReferences"
    // InternalReqLNG.g:509:1: ruleTextWithReferences returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) ;
    public final EObject ruleTextWithReferences() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_after_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:515:2: ( ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) )
            // InternalReqLNG.g:516:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            {
            // InternalReqLNG.g:516:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalReqLNG.g:517:3: ( (otherlv_0= RULE_STRING ) )+
                    {
                    // InternalReqLNG.g:517:3: ( (otherlv_0= RULE_STRING ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==EOF||LA6_2==RULE_STRING||(LA6_2>=22 && LA6_2<=24)) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalReqLNG.g:518:4: (otherlv_0= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:518:4: (otherlv_0= RULE_STRING )
                    	    // InternalReqLNG.g:519:5: otherlv_0= RULE_STRING
                    	    {

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTextWithReferencesRule());
                    	    					}
                    	    				
                    	    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    					newLeafNode(otherlv_0, grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntityCrossReference_0_0());
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:531:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    {
                    // InternalReqLNG.g:531:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    // InternalReqLNG.g:532:4: ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )*
                    {
                    // InternalReqLNG.g:532:4: ( (otherlv_1= RULE_STRING ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalReqLNG.g:533:5: (otherlv_1= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:533:5: (otherlv_1= RULE_STRING )
                    	    // InternalReqLNG.g:534:6: otherlv_1= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTextWithReferencesRule());
                    	    						}
                    	    					
                    	    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    	    						newLeafNode(otherlv_1, grammarAccess.getTextWithReferencesAccess().getRefBeforeEntityCrossReference_1_0_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // InternalReqLNG.g:545:4: ( (lv_text_2_0= ruleText ) )
                    // InternalReqLNG.g:546:5: (lv_text_2_0= ruleText )
                    {
                    // InternalReqLNG.g:546:5: (lv_text_2_0= ruleText )
                    // InternalReqLNG.g:547:6: lv_text_2_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getTextWithReferencesAccess().getTextTextParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_text_2_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextWithReferencesRule());
                    						}
                    						add(
                    							current,
                    							"text",
                    							lv_text_2_0,
                    							"de.schneidertim.requirements.nlp.ReqLNG.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLNG.g:564:4: ( (lv_after_3_0= ruleReferenceCombination ) )*
                    loop8:
                    do {
                        int alt8=2;
                        alt8 = dfa8.predict(input);
                        switch (alt8) {
                    	case 1 :
                    	    // InternalReqLNG.g:565:5: (lv_after_3_0= ruleReferenceCombination )
                    	    {
                    	    // InternalReqLNG.g:565:5: (lv_after_3_0= ruleReferenceCombination )
                    	    // InternalReqLNG.g:566:6: lv_after_3_0= ruleReferenceCombination
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextWithReferencesAccess().getAfterReferenceCombinationParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_after_3_0=ruleReferenceCombination();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextWithReferencesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"after",
                    	    							lv_after_3_0,
                    	    							"de.schneidertim.requirements.nlp.ReqLNG.ReferenceCombination");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // InternalReqLNG.g:583:4: ( (otherlv_4= RULE_STRING ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_STRING) ) {
                            int LA9_2 = input.LA(2);

                            if ( (LA9_2==EOF||LA9_2==RULE_STRING||(LA9_2>=22 && LA9_2<=24)) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalReqLNG.g:584:5: (otherlv_4= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:584:5: (otherlv_4= RULE_STRING )
                    	    // InternalReqLNG.g:585:6: otherlv_4= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTextWithReferencesRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getTextWithReferencesAccess().getFinalRefEntityCrossReference_1_3_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTextWithReferences"


    // $ANTLR start "entryRuleReferenceCombination"
    // InternalReqLNG.g:601:1: entryRuleReferenceCombination returns [EObject current=null] : iv_ruleReferenceCombination= ruleReferenceCombination EOF ;
    public final EObject entryRuleReferenceCombination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCombination = null;


        try {
            // InternalReqLNG.g:601:61: (iv_ruleReferenceCombination= ruleReferenceCombination EOF )
            // InternalReqLNG.g:602:2: iv_ruleReferenceCombination= ruleReferenceCombination EOF
            {
             newCompositeNode(grammarAccess.getReferenceCombinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceCombination=ruleReferenceCombination();

            state._fsp--;

             current =iv_ruleReferenceCombination; 
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
    // $ANTLR end "entryRuleReferenceCombination"


    // $ANTLR start "ruleReferenceCombination"
    // InternalReqLNG.g:608:1: ruleReferenceCombination returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleReferenceCombination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:614:2: ( ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) )
            // InternalReqLNG.g:615:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            {
            // InternalReqLNG.g:615:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            // InternalReqLNG.g:616:3: ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) )
            {
            // InternalReqLNG.g:616:3: ( (otherlv_0= RULE_STRING ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalReqLNG.g:617:4: (otherlv_0= RULE_STRING )
            	    {
            	    // InternalReqLNG.g:617:4: (otherlv_0= RULE_STRING )
            	    // InternalReqLNG.g:618:5: otherlv_0= RULE_STRING
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getReferenceCombinationRule());
            	    					}
            	    				
            	    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    					newLeafNode(otherlv_0, grammarAccess.getReferenceCombinationAccess().getRefsEntityCrossReference_0_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // InternalReqLNG.g:629:3: ( (lv_text_1_0= ruleText ) )
            // InternalReqLNG.g:630:4: (lv_text_1_0= ruleText )
            {
            // InternalReqLNG.g:630:4: (lv_text_1_0= ruleText )
            // InternalReqLNG.g:631:5: lv_text_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getReferenceCombinationAccess().getTextTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceCombinationRule());
            					}
            					add(
            						current,
            						"text",
            						lv_text_1_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Text");
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
    // $ANTLR end "ruleReferenceCombination"


    // $ANTLR start "entryRuleRequirement"
    // InternalReqLNG.g:652:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalReqLNG.g:652:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalReqLNG.g:653:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalReqLNG.g:659:1: ruleRequirement returns [EObject current=null] : (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalRequirement_0 = null;

        EObject this_UnconditionalRequirement_1 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:665:2: ( (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement ) )
            // InternalReqLNG.g:666:2: (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement )
            {
            // InternalReqLNG.g:666:2: (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING||LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqLNG.g:667:3: this_ConditionalRequirement_0= ruleConditionalRequirement
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getConditionalRequirementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalRequirement_0=ruleConditionalRequirement();

                    state._fsp--;


                    			current = this_ConditionalRequirement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:676:3: this_UnconditionalRequirement_1= ruleUnconditionalRequirement
                    {

                    			newCompositeNode(grammarAccess.getRequirementAccess().getUnconditionalRequirementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnconditionalRequirement_1=ruleUnconditionalRequirement();

                    state._fsp--;


                    			current = this_UnconditionalRequirement_1;
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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleConditionalRequirement"
    // InternalReqLNG.g:688:1: entryRuleConditionalRequirement returns [EObject current=null] : iv_ruleConditionalRequirement= ruleConditionalRequirement EOF ;
    public final EObject entryRuleConditionalRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRequirement = null;


        try {
            // InternalReqLNG.g:688:63: (iv_ruleConditionalRequirement= ruleConditionalRequirement EOF )
            // InternalReqLNG.g:689:2: iv_ruleConditionalRequirement= ruleConditionalRequirement EOF
            {
             newCompositeNode(grammarAccess.getConditionalRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalRequirement=ruleConditionalRequirement();

            state._fsp--;

             current =iv_ruleConditionalRequirement; 
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
    // $ANTLR end "entryRuleConditionalRequirement"


    // $ANTLR start "ruleConditionalRequirement"
    // InternalReqLNG.g:695:1: ruleConditionalRequirement returns [EObject current=null] : ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) ;
    public final EObject ruleConditionalRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        Enumerator lv_liability_2_0 = null;

        EObject lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:701:2: ( ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) )
            // InternalReqLNG.g:702:2: ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            {
            // InternalReqLNG.g:702:2: ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            // InternalReqLNG.g:703:3: ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) )
            {
            // InternalReqLNG.g:703:3: ( (lv_condition_0_0= rulePrecondition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReqLNG.g:704:4: (lv_condition_0_0= rulePrecondition )
                    {
                    // InternalReqLNG.g:704:4: (lv_condition_0_0= rulePrecondition )
                    // InternalReqLNG.g:705:5: lv_condition_0_0= rulePrecondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalRequirementAccess().getConditionPreconditionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_condition_0_0=rulePrecondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalRequirementRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_0_0,
                    						"de.schneidertim.requirements.nlp.ReqLNG.Precondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalReqLNG.g:722:3: ( (otherlv_1= RULE_STRING ) )
            // InternalReqLNG.g:723:4: (otherlv_1= RULE_STRING )
            {
            // InternalReqLNG.g:723:4: (otherlv_1= RULE_STRING )
            // InternalReqLNG.g:724:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRequirementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getConditionalRequirementAccess().getSystemSystemCrossReference_1_0());
            				

            }


            }

            // InternalReqLNG.g:735:3: ( (lv_liability_2_0= ruleLiability ) )
            // InternalReqLNG.g:736:4: (lv_liability_2_0= ruleLiability )
            {
            // InternalReqLNG.g:736:4: (lv_liability_2_0= ruleLiability )
            // InternalReqLNG.g:737:5: lv_liability_2_0= ruleLiability
            {

            					newCompositeNode(grammarAccess.getConditionalRequirementAccess().getLiabilityLiabilityEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_liability_2_0=ruleLiability();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRequirementRule());
            					}
            					set(
            						current,
            						"liability",
            						lv_liability_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Liability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:754:3: ( (lv_end_3_0= ruleRequirementEnd ) )
            // InternalReqLNG.g:755:4: (lv_end_3_0= ruleRequirementEnd )
            {
            // InternalReqLNG.g:755:4: (lv_end_3_0= ruleRequirementEnd )
            // InternalReqLNG.g:756:5: lv_end_3_0= ruleRequirementEnd
            {

            					newCompositeNode(grammarAccess.getConditionalRequirementAccess().getEndRequirementEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_3_0=ruleRequirementEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRequirementRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_3_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.RequirementEnd");
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
    // $ANTLR end "ruleConditionalRequirement"


    // $ANTLR start "entryRuleUnconditionalRequirement"
    // InternalReqLNG.g:777:1: entryRuleUnconditionalRequirement returns [EObject current=null] : iv_ruleUnconditionalRequirement= ruleUnconditionalRequirement EOF ;
    public final EObject entryRuleUnconditionalRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionalRequirement = null;


        try {
            // InternalReqLNG.g:777:65: (iv_ruleUnconditionalRequirement= ruleUnconditionalRequirement EOF )
            // InternalReqLNG.g:778:2: iv_ruleUnconditionalRequirement= ruleUnconditionalRequirement EOF
            {
             newCompositeNode(grammarAccess.getUnconditionalRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnconditionalRequirement=ruleUnconditionalRequirement();

            state._fsp--;

             current =iv_ruleUnconditionalRequirement; 
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
    // $ANTLR end "entryRuleUnconditionalRequirement"


    // $ANTLR start "ruleUnconditionalRequirement"
    // InternalReqLNG.g:784:1: ruleUnconditionalRequirement returns [EObject current=null] : ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) ;
    public final EObject ruleUnconditionalRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_the_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_liability_2_0 = null;

        EObject lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:790:2: ( ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) )
            // InternalReqLNG.g:791:2: ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            {
            // InternalReqLNG.g:791:2: ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            // InternalReqLNG.g:792:3: ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) )
            {
            // InternalReqLNG.g:792:3: ( (lv_the_0_0= 'The' ) )
            // InternalReqLNG.g:793:4: (lv_the_0_0= 'The' )
            {
            // InternalReqLNG.g:793:4: (lv_the_0_0= 'The' )
            // InternalReqLNG.g:794:5: lv_the_0_0= 'The'
            {
            lv_the_0_0=(Token)match(input,21,FOLLOW_12); 

            					newLeafNode(lv_the_0_0, grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnconditionalRequirementRule());
            					}
            					setWithLastConsumed(current, "the", lv_the_0_0, "The");
            				

            }


            }

            // InternalReqLNG.g:806:3: ( (otherlv_1= RULE_STRING ) )
            // InternalReqLNG.g:807:4: (otherlv_1= RULE_STRING )
            {
            // InternalReqLNG.g:807:4: (otherlv_1= RULE_STRING )
            // InternalReqLNG.g:808:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnconditionalRequirementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getUnconditionalRequirementAccess().getSystemSystemCrossReference_1_0());
            				

            }


            }

            // InternalReqLNG.g:819:3: ( (lv_liability_2_0= ruleLiability ) )
            // InternalReqLNG.g:820:4: (lv_liability_2_0= ruleLiability )
            {
            // InternalReqLNG.g:820:4: (lv_liability_2_0= ruleLiability )
            // InternalReqLNG.g:821:5: lv_liability_2_0= ruleLiability
            {

            					newCompositeNode(grammarAccess.getUnconditionalRequirementAccess().getLiabilityLiabilityEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_liability_2_0=ruleLiability();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnconditionalRequirementRule());
            					}
            					set(
            						current,
            						"liability",
            						lv_liability_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Liability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:838:3: ( (lv_end_3_0= ruleRequirementEnd ) )
            // InternalReqLNG.g:839:4: (lv_end_3_0= ruleRequirementEnd )
            {
            // InternalReqLNG.g:839:4: (lv_end_3_0= ruleRequirementEnd )
            // InternalReqLNG.g:840:5: lv_end_3_0= ruleRequirementEnd
            {

            					newCompositeNode(grammarAccess.getUnconditionalRequirementAccess().getEndRequirementEndParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_3_0=ruleRequirementEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnconditionalRequirementRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_3_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.RequirementEnd");
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
    // $ANTLR end "ruleUnconditionalRequirement"


    // $ANTLR start "entryRulePrecondition"
    // InternalReqLNG.g:861:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalReqLNG.g:861:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalReqLNG.g:862:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalReqLNG.g:868:1: rulePrecondition returns [EObject current=null] : ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_conditional_0_0 = null;

        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:874:2: ( ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) ) )
            // InternalReqLNG.g:875:2: ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) )
            {
            // InternalReqLNG.g:875:2: ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) )
            // InternalReqLNG.g:876:3: ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) )
            {
            // InternalReqLNG.g:876:3: ( (lv_conditional_0_0= ruleConditional ) )
            // InternalReqLNG.g:877:4: (lv_conditional_0_0= ruleConditional )
            {
            // InternalReqLNG.g:877:4: (lv_conditional_0_0= ruleConditional )
            // InternalReqLNG.g:878:5: lv_conditional_0_0= ruleConditional
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getConditionalConditionalParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_conditional_0_0=ruleConditional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"conditional",
            						lv_conditional_0_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Conditional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:895:3: ( (lv_condition_1_0= ruleTextWithReferences ) )
            // InternalReqLNG.g:896:4: (lv_condition_1_0= ruleTextWithReferences )
            {
            // InternalReqLNG.g:896:4: (lv_condition_1_0= ruleTextWithReferences )
            // InternalReqLNG.g:897:5: lv_condition_1_0= ruleTextWithReferences
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getConditionTextWithReferencesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_1_0=ruleTextWithReferences();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.TextWithReferences");
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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRuleConditional"
    // InternalReqLNG.g:918:1: entryRuleConditional returns [String current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final String entryRuleConditional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditional = null;


        try {
            // InternalReqLNG.g:918:51: (iv_ruleConditional= ruleConditional EOF )
            // InternalReqLNG.g:919:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional.getText(); 
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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalReqLNG.g:925:1: ruleConditional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'If' ;
    public final AntlrDatatypeRuleToken ruleConditional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReqLNG.g:931:2: (kw= 'If' )
            // InternalReqLNG.g:932:2: kw= 'If'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getConditionalAccess().getIfKeyword());
            	

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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleActorInteraction"
    // InternalReqLNG.g:940:1: entryRuleActorInteraction returns [EObject current=null] : iv_ruleActorInteraction= ruleActorInteraction EOF ;
    public final EObject entryRuleActorInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorInteraction = null;


        try {
            // InternalReqLNG.g:940:57: (iv_ruleActorInteraction= ruleActorInteraction EOF )
            // InternalReqLNG.g:941:2: iv_ruleActorInteraction= ruleActorInteraction EOF
            {
             newCompositeNode(grammarAccess.getActorInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActorInteraction=ruleActorInteraction();

            state._fsp--;

             current =iv_ruleActorInteraction; 
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
    // $ANTLR end "entryRuleActorInteraction"


    // $ANTLR start "ruleActorInteraction"
    // InternalReqLNG.g:947:1: ruleActorInteraction returns [EObject current=null] : ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) ) ;
    public final EObject ruleActorInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_provide_0_0=null;
        Token lv_the1_1_0=null;
        Token otherlv_2=null;
        Token lv_with_3_0=null;
        Token lv_the2_4_0=null;
        Token lv_ability_5_0=null;
        Token lv_to_6_0=null;


        	enterRule();

        try {
            // InternalReqLNG.g:953:2: ( ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) ) )
            // InternalReqLNG.g:954:2: ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) )
            {
            // InternalReqLNG.g:954:2: ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) )
            // InternalReqLNG.g:955:3: ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) )
            {
            // InternalReqLNG.g:955:3: ( (lv_provide_0_0= 'provide' ) )
            // InternalReqLNG.g:956:4: (lv_provide_0_0= 'provide' )
            {
            // InternalReqLNG.g:956:4: (lv_provide_0_0= 'provide' )
            // InternalReqLNG.g:957:5: lv_provide_0_0= 'provide'
            {
            lv_provide_0_0=(Token)match(input,26,FOLLOW_15); 

            					newLeafNode(lv_provide_0_0, grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "provide", lv_provide_0_0, "provide");
            				

            }


            }

            // InternalReqLNG.g:969:3: ( (lv_the1_1_0= 'the' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqLNG.g:970:4: (lv_the1_1_0= 'the' )
                    {
                    // InternalReqLNG.g:970:4: (lv_the1_1_0= 'the' )
                    // InternalReqLNG.g:971:5: lv_the1_1_0= 'the'
                    {
                    lv_the1_1_0=(Token)match(input,20,FOLLOW_12); 

                    					newLeafNode(lv_the1_1_0, grammarAccess.getActorInteractionAccess().getThe1TheKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorInteractionRule());
                    					}
                    					setWithLastConsumed(current, "the1", lv_the1_1_0, "the");
                    				

                    }


                    }
                    break;

            }

            // InternalReqLNG.g:983:3: ( (otherlv_2= RULE_STRING ) )
            // InternalReqLNG.g:984:4: (otherlv_2= RULE_STRING )
            {
            // InternalReqLNG.g:984:4: (otherlv_2= RULE_STRING )
            // InternalReqLNG.g:985:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getActorInteractionAccess().getActorActorCrossReference_2_0());
            				

            }


            }

            // InternalReqLNG.g:996:3: ( (lv_with_3_0= 'with' ) )
            // InternalReqLNG.g:997:4: (lv_with_3_0= 'with' )
            {
            // InternalReqLNG.g:997:4: (lv_with_3_0= 'with' )
            // InternalReqLNG.g:998:5: lv_with_3_0= 'with'
            {
            lv_with_3_0=(Token)match(input,27,FOLLOW_17); 

            					newLeafNode(lv_with_3_0, grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "with", lv_with_3_0, "with");
            				

            }


            }

            // InternalReqLNG.g:1010:3: ( (lv_the2_4_0= 'the' ) )
            // InternalReqLNG.g:1011:4: (lv_the2_4_0= 'the' )
            {
            // InternalReqLNG.g:1011:4: (lv_the2_4_0= 'the' )
            // InternalReqLNG.g:1012:5: lv_the2_4_0= 'the'
            {
            lv_the2_4_0=(Token)match(input,20,FOLLOW_18); 

            					newLeafNode(lv_the2_4_0, grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "the2", lv_the2_4_0, "the");
            				

            }


            }

            // InternalReqLNG.g:1024:3: ( (lv_ability_5_0= 'ability' ) )
            // InternalReqLNG.g:1025:4: (lv_ability_5_0= 'ability' )
            {
            // InternalReqLNG.g:1025:4: (lv_ability_5_0= 'ability' )
            // InternalReqLNG.g:1026:5: lv_ability_5_0= 'ability'
            {
            lv_ability_5_0=(Token)match(input,28,FOLLOW_19); 

            					newLeafNode(lv_ability_5_0, grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "ability", lv_ability_5_0, "ability");
            				

            }


            }

            // InternalReqLNG.g:1038:3: ( (lv_to_6_0= 'to' ) )
            // InternalReqLNG.g:1039:4: (lv_to_6_0= 'to' )
            {
            // InternalReqLNG.g:1039:4: (lv_to_6_0= 'to' )
            // InternalReqLNG.g:1040:5: lv_to_6_0= 'to'
            {
            lv_to_6_0=(Token)match(input,17,FOLLOW_2); 

            					newLeafNode(lv_to_6_0, grammarAccess.getActorInteractionAccess().getToToKeyword_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "to", lv_to_6_0, "to");
            				

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
    // $ANTLR end "ruleActorInteraction"


    // $ANTLR start "entryRuleRequirementEnd"
    // InternalReqLNG.g:1056:1: entryRuleRequirementEnd returns [EObject current=null] : iv_ruleRequirementEnd= ruleRequirementEnd EOF ;
    public final EObject entryRuleRequirementEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementEnd = null;


        try {
            // InternalReqLNG.g:1056:55: (iv_ruleRequirementEnd= ruleRequirementEnd EOF )
            // InternalReqLNG.g:1057:2: iv_ruleRequirementEnd= ruleRequirementEnd EOF
            {
             newCompositeNode(grammarAccess.getRequirementEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementEnd=ruleRequirementEnd();

            state._fsp--;

             current =iv_ruleRequirementEnd; 
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
    // $ANTLR end "entryRuleRequirementEnd"


    // $ANTLR start "ruleRequirementEnd"
    // InternalReqLNG.g:1063:1: ruleRequirementEnd returns [EObject current=null] : ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' ) ;
    public final EObject ruleRequirementEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_ai_0_0 = null;

        EObject lv_objectWithDetails_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1069:2: ( ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' ) )
            // InternalReqLNG.g:1070:2: ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' )
            {
            // InternalReqLNG.g:1070:2: ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' )
            // InternalReqLNG.g:1071:3: ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.'
            {
            // InternalReqLNG.g:1071:3: ( (lv_ai_0_0= ruleActorInteraction ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalReqLNG.g:1072:4: (lv_ai_0_0= ruleActorInteraction )
                    {
                    // InternalReqLNG.g:1072:4: (lv_ai_0_0= ruleActorInteraction )
                    // InternalReqLNG.g:1073:5: lv_ai_0_0= ruleActorInteraction
                    {

                    					newCompositeNode(grammarAccess.getRequirementEndAccess().getAiActorInteractionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_ai_0_0=ruleActorInteraction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequirementEndRule());
                    					}
                    					set(
                    						current,
                    						"ai",
                    						lv_ai_0_0,
                    						"de.schneidertim.requirements.nlp.ReqLNG.ActorInteraction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalReqLNG.g:1090:3: ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) )
            // InternalReqLNG.g:1091:4: (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms )
            {
            // InternalReqLNG.g:1091:4: (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms )
            // InternalReqLNG.g:1092:5: lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms
            {

            					newCompositeNode(grammarAccess.getRequirementEndAccess().getObjectWithDetailsTextWithConceptsOrSynonymsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_objectWithDetails_1_0=ruleTextWithConceptsOrSynonyms();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementEndRule());
            					}
            					set(
            						current,
            						"objectWithDetails",
            						lv_objectWithDetails_1_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.TextWithConceptsOrSynonyms");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRequirementEndAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleRequirementEnd"


    // $ANTLR start "entryRuleTextWithConceptsOrSynonyms"
    // InternalReqLNG.g:1117:1: entryRuleTextWithConceptsOrSynonyms returns [EObject current=null] : iv_ruleTextWithConceptsOrSynonyms= ruleTextWithConceptsOrSynonyms EOF ;
    public final EObject entryRuleTextWithConceptsOrSynonyms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextWithConceptsOrSynonyms = null;


        try {
            // InternalReqLNG.g:1117:67: (iv_ruleTextWithConceptsOrSynonyms= ruleTextWithConceptsOrSynonyms EOF )
            // InternalReqLNG.g:1118:2: iv_ruleTextWithConceptsOrSynonyms= ruleTextWithConceptsOrSynonyms EOF
            {
             newCompositeNode(grammarAccess.getTextWithConceptsOrSynonymsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextWithConceptsOrSynonyms=ruleTextWithConceptsOrSynonyms();

            state._fsp--;

             current =iv_ruleTextWithConceptsOrSynonyms; 
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
    // $ANTLR end "entryRuleTextWithConceptsOrSynonyms"


    // $ANTLR start "ruleTextWithConceptsOrSynonyms"
    // InternalReqLNG.g:1124:1: ruleTextWithConceptsOrSynonyms returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) ;
    public final EObject ruleTextWithConceptsOrSynonyms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_after_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1130:2: ( ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) )
            // InternalReqLNG.g:1131:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            {
            // InternalReqLNG.g:1131:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalReqLNG.g:1132:3: ( (otherlv_0= RULE_STRING ) )+
                    {
                    // InternalReqLNG.g:1132:3: ( (otherlv_0= RULE_STRING ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalReqLNG.g:1133:4: (otherlv_0= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:1133:4: (otherlv_0= RULE_STRING )
                    	    // InternalReqLNG.g:1134:5: otherlv_0= RULE_STRING
                    	    {

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTextWithConceptsOrSynonymsRule());
                    	    					}
                    	    				
                    	    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    					newLeafNode(otherlv_0, grammarAccess.getTextWithConceptsOrSynonymsAccess().getOnlyRefsConceptOrSynonymCrossReference_0_0());
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:1146:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    {
                    // InternalReqLNG.g:1146:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    // InternalReqLNG.g:1147:4: ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )*
                    {
                    // InternalReqLNG.g:1147:4: ( (otherlv_1= RULE_STRING ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_STRING) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalReqLNG.g:1148:5: (otherlv_1= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:1148:5: (otherlv_1= RULE_STRING )
                    	    // InternalReqLNG.g:1149:6: otherlv_1= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTextWithConceptsOrSynonymsRule());
                    	    						}
                    	    					
                    	    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    	    						newLeafNode(otherlv_1, grammarAccess.getTextWithConceptsOrSynonymsAccess().getRefBeforeConceptOrSynonymCrossReference_1_0_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // InternalReqLNG.g:1160:4: ( (lv_text_2_0= ruleText ) )
                    // InternalReqLNG.g:1161:5: (lv_text_2_0= ruleText )
                    {
                    // InternalReqLNG.g:1161:5: (lv_text_2_0= ruleText )
                    // InternalReqLNG.g:1162:6: lv_text_2_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getTextWithConceptsOrSynonymsAccess().getTextTextParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_text_2_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextWithConceptsOrSynonymsRule());
                    						}
                    						add(
                    							current,
                    							"text",
                    							lv_text_2_0,
                    							"de.schneidertim.requirements.nlp.ReqLNG.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLNG.g:1179:4: ( (lv_after_3_0= ruleConceptCombination ) )*
                    loop18:
                    do {
                        int alt18=2;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // InternalReqLNG.g:1180:5: (lv_after_3_0= ruleConceptCombination )
                    	    {
                    	    // InternalReqLNG.g:1180:5: (lv_after_3_0= ruleConceptCombination )
                    	    // InternalReqLNG.g:1181:6: lv_after_3_0= ruleConceptCombination
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextWithConceptsOrSynonymsAccess().getAfterConceptCombinationParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_after_3_0=ruleConceptCombination();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextWithConceptsOrSynonymsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"after",
                    	    							lv_after_3_0,
                    	    							"de.schneidertim.requirements.nlp.ReqLNG.ConceptCombination");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // InternalReqLNG.g:1198:4: ( (otherlv_4= RULE_STRING ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_STRING) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalReqLNG.g:1199:5: (otherlv_4= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:1199:5: (otherlv_4= RULE_STRING )
                    	    // InternalReqLNG.g:1200:6: otherlv_4= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTextWithConceptsOrSynonymsRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getTextWithConceptsOrSynonymsAccess().getFinalRefConceptOrSynonymCrossReference_1_3_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTextWithConceptsOrSynonyms"


    // $ANTLR start "entryRuleConceptCombination"
    // InternalReqLNG.g:1216:1: entryRuleConceptCombination returns [EObject current=null] : iv_ruleConceptCombination= ruleConceptCombination EOF ;
    public final EObject entryRuleConceptCombination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptCombination = null;


        try {
            // InternalReqLNG.g:1216:59: (iv_ruleConceptCombination= ruleConceptCombination EOF )
            // InternalReqLNG.g:1217:2: iv_ruleConceptCombination= ruleConceptCombination EOF
            {
             newCompositeNode(grammarAccess.getConceptCombinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptCombination=ruleConceptCombination();

            state._fsp--;

             current =iv_ruleConceptCombination; 
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
    // $ANTLR end "entryRuleConceptCombination"


    // $ANTLR start "ruleConceptCombination"
    // InternalReqLNG.g:1223:1: ruleConceptCombination returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleConceptCombination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1229:2: ( ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) )
            // InternalReqLNG.g:1230:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            {
            // InternalReqLNG.g:1230:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            // InternalReqLNG.g:1231:3: ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) )
            {
            // InternalReqLNG.g:1231:3: ( (otherlv_0= RULE_STRING ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalReqLNG.g:1232:4: (otherlv_0= RULE_STRING )
            	    {
            	    // InternalReqLNG.g:1232:4: (otherlv_0= RULE_STRING )
            	    // InternalReqLNG.g:1233:5: otherlv_0= RULE_STRING
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getConceptCombinationRule());
            	    					}
            	    				
            	    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    					newLeafNode(otherlv_0, grammarAccess.getConceptCombinationAccess().getConceptsConceptOrSynonymCrossReference_0_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            // InternalReqLNG.g:1244:3: ( (lv_text_1_0= ruleText ) )
            // InternalReqLNG.g:1245:4: (lv_text_1_0= ruleText )
            {
            // InternalReqLNG.g:1245:4: (lv_text_1_0= ruleText )
            // InternalReqLNG.g:1246:5: lv_text_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getConceptCombinationAccess().getTextTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConceptCombinationRule());
            					}
            					add(
            						current,
            						"text",
            						lv_text_1_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Text");
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
    // $ANTLR end "ruleConceptCombination"


    // $ANTLR start "entryRuleGlossary"
    // InternalReqLNG.g:1267:1: entryRuleGlossary returns [EObject current=null] : iv_ruleGlossary= ruleGlossary EOF ;
    public final EObject entryRuleGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossary = null;


        try {
            // InternalReqLNG.g:1267:49: (iv_ruleGlossary= ruleGlossary EOF )
            // InternalReqLNG.g:1268:2: iv_ruleGlossary= ruleGlossary EOF
            {
             newCompositeNode(grammarAccess.getGlossaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlossary=ruleGlossary();

            state._fsp--;

             current =iv_ruleGlossary; 
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
    // $ANTLR end "entryRuleGlossary"


    // $ANTLR start "ruleGlossary"
    // InternalReqLNG.g:1274:1: ruleGlossary returns [EObject current=null] : ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* ) ;
    public final EObject ruleGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concepts_2_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1280:2: ( ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* ) )
            // InternalReqLNG.g:1281:2: ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* )
            {
            // InternalReqLNG.g:1281:2: ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* )
            // InternalReqLNG.g:1282:3: () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )*
            {
            // InternalReqLNG.g:1282:3: ()
            // InternalReqLNG.g:1283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlossaryAccess().getGlossaryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGlossaryAccess().getGlossaryKeyword_1());
            		
            // InternalReqLNG.g:1293:3: ( (lv_concepts_2_0= ruleConcept ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30||LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalReqLNG.g:1294:4: (lv_concepts_2_0= ruleConcept )
            	    {
            	    // InternalReqLNG.g:1294:4: (lv_concepts_2_0= ruleConcept )
            	    // InternalReqLNG.g:1295:5: lv_concepts_2_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getGlossaryAccess().getConceptsConceptParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_concepts_2_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGlossaryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concepts",
            	    						lv_concepts_2_0,
            	    						"de.schneidertim.requirements.nlp.ReqLNG.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleGlossary"


    // $ANTLR start "entryRuleConcept"
    // InternalReqLNG.g:1316:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalReqLNG.g:1316:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalReqLNG.g:1317:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalReqLNG.g:1323:1: ruleConcept returns [EObject current=null] : (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_DomainObject_1 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1329:2: ( (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject ) )
            // InternalReqLNG.g:1330:2: (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject )
            {
            // InternalReqLNG.g:1330:2: (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            else if ( (LA23_0==33) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalReqLNG.g:1331:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:1340:3: this_DomainObject_1= ruleDomainObject
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getDomainObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainObject_1=ruleDomainObject();

                    state._fsp--;


                    			current = this_DomainObject_1;
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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleFunction"
    // InternalReqLNG.g:1352:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalReqLNG.g:1352:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalReqLNG.g:1353:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalReqLNG.g:1359:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_synonyms_5_0 = null;

        EObject lv_synonyms_7_0 = null;

        EObject lv_description_10_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1365:2: ( (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? ) )
            // InternalReqLNG.g:1366:2: (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? )
            {
            // InternalReqLNG.g:1366:2: (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? )
            // InternalReqLNG.g:1367:3: otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:1375:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:1376:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:1376:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:1377:5: lv_name_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:1394:3: (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalReqLNG.g:1395:4: otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )*
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getSynonymsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getColonKeyword_3_1());
                    			
                    // InternalReqLNG.g:1403:4: ( (lv_synonyms_5_0= ruleFunctionSynonym ) )
                    // InternalReqLNG.g:1404:5: (lv_synonyms_5_0= ruleFunctionSynonym )
                    {
                    // InternalReqLNG.g:1404:5: (lv_synonyms_5_0= ruleFunctionSynonym )
                    // InternalReqLNG.g:1405:6: lv_synonyms_5_0= ruleFunctionSynonym
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getSynonymsFunctionSynonymParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synonyms_5_0=ruleFunctionSynonym();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"synonyms",
                    							lv_synonyms_5_0,
                    							"de.schneidertim.requirements.nlp.ReqLNG.FunctionSynonym");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLNG.g:1422:4: (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==32) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalReqLNG.g:1423:5: otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalReqLNG.g:1427:5: ( (lv_synonyms_7_0= ruleFunctionSynonym ) )
                    	    // InternalReqLNG.g:1428:6: (lv_synonyms_7_0= ruleFunctionSynonym )
                    	    {
                    	    // InternalReqLNG.g:1428:6: (lv_synonyms_7_0= ruleFunctionSynonym )
                    	    // InternalReqLNG.g:1429:7: lv_synonyms_7_0= ruleFunctionSynonym
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getSynonymsFunctionSynonymParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_synonyms_7_0=ruleFunctionSynonym();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"synonyms",
                    	    								lv_synonyms_7_0,
                    	    								"de.schneidertim.requirements.nlp.ReqLNG.FunctionSynonym");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalReqLNG.g:1448:3: (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalReqLNG.g:1449:4: otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getColonKeyword_4_1());
                    			
                    // InternalReqLNG.g:1457:4: ( (lv_description_10_0= ruleSentenceWithReferences ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=RULE_WORD && LA26_0<=RULE_STRING)||(LA26_0>=16 && LA26_0<=21)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalReqLNG.g:1458:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    {
                    	    // InternalReqLNG.g:1458:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    // InternalReqLNG.g:1459:6: lv_description_10_0= ruleSentenceWithReferences
                    	    {

                    	    						newCompositeNode(grammarAccess.getFunctionAccess().getDescriptionSentenceWithReferencesParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_description_10_0=ruleSentenceWithReferences();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"description",
                    	    							lv_description_10_0,
                    	    							"de.schneidertim.requirements.nlp.ReqLNG.SentenceWithReferences");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDomainObject"
    // InternalReqLNG.g:1481:1: entryRuleDomainObject returns [EObject current=null] : iv_ruleDomainObject= ruleDomainObject EOF ;
    public final EObject entryRuleDomainObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainObject = null;


        try {
            // InternalReqLNG.g:1481:53: (iv_ruleDomainObject= ruleDomainObject EOF )
            // InternalReqLNG.g:1482:2: iv_ruleDomainObject= ruleDomainObject EOF
            {
             newCompositeNode(grammarAccess.getDomainObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainObject=ruleDomainObject();

            state._fsp--;

             current =iv_ruleDomainObject; 
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
    // $ANTLR end "entryRuleDomainObject"


    // $ANTLR start "ruleDomainObject"
    // InternalReqLNG.g:1488:1: ruleDomainObject returns [EObject current=null] : (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? ) ;
    public final EObject ruleDomainObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_synonyms_5_0 = null;

        EObject lv_synonyms_7_0 = null;

        EObject lv_description_10_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1494:2: ( (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? ) )
            // InternalReqLNG.g:1495:2: (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? )
            {
            // InternalReqLNG.g:1495:2: (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? )
            // InternalReqLNG.g:1496:3: otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainObjectAccess().getObjectKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainObjectAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:1504:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:1505:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:1505:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:1506:5: lv_name_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getDomainObjectAccess().getNameTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainObjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.schneidertim.requirements.nlp.ReqLNG.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalReqLNG.g:1523:3: (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalReqLNG.g:1524:4: otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )*
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainObjectAccess().getSynonymsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDomainObjectAccess().getColonKeyword_3_1());
                    			
                    // InternalReqLNG.g:1532:4: ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) )
                    // InternalReqLNG.g:1533:5: (lv_synonyms_5_0= ruleDomainObjectSynonym )
                    {
                    // InternalReqLNG.g:1533:5: (lv_synonyms_5_0= ruleDomainObjectSynonym )
                    // InternalReqLNG.g:1534:6: lv_synonyms_5_0= ruleDomainObjectSynonym
                    {

                    						newCompositeNode(grammarAccess.getDomainObjectAccess().getSynonymsDomainObjectSynonymParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_synonyms_5_0=ruleDomainObjectSynonym();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainObjectRule());
                    						}
                    						add(
                    							current,
                    							"synonyms",
                    							lv_synonyms_5_0,
                    							"de.schneidertim.requirements.nlp.ReqLNG.DomainObjectSynonym");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalReqLNG.g:1551:4: (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==32) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalReqLNG.g:1552:5: otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDomainObjectAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalReqLNG.g:1556:5: ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) )
                    	    // InternalReqLNG.g:1557:6: (lv_synonyms_7_0= ruleDomainObjectSynonym )
                    	    {
                    	    // InternalReqLNG.g:1557:6: (lv_synonyms_7_0= ruleDomainObjectSynonym )
                    	    // InternalReqLNG.g:1558:7: lv_synonyms_7_0= ruleDomainObjectSynonym
                    	    {

                    	    							newCompositeNode(grammarAccess.getDomainObjectAccess().getSynonymsDomainObjectSynonymParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_synonyms_7_0=ruleDomainObjectSynonym();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDomainObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"synonyms",
                    	    								lv_synonyms_7_0,
                    	    								"de.schneidertim.requirements.nlp.ReqLNG.DomainObjectSynonym");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalReqLNG.g:1577:3: (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalReqLNG.g:1578:4: otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDomainObjectAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getDomainObjectAccess().getColonKeyword_4_1());
                    			
                    // InternalReqLNG.g:1586:4: ( (lv_description_10_0= ruleSentenceWithReferences ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_WORD && LA30_0<=RULE_STRING)||(LA30_0>=16 && LA30_0<=21)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalReqLNG.g:1587:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    {
                    	    // InternalReqLNG.g:1587:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    // InternalReqLNG.g:1588:6: lv_description_10_0= ruleSentenceWithReferences
                    	    {

                    	    						newCompositeNode(grammarAccess.getDomainObjectAccess().getDescriptionSentenceWithReferencesParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_description_10_0=ruleSentenceWithReferences();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDomainObjectRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"description",
                    	    							lv_description_10_0,
                    	    							"de.schneidertim.requirements.nlp.ReqLNG.SentenceWithReferences");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


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
    // $ANTLR end "ruleDomainObject"


    // $ANTLR start "entryRuleFunctionSynonym"
    // InternalReqLNG.g:1610:1: entryRuleFunctionSynonym returns [EObject current=null] : iv_ruleFunctionSynonym= ruleFunctionSynonym EOF ;
    public final EObject entryRuleFunctionSynonym() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionSynonym = null;


        try {
            // InternalReqLNG.g:1610:56: (iv_ruleFunctionSynonym= ruleFunctionSynonym EOF )
            // InternalReqLNG.g:1611:2: iv_ruleFunctionSynonym= ruleFunctionSynonym EOF
            {
             newCompositeNode(grammarAccess.getFunctionSynonymRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionSynonym=ruleFunctionSynonym();

            state._fsp--;

             current =iv_ruleFunctionSynonym; 
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
    // $ANTLR end "entryRuleFunctionSynonym"


    // $ANTLR start "ruleFunctionSynonym"
    // InternalReqLNG.g:1617:1: ruleFunctionSynonym returns [EObject current=null] : ( (lv_name_0_0= ruleText ) ) ;
    public final EObject ruleFunctionSynonym() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1623:2: ( ( (lv_name_0_0= ruleText ) ) )
            // InternalReqLNG.g:1624:2: ( (lv_name_0_0= ruleText ) )
            {
            // InternalReqLNG.g:1624:2: ( (lv_name_0_0= ruleText ) )
            // InternalReqLNG.g:1625:3: (lv_name_0_0= ruleText )
            {
            // InternalReqLNG.g:1625:3: (lv_name_0_0= ruleText )
            // InternalReqLNG.g:1626:4: lv_name_0_0= ruleText
            {

            				newCompositeNode(grammarAccess.getFunctionSynonymAccess().getNameTextParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleText();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctionSynonymRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.schneidertim.requirements.nlp.ReqLNG.Text");
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
    // $ANTLR end "ruleFunctionSynonym"


    // $ANTLR start "entryRuleDomainObjectSynonym"
    // InternalReqLNG.g:1646:1: entryRuleDomainObjectSynonym returns [EObject current=null] : iv_ruleDomainObjectSynonym= ruleDomainObjectSynonym EOF ;
    public final EObject entryRuleDomainObjectSynonym() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainObjectSynonym = null;


        try {
            // InternalReqLNG.g:1646:60: (iv_ruleDomainObjectSynonym= ruleDomainObjectSynonym EOF )
            // InternalReqLNG.g:1647:2: iv_ruleDomainObjectSynonym= ruleDomainObjectSynonym EOF
            {
             newCompositeNode(grammarAccess.getDomainObjectSynonymRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainObjectSynonym=ruleDomainObjectSynonym();

            state._fsp--;

             current =iv_ruleDomainObjectSynonym; 
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
    // $ANTLR end "entryRuleDomainObjectSynonym"


    // $ANTLR start "ruleDomainObjectSynonym"
    // InternalReqLNG.g:1653:1: ruleDomainObjectSynonym returns [EObject current=null] : ( (lv_name_0_0= ruleText ) ) ;
    public final EObject ruleDomainObjectSynonym() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1659:2: ( ( (lv_name_0_0= ruleText ) ) )
            // InternalReqLNG.g:1660:2: ( (lv_name_0_0= ruleText ) )
            {
            // InternalReqLNG.g:1660:2: ( (lv_name_0_0= ruleText ) )
            // InternalReqLNG.g:1661:3: (lv_name_0_0= ruleText )
            {
            // InternalReqLNG.g:1661:3: (lv_name_0_0= ruleText )
            // InternalReqLNG.g:1662:4: lv_name_0_0= ruleText
            {

            				newCompositeNode(grammarAccess.getDomainObjectSynonymAccess().getNameTextParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleText();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDomainObjectSynonymRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.schneidertim.requirements.nlp.ReqLNG.Text");
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
    // $ANTLR end "ruleDomainObjectSynonym"


    // $ANTLR start "ruleLiability"
    // InternalReqLNG.g:1682:1: ruleLiability returns [Enumerator current=null] : ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) ) ;
    public final Enumerator ruleLiability() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReqLNG.g:1688:2: ( ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) ) )
            // InternalReqLNG.g:1689:2: ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) )
            {
            // InternalReqLNG.g:1689:2: ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt32=1;
                }
                break;
            case 35:
                {
                alt32=2;
                }
                break;
            case 36:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalReqLNG.g:1690:3: (enumLiteral_0= 'shall' )
                    {
                    // InternalReqLNG.g:1690:3: (enumLiteral_0= 'shall' )
                    // InternalReqLNG.g:1691:4: enumLiteral_0= 'shall'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:1698:3: (enumLiteral_1= 'should' )
                    {
                    // InternalReqLNG.g:1698:3: (enumLiteral_1= 'should' )
                    // InternalReqLNG.g:1699:4: enumLiteral_1= 'should'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:1706:3: (enumLiteral_2= 'will' )
                    {
                    // InternalReqLNG.g:1706:3: (enumLiteral_2= 'will' )
                    // InternalReqLNG.g:1707:4: enumLiteral_2= 'will'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLiabilityAccess().getWillEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLiabilityAccess().getWillEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleLiability"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff\1\3";
    static final String dfa_3s = "\2\4\2\uffff\1\4";
    static final String dfa_4s = "\1\25\1\30\2\uffff\1\44";
    static final String dfa_5s = "\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\1\11\uffff\6\2",
            "\2\2\1\4\11\uffff\6\2\3\3",
            "",
            "",
            "\2\2\1\4\11\uffff\6\2\3\3\11\uffff\3\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "516:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )";
        }
    }
    static final String dfa_8s = "\4\uffff";
    static final String dfa_9s = "\2\2\2\uffff";
    static final String dfa_10s = "\1\6\1\4\2\uffff";
    static final String dfa_11s = "\1\30\1\44\2\uffff";
    static final String dfa_12s = "\2\uffff\1\2\1\1";
    static final String dfa_13s = "\4\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\17\uffff\3\2",
            "\2\3\1\1\11\uffff\6\3\3\2\11\uffff\3\2",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 564:4: ( (lv_after_3_0= ruleReferenceCombination ) )*";
        }
    }
    static final String dfa_15s = "\1\uffff\1\3\2\uffff";
    static final String dfa_16s = "\2\4\2\uffff";
    static final String dfa_17s = "\1\25\1\26\2\uffff";
    static final String[] dfa_18s = {
            "\2\2\1\1\11\uffff\6\2",
            "\2\2\1\1\11\uffff\6\2\1\3",
            "",
            ""
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1131:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )";
        }
    }
    static final String dfa_19s = "\2\26\2\uffff";
    static final String[] dfa_20s = {
            "\1\1\17\uffff\1\2",
            "\2\3\1\1\11\uffff\6\3\1\2",
            "",
            ""
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_19;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 1179:4: ( (lv_after_3_0= ruleConceptCombination ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000022205040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003F0030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003F0070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003F0072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003F0032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000043F0070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000240000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100008002L});

}