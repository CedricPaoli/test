// $ANTLR 3.3 Nov 30, 2010 12:50:56 Mini_Rust2.g 2018-03-06 14:44:26

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Mini_Rust2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FICHIER", "ARGUMENT", "ARGUMENTS", "STRUCT", "FCT", "TYPE", "BLOC", "CST_OU_AFF", "VAR", "IF", "POINTEUR_VAL", "POINTEUR", "WHILE", "CONDITION", "FOR", "LEN", "VEC", "PRINT", "ELSE", "RETURN", "ATTRIBUT", "DECL_VAR", "DECL_FCT", "DECL_VEC", "VAL_ATTRIBUT", "ACCES_VEC", "ACCES_ATTRIBUT", "PARAM_FCT", "IDF", "CST_ENT", "WS", "'struct'", "'{'", "','", "'}'", "':'", "'fn'", "'('", "')'", "'->'", "'Vec'", "'<'", "'>'", "'&'", "'i32'", "'bool'", "';'", "'let'", "'return'", "'print'", "'!'", "'='", "'while'", "'mut'", "'if'", "'else'", "'true'", "'false'", "'['", "']'", "'*'", "'.'", "'len'", "'-'", "'/'", "'+'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'/*'", "'*/'", "'//'", "'\\n'"
    };
    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
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
    public static final int STRUCT=7;
    public static final int FCT=8;
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
    public static final int DECL_FCT=26;
    public static final int DECL_VEC=27;
    public static final int VAL_ATTRIBUT=28;
    public static final int ACCES_VEC=29;
    public static final int ACCES_ATTRIBUT=30;
    public static final int PARAM_FCT=31;
    public static final int IDF=32;
    public static final int CST_ENT=33;
    public static final int WS=34;

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
    // Mini_Rust2.g:51:1: prog : ( comm )? fichier EOF -> ^( FICHIER fichier ) ;
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
            // Mini_Rust2.g:51:6: ( ( comm )? fichier EOF -> ^( FICHIER fichier ) )
            // Mini_Rust2.g:51:9: ( comm )? fichier EOF
            {
            // Mini_Rust2.g:51:9: ( comm )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==76||LA1_0==78) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Mini_Rust2.g:51:9: comm
                    {
                    pushFollow(FOLLOW_comm_in_prog248);
                    comm1=comm();

                    state._fsp--;

                    stream_comm.add(comm1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_fichier_in_prog251);
            fichier2=fichier();

            state._fsp--;

            stream_fichier.add(fichier2.getTree());
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog253);  
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
            // 51:27: -> ^( FICHIER fichier )
            {
                // Mini_Rust2.g:51:30: ^( FICHIER fichier )
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
    // Mini_Rust2.g:54:1: fichier : ( decl )* ;
    public final Mini_Rust2Parser.fichier_return fichier() throws RecognitionException {
        Mini_Rust2Parser.fichier_return retval = new Mini_Rust2Parser.fichier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.decl_return decl4 = null;



        try {
            // Mini_Rust2.g:54:9: ( ( decl )* )
            // Mini_Rust2.g:54:11: ( decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Mini_Rust2.g:54:11: ( decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35||LA2_0==40) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Mini_Rust2.g:54:11: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_fichier275);
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
    // Mini_Rust2.g:57:1: decl : ( decl_struct | decl_fun );
    public final Mini_Rust2Parser.decl_return decl() throws RecognitionException {
        Mini_Rust2Parser.decl_return retval = new Mini_Rust2Parser.decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.decl_struct_return decl_struct5 = null;

        Mini_Rust2Parser.decl_fun_return decl_fun6 = null;



        try {
            // Mini_Rust2.g:57:6: ( decl_struct | decl_fun )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // Mini_Rust2.g:57:8: decl_struct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decl_struct_in_decl293);
                    decl_struct5=decl_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_struct5.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:58:8: decl_fun
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decl_fun_in_decl302);
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
    // Mini_Rust2.g:61:1: decl_struct : 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( attribut ( ',' ( comm )? attribut )* )? '}' ( comm )? -> ^( STRUCT IDF ^( BLOC ( attribut ( attribut )* )? ) ) ;
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
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_attribut=new RewriteRuleSubtreeStream(adaptor,"rule attribut");
        try {
            // Mini_Rust2.g:61:13: ( 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( attribut ( ',' ( comm )? attribut )* )? '}' ( comm )? -> ^( STRUCT IDF ^( BLOC ( attribut ( attribut )* )? ) ) )
            // Mini_Rust2.g:61:15: 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( attribut ( ',' ( comm )? attribut )* )? '}' ( comm )?
            {
            string_literal7=(Token)match(input,35,FOLLOW_35_in_decl_struct316);  
            stream_35.add(string_literal7);

            // Mini_Rust2.g:61:24: ( comm )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==76||LA4_0==78) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Mini_Rust2.g:61:24: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct318);
                    comm8=comm();

                    state._fsp--;

                    stream_comm.add(comm8.getTree());

                    }
                    break;

            }

            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct321);  
            stream_IDF.add(IDF9);

            // Mini_Rust2.g:61:34: ( comm )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==76||LA5_0==78) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Mini_Rust2.g:61:34: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct323);
                    comm10=comm();

                    state._fsp--;

                    stream_comm.add(comm10.getTree());

                    }
                    break;

            }

            char_literal11=(Token)match(input,36,FOLLOW_36_in_decl_struct326);  
            stream_36.add(char_literal11);

            // Mini_Rust2.g:61:44: ( comm )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==76||LA6_0==78) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Mini_Rust2.g:61:44: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct328);
                    comm12=comm();

                    state._fsp--;

                    stream_comm.add(comm12.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:61:50: ( attribut ( ',' ( comm )? attribut )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDF) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Mini_Rust2.g:61:51: attribut ( ',' ( comm )? attribut )*
                    {
                    pushFollow(FOLLOW_attribut_in_decl_struct332);
                    attribut13=attribut();

                    state._fsp--;

                    stream_attribut.add(attribut13.getTree());
                    // Mini_Rust2.g:61:60: ( ',' ( comm )? attribut )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==37) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Mini_Rust2.g:61:61: ',' ( comm )? attribut
                    	    {
                    	    char_literal14=(Token)match(input,37,FOLLOW_37_in_decl_struct335);  
                    	    stream_37.add(char_literal14);

                    	    // Mini_Rust2.g:61:65: ( comm )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==76||LA7_0==78) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // Mini_Rust2.g:61:65: comm
                    	            {
                    	            pushFollow(FOLLOW_comm_in_decl_struct337);
                    	            comm15=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm15.getTree());

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_attribut_in_decl_struct340);
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

            char_literal17=(Token)match(input,38,FOLLOW_38_in_decl_struct347);  
            stream_38.add(char_literal17);

            // Mini_Rust2.g:61:89: ( comm )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==76||LA10_0==78) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Mini_Rust2.g:61:89: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_struct349);
                    comm18=comm();

                    state._fsp--;

                    stream_comm.add(comm18.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: attribut, IDF, attribut
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 61:95: -> ^( STRUCT IDF ^( BLOC ( attribut ( attribut )* )? ) )
            {
                // Mini_Rust2.g:61:98: ^( STRUCT IDF ^( BLOC ( attribut ( attribut )* )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STRUCT, "STRUCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Mini_Rust2.g:61:111: ^( BLOC ( attribut ( attribut )* )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_2);

                // Mini_Rust2.g:61:118: ( attribut ( attribut )* )?
                if ( stream_attribut.hasNext()||stream_attribut.hasNext() ) {
                    adaptor.addChild(root_2, stream_attribut.nextTree());
                    // Mini_Rust2.g:61:128: ( attribut )*
                    while ( stream_attribut.hasNext() ) {
                        adaptor.addChild(root_2, stream_attribut.nextTree());

                    }
                    stream_attribut.reset();

                }
                stream_attribut.reset();
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
    // Mini_Rust2.g:64:1: attribut : IDF ( comm )? ':' ( comm )? type -> ^( ATTRIBUT type IDF ) ;
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
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:64:10: ( IDF ( comm )? ':' ( comm )? type -> ^( ATTRIBUT type IDF ) )
            // Mini_Rust2.g:64:12: IDF ( comm )? ':' ( comm )? type
            {
            IDF19=(Token)match(input,IDF,FOLLOW_IDF_in_attribut392);  
            stream_IDF.add(IDF19);

            // Mini_Rust2.g:64:16: ( comm )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==76||LA11_0==78) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Mini_Rust2.g:64:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_attribut394);
                    comm20=comm();

                    state._fsp--;

                    stream_comm.add(comm20.getTree());

                    }
                    break;

            }

            char_literal21=(Token)match(input,39,FOLLOW_39_in_attribut397);  
            stream_39.add(char_literal21);

            // Mini_Rust2.g:64:26: ( comm )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==76||LA12_0==78) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Mini_Rust2.g:64:26: comm
                    {
                    pushFollow(FOLLOW_comm_in_attribut399);
                    comm22=comm();

                    state._fsp--;

                    stream_comm.add(comm22.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_attribut402);
            type23=type();

            state._fsp--;

            stream_type.add(type23.getTree());


            // AST REWRITE
            // elements: IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 64:37: -> ^( ATTRIBUT type IDF )
            {
                // Mini_Rust2.g:64:40: ^( ATTRIBUT type IDF )
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
    // Mini_Rust2.g:67:1: decl_fun : 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc -> ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc ) ;
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
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:67:10: ( 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc -> ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc ) )
            // Mini_Rust2.g:67:12: 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc
            {
            string_literal24=(Token)match(input,40,FOLLOW_40_in_decl_fun430);  
            stream_40.add(string_literal24);

            // Mini_Rust2.g:67:17: ( comm )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==76||LA13_0==78) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Mini_Rust2.g:67:17: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun432);
                    comm25=comm();

                    state._fsp--;

                    stream_comm.add(comm25.getTree());

                    }
                    break;

            }

            IDF26=(Token)match(input,IDF,FOLLOW_IDF_in_decl_fun435);  
            stream_IDF.add(IDF26);

            // Mini_Rust2.g:67:27: ( comm )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==76||LA14_0==78) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Mini_Rust2.g:67:27: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun437);
                    comm27=comm();

                    state._fsp--;

                    stream_comm.add(comm27.getTree());

                    }
                    break;

            }

            char_literal28=(Token)match(input,41,FOLLOW_41_in_decl_fun440);  
            stream_41.add(char_literal28);

            // Mini_Rust2.g:67:37: ( comm )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==76||LA15_0==78) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Mini_Rust2.g:67:37: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun442);
                    comm29=comm();

                    state._fsp--;

                    stream_comm.add(comm29.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:67:43: ( argument ( ',' ( comm )? argument )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDF) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Mini_Rust2.g:67:44: argument ( ',' ( comm )? argument )*
                    {
                    pushFollow(FOLLOW_argument_in_decl_fun446);
                    argument30=argument();

                    state._fsp--;

                    stream_argument.add(argument30.getTree());
                    // Mini_Rust2.g:67:53: ( ',' ( comm )? argument )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==37) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Mini_Rust2.g:67:54: ',' ( comm )? argument
                    	    {
                    	    char_literal31=(Token)match(input,37,FOLLOW_37_in_decl_fun449);  
                    	    stream_37.add(char_literal31);

                    	    // Mini_Rust2.g:67:58: ( comm )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==76||LA16_0==78) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // Mini_Rust2.g:67:58: comm
                    	            {
                    	            pushFollow(FOLLOW_comm_in_decl_fun451);
                    	            comm32=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm32.getTree());

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_argument_in_decl_fun454);
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

            char_literal34=(Token)match(input,42,FOLLOW_42_in_decl_fun460);  
            stream_42.add(char_literal34);

            // Mini_Rust2.g:67:81: ( comm )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==76||LA19_0==78) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Mini_Rust2.g:67:81: comm
                    {
                    pushFollow(FOLLOW_comm_in_decl_fun462);
                    comm35=comm();

                    state._fsp--;

                    stream_comm.add(comm35.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:67:87: ( '->' ( comm )? type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Mini_Rust2.g:67:88: '->' ( comm )? type
                    {
                    string_literal36=(Token)match(input,43,FOLLOW_43_in_decl_fun466);  
                    stream_43.add(string_literal36);

                    // Mini_Rust2.g:67:93: ( comm )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==76||LA20_0==78) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Mini_Rust2.g:67:93: comm
                            {
                            pushFollow(FOLLOW_comm_in_decl_fun468);
                            comm37=comm();

                            state._fsp--;

                            stream_comm.add(comm37.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_decl_fun471);
                    type38=type();

                    state._fsp--;

                    stream_type.add(type38.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_bloc_in_decl_fun475);
            bloc39=bloc();

            state._fsp--;

            stream_bloc.add(bloc39.getTree());


            // AST REWRITE
            // elements: bloc, IDF, argument, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:111: -> ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc )
            {
                // Mini_Rust2.g:67:114: ^( DECL_FCT IDF ^( ARGUMENTS ( argument )* ) ^( TYPE ( type )? ) bloc )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_FCT, "DECL_FCT"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // Mini_Rust2.g:67:129: ^( ARGUMENTS ( argument )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                // Mini_Rust2.g:67:141: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_2, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_1, root_2);
                }
                // Mini_Rust2.g:67:152: ^( TYPE ( type )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                // Mini_Rust2.g:67:159: ( type )?
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
    // Mini_Rust2.g:70:1: type : ( 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )? -> ^( 'Vec' type ) | '&' ( comm )? type -> ^( POINTEUR type ) | 'i32' ( comm )? -> 'i32' | 'bool' ( comm )? -> 'bool' | IDF ( comm )? -> IDF );
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:70:6: ( 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )? -> ^( 'Vec' type ) | '&' ( comm )? type -> ^( POINTEUR type ) | 'i32' ( comm )? -> 'i32' | 'bool' ( comm )? -> 'bool' | IDF ( comm )? -> IDF )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 47:
                {
                alt29=2;
                }
                break;
            case 48:
                {
                alt29=3;
                }
                break;
            case 49:
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
                    // Mini_Rust2.g:70:8: 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )?
                    {
                    string_literal40=(Token)match(input,44,FOLLOW_44_in_type517);  
                    stream_44.add(string_literal40);

                    // Mini_Rust2.g:70:14: ( comm )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==76||LA22_0==78) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Mini_Rust2.g:70:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_type519);
                            comm41=comm();

                            state._fsp--;

                            stream_comm.add(comm41.getTree());

                            }
                            break;

                    }

                    char_literal42=(Token)match(input,45,FOLLOW_45_in_type522);  
                    stream_45.add(char_literal42);

                    // Mini_Rust2.g:70:24: ( comm )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==76||LA23_0==78) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Mini_Rust2.g:70:24: comm
                            {
                            pushFollow(FOLLOW_comm_in_type524);
                            comm43=comm();

                            state._fsp--;

                            stream_comm.add(comm43.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_type527);
                    type44=type();

                    state._fsp--;

                    stream_type.add(type44.getTree());
                    char_literal45=(Token)match(input,46,FOLLOW_46_in_type529);  
                    stream_46.add(char_literal45);

                    // Mini_Rust2.g:70:39: ( comm )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==76||LA24_0==78) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Mini_Rust2.g:70:39: comm
                            {
                            pushFollow(FOLLOW_comm_in_type531);
                            comm46=comm();

                            state._fsp--;

                            stream_comm.add(comm46.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 44, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:45: -> ^( 'Vec' type )
                    {
                        // Mini_Rust2.g:70:48: ^( 'Vec' type )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:71:8: '&' ( comm )? type
                    {
                    char_literal47=(Token)match(input,47,FOLLOW_47_in_type549);  
                    stream_47.add(char_literal47);

                    // Mini_Rust2.g:71:12: ( comm )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==76||LA25_0==78) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Mini_Rust2.g:71:12: comm
                            {
                            pushFollow(FOLLOW_comm_in_type551);
                            comm48=comm();

                            state._fsp--;

                            stream_comm.add(comm48.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_type554);
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
                    // 71:23: -> ^( POINTEUR type )
                    {
                        // Mini_Rust2.g:71:26: ^( POINTEUR type )
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
                    // Mini_Rust2.g:72:8: 'i32' ( comm )?
                    {
                    string_literal50=(Token)match(input,48,FOLLOW_48_in_type571);  
                    stream_48.add(string_literal50);

                    // Mini_Rust2.g:72:14: ( comm )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==76||LA26_0==78) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Mini_Rust2.g:72:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_type573);
                            comm51=comm();

                            state._fsp--;

                            stream_comm.add(comm51.getTree());

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
                    // 72:20: -> 'i32'
                    {
                        adaptor.addChild(root_0, stream_48.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:73:8: 'bool' ( comm )?
                    {
                    string_literal52=(Token)match(input,49,FOLLOW_49_in_type587);  
                    stream_49.add(string_literal52);

                    // Mini_Rust2.g:73:15: ( comm )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==76||LA27_0==78) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Mini_Rust2.g:73:15: comm
                            {
                            pushFollow(FOLLOW_comm_in_type589);
                            comm53=comm();

                            state._fsp--;

                            stream_comm.add(comm53.getTree());

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
                    // 73:21: -> 'bool'
                    {
                        adaptor.addChild(root_0, stream_49.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Mini_Rust2.g:74:8: IDF ( comm )?
                    {
                    IDF54=(Token)match(input,IDF,FOLLOW_IDF_in_type603);  
                    stream_IDF.add(IDF54);

                    // Mini_Rust2.g:74:12: ( comm )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==76||LA28_0==78) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // Mini_Rust2.g:74:12: comm
                            {
                            pushFollow(FOLLOW_comm_in_type605);
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
                    // 74:18: -> IDF
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
    // Mini_Rust2.g:77:1: argument : IDF ':' ( comm )? type -> ^( DECL_VAR IDF type ) ;
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
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // Mini_Rust2.g:77:10: ( IDF ':' ( comm )? type -> ^( DECL_VAR IDF type ) )
            // Mini_Rust2.g:77:12: IDF ':' ( comm )? type
            {
            IDF56=(Token)match(input,IDF,FOLLOW_IDF_in_argument624);  
            stream_IDF.add(IDF56);

            char_literal57=(Token)match(input,39,FOLLOW_39_in_argument626);  
            stream_39.add(char_literal57);

            // Mini_Rust2.g:77:20: ( comm )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==76||LA30_0==78) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Mini_Rust2.g:77:20: comm
                    {
                    pushFollow(FOLLOW_comm_in_argument628);
                    comm58=comm();

                    state._fsp--;

                    stream_comm.add(comm58.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_argument631);
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
            // 77:31: -> ^( DECL_VAR IDF type )
            {
                // Mini_Rust2.g:77:34: ^( DECL_VAR IDF type )
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
    // Mini_Rust2.g:80:1: bloc : '{' ( comm )? ( sous_bloc )? '}' ( comm )? -> ^( BLOC ( sous_bloc )? ) ;
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
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_sous_bloc=new RewriteRuleSubtreeStream(adaptor,"rule sous_bloc");
        try {
            // Mini_Rust2.g:80:6: ( '{' ( comm )? ( sous_bloc )? '}' ( comm )? -> ^( BLOC ( sous_bloc )? ) )
            // Mini_Rust2.g:80:8: '{' ( comm )? ( sous_bloc )? '}' ( comm )?
            {
            char_literal60=(Token)match(input,36,FOLLOW_36_in_bloc659);  
            stream_36.add(char_literal60);

            // Mini_Rust2.g:80:12: ( comm )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==76||LA31_0==78) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Mini_Rust2.g:80:12: comm
                    {
                    pushFollow(FOLLOW_comm_in_bloc661);
                    comm61=comm();

                    state._fsp--;

                    stream_comm.add(comm61.getTree());

                    }
                    break;

            }

            // Mini_Rust2.g:80:18: ( sous_bloc )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=IDF && LA32_0<=CST_ENT)||LA32_0==41||LA32_0==44||LA32_0==47||(LA32_0>=51 && LA32_0<=54)||LA32_0==56||LA32_0==58||(LA32_0>=60 && LA32_0<=61)||LA32_0==64||LA32_0==67) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Mini_Rust2.g:80:18: sous_bloc
                    {
                    pushFollow(FOLLOW_sous_bloc_in_bloc664);
                    sous_bloc62=sous_bloc();

                    state._fsp--;

                    stream_sous_bloc.add(sous_bloc62.getTree());

                    }
                    break;

            }

            char_literal63=(Token)match(input,38,FOLLOW_38_in_bloc667);  
            stream_38.add(char_literal63);

            // Mini_Rust2.g:80:33: ( comm )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==76||LA33_0==78) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Mini_Rust2.g:80:33: comm
                    {
                    pushFollow(FOLLOW_comm_in_bloc669);
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
            // 80:39: -> ^( BLOC ( sous_bloc )? )
            {
                // Mini_Rust2.g:80:42: ^( BLOC ( sous_bloc )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_1);

                // Mini_Rust2.g:80:49: ( sous_bloc )?
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
    // Mini_Rust2.g:83:1: sous_bloc : ( instruction_avec_point ( ( ';' )+ ( comm )? ( sous_bloc )? )? -> instruction_avec_point ( sous_bloc )? | instruction_sans_point ( ';' )* ( sous_bloc )? -> instruction_sans_point ( sous_bloc )? );
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
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_instruction_avec_point=new RewriteRuleSubtreeStream(adaptor,"rule instruction_avec_point");
        RewriteRuleSubtreeStream stream_sous_bloc=new RewriteRuleSubtreeStream(adaptor,"rule sous_bloc");
        RewriteRuleSubtreeStream stream_instruction_sans_point=new RewriteRuleSubtreeStream(adaptor,"rule instruction_sans_point");
        try {
            // Mini_Rust2.g:83:11: ( instruction_avec_point ( ( ';' )+ ( comm )? ( sous_bloc )? )? -> instruction_avec_point ( sous_bloc )? | instruction_sans_point ( ';' )* ( sous_bloc )? -> instruction_sans_point ( sous_bloc )? )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=IDF && LA40_0<=CST_ENT)||LA40_0==41||LA40_0==44||LA40_0==47||(LA40_0>=51 && LA40_0<=54)||(LA40_0>=60 && LA40_0<=61)||LA40_0==64||LA40_0==67) ) {
                alt40=1;
            }
            else if ( (LA40_0==56||LA40_0==58) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // Mini_Rust2.g:83:13: instruction_avec_point ( ( ';' )+ ( comm )? ( sous_bloc )? )?
                    {
                    pushFollow(FOLLOW_instruction_avec_point_in_sous_bloc693);
                    instruction_avec_point65=instruction_avec_point();

                    state._fsp--;

                    stream_instruction_avec_point.add(instruction_avec_point65.getTree());
                    // Mini_Rust2.g:83:36: ( ( ';' )+ ( comm )? ( sous_bloc )? )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==50) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Mini_Rust2.g:83:37: ( ';' )+ ( comm )? ( sous_bloc )?
                            {
                            // Mini_Rust2.g:83:37: ( ';' )+
                            int cnt34=0;
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==50) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // Mini_Rust2.g:83:37: ';'
                            	    {
                            	    char_literal66=(Token)match(input,50,FOLLOW_50_in_sous_bloc696);  
                            	    stream_50.add(char_literal66);


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

                            // Mini_Rust2.g:83:42: ( comm )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==76||LA35_0==78) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // Mini_Rust2.g:83:42: comm
                                    {
                                    pushFollow(FOLLOW_comm_in_sous_bloc699);
                                    comm67=comm();

                                    state._fsp--;

                                    stream_comm.add(comm67.getTree());

                                    }
                                    break;

                            }

                            // Mini_Rust2.g:83:48: ( sous_bloc )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( ((LA36_0>=IDF && LA36_0<=CST_ENT)||LA36_0==41||LA36_0==44||LA36_0==47||(LA36_0>=51 && LA36_0<=54)||LA36_0==56||LA36_0==58||(LA36_0>=60 && LA36_0<=61)||LA36_0==64||LA36_0==67) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // Mini_Rust2.g:83:48: sous_bloc
                                    {
                                    pushFollow(FOLLOW_sous_bloc_in_sous_bloc702);
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
                    // 83:61: -> instruction_avec_point ( sous_bloc )?
                    {
                        adaptor.addChild(root_0, stream_instruction_avec_point.nextTree());
                        // Mini_Rust2.g:83:87: ( sous_bloc )?
                        if ( stream_sous_bloc.hasNext() ) {
                            adaptor.addChild(root_0, stream_sous_bloc.nextTree());

                        }
                        stream_sous_bloc.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:84:13: instruction_sans_point ( ';' )* ( sous_bloc )?
                    {
                    pushFollow(FOLLOW_instruction_sans_point_in_sous_bloc726);
                    instruction_sans_point69=instruction_sans_point();

                    state._fsp--;

                    stream_instruction_sans_point.add(instruction_sans_point69.getTree());
                    // Mini_Rust2.g:84:36: ( ';' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==50) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Mini_Rust2.g:84:36: ';'
                    	    {
                    	    char_literal70=(Token)match(input,50,FOLLOW_50_in_sous_bloc728);  
                    	    stream_50.add(char_literal70);


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // Mini_Rust2.g:84:41: ( sous_bloc )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=IDF && LA39_0<=CST_ENT)||LA39_0==41||LA39_0==44||LA39_0==47||(LA39_0>=51 && LA39_0<=54)||LA39_0==56||LA39_0==58||(LA39_0>=60 && LA39_0<=61)||LA39_0==64||LA39_0==67) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Mini_Rust2.g:84:41: sous_bloc
                            {
                            pushFollow(FOLLOW_sous_bloc_in_sous_bloc731);
                            sous_bloc71=sous_bloc();

                            state._fsp--;

                            stream_sous_bloc.add(sous_bloc71.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: instruction_sans_point, sous_bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:52: -> instruction_sans_point ( sous_bloc )?
                    {
                        adaptor.addChild(root_0, stream_instruction_sans_point.nextTree());
                        // Mini_Rust2.g:84:78: ( sous_bloc )?
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
    // Mini_Rust2.g:87:1: instruction_avec_point : ( 'let' let2 -> let2 | 'return' ( comm )? ( expr )? -> ^( RETURN ( expr )? ) | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? -> ^( PRINT expr ) | operations_prio4 ( '=' operations_prio4 )? );
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


        CommonTree string_literal72_tree=null;
        CommonTree string_literal74_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_let2=new RewriteRuleSubtreeStream(adaptor,"rule let2");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:87:24: ( 'let' let2 -> let2 | 'return' ( comm )? ( expr )? -> ^( RETURN ( expr )? ) | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? -> ^( PRINT expr ) | operations_prio4 ( '=' operations_prio4 )? )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt48=1;
                }
                break;
            case 52:
                {
                alt48=2;
                }
                break;
            case 53:
                {
                alt48=3;
                }
                break;
            case IDF:
            case CST_ENT:
            case 41:
            case 44:
            case 47:
            case 54:
            case 60:
            case 61:
            case 64:
            case 67:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // Mini_Rust2.g:87:26: 'let' let2
                    {
                    string_literal72=(Token)match(input,51,FOLLOW_51_in_instruction_avec_point758);  
                    stream_51.add(string_literal72);

                    pushFollow(FOLLOW_let2_in_instruction_avec_point760);
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
                    // 87:37: -> let2
                    {
                        adaptor.addChild(root_0, stream_let2.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:88:26: 'return' ( comm )? ( expr )?
                    {
                    string_literal74=(Token)match(input,52,FOLLOW_52_in_instruction_avec_point791);  
                    stream_52.add(string_literal74);

                    // Mini_Rust2.g:88:35: ( comm )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==76||LA41_0==78) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // Mini_Rust2.g:88:35: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point793);
                            comm75=comm();

                            state._fsp--;

                            stream_comm.add(comm75.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:88:41: ( expr )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=IDF && LA42_0<=CST_ENT)||LA42_0==36||LA42_0==41||LA42_0==44||LA42_0==47||LA42_0==54||(LA42_0>=60 && LA42_0<=61)||LA42_0==64||LA42_0==67) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // Mini_Rust2.g:88:41: expr
                            {
                            pushFollow(FOLLOW_expr_in_instruction_avec_point796);
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
                    // 88:48: -> ^( RETURN ( expr )? )
                    {
                        // Mini_Rust2.g:88:51: ^( RETURN ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURN, "RETURN"), root_1);

                        // Mini_Rust2.g:88:60: ( expr )?
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
                    // Mini_Rust2.g:89:26: 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )?
                    {
                    string_literal77=(Token)match(input,53,FOLLOW_53_in_instruction_avec_point834);  
                    stream_53.add(string_literal77);

                    // Mini_Rust2.g:89:34: ( comm )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==76||LA43_0==78) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // Mini_Rust2.g:89:34: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point836);
                            comm78=comm();

                            state._fsp--;

                            stream_comm.add(comm78.getTree());

                            }
                            break;

                    }

                    char_literal79=(Token)match(input,54,FOLLOW_54_in_instruction_avec_point839);  
                    stream_54.add(char_literal79);

                    // Mini_Rust2.g:89:44: ( comm )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==76||LA44_0==78) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // Mini_Rust2.g:89:44: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point841);
                            comm80=comm();

                            state._fsp--;

                            stream_comm.add(comm80.getTree());

                            }
                            break;

                    }

                    char_literal81=(Token)match(input,41,FOLLOW_41_in_instruction_avec_point844);  
                    stream_41.add(char_literal81);

                    // Mini_Rust2.g:89:54: ( comm )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==76||LA45_0==78) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // Mini_Rust2.g:89:54: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point846);
                            comm82=comm();

                            state._fsp--;

                            stream_comm.add(comm82.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_instruction_avec_point849);
                    expr83=expr();

                    state._fsp--;

                    stream_expr.add(expr83.getTree());
                    char_literal84=(Token)match(input,42,FOLLOW_42_in_instruction_avec_point851);  
                    stream_42.add(char_literal84);

                    // Mini_Rust2.g:89:69: ( comm )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==76||LA46_0==78) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // Mini_Rust2.g:89:69: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_avec_point853);
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
                    // 89:75: -> ^( PRINT expr )
                    {
                        // Mini_Rust2.g:89:78: ^( PRINT expr )
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
                    // Mini_Rust2.g:90:26: operations_prio4 ( '=' operations_prio4 )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operations_prio4_in_instruction_avec_point889);
                    operations_prio486=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio486.getTree());
                    // Mini_Rust2.g:90:43: ( '=' operations_prio4 )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==55) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // Mini_Rust2.g:90:44: '=' operations_prio4
                            {
                            char_literal87=(Token)match(input,55,FOLLOW_55_in_instruction_avec_point892); 
                            char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal87_tree, root_0);

                            pushFollow(FOLLOW_operations_prio4_in_instruction_avec_point896);
                            operations_prio488=operations_prio4();

                            state._fsp--;

                            adaptor.addChild(root_0, operations_prio488.getTree());

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
    // Mini_Rust2.g:93:1: instruction_sans_point : ( 'while' ( comm )? operations_prio4b bloc -> ^( WHILE ^( CONDITION operations_prio4b ) bloc ) | if_expr );
    public final Mini_Rust2Parser.instruction_sans_point_return instruction_sans_point() throws RecognitionException {
        Mini_Rust2Parser.instruction_sans_point_return retval = new Mini_Rust2Parser.instruction_sans_point_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal89=null;
        Mini_Rust2Parser.comm_return comm90 = null;

        Mini_Rust2Parser.operations_prio4b_return operations_prio4b91 = null;

        Mini_Rust2Parser.bloc_return bloc92 = null;

        Mini_Rust2Parser.if_expr_return if_expr93 = null;


        CommonTree string_literal89_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_operations_prio4b=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4b");
        try {
            // Mini_Rust2.g:93:24: ( 'while' ( comm )? operations_prio4b bloc -> ^( WHILE ^( CONDITION operations_prio4b ) bloc ) | if_expr )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            else if ( (LA50_0==58) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // Mini_Rust2.g:93:26: 'while' ( comm )? operations_prio4b bloc
                    {
                    string_literal89=(Token)match(input,56,FOLLOW_56_in_instruction_sans_point930);  
                    stream_56.add(string_literal89);

                    // Mini_Rust2.g:93:34: ( comm )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==76||LA49_0==78) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // Mini_Rust2.g:93:34: comm
                            {
                            pushFollow(FOLLOW_comm_in_instruction_sans_point932);
                            comm90=comm();

                            state._fsp--;

                            stream_comm.add(comm90.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_operations_prio4b_in_instruction_sans_point935);
                    operations_prio4b91=operations_prio4b();

                    state._fsp--;

                    stream_operations_prio4b.add(operations_prio4b91.getTree());
                    pushFollow(FOLLOW_bloc_in_instruction_sans_point937);
                    bloc92=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc92.getTree());


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
                    // 93:64: -> ^( WHILE ^( CONDITION operations_prio4b ) bloc )
                    {
                        // Mini_Rust2.g:93:67: ^( WHILE ^( CONDITION operations_prio4b ) bloc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        // Mini_Rust2.g:93:75: ^( CONDITION operations_prio4b )
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
                    // Mini_Rust2.g:94:26: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_instruction_sans_point979);
                    if_expr93=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr93.getTree());

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
    // Mini_Rust2.g:97:1: let2 : ( 'mut' ( comm )? accesseur ( '=' ( comm )? expr )? -> ^( DECL_VAR accesseur ( expr )? ) | accesseur ( '=' ( comm )? expr )? -> ^( CST_OU_AFF accesseur ( expr )? ) );
    public final Mini_Rust2Parser.let2_return let2() throws RecognitionException {
        Mini_Rust2Parser.let2_return retval = new Mini_Rust2Parser.let2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal94=null;
        Token char_literal97=null;
        Token char_literal101=null;
        Mini_Rust2Parser.comm_return comm95 = null;

        Mini_Rust2Parser.accesseur_return accesseur96 = null;

        Mini_Rust2Parser.comm_return comm98 = null;

        Mini_Rust2Parser.expr_return expr99 = null;

        Mini_Rust2Parser.accesseur_return accesseur100 = null;

        Mini_Rust2Parser.comm_return comm102 = null;

        Mini_Rust2Parser.expr_return expr103 = null;


        CommonTree string_literal94_tree=null;
        CommonTree char_literal97_tree=null;
        CommonTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_accesseur=new RewriteRuleSubtreeStream(adaptor,"rule accesseur");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:97:6: ( 'mut' ( comm )? accesseur ( '=' ( comm )? expr )? -> ^( DECL_VAR accesseur ( expr )? ) | accesseur ( '=' ( comm )? expr )? -> ^( CST_OU_AFF accesseur ( expr )? ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==57) ) {
                alt56=1;
            }
            else if ( (LA56_0==IDF||LA56_0==64) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // Mini_Rust2.g:97:8: 'mut' ( comm )? accesseur ( '=' ( comm )? expr )?
                    {
                    string_literal94=(Token)match(input,57,FOLLOW_57_in_let21011);  
                    stream_57.add(string_literal94);

                    // Mini_Rust2.g:97:14: ( comm )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==76||LA51_0==78) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // Mini_Rust2.g:97:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_let21013);
                            comm95=comm();

                            state._fsp--;

                            stream_comm.add(comm95.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_accesseur_in_let21016);
                    accesseur96=accesseur();

                    state._fsp--;

                    stream_accesseur.add(accesseur96.getTree());
                    // Mini_Rust2.g:97:30: ( '=' ( comm )? expr )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==55) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // Mini_Rust2.g:97:31: '=' ( comm )? expr
                            {
                            char_literal97=(Token)match(input,55,FOLLOW_55_in_let21019);  
                            stream_55.add(char_literal97);

                            // Mini_Rust2.g:97:35: ( comm )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==76||LA52_0==78) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // Mini_Rust2.g:97:35: comm
                                    {
                                    pushFollow(FOLLOW_comm_in_let21021);
                                    comm98=comm();

                                    state._fsp--;

                                    stream_comm.add(comm98.getTree());

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_let21024);
                            expr99=expr();

                            state._fsp--;

                            stream_expr.add(expr99.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: accesseur, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:48: -> ^( DECL_VAR accesseur ( expr )? )
                    {
                        // Mini_Rust2.g:97:51: ^( DECL_VAR accesseur ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_VAR, "DECL_VAR"), root_1);

                        adaptor.addChild(root_1, stream_accesseur.nextTree());
                        // Mini_Rust2.g:97:72: ( expr )?
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
                    // Mini_Rust2.g:98:8: accesseur ( '=' ( comm )? expr )?
                    {
                    pushFollow(FOLLOW_accesseur_in_let21046);
                    accesseur100=accesseur();

                    state._fsp--;

                    stream_accesseur.add(accesseur100.getTree());
                    // Mini_Rust2.g:98:18: ( '=' ( comm )? expr )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==55) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // Mini_Rust2.g:98:19: '=' ( comm )? expr
                            {
                            char_literal101=(Token)match(input,55,FOLLOW_55_in_let21049);  
                            stream_55.add(char_literal101);

                            // Mini_Rust2.g:98:23: ( comm )?
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==76||LA54_0==78) ) {
                                alt54=1;
                            }
                            switch (alt54) {
                                case 1 :
                                    // Mini_Rust2.g:98:23: comm
                                    {
                                    pushFollow(FOLLOW_comm_in_let21051);
                                    comm102=comm();

                                    state._fsp--;

                                    stream_comm.add(comm102.getTree());

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_expr_in_let21054);
                            expr103=expr();

                            state._fsp--;

                            stream_expr.add(expr103.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: accesseur, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:36: -> ^( CST_OU_AFF accesseur ( expr )? )
                    {
                        // Mini_Rust2.g:98:39: ^( CST_OU_AFF accesseur ( expr )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CST_OU_AFF, "CST_OU_AFF"), root_1);

                        adaptor.addChild(root_1, stream_accesseur.nextTree());
                        // Mini_Rust2.g:98:62: ( expr )?
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
    // Mini_Rust2.g:101:1: if_expr : 'if' ( comm )? operations_prio4b bloc ( else2 )? -> ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? ) ;
    public final Mini_Rust2Parser.if_expr_return if_expr() throws RecognitionException {
        Mini_Rust2Parser.if_expr_return retval = new Mini_Rust2Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal104=null;
        Mini_Rust2Parser.comm_return comm105 = null;

        Mini_Rust2Parser.operations_prio4b_return operations_prio4b106 = null;

        Mini_Rust2Parser.bloc_return bloc107 = null;

        Mini_Rust2Parser.else2_return else2108 = null;


        CommonTree string_literal104_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_operations_prio4b=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4b");
        RewriteRuleSubtreeStream stream_else2=new RewriteRuleSubtreeStream(adaptor,"rule else2");
        try {
            // Mini_Rust2.g:101:9: ( 'if' ( comm )? operations_prio4b bloc ( else2 )? -> ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? ) )
            // Mini_Rust2.g:101:11: 'if' ( comm )? operations_prio4b bloc ( else2 )?
            {
            string_literal104=(Token)match(input,58,FOLLOW_58_in_if_expr1082);  
            stream_58.add(string_literal104);

            // Mini_Rust2.g:101:16: ( comm )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==76||LA57_0==78) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // Mini_Rust2.g:101:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_if_expr1084);
                    comm105=comm();

                    state._fsp--;

                    stream_comm.add(comm105.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_operations_prio4b_in_if_expr1087);
            operations_prio4b106=operations_prio4b();

            state._fsp--;

            stream_operations_prio4b.add(operations_prio4b106.getTree());
            pushFollow(FOLLOW_bloc_in_if_expr1089);
            bloc107=bloc();

            state._fsp--;

            stream_bloc.add(bloc107.getTree());
            // Mini_Rust2.g:101:45: ( else2 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==59) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // Mini_Rust2.g:101:45: else2
                    {
                    pushFollow(FOLLOW_else2_in_if_expr1091);
                    else2108=else2();

                    state._fsp--;

                    stream_else2.add(else2108.getTree());

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
            // 101:52: -> ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? )
            {
                // Mini_Rust2.g:101:55: ^( IF ^( CONDITION operations_prio4b ) bloc ( else2 )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // Mini_Rust2.g:101:60: ^( CONDITION operations_prio4b )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_operations_prio4b.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_bloc.nextTree());
                // Mini_Rust2.g:101:96: ( else2 )?
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
    // Mini_Rust2.g:104:1: else2 : 'else' ( comm )? else3 -> ^( ELSE else3 ) ;
    public final Mini_Rust2Parser.else2_return else2() throws RecognitionException {
        Mini_Rust2Parser.else2_return retval = new Mini_Rust2Parser.else2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Mini_Rust2Parser.comm_return comm110 = null;

        Mini_Rust2Parser.else3_return else3111 = null;


        CommonTree string_literal109_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_else3=new RewriteRuleSubtreeStream(adaptor,"rule else3");
        try {
            // Mini_Rust2.g:104:7: ( 'else' ( comm )? else3 -> ^( ELSE else3 ) )
            // Mini_Rust2.g:104:9: 'else' ( comm )? else3
            {
            string_literal109=(Token)match(input,59,FOLLOW_59_in_else21126);  
            stream_59.add(string_literal109);

            // Mini_Rust2.g:104:16: ( comm )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==76||LA59_0==78) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // Mini_Rust2.g:104:16: comm
                    {
                    pushFollow(FOLLOW_comm_in_else21128);
                    comm110=comm();

                    state._fsp--;

                    stream_comm.add(comm110.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_else3_in_else21131);
            else3111=else3();

            state._fsp--;

            stream_else3.add(else3111.getTree());


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
            // 104:28: -> ^( ELSE else3 )
            {
                // Mini_Rust2.g:104:31: ^( ELSE else3 )
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
    // Mini_Rust2.g:107:1: else3 : ( bloc | if_expr );
    public final Mini_Rust2Parser.else3_return else3() throws RecognitionException {
        Mini_Rust2Parser.else3_return retval = new Mini_Rust2Parser.else3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.bloc_return bloc112 = null;

        Mini_Rust2Parser.if_expr_return if_expr113 = null;



        try {
            // Mini_Rust2.g:107:7: ( bloc | if_expr )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==36) ) {
                alt60=1;
            }
            else if ( (LA60_0==58) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // Mini_Rust2.g:107:9: bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_else31154);
                    bloc112=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc112.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:108:9: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_else31164);
                    if_expr113=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr113.getTree());

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
    // Mini_Rust2.g:111:1: expr : ( bloc | operations_prio4 );
    public final Mini_Rust2Parser.expr_return expr() throws RecognitionException {
        Mini_Rust2Parser.expr_return retval = new Mini_Rust2Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.bloc_return bloc114 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4115 = null;



        try {
            // Mini_Rust2.g:111:6: ( bloc | operations_prio4 )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==36) ) {
                alt61=1;
            }
            else if ( ((LA61_0>=IDF && LA61_0<=CST_ENT)||LA61_0==41||LA61_0==44||LA61_0==47||LA61_0==54||(LA61_0>=60 && LA61_0<=61)||LA61_0==64||LA61_0==67) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // Mini_Rust2.g:111:8: bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bloc_in_expr1179);
                    bloc114=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc114.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:112:8: operations_prio4
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_operations_prio4_in_expr1188);
                    operations_prio4115=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4115.getTree());

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
    // Mini_Rust2.g:115:1: operations_prio4 : operations_prio3 ( prio4 operations_prio4 )? ;
    public final Mini_Rust2Parser.operations_prio4_return operations_prio4() throws RecognitionException {
        Mini_Rust2Parser.operations_prio4_return retval = new Mini_Rust2Parser.operations_prio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3116 = null;

        Mini_Rust2Parser.prio4_return prio4117 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4118 = null;



        try {
            // Mini_Rust2.g:115:18: ( operations_prio3 ( prio4 operations_prio4 )? )
            // Mini_Rust2.g:115:20: operations_prio3 ( prio4 operations_prio4 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio3_in_operations_prio41202);
            operations_prio3116=operations_prio3();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio3116.getTree());
            // Mini_Rust2.g:115:37: ( prio4 operations_prio4 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=74 && LA62_0<=75)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // Mini_Rust2.g:115:38: prio4 operations_prio4
                    {
                    pushFollow(FOLLOW_prio4_in_operations_prio41205);
                    prio4117=prio4();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio4117.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio4_in_operations_prio41209);
                    operations_prio4118=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4118.getTree());

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
    // Mini_Rust2.g:118:1: operations_prio3 : operations_prio2 ( prio3 operations_prio3 )? ;
    public final Mini_Rust2Parser.operations_prio3_return operations_prio3() throws RecognitionException {
        Mini_Rust2Parser.operations_prio3_return retval = new Mini_Rust2Parser.operations_prio3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2119 = null;

        Mini_Rust2Parser.prio3_return prio3120 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3121 = null;



        try {
            // Mini_Rust2.g:118:18: ( operations_prio2 ( prio3 operations_prio3 )? )
            // Mini_Rust2.g:118:20: operations_prio2 ( prio3 operations_prio3 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio2_in_operations_prio31237);
            operations_prio2119=operations_prio2();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio2119.getTree());
            // Mini_Rust2.g:118:37: ( prio3 operations_prio3 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=45 && LA63_0<=46)||(LA63_0>=70 && LA63_0<=73)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Mini_Rust2.g:118:38: prio3 operations_prio3
                    {
                    pushFollow(FOLLOW_prio3_in_operations_prio31240);
                    prio3120=prio3();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio3120.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio3_in_operations_prio31244);
                    operations_prio3121=operations_prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3121.getTree());

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
    // Mini_Rust2.g:121:1: operations_prio2 : operations_prio1 ( prio2 operations_prio2 )? ;
    public final Mini_Rust2Parser.operations_prio2_return operations_prio2() throws RecognitionException {
        Mini_Rust2Parser.operations_prio2_return retval = new Mini_Rust2Parser.operations_prio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1122 = null;

        Mini_Rust2Parser.prio2_return prio2123 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2124 = null;



        try {
            // Mini_Rust2.g:121:18: ( operations_prio1 ( prio2 operations_prio2 )? )
            // Mini_Rust2.g:121:20: operations_prio1 ( prio2 operations_prio2 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio1_in_operations_prio21272);
            operations_prio1122=operations_prio1();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio1122.getTree());
            // Mini_Rust2.g:121:37: ( prio2 operations_prio2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==67||LA64_0==69) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // Mini_Rust2.g:121:38: prio2 operations_prio2
                    {
                    pushFollow(FOLLOW_prio2_in_operations_prio21275);
                    prio2123=prio2();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio2123.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio2_in_operations_prio21279);
                    operations_prio2124=operations_prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2124.getTree());

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
    // Mini_Rust2.g:124:1: operations_prio1 : ( unaire )? operations_unaires ( prio1 operations_prio1 )? ;
    public final Mini_Rust2Parser.operations_prio1_return operations_prio1() throws RecognitionException {
        Mini_Rust2Parser.operations_prio1_return retval = new Mini_Rust2Parser.operations_prio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_return unaire125 = null;

        Mini_Rust2Parser.operations_unaires_return operations_unaires126 = null;

        Mini_Rust2Parser.prio1_return prio1127 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1128 = null;



        try {
            // Mini_Rust2.g:124:18: ( ( unaire )? operations_unaires ( prio1 operations_prio1 )? )
            // Mini_Rust2.g:124:20: ( unaire )? operations_unaires ( prio1 operations_prio1 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // Mini_Rust2.g:124:20: ( unaire )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==54||LA65_0==67) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // Mini_Rust2.g:124:21: unaire
                    {
                    pushFollow(FOLLOW_unaire_in_operations_prio11308);
                    unaire125=unaire();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(unaire125.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_operations_unaires_in_operations_prio11314);
            operations_unaires126=operations_unaires();

            state._fsp--;

            adaptor.addChild(root_0, operations_unaires126.getTree());
            // Mini_Rust2.g:124:51: ( prio1 operations_prio1 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==64||LA66_0==68) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // Mini_Rust2.g:124:52: prio1 operations_prio1
                    {
                    pushFollow(FOLLOW_prio1_in_operations_prio11317);
                    prio1127=prio1();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio1127.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio1_in_operations_prio11321);
                    operations_prio1128=operations_prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1128.getTree());

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
    // Mini_Rust2.g:127:1: operations_unaires : ( '(' operations_prio4 ')' -> ^( operations_prio4 ) | variable );
    public final Mini_Rust2Parser.operations_unaires_return operations_unaires() throws RecognitionException {
        Mini_Rust2Parser.operations_unaires_return retval = new Mini_Rust2Parser.operations_unaires_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal129=null;
        Token char_literal131=null;
        Mini_Rust2Parser.operations_prio4_return operations_prio4130 = null;

        Mini_Rust2Parser.variable_return variable132 = null;


        CommonTree char_literal129_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_operations_prio4=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4");
        try {
            // Mini_Rust2.g:127:20: ( '(' operations_prio4 ')' -> ^( operations_prio4 ) | variable )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==41) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=IDF && LA67_0<=CST_ENT)||LA67_0==44||LA67_0==47||(LA67_0>=60 && LA67_0<=61)||LA67_0==64) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // Mini_Rust2.g:127:22: '(' operations_prio4 ')'
                    {
                    char_literal129=(Token)match(input,41,FOLLOW_41_in_operations_unaires1349);  
                    stream_41.add(char_literal129);

                    pushFollow(FOLLOW_operations_prio4_in_operations_unaires1351);
                    operations_prio4130=operations_prio4();

                    state._fsp--;

                    stream_operations_prio4.add(operations_prio4130.getTree());
                    char_literal131=(Token)match(input,42,FOLLOW_42_in_operations_unaires1353);  
                    stream_42.add(char_literal131);



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
                    // 127:47: -> ^( operations_prio4 )
                    {
                        // Mini_Rust2.g:127:50: ^( operations_prio4 )
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
                    // Mini_Rust2.g:128:22: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_operations_unaires1382);
                    variable132=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable132.getTree());

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
    // Mini_Rust2.g:131:1: variable : ( variable2 | unaire_var );
    public final Mini_Rust2Parser.variable_return variable() throws RecognitionException {
        Mini_Rust2Parser.variable_return retval = new Mini_Rust2Parser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.variable2_return variable2133 = null;

        Mini_Rust2Parser.unaire_var_return unaire_var134 = null;



        try {
            // Mini_Rust2.g:131:10: ( variable2 | unaire_var )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CST_ENT||LA68_0==44||(LA68_0>=60 && LA68_0<=61)) ) {
                alt68=1;
            }
            else if ( (LA68_0==IDF||LA68_0==47||LA68_0==64) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // Mini_Rust2.g:131:12: variable2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable2_in_variable1410);
                    variable2133=variable2();

                    state._fsp--;

                    adaptor.addChild(root_0, variable2133.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:132:12: unaire_var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaire_var_in_variable1423);
                    unaire_var134=unaire_var();

                    state._fsp--;

                    adaptor.addChild(root_0, unaire_var134.getTree());

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
    // Mini_Rust2.g:135:1: unaire_var : ( unaire2 unaire_var -> ^( unaire2 unaire_var ) | IDF ( comm )? ( fonctions_ou_vecteurs_ou_struct )? -> ^( VAR IDF ( fonctions_ou_vecteurs_ou_struct )? ) );
    public final Mini_Rust2Parser.unaire_var_return unaire_var() throws RecognitionException {
        Mini_Rust2Parser.unaire_var_return retval = new Mini_Rust2Parser.unaire_var_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF137=null;
        Mini_Rust2Parser.unaire2_return unaire2135 = null;

        Mini_Rust2Parser.unaire_var_return unaire_var136 = null;

        Mini_Rust2Parser.comm_return comm138 = null;

        Mini_Rust2Parser.fonctions_ou_vecteurs_ou_struct_return fonctions_ou_vecteurs_ou_struct139 = null;


        CommonTree IDF137_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_unaire_var=new RewriteRuleSubtreeStream(adaptor,"rule unaire_var");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_fonctions_ou_vecteurs_ou_struct=new RewriteRuleSubtreeStream(adaptor,"rule fonctions_ou_vecteurs_ou_struct");
        RewriteRuleSubtreeStream stream_unaire2=new RewriteRuleSubtreeStream(adaptor,"rule unaire2");
        try {
            // Mini_Rust2.g:135:12: ( unaire2 unaire_var -> ^( unaire2 unaire_var ) | IDF ( comm )? ( fonctions_ou_vecteurs_ou_struct )? -> ^( VAR IDF ( fonctions_ou_vecteurs_ou_struct )? ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==47||LA71_0==64) ) {
                alt71=1;
            }
            else if ( (LA71_0==IDF) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // Mini_Rust2.g:135:14: unaire2 unaire_var
                    {
                    pushFollow(FOLLOW_unaire2_in_unaire_var1441);
                    unaire2135=unaire2();

                    state._fsp--;

                    stream_unaire2.add(unaire2135.getTree());
                    pushFollow(FOLLOW_unaire_var_in_unaire_var1443);
                    unaire_var136=unaire_var();

                    state._fsp--;

                    stream_unaire_var.add(unaire_var136.getTree());


                    // AST REWRITE
                    // elements: unaire2, unaire_var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 135:33: -> ^( unaire2 unaire_var )
                    {
                        // Mini_Rust2.g:135:36: ^( unaire2 unaire_var )
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
                    // Mini_Rust2.g:136:14: IDF ( comm )? ( fonctions_ou_vecteurs_ou_struct )?
                    {
                    IDF137=(Token)match(input,IDF,FOLLOW_IDF_in_unaire_var1466);  
                    stream_IDF.add(IDF137);

                    // Mini_Rust2.g:136:18: ( comm )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==76||LA69_0==78) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Mini_Rust2.g:136:18: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire_var1468);
                            comm138=comm();

                            state._fsp--;

                            stream_comm.add(comm138.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:136:24: ( fonctions_ou_vecteurs_ou_struct )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==36||LA70_0==41||LA70_0==62||LA70_0==65) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // Mini_Rust2.g:136:24: fonctions_ou_vecteurs_ou_struct
                            {
                            pushFollow(FOLLOW_fonctions_ou_vecteurs_ou_struct_in_unaire_var1471);
                            fonctions_ou_vecteurs_ou_struct139=fonctions_ou_vecteurs_ou_struct();

                            state._fsp--;

                            stream_fonctions_ou_vecteurs_ou_struct.add(fonctions_ou_vecteurs_ou_struct139.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fonctions_ou_vecteurs_ou_struct, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 136:57: -> ^( VAR IDF ( fonctions_ou_vecteurs_ou_struct )? )
                    {
                        // Mini_Rust2.g:136:60: ^( VAR IDF ( fonctions_ou_vecteurs_ou_struct )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Mini_Rust2.g:136:70: ( fonctions_ou_vecteurs_ou_struct )?
                        if ( stream_fonctions_ou_vecteurs_ou_struct.hasNext() ) {
                            adaptor.addChild(root_1, stream_fonctions_ou_vecteurs_ou_struct.nextTree());

                        }
                        stream_fonctions_ou_vecteurs_ou_struct.reset();

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
    // $ANTLR end "unaire_var"

    public static class variable2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable2"
    // Mini_Rust2.g:139:1: variable2 : ( 'true' ( comm )? -> 'true' | 'false' ( comm )? -> 'false' | CST_ENT ( comm )? -> CST_ENT | 'Vec' ( comm )? '!' ( comm )? '[' ( comm )? ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )? ']' ( comm )? -> ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? ) );
    public final Mini_Rust2Parser.variable2_return variable2() throws RecognitionException {
        Mini_Rust2Parser.variable2_return retval = new Mini_Rust2Parser.variable2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal140=null;
        Token string_literal142=null;
        Token CST_ENT144=null;
        Token string_literal146=null;
        Token char_literal148=null;
        Token char_literal150=null;
        Token char_literal153=null;
        Token char_literal156=null;
        Mini_Rust2Parser.comm_return comm141 = null;

        Mini_Rust2Parser.comm_return comm143 = null;

        Mini_Rust2Parser.comm_return comm145 = null;

        Mini_Rust2Parser.comm_return comm147 = null;

        Mini_Rust2Parser.comm_return comm149 = null;

        Mini_Rust2Parser.comm_return comm151 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4152 = null;

        Mini_Rust2Parser.comm_return comm154 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4155 = null;

        Mini_Rust2Parser.comm_return comm157 = null;


        CommonTree string_literal140_tree=null;
        CommonTree string_literal142_tree=null;
        CommonTree CST_ENT144_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree char_literal150_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal156_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_CST_ENT=new RewriteRuleTokenStream(adaptor,"token CST_ENT");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_operations_prio4=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4");
        try {
            // Mini_Rust2.g:139:11: ( 'true' ( comm )? -> 'true' | 'false' ( comm )? -> 'false' | CST_ENT ( comm )? -> CST_ENT | 'Vec' ( comm )? '!' ( comm )? '[' ( comm )? ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )? ']' ( comm )? -> ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt82=1;
                }
                break;
            case 61:
                {
                alt82=2;
                }
                break;
            case CST_ENT:
                {
                alt82=3;
                }
                break;
            case 44:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // Mini_Rust2.g:139:13: 'true' ( comm )?
                    {
                    string_literal140=(Token)match(input,60,FOLLOW_60_in_variable21505);  
                    stream_60.add(string_literal140);

                    // Mini_Rust2.g:139:20: ( comm )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==76||LA72_0==78) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Mini_Rust2.g:139:20: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21507);
                            comm141=comm();

                            state._fsp--;

                            stream_comm.add(comm141.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 139:26: -> 'true'
                    {
                        adaptor.addChild(root_0, stream_60.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:140:13: 'false' ( comm )?
                    {
                    string_literal142=(Token)match(input,61,FOLLOW_61_in_variable21526);  
                    stream_61.add(string_literal142);

                    // Mini_Rust2.g:140:21: ( comm )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==76||LA73_0==78) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Mini_Rust2.g:140:21: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21528);
                            comm143=comm();

                            state._fsp--;

                            stream_comm.add(comm143.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 61
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 140:27: -> 'false'
                    {
                        adaptor.addChild(root_0, stream_61.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:141:13: CST_ENT ( comm )?
                    {
                    CST_ENT144=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_variable21547);  
                    stream_CST_ENT.add(CST_ENT144);

                    // Mini_Rust2.g:141:21: ( comm )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==76||LA74_0==78) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Mini_Rust2.g:141:21: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21549);
                            comm145=comm();

                            state._fsp--;

                            stream_comm.add(comm145.getTree());

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
                    // 141:27: -> CST_ENT
                    {
                        adaptor.addChild(root_0, stream_CST_ENT.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:142:13: 'Vec' ( comm )? '!' ( comm )? '[' ( comm )? ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )? ']' ( comm )?
                    {
                    string_literal146=(Token)match(input,44,FOLLOW_44_in_variable21568);  
                    stream_44.add(string_literal146);

                    // Mini_Rust2.g:142:19: ( comm )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==76||LA75_0==78) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Mini_Rust2.g:142:19: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21570);
                            comm147=comm();

                            state._fsp--;

                            stream_comm.add(comm147.getTree());

                            }
                            break;

                    }

                    char_literal148=(Token)match(input,54,FOLLOW_54_in_variable21573);  
                    stream_54.add(char_literal148);

                    // Mini_Rust2.g:142:29: ( comm )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==76||LA76_0==78) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // Mini_Rust2.g:142:29: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21575);
                            comm149=comm();

                            state._fsp--;

                            stream_comm.add(comm149.getTree());

                            }
                            break;

                    }

                    char_literal150=(Token)match(input,62,FOLLOW_62_in_variable21578);  
                    stream_62.add(char_literal150);

                    // Mini_Rust2.g:142:39: ( comm )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==76||LA77_0==78) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // Mini_Rust2.g:142:39: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21580);
                            comm151=comm();

                            state._fsp--;

                            stream_comm.add(comm151.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:142:45: ( operations_prio4 ( ',' ( comm )? operations_prio4 )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( ((LA80_0>=IDF && LA80_0<=CST_ENT)||LA80_0==41||LA80_0==44||LA80_0==47||LA80_0==54||(LA80_0>=60 && LA80_0<=61)||LA80_0==64||LA80_0==67) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // Mini_Rust2.g:142:47: operations_prio4 ( ',' ( comm )? operations_prio4 )*
                            {
                            pushFollow(FOLLOW_operations_prio4_in_variable21585);
                            operations_prio4152=operations_prio4();

                            state._fsp--;

                            stream_operations_prio4.add(operations_prio4152.getTree());
                            // Mini_Rust2.g:142:64: ( ',' ( comm )? operations_prio4 )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==37) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // Mini_Rust2.g:142:65: ',' ( comm )? operations_prio4
                            	    {
                            	    char_literal153=(Token)match(input,37,FOLLOW_37_in_variable21588);  
                            	    stream_37.add(char_literal153);

                            	    // Mini_Rust2.g:142:69: ( comm )?
                            	    int alt78=2;
                            	    int LA78_0 = input.LA(1);

                            	    if ( (LA78_0==76||LA78_0==78) ) {
                            	        alt78=1;
                            	    }
                            	    switch (alt78) {
                            	        case 1 :
                            	            // Mini_Rust2.g:142:69: comm
                            	            {
                            	            pushFollow(FOLLOW_comm_in_variable21590);
                            	            comm154=comm();

                            	            state._fsp--;

                            	            stream_comm.add(comm154.getTree());

                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_operations_prio4_in_variable21593);
                            	    operations_prio4155=operations_prio4();

                            	    state._fsp--;

                            	    stream_operations_prio4.add(operations_prio4155.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal156=(Token)match(input,63,FOLLOW_63_in_variable21599);  
                    stream_63.add(char_literal156);

                    // Mini_Rust2.g:142:100: ( comm )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==76||LA81_0==78) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // Mini_Rust2.g:142:100: comm
                            {
                            pushFollow(FOLLOW_comm_in_variable21601);
                            comm157=comm();

                            state._fsp--;

                            stream_comm.add(comm157.getTree());

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
                    // 142:106: -> ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? )
                    {
                        // Mini_Rust2.g:142:109: ^( DECL_VEC ( operations_prio4 ( operations_prio4 )* )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL_VEC, "DECL_VEC"), root_1);

                        // Mini_Rust2.g:142:120: ( operations_prio4 ( operations_prio4 )* )?
                        if ( stream_operations_prio4.hasNext()||stream_operations_prio4.hasNext() ) {
                            adaptor.addChild(root_1, stream_operations_prio4.nextTree());
                            // Mini_Rust2.g:142:138: ( operations_prio4 )*
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
    // Mini_Rust2.g:145:1: accesseur : ( IDF ( acces_accesseur )? | '*' accesseur -> ^( POINTEUR_VAL accesseur ) );
    public final Mini_Rust2Parser.accesseur_return accesseur() throws RecognitionException {
        Mini_Rust2Parser.accesseur_return retval = new Mini_Rust2Parser.accesseur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF158=null;
        Token char_literal160=null;
        Mini_Rust2Parser.acces_accesseur_return acces_accesseur159 = null;

        Mini_Rust2Parser.accesseur_return accesseur161 = null;


        CommonTree IDF158_tree=null;
        CommonTree char_literal160_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_accesseur=new RewriteRuleSubtreeStream(adaptor,"rule accesseur");
        try {
            // Mini_Rust2.g:145:11: ( IDF ( acces_accesseur )? | '*' accesseur -> ^( POINTEUR_VAL accesseur ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IDF) ) {
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
                    // Mini_Rust2.g:145:13: IDF ( acces_accesseur )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF158=(Token)match(input,IDF,FOLLOW_IDF_in_accesseur1637); 
                    IDF158_tree = (CommonTree)adaptor.create(IDF158);
                    adaptor.addChild(root_0, IDF158_tree);

                    // Mini_Rust2.g:145:17: ( acces_accesseur )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==62||LA83_0==65) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // Mini_Rust2.g:145:17: acces_accesseur
                            {
                            pushFollow(FOLLOW_acces_accesseur_in_accesseur1639);
                            acces_accesseur159=acces_accesseur();

                            state._fsp--;

                            adaptor.addChild(root_0, acces_accesseur159.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:146:13: '*' accesseur
                    {
                    char_literal160=(Token)match(input,64,FOLLOW_64_in_accesseur1654);  
                    stream_64.add(char_literal160);

                    pushFollow(FOLLOW_accesseur_in_accesseur1656);
                    accesseur161=accesseur();

                    state._fsp--;

                    stream_accesseur.add(accesseur161.getTree());


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
                    // 146:27: -> ^( POINTEUR_VAL accesseur )
                    {
                        // Mini_Rust2.g:146:30: ^( POINTEUR_VAL accesseur )
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

    public static class fonctions_ou_vecteurs_ou_struct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fonctions_ou_vecteurs_ou_struct"
    // Mini_Rust2.g:149:1: fonctions_ou_vecteurs_ou_struct : ( fonctions_ou_vecteurs | '{' ( comm )? ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )? '}' ( comm )? -> ( valeur_attribut_struct ( valeur_attribut_struct )* )? );
    public final Mini_Rust2Parser.fonctions_ou_vecteurs_ou_struct_return fonctions_ou_vecteurs_ou_struct() throws RecognitionException {
        Mini_Rust2Parser.fonctions_ou_vecteurs_ou_struct_return retval = new Mini_Rust2Parser.fonctions_ou_vecteurs_ou_struct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal163=null;
        Token char_literal166=null;
        Token char_literal169=null;
        Mini_Rust2Parser.fonctions_ou_vecteurs_return fonctions_ou_vecteurs162 = null;

        Mini_Rust2Parser.comm_return comm164 = null;

        Mini_Rust2Parser.valeur_attribut_struct_return valeur_attribut_struct165 = null;

        Mini_Rust2Parser.comm_return comm167 = null;

        Mini_Rust2Parser.valeur_attribut_struct_return valeur_attribut_struct168 = null;

        Mini_Rust2Parser.comm_return comm170 = null;


        CommonTree char_literal163_tree=null;
        CommonTree char_literal166_tree=null;
        CommonTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_valeur_attribut_struct=new RewriteRuleSubtreeStream(adaptor,"rule valeur_attribut_struct");
        try {
            // Mini_Rust2.g:149:33: ( fonctions_ou_vecteurs | '{' ( comm )? ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )? '}' ( comm )? -> ( valeur_attribut_struct ( valeur_attribut_struct )* )? )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==41||LA90_0==62||LA90_0==65) ) {
                alt90=1;
            }
            else if ( (LA90_0==36) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // Mini_Rust2.g:149:35: fonctions_ou_vecteurs
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fonctions_ou_vecteurs_in_fonctions_ou_vecteurs_ou_struct1684);
                    fonctions_ou_vecteurs162=fonctions_ou_vecteurs();

                    state._fsp--;

                    adaptor.addChild(root_0, fonctions_ou_vecteurs162.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:150:35: '{' ( comm )? ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )? '}' ( comm )?
                    {
                    char_literal163=(Token)match(input,36,FOLLOW_36_in_fonctions_ou_vecteurs_ou_struct1720);  
                    stream_36.add(char_literal163);

                    // Mini_Rust2.g:150:39: ( comm )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==76||LA85_0==78) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // Mini_Rust2.g:150:39: comm
                            {
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs_ou_struct1722);
                            comm164=comm();

                            state._fsp--;

                            stream_comm.add(comm164.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:150:45: ( valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==IDF) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // Mini_Rust2.g:150:46: valeur_attribut_struct ( ',' ( comm )? valeur_attribut_struct )*
                            {
                            pushFollow(FOLLOW_valeur_attribut_struct_in_fonctions_ou_vecteurs_ou_struct1726);
                            valeur_attribut_struct165=valeur_attribut_struct();

                            state._fsp--;

                            stream_valeur_attribut_struct.add(valeur_attribut_struct165.getTree());
                            // Mini_Rust2.g:150:69: ( ',' ( comm )? valeur_attribut_struct )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==37) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // Mini_Rust2.g:150:70: ',' ( comm )? valeur_attribut_struct
                            	    {
                            	    char_literal166=(Token)match(input,37,FOLLOW_37_in_fonctions_ou_vecteurs_ou_struct1729);  
                            	    stream_37.add(char_literal166);

                            	    // Mini_Rust2.g:150:74: ( comm )?
                            	    int alt86=2;
                            	    int LA86_0 = input.LA(1);

                            	    if ( (LA86_0==76||LA86_0==78) ) {
                            	        alt86=1;
                            	    }
                            	    switch (alt86) {
                            	        case 1 :
                            	            // Mini_Rust2.g:150:74: comm
                            	            {
                            	            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs_ou_struct1731);
                            	            comm167=comm();

                            	            state._fsp--;

                            	            stream_comm.add(comm167.getTree());

                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_valeur_attribut_struct_in_fonctions_ou_vecteurs_ou_struct1734);
                            	    valeur_attribut_struct168=valeur_attribut_struct();

                            	    state._fsp--;

                            	    stream_valeur_attribut_struct.add(valeur_attribut_struct168.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal169=(Token)match(input,38,FOLLOW_38_in_fonctions_ou_vecteurs_ou_struct1741);  
                    stream_38.add(char_literal169);

                    // Mini_Rust2.g:150:112: ( comm )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==76||LA89_0==78) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // Mini_Rust2.g:150:112: comm
                            {
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs_ou_struct1743);
                            comm170=comm();

                            state._fsp--;

                            stream_comm.add(comm170.getTree());

                            }
                            break;

                    }



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
                    // 150:118: -> ( valeur_attribut_struct ( valeur_attribut_struct )* )?
                    {
                        // Mini_Rust2.g:150:121: ( valeur_attribut_struct ( valeur_attribut_struct )* )?
                        if ( stream_valeur_attribut_struct.hasNext()||stream_valeur_attribut_struct.hasNext() ) {
                            adaptor.addChild(root_0, stream_valeur_attribut_struct.nextTree());
                            // Mini_Rust2.g:150:145: ( valeur_attribut_struct )*
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
    // $ANTLR end "fonctions_ou_vecteurs_ou_struct"

    public static class valeur_attribut_struct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "valeur_attribut_struct"
    // Mini_Rust2.g:153:1: valeur_attribut_struct : IDF ':' operations_prio4 -> ^( VAL_ATTRIBUT IDF operations_prio4 ) ;
    public final Mini_Rust2Parser.valeur_attribut_struct_return valeur_attribut_struct() throws RecognitionException {
        Mini_Rust2Parser.valeur_attribut_struct_return retval = new Mini_Rust2Parser.valeur_attribut_struct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF171=null;
        Token char_literal172=null;
        Mini_Rust2Parser.operations_prio4_return operations_prio4173 = null;


        CommonTree IDF171_tree=null;
        CommonTree char_literal172_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_operations_prio4=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4");
        try {
            // Mini_Rust2.g:153:24: ( IDF ':' operations_prio4 -> ^( VAL_ATTRIBUT IDF operations_prio4 ) )
            // Mini_Rust2.g:153:26: IDF ':' operations_prio4
            {
            IDF171=(Token)match(input,IDF,FOLLOW_IDF_in_valeur_attribut_struct1797);  
            stream_IDF.add(IDF171);

            char_literal172=(Token)match(input,39,FOLLOW_39_in_valeur_attribut_struct1799);  
            stream_39.add(char_literal172);

            pushFollow(FOLLOW_operations_prio4_in_valeur_attribut_struct1801);
            operations_prio4173=operations_prio4();

            state._fsp--;

            stream_operations_prio4.add(operations_prio4173.getTree());


            // AST REWRITE
            // elements: operations_prio4, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 153:51: -> ^( VAL_ATTRIBUT IDF operations_prio4 )
            {
                // Mini_Rust2.g:153:54: ^( VAL_ATTRIBUT IDF operations_prio4 )
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
    // Mini_Rust2.g:157:1: operations_prio4b : operations_prio3b ( prio4 operations_prio4b )? ;
    public final Mini_Rust2Parser.operations_prio4b_return operations_prio4b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio4b_return retval = new Mini_Rust2Parser.operations_prio4b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio3b_return operations_prio3b174 = null;

        Mini_Rust2Parser.prio4_return prio4175 = null;

        Mini_Rust2Parser.operations_prio4b_return operations_prio4b176 = null;



        try {
            // Mini_Rust2.g:157:19: ( operations_prio3b ( prio4 operations_prio4b )? )
            // Mini_Rust2.g:157:21: operations_prio3b ( prio4 operations_prio4b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio3b_in_operations_prio4b1844);
            operations_prio3b174=operations_prio3b();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio3b174.getTree());
            // Mini_Rust2.g:157:39: ( prio4 operations_prio4b )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=74 && LA91_0<=75)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Mini_Rust2.g:157:40: prio4 operations_prio4b
                    {
                    pushFollow(FOLLOW_prio4_in_operations_prio4b1847);
                    prio4175=prio4();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio4175.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio4b_in_operations_prio4b1851);
                    operations_prio4b176=operations_prio4b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4b176.getTree());

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
    // Mini_Rust2.g:160:1: operations_prio3b : operations_prio2b ( prio3 operations_prio3b )? ;
    public final Mini_Rust2Parser.operations_prio3b_return operations_prio3b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio3b_return retval = new Mini_Rust2Parser.operations_prio3b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio2b_return operations_prio2b177 = null;

        Mini_Rust2Parser.prio3_return prio3178 = null;

        Mini_Rust2Parser.operations_prio3b_return operations_prio3b179 = null;



        try {
            // Mini_Rust2.g:160:19: ( operations_prio2b ( prio3 operations_prio3b )? )
            // Mini_Rust2.g:160:21: operations_prio2b ( prio3 operations_prio3b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio2b_in_operations_prio3b1879);
            operations_prio2b177=operations_prio2b();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio2b177.getTree());
            // Mini_Rust2.g:160:39: ( prio3 operations_prio3b )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=45 && LA92_0<=46)||(LA92_0>=70 && LA92_0<=73)) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Mini_Rust2.g:160:40: prio3 operations_prio3b
                    {
                    pushFollow(FOLLOW_prio3_in_operations_prio3b1882);
                    prio3178=prio3();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio3178.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio3b_in_operations_prio3b1886);
                    operations_prio3b179=operations_prio3b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3b179.getTree());

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
    // Mini_Rust2.g:163:1: operations_prio2b : operations_prio1b ( prio2 operations_prio2b )? ;
    public final Mini_Rust2Parser.operations_prio2b_return operations_prio2b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio2b_return retval = new Mini_Rust2Parser.operations_prio2b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio1b_return operations_prio1b180 = null;

        Mini_Rust2Parser.prio2_return prio2181 = null;

        Mini_Rust2Parser.operations_prio2b_return operations_prio2b182 = null;



        try {
            // Mini_Rust2.g:163:19: ( operations_prio1b ( prio2 operations_prio2b )? )
            // Mini_Rust2.g:163:21: operations_prio1b ( prio2 operations_prio2b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_operations_prio1b_in_operations_prio2b1914);
            operations_prio1b180=operations_prio1b();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio1b180.getTree());
            // Mini_Rust2.g:163:39: ( prio2 operations_prio2b )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==67||LA93_0==69) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Mini_Rust2.g:163:40: prio2 operations_prio2b
                    {
                    pushFollow(FOLLOW_prio2_in_operations_prio2b1917);
                    prio2181=prio2();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio2181.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio2b_in_operations_prio2b1921);
                    operations_prio2b182=operations_prio2b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2b182.getTree());

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
    // Mini_Rust2.g:166:1: operations_prio1b : ( unaire )? operations_unairesb ( prio1 operations_prio1b )? ;
    public final Mini_Rust2Parser.operations_prio1b_return operations_prio1b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio1b_return retval = new Mini_Rust2Parser.operations_prio1b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_return unaire183 = null;

        Mini_Rust2Parser.operations_unairesb_return operations_unairesb184 = null;

        Mini_Rust2Parser.prio1_return prio1185 = null;

        Mini_Rust2Parser.operations_prio1b_return operations_prio1b186 = null;



        try {
            // Mini_Rust2.g:166:19: ( ( unaire )? operations_unairesb ( prio1 operations_prio1b )? )
            // Mini_Rust2.g:166:21: ( unaire )? operations_unairesb ( prio1 operations_prio1b )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // Mini_Rust2.g:166:21: ( unaire )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==54||LA94_0==67) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Mini_Rust2.g:166:22: unaire
                    {
                    pushFollow(FOLLOW_unaire_in_operations_prio1b1950);
                    unaire183=unaire();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(unaire183.getTree(), root_0);

                    }
                    break;

            }

            pushFollow(FOLLOW_operations_unairesb_in_operations_prio1b1956);
            operations_unairesb184=operations_unairesb();

            state._fsp--;

            adaptor.addChild(root_0, operations_unairesb184.getTree());
            // Mini_Rust2.g:166:53: ( prio1 operations_prio1b )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==64||LA95_0==68) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Mini_Rust2.g:166:54: prio1 operations_prio1b
                    {
                    pushFollow(FOLLOW_prio1_in_operations_prio1b1959);
                    prio1185=prio1();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(prio1185.getTree(), root_0);
                    pushFollow(FOLLOW_operations_prio1b_in_operations_prio1b1963);
                    operations_prio1b186=operations_prio1b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1b186.getTree());

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
    // Mini_Rust2.g:169:1: operations_unairesb : ( '(' operations_prio4b ')' -> ^( operations_prio4b ) | variableb );
    public final Mini_Rust2Parser.operations_unairesb_return operations_unairesb() throws RecognitionException {
        Mini_Rust2Parser.operations_unairesb_return retval = new Mini_Rust2Parser.operations_unairesb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal187=null;
        Token char_literal189=null;
        Mini_Rust2Parser.operations_prio4b_return operations_prio4b188 = null;

        Mini_Rust2Parser.variableb_return variableb190 = null;


        CommonTree char_literal187_tree=null;
        CommonTree char_literal189_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_operations_prio4b=new RewriteRuleSubtreeStream(adaptor,"rule operations_prio4b");
        try {
            // Mini_Rust2.g:169:21: ( '(' operations_prio4b ')' -> ^( operations_prio4b ) | variableb )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==41) ) {
                alt96=1;
            }
            else if ( ((LA96_0>=IDF && LA96_0<=CST_ENT)||LA96_0==44||LA96_0==47||(LA96_0>=60 && LA96_0<=61)||LA96_0==64) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // Mini_Rust2.g:169:23: '(' operations_prio4b ')'
                    {
                    char_literal187=(Token)match(input,41,FOLLOW_41_in_operations_unairesb1991);  
                    stream_41.add(char_literal187);

                    pushFollow(FOLLOW_operations_prio4b_in_operations_unairesb1993);
                    operations_prio4b188=operations_prio4b();

                    state._fsp--;

                    stream_operations_prio4b.add(operations_prio4b188.getTree());
                    char_literal189=(Token)match(input,42,FOLLOW_42_in_operations_unairesb1995);  
                    stream_42.add(char_literal189);



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
                    // 169:49: -> ^( operations_prio4b )
                    {
                        // Mini_Rust2.g:169:52: ^( operations_prio4b )
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
                    // Mini_Rust2.g:170:22: variableb
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variableb_in_operations_unairesb2024);
                    variableb190=variableb();

                    state._fsp--;

                    adaptor.addChild(root_0, variableb190.getTree());

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
    // Mini_Rust2.g:173:1: variableb : ( unaire_varb | variable2 );
    public final Mini_Rust2Parser.variableb_return variableb() throws RecognitionException {
        Mini_Rust2Parser.variableb_return retval = new Mini_Rust2Parser.variableb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_varb_return unaire_varb191 = null;

        Mini_Rust2Parser.variable2_return variable2192 = null;



        try {
            // Mini_Rust2.g:173:11: ( unaire_varb | variable2 )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==IDF||LA97_0==47||LA97_0==64) ) {
                alt97=1;
            }
            else if ( (LA97_0==CST_ENT||LA97_0==44||(LA97_0>=60 && LA97_0<=61)) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // Mini_Rust2.g:173:13: unaire_varb
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaire_varb_in_variableb2052);
                    unaire_varb191=unaire_varb();

                    state._fsp--;

                    adaptor.addChild(root_0, unaire_varb191.getTree());

                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:174:13: variable2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable2_in_variableb2066);
                    variable2192=variable2();

                    state._fsp--;

                    adaptor.addChild(root_0, variable2192.getTree());

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
    // Mini_Rust2.g:177:1: unaire_varb : ( unaire2 unaire_varb -> ^( unaire2 unaire_varb ) | IDF ( comm )? ( fonctions_ou_vecteurs )? -> ^( VAR IDF ( fonctions_ou_vecteurs )? ) );
    public final Mini_Rust2Parser.unaire_varb_return unaire_varb() throws RecognitionException {
        Mini_Rust2Parser.unaire_varb_return retval = new Mini_Rust2Parser.unaire_varb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF195=null;
        Mini_Rust2Parser.unaire2_return unaire2193 = null;

        Mini_Rust2Parser.unaire_varb_return unaire_varb194 = null;

        Mini_Rust2Parser.comm_return comm196 = null;

        Mini_Rust2Parser.fonctions_ou_vecteurs_return fonctions_ou_vecteurs197 = null;


        CommonTree IDF195_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_unaire2=new RewriteRuleSubtreeStream(adaptor,"rule unaire2");
        RewriteRuleSubtreeStream stream_fonctions_ou_vecteurs=new RewriteRuleSubtreeStream(adaptor,"rule fonctions_ou_vecteurs");
        RewriteRuleSubtreeStream stream_unaire_varb=new RewriteRuleSubtreeStream(adaptor,"rule unaire_varb");
        try {
            // Mini_Rust2.g:177:13: ( unaire2 unaire_varb -> ^( unaire2 unaire_varb ) | IDF ( comm )? ( fonctions_ou_vecteurs )? -> ^( VAR IDF ( fonctions_ou_vecteurs )? ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==47||LA100_0==64) ) {
                alt100=1;
            }
            else if ( (LA100_0==IDF) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // Mini_Rust2.g:177:15: unaire2 unaire_varb
                    {
                    pushFollow(FOLLOW_unaire2_in_unaire_varb2095);
                    unaire2193=unaire2();

                    state._fsp--;

                    stream_unaire2.add(unaire2193.getTree());
                    pushFollow(FOLLOW_unaire_varb_in_unaire_varb2097);
                    unaire_varb194=unaire_varb();

                    state._fsp--;

                    stream_unaire_varb.add(unaire_varb194.getTree());


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
                    // 177:35: -> ^( unaire2 unaire_varb )
                    {
                        // Mini_Rust2.g:177:38: ^( unaire2 unaire_varb )
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
                    // Mini_Rust2.g:178:15: IDF ( comm )? ( fonctions_ou_vecteurs )?
                    {
                    IDF195=(Token)match(input,IDF,FOLLOW_IDF_in_unaire_varb2121);  
                    stream_IDF.add(IDF195);

                    // Mini_Rust2.g:178:19: ( comm )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==76||LA98_0==78) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Mini_Rust2.g:178:19: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire_varb2123);
                            comm196=comm();

                            state._fsp--;

                            stream_comm.add(comm196.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:178:25: ( fonctions_ou_vecteurs )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==41||LA99_0==62||LA99_0==65) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Mini_Rust2.g:178:25: fonctions_ou_vecteurs
                            {
                            pushFollow(FOLLOW_fonctions_ou_vecteurs_in_unaire_varb2126);
                            fonctions_ou_vecteurs197=fonctions_ou_vecteurs();

                            state._fsp--;

                            stream_fonctions_ou_vecteurs.add(fonctions_ou_vecteurs197.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fonctions_ou_vecteurs, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 178:48: -> ^( VAR IDF ( fonctions_ou_vecteurs )? )
                    {
                        // Mini_Rust2.g:178:51: ^( VAR IDF ( fonctions_ou_vecteurs )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Mini_Rust2.g:178:61: ( fonctions_ou_vecteurs )?
                        if ( stream_fonctions_ou_vecteurs.hasNext() ) {
                            adaptor.addChild(root_1, stream_fonctions_ou_vecteurs.nextTree());

                        }
                        stream_fonctions_ou_vecteurs.reset();

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
    // $ANTLR end "unaire_varb"

    public static class fonctions_ou_vecteurs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fonctions_ou_vecteurs"
    // Mini_Rust2.g:181:1: fonctions_ou_vecteurs : ( '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )? -> ( ^( PARAM_FCT expr ) ( ^( PARAM_FCT expr ) )* )? | acces_variable );
    public final Mini_Rust2Parser.fonctions_ou_vecteurs_return fonctions_ou_vecteurs() throws RecognitionException {
        Mini_Rust2Parser.fonctions_ou_vecteurs_return retval = new Mini_Rust2Parser.fonctions_ou_vecteurs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal198=null;
        Token char_literal201=null;
        Token char_literal204=null;
        Mini_Rust2Parser.comm_return comm199 = null;

        Mini_Rust2Parser.expr_return expr200 = null;

        Mini_Rust2Parser.comm_return comm202 = null;

        Mini_Rust2Parser.expr_return expr203 = null;

        Mini_Rust2Parser.comm_return comm205 = null;

        Mini_Rust2Parser.acces_variable_return acces_variable206 = null;


        CommonTree char_literal198_tree=null;
        CommonTree char_literal201_tree=null;
        CommonTree char_literal204_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:181:23: ( '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )? -> ( ^( PARAM_FCT expr ) ( ^( PARAM_FCT expr ) )* )? | acces_variable )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==41) ) {
                alt106=1;
            }
            else if ( (LA106_0==62||LA106_0==65) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // Mini_Rust2.g:181:25: '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )?
                    {
                    char_literal198=(Token)match(input,41,FOLLOW_41_in_fonctions_ou_vecteurs2159);  
                    stream_41.add(char_literal198);

                    // Mini_Rust2.g:181:29: ( comm )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==76||LA101_0==78) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Mini_Rust2.g:181:29: comm
                            {
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2161);
                            comm199=comm();

                            state._fsp--;

                            stream_comm.add(comm199.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:181:35: ( expr ( ',' ( comm )? expr )* )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( ((LA104_0>=IDF && LA104_0<=CST_ENT)||LA104_0==36||LA104_0==41||LA104_0==44||LA104_0==47||LA104_0==54||(LA104_0>=60 && LA104_0<=61)||LA104_0==64||LA104_0==67) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Mini_Rust2.g:181:36: expr ( ',' ( comm )? expr )*
                            {
                            pushFollow(FOLLOW_expr_in_fonctions_ou_vecteurs2165);
                            expr200=expr();

                            state._fsp--;

                            stream_expr.add(expr200.getTree());
                            // Mini_Rust2.g:181:41: ( ',' ( comm )? expr )*
                            loop103:
                            do {
                                int alt103=2;
                                int LA103_0 = input.LA(1);

                                if ( (LA103_0==37) ) {
                                    alt103=1;
                                }


                                switch (alt103) {
                            	case 1 :
                            	    // Mini_Rust2.g:181:43: ',' ( comm )? expr
                            	    {
                            	    char_literal201=(Token)match(input,37,FOLLOW_37_in_fonctions_ou_vecteurs2169);  
                            	    stream_37.add(char_literal201);

                            	    // Mini_Rust2.g:181:47: ( comm )?
                            	    int alt102=2;
                            	    int LA102_0 = input.LA(1);

                            	    if ( (LA102_0==76||LA102_0==78) ) {
                            	        alt102=1;
                            	    }
                            	    switch (alt102) {
                            	        case 1 :
                            	            // Mini_Rust2.g:181:47: comm
                            	            {
                            	            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2171);
                            	            comm202=comm();

                            	            state._fsp--;

                            	            stream_comm.add(comm202.getTree());

                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_expr_in_fonctions_ou_vecteurs2174);
                            	    expr203=expr();

                            	    state._fsp--;

                            	    stream_expr.add(expr203.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop103;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal204=(Token)match(input,42,FOLLOW_42_in_fonctions_ou_vecteurs2180);  
                    stream_42.add(char_literal204);

                    // Mini_Rust2.g:181:66: ( comm )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==76||LA105_0==78) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Mini_Rust2.g:181:66: comm
                            {
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2182);
                            comm205=comm();

                            state._fsp--;

                            stream_comm.add(comm205.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 181:72: -> ( ^( PARAM_FCT expr ) ( ^( PARAM_FCT expr ) )* )?
                    {
                        // Mini_Rust2.g:181:75: ( ^( PARAM_FCT expr ) ( ^( PARAM_FCT expr ) )* )?
                        if ( stream_expr.hasNext()||stream_expr.hasNext() ) {
                            // Mini_Rust2.g:181:76: ^( PARAM_FCT expr )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM_FCT, "PARAM_FCT"), root_1);

                            adaptor.addChild(root_1, stream_expr.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }
                            // Mini_Rust2.g:181:94: ( ^( PARAM_FCT expr ) )*
                            while ( stream_expr.hasNext() ) {
                                // Mini_Rust2.g:181:95: ^( PARAM_FCT expr )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM_FCT, "PARAM_FCT"), root_1);

                                adaptor.addChild(root_1, stream_expr.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }
                            stream_expr.reset();

                        }
                        stream_expr.reset();
                        stream_expr.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:182:25: acces_variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_acces_variable_in_fonctions_ou_vecteurs2229);
                    acces_variable206=acces_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, acces_variable206.getTree());

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
    // $ANTLR end "fonctions_ou_vecteurs"

    public static class acces_variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "acces_variable"
    // Mini_Rust2.g:186:1: acces_variable : ( '[' ( comm )? expr ']' ( comm )? ( acces_variable )? -> ^( ACCES_VEC expr ( acces_variable )? ) | '.' attribut_vecteur -> attribut_vecteur );
    public final Mini_Rust2Parser.acces_variable_return acces_variable() throws RecognitionException {
        Mini_Rust2Parser.acces_variable_return retval = new Mini_Rust2Parser.acces_variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal207=null;
        Token char_literal210=null;
        Token char_literal213=null;
        Mini_Rust2Parser.comm_return comm208 = null;

        Mini_Rust2Parser.expr_return expr209 = null;

        Mini_Rust2Parser.comm_return comm211 = null;

        Mini_Rust2Parser.acces_variable_return acces_variable212 = null;

        Mini_Rust2Parser.attribut_vecteur_return attribut_vecteur214 = null;


        CommonTree char_literal207_tree=null;
        CommonTree char_literal210_tree=null;
        CommonTree char_literal213_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_acces_variable=new RewriteRuleSubtreeStream(adaptor,"rule acces_variable");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_attribut_vecteur=new RewriteRuleSubtreeStream(adaptor,"rule attribut_vecteur");
        try {
            // Mini_Rust2.g:186:16: ( '[' ( comm )? expr ']' ( comm )? ( acces_variable )? -> ^( ACCES_VEC expr ( acces_variable )? ) | '.' attribut_vecteur -> attribut_vecteur )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==62) ) {
                alt110=1;
            }
            else if ( (LA110_0==65) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // Mini_Rust2.g:186:18: '[' ( comm )? expr ']' ( comm )? ( acces_variable )?
                    {
                    char_literal207=(Token)match(input,62,FOLLOW_62_in_acces_variable2261);  
                    stream_62.add(char_literal207);

                    // Mini_Rust2.g:186:22: ( comm )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==76||LA107_0==78) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Mini_Rust2.g:186:22: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_variable2263);
                            comm208=comm();

                            state._fsp--;

                            stream_comm.add(comm208.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_acces_variable2266);
                    expr209=expr();

                    state._fsp--;

                    stream_expr.add(expr209.getTree());
                    char_literal210=(Token)match(input,63,FOLLOW_63_in_acces_variable2268);  
                    stream_63.add(char_literal210);

                    // Mini_Rust2.g:186:37: ( comm )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==76||LA108_0==78) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Mini_Rust2.g:186:37: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_variable2270);
                            comm211=comm();

                            state._fsp--;

                            stream_comm.add(comm211.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:186:43: ( acces_variable )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==62||LA109_0==65) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Mini_Rust2.g:186:43: acces_variable
                            {
                            pushFollow(FOLLOW_acces_variable_in_acces_variable2273);
                            acces_variable212=acces_variable();

                            state._fsp--;

                            stream_acces_variable.add(acces_variable212.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: acces_variable, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 186:59: -> ^( ACCES_VEC expr ( acces_variable )? )
                    {
                        // Mini_Rust2.g:186:62: ^( ACCES_VEC expr ( acces_variable )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_VEC, "ACCES_VEC"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Mini_Rust2.g:186:79: ( acces_variable )?
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
                    // Mini_Rust2.g:187:18: '.' attribut_vecteur
                    {
                    char_literal213=(Token)match(input,65,FOLLOW_65_in_acces_variable2304);  
                    stream_65.add(char_literal213);

                    pushFollow(FOLLOW_attribut_vecteur_in_acces_variable2306);
                    attribut_vecteur214=attribut_vecteur();

                    state._fsp--;

                    stream_attribut_vecteur.add(attribut_vecteur214.getTree());


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
                    // 187:39: -> attribut_vecteur
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

    public static class attribut_vecteur_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribut_vecteur"
    // Mini_Rust2.g:190:1: attribut_vecteur : ( 'len' ( comm )? '(' ( comm )? ')' ( comm )? -> 'len' | IDF ( acces_variable )? -> ^( ACCES_ATTRIBUT IDF ( acces_variable )? ) );
    public final Mini_Rust2Parser.attribut_vecteur_return attribut_vecteur() throws RecognitionException {
        Mini_Rust2Parser.attribut_vecteur_return retval = new Mini_Rust2Parser.attribut_vecteur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal215=null;
        Token char_literal217=null;
        Token char_literal219=null;
        Token IDF221=null;
        Mini_Rust2Parser.comm_return comm216 = null;

        Mini_Rust2Parser.comm_return comm218 = null;

        Mini_Rust2Parser.comm_return comm220 = null;

        Mini_Rust2Parser.acces_variable_return acces_variable222 = null;


        CommonTree string_literal215_tree=null;
        CommonTree char_literal217_tree=null;
        CommonTree char_literal219_tree=null;
        CommonTree IDF221_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_acces_variable=new RewriteRuleSubtreeStream(adaptor,"rule acces_variable");
        try {
            // Mini_Rust2.g:190:18: ( 'len' ( comm )? '(' ( comm )? ')' ( comm )? -> 'len' | IDF ( acces_variable )? -> ^( ACCES_ATTRIBUT IDF ( acces_variable )? ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==66) ) {
                alt115=1;
            }
            else if ( (LA115_0==IDF) ) {
                alt115=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // Mini_Rust2.g:190:20: 'len' ( comm )? '(' ( comm )? ')' ( comm )?
                    {
                    string_literal215=(Token)match(input,66,FOLLOW_66_in_attribut_vecteur2334);  
                    stream_66.add(string_literal215);

                    // Mini_Rust2.g:190:26: ( comm )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==76||LA111_0==78) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // Mini_Rust2.g:190:26: comm
                            {
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2336);
                            comm216=comm();

                            state._fsp--;

                            stream_comm.add(comm216.getTree());

                            }
                            break;

                    }

                    char_literal217=(Token)match(input,41,FOLLOW_41_in_attribut_vecteur2339);  
                    stream_41.add(char_literal217);

                    // Mini_Rust2.g:190:36: ( comm )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==76||LA112_0==78) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Mini_Rust2.g:190:36: comm
                            {
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2341);
                            comm218=comm();

                            state._fsp--;

                            stream_comm.add(comm218.getTree());

                            }
                            break;

                    }

                    char_literal219=(Token)match(input,42,FOLLOW_42_in_attribut_vecteur2344);  
                    stream_42.add(char_literal219);

                    // Mini_Rust2.g:190:46: ( comm )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==76||LA113_0==78) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // Mini_Rust2.g:190:46: comm
                            {
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2346);
                            comm220=comm();

                            state._fsp--;

                            stream_comm.add(comm220.getTree());

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
                    // 190:52: -> 'len'
                    {
                        adaptor.addChild(root_0, stream_66.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:191:20: IDF ( acces_variable )?
                    {
                    IDF221=(Token)match(input,IDF,FOLLOW_IDF_in_attribut_vecteur2372);  
                    stream_IDF.add(IDF221);

                    // Mini_Rust2.g:191:24: ( acces_variable )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==62||LA114_0==65) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // Mini_Rust2.g:191:24: acces_variable
                            {
                            pushFollow(FOLLOW_acces_variable_in_attribut_vecteur2374);
                            acces_variable222=acces_variable();

                            state._fsp--;

                            stream_acces_variable.add(acces_variable222.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: acces_variable, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 191:40: -> ^( ACCES_ATTRIBUT IDF ( acces_variable )? )
                    {
                        // Mini_Rust2.g:191:43: ^( ACCES_ATTRIBUT IDF ( acces_variable )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_ATTRIBUT, "ACCES_ATTRIBUT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Mini_Rust2.g:191:64: ( acces_variable )?
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
    // Mini_Rust2.g:194:1: acces_accesseur : ( '[' ( comm )? expr ']' ( comm )? ( acces_accesseur )? -> ^( ACCES_VEC expr ( acces_accesseur )? ) | '.' IDF ( acces_accesseur )? -> ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? ) );
    public final Mini_Rust2Parser.acces_accesseur_return acces_accesseur() throws RecognitionException {
        Mini_Rust2Parser.acces_accesseur_return retval = new Mini_Rust2Parser.acces_accesseur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal223=null;
        Token char_literal226=null;
        Token char_literal229=null;
        Token IDF230=null;
        Mini_Rust2Parser.comm_return comm224 = null;

        Mini_Rust2Parser.expr_return expr225 = null;

        Mini_Rust2Parser.comm_return comm227 = null;

        Mini_Rust2Parser.acces_accesseur_return acces_accesseur228 = null;

        Mini_Rust2Parser.acces_accesseur_return acces_accesseur231 = null;


        CommonTree char_literal223_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal229_tree=null;
        CommonTree IDF230_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_acces_accesseur=new RewriteRuleSubtreeStream(adaptor,"rule acces_accesseur");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Mini_Rust2.g:194:17: ( '[' ( comm )? expr ']' ( comm )? ( acces_accesseur )? -> ^( ACCES_VEC expr ( acces_accesseur )? ) | '.' IDF ( acces_accesseur )? -> ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==62) ) {
                alt120=1;
            }
            else if ( (LA120_0==65) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // Mini_Rust2.g:194:19: '[' ( comm )? expr ']' ( comm )? ( acces_accesseur )?
                    {
                    char_literal223=(Token)match(input,62,FOLLOW_62_in_acces_accesseur2412);  
                    stream_62.add(char_literal223);

                    // Mini_Rust2.g:194:23: ( comm )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==76||LA116_0==78) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // Mini_Rust2.g:194:23: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_accesseur2414);
                            comm224=comm();

                            state._fsp--;

                            stream_comm.add(comm224.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_acces_accesseur2417);
                    expr225=expr();

                    state._fsp--;

                    stream_expr.add(expr225.getTree());
                    char_literal226=(Token)match(input,63,FOLLOW_63_in_acces_accesseur2419);  
                    stream_63.add(char_literal226);

                    // Mini_Rust2.g:194:38: ( comm )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==76||LA117_0==78) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // Mini_Rust2.g:194:38: comm
                            {
                            pushFollow(FOLLOW_comm_in_acces_accesseur2421);
                            comm227=comm();

                            state._fsp--;

                            stream_comm.add(comm227.getTree());

                            }
                            break;

                    }

                    // Mini_Rust2.g:194:44: ( acces_accesseur )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==62||LA118_0==65) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // Mini_Rust2.g:194:44: acces_accesseur
                            {
                            pushFollow(FOLLOW_acces_accesseur_in_acces_accesseur2424);
                            acces_accesseur228=acces_accesseur();

                            state._fsp--;

                            stream_acces_accesseur.add(acces_accesseur228.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expr, acces_accesseur
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 194:61: -> ^( ACCES_VEC expr ( acces_accesseur )? )
                    {
                        // Mini_Rust2.g:194:64: ^( ACCES_VEC expr ( acces_accesseur )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_VEC, "ACCES_VEC"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // Mini_Rust2.g:194:81: ( acces_accesseur )?
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
                    // Mini_Rust2.g:195:19: '.' IDF ( acces_accesseur )?
                    {
                    char_literal229=(Token)match(input,65,FOLLOW_65_in_acces_accesseur2456);  
                    stream_65.add(char_literal229);

                    IDF230=(Token)match(input,IDF,FOLLOW_IDF_in_acces_accesseur2458);  
                    stream_IDF.add(IDF230);

                    // Mini_Rust2.g:195:27: ( acces_accesseur )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==62||LA119_0==65) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // Mini_Rust2.g:195:27: acces_accesseur
                            {
                            pushFollow(FOLLOW_acces_accesseur_in_acces_accesseur2460);
                            acces_accesseur231=acces_accesseur();

                            state._fsp--;

                            stream_acces_accesseur.add(acces_accesseur231.getTree());

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
                    // 195:44: -> ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? )
                    {
                        // Mini_Rust2.g:195:47: ^( ACCES_ATTRIBUT IDF ( acces_accesseur )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ACCES_ATTRIBUT, "ACCES_ATTRIBUT"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // Mini_Rust2.g:195:68: ( acces_accesseur )?
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
    // Mini_Rust2.g:198:1: unaire : ( '!' ( comm )? -> '!' | '-' ( comm )? -> '-' );
    public final Mini_Rust2Parser.unaire_return unaire() throws RecognitionException {
        Mini_Rust2Parser.unaire_return retval = new Mini_Rust2Parser.unaire_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal232=null;
        Token char_literal234=null;
        Mini_Rust2Parser.comm_return comm233 = null;

        Mini_Rust2Parser.comm_return comm235 = null;


        CommonTree char_literal232_tree=null;
        CommonTree char_literal234_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:198:8: ( '!' ( comm )? -> '!' | '-' ( comm )? -> '-' )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==54) ) {
                alt123=1;
            }
            else if ( (LA123_0==67) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // Mini_Rust2.g:198:10: '!' ( comm )?
                    {
                    char_literal232=(Token)match(input,54,FOLLOW_54_in_unaire2497);  
                    stream_54.add(char_literal232);

                    // Mini_Rust2.g:198:14: ( comm )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==76||LA121_0==78) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // Mini_Rust2.g:198:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire2499);
                            comm233=comm();

                            state._fsp--;

                            stream_comm.add(comm233.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 54
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:20: -> '!'
                    {
                        adaptor.addChild(root_0, stream_54.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:199:10: '-' ( comm )?
                    {
                    char_literal234=(Token)match(input,67,FOLLOW_67_in_unaire2515);  
                    stream_67.add(char_literal234);

                    // Mini_Rust2.g:199:14: ( comm )?
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==76||LA122_0==78) ) {
                        alt122=1;
                    }
                    switch (alt122) {
                        case 1 :
                            // Mini_Rust2.g:199:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire2517);
                            comm235=comm();

                            state._fsp--;

                            stream_comm.add(comm235.getTree());

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
                    // 199:20: -> '-'
                    {
                        adaptor.addChild(root_0, stream_67.nextNode());

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
    // Mini_Rust2.g:202:1: unaire2 : ( '*' ( comm )? -> POINTEUR_VAL | '&' ( comm )? -> '&' );
    public final Mini_Rust2Parser.unaire2_return unaire2() throws RecognitionException {
        Mini_Rust2Parser.unaire2_return retval = new Mini_Rust2Parser.unaire2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        Mini_Rust2Parser.comm_return comm237 = null;

        Mini_Rust2Parser.comm_return comm239 = null;


        CommonTree char_literal236_tree=null;
        CommonTree char_literal238_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:202:9: ( '*' ( comm )? -> POINTEUR_VAL | '&' ( comm )? -> '&' )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==64) ) {
                alt126=1;
            }
            else if ( (LA126_0==47) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // Mini_Rust2.g:202:11: '*' ( comm )?
                    {
                    char_literal236=(Token)match(input,64,FOLLOW_64_in_unaire22538);  
                    stream_64.add(char_literal236);

                    // Mini_Rust2.g:202:15: ( comm )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==76||LA124_0==78) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // Mini_Rust2.g:202:15: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire22540);
                            comm237=comm();

                            state._fsp--;

                            stream_comm.add(comm237.getTree());

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
                    // 202:21: -> POINTEUR_VAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(POINTEUR_VAL, "POINTEUR_VAL"));

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:203:11: '&' ( comm )?
                    {
                    char_literal238=(Token)match(input,47,FOLLOW_47_in_unaire22557);  
                    stream_47.add(char_literal238);

                    // Mini_Rust2.g:203:15: ( comm )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==76||LA125_0==78) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // Mini_Rust2.g:203:15: comm
                            {
                            pushFollow(FOLLOW_comm_in_unaire22559);
                            comm239=comm();

                            state._fsp--;

                            stream_comm.add(comm239.getTree());

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
                    // 203:21: -> '&'
                    {
                        adaptor.addChild(root_0, stream_47.nextNode());

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
    // Mini_Rust2.g:206:1: prio1 : ( '*' ( comm )? -> '*' | '/' ( comm )? -> '/' );
    public final Mini_Rust2Parser.prio1_return prio1() throws RecognitionException {
        Mini_Rust2Parser.prio1_return retval = new Mini_Rust2Parser.prio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal240=null;
        Token char_literal242=null;
        Mini_Rust2Parser.comm_return comm241 = null;

        Mini_Rust2Parser.comm_return comm243 = null;


        CommonTree char_literal240_tree=null;
        CommonTree char_literal242_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:206:7: ( '*' ( comm )? -> '*' | '/' ( comm )? -> '/' )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==64) ) {
                alt129=1;
            }
            else if ( (LA129_0==68) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // Mini_Rust2.g:206:9: '*' ( comm )?
                    {
                    char_literal240=(Token)match(input,64,FOLLOW_64_in_prio12581);  
                    stream_64.add(char_literal240);

                    // Mini_Rust2.g:206:13: ( comm )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==76||LA127_0==78) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // Mini_Rust2.g:206:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio12583);
                            comm241=comm();

                            state._fsp--;

                            stream_comm.add(comm241.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 64
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:19: -> '*'
                    {
                        adaptor.addChild(root_0, stream_64.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:207:9: '/' ( comm )?
                    {
                    char_literal242=(Token)match(input,68,FOLLOW_68_in_prio12598);  
                    stream_68.add(char_literal242);

                    // Mini_Rust2.g:207:13: ( comm )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==76||LA128_0==78) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // Mini_Rust2.g:207:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio12600);
                            comm243=comm();

                            state._fsp--;

                            stream_comm.add(comm243.getTree());

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
                    // 207:19: -> '/'
                    {
                        adaptor.addChild(root_0, stream_68.nextNode());

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
    // Mini_Rust2.g:210:1: prio2 : ( '+' ( comm )? -> '+' | '-' ( comm )? -> '-' );
    public final Mini_Rust2Parser.prio2_return prio2() throws RecognitionException {
        Mini_Rust2Parser.prio2_return retval = new Mini_Rust2Parser.prio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal244=null;
        Token char_literal246=null;
        Mini_Rust2Parser.comm_return comm245 = null;

        Mini_Rust2Parser.comm_return comm247 = null;


        CommonTree char_literal244_tree=null;
        CommonTree char_literal246_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:210:7: ( '+' ( comm )? -> '+' | '-' ( comm )? -> '-' )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==69) ) {
                alt132=1;
            }
            else if ( (LA132_0==67) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // Mini_Rust2.g:210:9: '+' ( comm )?
                    {
                    char_literal244=(Token)match(input,69,FOLLOW_69_in_prio22627);  
                    stream_69.add(char_literal244);

                    // Mini_Rust2.g:210:13: ( comm )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==76||LA130_0==78) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // Mini_Rust2.g:210:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio22629);
                            comm245=comm();

                            state._fsp--;

                            stream_comm.add(comm245.getTree());

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
                    // 210:19: -> '+'
                    {
                        adaptor.addChild(root_0, stream_69.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:211:9: '-' ( comm )?
                    {
                    char_literal246=(Token)match(input,67,FOLLOW_67_in_prio22644);  
                    stream_67.add(char_literal246);

                    // Mini_Rust2.g:211:13: ( comm )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==76||LA131_0==78) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // Mini_Rust2.g:211:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio22646);
                            comm247=comm();

                            state._fsp--;

                            stream_comm.add(comm247.getTree());

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
                    // 211:19: -> '-'
                    {
                        adaptor.addChild(root_0, stream_67.nextNode());

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
    // Mini_Rust2.g:214:1: prio3 : ( '<' ( comm )? -> '<' | '>' ( comm )? -> '>' | '>=' ( comm )? -> '>=' | '<=' ( comm )? -> '<=' | '==' ( comm )? -> '==' | '!=' ( comm )? -> '!=' );
    public final Mini_Rust2Parser.prio3_return prio3() throws RecognitionException {
        Mini_Rust2Parser.prio3_return retval = new Mini_Rust2Parser.prio3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal248=null;
        Token char_literal250=null;
        Token string_literal252=null;
        Token string_literal254=null;
        Token string_literal256=null;
        Token string_literal258=null;
        Mini_Rust2Parser.comm_return comm249 = null;

        Mini_Rust2Parser.comm_return comm251 = null;

        Mini_Rust2Parser.comm_return comm253 = null;

        Mini_Rust2Parser.comm_return comm255 = null;

        Mini_Rust2Parser.comm_return comm257 = null;

        Mini_Rust2Parser.comm_return comm259 = null;


        CommonTree char_literal248_tree=null;
        CommonTree char_literal250_tree=null;
        CommonTree string_literal252_tree=null;
        CommonTree string_literal254_tree=null;
        CommonTree string_literal256_tree=null;
        CommonTree string_literal258_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:214:7: ( '<' ( comm )? -> '<' | '>' ( comm )? -> '>' | '>=' ( comm )? -> '>=' | '<=' ( comm )? -> '<=' | '==' ( comm )? -> '==' | '!=' ( comm )? -> '!=' )
            int alt139=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt139=1;
                }
                break;
            case 46:
                {
                alt139=2;
                }
                break;
            case 70:
                {
                alt139=3;
                }
                break;
            case 71:
                {
                alt139=4;
                }
                break;
            case 72:
                {
                alt139=5;
                }
                break;
            case 73:
                {
                alt139=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // Mini_Rust2.g:214:9: '<' ( comm )?
                    {
                    char_literal248=(Token)match(input,45,FOLLOW_45_in_prio32667);  
                    stream_45.add(char_literal248);

                    // Mini_Rust2.g:214:13: ( comm )?
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==76||LA133_0==78) ) {
                        alt133=1;
                    }
                    switch (alt133) {
                        case 1 :
                            // Mini_Rust2.g:214:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio32669);
                            comm249=comm();

                            state._fsp--;

                            stream_comm.add(comm249.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 45
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:19: -> '<'
                    {
                        adaptor.addChild(root_0, stream_45.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:215:9: '>' ( comm )?
                    {
                    char_literal250=(Token)match(input,46,FOLLOW_46_in_prio32684);  
                    stream_46.add(char_literal250);

                    // Mini_Rust2.g:215:13: ( comm )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==76||LA134_0==78) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // Mini_Rust2.g:215:13: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio32686);
                            comm251=comm();

                            state._fsp--;

                            stream_comm.add(comm251.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 46
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 215:19: -> '>'
                    {
                        adaptor.addChild(root_0, stream_46.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // Mini_Rust2.g:216:9: '>=' ( comm )?
                    {
                    string_literal252=(Token)match(input,70,FOLLOW_70_in_prio32701);  
                    stream_70.add(string_literal252);

                    // Mini_Rust2.g:216:14: ( comm )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==76||LA135_0==78) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // Mini_Rust2.g:216:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio32703);
                            comm253=comm();

                            state._fsp--;

                            stream_comm.add(comm253.getTree());

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
                    // 216:20: -> '>='
                    {
                        adaptor.addChild(root_0, stream_70.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // Mini_Rust2.g:217:9: '<=' ( comm )?
                    {
                    string_literal254=(Token)match(input,71,FOLLOW_71_in_prio32718);  
                    stream_71.add(string_literal254);

                    // Mini_Rust2.g:217:14: ( comm )?
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==76||LA136_0==78) ) {
                        alt136=1;
                    }
                    switch (alt136) {
                        case 1 :
                            // Mini_Rust2.g:217:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio32720);
                            comm255=comm();

                            state._fsp--;

                            stream_comm.add(comm255.getTree());

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
                    // 217:20: -> '<='
                    {
                        adaptor.addChild(root_0, stream_71.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // Mini_Rust2.g:218:9: '==' ( comm )?
                    {
                    string_literal256=(Token)match(input,72,FOLLOW_72_in_prio32735);  
                    stream_72.add(string_literal256);

                    // Mini_Rust2.g:218:14: ( comm )?
                    int alt137=2;
                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==76||LA137_0==78) ) {
                        alt137=1;
                    }
                    switch (alt137) {
                        case 1 :
                            // Mini_Rust2.g:218:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio32737);
                            comm257=comm();

                            state._fsp--;

                            stream_comm.add(comm257.getTree());

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
                    // 218:20: -> '=='
                    {
                        adaptor.addChild(root_0, stream_72.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // Mini_Rust2.g:219:9: '!=' ( comm )?
                    {
                    string_literal258=(Token)match(input,73,FOLLOW_73_in_prio32752);  
                    stream_73.add(string_literal258);

                    // Mini_Rust2.g:219:14: ( comm )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==76||LA138_0==78) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // Mini_Rust2.g:219:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio32754);
                            comm259=comm();

                            state._fsp--;

                            stream_comm.add(comm259.getTree());

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
                    // 219:20: -> '!='
                    {
                        adaptor.addChild(root_0, stream_73.nextNode());

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
    // Mini_Rust2.g:222:1: prio4 : ( '&&' ( comm )? -> '&&' | '||' ( comm )? -> '||' );
    public final Mini_Rust2Parser.prio4_return prio4() throws RecognitionException {
        Mini_Rust2Parser.prio4_return retval = new Mini_Rust2Parser.prio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal260=null;
        Token string_literal262=null;
        Mini_Rust2Parser.comm_return comm261 = null;

        Mini_Rust2Parser.comm_return comm263 = null;


        CommonTree string_literal260_tree=null;
        CommonTree string_literal262_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:222:7: ( '&&' ( comm )? -> '&&' | '||' ( comm )? -> '||' )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==74) ) {
                alt142=1;
            }
            else if ( (LA142_0==75) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // Mini_Rust2.g:222:9: '&&' ( comm )?
                    {
                    string_literal260=(Token)match(input,74,FOLLOW_74_in_prio42774);  
                    stream_74.add(string_literal260);

                    // Mini_Rust2.g:222:14: ( comm )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==76||LA140_0==78) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // Mini_Rust2.g:222:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio42776);
                            comm261=comm();

                            state._fsp--;

                            stream_comm.add(comm261.getTree());

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
                    // 222:20: -> '&&'
                    {
                        adaptor.addChild(root_0, stream_74.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:223:9: '||' ( comm )?
                    {
                    string_literal262=(Token)match(input,75,FOLLOW_75_in_prio42791);  
                    stream_75.add(string_literal262);

                    // Mini_Rust2.g:223:14: ( comm )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==76||LA141_0==78) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // Mini_Rust2.g:223:14: comm
                            {
                            pushFollow(FOLLOW_comm_in_prio42793);
                            comm263=comm();

                            state._fsp--;

                            stream_comm.add(comm263.getTree());

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
                    // 223:20: -> '||'
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
    // $ANTLR end "prio4"

    public static class prio5_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio5"
    // Mini_Rust2.g:226:1: prio5 : '=' ( comm )? -> '=' ;
    public final Mini_Rust2Parser.prio5_return prio5() throws RecognitionException {
        Mini_Rust2Parser.prio5_return retval = new Mini_Rust2Parser.prio5_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal264=null;
        Mini_Rust2Parser.comm_return comm265 = null;


        CommonTree char_literal264_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try {
            // Mini_Rust2.g:226:7: ( '=' ( comm )? -> '=' )
            // Mini_Rust2.g:226:9: '=' ( comm )?
            {
            char_literal264=(Token)match(input,55,FOLLOW_55_in_prio52813);  
            stream_55.add(char_literal264);

            // Mini_Rust2.g:226:13: ( comm )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==76||LA143_0==78) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // Mini_Rust2.g:226:13: comm
                    {
                    pushFollow(FOLLOW_comm_in_prio52815);
                    comm265=comm();

                    state._fsp--;

                    stream_comm.add(comm265.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: 55
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:19: -> '='
            {
                adaptor.addChild(root_0, stream_55.nextNode());

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
    // Mini_Rust2.g:229:1: comm : ( '/*' ( . )* '*/' | '//' ( . )* '\\n' );
    public final Mini_Rust2Parser.comm_return comm() throws RecognitionException {
        Mini_Rust2Parser.comm_return retval = new Mini_Rust2Parser.comm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal266=null;
        Token wildcard267=null;
        Token string_literal268=null;
        Token string_literal269=null;
        Token wildcard270=null;
        Token char_literal271=null;

        CommonTree string_literal266_tree=null;
        CommonTree wildcard267_tree=null;
        CommonTree string_literal268_tree=null;
        CommonTree string_literal269_tree=null;
        CommonTree wildcard270_tree=null;
        CommonTree char_literal271_tree=null;

        try {
            // Mini_Rust2.g:229:6: ( '/*' ( . )* '*/' | '//' ( . )* '\\n' )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==76) ) {
                alt146=1;
            }
            else if ( (LA146_0==78) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // Mini_Rust2.g:229:8: '/*' ( . )* '*/'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal266=(Token)match(input,76,FOLLOW_76_in_comm2835); 
                    string_literal266_tree = (CommonTree)adaptor.create(string_literal266);
                    adaptor.addChild(root_0, string_literal266_tree);

                    // Mini_Rust2.g:229:13: ( . )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==77) ) {
                            alt144=2;
                        }
                        else if ( ((LA144_0>=FICHIER && LA144_0<=76)||(LA144_0>=78 && LA144_0<=79)) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // Mini_Rust2.g:229:13: .
                    	    {
                    	    wildcard267=(Token)input.LT(1);
                    	    matchAny(input); 
                    	    wildcard267_tree = (CommonTree)adaptor.create(wildcard267);
                    	    adaptor.addChild(root_0, wildcard267_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);

                    string_literal268=(Token)match(input,77,FOLLOW_77_in_comm2840); 
                    string_literal268_tree = (CommonTree)adaptor.create(string_literal268);
                    adaptor.addChild(root_0, string_literal268_tree);


                    }
                    break;
                case 2 :
                    // Mini_Rust2.g:230:8: '//' ( . )* '\\n'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal269=(Token)match(input,78,FOLLOW_78_in_comm2849); 
                    string_literal269_tree = (CommonTree)adaptor.create(string_literal269);
                    adaptor.addChild(root_0, string_literal269_tree);

                    // Mini_Rust2.g:230:13: ( . )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==79) ) {
                            alt145=2;
                        }
                        else if ( ((LA145_0>=FICHIER && LA145_0<=78)) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // Mini_Rust2.g:230:13: .
                    	    {
                    	    wildcard270=(Token)input.LT(1);
                    	    matchAny(input); 
                    	    wildcard270_tree = (CommonTree)adaptor.create(wildcard270);
                    	    adaptor.addChild(root_0, wildcard270_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    char_literal271=(Token)match(input,79,FOLLOW_79_in_comm2854); 
                    char_literal271_tree = (CommonTree)adaptor.create(char_literal271);
                    adaptor.addChild(root_0, char_literal271_tree);


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
    // $ANTLR end "comm"

    // Delegated rules


 

    public static final BitSet FOLLOW_comm_in_prog248 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_fichier_in_prog251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fichier275 = new BitSet(new long[]{0x0000010800000002L});
    public static final BitSet FOLLOW_decl_struct_in_decl293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_fun_in_decl302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_decl_struct316 = new BitSet(new long[]{0x0000000100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_struct318 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct321 = new BitSet(new long[]{0x0000001000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_struct323 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_decl_struct326 = new BitSet(new long[]{0x0000004100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_struct328 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_attribut_in_decl_struct332 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_decl_struct335 = new BitSet(new long[]{0x0000000100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_struct337 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_attribut_in_decl_struct340 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38_in_decl_struct347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_struct349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_attribut392 = new BitSet(new long[]{0x0000008000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_attribut394 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_attribut397 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_attribut399 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_type_in_attribut402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_decl_fun430 = new BitSet(new long[]{0x0000000100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_fun432 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDF_in_decl_fun435 = new BitSet(new long[]{0x0000020000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_fun437 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_decl_fun440 = new BitSet(new long[]{0x0000040100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_fun442 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_argument_in_decl_fun446 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_37_in_decl_fun449 = new BitSet(new long[]{0x0000000100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_fun451 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_argument_in_decl_fun454 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_42_in_decl_fun460 = new BitSet(new long[]{0x0000081000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_fun462 = new BitSet(new long[]{0x0000081000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_43_in_decl_fun466 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_decl_fun468 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_type_in_decl_fun471 = new BitSet(new long[]{0x0000081000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_bloc_in_decl_fun475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_type517 = new BitSet(new long[]{0x0000200000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type519 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_type522 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type524 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_type_in_type527 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_type529 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_type549 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type551 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_type_in_type554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_type571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_type587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_type603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_type605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_argument624 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_argument626 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_argument628 = new BitSet(new long[]{0x0003900100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_type_in_argument631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_bloc659 = new BitSet(new long[]{0x3578924300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_bloc661 = new BitSet(new long[]{0x3578924300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_sous_bloc_in_bloc664 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_bloc667 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_bloc669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_avec_point_in_sous_bloc693 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_sous_bloc696 = new BitSet(new long[]{0x357C920300000002L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_sous_bloc699 = new BitSet(new long[]{0x3578920300000002L,0x0000000000000009L});
    public static final BitSet FOLLOW_sous_bloc_in_sous_bloc702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_sans_point_in_sous_bloc726 = new BitSet(new long[]{0x357C920300000002L,0x0000000000000009L});
    public static final BitSet FOLLOW_50_in_sous_bloc728 = new BitSet(new long[]{0x357C920300000002L,0x0000000000000009L});
    public static final BitSet FOLLOW_sous_bloc_in_sous_bloc731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_instruction_avec_point758 = new BitSet(new long[]{0x0200000100000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_let2_in_instruction_avec_point760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_instruction_avec_point791 = new BitSet(new long[]{0x30789A1300000002L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point793 = new BitSet(new long[]{0x30789A1300000002L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_instruction_avec_point796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_instruction_avec_point834 = new BitSet(new long[]{0x0040000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point836 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_instruction_avec_point839 = new BitSet(new long[]{0x0000020000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point841 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_instruction_avec_point844 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point846 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_instruction_avec_point849 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_instruction_avec_point851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_instruction_avec_point853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio4_in_instruction_avec_point889 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_instruction_avec_point892 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio4_in_instruction_avec_point896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_instruction_sans_point930 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_instruction_sans_point932 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio4b_in_instruction_sans_point935 = new BitSet(new long[]{0x0000081000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_bloc_in_instruction_sans_point937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_instruction_sans_point979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_let21011 = new BitSet(new long[]{0x0200000100000000L,0x0000000000005001L});
    public static final BitSet FOLLOW_comm_in_let21013 = new BitSet(new long[]{0x0200000100000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_accesseur_in_let21016 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_let21019 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_let21021 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_let21024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_accesseur_in_let21046 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_let21049 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_let21051 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_let21054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_if_expr1082 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_if_expr1084 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio4b_in_if_expr1087 = new BitSet(new long[]{0x0000081000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_bloc_in_if_expr1089 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_else2_in_if_expr1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_else21126 = new BitSet(new long[]{0x35789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_else21128 = new BitSet(new long[]{0x35789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_else3_in_else21131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_else31154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_else31164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_expr1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio4_in_expr1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio41202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_prio4_in_operations_prio41205 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_prio41209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio31237 = new BitSet(new long[]{0x0000600000000002L,0x00000000000003C0L});
    public static final BitSet FOLLOW_prio3_in_operations_prio31240 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio31244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio21272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_prio2_in_operations_prio21275 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio21279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_in_operations_prio11308 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_unaires_in_operations_prio11314 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000011L});
    public static final BitSet FOLLOW_prio1_in_operations_prio11317 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_operations_unaires1349 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_unaires1351 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_operations_unaires1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_operations_unaires1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable2_in_variable1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_var_in_variable1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire2_in_unaire_var1441 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_unaire_var_in_unaire_var1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_unaire_var1466 = new BitSet(new long[]{0x4000021000000002L,0x0000000000005002L});
    public static final BitSet FOLLOW_comm_in_unaire_var1468 = new BitSet(new long[]{0x4000021000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_fonctions_ou_vecteurs_ou_struct_in_unaire_var1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_variable21505 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_variable21507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_variable21526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_variable21528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_variable21547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_variable21549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_variable21568 = new BitSet(new long[]{0x0040000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_variable21570 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_variable21573 = new BitSet(new long[]{0x4000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_variable21575 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_variable21578 = new BitSet(new long[]{0xB078920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_variable21580 = new BitSet(new long[]{0xB078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio4_in_variable21585 = new BitSet(new long[]{0x8000002000000000L});
    public static final BitSet FOLLOW_37_in_variable21588 = new BitSet(new long[]{0x3078920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_variable21590 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio4_in_variable21593 = new BitSet(new long[]{0x8000002000000000L});
    public static final BitSet FOLLOW_63_in_variable21599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_variable21601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_accesseur1637 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_acces_accesseur_in_accesseur1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_accesseur1654 = new BitSet(new long[]{0x0200000100000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_accesseur_in_accesseur1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fonctions_ou_vecteurs_in_fonctions_ou_vecteurs_ou_struct1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_fonctions_ou_vecteurs_ou_struct1720 = new BitSet(new long[]{0x0000004100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs_ou_struct1722 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_valeur_attribut_struct_in_fonctions_ou_vecteurs_ou_struct1726 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_fonctions_ou_vecteurs_ou_struct1729 = new BitSet(new long[]{0x0000000100000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs_ou_struct1731 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_valeur_attribut_struct_in_fonctions_ou_vecteurs_ou_struct1734 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38_in_fonctions_ou_vecteurs_ou_struct1741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs_ou_struct1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_valeur_attribut_struct1797 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_valeur_attribut_struct1799 = new BitSet(new long[]{0x3078920300000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_operations_prio4_in_valeur_attribut_struct1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio3b_in_operations_prio4b1844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_prio4_in_operations_prio4b1847 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio4b_in_operations_prio4b1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio2b_in_operations_prio3b1879 = new BitSet(new long[]{0x0000600000000002L,0x00000000000003C0L});
    public static final BitSet FOLLOW_prio3_in_operations_prio3b1882 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio3b_in_operations_prio3b1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio1b_in_operations_prio2b1914 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000028L});
    public static final BitSet FOLLOW_prio2_in_operations_prio2b1917 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio2b_in_operations_prio2b1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_in_operations_prio1b1950 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_unairesb_in_operations_prio1b1956 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000011L});
    public static final BitSet FOLLOW_prio1_in_operations_prio1b1959 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio1b_in_operations_prio1b1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_operations_unairesb1991 = new BitSet(new long[]{0x3040920300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_operations_prio4b_in_operations_unairesb1993 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_operations_unairesb1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableb_in_operations_unairesb2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_varb_in_variableb2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable2_in_variableb2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire2_in_unaire_varb2095 = new BitSet(new long[]{0x0000800100000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaire_varb_in_unaire_varb2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_unaire_varb2121 = new BitSet(new long[]{0x4000020000000002L,0x0000000000005002L});
    public static final BitSet FOLLOW_comm_in_unaire_varb2123 = new BitSet(new long[]{0x4000020000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_fonctions_ou_vecteurs_in_unaire_varb2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_fonctions_ou_vecteurs2159 = new BitSet(new long[]{0x30789E1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2161 = new BitSet(new long[]{0x30789E1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_fonctions_ou_vecteurs2165 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_37_in_fonctions_ou_vecteurs2169 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2171 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_fonctions_ou_vecteurs2174 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_42_in_fonctions_ou_vecteurs2180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_acces_variable_in_fonctions_ou_vecteurs2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_acces_variable2261 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_acces_variable2263 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_acces_variable2266 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_acces_variable2268 = new BitSet(new long[]{0x4000020000000002L,0x0000000000005002L});
    public static final BitSet FOLLOW_comm_in_acces_variable2270 = new BitSet(new long[]{0x4000020000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_acces_variable_in_acces_variable2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_acces_variable2304 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribut_vecteur_in_acces_variable2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_attribut_vecteur2334 = new BitSet(new long[]{0x0000020000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2336 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_attribut_vecteur2339 = new BitSet(new long[]{0x0000040000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2341 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_attribut_vecteur2344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_attribut_vecteur2372 = new BitSet(new long[]{0x4000020000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_acces_variable_in_attribut_vecteur2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_acces_accesseur2412 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_comm_in_acces_accesseur2414 = new BitSet(new long[]{0x30789A1300000000L,0x0000000000005009L});
    public static final BitSet FOLLOW_expr_in_acces_accesseur2417 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_acces_accesseur2419 = new BitSet(new long[]{0x4000000000000002L,0x0000000000005002L});
    public static final BitSet FOLLOW_comm_in_acces_accesseur2421 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_acces_accesseur_in_acces_accesseur2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_acces_accesseur2456 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDF_in_acces_accesseur2458 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_acces_accesseur_in_acces_accesseur2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_unaire2497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_unaire2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_unaire2515 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_unaire2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_unaire22538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_unaire22540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_unaire22557 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_unaire22559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_prio12581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_prio12598 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio12600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_prio22627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio22629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_prio22644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio22646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_prio32667 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio32669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_prio32684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio32686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_prio32701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio32703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_prio32718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio32720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_prio32735 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio32737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_prio32752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio32754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_prio42774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio42776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_prio42791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio42793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_prio52813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_comm_in_prio52815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_comm2835 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_77_in_comm2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_comm2849 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_79_in_comm2854 = new BitSet(new long[]{0x0000000000000002L});

}