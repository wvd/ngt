// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g 2010-04-14 20:36:17
 package ngt.williaminc.core.grammar; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GrammarLexer extends Lexer {
    public static final int T__27=27;
    public static final int FCALL=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int INT=10;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int WS=11;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int ARG=7;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int FUNC=5;
    public static final int SLIST=8;
    public static final int VAR=4;

    // delegates
    // delegators

    public GrammarLexer() {;} 
    public GrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:5:7: ( 'is' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:5:9: 'is'
            {
            match("is"); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:6:7: ( ';' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:6:9: ';'
            {
            match(';'); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:7:7: ( 'nummer' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:7:9: 'nummer'
            {
            match("nummer"); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:8:7: ( 'lijst' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:8:9: 'lijst'
            {
            match("lijst"); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:9:7: ( '(' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:9:9: '('
            {
            match('('); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:10:7: ( ',' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:10:9: ','
            {
            match(','); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:11:7: ( ')' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:11:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:12:7: ( '{' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:12:9: '{'
            {
            match('{'); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:13:7: ( '}' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:13:9: '}'
            {
            match('}'); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:14:7: ( 'toon' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:14:9: 'toon'
            {
            match("toon"); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:15:7: ( 'for' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:15:9: 'for'
            {
            match("for"); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:16:7: ( '=' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:16:9: '='
            {
            match('='); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:17:7: ( '==' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:17:9: '=='
            {
            match("=="); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:18:7: ( '!=' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:18:9: '!='
            {
            match("!="); 


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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:19:7: ( '+' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:19:9: '+'
            {
            match('+'); 

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
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:20:7: ( '*' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:20:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:109:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:109:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:109:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:111:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:111:9: ( '0' .. '9' )+
            {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:111:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:111:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:113:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:113:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:113:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | WS )
        int alt4=19;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:106: ID
                {
                mID(); 

                }
                break;
            case 18 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:109: INT
                {
                mINT(); 

                }
                break;
            case 19 :
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:1:113: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\20\1\uffff\2\20\5\uffff\2\20\1\31\6\uffff\1\32\4\20"+
        "\3\uffff\3\20\1\42\2\20\1\45\1\uffff\1\20\1\47\1\uffff\1\50\2\uffff";
    static final String DFA4_eofS =
        "\51\uffff";
    static final String DFA4_minS =
        "\1\11\1\163\1\uffff\1\165\1\151\5\uffff\2\157\1\75\6\uffff\1\60"+
        "\1\155\1\152\1\157\1\162\3\uffff\1\155\1\163\1\156\1\60\1\145\1"+
        "\164\1\60\1\uffff\1\162\1\60\1\uffff\1\60\2\uffff";
    static final String DFA4_maxS =
        "\1\175\1\163\1\uffff\1\165\1\151\5\uffff\2\157\1\75\6\uffff\1\172"+
        "\1\155\1\152\1\157\1\162\3\uffff\1\155\1\163\1\156\1\172\1\145\1"+
        "\164\1\172\1\uffff\1\162\1\172\1\uffff\1\172\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\3\uffff\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\5\uffff\1\15\1\14\1\1\7\uffff\1\13\2\uffff\1"+
        "\12\1\uffff\1\4\1\3";
    static final String DFA4_specialS =
        "\51\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\1\15\6\uffff\1\5\1\7\1\17"+
            "\1\16\1\6\3\uffff\12\21\1\uffff\1\2\1\uffff\1\14\3\uffff\32"+
            "\20\4\uffff\1\20\1\uffff\5\20\1\13\2\20\1\1\2\20\1\4\1\20\1"+
            "\3\5\20\1\12\6\20\1\10\1\uffff\1\11",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "\1\43",
            "\1\44",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\1\46",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | WS );";
        }
    }
 

}