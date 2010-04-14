// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g 2010-04-14 20:36:19
 package ngt.williaminc.core.grammar; 
          import ngt.williaminc.core.ext.*;
          import ngt.williaminc.core.type.*;
          
          import java.util.Map;
          import java.util.HashMap;
          


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GrammarWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "FUNC", "FCALL", "ARG", "SLIST", "ID", "INT", "WS", "'is'", "';'", "'nummer'", "'lijst'", "'('", "','", "')'", "'{'", "'}'", "'toon'", "'for'", "'='", "'=='", "'!='", "'+'", "'*'"
    };
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


        public GrammarWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public GrammarWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GrammarWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g"; }


      private Map<String, Function> fList = new HashMap<String, Function>();



    // $ANTLR start "program"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:24:1: program : ( declaration )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:25:5: ( ( declaration )+ )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:25:9: ( declaration )+
            {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:25:9: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=VAR && LA1_0<=FUNC)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:25:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program53);
            	    declaration();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "declaration"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:28:1: declaration : ( variable | function );
    public final void declaration() throws RecognitionException {
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:29:5: ( variable | function )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VAR) ) {
                alt2=1;
            }
            else if ( (LA2_0==FUNC) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:29:9: variable
                    {
                    pushFollow(FOLLOW_variable_in_declaration73);
                    variable();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:30:9: function
                    {
                    pushFollow(FOLLOW_function_in_declaration83);
                    function();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "declaration"


    // $ANTLR start "variable"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:33:1: variable : ^( VAR type ID expr ) ;
    public final void variable() throws RecognitionException {
        CommonTree ID2=null;
        GrammarWalker.type_return type1 = null;


        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:34:5: ( ^( VAR type ID expr ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:34:9: ^( VAR type ID expr )
            {
            match(input,VAR,FOLLOW_VAR_in_variable103); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_variable105);
            type1=type();

            state._fsp--;

            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_variable107); 
            pushFollow(FOLLOW_expr_in_variable109);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 
            System.out.println("define "+(type1!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(type1.start),
              input.getTreeAdaptor().getTokenStopIndex(type1.start))):null)+" "+(ID2!=null?ID2.getText():null));

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
    // $ANTLR end "variable"

    public static class type_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "type"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:38:1: type : ( 'nummer' | 'lijst' );
    public final GrammarWalker.type_return type() throws RecognitionException {
        GrammarWalker.type_return retval = new GrammarWalker.type_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:38:5: ( 'nummer' | 'lijst' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:
            {
            if ( (input.LA(1)>=14 && input.LA(1)<=15) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "function"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:42:1: function : ^( FUNC type ID (e= formalParameter )* block ) ;
    public final void function() throws RecognitionException {
        CommonTree ID4=null;
        GrammarWalker.formalParameter_return e = null;

        GrammarWalker.type_return type3 = null;


         Map exprList = new HashMap(); 
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:44:5: ( ^( FUNC type ID (e= formalParameter )* block ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:44:9: ^( FUNC type ID (e= formalParameter )* block )
            {
            match(input,FUNC,FOLLOW_FUNC_in_function174); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_function176);
            type3=type();

            state._fsp--;

            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_function178); 
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:44:24: (e= formalParameter )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ARG) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:44:25: e= formalParameter
            	    {
            	    pushFollow(FOLLOW_formalParameter_in_function183);
            	    e=formalParameter();

            	    state._fsp--;

            	    exprList.put((e!=null?e.id:null), (e!=null?e.type:null));

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_function189);
            block();

            state._fsp--;


            match(input, Token.UP, null); 
            System.out.println("define "+(type3!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(type3.start),
              input.getTreeAdaptor().getTokenStopIndex(type3.start))):null)+" "+(ID4!=null?ID4.getText():null)+"()"+exprList.size());
                    Function f = new Function(exprList); 
                    this.fList.put((ID4!=null?ID4.getText():null), f);     
                    

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
    // $ANTLR end "function"

    public static class formalParameter_return extends TreeRuleReturnScope {
        public String type;
        public String id;
    };

    // $ANTLR start "formalParameter"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:51:1: formalParameter returns [String type, String id] : ^( ARG type ID ) ;
    public final GrammarWalker.formalParameter_return formalParameter() throws RecognitionException {
        GrammarWalker.formalParameter_return retval = new GrammarWalker.formalParameter_return();
        retval.start = input.LT(1);

        CommonTree ID6=null;
        GrammarWalker.type_return type5 = null;


        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:52:5: ( ^( ARG type ID ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:52:9: ^( ARG type ID )
            {
            match(input,ARG,FOLLOW_ARG_in_formalParameter224); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_in_formalParameter226);
            type5=type();

            state._fsp--;

            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_formalParameter228); 

            match(input, Token.UP, null); 
             System.out.print("hoi"); retval.type = (type5!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(type5.start),
              input.getTreeAdaptor().getTokenStopIndex(type5.start))):null); retval.id = (ID6!=null?ID6.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameter"


    // $ANTLR start "block"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:57:1: block : ^( SLIST ( variable )* ( stat )* ) ;
    public final void block() throws RecognitionException {
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:58:5: ( ^( SLIST ( variable )* ( stat )* ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:58:9: ^( SLIST ( variable )* ( stat )* )
            {
            match(input,SLIST,FOLLOW_SLIST_in_block253); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:58:17: ( variable )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==VAR) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:58:17: variable
                	    {
                	    pushFollow(FOLLOW_variable_in_block255);
                	    variable();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);

                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:58:27: ( stat )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==FCALL||(LA5_0>=SLIST && LA5_0<=INT)||(LA5_0>=21 && LA5_0<=27)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:58:27: stat
                	    {
                	    pushFollow(FOLLOW_stat_in_block258);
                	    stat();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

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
    // $ANTLR end "block"


    // $ANTLR start "stat"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:61:1: stat : ( forStat | expr | block | assignStat | keywords );
    public final void stat() throws RecognitionException {
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:61:5: ( forStat | expr | block | assignStat | keywords )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case FCALL:
            case ID:
            case INT:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt6=2;
                }
                break;
            case SLIST:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:61:7: forStat
                    {
                    pushFollow(FOLLOW_forStat_in_stat272);
                    forStat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:62:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_stat280);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:63:7: block
                    {
                    pushFollow(FOLLOW_block_in_stat288);
                    block();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:64:7: assignStat
                    {
                    pushFollow(FOLLOW_assignStat_in_stat296);
                    assignStat();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:65:7: keywords
                    {
                    pushFollow(FOLLOW_keywords_in_stat304);
                    keywords();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "stat"


    // $ANTLR start "keywords"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:68:1: keywords : 'toon' expr ;
    public final void keywords() throws RecognitionException {
        Type expr7 = null;


        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:68:9: ( 'toon' expr )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:68:11: 'toon' expr
            {
            match(input,21,FOLLOW_21_in_keywords320); 
            pushFollow(FOLLOW_expr_in_keywords322);
            expr7=expr();

            state._fsp--;

             System.out.print(expr7); 

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
    // $ANTLR end "keywords"


    // $ANTLR start "forStat"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:71:1: forStat : ^( 'for' assignStat expr assignStat block ) ;
    public final void forStat() throws RecognitionException {
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:72:5: ( ^( 'for' assignStat expr assignStat block ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:72:9: ^( 'for' assignStat expr assignStat block )
            {
            match(input,22,FOLLOW_22_in_forStat350); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_assignStat_in_forStat352);
            assignStat();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_forStat354);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_assignStat_in_forStat356);
            assignStat();

            state._fsp--;

            pushFollow(FOLLOW_block_in_forStat358);
            block();

            state._fsp--;


            match(input, Token.UP, null); 

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
    // $ANTLR end "forStat"


    // $ANTLR start "assignStat"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:75:1: assignStat : ^( '=' ID expr ) ;
    public final void assignStat() throws RecognitionException {
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:76:5: ( ^( '=' ID expr ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:76:9: ^( '=' ID expr )
            {
            match(input,23,FOLLOW_23_in_assignStat379); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_assignStat381); 
            pushFollow(FOLLOW_expr_in_assignStat383);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 

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
    // $ANTLR end "assignStat"


    // $ANTLR start "expr"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:81:1: expr returns [Type value] : ( ^( '==' expr expr ) | ^( '!=' expr expr ) | ^( '+' e= expr e2= expr ) | ^( '*' expr expr ) | ID | ^( FCALL ID ( expr )* ) | INT );
    public final Type expr() throws RecognitionException {
        Type value = null;

        CommonTree ID8=null;
        CommonTree INT9=null;
        Type e = null;

        Type e2 = null;


        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:82:5: ( ^( '==' expr expr ) | ^( '!=' expr expr ) | ^( '+' e= expr e2= expr ) | ^( '*' expr expr ) | ID | ^( FCALL ID ( expr )* ) | INT )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case ID:
                {
                alt8=5;
                }
                break;
            case FCALL:
                {
                alt8=6;
                }
                break;
            case INT:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:82:9: ^( '==' expr expr )
                    {
                    match(input,24,FOLLOW_24_in_expr410); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr412);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr414);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:83:9: ^( '!=' expr expr )
                    {
                    match(input,25,FOLLOW_25_in_expr426); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr428);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr430);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:84:9: ^( '+' e= expr e2= expr )
                    {
                    match(input,26,FOLLOW_26_in_expr442); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr446);
                    e=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr450);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     System.out.print(e.sum_operator(e2).toType()); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:85:9: ^( '*' expr expr )
                    {
                    match(input,27,FOLLOW_27_in_expr465); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr467);
                    expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr469);
                    expr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:86:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_expr480); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:87:9: ^( FCALL ID ( expr )* )
                    {
                    match(input,FCALL,FOLLOW_FCALL_in_expr491); 

                    match(input, Token.DOWN, null); 
                    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_expr493); 
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:87:20: ( expr )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==FCALL||(LA7_0>=ID && LA7_0<=INT)||(LA7_0>=24 && LA7_0<=27)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:87:20: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_expr495);
                    	    expr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     if (this.fList.containsKey((ID8!=null?ID8.getText():null))) {
                                                System.out.print("Found it!");
                                                } else {
                                                System.out.print("Not found!");
                                                }  

                    }
                    break;
                case 7 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\GrammarWalker.g:92:9: INT
                    {
                    INT9=(CommonTree)match(input,INT,FOLLOW_INT_in_expr509); 
                     value = CollType.newType(Integer.parseInt((INT9!=null?INT9.getText():null))); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_program53 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_variable_in_declaration73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variable103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_variable105 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_variable107 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_variable109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_function176 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_function178 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_formalParameter_in_function183 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_block_in_function189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_formalParameter224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_formalParameter226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_formalParameter228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SLIST_in_block253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_block255 = new BitSet(new long[]{0x000000000FE007D8L});
    public static final BitSet FOLLOW_stat_in_block258 = new BitSet(new long[]{0x000000000FE007C8L});
    public static final BitSet FOLLOW_forStat_in_stat272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keywords_in_stat304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_keywords320 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_keywords322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_forStat350 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignStat_in_forStat352 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_forStat354 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_assignStat_in_forStat356 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_block_in_forStat358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_23_in_assignStat379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignStat381 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_assignStat383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_expr410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr412 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_expr414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_25_in_expr426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr428 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_26_in_expr442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr446 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_expr450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_27_in_expr465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr467 = new BitSet(new long[]{0x000000000F000640L});
    public static final BitSet FOLLOW_expr_in_expr469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCALL_in_expr491 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr493 = new BitSet(new long[]{0x000000000F000648L});
    public static final BitSet FOLLOW_expr_in_expr495 = new BitSet(new long[]{0x000000000F000648L});
    public static final BitSet FOLLOW_INT_in_expr509 = new BitSet(new long[]{0x0000000000000002L});

}