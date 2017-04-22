package de.schneidertim.requirements.nlp.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqLNGLexer extends Lexer {
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

    public InternalReqLNGLexer() {;} 
    public InternalReqLNGLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalReqLNGLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalReqLNG.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:11:7: ( 'If' )
            // InternalReqLNG.g:11:9: 'If'
            {
            match("If"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:12:7: ( 'To' )
            // InternalReqLNG.g:12:9: 'To'
            {
            match("To"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:13:7: ( 'to' )
            // InternalReqLNG.g:13:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:14:7: ( 'A' )
            // InternalReqLNG.g:14:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:15:7: ( 'a' )
            // InternalReqLNG.g:15:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:16:7: ( 'the' )
            // InternalReqLNG.g:16:9: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:17:7: ( 'The' )
            // InternalReqLNG.g:17:9: 'The'
            {
            match("The"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:18:7: ( '.' )
            // InternalReqLNG.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:19:7: ( '!' )
            // InternalReqLNG.g:19:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:20:7: ( '?' )
            // InternalReqLNG.g:20:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:21:7: ( 'shall' )
            // InternalReqLNG.g:21:9: 'shall'
            {
            match("shall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:22:7: ( 'should' )
            // InternalReqLNG.g:22:9: 'should'
            {
            match("should"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:23:7: ( 'will' )
            // InternalReqLNG.g:23:9: 'will'
            {
            match("will"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:24:7: ( 'Actor' )
            // InternalReqLNG.g:24:9: 'Actor'
            {
            match("Actor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:25:7: ( ':' )
            // InternalReqLNG.g:25:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:26:7: ( 'System' )
            // InternalReqLNG.g:26:9: 'System'
            {
            match("System"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:27:7: ( 'Description' )
            // InternalReqLNG.g:27:9: 'Description'
            {
            match("Description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:28:7: ( 'Glossary' )
            // InternalReqLNG.g:28:9: 'Glossary'
            {
            match("Glossary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:29:7: ( 'Function' )
            // InternalReqLNG.g:29:9: 'Function'
            {
            match("Function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:30:7: ( 'Synonyms' )
            // InternalReqLNG.g:30:9: 'Synonyms'
            {
            match("Synonyms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:31:7: ( ',' )
            // InternalReqLNG.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:32:7: ( 'Object' )
            // InternalReqLNG.g:32:9: 'Object'
            {
            match("Object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:33:7: ( 'provide' )
            // InternalReqLNG.g:33:9: 'provide'
            {
            match("provide"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:34:7: ( 'with' )
            // InternalReqLNG.g:34:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:35:7: ( 'ability' )
            // InternalReqLNG.g:35:9: 'ability'
            {
            match("ability"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3942:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )+ )
            // InternalReqLNG.g:3942:13: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReqLNG.g:3942:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqLNG.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3944:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalReqLNG.g:3944:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalReqLNG.g:3944:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalReqLNG.g:3944:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalReqLNG.g:3944:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalReqLNG.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3946:10: ( ( '0' .. '9' )+ )
            // InternalReqLNG.g:3946:12: ( '0' .. '9' )+
            {
            // InternalReqLNG.g:3946:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalReqLNG.g:3946:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3948:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalReqLNG.g:3948:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalReqLNG.g:3948:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqLNG.g:3948:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalReqLNG.g:3948:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalReqLNG.g:3948:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReqLNG.g:3948:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalReqLNG.g:3948:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalReqLNG.g:3948:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalReqLNG.g:3948:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalReqLNG.g:3948:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3950:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalReqLNG.g:3950:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalReqLNG.g:3950:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalReqLNG.g:3950:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3952:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalReqLNG.g:3952:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalReqLNG.g:3952:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalReqLNG.g:3952:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalReqLNG.g:3952:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqLNG.g:3952:41: ( '\\r' )? '\\n'
                    {
                    // InternalReqLNG.g:3952:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalReqLNG.g:3952:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3954:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalReqLNG.g:3954:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalReqLNG.g:3954:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReqLNG.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalReqLNG.g:3956:16: ( . )
            // InternalReqLNG.g:3956:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalReqLNG.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_WORD | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=33;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalReqLNG.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalReqLNG.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalReqLNG.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalReqLNG.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalReqLNG.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalReqLNG.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalReqLNG.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalReqLNG.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalReqLNG.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalReqLNG.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalReqLNG.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalReqLNG.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalReqLNG.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalReqLNG.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalReqLNG.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalReqLNG.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalReqLNG.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalReqLNG.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalReqLNG.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalReqLNG.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalReqLNG.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalReqLNG.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalReqLNG.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalReqLNG.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalReqLNG.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalReqLNG.g:1:160: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 27 :
                // InternalReqLNG.g:1:170: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalReqLNG.g:1:178: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalReqLNG.g:1:187: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalReqLNG.g:1:199: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalReqLNG.g:1:215: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalReqLNG.g:1:231: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalReqLNG.g:1:239: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\35\1\45\1\47\3\uffff\2\35\1\uffff\4\35\1\uffff\3\35\1\33\2\uffff\3\33\2\uffff\1\72\1\uffff\1\37\1\uffff\1\73\1\37\1\75\2\37\1\uffff\1\37\4\uffff\2\37\1\uffff\4\37\1\uffff\2\37\7\uffff\1\114\1\uffff\1\115\15\37\2\uffff\4\37\1\137\1\140\7\37\1\150\1\37\1\152\1\37\2\uffff\7\37\1\uffff\1\37\1\uffff\1\164\1\165\4\37\1\172\1\37\1\174\2\uffff\4\37\1\uffff\1\u0081\1\uffff\1\u0082\1\37\1\u0084\1\u0085\2\uffff\1\37\2\uffff\1\37\1\u0088\1\uffff";
    static final String DFA13_eofS =
        "\u0089\uffff";
    static final String DFA13_minS =
        "\1\0\5\55\3\uffff\2\55\1\uffff\4\55\1\uffff\3\55\1\101\2\uffff\2\0\1\52\2\uffff\1\55\1\uffff\1\60\1\uffff\1\55\1\60\1\55\2\60\1\uffff\1\60\4\uffff\2\60\1\uffff\4\60\1\uffff\2\60\7\uffff\1\55\1\uffff\1\55\15\60\2\uffff\4\60\2\55\7\60\1\55\1\60\1\55\1\60\2\uffff\7\60\1\uffff\1\60\1\uffff\2\55\4\60\1\55\1\60\1\55\2\uffff\4\60\1\uffff\1\55\1\uffff\1\55\1\60\2\55\2\uffff\1\60\2\uffff\1\60\1\55\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\5\172\3\uffff\2\172\1\uffff\4\172\1\uffff\4\172\2\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\1\172\1\uffff\5\172\1\uffff\1\172\4\uffff\2\172\1\uffff\4\172\1\uffff\2\172\7\uffff\1\172\1\uffff\16\172\2\uffff\21\172\2\uffff\7\172\1\uffff\1\172\1\uffff\11\172\2\uffff\4\172\1\uffff\1\172\1\uffff\4\172\2\uffff\1\172\2\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\6\uffff\1\10\1\11\1\12\2\uffff\1\17\4\uffff\1\25\4\uffff\1\33\1\34\3\uffff\1\40\1\41\1\uffff\1\33\1\uffff\1\32\5\uffff\1\4\1\uffff\1\5\1\10\1\11\1\12\2\uffff\1\17\4\uffff\1\25\2\uffff\1\34\1\35\1\36\1\37\1\40\1\1\1\2\1\uffff\1\3\16\uffff\1\7\1\6\21\uffff\1\15\1\30\7\uffff\1\16\1\uffff\1\13\11\uffff\1\14\1\20\4\uffff\1\26\1\uffff\1\31\4\uffff\1\27\1\24\1\uffff\1\22\1\23\2\uffff\1\21";
    static final String DFA13_specialS =
        "\1\2\26\uffff\1\1\1\0\160\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\7\1\27\4\33\1\30\4\33\1\20\1\33\1\6\1\31\12\26\1\13\4\33\1\10\1\33\1\4\2\23\1\15\1\23\1\17\1\16\1\23\1\1\5\23\1\21\3\23\1\14\1\2\6\23\3\33\1\24\1\25\1\33\1\5\16\23\1\22\2\23\1\11\1\3\2\23\1\12\3\23\uff85\33",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\5\36\1\34\24\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\7\36\1\41\6\36\1\40\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\7\36\1\43\6\36\1\42\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\44\27\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\36\1\46\30\36",
            "",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\7\36\1\53\22\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\54\21\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\56\1\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\57\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\60\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\61\5\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\36\1\63\30\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\64\10\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\66",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\74\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\76\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\77\6\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\100\21\36",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\101\15\36\1\102\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\103\7\36\1\104\6\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\106\4\36\1\105\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\107\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\110\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\111\14\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\11\36\1\112\20\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\113\13\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\116\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\117\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\120\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24\36\1\121\5\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\122\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\7\36\1\123\22\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\124\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\125\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\126\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\127\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\130\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\131\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\25\36\1\132\4\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\133\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\134\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\135\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\136\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\141\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\142\14\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\143\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\144\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\145\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\146\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\147\21\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\151\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\153\26\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\154\15\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\155\1\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\156\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\157\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\160\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\161\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\162\26\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\163\1\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\166\15\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\167\12\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\170\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\171\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\173\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\175\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\176\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\30\36\1\177\1\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\u0080\14\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\u0083\21\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\u0086\13\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\u0087\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_WORD | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 54;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 54;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='I') ) {s = 1;}

                        else if ( (LA13_0=='T') ) {s = 2;}

                        else if ( (LA13_0=='t') ) {s = 3;}

                        else if ( (LA13_0=='A') ) {s = 4;}

                        else if ( (LA13_0=='a') ) {s = 5;}

                        else if ( (LA13_0=='.') ) {s = 6;}

                        else if ( (LA13_0=='!') ) {s = 7;}

                        else if ( (LA13_0=='?') ) {s = 8;}

                        else if ( (LA13_0=='s') ) {s = 9;}

                        else if ( (LA13_0=='w') ) {s = 10;}

                        else if ( (LA13_0==':') ) {s = 11;}

                        else if ( (LA13_0=='S') ) {s = 12;}

                        else if ( (LA13_0=='D') ) {s = 13;}

                        else if ( (LA13_0=='G') ) {s = 14;}

                        else if ( (LA13_0=='F') ) {s = 15;}

                        else if ( (LA13_0==',') ) {s = 16;}

                        else if ( (LA13_0=='O') ) {s = 17;}

                        else if ( (LA13_0=='p') ) {s = 18;}

                        else if ( ((LA13_0>='B' && LA13_0<='C')||LA13_0=='E'||LA13_0=='H'||(LA13_0>='J' && LA13_0<='N')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||(LA13_0>='b' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 19;}

                        else if ( (LA13_0=='^') ) {s = 20;}

                        else if ( (LA13_0=='_') ) {s = 21;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 22;}

                        else if ( (LA13_0=='\"') ) {s = 23;}

                        else if ( (LA13_0=='\'') ) {s = 24;}

                        else if ( (LA13_0=='/') ) {s = 25;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 26;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=';' && LA13_0<='>')||LA13_0=='@'||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}