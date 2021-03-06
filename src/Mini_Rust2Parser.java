// $ANTLR 3.3 Nov 30, 2010 12:50:56 Mini_Rust2.g 2018-05-17 13:30:24

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Mini_Rust2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FICHIER", "ARGUMENT", "ARGUMENTS", "DECL_STRUCT", "APPEL_FCT", "TYPE", "BLOC", "CST_OU_AFF", "VAR", "IF", "POINTEUR_VAL", "POINTEUR", "WHILE", "CONDITION", "FOR", "LEN", "VEC", "PRINT", "ELSE", "RETURN", "ATTRIBUT", "DECL_VAR", "DECL_VAR_MUT", "DECL_FCT", "DECL_VEC", "VAL_ATTRIBUT", "ACCES_VEC", "ACCES_ATTRIBUT", "PARAM_FCT", "STRUCT", "IDF", "CST_ENT", "WS", "'struct'", "'{'", "','", "'}'", "':'", "'fn'", "'('", "')'", "'->'", "'Vec'", "'<'", "'>'", "'&'", "'i32'", "'bool'", "';'", "'let'", "'return'", "'print'", "'!'", "'='", "'while'", "'mut'", "'if'", "'else'", "'['", "']'", "'.'", "'true'", "'false'", "'*'", "'len'", "'-'", "'/'", "'+'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'/*'", "'*/'"
    };
    public static final int EOF=-1;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int FICHIER=4;
    public static final int ARGUMENT=5;
    public static final int ARGUMENTS=6;
    public static final int DECL_STRUCT=7;
    public static final int APPEL_FCT=8;
    public static final int TYPE=9;
    public static final int BLOC=10;
    public static final int CST_OU_AFF=11;
    public static final int VAR=12;
    public static final int IF=13;
    public static final int POINTEUR_VAL=14;
    public static final int POINTEUR=15;
    public static final int WHILE=16;
    public static final int CONDITION=17;
    public static final int FOR=18;
    public static final int LEN=19;
    public static final int VEC=20;
    public static final int PRINT=21;
    public static final int ELSE=22;
    public static final int RETURN=23;
    public static final int ATTRIBUT=24;
    public static final int DECL_VAR=25;
    public static final int DECL_VAR_MUT=26;
    public static final int DECL_FCT=27;
    public static final int DECL_VEC=28;
    public static final int VAL_ATTRIBUT=29;
    public static final int ACCES_VEC=30;
    public static final int ACCES_ATTRIBUT=31;
    public static final int PARAM_FCT=32;
    public static final int STRUCT=33;
    public static final int IDF=34;
    public static final int CST_ENT=35;
    public static final int WS=36;

    // delegates
    // delegators


        public Mini_Rust2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Mini_Rust2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Mini_Rust2Parser.tokenNames; }
    public String getGrammarFileName() { return "Mini_Rust2.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // Mini_Rust2.g:53:1: prog : ( comm )? fichier EOF -> ^( FICHIER fichier ) ;
    public final Mini_Rust2Parser.prog_return prog() throws RecognitionException {
        Mini_Rust2Parser.prog_return retval = new Mini_Rust2Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF3=null;
        Mini_Rust2Parser.comm_return comm1 = null;

        Mini_Rust2Parser.fichier_return fichier2 = null;


        CommonTree EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_fichier=new RewriteRuleSubtreeStream(adaptor,"rule fichier");
        try {
            // Mini_Rust2.g:53:6: ( ( comm )? fichier EOF -> ^( FICHIER fichier ) )
            // Mini_Rust2.g:53:9: ( comm )? fichier EOF
            {
            // Mini_Rust2.g:53:9: ( comm )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==78) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Mini_Rust2.g:53:9: comm
                    {
                    pushFollow(FOLLOW_comm_in_prog262);
                    comm1=comm();

                    state._fsp--;

                    stream_comm.add(comm1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_fichier_in_prog265);
            fichier2=fichier();

            state._fsp--;

            stream_fichier.add(fichier2.getTree());
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog267);  
            stream_EOF.add(EOF3);



            // AST REWRITE
            // elements: fichier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 53:27: -> ^( FICHIER fichier )
            {
                // Mini_Rust2.g:53:30: ^( FICHIER fichier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FICHIER, "FICHIER"), root_1);

                adaptor.addChild(root_1, stream_fichier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class fichier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fichier"
    // Mini_Rust2.g:56:1: fichier : ( decl )* ;
    public final Mini_Rust2Parser.fichier_return fichier() throws RecognitionException {
        Mini_Rust2Parser.fichier_return retval = new Mini_Rust2Parser.fichier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.decl_return decl4 = null;



        try {
            // Mini_Rust2.g:56:9: ( ( decl )* )
            // Mini_Rust2.g:56:11: ( decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Mini_Rust2.g:56:11: ( decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==37||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Mini_Rust2.g:56:11: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_fichier289);
            	    decl4=decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decl4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fichier"

    public static class decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // Mini_Rust2.g:59:1: decl : ( decl_struct | decl_fun );
    public final Mini_Rust2Parser.decl_return decl() throws RecognitionException {
        Mini_Rust2Parser.decl_return retval = new Mini_Rust2Parser.decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.decl_struct_return decl_struct5 = null;

        Mini_Rust2Parser.decl_fun_return decl_fun6 = null;



        try {
            // Mini_Rust2.g:59:6: ( decl_struct | decl_fun )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Mini_Rust2.g:59:8: decl_struct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decl_struct_in_decl307);
                    decl_struct5=decl_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_struct5.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:60:8: decl_fun
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decl_fun_in_decl316);
                    decl_fun6=decl_fun();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_fun6.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl"

    public static class decl_struct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_struct"
    // Mini_Rust2.g:63:1: decl_struct : 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( attribut ( ',' ( comm )? attribut )* )? '}' ( comm )? -> ^( DECL_STRUCT IDF ^( BLOC ( attribut )* ) ) ;
    public final Mini_Rust2Parser.decl_struct_return decl_struct() throws RecognitionException {
        Mini_Rust2Parser.decl_struct_return retval = new Mini_Rust2Parser.decl_struct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal7=null;
        Token IDF9=null;
        Token char_literal11=null;
        Token char_literal14=null;
        Token char_literal17=null;
        Mini_Rust2Parser.comm_return comm8 = null;

        Mini_Rust2Parser.comm_return comm10 = null;

        Mini_Rust2Parser.comm_return comm12 = null;

        Mini_Rust2Parser.attribut_return attribut13 = null;

        Mini_Rust2Parser.comm_return comm15 = null;

        Mini_Rust2Parser.attribut_return attribut16 = null;

        Mini_Rust2Parser.comm_return comm18 = null;


        CommonTree string_literal7_tree=null;
        CommonTree IDF9_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_attribut=new RewriteRuleSubtreeStream(adaptor,"rule attribut");
        try {
            // Mini_Rust2.g:63:13: ( 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( attribut ( ',' ( comm )? attribut )* )? '}' ( comm )? -> ^( DECL_STRUCT IDF ^( BLOC ( attribut )* ) ) )
            // Mini_Rust2.g:63:15: 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( attribut ( ',' ( comm )? attribut )* )? '}' ( comm )?
            {
            string_literal7=(Token)match(input,37,FOLLOW_37_in_decl_struct330);  
            stream_37.add(string_literal7);

            // Mini_Rust2.g:63:24: ( comm )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==78) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Mini_Rust2.g:63:24: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct332);
                    comm8=comm();

                    state._fsp--;

                    stream_comm.add(comm8.getTree());

                    }
                    break;

            }

            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct335);  
            stream_IDF.add(IDF9);

            // Mini_Rust2.g:63:34: ( comm )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==78) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Mini_Rust2.g:63:34: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct337);
                    comm10=comm();

                    state._fsp--;

                    stream_comm.add(comm10.getTree());

                    }
                    break;

            }

            char_literal11=(Token)match(input,38,FOLLOW_38_in_decl_struct340);  
            stream_38.add(char_literal11);

            // Mini_Rust2.g:63:44: ( comm )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==78) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Mini_Rust2.g:63:44: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct342);
                    comm12=comm();

                    state._fsp--;

                    stream_comm.add(comm12.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:63:50: ( attribut ( ',' ( comm )? attribut )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDF) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Mini_Rust2.g:63:51: attribut ( ',' ( comm )? attribut )*
                    {
                    pushFollow(FOLLOW_attribut_in_decl_struct346);
                    attribut13=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut13.getTree());
                    // Mini_Rust2.g:63:60: ( ',' ( comm )? attribut )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==39) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Mini_Rust2.g:63:61: ',' ( comm )? attribut
                    	    {
                    	    char_literal14=(Token)match(input,39,FOLLOW_39_in_decl_struct349);  
                    	    stream_39.add(char_literal14);

                    	    // Mini_Rust2.g:63:65: ( comm )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==78) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // Mini_Rust2.g:63:65: comm
                    	            {
                    	            pushFollow(FOLLOW_comm_in_decl_struct351);
                    	            comm15=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm15.getTree());

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_attribut_in_decl_struct354);
                    	    attribut16=attribut();

                    	    state._fsp--;

                    	    stream_attribut.add(attribut16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal17=(Token)match(input,40,FOLLOW_40_in_decl_struct361);  
            stream_40.add(char_literal17);

            // Mini_Rust2.g:63:89: ( comm )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==78) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Mini_Rust2.g:63:89: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct363);
                    comm18=comm();

                    state._fsp--;

                    stream_comm.add(comm18.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: IDF, attribut
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 63:95: -> ^( DECL_STRUCT IDF ^( BLOC ( attribut )* ) )
            {
                // Mini_Rust2.g:63:98: ^( DECL_STRUCT IDF ^( BLOC ( attribut )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_STRUCT, "DECL_STRUCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Mini_Rust2.g:63:116: ^( BLOC ( attribut )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_2);

                // Mini_Rust2.g:63:123: ( attribut )*
                while ( stream_attribut.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribut.nextTree());

                }
                stream_attribut.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl_struct"

    public static class attribut_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribut"
    // Mini_Rust2.g:66:1: attribut : IDF ( comm )? ':' ( comm )? type -> ^( ATTRIBUT type IDF ) ;
    public final Mini_Rust2Parser.attribut_return attribut() throws RecognitionException {
        Mini_Rust2Parser.attribut_return retval = new Mini_Rust2Parser.attribut_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF19=null;
        Token char_literal21=null;
        Mini_Rust2Parser.comm_return comm20 = null;

        Mini_Rust2Parser.comm_return comm22 = null;

        Mini_Rust2Parser.type_return type23 = null;


        CommonTree IDF19_tree=null;
        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:66:10: ( IDF ( comm )? ':' ( comm )? type -> ^( ATTRIBUT type IDF ) )
            // Mini_Rust2.g:66:12: IDF ( comm )? ':' ( comm )? type
            {
            IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_attribut400);  
            stream_IDF.add(IDF19);

            // Mini_Rust2.g:66:16: ( comm )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==78) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Mini_Rust2.g:66:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_attribut402);
                    comm20=comm();

                    state._fsp--;

                    stream_comm.add(comm20.getTree());

                    }
                    break;

            }

            char_literal21=(Token)match(input,41,FOLLOW_41_in_attribut405);  
            stream_41.add(char_literal21);

            // Mini_Rust2.g:66:26: ( comm )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==78) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Mini_Rust2.g:66:26: comm
                    {
                    pushFollow(FOLLOW_comm_in_attribut407);
                    comm22=comm();

                    state._fsp--;

                    stream_comm.add(comm22.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_attribut410);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());


            // AST REWRITE
            // elements: type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 66:37: -> ^( ATTRIBUT type IDF )
            {
                // Mini_Rust2.g:66:40: ^( ATTRIBUT type IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUT, "ATTRIBUT"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribut"

    public static class decl_fun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_fun"
    // Mini_Rust2.g:69:1: decl_fun : 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc -> ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc ) ;
    public final Mini_Rust2Parser.decl_fun_return decl_fun() throws RecognitionException {
        Mini_Rust2Parser.decl_fun_return retval = new Mini_Rust2Parser.decl_fun_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal24=null;
        Token IDF26=null;
        Token char_literal28=null;
        Token char_literal31=null;
        Token char_literal34=null;
        Token string_literal36=null;
        Mini_Rust2Parser.comm_return comm25 = null;

        Mini_Rust2Parser.comm_return comm27 = null;

        Mini_Rust2Parser.comm_return comm29 = null;

        Mini_Rust2Parser.argument_return argument30 = null;

        Mini_Rust2Parser.comm_return comm32 = null;

        Mini_Rust2Parser.argument_return argument33 = null;

        Mini_Rust2Parser.comm_return comm35 = null;

        Mini_Rust2Parser.comm_return comm37 = null;

        Mini_Rust2Parser.type_return type38 = null;

        Mini_Rust2Parser.bloc_return bloc39 = null;


        CommonTree string_literal24_tree=null;
        CommonTree IDF26_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree string_literal36_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:69:10: ( 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc -> ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc ) )
            // Mini_Rust2.g:69:12: 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc
            {
            string_literal24=(Token)match(input,42,FOLLOW_42_in_decl_fun438);  
            stream_42.add(string_literal24);

            // Mini_Rust2.g:69:17: ( comm )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==78) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Mini_Rust2.g:69:17: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun440);
                    comm25=comm();

                    state._fsp--;

                    stream_comm.add(comm25.getTree());

                    }
                    break;

            }

            IDF26=(Token)match(input,IDF,FOLLOW_IDF_in_decl_fun443);  
            stream_IDF.add(IDF26);

            // Mini_Rust2.g:69:27: ( comm )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==78) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Mini_Rust2.g:69:27: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun445);
                    comm27=comm();

                    state._fsp--;

                    stream_comm.add(comm27.getTree());

                    }
                    break;

            }

            char_literal28=(Token)match(input,43,FOLLOW_43_in_decl_fun448);  
            stream_43.add(char_literal28);

            // Mini_Rust2.g:69:37: ( comm )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==78) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Mini_Rust2.g:69:37: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun450);
                    comm29=comm();

                    state._fsp--;

                    stream_comm.add(comm29.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:69:43: ( argument ( ',' ( comm )? argument )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDF) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Mini_Rust2.g:69:44: argument ( ',' ( comm )? argument )*
                    {
                    pushFollow(FOLLOW_argument_in_decl_fun454);
                    argument30=argument();

                    state._fsp--;

                    stream_argument.add(argument30.getTree());
                    // Mini_Rust2.g:69:53: ( ',' ( comm )? argument )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==39) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Mini_Rust2.g:69:54: ',' ( comm )? argument
                    	    {
                    	    char_literal31=(Token)match(input,39,FOLLOW_39_in_decl_fun457);  
                    	    stream_39.add(char_literal31);

                    	    // Mini_Rust2.g:69:58: ( comm )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==78) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // Mini_Rust2.g:69:58: comm
                    	            {
                    	            pushFollow(FOLLOW_comm_in_decl_fun459);
                    	            comm32=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm32.getTree());

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_argument_in_decl_fun462);
                    	    argument33=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal34=(Token)match(input,44,FOLLOW_44_in_decl_fun468);  
            stream_44.add(char_literal34);

            // Mini_Rust2.g:69:81: ( comm )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==78) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Mini_Rust2.g:69:81: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun470);
                    comm35=comm();

                    state._fsp--;

                    stream_comm.add(comm35.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:69:87: ( '->' ( comm )? type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Mini_Rust2.g:69:88: '->' ( comm )? type
                    {
                    string_literal36=(Token)match(input,45,FOLLOW_45_in_decl_fun474);  
                    stream_45.add(string_literal36);

                    // Mini_Rust2.g:69:93: ( comm )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==78) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Mini_Rust2.g:69:93: comm
                            {
                            pushFollow(FOLLOW_comm_in_decl_fun476);
                            comm37=comm();

                            state._fsp--;

                            stream_comm.add(comm37.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_decl_fun479);
                    type38=type();

                    state._fsp--;

                    stream_type.add(type38.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bloc_in_decl_fun483);
            bloc39=bloc();

            state._fsp--;

            stream_bloc.add(bloc39.getTree());


            // AST REWRITE
            // elements: type, IDF, argument, bloc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 69:111: -> ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc )
            {
                // Mini_Rust2.g:69:114: ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_FCT, "DECL_FCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Mini_Rust2.g:69:129: ^( ARGUMENTS ( argument )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                // Mini_Rust2.g:69:141: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_2, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Mini_Rust2.g:69:152: ^( TYPE ( type )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                // Mini_Rust2.g:69:159: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_2, stream_type.nextTree());

                }
                stream_type.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_bloc.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "decl_fun"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Mini_Rust2.g:72:1: type : ( 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )? -> ^( 'Vec' type ) | '&' ( comm )? type -> ^( POINTEUR type ) | 'i32' ( comm )? -> 'i32' | 'bool' ( comm )? -> 'bool' | IDF ( comm )? -> IDF );
    public final Mini_Rust2Parser.type_return type() throws RecognitionException {
        Mini_Rust2Parser.type_return retval = new Mini_Rust2Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal40=null;
        Token char_literal42=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token IDF54=null;
        Mini_Rust2Parser.comm_return comm41 = null;

        Mini_Rust2Parser.comm_return comm43 = null;

        Mini_Rust2Parser.type_return type44 = null;

        Mini_Rust2Parser.comm_return comm46 = null;

        Mini_Rust2Parser.comm_return comm48 = null;

        Mini_Rust2Parser.type_return type49 = null;

        Mini_Rust2Parser.comm_return comm51 = null;

        Mini_Rust2Parser.comm_return comm53 = null;

        Mini_Rust2Parser.comm_return comm55 = null;


        CommonTree string_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree IDF54_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:72:6: ( 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )? -> ^( 'Vec' type ) | '&' ( comm )? type -> ^( POINTEUR type ) | 'i32' ( comm )? -> 'i32' | 'bool' ( comm )? -> 'bool' | IDF ( comm )? -> IDF )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt29=1;
                }
                break;
            case 49:
                {
                alt29=2;
                }
                break;
            case 50:
                {
                alt29=3;
                }
                break;
            case 51:
                {
                alt29=4;
                }
                break;
            case IDF:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // Mini_Rust2.g:72:8: 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )?
                    {
                    string_literal40=(Token)match(input,46,FOLLOW_46_in_type525);  
                    stream_46.add(string_literal40);

                    // Mini_Rust2.g:72:14: ( comm )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==78) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Mini_Rust2.g:72:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_type527);
                            comm41=comm();

                            state._fsp--;

                            stream_comm.add(comm41.getTree());

                            }
                            break;

                    }

                    char_literal42=(Token)match(input,47,FOLLOW_47_in_type530);  
                    stream_47.add(char_literal42);

                    // Mini_Rust2.g:72:24: ( comm )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==78) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Mini_Rust2.g:72:24: comm
                            {
                            pushFollow(FOLLOW_comm_in_type532);
                            comm43=comm();

                            state._fsp--;

                            stream_comm.add(comm43.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_type535);
                    type44=type();

                    state._fsp--;

                    stream_type.add(type44.getTree());
                    char_literal45=(Token)match(input,48,FOLLOW_48_in_type537);  
                    stream_48.add(char_literal45);

                    // Mini_Rust2.g:72:39: ( comm )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==78) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Mini_Rust2.g:72:39: comm
                            {
                            pushFollow(FOLLOW_comm_in_type539);
                            comm46=comm();

                            state._fsp--;

                            stream_comm.add(comm46.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 46, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 72:45: -> ^( 'Vec' type )
                    {
                        // Mini_Rust2.g:72:48: ^( 'Vec' type )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_46.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:73:8: '&' ( comm )? type
                    {
                    char_literal47=(Token)match(input,49,FOLLOW_49_in_type557);  
                    stream_49.add(char_literal47);

                    // Mini_Rust2.g:73:12: ( comm )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==78) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Mini_Rust2.g:73:12: comm
                            {
                            pushFollow(FOLLOW_comm_in_type559);
                            comm48=comm();

                            state._fsp--;

                            stream_comm.add(comm48.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_type562);
                    type49=type();

                    state._fsp--;

                    stream_type.add(type49.getTree());


                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:23: -> ^( POINTEUR type )
                    {
                        // Mini_Rust2.g:73:26: ^( POINTEUR type )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POINTEUR, "POINTEUR"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:74:8: 'i32' ( comm )?
                    {
                    string_literal50=(Token)match(input,50,FOLLOW_50_in_type579);  
                    stream_50.add(string_literal50);

                    // Mini_Rust2.g:74:14: ( comm )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==78) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Mini_Rust2.g:74:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_type581);
                            comm51=comm();

                            state._fsp--;

                            stream_comm.add(comm51.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 50
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 74:20: -> 'i32'
                    {
                        adaptor.addChild(root_0, stream_50.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:75:8: 'bool' ( comm )?
                    {
                    string_literal52=(Token)match(input,51,FOLLOW_51_in_type595);  
                    stream_51.add(string_literal52);

                    // Mini_Rust2.g:75:15: ( comm )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==78) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Mini_Rust2.g:75:15: comm
                            {
                            pushFollow(FOLLOW_comm_in_type597);
                            comm53=comm();

                            state._fsp--;

                            stream_comm.add(comm53.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 51
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 75:21: -> 'bool'
                    {
                        adaptor.addChild(root_0, stream_51.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Mini_Rust2.g:76:8: IDF ( comm )?
                    {
                    IDF54=(Token)match(input,IDF,FOLLOW_IDF_in_type611);  
                    stream_IDF.add(IDF54);

                    // Mini_Rust2.g:76:12: ( comm )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==78) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // Mini_Rust2.g:76:12: comm
                            {
                            pushFollow(FOLLOW_comm_in_type613);
                            comm55=comm();

                            state._fsp--;

                            stream_comm.add(comm55.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 76:18: -> IDF
                    {
                        adaptor.addChild(root_0, stream_IDF.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // Mini_Rust2.g:79:1: argument : IDF ':' ( comm )? type -> ^( DECL_VAR IDF type ) ;
    public final Mini_Rust2Parser.argument_return argument() throws RecognitionException {
        Mini_Rust2Parser.argument_return retval = new Mini_Rust2Parser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF56=null;
        Token char_literal57=null;
        Mini_Rust2Parser.comm_return comm58 = null;

        Mini_Rust2Parser.type_return type59 = null;


        CommonTree IDF56_tree=null;
        CommonTree char_literal57_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:79:10: ( IDF ':' ( comm )? type -> ^( DECL_VAR IDF type ) )
            // Mini_Rust2.g:79:12: IDF ':' ( comm )? type
            {
            IDF56=(Token)match(input,IDF,FOLLOW_IDF_in_argument632);  
            stream_IDF.add(IDF56);

            char_literal57=(Token)match(input,41,FOLLOW_41_in_argument634);  
            stream_41.add(char_literal57);

            // Mini_Rust2.g:79:20: ( comm )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==78) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Mini_Rust2.g:79:20: comm
                    {
                    pushFollow(FOLLOW_comm_in_argument636);
                    comm58=comm();

                    state._fsp--;

                    stream_comm.add(comm58.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_argument639);
            type59=type();

            state._fsp--;

            stream_type.add(type59.getTree());


            // AST REWRITE
            // elements: type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:31: -> ^( DECL_VAR IDF type )
            {
                // Mini_Rust2.g:79:34: ^( DECL_VAR IDF type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_VAR, "DECL_VAR"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument"

    public static class bloc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // Mini_Rust2.g:82:1: bloc : '{' ( comm )? ( sous_bloc )? '}' ( comm )? -> ^( BLOC ( sous_bloc )? ) ;
    public final Mini_Rust2Parser.bloc_return bloc() throws RecognitionException {
        Mini_Rust2Parser.bloc_return retval = new Mini_Rust2Parser.bloc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal60=null;
        Token char_literal63=null;
        Mini_Rust2Parser.comm_return comm61 = null;

        Mini_Rust2Parser.sous_bloc_return sous_bloc62 = null;

        Mini_Rust2Parser.comm_return comm64 = null;


        CommonTree char_literal60_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_sous_bloc=new RewriteRuleSubtreeStream(adaptor,"rule sous_bloc");
        try {
            // Mini_Rust2.g:82:6: ( '{' ( comm )? ( sous_bloc )? '}' ( comm )? -> ^( BLOC ( sous_bloc )? ) )
            // Mini_Rust2.g:82:8: '{' ( comm )? ( sous_bloc )? '}' ( comm )?
            {
            char_literal60=(Token)match(input,38,FOLLOW_38_in_bloc667);  
            stream_38.add(char_literal60);

            // Mini_Rust2.g:82:12: ( comm )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==78) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Mini_Rust2.g:82:12: comm
                    {
                    pushFollow(FOLLOW_comm_in_bloc669);
                    comm61=comm();

                    state._fsp--;

                    stream_comm.add(comm61.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:82:18: ( sous_bloc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=IDF && LA32_0<=CST_ENT)||LA32_0==43||LA32_0==46||LA32_0==49||(LA32_0>=53 && LA32_0<=56)||LA32_0==58||LA32_0==60||(LA32_0>=65 && LA32_0<=67)||LA32_0==69) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Mini_Rust2.g:82:18: sous_bloc
                    {
                    pushFollow(FOLLOW_sous_bloc_in_bloc672);
                    sous_bloc62=sous_bloc();

                    state._fsp--;

                    stream_sous_bloc.add(sous_bloc62.getTree());

                    }
                    break;

            }

            char_literal63=(Token)match(input,40,FOLLOW_40_in_bloc675);  
            stream_40.add(char_literal63);

            // Mini_Rust2.g:82:33: ( comm )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==78) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Mini_Rust2.g:82:33: comm
                    {
                    pushFollow(FOLLOW_comm_in_bloc677);
                    comm64=comm();

                    state._fsp--;

                    stream_comm.add(comm64.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: sous_bloc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 82:39: -> ^( BLOC ( sous_bloc )? )
            {
                // Mini_Rust2.g:82:42: ^( BLOC ( sous_bloc )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_1);

                // Mini_Rust2.g:82:49: ( sous_bloc )?
                if ( stream_sous_bloc.hasNext() ) {
                    adaptor.addChild(root_1, stream_sous_bloc.nextTree());

                }
                stream_sous_bloc.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bloc"

    public static class sous_bloc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sous_bloc"
    // Mini_Rust2.g:85:1: sous_bloc : ( instruction_avec_point ( ( ';' )+ ( comm )? ( sous_bloc )? )? -> instruction_avec_point ( sous_bloc )? | instruction_sans_point ( ';' )* ( sous_bloc )? -> instruction_sans_point ( sous_bloc )? );
    public final Mini_Rust2Parser.sous_bloc_return sous_bloc() throws RecognitionException {
        Mini_Rust2Parser.sous_bloc_return retval = new Mini_Rust2Parser.sous_bloc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal66=null;
        Token char_literal70=null;
        Mini_Rust2Parser.instruction_avec_point_return instruction_avec_point65 = null;

        Mini_Rust2Parser.comm_return comm67 = null;

        Mini_Rust2Parser.sous_bloc_return sous_bloc68 = null;

        Mini_Rust2Parser.instruction_sans_point_return instruction_sans_point69 = null;

        Mini_Rust2Parser.sous_bloc_return sous_bloc71 = null;


        CommonTree char_literal66_tree=null;
        CommonTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_instruction_avec_point=new RewriteRuleSubtreeStream(adaptor,"rule instruction_avec_point");
        RewriteRuleSubtreeStream stream_sous_bloc=new RewriteRuleSubtreeStream(adaptor,"rule sous_bloc");
        RewriteRuleSubtreeStream stream_instruction_sans_point=new RewriteRuleSubtreeStream(adaptor,"rule instruction_sans_point");
        try {
            // Mini_Rust2.g:85:11: ( instruction_avec_point ( ( ';' )+ ( comm )? ( sous_bloc )? )? -> instruction_avec_point ( sous_bloc )? | instruction_sans_point ( ';' )* ( sous_bloc )? -> instruction_sans_point ( sous_bloc )? )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=IDF && LA40_0<=CST_ENT)||LA40_0==43||LA40_0==46||LA40_0==49||(LA40_0>=53 && LA40_0<=56)||(LA40_0>=65 && LA40_0<=67)||LA40_0==69) ) {
                alt40=1;
            }
            else if ( (LA40_0==58||LA40_0==60) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // Mini_Rust2.g:85:13: instruction_avec_point ( ( ';' )+ ( comm )? ( sous_bloc )? )?
                    {
                    pushFollow(FOLLOW_instruction_avec_point_in_sous_bloc701);
                    instruction_avec_point65=instruction_avec_point();

                    state._fsp--;

                    stream_instruction_avec_point.add(instruction_avec_point65.getTree());
                    // Mini_Rust2.g:85:36: ( ( ';' )+ ( comm )? ( sous_bloc )? )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==52) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Mini_Rust2.g:85:37: ( ';' )+ ( comm )? ( sous_bloc )?
                            {
                            // Mini_Rust2.g:85:37: ( ';' )+
                            int cnt34=0;
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==52) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // Mini_Rust2.g:85:37: ';'
                            	    {
                            	    char_literal66=(Token)match(input,52,FOLLOW_52_in_sous_bloc704);  
                            	    stream_52.add(char_literal66);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt34 >= 1 ) break loop34;
                                        EarlyExitException eee =
                                            new EarlyExitException(34, input);
                                        throw eee;
                                }
                                cnt34++;
                            } while (true);

                            // Mini_Rust2.g:85:42: ( comm )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==78) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // Mini_Rust2.g:85:42: comm
                                    {
                                    pushFollow(FOLLOW_comm_in_sous_bloc707);
                                    comm67=comm();

                                    state._fsp--;

                                    stream_comm.add(comm67.getTree());

                                    }
                                    break;

                            }

                            // Mini_Rust2.g:85:48: ( sous_bloc )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( ((LA36_0>=IDF && LA36_0<=CST_ENT)||LA36_0==43||LA36_0==46||LA36_0==49||(LA36_0>=53 && LA36_0<=56)||LA36_0==58||LA36_0==60||(LA36_0>=65 && LA36_0<=67)||LA36_0==69) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // Mini_Rust2.g:85:48: sous_bloc
                                    {
                                    pushFollow(FOLLOW_sous_bloc_in_sous_bloc710);
                                    sous_bloc68=sous_bloc();

                                    state._fsp--;

                                    stream_sous_bloc.add(sous_bloc68.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: instruction_avec_point, sous_bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:61: -> instruction_avec_point ( sous_bloc )?
                    {
                        adaptor.addChild(root_0, stream_instruction_avec_point.nextTree());
                        // Mini_Rust2.g:85:87: ( sous_bloc )?
                        if ( stream_sous_bloc.hasNext() ) {
                            adaptor.addChild(root_0, stream_sous_bloc.nextTree());

                        }
                        stream_sous_bloc.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:86:13: instruction_sans_point ( ';' )* ( sous_bloc )?
                    {
                    pushFollow(FOLLOW_instruction_sans_point_in_sous_bloc734);
                    instruction_sans_point69=instruction_sans_point();

                    state._fsp--;

                    stream_instruction_sans_point.add(instruction_sans_point69.getTree());
                    // Mini_Rust2.g:86:36: ( ';' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==52) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Mini_Rust2.g:86:36: ';'
                    	    {
                    	    char_literal70=(Token)match(input,52,FOLLOW_52_in_sous_bloc736);  
                    	    stream_52.add(char_literal70);


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // Mini_Rust2.g:86:41: ( sous_bloc )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=IDF && LA39_0<=CST_ENT)||LA39_0==43||LA39_0==46||LA39_0==49||(LA39_0>=53 && LA39_0<=56)||LA39_0==58||LA39_0==60||(LA39_0>=65 && LA39_0<=67)||LA39_0==69) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Mini_Rust2.g:86:41: sous_bloc
                            {
                            pushFollow(FOLLOW_sous_bloc_in_sous_bloc739);
                            sous_bloc71=sous_bloc();

                            state._fsp--;

                            stream_sous_bloc.add(sous_bloc71.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: sous_bloc, instruction_sans_point
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:52: -> instruction_sans_point ( sous_bloc )?
                    {
                        adaptor.addChild(root_0, stream_instruction_sans_point.nextTree());
                        // Mini_Rust2.g:86:78: ( sous_bloc )?
                        if ( stream_sous_bloc.hasNext() ) {
                            adaptor.addChild(root_0, stream_sous_bloc.nextTree());

                        }
                        stream_sous_bloc.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sous_bloc"

    public static class instruction_avec_point_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_avec_point"
    // Mini_Rust2.g:89:1: instruction_avec_point : ( 'let' let2 -> let2 | 'return' ( comm )? ( expr )? -> ^( RETURN ( expr )? ) | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? -> ^( PRINT expr ) | operations_prio4 ( '=' ( operations_prio4 | bloc ) )? );
    public final Mini_Rust2Parser.instruction_avec_point_return instruction_avec_point() throws RecognitionException {
        Mini_Rust2Parser.instruction_avec_point_return retval = new Mini_Rust2Parser.instruction_avec_point_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal72=null;
        Token string_literal74=null;
        Token string_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal84=null;
        Token char_literal87=null;
        Mini_Rust2Parser.let2_return let273 = null;

        Mini_Rust2Parser.comm_return comm75 = null;

        Mini_Rust2Parser.expr_return expr76 = null;

        Mini_Rust2Parser.comm_return comm78 = null;

        Mini_Rust2Parser.comm_return comm80 = null;

        Mini_Rust2Parser.comm_return comm82 = null;

        Mini_Rust2Parser.expr_return expr83 = null;

        Mini_Rust2Parser.comm_return comm85 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio486 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio488 = null;

        Mini_Rust2Parser.bloc_return bloc89 = null;


        CommonTree string_literal72_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_let2=new RewriteRuleSubtreeStream(adaptor,"rule let2");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:89:24: ( 'let' let2 -> let2 | 'return' ( comm )? ( expr )? -> ^( RETURN ( expr )? ) | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? -> ^( PRINT expr ) | operations_prio4 ( '=' ( operations_prio4 | bloc ) )? )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt49=1;
                }
                break;
            case 54:
                {
                alt49=2;
                }
                break;
            case 55:
                {
                alt49=3;
                }
                break;
            case IDF:
            case CST_ENT:
            case 43:
            case 46:
            case 49:
            case 56:
            case 65:
            case 66:
            case 67:
            case 69:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // Mini_Rust2.g:89:26: 'let' let2
                    {
                    string_literal72=(Token)match(input,53,FOLLOW_53_in_instruction_avec_point766);  
                    stream_53.add(string_literal72);

                    pushFollow(FOLLOW_let2_in_instruction_avec_point768);
                    let273=let2();

                    state._fsp--;

                    stream_let2.add(let273.getTree());


                    // AST REWRITE
                    // elements: let2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:37: -> let2
                    {
                        adaptor.addChild(root_0, stream_let2.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:90:26: 'return' ( comm )? ( expr )?
                    {
                    string_literal74=(Token)match(input,54,FOLLOW_54_in_instruction_avec_point799);  
                    stream_54.add(string_literal74);

                    // Mini_Rust2.g:90:35: ( comm )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==78) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Mini_Rust2.g:90:35: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point801);
                            comm75=comm();

                            state._fsp--;

                            stream_comm.add(comm75.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:90:41: ( expr )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=IDF && LA42_0<=CST_ENT)||LA42_0==38||LA42_0==43||LA42_0==46||LA42_0==49||LA42_0==56||(LA42_0>=65 && LA42_0<=67)||LA42_0==69) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // Mini_Rust2.g:90:41: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction_avec_point804);
                            expr76=expr();

                            state._fsp--;

                            stream_expr.add(expr76.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 90:48: -> ^( RETURN ( expr )? )
                    {
                        // Mini_Rust2.g:90:51: ^( RETURN ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                        // Mini_Rust2.g:90:60: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:91:26: 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )?
                    {
                    string_literal77=(Token)match(input,55,FOLLOW_55_in_instruction_avec_point842);  
                    stream_55.add(string_literal77);

                    // Mini_Rust2.g:91:34: ( comm )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==78) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Mini_Rust2.g:91:34: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point844);
                            comm78=comm();

                            state._fsp--;

                            stream_comm.add(comm78.getTree());

                            }
                            break;

                    }

                    char_literal79=(Token)match(input,56,FOLLOW_56_in_instruction_avec_point847);  
                    stream_56.add(char_literal79);

                    // Mini_Rust2.g:91:44: ( comm )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==78) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Mini_Rust2.g:91:44: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point849);
                            comm80=comm();

                            state._fsp--;

                            stream_comm.add(comm80.getTree());

                            }
                            break;

                    }

                    char_literal81=(Token)match(input,43,FOLLOW_43_in_instruction_avec_point852);  
                    stream_43.add(char_literal81);

                    // Mini_Rust2.g:91:54: ( comm )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==78) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Mini_Rust2.g:91:54: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point854);
                            comm82=comm();

                            state._fsp--;

                            stream_comm.add(comm82.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction_avec_point857);
                    expr83=expr();

                    state._fsp--;

                    stream_expr.add(expr83.getTree());
                    char_literal84=(Token)match(input,44,FOLLOW_44_in_instruction_avec_point859);  
                    stream_44.add(char_literal84);

                    // Mini_Rust2.g:91:69: ( comm )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==78) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // Mini_Rust2.g:91:69: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point861);
                            comm85=comm();

                            state._fsp--;

                            stream_comm.add(comm85.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:75: -> ^( PRINT expr )
                    {
                        // Mini_Rust2.g:91:78: ^( PRINT expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINT, "PRINT"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:92:26: operations_prio4 ( '=' ( operations_prio4 | bloc ) )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operations_prio4_in_instruction_avec_point897);
                    operations_prio486=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio486.getTree());
                    // Mini_Rust2.g:92:43: ( '=' ( operations_prio4 | bloc ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==57) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // Mini_Rust2.g:92:44: '=' ( operations_prio4 | bloc )
                            {
                            char_literal87=(Token)match(input,57,FOLLOW_57_in_instruction_avec_point900); 
                            char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal87_tree, root_0);

                            // Mini_Rust2.g:92:50: ( operations_prio4 | bloc )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( ((LA47_0>=IDF && LA47_0<=CST_ENT)||LA47_0==43||LA47_0==46||LA47_0==49||LA47_0==56||(LA47_0>=65 && LA47_0<=67)||LA47_0==69) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==38) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // Mini_Rust2.g:92:51: operations_prio4
                                    {
                                    pushFollow(FOLLOW_operations_prio4_in_instruction_avec_point905);
                                    operations_prio488=operations_prio4();

                                    state._fsp--;

                                    adaptor.addChild(root_0, operations_prio488.getTree());

                                    }
                                    break;
                                case 2 :
                                    // Mini_Rust2.g:92:70: bloc
                                    {
                                    pushFollow(FOLLOW_bloc_in_instruction_avec_point909);
                                    bloc89=bloc();

                                    state._fsp--;

                                    adaptor.addChild(root_0, bloc89.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_avec_point"

    public static class instruction_sans_point_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_sans_point"
    // Mini_Rust2.g:95:1: instruction_sans_point : ( 'while' ( comm )? operations_prio4b bloc -> ^( WHILE ^( CONDITION operations_prio4b ) bloc ) | if_expr );
    public final Mini_Rust2Parser.instruction_sans_point_return instruction_sans_point() throws RecognitionException {
        Mini_Rust2Parser.instruction_sans_point_return retval = new Mini_Rust2Parser.instruction_sans_point_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal90=null;
        Mini_Rust2Parser.comm_return comm91 = null;

        Mini_Rust2Parser.operations_prio4b_return operations_prio4b92 = null;

        Mini_Rust2Parser.bloc_return bloc93 = null;

        Mini_Rust2Parser.if_expr_return if_expr94 = null;


        CommonTree string_literal90_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_operations_prio4b=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4b");
        try {
            // Mini_Rust2.g:95:24: ( 'while' ( comm )? operations_prio4b bloc -> ^( WHILE ^( CONDITION operations_prio4b ) bloc ) | if_expr )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==58) ) {
                alt51=1;
            }
            else if ( (LA51_0==60) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // Mini_Rust2.g:95:26: 'while' ( comm )? operations_prio4b bloc
                    {
                    string_literal90=(Token)match(input,58,FOLLOW_58_in_instruction_sans_point944);  
                    stream_58.add(string_literal90);

                    // Mini_Rust2.g:95:34: ( comm )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==78) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // Mini_Rust2.g:95:34: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_sans_point946);
                            comm91=comm();

                            state._fsp--;

                            stream_comm.add(comm91.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_operations_prio4b_in_instruction_sans_point949);
                    operations_prio4b92=operations_prio4b();

                    state._fsp--;

                    stream_operations_prio4b.add(operations_prio4b92.getTree());
                    pushFollow(FOLLOW_bloc_in_instruction_sans_point951);
                    bloc93=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc93.getTree());


                    // AST REWRITE
                    // elements: operations_prio4b, bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:64: -> ^( WHILE ^( CONDITION operations_prio4b ) bloc )
                    {
                        // Mini_Rust2.g:95:67: ^( WHILE ^( CONDITION operations_prio4b ) bloc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        // Mini_Rust2.g:95:75: ^( CONDITION operations_prio4b )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_operations_prio4b.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_bloc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:96:26: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_instruction_sans_point993);
                    if_expr94=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr94.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction_sans_point"

    public static class let2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "let2"
    // Mini_Rust2.g:99:1: let2 : ( 'mut' ( comm )? accesseur ( '=' ( comm )? expr )? -> ^( DECL_VAR_MUT accesseur ( expr )? ) | accesseur ( '=' ( comm )? expr )? -> ^( CST_OU_AFF accesseur ( expr )? ) );
    public final Mini_Rust2Parser.let2_return let2() throws RecognitionException {
        Mini_Rust2Parser.let2_return retval = new Mini_Rust2Parser.let2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal95=null;
        Token char_literal98=null;
        Token char_literal102=null;
        Mini_Rust2Parser.comm_return comm96 = null;

        Mini_Rust2Parser.accesseur_return accesseur97 = null;

        Mini_Rust2Parser.comm_return comm99 = null;

        Mini_Rust2Parser.expr_return expr100 = null;

        Mini_Rust2Parser.accesseur_return accesseur101 = null;

        Mini_Rust2Parser.comm_return comm103 = null;

        Mini_Rust2Parser.expr_return expr104 = null;


        CommonTree string_literal95_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_accesseur=new RewriteRuleSubtreeStream(adaptor,"rule accesseur");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:99:6: ( 'mut' ( comm )? accesseur ( '=' ( comm )? expr )? -> ^( DECL_VAR_MUT accesseur ( expr )? ) | accesseur ( '=' ( comm )? expr )? -> ^( CST_OU_AFF accesseur ( expr )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            else if ( (LA57_0==IDF||LA57_0==67) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // Mini_Rust2.g:99:8: 'mut' ( comm )? accesseur ( '=' ( comm )? expr )?
                    {
                    string_literal95=(Token)match(input,59,FOLLOW_59_in_let21025);  
                    stream_59.add(string_literal95);

                    // Mini_Rust2.g:99:14: ( comm )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==78) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // Mini_Rust2.g:99:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_let21027);
                            comm96=comm();

                            state._fsp--;

                            stream_comm.add(comm96.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesseur_in_let21030);
                    accesseur97=accesseur();

                    state._fsp--;

                    stream_accesseur.add(accesseur97.getTree());
                    // Mini_Rust2.g:99:30: ( '=' ( comm )? expr )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==57) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // Mini_Rust2.g:99:31: '=' ( comm )? expr
                            {
                            char_literal98=(Token)match(input,57,FOLLOW_57_in_let21033);  
                            stream_57.add(char_literal98);

                            // Mini_Rust2.g:99:35: ( comm )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==78) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // Mini_Rust2.g:99:35: comm
                                    {
                                    pushFollow(FOLLOW_comm_in_let21035);
                                    comm99=comm();

                                    state._fsp--;

                                    stream_comm.add(comm99.getTree());

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_let21038);
                            expr100=expr();

                            state._fsp--;

                            stream_expr.add(expr100.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, accesseur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:48: -> ^( DECL_VAR_MUT accesseur ( expr )? )
                    {
                        // Mini_Rust2.g:99:51: ^( DECL_VAR_MUT accesseur ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_VAR_MUT, "DECL_VAR_MUT"), root_1);

                        adaptor.addChild(root_1, stream_accesseur.nextTree());
                        // Mini_Rust2.g:99:76: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:100:8: accesseur ( '=' ( comm )? expr )?
                    {
                    pushFollow(FOLLOW_accesseur_in_let21060);
                    accesseur101=accesseur();

                    state._fsp--;

                    stream_accesseur.add(accesseur101.getTree());
                    // Mini_Rust2.g:100:18: ( '=' ( comm )? expr )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==57) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // Mini_Rust2.g:100:19: '=' ( comm )? expr
                            {
                            char_literal102=(Token)match(input,57,FOLLOW_57_in_let21063);  
                            stream_57.add(char_literal102);

                            // Mini_Rust2.g:100:23: ( comm )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==78) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // Mini_Rust2.g:100:23: comm
                                    {
                                    pushFollow(FOLLOW_comm_in_let21065);
                                    comm103=comm();

                                    state._fsp--;

                                    stream_comm.add(comm103.getTree());

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_let21068);
                            expr104=expr();

                            state._fsp--;

                            stream_expr.add(expr104.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, accesseur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:36: -> ^( CST_OU_AFF accesseur ( expr )? )
                    {
                        // Mini_Rust2.g:100:39: ^( CST_OU_AFF accesseur ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CST_OU_AFF, "CST_OU_AFF"), root_1);

                        adaptor.addChild(root_1, stream_accesseur.nextTree());
                        // Mini_Rust2.g:100:62: ( expr )?
                        if ( stream_expr.hasNext() ) {
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "let2"

    public static class if_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expr"
    // Mini_Rust2.g:103:1: if_expr : 'if' ( comm )? operations_prio4b bloc ( else2 )? -> ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? ) ;
    public final Mini_Rust2Parser.if_expr_return if_expr() throws RecognitionException {
        Mini_Rust2Parser.if_expr_return retval = new Mini_Rust2Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal105=null;
        Mini_Rust2Parser.comm_return comm106 = null;

        Mini_Rust2Parser.operations_prio4b_return operations_prio4b107 = null;

        Mini_Rust2Parser.bloc_return bloc108 = null;

        Mini_Rust2Parser.else2_return else2109 = null;


        CommonTree string_literal105_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_operations_prio4b=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4b");
        RewriteRuleSubtreeStream stream_else2=new RewriteRuleSubtreeStream(adaptor,"rule else2");
        try {
            // Mini_Rust2.g:103:9: ( 'if' ( comm )? operations_prio4b bloc ( else2 )? -> ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? ) )
            // Mini_Rust2.g:103:11: 'if' ( comm )? operations_prio4b bloc ( else2 )?
            {
            string_literal105=(Token)match(input,60,FOLLOW_60_in_if_expr1096);  
            stream_60.add(string_literal105);

            // Mini_Rust2.g:103:16: ( comm )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==78) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Mini_Rust2.g:103:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_if_expr1098);
                    comm106=comm();

                    state._fsp--;

                    stream_comm.add(comm106.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_operations_prio4b_in_if_expr1101);
            operations_prio4b107=operations_prio4b();

            state._fsp--;

            stream_operations_prio4b.add(operations_prio4b107.getTree());
            pushFollow(FOLLOW_bloc_in_if_expr1103);
            bloc108=bloc();

            state._fsp--;

            stream_bloc.add(bloc108.getTree());
            // Mini_Rust2.g:103:45: ( else2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // Mini_Rust2.g:103:45: else2
                    {
                    pushFollow(FOLLOW_else2_in_if_expr1105);
                    else2109=else2();

                    state._fsp--;

                    stream_else2.add(else2109.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: bloc, operations_prio4b, else2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 103:52: -> ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? )
            {
                // Mini_Rust2.g:103:55: ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // Mini_Rust2.g:103:60: ^( CONDITION operations_prio4b )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_operations_prio4b.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_bloc.nextTree());
                // Mini_Rust2.g:103:96: ( else2 )?
                if ( stream_else2.hasNext() ) {
                    adaptor.addChild(root_1, stream_else2.nextTree());

                }
                stream_else2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_expr"

    public static class else2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else2"
    // Mini_Rust2.g:106:1: else2 : 'else' ( comm )? else3 -> ^( ELSE else3 ) ;
    public final Mini_Rust2Parser.else2_return else2() throws RecognitionException {
        Mini_Rust2Parser.else2_return retval = new Mini_Rust2Parser.else2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal110=null;
        Mini_Rust2Parser.comm_return comm111 = null;

        Mini_Rust2Parser.else3_return else3112 = null;


        CommonTree string_literal110_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_else3=new RewriteRuleSubtreeStream(adaptor,"rule else3");
        try {
            // Mini_Rust2.g:106:7: ( 'else' ( comm )? else3 -> ^( ELSE else3 ) )
            // Mini_Rust2.g:106:9: 'else' ( comm )? else3
            {
            string_literal110=(Token)match(input,61,FOLLOW_61_in_else21140);  
            stream_61.add(string_literal110);

            // Mini_Rust2.g:106:16: ( comm )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==78) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // Mini_Rust2.g:106:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_else21142);
                    comm111=comm();

                    state._fsp--;

                    stream_comm.add(comm111.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_else3_in_else21145);
            else3112=else3();

            state._fsp--;

            stream_else3.add(else3112.getTree());


            // AST REWRITE
            // elements: else3
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:28: -> ^( ELSE else3 )
            {
                // Mini_Rust2.g:106:31: ^( ELSE else3 )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELSE, "ELSE"), root_1);

                adaptor.addChild(root_1, stream_else3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else2"

    public static class else3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else3"
    // Mini_Rust2.g:109:1: else3 : ( bloc | if_expr );
    public final Mini_Rust2Parser.else3_return else3() throws RecognitionException {
        Mini_Rust2Parser.else3_return retval = new Mini_Rust2Parser.else3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.bloc_return bloc113 = null;

        Mini_Rust2Parser.if_expr_return if_expr114 = null;



        try {
            // Mini_Rust2.g:109:7: ( bloc | if_expr )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            else if ( (LA61_0==60) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // Mini_Rust2.g:109:9: bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_else31168);
                    bloc113=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc113.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:110:9: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_else31178);
                    if_expr114=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr114.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else3"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Mini_Rust2.g:113:1: expr : ( bloc | operations_prio4 );
    public final Mini_Rust2Parser.expr_return expr() throws RecognitionException {
        Mini_Rust2Parser.expr_return retval = new Mini_Rust2Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.bloc_return bloc115 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4116 = null;



        try {
            // Mini_Rust2.g:113:6: ( bloc | operations_prio4 )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=IDF && LA62_0<=CST_ENT)||LA62_0==43||LA62_0==46||LA62_0==49||LA62_0==56||(LA62_0>=65 && LA62_0<=67)||LA62_0==69) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // Mini_Rust2.g:113:8: bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_expr1193);
                    bloc115=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc115.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:114:8: operations_prio4
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operations_prio4_in_expr1202);
                    operations_prio4116=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4116.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class operations_prio4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio4"
    // Mini_Rust2.g:117:1: operations_prio4 : operations_prio3 ( prio4 operations_prio4 )? ;
    public final Mini_Rust2Parser.operations_prio4_return operations_prio4() throws RecognitionException {
        Mini_Rust2Parser.operations_prio4_return retval = new Mini_Rust2Parser.operations_prio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3117 = null;

        Mini_Rust2Parser.prio4_return prio4118 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4119 = null;



        try {
            // Mini_Rust2.g:117:18: ( operations_prio3 ( prio4 operations_prio4 )? )
            // Mini_Rust2.g:117:20: operations_prio3 ( prio4 operations_prio4 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio3_in_operations_prio41216);
            operations_prio3117=operations_prio3();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio3117.getTree());
            // Mini_Rust2.g:117:37: ( prio4 operations_prio4 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=76 && LA63_0<=77)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Mini_Rust2.g:117:38: prio4 operations_prio4
                    {
                    pushFollow(FOLLOW_prio4_in_operations_prio41219);
                    prio4118=prio4();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio4118.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio4_in_operations_prio41223);
                    operations_prio4119=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4119.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio4"

    public static class operations_prio3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio3"
    // Mini_Rust2.g:120:1: operations_prio3 : operations_prio2 ( prio3 operations_prio3 )? ;
    public final Mini_Rust2Parser.operations_prio3_return operations_prio3() throws RecognitionException {
        Mini_Rust2Parser.operations_prio3_return retval = new Mini_Rust2Parser.operations_prio3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2120 = null;

        Mini_Rust2Parser.prio3_return prio3121 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3122 = null;



        try {
            // Mini_Rust2.g:120:18: ( operations_prio2 ( prio3 operations_prio3 )? )
            // Mini_Rust2.g:120:20: operations_prio2 ( prio3 operations_prio3 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio2_in_operations_prio31251);
            operations_prio2120=operations_prio2();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio2120.getTree());
            // Mini_Rust2.g:120:37: ( prio3 operations_prio3 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=47 && LA64_0<=48)||(LA64_0>=72 && LA64_0<=75)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Mini_Rust2.g:120:38: prio3 operations_prio3
                    {
                    pushFollow(FOLLOW_prio3_in_operations_prio31254);
                    prio3121=prio3();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio3121.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio3_in_operations_prio31258);
                    operations_prio3122=operations_prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3122.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio3"

    public static class operations_prio2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio2"
    // Mini_Rust2.g:123:1: operations_prio2 : operations_prio1 ( prio2 operations_prio2 )? ;
    public final Mini_Rust2Parser.operations_prio2_return operations_prio2() throws RecognitionException {
        Mini_Rust2Parser.operations_prio2_return retval = new Mini_Rust2Parser.operations_prio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1123 = null;

        Mini_Rust2Parser.prio2_return prio2124 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2125 = null;



        try {
            // Mini_Rust2.g:123:18: ( operations_prio1 ( prio2 operations_prio2 )? )
            // Mini_Rust2.g:123:20: operations_prio1 ( prio2 operations_prio2 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio1_in_operations_prio21286);
            operations_prio1123=operations_prio1();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio1123.getTree());
            // Mini_Rust2.g:123:37: ( prio2 operations_prio2 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==69||LA65_0==71) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Mini_Rust2.g:123:38: prio2 operations_prio2
                    {
                    pushFollow(FOLLOW_prio2_in_operations_prio21289);
                    prio2124=prio2();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio2124.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio2_in_operations_prio21293);
                    operations_prio2125=operations_prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2125.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio2"

    public static class operations_prio1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio1"
    // Mini_Rust2.g:126:1: operations_prio1 : ( unaire )? operations_unaires ( prio1 operations_prio1 )? ;
    public final Mini_Rust2Parser.operations_prio1_return operations_prio1() throws RecognitionException {
        Mini_Rust2Parser.operations_prio1_return retval = new Mini_Rust2Parser.operations_prio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_return unaire126 = null;

        Mini_Rust2Parser.operations_unaires_return operations_unaires127 = null;

        Mini_Rust2Parser.prio1_return prio1128 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1129 = null;



        try {
            // Mini_Rust2.g:126:18: ( ( unaire )? operations_unaires ( prio1 operations_prio1 )? )
            // Mini_Rust2.g:126:20: ( unaire )? operations_unaires ( prio1 operations_prio1 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // Mini_Rust2.g:126:20: ( unaire )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56||LA66_0==69) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // Mini_Rust2.g:126:21: unaire
                    {
                    pushFollow(FOLLOW_unaire_in_operations_prio11322);
                    unaire126=unaire();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(unaire126.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_operations_unaires_in_operations_prio11328);
            operations_unaires127=operations_unaires();

            state._fsp--;

            adaptor.addChild(root_0, operations_unaires127.getTree());
            // Mini_Rust2.g:126:51: ( prio1 operations_prio1 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==67||LA67_0==70) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // Mini_Rust2.g:126:52: prio1 operations_prio1
                    {
                    pushFollow(FOLLOW_prio1_in_operations_prio11331);
                    prio1128=prio1();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio1128.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio1_in_operations_prio11335);
                    operations_prio1129=operations_prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1129.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio1"

    public static class operations_unaires_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_unaires"
    // Mini_Rust2.g:129:1: operations_unaires : ( '(' operations_prio4 ')' -> ^( operations_prio4 ) | variable );
    public final Mini_Rust2Parser.operations_unaires_return operations_unaires() throws RecognitionException {
        Mini_Rust2Parser.operations_unaires_return retval = new Mini_Rust2Parser.operations_unaires_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal130=null;
        Token char_literal132=null;
        Mini_Rust2Parser.operations_prio4_return operations_prio4131 = null;

        Mini_Rust2Parser.variable_return variable133 = null;


        CommonTree char_literal130_tree=null;
        CommonTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_operations_prio4=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4");
        try {
            // Mini_Rust2.g:129:20: ( '(' operations_prio4 ')' -> ^( operations_prio4 ) | variable )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==43) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=IDF && LA68_0<=CST_ENT)||LA68_0==46||LA68_0==49||(LA68_0>=65 && LA68_0<=67)) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // Mini_Rust2.g:129:22: '(' operations_prio4 ')'
                    {
                    char_literal130=(Token)match(input,43,FOLLOW_43_in_operations_unaires1363);  
                    stream_43.add(char_literal130);

                    pushFollow(FOLLOW_operations_prio4_in_operations_unaires1365);
                    operations_prio4131=operations_prio4();

                    state._fsp--;

                    stream_operations_prio4.add(operations_prio4131.getTree());
                    char_literal132=(Token)match(input,44,FOLLOW_44_in_operations_unaires1367);  
                    stream_44.add(char_literal132);



                    // AST REWRITE
                    // elements: operations_prio4
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 129:47: -> ^( operations_prio4 )
                    {
                        // Mini_Rust2.g:129:50: ^( operations_prio4 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_operations_prio4.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:130:22: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operations_unaires1396);
                    variable133=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable133.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_unaires"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // Mini_Rust2.g:133:1: variable : ( variable2 | unaire_var );
    public final Mini_Rust2Parser.variable_return variable() throws RecognitionException {
        Mini_Rust2Parser.variable_return retval = new Mini_Rust2Parser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.variable2_return variable2134 = null;

        Mini_Rust2Parser.unaire_var_return unaire_var135 = null;



        try {
            // Mini_Rust2.g:133:10: ( variable2 | unaire_var )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==CST_ENT||LA69_0==46||(LA69_0>=65 && LA69_0<=66)) ) {
                alt69=1;
            }
            else if ( (LA69_0==IDF||LA69_0==49||LA69_0==67) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // Mini_Rust2.g:133:12: variable2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable2_in_variable1424);
                    variable2134=variable2();

                    state._fsp--;

                    adaptor.addChild(root_0, variable2134.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:134:12: unaire_var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaire_var_in_variable1437);
                    unaire_var135=unaire_var();

                    state._fsp--;

                    adaptor.addChild(root_0, unaire_var135.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class unaire_var_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaire_var"
    // Mini_Rust2.g:137:1: unaire_var : ( unaire2 unaire_var -> ^( unaire2 unaire_var ) | variable3 );
    public final Mini_Rust2Parser.unaire_var_return unaire_var() throws RecognitionException {
        Mini_Rust2Parser.unaire_var_return retval = new Mini_Rust2Parser.unaire_var_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire2_return unaire2136 = null;

        Mini_Rust2Parser.unaire_var_return unaire_var137 = null;

        Mini_Rust2Parser.variable3_return variable3138 = null;


        RewriteRuleSubtreeStream stream_unaire_var=new RewriteRuleSubtreeStream(adaptor,"rule unaire_var");
        RewriteRuleSubtreeStream stream_unaire2=new RewriteRuleSubtreeStream(adaptor,"rule unaire2");
        try {
            // Mini_Rust2.g:137:12: ( unaire2 unaire_var -> ^( unaire2 unaire_var ) | variable3 )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==49||LA70_0==67) ) {
                alt70=1;
            }
            else if ( (LA70_0==IDF) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // Mini_Rust2.g:137:14: unaire2 unaire_var
                    {
                    pushFollow(FOLLOW_unaire2_in_unaire_var1455);
                    unaire2136=unaire2();

                    state._fsp--;

                    stream_unaire2.add(unaire2136.getTree());
                    pushFollow(FOLLOW_unaire_var_in_unaire_var1457);
                    unaire_var137=unaire_var();

                    state._fsp--;

                    stream_unaire_var.add(unaire_var137.getTree());


                    // AST REWRITE
                    // elements: unaire_var, unaire2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 137:33: -> ^( unaire2 unaire_var )
                    {
                        // Mini_Rust2.g:137:36: ^( unaire2 unaire_var )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_unaire2.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaire_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:138:14: variable3
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable3_in_unaire_var1480);
                    variable3138=variable3();

                    state._fsp--;

                    adaptor.addChild(root_0, variable3138.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaire_var"

    public static class variable3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable3"
    // Mini_Rust2.g:141:1: variable3 : IDF ( struct | ( fonction ) | ( acces_variable ) | ) -> {choix==1}? ^( APPEL_FCT IDF ( fonction )? ) -> {choix == 2}? ^( VAR IDF acces_variable ) -> {choix == 3}? ^( VAR IDF ) -> ^( STRUCT IDF struct ) ;
    public final Mini_Rust2Parser.variable3_return variable3() throws RecognitionException {
        Mini_Rust2Parser.variable3_return retval = new Mini_Rust2Parser.variable3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF139=null;
        Mini_Rust2Parser.struct_return struct140 = null;

        Mini_Rust2Parser.fonction_return fonction141 = null;

        Mini_Rust2Parser.acces_variable_return acces_variable142 = null;


        CommonTree IDF139_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_struct=new RewriteRuleSubtreeStream(adaptor,"rule struct");
        RewriteRuleSubtreeStream stream_acces_variable=new RewriteRuleSubtreeStream(adaptor,"rule acces_variable");
        RewriteRuleSubtreeStream stream_fonction=new RewriteRuleSubtreeStream(adaptor,"rule fonction");
        int choix = 0;
        try {
            // Mini_Rust2.g:142:24: ( IDF ( struct | ( fonction ) | ( acces_variable ) | ) -> {choix==1}? ^( APPEL_FCT IDF ( fonction )? ) -> {choix == 2}? ^( VAR IDF acces_variable ) -> {choix == 3}? ^( VAR IDF ) -> ^( STRUCT IDF struct ) )
            // Mini_Rust2.g:142:26: IDF ( struct | ( fonction ) | ( acces_variable ) | )
            {
            IDF139=(Token)match(input,IDF,FOLLOW_IDF_in_variable31505);  
            stream_IDF.add(IDF139);

            // Mini_Rust2.g:142:30: ( struct | ( fonction ) | ( acces_variable ) | )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt71=1;
                }
                break;
            case 43:
                {
                alt71=2;
                }
                break;
            case 62:
            case 64:
                {
                alt71=3;
                }
                break;
            case 39:
            case 40:
            case 44:
            case 47:
            case 48:
            case 52:
            case 57:
            case 63:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // Mini_Rust2.g:142:31: struct
                    {
                    pushFollow(FOLLOW_struct_in_variable31508);
                    struct140=struct();

                    state._fsp--;

                    stream_struct.add(struct140.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:142:40: ( fonction )
                    {
                    // Mini_Rust2.g:142:40: ( fonction )
                    // Mini_Rust2.g:142:41: fonction
                    {
                    pushFollow(FOLLOW_fonction_in_variable31513);
                    fonction141=fonction();

                    state._fsp--;

                    stream_fonction.add(fonction141.getTree());
                    choix=1;

                    }


                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:142:64: ( acces_variable )
                    {
                    // Mini_Rust2.g:142:64: ( acces_variable )
                    // Mini_Rust2.g:142:65: acces_variable
                    {
                    pushFollow(FOLLOW_acces_variable_in_variable31521);
                    acces_variable142=acces_variable();

                    state._fsp--;

                    stream_acces_variable.add(acces_variable142.getTree());
                    choix=2;

                    }


                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:142:94: 
                    {
                    choix=3;

                    }
                    break;

            }



            // AST REWRITE
            // elements: fonction, acces_variable, IDF, struct, IDF, IDF, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 142:106: -> {choix==1}? ^( APPEL_FCT IDF ( fonction )? )
            if (choix==1) {
                // Mini_Rust2.g:142:121: ^( APPEL_FCT IDF ( fonction )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPEL_FCT, "APPEL_FCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Mini_Rust2.g:142:137: ( fonction )?
                if ( stream_fonction.hasNext() ) {
                    adaptor.addChild(root_1, stream_fonction.nextTree());

                }
                stream_fonction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 143:106: -> {choix == 2}? ^( VAR IDF acces_variable )
            if (choix == 2) {
                // Mini_Rust2.g:143:123: ^( VAR IDF acces_variable )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_acces_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 144:106: -> {choix == 3}? ^( VAR IDF )
            if (choix == 3) {
                // Mini_Rust2.g:144:123: ^( VAR IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 145:106: -> ^( STRUCT IDF struct )
            {
                // Mini_Rust2.g:145:109: ^( STRUCT IDF struct )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, "STRUCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_struct.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable3"

    public static class struct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "struct"
    // Mini_Rust2.g:148:1: struct : '{' ( comm )? ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )? '}' -> ( valeur_attribut_struct ( valeur_attribut_struct )* )? ;
    public final Mini_Rust2Parser.struct_return struct() throws RecognitionException {
        Mini_Rust2Parser.struct_return retval = new Mini_Rust2Parser.struct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal143=null;
        Token char_literal146=null;
        Token char_literal149=null;
        Mini_Rust2Parser.comm_return comm144 = null;

        Mini_Rust2Parser.valeur_attribut_struct_return valeur_attribut_struct145 = null;

        Mini_Rust2Parser.comm_return comm147 = null;

        Mini_Rust2Parser.valeur_attribut_struct_return valeur_attribut_struct148 = null;


        CommonTree char_literal143_tree=null;
        CommonTree char_literal146_tree=null;
        CommonTree char_literal149_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_valeur_attribut_struct=new RewriteRuleSubtreeStream(adaptor,"rule valeur_attribut_struct");
        try {
            // Mini_Rust2.g:148:8: ( '{' ( comm )? ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )? '}' -> ( valeur_attribut_struct ( valeur_attribut_struct )* )? )
            // Mini_Rust2.g:148:10: '{' ( comm )? ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )? '}'
            {
            char_literal143=(Token)match(input,38,FOLLOW_38_in_struct1914);  
            stream_38.add(char_literal143);

            // Mini_Rust2.g:148:14: ( comm )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==78) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // Mini_Rust2.g:148:14: comm
                    {
                    pushFollow(FOLLOW_comm_in_struct1916);
                    comm144=comm();

                    state._fsp--;

                    stream_comm.add(comm144.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:148:20: ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==IDF) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Mini_Rust2.g:148:21: valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )*
                    {
                    pushFollow(FOLLOW_valeur_attribut_struct_in_struct1920);
                    valeur_attribut_struct145=valeur_attribut_struct();

                    state._fsp--;

                    stream_valeur_attribut_struct.add(valeur_attribut_struct145.getTree());
                    // Mini_Rust2.g:148:44: ( ',' ( comm )? valeur_attribut_struct )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==39) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // Mini_Rust2.g:148:45: ',' ( comm )? valeur_attribut_struct
                    	    {
                    	    char_literal146=(Token)match(input,39,FOLLOW_39_in_struct1923);  
                    	    stream_39.add(char_literal146);

                    	    // Mini_Rust2.g:148:49: ( comm )?
                    	    int alt73=2;
                    	    int LA73_0 = input.LA(1);

                    	    if ( (LA73_0==78) ) {
                    	        alt73=1;
                    	    }
                    	    switch (alt73) {
                    	        case 1 :
                    	            // Mini_Rust2.g:148:49: comm
                    	            {
                    	            pushFollow(FOLLOW_comm_in_struct1925);
                    	            comm147=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm147.getTree());

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_valeur_attribut_struct_in_struct1928);
                    	    valeur_attribut_struct148=valeur_attribut_struct();

                    	    state._fsp--;

                    	    stream_valeur_attribut_struct.add(valeur_attribut_struct148.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal149=(Token)match(input,40,FOLLOW_40_in_struct1935);  
            stream_40.add(char_literal149);



            // AST REWRITE
            // elements: valeur_attribut_struct, valeur_attribut_struct
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 148:87: -> ( valeur_attribut_struct ( valeur_attribut_struct )* )?
            {
                // Mini_Rust2.g:148:90: ( valeur_attribut_struct ( valeur_attribut_struct )* )?
                if ( stream_valeur_attribut_struct.hasNext()||stream_valeur_attribut_struct.hasNext() ) {
                    adaptor.addChild(root_0, stream_valeur_attribut_struct.nextTree());
                    // Mini_Rust2.g:148:114: ( valeur_attribut_struct )*
                    while ( stream_valeur_attribut_struct.hasNext() ) {
                        adaptor.addChild(root_0, stream_valeur_attribut_struct.nextTree());

                    }
                    stream_valeur_attribut_struct.reset();

                }
                stream_valeur_attribut_struct.reset();
                stream_valeur_attribut_struct.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "struct"

    public static class fonction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fonction"
    // Mini_Rust2.g:151:1: fonction : '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )? -> ( ^( PARAM_FCT expr ) )* ;
    public final Mini_Rust2Parser.fonction_return fonction() throws RecognitionException {
        Mini_Rust2Parser.fonction_return retval = new Mini_Rust2Parser.fonction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal150=null;
        Token char_literal153=null;
        Token char_literal156=null;
        Mini_Rust2Parser.comm_return comm151 = null;

        Mini_Rust2Parser.expr_return expr152 = null;

        Mini_Rust2Parser.comm_return comm154 = null;

        Mini_Rust2Parser.expr_return expr155 = null;

        Mini_Rust2Parser.comm_return comm157 = null;


        CommonTree char_literal150_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal156_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:151:10: ( '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )? -> ( ^( PARAM_FCT expr ) )* )
            // Mini_Rust2.g:151:12: '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )?
            {
            char_literal150=(Token)match(input,43,FOLLOW_43_in_fonction1963);  
            stream_43.add(char_literal150);

            // Mini_Rust2.g:151:16: ( comm )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==78) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // Mini_Rust2.g:151:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_fonction1965);
                    comm151=comm();

                    state._fsp--;

                    stream_comm.add(comm151.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:151:22: ( expr ( ',' ( comm )? expr )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=IDF && LA79_0<=CST_ENT)||LA79_0==38||LA79_0==43||LA79_0==46||LA79_0==49||LA79_0==56||(LA79_0>=65 && LA79_0<=67)||LA79_0==69) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Mini_Rust2.g:151:23: expr ( ',' ( comm )? expr )*
                    {
                    pushFollow(FOLLOW_expr_in_fonction1969);
                    expr152=expr();

                    state._fsp--;

                    stream_expr.add(expr152.getTree());
                    // Mini_Rust2.g:151:28: ( ',' ( comm )? expr )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==39) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // Mini_Rust2.g:151:30: ',' ( comm )? expr
                    	    {
                    	    char_literal153=(Token)match(input,39,FOLLOW_39_in_fonction1973);  
                    	    stream_39.add(char_literal153);

                    	    // Mini_Rust2.g:151:34: ( comm )?
                    	    int alt77=2;
                    	    int LA77_0 = input.LA(1);

                    	    if ( (LA77_0==78) ) {
                    	        alt77=1;
                    	    }
                    	    switch (alt77) {
                    	        case 1 :
                    	            // Mini_Rust2.g:151:34: comm
                    	            {
                    	            pushFollow(FOLLOW_comm_in_fonction1975);
                    	            comm154=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm154.getTree());

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_expr_in_fonction1978);
                    	    expr155=expr();

                    	    state._fsp--;

                    	    stream_expr.add(expr155.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal156=(Token)match(input,44,FOLLOW_44_in_fonction1984);  
            stream_44.add(char_literal156);

            // Mini_Rust2.g:151:53: ( comm )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==78) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Mini_Rust2.g:151:53: comm
                    {
                    pushFollow(FOLLOW_comm_in_fonction1986);
                    comm157=comm();

                    state._fsp--;

                    stream_comm.add(comm157.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 151:59: -> ( ^( PARAM_FCT expr ) )*
            {
                // Mini_Rust2.g:151:62: ( ^( PARAM_FCT expr ) )*
                while ( stream_expr.hasNext() ) {
                    // Mini_Rust2.g:151:63: ^( PARAM_FCT expr )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM_FCT, "PARAM_FCT"), root_1);

                    adaptor.addChild(root_1, stream_expr.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_expr.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fonction"

    public static class acces_variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "acces_variable"
    // Mini_Rust2.g:154:1: acces_variable : ( '[' ( comm )? expr ']' ( comm )? ( acces_variable )? -> ^( ACCES_VEC expr ( acces_variable )? ) | '.' attribut_vecteur -> attribut_vecteur );
    public final Mini_Rust2Parser.acces_variable_return acces_variable() throws RecognitionException {
        Mini_Rust2Parser.acces_variable_return retval = new Mini_Rust2Parser.acces_variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal158=null;
        Token char_literal161=null;
        Token char_literal164=null;
        Mini_Rust2Parser.comm_return comm159 = null;

        Mini_Rust2Parser.expr_return expr160 = null;

        Mini_Rust2Parser.comm_return comm162 = null;

        Mini_Rust2Parser.acces_variable_return acces_variable163 = null;

        Mini_Rust2Parser.attribut_vecteur_return attribut_vecteur165 = null;


        CommonTree char_literal158_tree=null;
        CommonTree char_literal161_tree=null;
        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_acces_variable=new RewriteRuleSubtreeStream(adaptor,"rule acces_variable");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_attribut_vecteur=new RewriteRuleSubtreeStream(adaptor,"rule attribut_vecteur");
        try {
            // Mini_Rust2.g:154:16: ( '[' ( comm )? expr ']' ( comm )? ( acces_variable )? -> ^( ACCES_VEC expr ( acces_variable )? ) | '.' attribut_vecteur -> attribut_vecteur )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==62) ) {
                alt84=1;
            }
            else if ( (LA84_0==64) ) {
                alt84=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // Mini_Rust2.g:154:18: '[' ( comm )? expr ']' ( comm )? ( acces_variable )?
                    {
                    char_literal158=(Token)match(input,62,FOLLOW_62_in_acces_variable2009);  
                    stream_62.add(char_literal158);

                    // Mini_Rust2.g:154:22: ( comm )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==78) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // Mini_Rust2.g:154:22: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_variable2011);
                            comm159=comm();

                            state._fsp--;

                            stream_comm.add(comm159.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_acces_variable2014);
                    expr160=expr();

                    state._fsp--;

                    stream_expr.add(expr160.getTree());
                    char_literal161=(Token)match(input,63,FOLLOW_63_in_acces_variable2016);  
                    stream_63.add(char_literal161);

                    // Mini_Rust2.g:154:37: ( comm )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==78) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // Mini_Rust2.g:154:37: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_variable2018);
                            comm162=comm();

                            state._fsp--;

                            stream_comm.add(comm162.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:154:43: ( acces_variable )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==62||LA83_0==64) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // Mini_Rust2.g:154:43: acces_variable
                            {
                            pushFollow(FOLLOW_acces_variable_in_acces_variable2021);
                            acces_variable163=acces_variable();

                            state._fsp--;

                            stream_acces_variable.add(acces_variable163.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, acces_variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 154:59: -> ^( ACCES_VEC expr ( acces_variable )? )
                    {
                        // Mini_Rust2.g:154:62: ^( ACCES_VEC expr ( acces_variable )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_VEC, "ACCES_VEC"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Mini_Rust2.g:154:79: ( acces_variable )?
                        if ( stream_acces_variable.hasNext() ) {
                            adaptor.addChild(root_1, stream_acces_variable.nextTree());

                        }
                        stream_acces_variable.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:155:18: '.' attribut_vecteur
                    {
                    char_literal164=(Token)match(input,64,FOLLOW_64_in_acces_variable2052);  
                    stream_64.add(char_literal164);

                    pushFollow(FOLLOW_attribut_vecteur_in_acces_variable2054);
                    attribut_vecteur165=attribut_vecteur();

                    state._fsp--;

                    stream_attribut_vecteur.add(attribut_vecteur165.getTree());


                    // AST REWRITE
                    // elements: attribut_vecteur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 155:39: -> attribut_vecteur
                    {
                        adaptor.addChild(root_0, stream_attribut_vecteur.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "acces_variable"

    public static class variable2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable2"
    // Mini_Rust2.g:158:1: variable2 : ( 'true' ( comm )? -> 'true' | 'false' ( comm )? -> 'false' | CST_ENT ( comm )? -> CST_ENT | 'Vec' ( comm )? '!' ( comm )? '[' ( comm )? ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )? ']' ( comm )? -> ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? ) );
    public final Mini_Rust2Parser.variable2_return variable2() throws RecognitionException {
        Mini_Rust2Parser.variable2_return retval = new Mini_Rust2Parser.variable2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal166=null;
        Token string_literal168=null;
        Token CST_ENT170=null;
        Token string_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal179=null;
        Token char_literal182=null;
        Mini_Rust2Parser.comm_return comm167 = null;

        Mini_Rust2Parser.comm_return comm169 = null;

        Mini_Rust2Parser.comm_return comm171 = null;

        Mini_Rust2Parser.comm_return comm173 = null;

        Mini_Rust2Parser.comm_return comm175 = null;

        Mini_Rust2Parser.comm_return comm177 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4178 = null;

        Mini_Rust2Parser.comm_return comm180 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4181 = null;

        Mini_Rust2Parser.comm_return comm183 = null;


        CommonTree string_literal166_tree=null;
        CommonTree string_literal168_tree=null;
        CommonTree CST_ENT170_tree=null;
        CommonTree string_literal172_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal176_tree=null;
        CommonTree char_literal179_tree=null;
        CommonTree char_literal182_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_CST_ENT=new RewriteRuleTokenStream(adaptor,"token CST_ENT");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_operations_prio4=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4");
        try {
            // Mini_Rust2.g:158:11: ( 'true' ( comm )? -> 'true' | 'false' ( comm )? -> 'false' | CST_ENT ( comm )? -> CST_ENT | 'Vec' ( comm )? '!' ( comm )? '[' ( comm )? ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )? ']' ( comm )? -> ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? ) )
            int alt95=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt95=1;
                }
                break;
            case 66:
                {
                alt95=2;
                }
                break;
            case CST_ENT:
                {
                alt95=3;
                }
                break;
            case 46:
                {
                alt95=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // Mini_Rust2.g:158:13: 'true' ( comm )?
                    {
                    string_literal166=(Token)match(input,65,FOLLOW_65_in_variable22082);  
                    stream_65.add(string_literal166);

                    // Mini_Rust2.g:158:20: ( comm )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==78) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // Mini_Rust2.g:158:20: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22084);
                            comm167=comm();

                            state._fsp--;

                            stream_comm.add(comm167.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 65
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:26: -> 'true'
                    {
                        adaptor.addChild(root_0, stream_65.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:159:13: 'false' ( comm )?
                    {
                    string_literal168=(Token)match(input,66,FOLLOW_66_in_variable22103);  
                    stream_66.add(string_literal168);

                    // Mini_Rust2.g:159:21: ( comm )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==78) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // Mini_Rust2.g:159:21: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22105);
                            comm169=comm();

                            state._fsp--;

                            stream_comm.add(comm169.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 66
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 159:27: -> 'false'
                    {
                        adaptor.addChild(root_0, stream_66.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:160:13: CST_ENT ( comm )?
                    {
                    CST_ENT170=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_variable22124);  
                    stream_CST_ENT.add(CST_ENT170);

                    // Mini_Rust2.g:160:21: ( comm )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==78) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // Mini_Rust2.g:160:21: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22126);
                            comm171=comm();

                            state._fsp--;

                            stream_comm.add(comm171.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: CST_ENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 160:27: -> CST_ENT
                    {
                        adaptor.addChild(root_0, stream_CST_ENT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:161:13: 'Vec' ( comm )? '!' ( comm )? '[' ( comm )? ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )? ']' ( comm )?
                    {
                    string_literal172=(Token)match(input,46,FOLLOW_46_in_variable22145);  
                    stream_46.add(string_literal172);

                    // Mini_Rust2.g:161:19: ( comm )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==78) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // Mini_Rust2.g:161:19: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22147);
                            comm173=comm();

                            state._fsp--;

                            stream_comm.add(comm173.getTree());

                            }
                            break;

                    }

                    char_literal174=(Token)match(input,56,FOLLOW_56_in_variable22150);  
                    stream_56.add(char_literal174);

                    // Mini_Rust2.g:161:29: ( comm )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==78) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Mini_Rust2.g:161:29: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22152);
                            comm175=comm();

                            state._fsp--;

                            stream_comm.add(comm175.getTree());

                            }
                            break;

                    }

                    char_literal176=(Token)match(input,62,FOLLOW_62_in_variable22155);  
                    stream_62.add(char_literal176);

                    // Mini_Rust2.g:161:39: ( comm )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==78) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // Mini_Rust2.g:161:39: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22157);
                            comm177=comm();

                            state._fsp--;

                            stream_comm.add(comm177.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:161:45: ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( ((LA93_0>=IDF && LA93_0<=CST_ENT)||LA93_0==43||LA93_0==46||LA93_0==49||LA93_0==56||(LA93_0>=65 && LA93_0<=67)||LA93_0==69) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Mini_Rust2.g:161:47: operations_prio4 ( ',' ( comm )? operations_prio4 )*
                            {
                            pushFollow(FOLLOW_operations_prio4_in_variable22162);
                            operations_prio4178=operations_prio4();

                            state._fsp--;

                            stream_operations_prio4.add(operations_prio4178.getTree());
                            // Mini_Rust2.g:161:64: ( ',' ( comm )? operations_prio4 )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( (LA92_0==39) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // Mini_Rust2.g:161:65: ',' ( comm )? operations_prio4
                            	    {
                            	    char_literal179=(Token)match(input,39,FOLLOW_39_in_variable22165);  
                            	    stream_39.add(char_literal179);

                            	    // Mini_Rust2.g:161:69: ( comm )?
                            	    int alt91=2;
                            	    int LA91_0 = input.LA(1);

                            	    if ( (LA91_0==78) ) {
                            	        alt91=1;
                            	    }
                            	    switch (alt91) {
                            	        case 1 :
                            	            // Mini_Rust2.g:161:69: comm
                            	            {
                            	            pushFollow(FOLLOW_comm_in_variable22167);
                            	            comm180=comm();

                            	            state._fsp--;

                            	            stream_comm.add(comm180.getTree());

                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_operations_prio4_in_variable22170);
                            	    operations_prio4181=operations_prio4();

                            	    state._fsp--;

                            	    stream_operations_prio4.add(operations_prio4181.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop92;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal182=(Token)match(input,63,FOLLOW_63_in_variable22176);  
                    stream_63.add(char_literal182);

                    // Mini_Rust2.g:161:100: ( comm )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==78) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Mini_Rust2.g:161:100: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable22178);
                            comm183=comm();

                            state._fsp--;

                            stream_comm.add(comm183.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: operations_prio4, operations_prio4
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:106: -> ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? )
                    {
                        // Mini_Rust2.g:161:109: ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_VEC, "DECL_VEC"), root_1);

                        // Mini_Rust2.g:161:120: ( operations_prio4 ( operations_prio4 )* )?
                        if ( stream_operations_prio4.hasNext()||stream_operations_prio4.hasNext() ) {
                            adaptor.addChild(root_1, stream_operations_prio4.nextTree());
                            // Mini_Rust2.g:161:138: ( operations_prio4 )*
                            while ( stream_operations_prio4.hasNext() ) {
                                adaptor.addChild(root_1, stream_operations_prio4.nextTree());

                            }
                            stream_operations_prio4.reset();

                        }
                        stream_operations_prio4.reset();
                        stream_operations_prio4.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable2"

    public static class accesseur_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "accesseur"
    // Mini_Rust2.g:164:1: accesseur : ( IDF ( acces_accesseur )? | '*' accesseur -> ^( POINTEUR_VAL accesseur ) );
    public final Mini_Rust2Parser.accesseur_return accesseur() throws RecognitionException {
        Mini_Rust2Parser.accesseur_return retval = new Mini_Rust2Parser.accesseur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF184=null;
        Token char_literal186=null;
        Mini_Rust2Parser.acces_accesseur_return acces_accesseur185 = null;

        Mini_Rust2Parser.accesseur_return accesseur187 = null;


        CommonTree IDF184_tree=null;
        CommonTree char_literal186_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_accesseur=new RewriteRuleSubtreeStream(adaptor,"rule accesseur");
        try {
            // Mini_Rust2.g:164:11: ( IDF ( acces_accesseur )? | '*' accesseur -> ^( POINTEUR_VAL accesseur ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==IDF) ) {
                alt97=1;
            }
            else if ( (LA97_0==67) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // Mini_Rust2.g:164:13: IDF ( acces_accesseur )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF184=(Token)match(input,IDF,FOLLOW_IDF_in_accesseur2214); 
                    IDF184_tree = (CommonTree)adaptor.create(IDF184);
                    adaptor.addChild(root_0, IDF184_tree);

                    // Mini_Rust2.g:164:17: ( acces_accesseur )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==62||LA96_0==64) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Mini_Rust2.g:164:17: acces_accesseur
                            {
                            pushFollow(FOLLOW_acces_accesseur_in_accesseur2216);
                            acces_accesseur185=acces_accesseur();

                            state._fsp--;

                            adaptor.addChild(root_0, acces_accesseur185.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:165:13: '*' accesseur
                    {
                    char_literal186=(Token)match(input,67,FOLLOW_67_in_accesseur2231);  
                    stream_67.add(char_literal186);

                    pushFollow(FOLLOW_accesseur_in_accesseur2233);
                    accesseur187=accesseur();

                    state._fsp--;

                    stream_accesseur.add(accesseur187.getTree());


                    // AST REWRITE
                    // elements: accesseur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 165:27: -> ^( POINTEUR_VAL accesseur )
                    {
                        // Mini_Rust2.g:165:30: ^( POINTEUR_VAL accesseur )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POINTEUR_VAL, "POINTEUR_VAL"), root_1);

                        adaptor.addChild(root_1, stream_accesseur.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "accesseur"

    public static class valeur_attribut_struct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valeur_attribut_struct"
    // Mini_Rust2.g:168:1: valeur_attribut_struct : IDF ':' operations_prio4 -> ^( VAL_ATTRIBUT IDF operations_prio4 ) ;
    public final Mini_Rust2Parser.valeur_attribut_struct_return valeur_attribut_struct() throws RecognitionException {
        Mini_Rust2Parser.valeur_attribut_struct_return retval = new Mini_Rust2Parser.valeur_attribut_struct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF188=null;
        Token char_literal189=null;
        Mini_Rust2Parser.operations_prio4_return operations_prio4190 = null;


        CommonTree IDF188_tree=null;
        CommonTree char_literal189_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_operations_prio4=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4");
        try {
            // Mini_Rust2.g:168:24: ( IDF ':' operations_prio4 -> ^( VAL_ATTRIBUT IDF operations_prio4 ) )
            // Mini_Rust2.g:168:26: IDF ':' operations_prio4
            {
            IDF188=(Token)match(input,IDF,FOLLOW_IDF_in_valeur_attribut_struct2260);  
            stream_IDF.add(IDF188);

            char_literal189=(Token)match(input,41,FOLLOW_41_in_valeur_attribut_struct2262);  
            stream_41.add(char_literal189);

            pushFollow(FOLLOW_operations_prio4_in_valeur_attribut_struct2264);
            operations_prio4190=operations_prio4();

            state._fsp--;

            stream_operations_prio4.add(operations_prio4190.getTree());


            // AST REWRITE
            // elements: IDF, operations_prio4
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 168:51: -> ^( VAL_ATTRIBUT IDF operations_prio4 )
            {
                // Mini_Rust2.g:168:54: ^( VAL_ATTRIBUT IDF operations_prio4 )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL_ATTRIBUT, "VAL_ATTRIBUT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_operations_prio4.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "valeur_attribut_struct"

    public static class operations_prio4b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio4b"
    // Mini_Rust2.g:172:1: operations_prio4b : operations_prio3b ( prio4 operations_prio4b )? ;
    public final Mini_Rust2Parser.operations_prio4b_return operations_prio4b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio4b_return retval = new Mini_Rust2Parser.operations_prio4b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio3b_return operations_prio3b191 = null;

        Mini_Rust2Parser.prio4_return prio4192 = null;

        Mini_Rust2Parser.operations_prio4b_return operations_prio4b193 = null;



        try {
            // Mini_Rust2.g:172:19: ( operations_prio3b ( prio4 operations_prio4b )? )
            // Mini_Rust2.g:172:21: operations_prio3b ( prio4 operations_prio4b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio3b_in_operations_prio4b2307);
            operations_prio3b191=operations_prio3b();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio3b191.getTree());
            // Mini_Rust2.g:172:39: ( prio4 operations_prio4b )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=76 && LA98_0<=77)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Mini_Rust2.g:172:40: prio4 operations_prio4b
                    {
                    pushFollow(FOLLOW_prio4_in_operations_prio4b2310);
                    prio4192=prio4();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio4192.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio4b_in_operations_prio4b2314);
                    operations_prio4b193=operations_prio4b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4b193.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio4b"

    public static class operations_prio3b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio3b"
    // Mini_Rust2.g:175:1: operations_prio3b : operations_prio2b ( prio3 operations_prio3b )? ;
    public final Mini_Rust2Parser.operations_prio3b_return operations_prio3b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio3b_return retval = new Mini_Rust2Parser.operations_prio3b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio2b_return operations_prio2b194 = null;

        Mini_Rust2Parser.prio3_return prio3195 = null;

        Mini_Rust2Parser.operations_prio3b_return operations_prio3b196 = null;



        try {
            // Mini_Rust2.g:175:19: ( operations_prio2b ( prio3 operations_prio3b )? )
            // Mini_Rust2.g:175:21: operations_prio2b ( prio3 operations_prio3b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio2b_in_operations_prio3b2342);
            operations_prio2b194=operations_prio2b();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio2b194.getTree());
            // Mini_Rust2.g:175:39: ( prio3 operations_prio3b )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( ((LA99_0>=47 && LA99_0<=48)||(LA99_0>=72 && LA99_0<=75)) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // Mini_Rust2.g:175:40: prio3 operations_prio3b
                    {
                    pushFollow(FOLLOW_prio3_in_operations_prio3b2345);
                    prio3195=prio3();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio3195.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio3b_in_operations_prio3b2349);
                    operations_prio3b196=operations_prio3b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3b196.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio3b"

    public static class operations_prio2b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio2b"
    // Mini_Rust2.g:178:1: operations_prio2b : operations_prio1b ( prio2 operations_prio2b )? ;
    public final Mini_Rust2Parser.operations_prio2b_return operations_prio2b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio2b_return retval = new Mini_Rust2Parser.operations_prio2b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio1b_return operations_prio1b197 = null;

        Mini_Rust2Parser.prio2_return prio2198 = null;

        Mini_Rust2Parser.operations_prio2b_return operations_prio2b199 = null;



        try {
            // Mini_Rust2.g:178:19: ( operations_prio1b ( prio2 operations_prio2b )? )
            // Mini_Rust2.g:178:21: operations_prio1b ( prio2 operations_prio2b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio1b_in_operations_prio2b2377);
            operations_prio1b197=operations_prio1b();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio1b197.getTree());
            // Mini_Rust2.g:178:39: ( prio2 operations_prio2b )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==69||LA100_0==71) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Mini_Rust2.g:178:40: prio2 operations_prio2b
                    {
                    pushFollow(FOLLOW_prio2_in_operations_prio2b2380);
                    prio2198=prio2();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio2198.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio2b_in_operations_prio2b2384);
                    operations_prio2b199=operations_prio2b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2b199.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio2b"

    public static class operations_prio1b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio1b"
    // Mini_Rust2.g:181:1: operations_prio1b : ( unaire )? operations_unairesb ( prio1 operations_prio1b )? ;
    public final Mini_Rust2Parser.operations_prio1b_return operations_prio1b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio1b_return retval = new Mini_Rust2Parser.operations_prio1b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_return unaire200 = null;

        Mini_Rust2Parser.operations_unairesb_return operations_unairesb201 = null;

        Mini_Rust2Parser.prio1_return prio1202 = null;

        Mini_Rust2Parser.operations_prio1b_return operations_prio1b203 = null;



        try {
            // Mini_Rust2.g:181:19: ( ( unaire )? operations_unairesb ( prio1 operations_prio1b )? )
            // Mini_Rust2.g:181:21: ( unaire )? operations_unairesb ( prio1 operations_prio1b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // Mini_Rust2.g:181:21: ( unaire )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==56||LA101_0==69) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Mini_Rust2.g:181:22: unaire
                    {
                    pushFollow(FOLLOW_unaire_in_operations_prio1b2413);
                    unaire200=unaire();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(unaire200.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_operations_unairesb_in_operations_prio1b2419);
            operations_unairesb201=operations_unairesb();

            state._fsp--;

            adaptor.addChild(root_0, operations_unairesb201.getTree());
            // Mini_Rust2.g:181:53: ( prio1 operations_prio1b )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==67||LA102_0==70) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Mini_Rust2.g:181:54: prio1 operations_prio1b
                    {
                    pushFollow(FOLLOW_prio1_in_operations_prio1b2422);
                    prio1202=prio1();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio1202.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio1b_in_operations_prio1b2426);
                    operations_prio1b203=operations_prio1b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1b203.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_prio1b"

    public static class operations_unairesb_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_unairesb"
    // Mini_Rust2.g:184:1: operations_unairesb : ( '(' operations_prio4b ')' -> ^( operations_prio4b ) | variableb );
    public final Mini_Rust2Parser.operations_unairesb_return operations_unairesb() throws RecognitionException {
        Mini_Rust2Parser.operations_unairesb_return retval = new Mini_Rust2Parser.operations_unairesb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal204=null;
        Token char_literal206=null;
        Mini_Rust2Parser.operations_prio4b_return operations_prio4b205 = null;

        Mini_Rust2Parser.variableb_return variableb207 = null;


        CommonTree char_literal204_tree=null;
        CommonTree char_literal206_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_operations_prio4b=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4b");
        try {
            // Mini_Rust2.g:184:21: ( '(' operations_prio4b ')' -> ^( operations_prio4b ) | variableb )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==43) ) {
                alt103=1;
            }
            else if ( ((LA103_0>=IDF && LA103_0<=CST_ENT)||LA103_0==46||LA103_0==49||(LA103_0>=65 && LA103_0<=67)) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // Mini_Rust2.g:184:23: '(' operations_prio4b ')'
                    {
                    char_literal204=(Token)match(input,43,FOLLOW_43_in_operations_unairesb2454);  
                    stream_43.add(char_literal204);

                    pushFollow(FOLLOW_operations_prio4b_in_operations_unairesb2456);
                    operations_prio4b205=operations_prio4b();

                    state._fsp--;

                    stream_operations_prio4b.add(operations_prio4b205.getTree());
                    char_literal206=(Token)match(input,44,FOLLOW_44_in_operations_unairesb2458);  
                    stream_44.add(char_literal206);



                    // AST REWRITE
                    // elements: operations_prio4b
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:49: -> ^( operations_prio4b )
                    {
                        // Mini_Rust2.g:184:52: ^( operations_prio4b )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_operations_prio4b.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:185:22: variableb
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variableb_in_operations_unairesb2487);
                    variableb207=variableb();

                    state._fsp--;

                    adaptor.addChild(root_0, variableb207.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operations_unairesb"

    public static class variableb_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableb"
    // Mini_Rust2.g:188:1: variableb : ( unaire_varb | variable2 );
    public final Mini_Rust2Parser.variableb_return variableb() throws RecognitionException {
        Mini_Rust2Parser.variableb_return retval = new Mini_Rust2Parser.variableb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_varb_return unaire_varb208 = null;

        Mini_Rust2Parser.variable2_return variable2209 = null;



        try {
            // Mini_Rust2.g:188:11: ( unaire_varb | variable2 )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==IDF||LA104_0==49||LA104_0==67) ) {
                alt104=1;
            }
            else if ( (LA104_0==CST_ENT||LA104_0==46||(LA104_0>=65 && LA104_0<=66)) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // Mini_Rust2.g:188:13: unaire_varb
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaire_varb_in_variableb2515);
                    unaire_varb208=unaire_varb();

                    state._fsp--;

                    adaptor.addChild(root_0, unaire_varb208.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:189:13: variable2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable2_in_variableb2529);
                    variable2209=variable2();

                    state._fsp--;

                    adaptor.addChild(root_0, variable2209.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableb"

    public static class unaire_varb_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaire_varb"
    // Mini_Rust2.g:192:1: unaire_varb : ( unaire2 unaire_varb -> ^( unaire2 unaire_varb ) | variable3b );
    public final Mini_Rust2Parser.unaire_varb_return unaire_varb() throws RecognitionException {
        Mini_Rust2Parser.unaire_varb_return retval = new Mini_Rust2Parser.unaire_varb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire2_return unaire2210 = null;

        Mini_Rust2Parser.unaire_varb_return unaire_varb211 = null;

        Mini_Rust2Parser.variable3b_return variable3b212 = null;


        RewriteRuleSubtreeStream stream_unaire2=new RewriteRuleSubtreeStream(adaptor,"rule unaire2");
        RewriteRuleSubtreeStream stream_unaire_varb=new RewriteRuleSubtreeStream(adaptor,"rule unaire_varb");
        try {
            // Mini_Rust2.g:192:13: ( unaire2 unaire_varb -> ^( unaire2 unaire_varb ) | variable3b )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==49||LA105_0==67) ) {
                alt105=1;
            }
            else if ( (LA105_0==IDF) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // Mini_Rust2.g:192:15: unaire2 unaire_varb
                    {
                    pushFollow(FOLLOW_unaire2_in_unaire_varb2548);
                    unaire2210=unaire2();

                    state._fsp--;

                    stream_unaire2.add(unaire2210.getTree());
                    pushFollow(FOLLOW_unaire_varb_in_unaire_varb2550);
                    unaire_varb211=unaire_varb();

                    state._fsp--;

                    stream_unaire_varb.add(unaire_varb211.getTree());


                    // AST REWRITE
                    // elements: unaire2, unaire_varb
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 192:35: -> ^( unaire2 unaire_varb )
                    {
                        // Mini_Rust2.g:192:38: ^( unaire2 unaire_varb )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_unaire2.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_unaire_varb.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:193:15: variable3b
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable3b_in_unaire_varb2574);
                    variable3b212=variable3b();

                    state._fsp--;

                    adaptor.addChild(root_0, variable3b212.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaire_varb"

    public static class variable3b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable3b"
    // Mini_Rust2.g:196:1: variable3b : IDF ( acces_variable | ( fonction ) | ) -> {choix==1}? ^( APPEL_FCT IDF fonction ) -> {choix == 2}? ^( VAR IDF ) -> ^( VAR IDF acces_variable ) ;
    public final Mini_Rust2Parser.variable3b_return variable3b() throws RecognitionException {
        Mini_Rust2Parser.variable3b_return retval = new Mini_Rust2Parser.variable3b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF213=null;
        Mini_Rust2Parser.acces_variable_return acces_variable214 = null;

        Mini_Rust2Parser.fonction_return fonction215 = null;


        CommonTree IDF213_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_acces_variable=new RewriteRuleSubtreeStream(adaptor,"rule acces_variable");
        RewriteRuleSubtreeStream stream_fonction=new RewriteRuleSubtreeStream(adaptor,"rule fonction");
        int choix = 0;
        try {
            // Mini_Rust2.g:197:24: ( IDF ( acces_variable | ( fonction ) | ) -> {choix==1}? ^( APPEL_FCT IDF fonction ) -> {choix == 2}? ^( VAR IDF ) -> ^( VAR IDF acces_variable ) )
            // Mini_Rust2.g:197:26: IDF ( acces_variable | ( fonction ) | )
            {
            IDF213=(Token)match(input,IDF,FOLLOW_IDF_in_variable3b2600);  
            stream_IDF.add(IDF213);

            // Mini_Rust2.g:197:30: ( acces_variable | ( fonction ) | )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 62:
            case 64:
                {
                alt106=1;
                }
                break;
            case 43:
                {
                alt106=2;
                }
                break;
            case 38:
            case 44:
            case 47:
            case 48:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // Mini_Rust2.g:197:31: acces_variable
                    {
                    pushFollow(FOLLOW_acces_variable_in_variable3b2603);
                    acces_variable214=acces_variable();

                    state._fsp--;

                    stream_acces_variable.add(acces_variable214.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:197:48: ( fonction )
                    {
                    // Mini_Rust2.g:197:48: ( fonction )
                    // Mini_Rust2.g:197:49: fonction
                    {
                    pushFollow(FOLLOW_fonction_in_variable3b2608);
                    fonction215=fonction();

                    state._fsp--;

                    stream_fonction.add(fonction215.getTree());
                    choix=1;

                    }


                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:197:72: 
                    {
                    choix=2;

                    }
                    break;

            }



            // AST REWRITE
            // elements: IDF, IDF, fonction, acces_variable, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:84: -> {choix==1}? ^( APPEL_FCT IDF fonction )
            if (choix==1) {
                // Mini_Rust2.g:197:99: ^( APPEL_FCT IDF fonction )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPEL_FCT, "APPEL_FCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_fonction.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 198:84: -> {choix == 2}? ^( VAR IDF )
            if (choix == 2) {
                // Mini_Rust2.g:198:101: ^( VAR IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 199:84: -> ^( VAR IDF acces_variable )
            {
                // Mini_Rust2.g:199:87: ^( VAR IDF acces_variable )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_acces_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable3b"

    public static class attribut_vecteur_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribut_vecteur"
    // Mini_Rust2.g:203:1: attribut_vecteur : ( 'len' ( comm )? '(' ( comm )? ')' ( comm )? -> 'len' | IDF ( acces_variable )? -> ^( ACCES_ATTRIBUT IDF ( acces_variable )? ) );
    public final Mini_Rust2Parser.attribut_vecteur_return attribut_vecteur() throws RecognitionException {
        Mini_Rust2Parser.attribut_vecteur_return retval = new Mini_Rust2Parser.attribut_vecteur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal216=null;
        Token char_literal218=null;
        Token char_literal220=null;
        Token IDF222=null;
        Mini_Rust2Parser.comm_return comm217 = null;

        Mini_Rust2Parser.comm_return comm219 = null;

        Mini_Rust2Parser.comm_return comm221 = null;

        Mini_Rust2Parser.acces_variable_return acces_variable223 = null;


        CommonTree string_literal216_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal220_tree=null;
        CommonTree IDF222_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_acces_variable=new RewriteRuleSubtreeStream(adaptor,"rule acces_variable");
        try {
            // Mini_Rust2.g:203:18: ( 'len' ( comm )? '(' ( comm )? ')' ( comm )? -> 'len' | IDF ( acces_variable )? -> ^( ACCES_ATTRIBUT IDF ( acces_variable )? ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==68) ) {
                alt111=1;
            }
            else if ( (LA111_0==IDF) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // Mini_Rust2.g:203:20: 'len' ( comm )? '(' ( comm )? ')' ( comm )?
                    {
                    string_literal216=(Token)match(input,68,FOLLOW_68_in_attribut_vecteur2836);  
                    stream_68.add(string_literal216);

                    // Mini_Rust2.g:203:26: ( comm )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==78) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Mini_Rust2.g:203:26: comm
                            {
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2838);
                            comm217=comm();

                            state._fsp--;

                            stream_comm.add(comm217.getTree());

                            }
                            break;

                    }

                    char_literal218=(Token)match(input,43,FOLLOW_43_in_attribut_vecteur2841);  
                    stream_43.add(char_literal218);

                    // Mini_Rust2.g:203:36: ( comm )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==78) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Mini_Rust2.g:203:36: comm
                            {
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2843);
                            comm219=comm();

                            state._fsp--;

                            stream_comm.add(comm219.getTree());

                            }
                            break;

                    }

                    char_literal220=(Token)match(input,44,FOLLOW_44_in_attribut_vecteur2846);  
                    stream_44.add(char_literal220);

                    // Mini_Rust2.g:203:46: ( comm )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==78) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Mini_Rust2.g:203:46: comm
                            {
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2848);
                            comm221=comm();

                            state._fsp--;

                            stream_comm.add(comm221.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 68
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 203:52: -> 'len'
                    {
                        adaptor.addChild(root_0, stream_68.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:204:20: IDF ( acces_variable )?
                    {
                    IDF222=(Token)match(input,IDF,FOLLOW_IDF_in_attribut_vecteur2874);  
                    stream_IDF.add(IDF222);

                    // Mini_Rust2.g:204:24: ( acces_variable )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==62||LA110_0==64) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // Mini_Rust2.g:204:24: acces_variable
                            {
                            pushFollow(FOLLOW_acces_variable_in_attribut_vecteur2876);
                            acces_variable223=acces_variable();

                            state._fsp--;

                            stream_acces_variable.add(acces_variable223.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDF, acces_variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 204:40: -> ^( ACCES_ATTRIBUT IDF ( acces_variable )? )
                    {
                        // Mini_Rust2.g:204:43: ^( ACCES_ATTRIBUT IDF ( acces_variable )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_ATTRIBUT, "ACCES_ATTRIBUT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Mini_Rust2.g:204:64: ( acces_variable )?
                        if ( stream_acces_variable.hasNext() ) {
                            adaptor.addChild(root_1, stream_acces_variable.nextTree());

                        }
                        stream_acces_variable.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribut_vecteur"

    public static class acces_accesseur_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "acces_accesseur"
    // Mini_Rust2.g:207:1: acces_accesseur : ( '[' ( comm )? expr ']' ( comm )? ( acces_accesseur )? -> ^( ACCES_VEC expr ( acces_accesseur )? ) | '.' IDF ( acces_accesseur )? -> ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? ) );
    public final Mini_Rust2Parser.acces_accesseur_return acces_accesseur() throws RecognitionException {
        Mini_Rust2Parser.acces_accesseur_return retval = new Mini_Rust2Parser.acces_accesseur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal224=null;
        Token char_literal227=null;
        Token char_literal230=null;
        Token IDF231=null;
        Mini_Rust2Parser.comm_return comm225 = null;

        Mini_Rust2Parser.expr_return expr226 = null;

        Mini_Rust2Parser.comm_return comm228 = null;

        Mini_Rust2Parser.acces_accesseur_return acces_accesseur229 = null;

        Mini_Rust2Parser.acces_accesseur_return acces_accesseur232 = null;


        CommonTree char_literal224_tree=null;
        CommonTree char_literal227_tree=null;
        CommonTree char_literal230_tree=null;
        CommonTree IDF231_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_acces_accesseur=new RewriteRuleSubtreeStream(adaptor,"rule acces_accesseur");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:207:17: ( '[' ( comm )? expr ']' ( comm )? ( acces_accesseur )? -> ^( ACCES_VEC expr ( acces_accesseur )? ) | '.' IDF ( acces_accesseur )? -> ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==62) ) {
                alt116=1;
            }
            else if ( (LA116_0==64) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // Mini_Rust2.g:207:19: '[' ( comm )? expr ']' ( comm )? ( acces_accesseur )?
                    {
                    char_literal224=(Token)match(input,62,FOLLOW_62_in_acces_accesseur2914);  
                    stream_62.add(char_literal224);

                    // Mini_Rust2.g:207:23: ( comm )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==78) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Mini_Rust2.g:207:23: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_accesseur2916);
                            comm225=comm();

                            state._fsp--;

                            stream_comm.add(comm225.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_acces_accesseur2919);
                    expr226=expr();

                    state._fsp--;

                    stream_expr.add(expr226.getTree());
                    char_literal227=(Token)match(input,63,FOLLOW_63_in_acces_accesseur2921);  
                    stream_63.add(char_literal227);

                    // Mini_Rust2.g:207:38: ( comm )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==78) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // Mini_Rust2.g:207:38: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_accesseur2923);
                            comm228=comm();

                            state._fsp--;

                            stream_comm.add(comm228.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:207:44: ( acces_accesseur )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==62||LA114_0==64) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // Mini_Rust2.g:207:44: acces_accesseur
                            {
                            pushFollow(FOLLOW_acces_accesseur_in_acces_accesseur2926);
                            acces_accesseur229=acces_accesseur();

                            state._fsp--;

                            stream_acces_accesseur.add(acces_accesseur229.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: acces_accesseur, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 207:61: -> ^( ACCES_VEC expr ( acces_accesseur )? )
                    {
                        // Mini_Rust2.g:207:64: ^( ACCES_VEC expr ( acces_accesseur )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_VEC, "ACCES_VEC"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Mini_Rust2.g:207:81: ( acces_accesseur )?
                        if ( stream_acces_accesseur.hasNext() ) {
                            adaptor.addChild(root_1, stream_acces_accesseur.nextTree());

                        }
                        stream_acces_accesseur.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:208:19: '.' IDF ( acces_accesseur )?
                    {
                    char_literal230=(Token)match(input,64,FOLLOW_64_in_acces_accesseur2958);  
                    stream_64.add(char_literal230);

                    IDF231=(Token)match(input,IDF,FOLLOW_IDF_in_acces_accesseur2960);  
                    stream_IDF.add(IDF231);

                    // Mini_Rust2.g:208:27: ( acces_accesseur )?
                    int alt115=2;
                    int LA115_0 = input.LA(1);

                    if ( (LA115_0==62||LA115_0==64) ) {
                        alt115=1;
                    }
                    switch (alt115) {
                        case 1 :
                            // Mini_Rust2.g:208:27: acces_accesseur
                            {
                            pushFollow(FOLLOW_acces_accesseur_in_acces_accesseur2962);
                            acces_accesseur232=acces_accesseur();

                            state._fsp--;

                            stream_acces_accesseur.add(acces_accesseur232.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: IDF, acces_accesseur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 208:44: -> ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? )
                    {
                        // Mini_Rust2.g:208:47: ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_ATTRIBUT, "ACCES_ATTRIBUT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Mini_Rust2.g:208:68: ( acces_accesseur )?
                        if ( stream_acces_accesseur.hasNext() ) {
                            adaptor.addChild(root_1, stream_acces_accesseur.nextTree());

                        }
                        stream_acces_accesseur.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "acces_accesseur"

    public static class unaire_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaire"
    // Mini_Rust2.g:211:1: unaire : ( '!' ( comm )? -> '!' | '-' ( comm )? -> '-' );
    public final Mini_Rust2Parser.unaire_return unaire() throws RecognitionException {
        Mini_Rust2Parser.unaire_return retval = new Mini_Rust2Parser.unaire_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal233=null;
        Token char_literal235=null;
        Mini_Rust2Parser.comm_return comm234 = null;

        Mini_Rust2Parser.comm_return comm236 = null;


        CommonTree char_literal233_tree=null;
        CommonTree char_literal235_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:211:8: ( '!' ( comm )? -> '!' | '-' ( comm )? -> '-' )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==56) ) {
                alt119=1;
            }
            else if ( (LA119_0==69) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // Mini_Rust2.g:211:10: '!' ( comm )?
                    {
                    char_literal233=(Token)match(input,56,FOLLOW_56_in_unaire2999);  
                    stream_56.add(char_literal233);

                    // Mini_Rust2.g:211:14: ( comm )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==78) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // Mini_Rust2.g:211:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire3001);
                            comm234=comm();

                            state._fsp--;

                            stream_comm.add(comm234.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:20: -> '!'
                    {
                        adaptor.addChild(root_0, stream_56.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:212:10: '-' ( comm )?
                    {
                    char_literal235=(Token)match(input,69,FOLLOW_69_in_unaire3017);  
                    stream_69.add(char_literal235);

                    // Mini_Rust2.g:212:14: ( comm )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==78) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // Mini_Rust2.g:212:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire3019);
                            comm236=comm();

                            state._fsp--;

                            stream_comm.add(comm236.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 69
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 212:20: -> '-'
                    {
                        adaptor.addChild(root_0, stream_69.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaire"

    public static class unaire2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaire2"
    // Mini_Rust2.g:215:1: unaire2 : ( '*' ( comm )? -> POINTEUR_VAL | '&' ( comm )? -> '&' );
    public final Mini_Rust2Parser.unaire2_return unaire2() throws RecognitionException {
        Mini_Rust2Parser.unaire2_return retval = new Mini_Rust2Parser.unaire2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal237=null;
        Token char_literal239=null;
        Mini_Rust2Parser.comm_return comm238 = null;

        Mini_Rust2Parser.comm_return comm240 = null;


        CommonTree char_literal237_tree=null;
        CommonTree char_literal239_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:215:9: ( '*' ( comm )? -> POINTEUR_VAL | '&' ( comm )? -> '&' )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==67) ) {
                alt122=1;
            }
            else if ( (LA122_0==49) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // Mini_Rust2.g:215:11: '*' ( comm )?
                    {
                    char_literal237=(Token)match(input,67,FOLLOW_67_in_unaire23040);  
                    stream_67.add(char_literal237);

                    // Mini_Rust2.g:215:15: ( comm )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==78) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // Mini_Rust2.g:215:15: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire23042);
                            comm238=comm();

                            state._fsp--;

                            stream_comm.add(comm238.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 215:21: -> POINTEUR_VAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(POINTEUR_VAL, "POINTEUR_VAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:216:11: '&' ( comm )?
                    {
                    char_literal239=(Token)match(input,49,FOLLOW_49_in_unaire23059);  
                    stream_49.add(char_literal239);

                    // Mini_Rust2.g:216:15: ( comm )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==78) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // Mini_Rust2.g:216:15: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire23061);
                            comm240=comm();

                            state._fsp--;

                            stream_comm.add(comm240.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 49
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 216:21: -> '&'
                    {
                        adaptor.addChild(root_0, stream_49.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaire2"

    public static class prio1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio1"
    // Mini_Rust2.g:219:1: prio1 : ( '*' ( comm )? -> '*' | '/' ( comm )? -> '/' );
    public final Mini_Rust2Parser.prio1_return prio1() throws RecognitionException {
        Mini_Rust2Parser.prio1_return retval = new Mini_Rust2Parser.prio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal241=null;
        Token char_literal243=null;
        Mini_Rust2Parser.comm_return comm242 = null;

        Mini_Rust2Parser.comm_return comm244 = null;


        CommonTree char_literal241_tree=null;
        CommonTree char_literal243_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:219:7: ( '*' ( comm )? -> '*' | '/' ( comm )? -> '/' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==67) ) {
                alt125=1;
            }
            else if ( (LA125_0==70) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // Mini_Rust2.g:219:9: '*' ( comm )?
                    {
                    char_literal241=(Token)match(input,67,FOLLOW_67_in_prio13083);  
                    stream_67.add(char_literal241);

                    // Mini_Rust2.g:219:13: ( comm )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==78) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // Mini_Rust2.g:219:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio13085);
                            comm242=comm();

                            state._fsp--;

                            stream_comm.add(comm242.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 67
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 219:19: -> '*'
                    {
                        adaptor.addChild(root_0, stream_67.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:220:9: '/' ( comm )?
                    {
                    char_literal243=(Token)match(input,70,FOLLOW_70_in_prio13100);  
                    stream_70.add(char_literal243);

                    // Mini_Rust2.g:220:13: ( comm )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==78) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // Mini_Rust2.g:220:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio13102);
                            comm244=comm();

                            state._fsp--;

                            stream_comm.add(comm244.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 70
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:19: -> '/'
                    {
                        adaptor.addChild(root_0, stream_70.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prio1"

    public static class prio2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio2"
    // Mini_Rust2.g:223:1: prio2 : ( '+' ( comm )? -> '+' | '-' ( comm )? -> '-' );
    public final Mini_Rust2Parser.prio2_return prio2() throws RecognitionException {
        Mini_Rust2Parser.prio2_return retval = new Mini_Rust2Parser.prio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal245=null;
        Token char_literal247=null;
        Mini_Rust2Parser.comm_return comm246 = null;

        Mini_Rust2Parser.comm_return comm248 = null;


        CommonTree char_literal245_tree=null;
        CommonTree char_literal247_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:223:7: ( '+' ( comm )? -> '+' | '-' ( comm )? -> '-' )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==71) ) {
                alt128=1;
            }
            else if ( (LA128_0==69) ) {
                alt128=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // Mini_Rust2.g:223:9: '+' ( comm )?
                    {
                    char_literal245=(Token)match(input,71,FOLLOW_71_in_prio23129);  
                    stream_71.add(char_literal245);

                    // Mini_Rust2.g:223:13: ( comm )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==78) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // Mini_Rust2.g:223:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio23131);
                            comm246=comm();

                            state._fsp--;

                            stream_comm.add(comm246.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 71
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 223:19: -> '+'
                    {
                        adaptor.addChild(root_0, stream_71.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:224:9: '-' ( comm )?
                    {
                    char_literal247=(Token)match(input,69,FOLLOW_69_in_prio23146);  
                    stream_69.add(char_literal247);

                    // Mini_Rust2.g:224:13: ( comm )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==78) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // Mini_Rust2.g:224:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio23148);
                            comm248=comm();

                            state._fsp--;

                            stream_comm.add(comm248.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 69
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 224:19: -> '-'
                    {
                        adaptor.addChild(root_0, stream_69.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prio2"

    public static class prio3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio3"
    // Mini_Rust2.g:227:1: prio3 : ( '<' ( comm )? -> '<' | '>' ( comm )? -> '>' | '>=' ( comm )? -> '>=' | '<=' ( comm )? -> '<=' | '==' ( comm )? -> '==' | '!=' ( comm )? -> '!=' );
    public final Mini_Rust2Parser.prio3_return prio3() throws RecognitionException {
        Mini_Rust2Parser.prio3_return retval = new Mini_Rust2Parser.prio3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal249=null;
        Token char_literal251=null;
        Token string_literal253=null;
        Token string_literal255=null;
        Token string_literal257=null;
        Token string_literal259=null;
        Mini_Rust2Parser.comm_return comm250 = null;

        Mini_Rust2Parser.comm_return comm252 = null;

        Mini_Rust2Parser.comm_return comm254 = null;

        Mini_Rust2Parser.comm_return comm256 = null;

        Mini_Rust2Parser.comm_return comm258 = null;

        Mini_Rust2Parser.comm_return comm260 = null;


        CommonTree char_literal249_tree=null;
        CommonTree char_literal251_tree=null;
        CommonTree string_literal253_tree=null;
        CommonTree string_literal255_tree=null;
        CommonTree string_literal257_tree=null;
        CommonTree string_literal259_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:227:7: ( '<' ( comm )? -> '<' | '>' ( comm )? -> '>' | '>=' ( comm )? -> '>=' | '<=' ( comm )? -> '<=' | '==' ( comm )? -> '==' | '!=' ( comm )? -> '!=' )
            int alt135=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt135=1;
                }
                break;
            case 48:
                {
                alt135=2;
                }
                break;
            case 72:
                {
                alt135=3;
                }
                break;
            case 73:
                {
                alt135=4;
                }
                break;
            case 74:
                {
                alt135=5;
                }
                break;
            case 75:
                {
                alt135=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // Mini_Rust2.g:227:9: '<' ( comm )?
                    {
                    char_literal249=(Token)match(input,47,FOLLOW_47_in_prio33169);  
                    stream_47.add(char_literal249);

                    // Mini_Rust2.g:227:13: ( comm )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==78) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // Mini_Rust2.g:227:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio33171);
                            comm250=comm();

                            state._fsp--;

                            stream_comm.add(comm250.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 47
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 227:19: -> '<'
                    {
                        adaptor.addChild(root_0, stream_47.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:228:9: '>' ( comm )?
                    {
                    char_literal251=(Token)match(input,48,FOLLOW_48_in_prio33186);  
                    stream_48.add(char_literal251);

                    // Mini_Rust2.g:228:13: ( comm )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==78) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // Mini_Rust2.g:228:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio33188);
                            comm252=comm();

                            state._fsp--;

                            stream_comm.add(comm252.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 48
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:19: -> '>'
                    {
                        adaptor.addChild(root_0, stream_48.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:229:9: '>=' ( comm )?
                    {
                    string_literal253=(Token)match(input,72,FOLLOW_72_in_prio33203);  
                    stream_72.add(string_literal253);

                    // Mini_Rust2.g:229:14: ( comm )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==78) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // Mini_Rust2.g:229:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio33205);
                            comm254=comm();

                            state._fsp--;

                            stream_comm.add(comm254.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 72
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 229:20: -> '>='
                    {
                        adaptor.addChild(root_0, stream_72.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:230:9: '<=' ( comm )?
                    {
                    string_literal255=(Token)match(input,73,FOLLOW_73_in_prio33220);  
                    stream_73.add(string_literal255);

                    // Mini_Rust2.g:230:14: ( comm )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==78) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // Mini_Rust2.g:230:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio33222);
                            comm256=comm();

                            state._fsp--;

                            stream_comm.add(comm256.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 73
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 230:20: -> '<='
                    {
                        adaptor.addChild(root_0, stream_73.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Mini_Rust2.g:231:9: '==' ( comm )?
                    {
                    string_literal257=(Token)match(input,74,FOLLOW_74_in_prio33237);  
                    stream_74.add(string_literal257);

                    // Mini_Rust2.g:231:14: ( comm )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==78) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // Mini_Rust2.g:231:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio33239);
                            comm258=comm();

                            state._fsp--;

                            stream_comm.add(comm258.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 74
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 231:20: -> '=='
                    {
                        adaptor.addChild(root_0, stream_74.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Mini_Rust2.g:232:9: '!=' ( comm )?
                    {
                    string_literal259=(Token)match(input,75,FOLLOW_75_in_prio33254);  
                    stream_75.add(string_literal259);

                    // Mini_Rust2.g:232:14: ( comm )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==78) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // Mini_Rust2.g:232:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio33256);
                            comm260=comm();

                            state._fsp--;

                            stream_comm.add(comm260.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 75
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:20: -> '!='
                    {
                        adaptor.addChild(root_0, stream_75.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prio3"

    public static class prio4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio4"
    // Mini_Rust2.g:235:1: prio4 : ( '&&' ( comm )? -> '&&' | '||' ( comm )? -> '||' );
    public final Mini_Rust2Parser.prio4_return prio4() throws RecognitionException {
        Mini_Rust2Parser.prio4_return retval = new Mini_Rust2Parser.prio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal261=null;
        Token string_literal263=null;
        Mini_Rust2Parser.comm_return comm262 = null;

        Mini_Rust2Parser.comm_return comm264 = null;


        CommonTree string_literal261_tree=null;
        CommonTree string_literal263_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:235:7: ( '&&' ( comm )? -> '&&' | '||' ( comm )? -> '||' )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==76) ) {
                alt138=1;
            }
            else if ( (LA138_0==77) ) {
                alt138=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // Mini_Rust2.g:235:9: '&&' ( comm )?
                    {
                    string_literal261=(Token)match(input,76,FOLLOW_76_in_prio43276);  
                    stream_76.add(string_literal261);

                    // Mini_Rust2.g:235:14: ( comm )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==78) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // Mini_Rust2.g:235:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio43278);
                            comm262=comm();

                            state._fsp--;

                            stream_comm.add(comm262.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 76
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 235:20: -> '&&'
                    {
                        adaptor.addChild(root_0, stream_76.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:236:9: '||' ( comm )?
                    {
                    string_literal263=(Token)match(input,77,FOLLOW_77_in_prio43293);  
                    stream_77.add(string_literal263);

                    // Mini_Rust2.g:236:14: ( comm )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==78) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // Mini_Rust2.g:236:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio43295);
                            comm264=comm();

                            state._fsp--;

                            stream_comm.add(comm264.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 77
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 236:20: -> '||'
                    {
                        adaptor.addChild(root_0, stream_77.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prio4"

    public static class prio5_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio5"
    // Mini_Rust2.g:239:1: prio5 : '=' ( comm )? -> '=' ;
    public final Mini_Rust2Parser.prio5_return prio5() throws RecognitionException {
        Mini_Rust2Parser.prio5_return retval = new Mini_Rust2Parser.prio5_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal265=null;
        Mini_Rust2Parser.comm_return comm266 = null;


        CommonTree char_literal265_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:239:7: ( '=' ( comm )? -> '=' )
            // Mini_Rust2.g:239:9: '=' ( comm )?
            {
            char_literal265=(Token)match(input,57,FOLLOW_57_in_prio53315);  
            stream_57.add(char_literal265);

            // Mini_Rust2.g:239:13: ( comm )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==78) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // Mini_Rust2.g:239:13: comm
                    {
                    pushFollow(FOLLOW_comm_in_prio53317);
                    comm266=comm();

                    state._fsp--;

                    stream_comm.add(comm266.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: 57
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:19: -> '='
            {
                adaptor.addChild(root_0, stream_57.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prio5"

    public static class comm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comm"
    // Mini_Rust2.g:242:1: comm : '/*' ( . )* '*/' ;
    public final Mini_Rust2Parser.comm_return comm() throws RecognitionException {
        Mini_Rust2Parser.comm_return retval = new Mini_Rust2Parser.comm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal267=null;
        Token wildcard268=null;
        Token string_literal269=null;

        CommonTree string_literal267_tree=null;
        CommonTree wildcard268_tree=null;
        CommonTree string_literal269_tree=null;

        try {
            // Mini_Rust2.g:242:6: ( '/*' ( . )* '*/' )
            // Mini_Rust2.g:242:8: '/*' ( . )* '*/'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal267=(Token)match(input,78,FOLLOW_78_in_comm3337); 
            string_literal267_tree = (CommonTree)adaptor.create(string_literal267);
            adaptor.addChild(root_0, string_literal267_tree);

            // Mini_Rust2.g:242:13: ( . )*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==79) ) {
                    alt140=2;
                }
                else if ( ((LA140_0>=FICHIER && LA140_0<=78)) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // Mini_Rust2.g:242:13: .
            	    {
            	    wildcard268=(Token)input.LT(1);
            	    matchAny(input); 
            	    wildcard268_tree = (CommonTree)adaptor.create(wildcard268);
            	    adaptor.addChild(root_0, wildcard268_tree);


            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);

            string_literal269=(Token)match(input,79,FOLLOW_79_in_comm3342); 
            string_literal269_tree = (CommonTree)adaptor.create(string_literal269);
            adaptor.addChild(root_0, string_literal269_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comm"

    // Delegated rules


 

    public static final BitSet FOLLOW_comm_in_prog262 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_fichier_in_prog265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fichier289 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_decl_struct_in_decl307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_fun_in_decl316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_decl_struct330 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_struct332 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct335 = new BitSet(new long[]{0x0000004000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_struct337 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_decl_struct340 = new BitSet(new long[]{0x0000010400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_struct342 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_attribut_in_decl_struct346 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_decl_struct349 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_struct351 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_attribut_in_decl_struct354 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_40_in_decl_struct361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_struct363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_attribut400 = new BitSet(new long[]{0x0000020000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_attribut402 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_attribut405 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_attribut407 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_attribut410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_decl_fun438 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_fun440 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDF_in_decl_fun443 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_fun445 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_decl_fun448 = new BitSet(new long[]{0x0000100400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_fun450 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_argument_in_decl_fun454 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_39_in_decl_fun457 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_fun459 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_argument_in_decl_fun462 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_44_in_decl_fun468 = new BitSet(new long[]{0x0000204000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_fun470 = new BitSet(new long[]{0x0000204000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_45_in_decl_fun474 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_decl_fun476 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_decl_fun479 = new BitSet(new long[]{0x0000204000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_bloc_in_decl_fun483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_type525 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type527 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type530 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type532 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_type535 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_type557 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type559 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_type562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_type579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_type595 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_type611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_type613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_argument632 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_argument634 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_argument636 = new BitSet(new long[]{0x000E400400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_type_in_argument639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_bloc667 = new BitSet(new long[]{0x15E2490C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_bloc669 = new BitSet(new long[]{0x15E2490C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_sous_bloc_in_bloc672 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_bloc675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_bloc677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_avec_point_in_sous_bloc701 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_sous_bloc704 = new BitSet(new long[]{0x15F2480C00000002L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_sous_bloc707 = new BitSet(new long[]{0x15E2480C00000002L,0x000000000000002EL});
    public static final BitSet FOLLOW_sous_bloc_in_sous_bloc710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_sans_point_in_sous_bloc734 = new BitSet(new long[]{0x15F2480C00000002L,0x000000000000002EL});
    public static final BitSet FOLLOW_52_in_sous_bloc736 = new BitSet(new long[]{0x15F2480C00000002L,0x000000000000002EL});
    public static final BitSet FOLLOW_sous_bloc_in_sous_bloc739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_instruction_avec_point766 = new BitSet(new long[]{0x0800000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_let2_in_instruction_avec_point768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_instruction_avec_point799 = new BitSet(new long[]{0x01E2684C00000002L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point801 = new BitSet(new long[]{0x01E2684C00000002L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_instruction_avec_point804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_instruction_avec_point842 = new BitSet(new long[]{0x0100000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point844 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_instruction_avec_point847 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point849 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_instruction_avec_point852 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point854 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_instruction_avec_point857 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_instruction_avec_point859 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio4_in_instruction_avec_point897 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_instruction_avec_point900 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio4_in_instruction_avec_point905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction_avec_point909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_instruction_sans_point944 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_instruction_sans_point946 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio4b_in_instruction_sans_point949 = new BitSet(new long[]{0x0000204000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_bloc_in_instruction_sans_point951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_instruction_sans_point993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_let21025 = new BitSet(new long[]{0x0800000400000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_comm_in_let21027 = new BitSet(new long[]{0x0800000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_accesseur_in_let21030 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_let21033 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_let21035 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_let21038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesseur_in_let21060 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_let21063 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_let21065 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_let21068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_if_expr1096 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_if_expr1098 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio4b_in_if_expr1101 = new BitSet(new long[]{0x0000204000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_bloc_in_if_expr1103 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_else2_in_if_expr1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_else21140 = new BitSet(new long[]{0x15E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_else21142 = new BitSet(new long[]{0x15E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_else3_in_else21145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_else31168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_else31178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_expr1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio4_in_expr1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio41216 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_prio4_in_operations_prio41219 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio4_in_operations_prio41223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio31251 = new BitSet(new long[]{0x0001800000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_prio3_in_operations_prio31254 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio31258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio21286 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_prio2_in_operations_prio21289 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio21293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_in_operations_prio11322 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_unaires_in_operations_prio11328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000048L});
    public static final BitSet FOLLOW_prio1_in_operations_prio11331 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio11335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_operations_unaires1363 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio4_in_operations_unaires1365 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_operations_unaires1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operations_unaires1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable2_in_variable1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_var_in_variable1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire2_in_unaire_var1455 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_unaire_var_in_unaire_var1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable3_in_unaire_var1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_variable31505 = new BitSet(new long[]{0x4000084000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_struct_in_variable31508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fonction_in_variable31513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_variable_in_variable31521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_struct1914 = new BitSet(new long[]{0x0000010400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_struct1916 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_valeur_attribut_struct_in_struct1920 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_struct1923 = new BitSet(new long[]{0x0000000400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_struct1925 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_valeur_attribut_struct_in_struct1928 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_40_in_struct1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_fonction1963 = new BitSet(new long[]{0x01E2784C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_fonction1965 = new BitSet(new long[]{0x01E2784C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_fonction1969 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_39_in_fonction1973 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_fonction1975 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_fonction1978 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_44_in_fonction1984 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_fonction1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_acces_variable2009 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_acces_variable2011 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_acces_variable2014 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_acces_variable2016 = new BitSet(new long[]{0x4000000000000002L,0x0000000000004001L});
    public static final BitSet FOLLOW_comm_in_acces_variable2018 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_acces_variable_in_acces_variable2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_acces_variable2052 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_attribut_vecteur_in_acces_variable2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_variable22082 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_variable22084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_variable22103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_variable22105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_variable22124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_variable22126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_variable22145 = new BitSet(new long[]{0x0100000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_variable22147 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_variable22150 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_variable22152 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_variable22155 = new BitSet(new long[]{0x81E2480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_variable22157 = new BitSet(new long[]{0x81E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio4_in_variable22162 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_39_in_variable22165 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_variable22167 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio4_in_variable22170 = new BitSet(new long[]{0x8000008000000000L});
    public static final BitSet FOLLOW_63_in_variable22176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_variable22178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_accesseur2214 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_acces_accesseur_in_accesseur2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_accesseur2231 = new BitSet(new long[]{0x0800000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_accesseur_in_accesseur2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_valeur_attribut_struct2260 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_valeur_attribut_struct2262 = new BitSet(new long[]{0x01E2480C00000000L,0x000000000000002EL});
    public static final BitSet FOLLOW_operations_prio4_in_valeur_attribut_struct2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio3b_in_operations_prio4b2307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_prio4_in_operations_prio4b2310 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio4b_in_operations_prio4b2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio2b_in_operations_prio3b2342 = new BitSet(new long[]{0x0001800000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_prio3_in_operations_prio3b2345 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio3b_in_operations_prio3b2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio1b_in_operations_prio2b2377 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000A0L});
    public static final BitSet FOLLOW_prio2_in_operations_prio2b2380 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio2b_in_operations_prio2b2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_in_operations_prio1b2413 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_unairesb_in_operations_prio1b2419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000048L});
    public static final BitSet FOLLOW_prio1_in_operations_prio1b2422 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio1b_in_operations_prio1b2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_operations_unairesb2454 = new BitSet(new long[]{0x0102480C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_operations_prio4b_in_operations_unairesb2456 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_operations_unairesb2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableb_in_operations_unairesb2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_varb_in_variableb2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable2_in_variableb2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire2_in_unaire_varb2548 = new BitSet(new long[]{0x0002000400000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_unaire_varb_in_unaire_varb2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable3b_in_unaire_varb2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_variable3b2600 = new BitSet(new long[]{0x4000080000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_acces_variable_in_variable3b2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fonction_in_variable3b2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_attribut_vecteur2836 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2838 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_attribut_vecteur2841 = new BitSet(new long[]{0x0000100000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2843 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_attribut_vecteur2846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_attribut_vecteur2874 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_acces_variable_in_attribut_vecteur2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_acces_accesseur2914 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_comm_in_acces_accesseur2916 = new BitSet(new long[]{0x01E2684C00000000L,0x000000000000402EL});
    public static final BitSet FOLLOW_expr_in_acces_accesseur2919 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_acces_accesseur2921 = new BitSet(new long[]{0x4000000000000002L,0x0000000000004001L});
    public static final BitSet FOLLOW_comm_in_acces_accesseur2923 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_acces_accesseur_in_acces_accesseur2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_acces_accesseur2958 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IDF_in_acces_accesseur2960 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_acces_accesseur_in_acces_accesseur2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_unaire2999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_unaire3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_unaire3017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_unaire3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_unaire23040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_unaire23042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_unaire23059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_unaire23061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_prio13083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio13085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_prio13100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_prio23129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio23131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_prio23146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio23148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_prio33169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio33171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_prio33186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio33188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_prio33203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio33205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_prio33220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio33222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_prio33237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio33239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_prio33254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio33256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_prio43276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio43278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_prio43293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio43295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_prio53315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_comm_in_prio53317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_comm3337 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_79_in_comm3342 = new BitSet(new long[]{0x0000000000000002L});

}