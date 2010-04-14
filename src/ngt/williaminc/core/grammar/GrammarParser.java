// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g 2010-04-14 20:36:17
 package ngt.williaminc.core.grammar; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

/**  Recognize and build trees for C-
 *   Results in CMinusParser.java, CMinusLexer.java,
 *   and the token definition file CMinus.tokens used by
 *   the tree grammar to ensure token types are the same.
 */
public class GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "FUNC", "FCALL", "ARG", "SLIST", "ID", "INT", "WS", "'is'", "';'", "'nummer'", "'lijst'", "'('", "','", "')'", "'{'", "'}'", "'toon'", "'for'", "'='", "'=='", "'!='", "'+'", "'*'"
    };
    public static final int FCALL=6;
    public static final int T__27=27;
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
    public static final int ARG=7;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int FUNC=5;
    public static final int T__13=13;
    public static final int SLIST=8;
    public static final int VAR=4;

    // delegates
    // delegators


        public GrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:26:1: program : ( declaration )+ ;
    public final GrammarParser.program_return program() throws RecognitionException {
        GrammarParser.program_return retval = new GrammarParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GrammarParser.declaration_return declaration1 = null;



        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:27:5: ( ( declaration )+ )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:27:9: ( declaration )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:27:9: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:27:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program86);
            	    declaration1=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration1.getTree());

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

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:30:1: declaration : ( variable | function );
    public final GrammarParser.declaration_return declaration() throws RecognitionException {
        GrammarParser.declaration_return retval = new GrammarParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GrammarParser.variable_return variable2 = null;

        GrammarParser.function_return function3 = null;



        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:31:5: ( variable | function )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==12) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==16) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:31:9: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_declaration106);
                    variable2=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:32:9: function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_in_declaration116);
                    function3=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:35:1: variable : type ID 'is' expr ';' -> ^( VAR type ID expr ) ;
    public final GrammarParser.variable_return variable() throws RecognitionException {
        GrammarParser.variable_return retval = new GrammarParser.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID5=null;
        Token string_literal6=null;
        Token char_literal8=null;
        GrammarParser.type_return type4 = null;

        GrammarParser.expr_return expr7 = null;


        Object ID5_tree=null;
        Object string_literal6_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_12=new RewriteRuleTokenStream(adaptor,"token 12");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:36:5: ( type ID 'is' expr ';' -> ^( VAR type ID expr ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:36:9: type ID 'is' expr ';'
            {
            pushFollow(FOLLOW_type_in_variable135);
            type4=type();

            state._fsp--;

            stream_type.add(type4.getTree());
            ID5=(Token)match(input,ID,FOLLOW_ID_in_variable137);  
            stream_ID.add(ID5);

            string_literal6=(Token)match(input,12,FOLLOW_12_in_variable139);  
            stream_12.add(string_literal6);

            pushFollow(FOLLOW_expr_in_variable141);
            expr7=expr();

            state._fsp--;

            stream_expr.add(expr7.getTree());
            char_literal8=(Token)match(input,13,FOLLOW_13_in_variable143);  
            stream_13.add(char_literal8);



            // AST REWRITE
            // elements: type, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:31: -> ^( VAR type ID expr )
            {
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:36:34: ^( VAR type ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:39:1: type : ( 'nummer' | 'lijst' );
    public final GrammarParser.type_return type() throws RecognitionException {
        GrammarParser.type_return retval = new GrammarParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;

        Object set9_tree=null;

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:39:5: ( 'nummer' | 'lijst' )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=14 && input.LA(1)<=15) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set9));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:46:1: function : type ID '(' ( formalParameter ( ',' formalParameter )* )? ')' block -> ^( FUNC type ID ( formalParameter )* block ) ;
    public final GrammarParser.function_return function() throws RecognitionException {
        GrammarParser.function_return retval = new GrammarParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID11=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal16=null;
        GrammarParser.type_return type10 = null;

        GrammarParser.formalParameter_return formalParameter13 = null;

        GrammarParser.formalParameter_return formalParameter15 = null;

        GrammarParser.block_return block17 = null;


        Object ID11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_formalParameter=new RewriteRuleSubtreeStream(adaptor,"rule formalParameter");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:47:5: ( type ID '(' ( formalParameter ( ',' formalParameter )* )? ')' block -> ^( FUNC type ID ( formalParameter )* block ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:47:9: type ID '(' ( formalParameter ( ',' formalParameter )* )? ')' block
            {
            pushFollow(FOLLOW_type_in_function202);
            type10=type();

            state._fsp--;

            stream_type.add(type10.getTree());
            ID11=(Token)match(input,ID,FOLLOW_ID_in_function204);  
            stream_ID.add(ID11);

            char_literal12=(Token)match(input,16,FOLLOW_16_in_function214);  
            stream_16.add(char_literal12);

            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:48:13: ( formalParameter ( ',' formalParameter )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:48:15: formalParameter ( ',' formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_function218);
                    formalParameter13=formalParameter();

                    state._fsp--;

                    stream_formalParameter.add(formalParameter13.getTree());
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:48:31: ( ',' formalParameter )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:48:32: ',' formalParameter
                    	    {
                    	    char_literal14=(Token)match(input,17,FOLLOW_17_in_function221);  
                    	    stream_17.add(char_literal14);

                    	    pushFollow(FOLLOW_formalParameter_in_function223);
                    	    formalParameter15=formalParameter();

                    	    state._fsp--;

                    	    stream_formalParameter.add(formalParameter15.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal16=(Token)match(input,18,FOLLOW_18_in_function231);  
            stream_18.add(char_literal16);

            pushFollow(FOLLOW_block_in_function241);
            block17=block();

            state._fsp--;

            stream_block.add(block17.getTree());


            // AST REWRITE
            // elements: type, block, ID, formalParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:9: -> ^( FUNC type ID ( formalParameter )* block )
            {
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:50:12: ^( FUNC type ID ( formalParameter )* block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:50:27: ( formalParameter )*
                while ( stream_formalParameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameter.nextTree());

                }
                stream_formalParameter.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class formalParameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameter"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:53:1: formalParameter : type ID -> ^( ARG type ID ) ;
    public final GrammarParser.formalParameter_return formalParameter() throws RecognitionException {
        GrammarParser.formalParameter_return retval = new GrammarParser.formalParameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID19=null;
        GrammarParser.type_return type18 = null;


        Object ID19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:54:5: ( type ID -> ^( ARG type ID ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:54:9: type ID
            {
            pushFollow(FOLLOW_type_in_formalParameter283);
            type18=type();

            state._fsp--;

            stream_type.add(type18.getTree());
            ID19=(Token)match(input,ID,FOLLOW_ID_in_formalParameter285);  
            stream_ID.add(ID19);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:17: -> ^( ARG type ID )
            {
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:54:20: ^( ARG type ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG, "ARG"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:60:1: block : lc= '{' ( variable )* ( stat )* '}' -> ^( SLIST[$lc,\"SLIST\"] ( variable )* ( stat )* ) ;
    public final GrammarParser.block_return block() throws RecognitionException {
        GrammarParser.block_return retval = new GrammarParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lc=null;
        Token char_literal22=null;
        GrammarParser.variable_return variable20 = null;

        GrammarParser.stat_return stat21 = null;


        Object lc_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:61:5: (lc= '{' ( variable )* ( stat )* '}' -> ^( SLIST[$lc,\"SLIST\"] ( variable )* ( stat )* ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:61:9: lc= '{' ( variable )* ( stat )* '}'
            {
            lc=(Token)match(input,19,FOLLOW_19_in_block319);  
            stream_19.add(lc);

            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:61:16: ( variable )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=14 && LA5_0<=15)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:61:16: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_block321);
            	    variable20=variable();

            	    state._fsp--;

            	    stream_variable.add(variable20.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:61:26: ( stat )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ID && LA6_0<=INT)||LA6_0==13||LA6_0==16||LA6_0==19||(LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:61:26: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_block324);
            	    stat21=stat();

            	    state._fsp--;

            	    stream_stat.add(stat21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal22=(Token)match(input,20,FOLLOW_20_in_block327);  
            stream_20.add(char_literal22);



            // AST REWRITE
            // elements: stat, variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:9: -> ^( SLIST[$lc,\"SLIST\"] ( variable )* ( stat )* )
            {
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:62:12: ^( SLIST[$lc,\"SLIST\"] ( variable )* ( stat )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SLIST, lc, "SLIST"), root_1);

                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:62:33: ( variable )*
                while ( stream_variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_variable.nextTree());

                }
                stream_variable.reset();
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:62:43: ( stat )*
                while ( stream_stat.hasNext() ) {
                    adaptor.addChild(root_1, stream_stat.nextTree());

                }
                stream_stat.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class stat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stat"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:65:1: stat : ( forStat | expr ';' | block | assignStat ';' | ';' | keywords );
    public final GrammarParser.stat_return stat() throws RecognitionException {
        GrammarParser.stat_return retval = new GrammarParser.stat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal25=null;
        Token char_literal28=null;
        Token char_literal29=null;
        GrammarParser.forStat_return forStat23 = null;

        GrammarParser.expr_return expr24 = null;

        GrammarParser.block_return block26 = null;

        GrammarParser.assignStat_return assignStat27 = null;

        GrammarParser.keywords_return keywords30 = null;


        Object char_literal25_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:65:5: ( forStat | expr ';' | block | assignStat ';' | ';' | keywords )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case INT:
            case 16:
                {
                alt7=2;
                }
                break;
            case ID:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==16) ) {
                    alt7=2;
                }
                else if ( (LA7_3==23) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 13:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:65:7: forStat
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStat_in_stat360);
                    forStat23=forStat();

                    state._fsp--;

                    adaptor.addChild(root_0, forStat23.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:66:7: expr ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_stat368);
                    expr24=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr24.getTree());
                    char_literal25=(Token)match(input,13,FOLLOW_13_in_stat370); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:67:7: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_stat379);
                    block26=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block26.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:68:7: assignStat ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignStat_in_stat387);
                    assignStat27=assignStat();

                    state._fsp--;

                    adaptor.addChild(root_0, assignStat27.getTree());
                    char_literal28=(Token)match(input,13,FOLLOW_13_in_stat389); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:69:7: ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal29=(Token)match(input,13,FOLLOW_13_in_stat398); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:70:7: keywords
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keywords_in_stat407);
                    keywords30=keywords();

                    state._fsp--;

                    adaptor.addChild(root_0, keywords30.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stat"

    public static class keywords_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keywords"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:73:1: keywords : 'toon' expr ;
    public final GrammarParser.keywords_return keywords() throws RecognitionException {
        GrammarParser.keywords_return retval = new GrammarParser.keywords_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31=null;
        GrammarParser.expr_return expr32 = null;


        Object string_literal31_tree=null;

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:73:9: ( 'toon' expr )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:73:11: 'toon' expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal31=(Token)match(input,21,FOLLOW_21_in_keywords423); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_expr_in_keywords425);
            expr32=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr32.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keywords"

    public static class forStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStat"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:76:1: forStat : 'for' '(' first= assignStat ';' expr ';' inc= assignStat ')' block -> ^( 'for' $first expr $inc block ) ;
    public final GrammarParser.forStat_return forStat() throws RecognitionException {
        GrammarParser.forStat_return retval = new GrammarParser.forStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Token char_literal38=null;
        GrammarParser.assignStat_return first = null;

        GrammarParser.assignStat_return inc = null;

        GrammarParser.expr_return expr36 = null;

        GrammarParser.block_return block39 = null;


        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleSubtreeStream stream_assignStat=new RewriteRuleSubtreeStream(adaptor,"rule assignStat");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:77:5: ( 'for' '(' first= assignStat ';' expr ';' inc= assignStat ')' block -> ^( 'for' $first expr $inc block ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:77:9: 'for' '(' first= assignStat ';' expr ';' inc= assignStat ')' block
            {
            string_literal33=(Token)match(input,22,FOLLOW_22_in_forStat448);  
            stream_22.add(string_literal33);

            char_literal34=(Token)match(input,16,FOLLOW_16_in_forStat450);  
            stream_16.add(char_literal34);

            pushFollow(FOLLOW_assignStat_in_forStat454);
            first=assignStat();

            state._fsp--;

            stream_assignStat.add(first.getTree());
            char_literal35=(Token)match(input,13,FOLLOW_13_in_forStat456);  
            stream_13.add(char_literal35);

            pushFollow(FOLLOW_expr_in_forStat458);
            expr36=expr();

            state._fsp--;

            stream_expr.add(expr36.getTree());
            char_literal37=(Token)match(input,13,FOLLOW_13_in_forStat460);  
            stream_13.add(char_literal37);

            pushFollow(FOLLOW_assignStat_in_forStat464);
            inc=assignStat();

            state._fsp--;

            stream_assignStat.add(inc.getTree());
            char_literal38=(Token)match(input,18,FOLLOW_18_in_forStat466);  
            stream_18.add(char_literal38);

            pushFollow(FOLLOW_block_in_forStat468);
            block39=block();

            state._fsp--;

            stream_block.add(block39.getTree());


            // AST REWRITE
            // elements: inc, 22, expr, first, block
            // token labels: 
            // rule labels: retval, inc, first
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_inc=new RewriteRuleSubtreeStream(adaptor,"rule inc",inc!=null?inc.tree:null);
            RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.tree:null);

            root_0 = (Object)adaptor.nil();
            // 78:9: -> ^( 'for' $first expr $inc block )
            {
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:78:12: ^( 'for' $first expr $inc block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_22.nextNode(), root_1);

                adaptor.addChild(root_1, stream_first.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_inc.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStat"

    public static class assignStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignStat"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:81:1: assignStat : ID '=' expr -> ^( '=' ID expr ) ;
    public final GrammarParser.assignStat_return assignStat() throws RecognitionException {
        GrammarParser.assignStat_return retval = new GrammarParser.assignStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID40=null;
        Token char_literal41=null;
        GrammarParser.expr_return expr42 = null;


        Object ID40_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:82:5: ( ID '=' expr -> ^( '=' ID expr ) )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:82:9: ID '=' expr
            {
            ID40=(Token)match(input,ID,FOLLOW_ID_in_assignStat511);  
            stream_ID.add(ID40);

            char_literal41=(Token)match(input,23,FOLLOW_23_in_assignStat513);  
            stream_23.add(char_literal41);

            pushFollow(FOLLOW_expr_in_assignStat515);
            expr42=expr();

            state._fsp--;

            stream_expr.add(expr42.getTree());


            // AST REWRITE
            // elements: 23, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:21: -> ^( '=' ID expr )
            {
                // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:82:24: ^( '=' ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_23.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignStat"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:87:1: expr : condExpr ;
    public final GrammarParser.expr_return expr() throws RecognitionException {
        GrammarParser.expr_return retval = new GrammarParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GrammarParser.condExpr_return condExpr43 = null;



        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:87:5: ( condExpr )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:87:9: condExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_expr541);
            condExpr43=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr43.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class condExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpr"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:89:1: condExpr : aexpr ( ( '==' | '!=' ) aexpr )? ;
    public final GrammarParser.condExpr_return condExpr() throws RecognitionException {
        GrammarParser.condExpr_return retval = new GrammarParser.condExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal45=null;
        Token string_literal46=null;
        GrammarParser.aexpr_return aexpr44 = null;

        GrammarParser.aexpr_return aexpr47 = null;


        Object string_literal45_tree=null;
        Object string_literal46_tree=null;

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:5: ( aexpr ( ( '==' | '!=' ) aexpr )? )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:9: aexpr ( ( '==' | '!=' ) aexpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpr556);
            aexpr44=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, aexpr44.getTree());
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:15: ( ( '==' | '!=' ) aexpr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:17: ( '==' | '!=' ) aexpr
                    {
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:17: ( '==' | '!=' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==25) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:18: '=='
                            {
                            string_literal45=(Token)match(input,24,FOLLOW_24_in_condExpr561); 
                            string_literal45_tree = (Object)adaptor.create(string_literal45);
                            root_0 = (Object)adaptor.becomeRoot(string_literal45_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:90:24: '!='
                            {
                            string_literal46=(Token)match(input,25,FOLLOW_25_in_condExpr564); 
                            string_literal46_tree = (Object)adaptor.create(string_literal46);
                            root_0 = (Object)adaptor.becomeRoot(string_literal46_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_aexpr_in_condExpr568);
                    aexpr47=aexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, aexpr47.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:93:1: aexpr : mexpr ( '+' mexpr )* ;
    public final GrammarParser.aexpr_return aexpr() throws RecognitionException {
        GrammarParser.aexpr_return retval = new GrammarParser.aexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal49=null;
        GrammarParser.mexpr_return mexpr48 = null;

        GrammarParser.mexpr_return mexpr50 = null;


        Object char_literal49_tree=null;

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:94:5: ( mexpr ( '+' mexpr )* )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:94:9: mexpr ( '+' mexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr590);
            mexpr48=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, mexpr48.getTree());
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:94:15: ( '+' mexpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:94:16: '+' mexpr
            	    {
            	    char_literal49=(Token)match(input,26,FOLLOW_26_in_aexpr593); 
            	    char_literal49_tree = (Object)adaptor.create(char_literal49);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal49_tree, root_0);

            	    pushFollow(FOLLOW_mexpr_in_aexpr596);
            	    mexpr50=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mexpr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:97:1: mexpr : atom ( '*' atom )* ;
    public final GrammarParser.mexpr_return mexpr() throws RecognitionException {
        GrammarParser.mexpr_return retval = new GrammarParser.mexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal52=null;
        GrammarParser.atom_return atom51 = null;

        GrammarParser.atom_return atom53 = null;


        Object char_literal52_tree=null;

        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:98:5: ( atom ( '*' atom )* )
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:98:9: atom ( '*' atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_mexpr617);
            atom51=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom51.getTree());
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:98:14: ( '*' atom )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:98:15: '*' atom
            	    {
            	    char_literal52=(Token)match(input,27,FOLLOW_27_in_mexpr620); 
            	    char_literal52_tree = (Object)adaptor.create(char_literal52);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal52_tree, root_0);

            	    pushFollow(FOLLOW_atom_in_mexpr623);
            	    atom53=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom53.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:101:1: atom : ( INT | '(' expr ')' -> expr | ID '(' ( expr ( ',' expr )* )? ')' -> ^( FCALL ID ( expr )* ) );
    public final GrammarParser.atom_return atom() throws RecognitionException {
        GrammarParser.atom_return retval = new GrammarParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token ID58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        GrammarParser.expr_return expr56 = null;

        GrammarParser.expr_return expr60 = null;

        GrammarParser.expr_return expr62 = null;


        Object INT54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object ID58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:101:5: ( INT | '(' expr ')' -> expr | ID '(' ( expr ( ',' expr )* )? ')' -> ^( FCALL ID ( expr )* ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt14=1;
                }
                break;
            case 16:
                {
                alt14=2;
                }
                break;
            case ID:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:102:8: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT54=(Token)match(input,INT,FOLLOW_INT_in_atom647); 
                    INT54_tree = (Object)adaptor.create(INT54);
                    adaptor.addChild(root_0, INT54_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:103:9: '(' expr ')'
                    {
                    char_literal55=(Token)match(input,16,FOLLOW_16_in_atom657);  
                    stream_16.add(char_literal55);

                    pushFollow(FOLLOW_expr_in_atom659);
                    expr56=expr();

                    state._fsp--;

                    stream_expr.add(expr56.getTree());
                    char_literal57=(Token)match(input,18,FOLLOW_18_in_atom661);  
                    stream_18.add(char_literal57);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 103:22: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:9: ID '(' ( expr ( ',' expr )* )? ')'
                    {
                    ID58=(Token)match(input,ID,FOLLOW_ID_in_atom675);  
                    stream_ID.add(ID58);

                    char_literal59=(Token)match(input,16,FOLLOW_16_in_atom677);  
                    stream_16.add(char_literal59);

                    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:16: ( expr ( ',' expr )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=ID && LA13_0<=INT)||LA13_0==16) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:17: expr ( ',' expr )*
                            {
                            pushFollow(FOLLOW_expr_in_atom680);
                            expr60=expr();

                            state._fsp--;

                            stream_expr.add(expr60.getTree());
                            // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:22: ( ',' expr )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==17) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:23: ',' expr
                            	    {
                            	    char_literal61=(Token)match(input,17,FOLLOW_17_in_atom683);  
                            	    stream_17.add(char_literal61);

                            	    pushFollow(FOLLOW_expr_in_atom685);
                            	    expr62=expr();

                            	    state._fsp--;

                            	    stream_expr.add(expr62.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal63=(Token)match(input,18,FOLLOW_18_in_atom691);  
                    stream_18.add(char_literal63);



                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:41: -> ^( FCALL ID ( expr )* )
                    {
                        // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:44: ^( FCALL ID ( expr )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FCALL, "FCALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Doorn\\workspace\\NGT\\src\\ngt\\williaminc\\core\\grammar\\Grammar.g:104:55: ( expr )*
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_program86 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_variable_in_declaration106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable135 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_variable137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_variable139 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_expr_in_variable141 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_variable143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function202 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_function204 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_function214 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_formalParameter_in_function218 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_function221 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_formalParameter_in_function223 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_function231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_function241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter283 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_formalParameter285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_block319 = new BitSet(new long[]{0x000000000079E600L});
    public static final BitSet FOLLOW_variable_in_block321 = new BitSet(new long[]{0x000000000079E600L});
    public static final BitSet FOLLOW_stat_in_block324 = new BitSet(new long[]{0x0000000000792600L});
    public static final BitSet FOLLOW_20_in_block327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat368 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat387 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_stat389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_stat398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keywords_in_stat407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_keywords423 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_expr_in_keywords425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_forStat448 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_forStat450 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_assignStat_in_forStat454 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_forStat456 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_expr_in_forStat458 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_forStat460 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_assignStat_in_forStat464 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_forStat466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_forStat468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignStat511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_assignStat513 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_expr_in_assignStat515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr556 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_condExpr561 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_25_in_condExpr564 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_aexpr_in_condExpr568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr590 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_aexpr593 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_mexpr_in_aexpr596 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_atom_in_mexpr617 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_mexpr620 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_atom_in_mexpr623 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_INT_in_atom647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_atom657 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_expr_in_atom659 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_atom661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom675 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom677 = new BitSet(new long[]{0x0000000000050600L});
    public static final BitSet FOLLOW_expr_in_atom680 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_atom683 = new BitSet(new long[]{0x0000000000010600L});
    public static final BitSet FOLLOW_expr_in_atom685 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_atom691 = new BitSet(new long[]{0x0000000000000002L});

}