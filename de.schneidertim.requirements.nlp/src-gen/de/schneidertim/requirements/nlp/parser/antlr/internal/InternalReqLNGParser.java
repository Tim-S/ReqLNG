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
        	return "Entities";
       	}

       	@Override
       	protected ReqLNGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntities"
    // InternalReqLNG.g:65:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalReqLNG.g:65:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalReqLNG.g:66:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalReqLNG.g:72:1: ruleEntities returns [EObject current=null] : ( ( ( (lv_actor_0_0= ruleActor ) ) | ( (lv_system_1_0= ruleSystem ) ) | ( (lv_requirement_2_0= ruleRequirement ) ) )* ( (lv_glossary_3_0= ruleGlossary ) ) ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        EObject lv_actor_0_0 = null;

        EObject lv_system_1_0 = null;

        EObject lv_requirement_2_0 = null;

        EObject lv_glossary_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:78:2: ( ( ( ( (lv_actor_0_0= ruleActor ) ) | ( (lv_system_1_0= ruleSystem ) ) | ( (lv_requirement_2_0= ruleRequirement ) ) )* ( (lv_glossary_3_0= ruleGlossary ) ) ) )
            // InternalReqLNG.g:79:2: ( ( ( (lv_actor_0_0= ruleActor ) ) | ( (lv_system_1_0= ruleSystem ) ) | ( (lv_requirement_2_0= ruleRequirement ) ) )* ( (lv_glossary_3_0= ruleGlossary ) ) )
            {
            // InternalReqLNG.g:79:2: ( ( ( (lv_actor_0_0= ruleActor ) ) | ( (lv_system_1_0= ruleSystem ) ) | ( (lv_requirement_2_0= ruleRequirement ) ) )* ( (lv_glossary_3_0= ruleGlossary ) ) )
            // InternalReqLNG.g:80:3: ( ( (lv_actor_0_0= ruleActor ) ) | ( (lv_system_1_0= ruleSystem ) ) | ( (lv_requirement_2_0= ruleRequirement ) ) )* ( (lv_glossary_3_0= ruleGlossary ) )
            {
            // InternalReqLNG.g:80:3: ( ( (lv_actor_0_0= ruleActor ) ) | ( (lv_system_1_0= ruleSystem ) ) | ( (lv_requirement_2_0= ruleRequirement ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 14:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_STRING:
                case 21:
                case 25:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalReqLNG.g:81:4: ( (lv_actor_0_0= ruleActor ) )
            	    {
            	    // InternalReqLNG.g:81:4: ( (lv_actor_0_0= ruleActor ) )
            	    // InternalReqLNG.g:82:5: (lv_actor_0_0= ruleActor )
            	    {
            	    // InternalReqLNG.g:82:5: (lv_actor_0_0= ruleActor )
            	    // InternalReqLNG.g:83:6: lv_actor_0_0= ruleActor
            	    {

            	    						newCompositeNode(grammarAccess.getEntitiesAccess().getActorActorParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_actor_0_0=ruleActor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actor",
            	    							lv_actor_0_0,
            	    							"de.schneidertim.requirements.nlp.ReqLNG.Actor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalReqLNG.g:101:4: ( (lv_system_1_0= ruleSystem ) )
            	    {
            	    // InternalReqLNG.g:101:4: ( (lv_system_1_0= ruleSystem ) )
            	    // InternalReqLNG.g:102:5: (lv_system_1_0= ruleSystem )
            	    {
            	    // InternalReqLNG.g:102:5: (lv_system_1_0= ruleSystem )
            	    // InternalReqLNG.g:103:6: lv_system_1_0= ruleSystem
            	    {

            	    						newCompositeNode(grammarAccess.getEntitiesAccess().getSystemSystemParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_system_1_0=ruleSystem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"system",
            	    							lv_system_1_0,
            	    							"de.schneidertim.requirements.nlp.ReqLNG.System");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalReqLNG.g:121:4: ( (lv_requirement_2_0= ruleRequirement ) )
            	    {
            	    // InternalReqLNG.g:121:4: ( (lv_requirement_2_0= ruleRequirement ) )
            	    // InternalReqLNG.g:122:5: (lv_requirement_2_0= ruleRequirement )
            	    {
            	    // InternalReqLNG.g:122:5: (lv_requirement_2_0= ruleRequirement )
            	    // InternalReqLNG.g:123:6: lv_requirement_2_0= ruleRequirement
            	    {

            	    						newCompositeNode(grammarAccess.getEntitiesAccess().getRequirementRequirementParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_requirement_2_0=ruleRequirement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"requirement",
            	    							lv_requirement_2_0,
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

            // InternalReqLNG.g:141:3: ( (lv_glossary_3_0= ruleGlossary ) )
            // InternalReqLNG.g:142:4: (lv_glossary_3_0= ruleGlossary )
            {
            // InternalReqLNG.g:142:4: (lv_glossary_3_0= ruleGlossary )
            // InternalReqLNG.g:143:5: lv_glossary_3_0= ruleGlossary
            {

            					newCompositeNode(grammarAccess.getEntitiesAccess().getGlossaryGlossaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_glossary_3_0=ruleGlossary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            					}
            					set(
            						current,
            						"glossary",
            						lv_glossary_3_0,
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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleActor"
    // InternalReqLNG.g:164:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalReqLNG.g:164:46: (iv_ruleActor= ruleActor EOF )
            // InternalReqLNG.g:165:2: iv_ruleActor= ruleActor EOF
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
    // InternalReqLNG.g:171:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:177:2: ( (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalReqLNG.g:178:2: (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalReqLNG.g:178:2: (otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            // InternalReqLNG.g:179:3: otherlv_0= 'Actor' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:187:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:188:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:188:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:189:5: lv_name_2_0= ruleText
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

            // InternalReqLNG.g:206:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalReqLNG.g:207:4: (lv_description_3_0= ruleDescription )
            {
            // InternalReqLNG.g:207:4: (lv_description_3_0= ruleDescription )
            // InternalReqLNG.g:208:5: lv_description_3_0= ruleDescription
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
    // InternalReqLNG.g:229:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalReqLNG.g:229:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalReqLNG.g:230:2: iv_ruleSystem= ruleSystem EOF
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
    // InternalReqLNG.g:236:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:242:2: ( (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalReqLNG.g:243:2: (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalReqLNG.g:243:2: (otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) ) )
            // InternalReqLNG.g:244:3: otherlv_0= 'System' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:252:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:253:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:253:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:254:5: lv_name_2_0= ruleText
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

            // InternalReqLNG.g:271:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalReqLNG.g:272:4: (lv_description_3_0= ruleDescription )
            {
            // InternalReqLNG.g:272:4: (lv_description_3_0= ruleDescription )
            // InternalReqLNG.g:273:5: lv_description_3_0= ruleDescription
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
    // InternalReqLNG.g:294:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalReqLNG.g:294:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalReqLNG.g:295:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalReqLNG.g:301:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:307:2: ( (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ ) )
            // InternalReqLNG.g:308:2: (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ )
            {
            // InternalReqLNG.g:308:2: (otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+ )
            // InternalReqLNG.g:309:3: otherlv_0= 'Description' otherlv_1= ':' ( (lv_text_2_0= ruleSentenceWithReferences ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:317:3: ( (lv_text_2_0= ruleSentenceWithReferences ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2>=RULE_WORD && LA2_2<=RULE_STRING)||(LA2_2>=16 && LA2_2<=24)) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==RULE_STRING) ) {
                        int LA2_5 = input.LA(3);

                        if ( ((LA2_5>=RULE_WORD && LA2_5<=RULE_STRING)||(LA2_5>=16 && LA2_5<=24)) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_3>=RULE_WORD && LA2_3<=RULE_ANY_OTHER)||(LA2_3>=16 && LA2_3<=24)) ) {
                        alt2=1;
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
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalReqLNG.g:318:4: (lv_text_2_0= ruleSentenceWithReferences )
            	    {
            	    // InternalReqLNG.g:318:4: (lv_text_2_0= ruleSentenceWithReferences )
            	    // InternalReqLNG.g:319:5: lv_text_2_0= ruleSentenceWithReferences
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalReqLNG.g:340:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalReqLNG.g:340:44: (iv_ruleText= ruleText EOF )
            // InternalReqLNG.g:341:2: iv_ruleText= ruleText EOF
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
    // InternalReqLNG.g:347:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+ ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WORD_6=null;
        Token this_ANY_OTHER_7=null;


        	enterRule();

        try {
            // InternalReqLNG.g:353:2: ( (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+ )
            // InternalReqLNG.g:354:2: (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+
            {
            // InternalReqLNG.g:354:2: (kw= 'To' | kw= 'to' | kw= 'A' | kw= 'a' | kw= 'the' | kw= 'The' | this_WORD_6= RULE_WORD | this_ANY_OTHER_7= RULE_ANY_OTHER )+
            int cnt3=0;
            loop3:
            do {
                int alt3=9;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 17:
                    {
                    alt3=2;
                    }
                    break;
                case 18:
                    {
                    alt3=3;
                    }
                    break;
                case 19:
                    {
                    alt3=4;
                    }
                    break;
                case 20:
                    {
                    alt3=5;
                    }
                    break;
                case 21:
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

                }

                switch (alt3) {
            	case 1 :
            	    // InternalReqLNG.g:355:3: kw= 'To'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getToKeyword_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalReqLNG.g:361:3: kw= 'to'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getToKeyword_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalReqLNG.g:367:3: kw= 'A'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getAKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalReqLNG.g:373:3: kw= 'a'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getAKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalReqLNG.g:379:3: kw= 'the'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getTheKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalReqLNG.g:385:3: kw= 'The'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_9); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getTextAccess().getTheKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalReqLNG.g:391:3: this_WORD_6= RULE_WORD
            	    {
            	    this_WORD_6=(Token)match(input,RULE_WORD,FOLLOW_9); 

            	    			current.merge(this_WORD_6);
            	    		

            	    			newLeafNode(this_WORD_6, grammarAccess.getTextAccess().getWORDTerminalRuleCall_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalReqLNG.g:399:3: this_ANY_OTHER_7= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_7=(Token)match(input,RULE_ANY_OTHER,FOLLOW_9); 

            	    			current.merge(this_ANY_OTHER_7);
            	    		

            	    			newLeafNode(this_ANY_OTHER_7, grammarAccess.getTextAccess().getANY_OTHERTerminalRuleCall_7());
            	    		

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
    // InternalReqLNG.g:410:1: entryRuleSentenceWithReferences returns [EObject current=null] : iv_ruleSentenceWithReferences= ruleSentenceWithReferences EOF ;
    public final EObject entryRuleSentenceWithReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceWithReferences = null;


        try {
            // InternalReqLNG.g:410:63: (iv_ruleSentenceWithReferences= ruleSentenceWithReferences EOF )
            // InternalReqLNG.g:411:2: iv_ruleSentenceWithReferences= ruleSentenceWithReferences EOF
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
    // InternalReqLNG.g:417:1: ruleSentenceWithReferences returns [EObject current=null] : ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) ) ;
    public final EObject ruleSentenceWithReferences() throws RecognitionException {
        EObject current = null;

        Token lv_punctuation_1_1=null;
        Token lv_punctuation_1_2=null;
        Token lv_punctuation_1_3=null;
        EObject lv_textWithReferences_0_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:423:2: ( ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) ) )
            // InternalReqLNG.g:424:2: ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) )
            {
            // InternalReqLNG.g:424:2: ( ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) ) )
            // InternalReqLNG.g:425:3: ( (lv_textWithReferences_0_0= ruleTextWithReferences ) ) ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) )
            {
            // InternalReqLNG.g:425:3: ( (lv_textWithReferences_0_0= ruleTextWithReferences ) )
            // InternalReqLNG.g:426:4: (lv_textWithReferences_0_0= ruleTextWithReferences )
            {
            // InternalReqLNG.g:426:4: (lv_textWithReferences_0_0= ruleTextWithReferences )
            // InternalReqLNG.g:427:5: lv_textWithReferences_0_0= ruleTextWithReferences
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

            // InternalReqLNG.g:444:3: ( ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) ) )
            // InternalReqLNG.g:445:4: ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) )
            {
            // InternalReqLNG.g:445:4: ( (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' ) )
            // InternalReqLNG.g:446:5: (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' )
            {
            // InternalReqLNG.g:446:5: (lv_punctuation_1_1= '.' | lv_punctuation_1_2= '!' | lv_punctuation_1_3= '?' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
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
                    // InternalReqLNG.g:447:6: lv_punctuation_1_1= '.'
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
                    // InternalReqLNG.g:458:6: lv_punctuation_1_2= '!'
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
                    // InternalReqLNG.g:469:6: lv_punctuation_1_3= '?'
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
    // InternalReqLNG.g:486:1: entryRuleTextWithReferences returns [EObject current=null] : iv_ruleTextWithReferences= ruleTextWithReferences EOF ;
    public final EObject entryRuleTextWithReferences() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextWithReferences = null;


        try {
            // InternalReqLNG.g:486:59: (iv_ruleTextWithReferences= ruleTextWithReferences EOF )
            // InternalReqLNG.g:487:2: iv_ruleTextWithReferences= ruleTextWithReferences EOF
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
    // InternalReqLNG.g:493:1: ruleTextWithReferences returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) ;
    public final EObject ruleTextWithReferences() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_after_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:499:2: ( ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) )
            // InternalReqLNG.g:500:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            {
            // InternalReqLNG.g:500:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalReqLNG.g:501:3: ( (otherlv_0= RULE_STRING ) )+
                    {
                    // InternalReqLNG.g:501:3: ( (otherlv_0= RULE_STRING ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            int LA5_2 = input.LA(2);

                            if ( (LA5_2==EOF||LA5_2==RULE_STRING||(LA5_2>=22 && LA5_2<=24)) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqLNG.g:502:4: (otherlv_0= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:502:4: (otherlv_0= RULE_STRING )
                    	    // InternalReqLNG.g:503:5: otherlv_0= RULE_STRING
                    	    {

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getTextWithReferencesRule());
                    	    					}
                    	    				
                    	    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    					newLeafNode(otherlv_0, grammarAccess.getTextWithReferencesAccess().getOnlyRefsEntitiesCrossReference_0_0());
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:515:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    {
                    // InternalReqLNG.g:515:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    // InternalReqLNG.g:516:4: ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )*
                    {
                    // InternalReqLNG.g:516:4: ( (otherlv_1= RULE_STRING ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalReqLNG.g:517:5: (otherlv_1= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:517:5: (otherlv_1= RULE_STRING )
                    	    // InternalReqLNG.g:518:6: otherlv_1= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTextWithReferencesRule());
                    	    						}
                    	    					
                    	    otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    	    						newLeafNode(otherlv_1, grammarAccess.getTextWithReferencesAccess().getRefBeforeEntitiesCrossReference_1_0_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // InternalReqLNG.g:529:4: ( (lv_text_2_0= ruleText ) )
                    // InternalReqLNG.g:530:5: (lv_text_2_0= ruleText )
                    {
                    // InternalReqLNG.g:530:5: (lv_text_2_0= ruleText )
                    // InternalReqLNG.g:531:6: lv_text_2_0= ruleText
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

                    // InternalReqLNG.g:548:4: ( (lv_after_3_0= ruleReferenceCombination ) )*
                    loop7:
                    do {
                        int alt7=2;
                        alt7 = dfa7.predict(input);
                        switch (alt7) {
                    	case 1 :
                    	    // InternalReqLNG.g:549:5: (lv_after_3_0= ruleReferenceCombination )
                    	    {
                    	    // InternalReqLNG.g:549:5: (lv_after_3_0= ruleReferenceCombination )
                    	    // InternalReqLNG.g:550:6: lv_after_3_0= ruleReferenceCombination
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
                    	    break loop7;
                        }
                    } while (true);

                    // InternalReqLNG.g:567:4: ( (otherlv_4= RULE_STRING ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_STRING) ) {
                            int LA8_2 = input.LA(2);

                            if ( (LA8_2==EOF||LA8_2==RULE_STRING||(LA8_2>=22 && LA8_2<=24)) ) {
                                alt8=1;
                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalReqLNG.g:568:5: (otherlv_4= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:568:5: (otherlv_4= RULE_STRING )
                    	    // InternalReqLNG.g:569:6: otherlv_4= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTextWithReferencesRule());
                    	    						}
                    	    					
                    	    otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getTextWithReferencesAccess().getFinalRefEntitiesCrossReference_1_3_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
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
    // InternalReqLNG.g:585:1: entryRuleReferenceCombination returns [EObject current=null] : iv_ruleReferenceCombination= ruleReferenceCombination EOF ;
    public final EObject entryRuleReferenceCombination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCombination = null;


        try {
            // InternalReqLNG.g:585:61: (iv_ruleReferenceCombination= ruleReferenceCombination EOF )
            // InternalReqLNG.g:586:2: iv_ruleReferenceCombination= ruleReferenceCombination EOF
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
    // InternalReqLNG.g:592:1: ruleReferenceCombination returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleReferenceCombination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:598:2: ( ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) )
            // InternalReqLNG.g:599:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            {
            // InternalReqLNG.g:599:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            // InternalReqLNG.g:600:3: ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) )
            {
            // InternalReqLNG.g:600:3: ( (otherlv_0= RULE_STRING ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalReqLNG.g:601:4: (otherlv_0= RULE_STRING )
            	    {
            	    // InternalReqLNG.g:601:4: (otherlv_0= RULE_STRING )
            	    // InternalReqLNG.g:602:5: otherlv_0= RULE_STRING
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getReferenceCombinationRule());
            	    					}
            	    				
            	    otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    					newLeafNode(otherlv_0, grammarAccess.getReferenceCombinationAccess().getRefsEntitiesCrossReference_0_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalReqLNG.g:613:3: ( (lv_text_1_0= ruleText ) )
            // InternalReqLNG.g:614:4: (lv_text_1_0= ruleText )
            {
            // InternalReqLNG.g:614:4: (lv_text_1_0= ruleText )
            // InternalReqLNG.g:615:5: lv_text_1_0= ruleText
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
    // InternalReqLNG.g:636:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalReqLNG.g:636:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalReqLNG.g:637:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalReqLNG.g:643:1: ruleRequirement returns [EObject current=null] : (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalRequirement_0 = null;

        EObject this_UnconditionalRequirement_1 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:649:2: ( (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement ) )
            // InternalReqLNG.g:650:2: (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement )
            {
            // InternalReqLNG.g:650:2: (this_ConditionalRequirement_0= ruleConditionalRequirement | this_UnconditionalRequirement_1= ruleUnconditionalRequirement )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqLNG.g:651:3: this_ConditionalRequirement_0= ruleConditionalRequirement
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
                    // InternalReqLNG.g:660:3: this_UnconditionalRequirement_1= ruleUnconditionalRequirement
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
    // InternalReqLNG.g:672:1: entryRuleConditionalRequirement returns [EObject current=null] : iv_ruleConditionalRequirement= ruleConditionalRequirement EOF ;
    public final EObject entryRuleConditionalRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalRequirement = null;


        try {
            // InternalReqLNG.g:672:63: (iv_ruleConditionalRequirement= ruleConditionalRequirement EOF )
            // InternalReqLNG.g:673:2: iv_ruleConditionalRequirement= ruleConditionalRequirement EOF
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
    // InternalReqLNG.g:679:1: ruleConditionalRequirement returns [EObject current=null] : ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) ;
    public final EObject ruleConditionalRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        Enumerator lv_liability_2_0 = null;

        EObject lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:685:2: ( ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) )
            // InternalReqLNG.g:686:2: ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            {
            // InternalReqLNG.g:686:2: ( ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            // InternalReqLNG.g:687:3: ( (lv_condition_0_0= rulePrecondition ) )? ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) )
            {
            // InternalReqLNG.g:687:3: ( (lv_condition_0_0= rulePrecondition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalReqLNG.g:688:4: (lv_condition_0_0= rulePrecondition )
                    {
                    // InternalReqLNG.g:688:4: (lv_condition_0_0= rulePrecondition )
                    // InternalReqLNG.g:689:5: lv_condition_0_0= rulePrecondition
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

            // InternalReqLNG.g:706:3: ( (otherlv_1= RULE_STRING ) )
            // InternalReqLNG.g:707:4: (otherlv_1= RULE_STRING )
            {
            // InternalReqLNG.g:707:4: (otherlv_1= RULE_STRING )
            // InternalReqLNG.g:708:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalRequirementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getConditionalRequirementAccess().getSystemSystemCrossReference_1_0());
            				

            }


            }

            // InternalReqLNG.g:719:3: ( (lv_liability_2_0= ruleLiability ) )
            // InternalReqLNG.g:720:4: (lv_liability_2_0= ruleLiability )
            {
            // InternalReqLNG.g:720:4: (lv_liability_2_0= ruleLiability )
            // InternalReqLNG.g:721:5: lv_liability_2_0= ruleLiability
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

            // InternalReqLNG.g:738:3: ( (lv_end_3_0= ruleRequirementEnd ) )
            // InternalReqLNG.g:739:4: (lv_end_3_0= ruleRequirementEnd )
            {
            // InternalReqLNG.g:739:4: (lv_end_3_0= ruleRequirementEnd )
            // InternalReqLNG.g:740:5: lv_end_3_0= ruleRequirementEnd
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
    // InternalReqLNG.g:761:1: entryRuleUnconditionalRequirement returns [EObject current=null] : iv_ruleUnconditionalRequirement= ruleUnconditionalRequirement EOF ;
    public final EObject entryRuleUnconditionalRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnconditionalRequirement = null;


        try {
            // InternalReqLNG.g:761:65: (iv_ruleUnconditionalRequirement= ruleUnconditionalRequirement EOF )
            // InternalReqLNG.g:762:2: iv_ruleUnconditionalRequirement= ruleUnconditionalRequirement EOF
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
    // InternalReqLNG.g:768:1: ruleUnconditionalRequirement returns [EObject current=null] : ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) ;
    public final EObject ruleUnconditionalRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_the_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_liability_2_0 = null;

        EObject lv_end_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:774:2: ( ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) ) )
            // InternalReqLNG.g:775:2: ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            {
            // InternalReqLNG.g:775:2: ( ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) ) )
            // InternalReqLNG.g:776:3: ( (lv_the_0_0= 'The' ) ) ( (otherlv_1= RULE_STRING ) ) ( (lv_liability_2_0= ruleLiability ) ) ( (lv_end_3_0= ruleRequirementEnd ) )
            {
            // InternalReqLNG.g:776:3: ( (lv_the_0_0= 'The' ) )
            // InternalReqLNG.g:777:4: (lv_the_0_0= 'The' )
            {
            // InternalReqLNG.g:777:4: (lv_the_0_0= 'The' )
            // InternalReqLNG.g:778:5: lv_the_0_0= 'The'
            {
            lv_the_0_0=(Token)match(input,21,FOLLOW_12); 

            					newLeafNode(lv_the_0_0, grammarAccess.getUnconditionalRequirementAccess().getTheTheKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnconditionalRequirementRule());
            					}
            					setWithLastConsumed(current, "the", lv_the_0_0, "The");
            				

            }


            }

            // InternalReqLNG.g:790:3: ( (otherlv_1= RULE_STRING ) )
            // InternalReqLNG.g:791:4: (otherlv_1= RULE_STRING )
            {
            // InternalReqLNG.g:791:4: (otherlv_1= RULE_STRING )
            // InternalReqLNG.g:792:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnconditionalRequirementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(otherlv_1, grammarAccess.getUnconditionalRequirementAccess().getSystemSystemCrossReference_1_0());
            				

            }


            }

            // InternalReqLNG.g:803:3: ( (lv_liability_2_0= ruleLiability ) )
            // InternalReqLNG.g:804:4: (lv_liability_2_0= ruleLiability )
            {
            // InternalReqLNG.g:804:4: (lv_liability_2_0= ruleLiability )
            // InternalReqLNG.g:805:5: lv_liability_2_0= ruleLiability
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

            // InternalReqLNG.g:822:3: ( (lv_end_3_0= ruleRequirementEnd ) )
            // InternalReqLNG.g:823:4: (lv_end_3_0= ruleRequirementEnd )
            {
            // InternalReqLNG.g:823:4: (lv_end_3_0= ruleRequirementEnd )
            // InternalReqLNG.g:824:5: lv_end_3_0= ruleRequirementEnd
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
    // InternalReqLNG.g:845:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalReqLNG.g:845:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalReqLNG.g:846:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalReqLNG.g:852:1: rulePrecondition returns [EObject current=null] : ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_conditional_0_0 = null;

        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:858:2: ( ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) ) )
            // InternalReqLNG.g:859:2: ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) )
            {
            // InternalReqLNG.g:859:2: ( ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) ) )
            // InternalReqLNG.g:860:3: ( (lv_conditional_0_0= ruleConditional ) ) ( (lv_condition_1_0= ruleTextWithReferences ) )
            {
            // InternalReqLNG.g:860:3: ( (lv_conditional_0_0= ruleConditional ) )
            // InternalReqLNG.g:861:4: (lv_conditional_0_0= ruleConditional )
            {
            // InternalReqLNG.g:861:4: (lv_conditional_0_0= ruleConditional )
            // InternalReqLNG.g:862:5: lv_conditional_0_0= ruleConditional
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

            // InternalReqLNG.g:879:3: ( (lv_condition_1_0= ruleTextWithReferences ) )
            // InternalReqLNG.g:880:4: (lv_condition_1_0= ruleTextWithReferences )
            {
            // InternalReqLNG.g:880:4: (lv_condition_1_0= ruleTextWithReferences )
            // InternalReqLNG.g:881:5: lv_condition_1_0= ruleTextWithReferences
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
    // InternalReqLNG.g:902:1: entryRuleConditional returns [String current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final String entryRuleConditional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditional = null;


        try {
            // InternalReqLNG.g:902:51: (iv_ruleConditional= ruleConditional EOF )
            // InternalReqLNG.g:903:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalReqLNG.g:909:1: ruleConditional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'If' ;
    public final AntlrDatatypeRuleToken ruleConditional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReqLNG.g:915:2: (kw= 'If' )
            // InternalReqLNG.g:916:2: kw= 'If'
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
    // InternalReqLNG.g:924:1: entryRuleActorInteraction returns [EObject current=null] : iv_ruleActorInteraction= ruleActorInteraction EOF ;
    public final EObject entryRuleActorInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActorInteraction = null;


        try {
            // InternalReqLNG.g:924:57: (iv_ruleActorInteraction= ruleActorInteraction EOF )
            // InternalReqLNG.g:925:2: iv_ruleActorInteraction= ruleActorInteraction EOF
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
    // InternalReqLNG.g:931:1: ruleActorInteraction returns [EObject current=null] : ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) ) ;
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
            // InternalReqLNG.g:937:2: ( ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) ) )
            // InternalReqLNG.g:938:2: ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) )
            {
            // InternalReqLNG.g:938:2: ( ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) ) )
            // InternalReqLNG.g:939:3: ( (lv_provide_0_0= 'provide' ) ) ( (lv_the1_1_0= 'the' ) )? ( (otherlv_2= RULE_STRING ) ) ( (lv_with_3_0= 'with' ) ) ( (lv_the2_4_0= 'the' ) ) ( (lv_ability_5_0= 'ability' ) ) ( (lv_to_6_0= 'to' ) )
            {
            // InternalReqLNG.g:939:3: ( (lv_provide_0_0= 'provide' ) )
            // InternalReqLNG.g:940:4: (lv_provide_0_0= 'provide' )
            {
            // InternalReqLNG.g:940:4: (lv_provide_0_0= 'provide' )
            // InternalReqLNG.g:941:5: lv_provide_0_0= 'provide'
            {
            lv_provide_0_0=(Token)match(input,26,FOLLOW_15); 

            					newLeafNode(lv_provide_0_0, grammarAccess.getActorInteractionAccess().getProvideProvideKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "provide", lv_provide_0_0, "provide");
            				

            }


            }

            // InternalReqLNG.g:953:3: ( (lv_the1_1_0= 'the' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalReqLNG.g:954:4: (lv_the1_1_0= 'the' )
                    {
                    // InternalReqLNG.g:954:4: (lv_the1_1_0= 'the' )
                    // InternalReqLNG.g:955:5: lv_the1_1_0= 'the'
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

            // InternalReqLNG.g:967:3: ( (otherlv_2= RULE_STRING ) )
            // InternalReqLNG.g:968:4: (otherlv_2= RULE_STRING )
            {
            // InternalReqLNG.g:968:4: (otherlv_2= RULE_STRING )
            // InternalReqLNG.g:969:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getActorInteractionAccess().getActorActorCrossReference_2_0());
            				

            }


            }

            // InternalReqLNG.g:980:3: ( (lv_with_3_0= 'with' ) )
            // InternalReqLNG.g:981:4: (lv_with_3_0= 'with' )
            {
            // InternalReqLNG.g:981:4: (lv_with_3_0= 'with' )
            // InternalReqLNG.g:982:5: lv_with_3_0= 'with'
            {
            lv_with_3_0=(Token)match(input,27,FOLLOW_17); 

            					newLeafNode(lv_with_3_0, grammarAccess.getActorInteractionAccess().getWithWithKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "with", lv_with_3_0, "with");
            				

            }


            }

            // InternalReqLNG.g:994:3: ( (lv_the2_4_0= 'the' ) )
            // InternalReqLNG.g:995:4: (lv_the2_4_0= 'the' )
            {
            // InternalReqLNG.g:995:4: (lv_the2_4_0= 'the' )
            // InternalReqLNG.g:996:5: lv_the2_4_0= 'the'
            {
            lv_the2_4_0=(Token)match(input,20,FOLLOW_18); 

            					newLeafNode(lv_the2_4_0, grammarAccess.getActorInteractionAccess().getThe2TheKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "the2", lv_the2_4_0, "the");
            				

            }


            }

            // InternalReqLNG.g:1008:3: ( (lv_ability_5_0= 'ability' ) )
            // InternalReqLNG.g:1009:4: (lv_ability_5_0= 'ability' )
            {
            // InternalReqLNG.g:1009:4: (lv_ability_5_0= 'ability' )
            // InternalReqLNG.g:1010:5: lv_ability_5_0= 'ability'
            {
            lv_ability_5_0=(Token)match(input,28,FOLLOW_19); 

            					newLeafNode(lv_ability_5_0, grammarAccess.getActorInteractionAccess().getAbilityAbilityKeyword_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorInteractionRule());
            					}
            					setWithLastConsumed(current, "ability", lv_ability_5_0, "ability");
            				

            }


            }

            // InternalReqLNG.g:1022:3: ( (lv_to_6_0= 'to' ) )
            // InternalReqLNG.g:1023:4: (lv_to_6_0= 'to' )
            {
            // InternalReqLNG.g:1023:4: (lv_to_6_0= 'to' )
            // InternalReqLNG.g:1024:5: lv_to_6_0= 'to'
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
    // InternalReqLNG.g:1040:1: entryRuleRequirementEnd returns [EObject current=null] : iv_ruleRequirementEnd= ruleRequirementEnd EOF ;
    public final EObject entryRuleRequirementEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementEnd = null;


        try {
            // InternalReqLNG.g:1040:55: (iv_ruleRequirementEnd= ruleRequirementEnd EOF )
            // InternalReqLNG.g:1041:2: iv_ruleRequirementEnd= ruleRequirementEnd EOF
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
    // InternalReqLNG.g:1047:1: ruleRequirementEnd returns [EObject current=null] : ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' ) ;
    public final EObject ruleRequirementEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_ai_0_0 = null;

        EObject lv_objectWithDetails_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1053:2: ( ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' ) )
            // InternalReqLNG.g:1054:2: ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' )
            {
            // InternalReqLNG.g:1054:2: ( ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.' )
            // InternalReqLNG.g:1055:3: ( (lv_ai_0_0= ruleActorInteraction ) )? ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) ) otherlv_2= '.'
            {
            // InternalReqLNG.g:1055:3: ( (lv_ai_0_0= ruleActorInteraction ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalReqLNG.g:1056:4: (lv_ai_0_0= ruleActorInteraction )
                    {
                    // InternalReqLNG.g:1056:4: (lv_ai_0_0= ruleActorInteraction )
                    // InternalReqLNG.g:1057:5: lv_ai_0_0= ruleActorInteraction
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

            // InternalReqLNG.g:1074:3: ( (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms ) )
            // InternalReqLNG.g:1075:4: (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms )
            {
            // InternalReqLNG.g:1075:4: (lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms )
            // InternalReqLNG.g:1076:5: lv_objectWithDetails_1_0= ruleTextWithConceptsOrSynonyms
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
    // InternalReqLNG.g:1101:1: entryRuleTextWithConceptsOrSynonyms returns [EObject current=null] : iv_ruleTextWithConceptsOrSynonyms= ruleTextWithConceptsOrSynonyms EOF ;
    public final EObject entryRuleTextWithConceptsOrSynonyms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextWithConceptsOrSynonyms = null;


        try {
            // InternalReqLNG.g:1101:67: (iv_ruleTextWithConceptsOrSynonyms= ruleTextWithConceptsOrSynonyms EOF )
            // InternalReqLNG.g:1102:2: iv_ruleTextWithConceptsOrSynonyms= ruleTextWithConceptsOrSynonyms EOF
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
    // InternalReqLNG.g:1108:1: ruleTextWithConceptsOrSynonyms returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) ;
    public final EObject ruleTextWithConceptsOrSynonyms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        EObject lv_after_3_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1114:2: ( ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) ) )
            // InternalReqLNG.g:1115:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            {
            // InternalReqLNG.g:1115:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalReqLNG.g:1116:3: ( (otherlv_0= RULE_STRING ) )+
                    {
                    // InternalReqLNG.g:1116:3: ( (otherlv_0= RULE_STRING ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_STRING) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalReqLNG.g:1117:4: (otherlv_0= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:1117:4: (otherlv_0= RULE_STRING )
                    	    // InternalReqLNG.g:1118:5: otherlv_0= RULE_STRING
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
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:1130:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    {
                    // InternalReqLNG.g:1130:3: ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* )
                    // InternalReqLNG.g:1131:4: ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )*
                    {
                    // InternalReqLNG.g:1131:4: ( (otherlv_1= RULE_STRING ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_STRING) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalReqLNG.g:1132:5: (otherlv_1= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:1132:5: (otherlv_1= RULE_STRING )
                    	    // InternalReqLNG.g:1133:6: otherlv_1= RULE_STRING
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
                    	    break loop16;
                        }
                    } while (true);

                    // InternalReqLNG.g:1144:4: ( (lv_text_2_0= ruleText ) )
                    // InternalReqLNG.g:1145:5: (lv_text_2_0= ruleText )
                    {
                    // InternalReqLNG.g:1145:5: (lv_text_2_0= ruleText )
                    // InternalReqLNG.g:1146:6: lv_text_2_0= ruleText
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

                    // InternalReqLNG.g:1163:4: ( (lv_after_3_0= ruleConceptCombination ) )*
                    loop17:
                    do {
                        int alt17=2;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // InternalReqLNG.g:1164:5: (lv_after_3_0= ruleConceptCombination )
                    	    {
                    	    // InternalReqLNG.g:1164:5: (lv_after_3_0= ruleConceptCombination )
                    	    // InternalReqLNG.g:1165:6: lv_after_3_0= ruleConceptCombination
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
                    	    break loop17;
                        }
                    } while (true);

                    // InternalReqLNG.g:1182:4: ( (otherlv_4= RULE_STRING ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_STRING) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalReqLNG.g:1183:5: (otherlv_4= RULE_STRING )
                    	    {
                    	    // InternalReqLNG.g:1183:5: (otherlv_4= RULE_STRING )
                    	    // InternalReqLNG.g:1184:6: otherlv_4= RULE_STRING
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
                    	    break loop18;
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
    // InternalReqLNG.g:1200:1: entryRuleConceptCombination returns [EObject current=null] : iv_ruleConceptCombination= ruleConceptCombination EOF ;
    public final EObject entryRuleConceptCombination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptCombination = null;


        try {
            // InternalReqLNG.g:1200:59: (iv_ruleConceptCombination= ruleConceptCombination EOF )
            // InternalReqLNG.g:1201:2: iv_ruleConceptCombination= ruleConceptCombination EOF
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
    // InternalReqLNG.g:1207:1: ruleConceptCombination returns [EObject current=null] : ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleConceptCombination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1213:2: ( ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) ) )
            // InternalReqLNG.g:1214:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            {
            // InternalReqLNG.g:1214:2: ( ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) ) )
            // InternalReqLNG.g:1215:3: ( (otherlv_0= RULE_STRING ) )+ ( (lv_text_1_0= ruleText ) )
            {
            // InternalReqLNG.g:1215:3: ( (otherlv_0= RULE_STRING ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalReqLNG.g:1216:4: (otherlv_0= RULE_STRING )
            	    {
            	    // InternalReqLNG.g:1216:4: (otherlv_0= RULE_STRING )
            	    // InternalReqLNG.g:1217:5: otherlv_0= RULE_STRING
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalReqLNG.g:1228:3: ( (lv_text_1_0= ruleText ) )
            // InternalReqLNG.g:1229:4: (lv_text_1_0= ruleText )
            {
            // InternalReqLNG.g:1229:4: (lv_text_1_0= ruleText )
            // InternalReqLNG.g:1230:5: lv_text_1_0= ruleText
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
    // InternalReqLNG.g:1251:1: entryRuleGlossary returns [EObject current=null] : iv_ruleGlossary= ruleGlossary EOF ;
    public final EObject entryRuleGlossary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlossary = null;


        try {
            // InternalReqLNG.g:1251:49: (iv_ruleGlossary= ruleGlossary EOF )
            // InternalReqLNG.g:1252:2: iv_ruleGlossary= ruleGlossary EOF
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
    // InternalReqLNG.g:1258:1: ruleGlossary returns [EObject current=null] : ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* ) ;
    public final EObject ruleGlossary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_concepts_2_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1264:2: ( ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* ) )
            // InternalReqLNG.g:1265:2: ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* )
            {
            // InternalReqLNG.g:1265:2: ( () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )* )
            // InternalReqLNG.g:1266:3: () otherlv_1= 'Glossary' ( (lv_concepts_2_0= ruleConcept ) )*
            {
            // InternalReqLNG.g:1266:3: ()
            // InternalReqLNG.g:1267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlossaryAccess().getGlossaryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGlossaryAccess().getGlossaryKeyword_1());
            		
            // InternalReqLNG.g:1277:3: ( (lv_concepts_2_0= ruleConcept ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30||LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalReqLNG.g:1278:4: (lv_concepts_2_0= ruleConcept )
            	    {
            	    // InternalReqLNG.g:1278:4: (lv_concepts_2_0= ruleConcept )
            	    // InternalReqLNG.g:1279:5: lv_concepts_2_0= ruleConcept
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
            	    break loop21;
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
    // InternalReqLNG.g:1300:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalReqLNG.g:1300:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalReqLNG.g:1301:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalReqLNG.g:1307:1: ruleConcept returns [EObject current=null] : (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_DomainObject_1 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1313:2: ( (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject ) )
            // InternalReqLNG.g:1314:2: (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject )
            {
            // InternalReqLNG.g:1314:2: (this_Function_0= ruleFunction | this_DomainObject_1= ruleDomainObject )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalReqLNG.g:1315:3: this_Function_0= ruleFunction
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
                    // InternalReqLNG.g:1324:3: this_DomainObject_1= ruleDomainObject
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
    // InternalReqLNG.g:1336:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalReqLNG.g:1336:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalReqLNG.g:1337:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalReqLNG.g:1343:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? ) ;
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
            // InternalReqLNG.g:1349:2: ( (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? ) )
            // InternalReqLNG.g:1350:2: (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? )
            {
            // InternalReqLNG.g:1350:2: (otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )? )
            // InternalReqLNG.g:1351:3: otherlv_0= 'Function' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:1359:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:1360:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:1360:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:1361:5: lv_name_2_0= ruleText
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

            // InternalReqLNG.g:1378:3: (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalReqLNG.g:1379:4: otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleFunctionSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )*
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getSynonymsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getColonKeyword_3_1());
                    			
                    // InternalReqLNG.g:1387:4: ( (lv_synonyms_5_0= ruleFunctionSynonym ) )
                    // InternalReqLNG.g:1388:5: (lv_synonyms_5_0= ruleFunctionSynonym )
                    {
                    // InternalReqLNG.g:1388:5: (lv_synonyms_5_0= ruleFunctionSynonym )
                    // InternalReqLNG.g:1389:6: lv_synonyms_5_0= ruleFunctionSynonym
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

                    // InternalReqLNG.g:1406:4: (otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==32) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalReqLNG.g:1407:5: otherlv_6= ',' ( (lv_synonyms_7_0= ruleFunctionSynonym ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalReqLNG.g:1411:5: ( (lv_synonyms_7_0= ruleFunctionSynonym ) )
                    	    // InternalReqLNG.g:1412:6: (lv_synonyms_7_0= ruleFunctionSynonym )
                    	    {
                    	    // InternalReqLNG.g:1412:6: (lv_synonyms_7_0= ruleFunctionSynonym )
                    	    // InternalReqLNG.g:1413:7: lv_synonyms_7_0= ruleFunctionSynonym
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalReqLNG.g:1432:3: (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalReqLNG.g:1433:4: otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )*
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getColonKeyword_4_1());
                    			
                    // InternalReqLNG.g:1441:4: ( (lv_description_10_0= ruleSentenceWithReferences ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_STRING)||(LA25_0>=16 && LA25_0<=21)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalReqLNG.g:1442:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    {
                    	    // InternalReqLNG.g:1442:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    // InternalReqLNG.g:1443:6: lv_description_10_0= ruleSentenceWithReferences
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
                    	    break loop25;
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
    // InternalReqLNG.g:1465:1: entryRuleDomainObject returns [EObject current=null] : iv_ruleDomainObject= ruleDomainObject EOF ;
    public final EObject entryRuleDomainObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainObject = null;


        try {
            // InternalReqLNG.g:1465:53: (iv_ruleDomainObject= ruleDomainObject EOF )
            // InternalReqLNG.g:1466:2: iv_ruleDomainObject= ruleDomainObject EOF
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
    // InternalReqLNG.g:1472:1: ruleDomainObject returns [EObject current=null] : (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? ) ;
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
            // InternalReqLNG.g:1478:2: ( (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? ) )
            // InternalReqLNG.g:1479:2: (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? )
            {
            // InternalReqLNG.g:1479:2: (otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )? )
            // InternalReqLNG.g:1480:3: otherlv_0= 'Object' otherlv_1= ':' ( (lv_name_2_0= ruleText ) ) (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )? (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainObjectAccess().getObjectKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainObjectAccess().getColonKeyword_1());
            		
            // InternalReqLNG.g:1488:3: ( (lv_name_2_0= ruleText ) )
            // InternalReqLNG.g:1489:4: (lv_name_2_0= ruleText )
            {
            // InternalReqLNG.g:1489:4: (lv_name_2_0= ruleText )
            // InternalReqLNG.g:1490:5: lv_name_2_0= ruleText
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

            // InternalReqLNG.g:1507:3: (otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalReqLNG.g:1508:4: otherlv_3= 'Synonyms' otherlv_4= ':' ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) ) (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )*
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDomainObjectAccess().getSynonymsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getDomainObjectAccess().getColonKeyword_3_1());
                    			
                    // InternalReqLNG.g:1516:4: ( (lv_synonyms_5_0= ruleDomainObjectSynonym ) )
                    // InternalReqLNG.g:1517:5: (lv_synonyms_5_0= ruleDomainObjectSynonym )
                    {
                    // InternalReqLNG.g:1517:5: (lv_synonyms_5_0= ruleDomainObjectSynonym )
                    // InternalReqLNG.g:1518:6: lv_synonyms_5_0= ruleDomainObjectSynonym
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

                    // InternalReqLNG.g:1535:4: (otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==32) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalReqLNG.g:1536:5: otherlv_6= ',' ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) )
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDomainObjectAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalReqLNG.g:1540:5: ( (lv_synonyms_7_0= ruleDomainObjectSynonym ) )
                    	    // InternalReqLNG.g:1541:6: (lv_synonyms_7_0= ruleDomainObjectSynonym )
                    	    {
                    	    // InternalReqLNG.g:1541:6: (lv_synonyms_7_0= ruleDomainObjectSynonym )
                    	    // InternalReqLNG.g:1542:7: lv_synonyms_7_0= ruleDomainObjectSynonym
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalReqLNG.g:1561:3: (otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalReqLNG.g:1562:4: otherlv_8= 'Description' otherlv_9= ':' ( (lv_description_10_0= ruleSentenceWithReferences ) )+
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDomainObjectAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_9=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getDomainObjectAccess().getColonKeyword_4_1());
                    			
                    // InternalReqLNG.g:1570:4: ( (lv_description_10_0= ruleSentenceWithReferences ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=RULE_WORD && LA29_0<=RULE_STRING)||(LA29_0>=16 && LA29_0<=21)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalReqLNG.g:1571:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    {
                    	    // InternalReqLNG.g:1571:5: (lv_description_10_0= ruleSentenceWithReferences )
                    	    // InternalReqLNG.g:1572:6: lv_description_10_0= ruleSentenceWithReferences
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
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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
    // InternalReqLNG.g:1594:1: entryRuleFunctionSynonym returns [EObject current=null] : iv_ruleFunctionSynonym= ruleFunctionSynonym EOF ;
    public final EObject entryRuleFunctionSynonym() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionSynonym = null;


        try {
            // InternalReqLNG.g:1594:56: (iv_ruleFunctionSynonym= ruleFunctionSynonym EOF )
            // InternalReqLNG.g:1595:2: iv_ruleFunctionSynonym= ruleFunctionSynonym EOF
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
    // InternalReqLNG.g:1601:1: ruleFunctionSynonym returns [EObject current=null] : ( (lv_name_0_0= ruleText ) ) ;
    public final EObject ruleFunctionSynonym() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1607:2: ( ( (lv_name_0_0= ruleText ) ) )
            // InternalReqLNG.g:1608:2: ( (lv_name_0_0= ruleText ) )
            {
            // InternalReqLNG.g:1608:2: ( (lv_name_0_0= ruleText ) )
            // InternalReqLNG.g:1609:3: (lv_name_0_0= ruleText )
            {
            // InternalReqLNG.g:1609:3: (lv_name_0_0= ruleText )
            // InternalReqLNG.g:1610:4: lv_name_0_0= ruleText
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
    // InternalReqLNG.g:1630:1: entryRuleDomainObjectSynonym returns [EObject current=null] : iv_ruleDomainObjectSynonym= ruleDomainObjectSynonym EOF ;
    public final EObject entryRuleDomainObjectSynonym() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainObjectSynonym = null;


        try {
            // InternalReqLNG.g:1630:60: (iv_ruleDomainObjectSynonym= ruleDomainObjectSynonym EOF )
            // InternalReqLNG.g:1631:2: iv_ruleDomainObjectSynonym= ruleDomainObjectSynonym EOF
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
    // InternalReqLNG.g:1637:1: ruleDomainObjectSynonym returns [EObject current=null] : ( (lv_name_0_0= ruleText ) ) ;
    public final EObject ruleDomainObjectSynonym() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalReqLNG.g:1643:2: ( ( (lv_name_0_0= ruleText ) ) )
            // InternalReqLNG.g:1644:2: ( (lv_name_0_0= ruleText ) )
            {
            // InternalReqLNG.g:1644:2: ( (lv_name_0_0= ruleText ) )
            // InternalReqLNG.g:1645:3: (lv_name_0_0= ruleText )
            {
            // InternalReqLNG.g:1645:3: (lv_name_0_0= ruleText )
            // InternalReqLNG.g:1646:4: lv_name_0_0= ruleText
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
    // InternalReqLNG.g:1666:1: ruleLiability returns [Enumerator current=null] : ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) ) ;
    public final Enumerator ruleLiability() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalReqLNG.g:1672:2: ( ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) ) )
            // InternalReqLNG.g:1673:2: ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) )
            {
            // InternalReqLNG.g:1673:2: ( (enumLiteral_0= 'shall' ) | (enumLiteral_1= 'should' ) | (enumLiteral_2= 'will' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt31=1;
                }
                break;
            case 35:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalReqLNG.g:1674:3: (enumLiteral_0= 'shall' )
                    {
                    // InternalReqLNG.g:1674:3: (enumLiteral_0= 'shall' )
                    // InternalReqLNG.g:1675:4: enumLiteral_0= 'shall'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLiabilityAccess().getShallEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:1682:3: (enumLiteral_1= 'should' )
                    {
                    // InternalReqLNG.g:1682:3: (enumLiteral_1= 'should' )
                    // InternalReqLNG.g:1683:4: enumLiteral_1= 'should'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLiabilityAccess().getShouldEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalReqLNG.g:1690:3: (enumLiteral_2= 'will' )
                    {
                    // InternalReqLNG.g:1690:3: (enumLiteral_2= 'will' )
                    // InternalReqLNG.g:1691:4: enumLiteral_2= 'will'
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\5\uffff";
    static final String dfa_2s = "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String dfa_3s = "\2\4\1\uffff\1\4\1\uffff";
    static final String dfa_4s = "\1\25\1\30\1\uffff\1\44\1\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\5\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\1\1\11\uffff\6\2",
            "\2\2\1\3\11\uffff\6\2\3\4",
            "",
            "\2\2\1\3\11\uffff\6\2\3\4\11\uffff\3\4",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "500:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleReferenceCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )";
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 548:4: ( (lv_after_3_0= ruleReferenceCombination ) )*";
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1115:2: ( ( (otherlv_0= RULE_STRING ) )+ | ( ( (otherlv_1= RULE_STRING ) )* ( (lv_text_2_0= ruleText ) ) ( (lv_after_3_0= ruleConceptCombination ) )* ( (otherlv_4= RULE_STRING ) )* ) )";
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_19;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 1163:4: ( (lv_after_3_0= ruleConceptCombination ) )*";
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