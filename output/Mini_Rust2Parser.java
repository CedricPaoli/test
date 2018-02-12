// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/antars/Documents/Telecom/Compil/Mini_Rust2.g 2018-02-12 15:27:56

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class Mini_Rust2Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FICHIER", "DECL", "ARGUMENT", "ARGUMENTS", "STRUCT", "FCT", "TYPE", "BLOC", "CST", "VAR", "VALUE", "INSTRUCTION", "IF", "EXPR", "SOMME", "DIFFERENCE", "PRODUIT", "RAPPORT", "ET", "OU", "INF", "INF_E", "SUP", "SUP_E", "EGAL", "DIFF", "NOT", "POINTEUR_ADDR", "POINTEUR_VAL", "NEG", "WHILE", "CONDITION", "FOR", "LEN", "VEC", "PRINT", "IDF", "CST_ENT", "WS", "'struct'", "'{'", "':'", "','", "'}'", "'fn'", "'('", "')'", "'->'", "'Vec'", "'<'", "'>'", "'&'", "'i32'", "'bool'", "';'", "'let'", "'while'", "'return'", "'mut'", "'='", "'if'", "'else'", "'vec'", "'!'", "'['", "']'", "'print'", "'true'", "'false'", "'.'", "'len'", "'-'", "'*'", "'/'", "'+'", "'=='", "'!='", "'&&'", "'||'", "'/*'", "'*/'"
    };
    public static final int PRINT=39;
    public static final int BLOC=11;
    public static final int T__50=50;
    public static final int VAR=13;
    public static final int IDF=40;
    public static final int VALUE=14;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int FICHIER=4;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int TYPE=10;
    public static final int IF=16;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int INSTRUCTION=15;
    public static final int T__61=61;
    public static final int DIFF=29;
    public static final int FOR=36;
    public static final int ET=22;
    public static final int SUP=26;
    public static final int NOT=30;
    public static final int RAPPORT=21;
    public static final int DECL=5;
    public static final int FCT=9;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int CONDITION=35;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int STRUCT=8;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int INF=24;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int SUP_E=27;
    public static final int PRODUIT=20;
    public static final int DIFFERENCE=19;
    public static final int EXPR=17;
    public static final int T__77=77;
    public static final int ARGUMENT=6;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int WS=42;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int CST_ENT=41;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int CST=12;
    public static final int OU=23;
    public static final int POINTEUR_ADDR=31;
    public static final int EGAL=28;
    public static final int INF_E=25;
    public static final int NEG=33;
    public static final int ARGUMENTS=7;
    public static final int T__48=48;
    public static final int LEN=37;
    public static final int T__49=49;
    public static final int VEC=38;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int POINTEUR_VAL=32;
    public static final int WHILE=34;
    public static final int T__47=47;
    public static final int T__84=84;
    public static final int T__43=43;
    public static final int SOMME=18;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "prog", "instruction", "prio5", "decl", "prio4", 
        "b2", "operations_prio3b", "expr_sans_idf", "attribut_vecteur", 
        "decl_fun", "prio2", "let2", "expr", "instruction_sans_expr", "operations_prio4", 
        "variablesb", "unaire", "operations_prio1b", "argument", "operations_prio5", 
        "decl_struct", "operations_prio2b", "fonctions_ou_vecteurs", "operations_prio4b", 
        "type", "bloc", "variables", "operations_prio3", "fichier", "operations_unairesb", 
        "operations_prio2", "operations_prio1", "prio3", "prio1", "comm", 
        "sous_bloc", "b", "if_expr", "operations_unaires", "operations_prio5b", 
        "operation_suivante"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public Mini_Rust2Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public Mini_Rust2Parser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public Mini_Rust2Parser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return Mini_Rust2Parser.tokenNames; }
    public String getGrammarFileName() { return "/home/antars/Documents/Telecom/Compil/Mini_Rust2.g"; }


    /** Map variable name to Integer object holding value */
    HashMap<String,Integer>  memory = new HashMap<String,Integer>();


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:60:1: prog : ( comm )? fichier EOF -> ^( FICHIER fichier ) ;
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
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:60:6: ( ( comm )? fichier EOF -> ^( FICHIER fichier ) )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:60:9: ( comm )? fichier EOF
            {
            dbg.location(60,9);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:60:9: ( comm )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==83) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:60:9: comm
                    {
                    dbg.location(60,9);
                    pushFollow(FOLLOW_comm_in_prog304);
                    comm1=comm();

                    state._fsp--;

                    stream_comm.add(comm1.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(60,15);
            pushFollow(FOLLOW_fichier_in_prog307);
            fichier2=fichier();

            state._fsp--;

            stream_fichier.add(fichier2.getTree());
            dbg.location(60,23);
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog309);  
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
            // 60:27: -> ^( FICHIER fichier )
            {
                dbg.location(60,30);
                // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:60:30: ^( FICHIER fichier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(60,32);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FICHIER, "FICHIER"), root_1);

                dbg.location(60,40);
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
        dbg.location(60, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    public static class fichier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fichier"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:62:1: fichier : ( decl )* ;
    public final Mini_Rust2Parser.fichier_return fichier() throws RecognitionException {
        Mini_Rust2Parser.fichier_return retval = new Mini_Rust2Parser.fichier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.decl_return decl4 = null;



        try { dbg.enterRule(getGrammarFileName(), "fichier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:62:9: ( ( decl )* )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:62:11: ( decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(62,11);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:62:11: ( decl )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==43||LA2_0==48) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:62:11: decl
            	    {
            	    dbg.location(62,11);
            	    pushFollow(FOLLOW_decl_in_fichier325);
            	    decl4=decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decl4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


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
        dbg.location(63, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fichier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fichier"

    public static class decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:65:1: decl : ( decl_struct | decl_fun );
    public final Mini_Rust2Parser.decl_return decl() throws RecognitionException {
        Mini_Rust2Parser.decl_return retval = new Mini_Rust2Parser.decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.decl_struct_return decl_struct5 = null;

        Mini_Rust2Parser.decl_fun_return decl_fun6 = null;



        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:65:6: ( decl_struct | decl_fun )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==43) ) {
                alt3=1;
            }
            else if ( (LA3_0==48) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:65:8: decl_struct
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(65,8);
                    pushFollow(FOLLOW_decl_struct_in_decl343);
                    decl_struct5=decl_struct();

                    state._fsp--;

                    adaptor.addChild(root_0, decl_struct5.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:66:8: decl_fun
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(66,8);
                    pushFollow(FOLLOW_decl_fun_in_decl352);
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
        dbg.location(67, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl"

    public static class decl_struct_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_struct"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:1: decl_struct : 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( IDF ( comm )? ':' ( comm )? type ( ',' ( comm )? IDF ( comm )? ':' ( comm )? type )* )? '}' ( comm )? ;
    public final Mini_Rust2Parser.decl_struct_return decl_struct() throws RecognitionException {
        Mini_Rust2Parser.decl_struct_return retval = new Mini_Rust2Parser.decl_struct_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal7=null;
        Token IDF9=null;
        Token char_literal11=null;
        Token IDF13=null;
        Token char_literal15=null;
        Token char_literal18=null;
        Token IDF20=null;
        Token char_literal22=null;
        Token char_literal25=null;
        Mini_Rust2Parser.comm_return comm8 = null;

        Mini_Rust2Parser.comm_return comm10 = null;

        Mini_Rust2Parser.comm_return comm12 = null;

        Mini_Rust2Parser.comm_return comm14 = null;

        Mini_Rust2Parser.comm_return comm16 = null;

        Mini_Rust2Parser.type_return type17 = null;

        Mini_Rust2Parser.comm_return comm19 = null;

        Mini_Rust2Parser.comm_return comm21 = null;

        Mini_Rust2Parser.comm_return comm23 = null;

        Mini_Rust2Parser.type_return type24 = null;

        Mini_Rust2Parser.comm_return comm26 = null;


        CommonTree string_literal7_tree=null;
        CommonTree IDF9_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree IDF13_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree IDF20_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "decl_struct");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:13: ( 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( IDF ( comm )? ':' ( comm )? type ( ',' ( comm )? IDF ( comm )? ':' ( comm )? type )* )? '}' ( comm )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:15: 'struct' ( comm )? IDF ( comm )? '{' ( comm )? ( IDF ( comm )? ':' ( comm )? type ( ',' ( comm )? IDF ( comm )? ':' ( comm )? type )* )? '}' ( comm )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(69,15);
            string_literal7=(Token)match(input,43,FOLLOW_43_in_decl_struct366); 
            string_literal7_tree = (CommonTree)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);

            dbg.location(69,24);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:24: ( comm )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==83) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:24: comm
                    {
                    dbg.location(69,24);
                    pushFollow(FOLLOW_comm_in_decl_struct368);
                    comm8=comm();

                    state._fsp--;

                    adaptor.addChild(root_0, comm8.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(69,30);
            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct371); 
            IDF9_tree = (CommonTree)adaptor.create(IDF9);
            adaptor.addChild(root_0, IDF9_tree);

            dbg.location(69,34);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:34: ( comm )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==83) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:34: comm
                    {
                    dbg.location(69,34);
                    pushFollow(FOLLOW_comm_in_decl_struct373);
                    comm10=comm();

                    state._fsp--;

                    adaptor.addChild(root_0, comm10.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(69,40);
            char_literal11=(Token)match(input,44,FOLLOW_44_in_decl_struct376); 
            char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);

            dbg.location(69,44);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:44: ( comm )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==83) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:44: comm
                    {
                    dbg.location(69,44);
                    pushFollow(FOLLOW_comm_in_decl_struct378);
                    comm12=comm();

                    state._fsp--;

                    adaptor.addChild(root_0, comm12.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(69,50);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:50: ( IDF ( comm )? ':' ( comm )? type ( ',' ( comm )? IDF ( comm )? ':' ( comm )? type )* )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDF) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:51: IDF ( comm )? ':' ( comm )? type ( ',' ( comm )? IDF ( comm )? ':' ( comm )? type )*
                    {
                    dbg.location(69,51);
                    IDF13=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct382); 
                    IDF13_tree = (CommonTree)adaptor.create(IDF13);
                    adaptor.addChild(root_0, IDF13_tree);

                    dbg.location(69,55);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:55: ( comm )?
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==83) ) {
                        alt7=1;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:55: comm
                            {
                            dbg.location(69,55);
                            pushFollow(FOLLOW_comm_in_decl_struct384);
                            comm14=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm14.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(69,61);
                    char_literal15=(Token)match(input,45,FOLLOW_45_in_decl_struct387); 
                    char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);

                    dbg.location(69,65);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:65: ( comm )?
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==83) ) {
                        alt8=1;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:65: comm
                            {
                            dbg.location(69,65);
                            pushFollow(FOLLOW_comm_in_decl_struct389);
                            comm16=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm16.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(69,71);
                    pushFollow(FOLLOW_type_in_decl_struct392);
                    type17=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type17.getTree());
                    dbg.location(69,76);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:76: ( ',' ( comm )? IDF ( comm )? ':' ( comm )? type )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==46) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:77: ',' ( comm )? IDF ( comm )? ':' ( comm )? type
                    	    {
                    	    dbg.location(69,77);
                    	    char_literal18=(Token)match(input,46,FOLLOW_46_in_decl_struct395); 
                    	    char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
                    	    adaptor.addChild(root_0, char_literal18_tree);

                    	    dbg.location(69,81);
                    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:81: ( comm )?
                    	    int alt9=2;
                    	    try { dbg.enterSubRule(9);
                    	    try { dbg.enterDecision(9);

                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==83) ) {
                    	        alt9=1;
                    	    }
                    	    } finally {dbg.exitDecision(9);}

                    	    switch (alt9) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:81: comm
                    	            {
                    	            dbg.location(69,81);
                    	            pushFollow(FOLLOW_comm_in_decl_struct397);
                    	            comm19=comm();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, comm19.getTree());

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(9);}

                    	    dbg.location(69,87);
                    	    IDF20=(Token)match(input,IDF,FOLLOW_IDF_in_decl_struct400); 
                    	    IDF20_tree = (CommonTree)adaptor.create(IDF20);
                    	    adaptor.addChild(root_0, IDF20_tree);

                    	    dbg.location(69,91);
                    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:91: ( comm )?
                    	    int alt10=2;
                    	    try { dbg.enterSubRule(10);
                    	    try { dbg.enterDecision(10);

                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==83) ) {
                    	        alt10=1;
                    	    }
                    	    } finally {dbg.exitDecision(10);}

                    	    switch (alt10) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:91: comm
                    	            {
                    	            dbg.location(69,91);
                    	            pushFollow(FOLLOW_comm_in_decl_struct402);
                    	            comm21=comm();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, comm21.getTree());

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(10);}

                    	    dbg.location(69,97);
                    	    char_literal22=(Token)match(input,45,FOLLOW_45_in_decl_struct405); 
                    	    char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
                    	    adaptor.addChild(root_0, char_literal22_tree);

                    	    dbg.location(69,101);
                    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:101: ( comm )?
                    	    int alt11=2;
                    	    try { dbg.enterSubRule(11);
                    	    try { dbg.enterDecision(11);

                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0==83) ) {
                    	        alt11=1;
                    	    }
                    	    } finally {dbg.exitDecision(11);}

                    	    switch (alt11) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:101: comm
                    	            {
                    	            dbg.location(69,101);
                    	            pushFollow(FOLLOW_comm_in_decl_struct407);
                    	            comm23=comm();

                    	            state._fsp--;

                    	            adaptor.addChild(root_0, comm23.getTree());

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(11);}

                    	    dbg.location(69,107);
                    	    pushFollow(FOLLOW_type_in_decl_struct410);
                    	    type24=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(69,117);
            char_literal25=(Token)match(input,47,FOLLOW_47_in_decl_struct417); 
            char_literal25_tree = (CommonTree)adaptor.create(char_literal25);
            adaptor.addChild(root_0, char_literal25_tree);

            dbg.location(69,121);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:121: ( comm )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==83) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:69:121: comm
                    {
                    dbg.location(69,121);
                    pushFollow(FOLLOW_comm_in_decl_struct419);
                    comm26=comm();

                    state._fsp--;

                    adaptor.addChild(root_0, comm26.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}


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
        dbg.location(70, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl_struct");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl_struct"

    public static class decl_fun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl_fun"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:1: decl_fun : 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc -> ^( FCT IDF ^( ARGUMENTS ( argument )* ) ( type )? bloc ) ;
    public final Mini_Rust2Parser.decl_fun_return decl_fun() throws RecognitionException {
        Mini_Rust2Parser.decl_fun_return retval = new Mini_Rust2Parser.decl_fun_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal27=null;
        Token IDF29=null;
        Token char_literal31=null;
        Token char_literal34=null;
        Token char_literal37=null;
        Token string_literal39=null;
        Mini_Rust2Parser.comm_return comm28 = null;

        Mini_Rust2Parser.comm_return comm30 = null;

        Mini_Rust2Parser.comm_return comm32 = null;

        Mini_Rust2Parser.argument_return argument33 = null;

        Mini_Rust2Parser.comm_return comm35 = null;

        Mini_Rust2Parser.argument_return argument36 = null;

        Mini_Rust2Parser.comm_return comm38 = null;

        Mini_Rust2Parser.comm_return comm40 = null;

        Mini_Rust2Parser.type_return type41 = null;

        Mini_Rust2Parser.bloc_return bloc42 = null;


        CommonTree string_literal27_tree=null;
        CommonTree IDF29_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal34_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree string_literal39_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "decl_fun");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:10: ( 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc -> ^( FCT IDF ^( ARGUMENTS ( argument )* ) ( type )? bloc ) )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:12: 'fn' ( comm )? IDF ( comm )? '(' ( comm )? ( argument ( ',' ( comm )? argument )* )? ')' ( comm )? ( '->' ( comm )? type )? bloc
            {
            dbg.location(72,12);
            string_literal27=(Token)match(input,48,FOLLOW_48_in_decl_fun441);  
            stream_48.add(string_literal27);

            dbg.location(72,17);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:17: ( comm )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==83) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:17: comm
                    {
                    dbg.location(72,17);
                    pushFollow(FOLLOW_comm_in_decl_fun443);
                    comm28=comm();

                    state._fsp--;

                    stream_comm.add(comm28.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(72,23);
            IDF29=(Token)match(input,IDF,FOLLOW_IDF_in_decl_fun446);  
            stream_IDF.add(IDF29);

            dbg.location(72,27);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:27: ( comm )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==83) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:27: comm
                    {
                    dbg.location(72,27);
                    pushFollow(FOLLOW_comm_in_decl_fun448);
                    comm30=comm();

                    state._fsp--;

                    stream_comm.add(comm30.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(72,33);
            char_literal31=(Token)match(input,49,FOLLOW_49_in_decl_fun451);  
            stream_49.add(char_literal31);

            dbg.location(72,37);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:37: ( comm )?
            int alt17=2;
            try { dbg.enterSubRule(17);
            try { dbg.enterDecision(17);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==83) ) {
                alt17=1;
            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:37: comm
                    {
                    dbg.location(72,37);
                    pushFollow(FOLLOW_comm_in_decl_fun453);
                    comm32=comm();

                    state._fsp--;

                    stream_comm.add(comm32.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(17);}

            dbg.location(72,43);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:43: ( argument ( ',' ( comm )? argument )* )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDF) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:44: argument ( ',' ( comm )? argument )*
                    {
                    dbg.location(72,44);
                    pushFollow(FOLLOW_argument_in_decl_fun457);
                    argument33=argument();

                    state._fsp--;

                    stream_argument.add(argument33.getTree());
                    dbg.location(72,53);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:53: ( ',' ( comm )? argument )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==46) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:54: ',' ( comm )? argument
                    	    {
                    	    dbg.location(72,54);
                    	    char_literal34=(Token)match(input,46,FOLLOW_46_in_decl_fun460);  
                    	    stream_46.add(char_literal34);

                    	    dbg.location(72,58);
                    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:58: ( comm )?
                    	    int alt18=2;
                    	    try { dbg.enterSubRule(18);
                    	    try { dbg.enterDecision(18);

                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==83) ) {
                    	        alt18=1;
                    	    }
                    	    } finally {dbg.exitDecision(18);}

                    	    switch (alt18) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:58: comm
                    	            {
                    	            dbg.location(72,58);
                    	            pushFollow(FOLLOW_comm_in_decl_fun462);
                    	            comm35=comm();

                    	            state._fsp--;

                    	            stream_comm.add(comm35.getTree());

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(18);}

                    	    dbg.location(72,64);
                    	    pushFollow(FOLLOW_argument_in_decl_fun465);
                    	    argument36=argument();

                    	    state._fsp--;

                    	    stream_argument.add(argument36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(72,77);
            char_literal37=(Token)match(input,50,FOLLOW_50_in_decl_fun471);  
            stream_50.add(char_literal37);

            dbg.location(72,81);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:81: ( comm )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==83) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:81: comm
                    {
                    dbg.location(72,81);
                    pushFollow(FOLLOW_comm_in_decl_fun473);
                    comm38=comm();

                    state._fsp--;

                    stream_comm.add(comm38.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(72,87);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:87: ( '->' ( comm )? type )?
            int alt23=2;
            try { dbg.enterSubRule(23);
            try { dbg.enterDecision(23);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:88: '->' ( comm )? type
                    {
                    dbg.location(72,88);
                    string_literal39=(Token)match(input,51,FOLLOW_51_in_decl_fun477);  
                    stream_51.add(string_literal39);

                    dbg.location(72,93);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:93: ( comm )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==83) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:93: comm
                            {
                            dbg.location(72,93);
                            pushFollow(FOLLOW_comm_in_decl_fun479);
                            comm40=comm();

                            state._fsp--;

                            stream_comm.add(comm40.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(72,99);
                    pushFollow(FOLLOW_type_in_decl_fun482);
                    type41=type();

                    state._fsp--;

                    stream_type.add(type41.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(23);}

            dbg.location(72,106);
            pushFollow(FOLLOW_bloc_in_decl_fun486);
            bloc42=bloc();

            state._fsp--;

            stream_bloc.add(bloc42.getTree());


            // AST REWRITE
            // elements: argument, type, IDF, bloc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 72:111: -> ^( FCT IDF ^( ARGUMENTS ( argument )* ) ( type )? bloc )
            {
                dbg.location(72,114);
                // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:114: ^( FCT IDF ^( ARGUMENTS ( argument )* ) ( type )? bloc )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(72,116);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FCT, "FCT"), root_1);

                dbg.location(72,120);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(72,124);
                // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:124: ^( ARGUMENTS ( argument )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(72,126);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_2);

                dbg.location(72,136);
                // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:136: ( argument )*
                while ( stream_argument.hasNext() ) {
                    dbg.location(72,136);
                    adaptor.addChild(root_2, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(72,147);
                // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:72:147: ( type )?
                if ( stream_type.hasNext() ) {
                    dbg.location(72,147);
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                dbg.location(72,153);
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
        dbg.location(73, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl_fun");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl_fun"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:1: type : ( 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )? | '&' ( comm )? type | 'i32' ( comm )? | 'bool' ( comm )? | IDF ( comm )? );
    public final Mini_Rust2Parser.type_return type() throws RecognitionException {
        Mini_Rust2Parser.type_return retval = new Mini_Rust2Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        Token char_literal45=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token IDF57=null;
        Mini_Rust2Parser.comm_return comm44 = null;

        Mini_Rust2Parser.comm_return comm46 = null;

        Mini_Rust2Parser.type_return type47 = null;

        Mini_Rust2Parser.comm_return comm49 = null;

        Mini_Rust2Parser.comm_return comm51 = null;

        Mini_Rust2Parser.type_return type52 = null;

        Mini_Rust2Parser.comm_return comm54 = null;

        Mini_Rust2Parser.comm_return comm56 = null;

        Mini_Rust2Parser.comm_return comm58 = null;


        CommonTree string_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree IDF57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:6: ( 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )? | '&' ( comm )? type | 'i32' ( comm )? | 'bool' ( comm )? | IDF ( comm )? )
            int alt31=5;
            try { dbg.enterDecision(31);

            switch ( input.LA(1) ) {
            case 52:
                {
                alt31=1;
                }
                break;
            case 55:
                {
                alt31=2;
                }
                break;
            case 56:
                {
                alt31=3;
                }
                break;
            case 57:
                {
                alt31=4;
                }
                break;
            case IDF:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:8: 'Vec' ( comm )? '<' ( comm )? type '>' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(75,8);
                    string_literal43=(Token)match(input,52,FOLLOW_52_in_type524); 
                    string_literal43_tree = (CommonTree)adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);

                    dbg.location(75,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:14: ( comm )?
                    int alt24=2;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24);

                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==83) ) {
                        alt24=1;
                    }
                    } finally {dbg.exitDecision(24);}

                    switch (alt24) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:14: comm
                            {
                            dbg.location(75,14);
                            pushFollow(FOLLOW_comm_in_type526);
                            comm44=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm44.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(75,20);
                    char_literal45=(Token)match(input,53,FOLLOW_53_in_type529); 
                    char_literal45_tree = (CommonTree)adaptor.create(char_literal45);
                    adaptor.addChild(root_0, char_literal45_tree);

                    dbg.location(75,24);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:24: ( comm )?
                    int alt25=2;
                    try { dbg.enterSubRule(25);
                    try { dbg.enterDecision(25);

                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==83) ) {
                        alt25=1;
                    }
                    } finally {dbg.exitDecision(25);}

                    switch (alt25) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:24: comm
                            {
                            dbg.location(75,24);
                            pushFollow(FOLLOW_comm_in_type531);
                            comm46=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm46.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}

                    dbg.location(75,30);
                    pushFollow(FOLLOW_type_in_type534);
                    type47=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type47.getTree());
                    dbg.location(75,35);
                    char_literal48=(Token)match(input,54,FOLLOW_54_in_type536); 
                    char_literal48_tree = (CommonTree)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);

                    dbg.location(75,39);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:39: ( comm )?
                    int alt26=2;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26);

                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==83) ) {
                        alt26=1;
                    }
                    } finally {dbg.exitDecision(26);}

                    switch (alt26) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:75:39: comm
                            {
                            dbg.location(75,39);
                            pushFollow(FOLLOW_comm_in_type538);
                            comm49=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm49.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:76:8: '&' ( comm )? type
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(76,8);
                    char_literal50=(Token)match(input,55,FOLLOW_55_in_type548); 
                    char_literal50_tree = (CommonTree)adaptor.create(char_literal50);
                    adaptor.addChild(root_0, char_literal50_tree);

                    dbg.location(76,12);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:76:12: ( comm )?
                    int alt27=2;
                    try { dbg.enterSubRule(27);
                    try { dbg.enterDecision(27);

                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==83) ) {
                        alt27=1;
                    }
                    } finally {dbg.exitDecision(27);}

                    switch (alt27) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:76:12: comm
                            {
                            dbg.location(76,12);
                            pushFollow(FOLLOW_comm_in_type550);
                            comm51=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm51.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(27);}

                    dbg.location(76,18);
                    pushFollow(FOLLOW_type_in_type553);
                    type52=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type52.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:77:8: 'i32' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(77,8);
                    string_literal53=(Token)match(input,56,FOLLOW_56_in_type562); 
                    string_literal53_tree = (CommonTree)adaptor.create(string_literal53);
                    adaptor.addChild(root_0, string_literal53_tree);

                    dbg.location(77,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:77:14: ( comm )?
                    int alt28=2;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28);

                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==83) ) {
                        alt28=1;
                    }
                    } finally {dbg.exitDecision(28);}

                    switch (alt28) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:77:14: comm
                            {
                            dbg.location(77,14);
                            pushFollow(FOLLOW_comm_in_type564);
                            comm54=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm54.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:78:8: 'bool' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(78,8);
                    string_literal55=(Token)match(input,57,FOLLOW_57_in_type574); 
                    string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    dbg.location(78,15);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:78:15: ( comm )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==83) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:78:15: comm
                            {
                            dbg.location(78,15);
                            pushFollow(FOLLOW_comm_in_type576);
                            comm56=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm56.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:79:8: IDF ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(79,8);
                    IDF57=(Token)match(input,IDF,FOLLOW_IDF_in_type586); 
                    IDF57_tree = (CommonTree)adaptor.create(IDF57);
                    adaptor.addChild(root_0, IDF57_tree);

                    dbg.location(79,12);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:79:12: ( comm )?
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==83) ) {
                        alt30=1;
                    }
                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:79:12: comm
                            {
                            dbg.location(79,12);
                            pushFollow(FOLLOW_comm_in_type588);
                            comm58=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm58.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}


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
        dbg.location(80, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:82:1: argument : IDF ':' ( comm )? type -> IDF type ;
    public final Mini_Rust2Parser.argument_return argument() throws RecognitionException {
        Mini_Rust2Parser.argument_return retval = new Mini_Rust2Parser.argument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF59=null;
        Token char_literal60=null;
        Mini_Rust2Parser.comm_return comm61 = null;

        Mini_Rust2Parser.type_return type62 = null;


        CommonTree IDF59_tree=null;
        CommonTree char_literal60_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "argument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:82:10: ( IDF ':' ( comm )? type -> IDF type )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:82:12: IDF ':' ( comm )? type
            {
            dbg.location(82,12);
            IDF59=(Token)match(input,IDF,FOLLOW_IDF_in_argument603);  
            stream_IDF.add(IDF59);

            dbg.location(82,16);
            char_literal60=(Token)match(input,45,FOLLOW_45_in_argument605);  
            stream_45.add(char_literal60);

            dbg.location(82,20);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:82:20: ( comm )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==83) ) {
                alt32=1;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:82:20: comm
                    {
                    dbg.location(82,20);
                    pushFollow(FOLLOW_comm_in_argument607);
                    comm61=comm();

                    state._fsp--;

                    stream_comm.add(comm61.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}

            dbg.location(82,26);
            pushFollow(FOLLOW_type_in_argument610);
            type62=type();

            state._fsp--;

            stream_type.add(type62.getTree());


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
            // 82:31: -> IDF type
            {
                dbg.location(82,34);
                adaptor.addChild(root_0, stream_IDF.nextNode());
                dbg.location(82,38);
                adaptor.addChild(root_0, stream_type.nextTree());

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
        dbg.location(83, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argument");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "argument"

    public static class bloc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:1: bloc : '{' ( comm )? sous_bloc '}' ( comm )? -> ^( BLOC sous_bloc ) ;
    public final Mini_Rust2Parser.bloc_return bloc() throws RecognitionException {
        Mini_Rust2Parser.bloc_return retval = new Mini_Rust2Parser.bloc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal63=null;
        Token char_literal66=null;
        Mini_Rust2Parser.comm_return comm64 = null;

        Mini_Rust2Parser.sous_bloc_return sous_bloc65 = null;

        Mini_Rust2Parser.comm_return comm67 = null;


        CommonTree char_literal63_tree=null;
        CommonTree char_literal66_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_sous_bloc=new RewriteRuleSubtreeStream(adaptor,"rule sous_bloc");
        try { dbg.enterRule(getGrammarFileName(), "bloc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:6: ( '{' ( comm )? sous_bloc '}' ( comm )? -> ^( BLOC sous_bloc ) )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:8: '{' ( comm )? sous_bloc '}' ( comm )?
            {
            dbg.location(86,8);
            char_literal63=(Token)match(input,44,FOLLOW_44_in_bloc635);  
            stream_44.add(char_literal63);

            dbg.location(86,12);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:12: ( comm )?
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==83) ) {
                alt33=1;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:12: comm
                    {
                    dbg.location(86,12);
                    pushFollow(FOLLOW_comm_in_bloc637);
                    comm64=comm();

                    state._fsp--;

                    stream_comm.add(comm64.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}

            dbg.location(86,18);
            pushFollow(FOLLOW_sous_bloc_in_bloc640);
            sous_bloc65=sous_bloc();

            state._fsp--;

            stream_sous_bloc.add(sous_bloc65.getTree());
            dbg.location(86,28);
            char_literal66=(Token)match(input,47,FOLLOW_47_in_bloc642);  
            stream_47.add(char_literal66);

            dbg.location(86,32);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:32: ( comm )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==83) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:32: comm
                    {
                    dbg.location(86,32);
                    pushFollow(FOLLOW_comm_in_bloc644);
                    comm67=comm();

                    state._fsp--;

                    stream_comm.add(comm67.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}



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
            // 86:38: -> ^( BLOC sous_bloc )
            {
                dbg.location(86,41);
                // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:86:41: ^( BLOC sous_bloc )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(86,43);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_1);

                dbg.location(86,48);
                adaptor.addChild(root_1, stream_sous_bloc.nextTree());

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
        dbg.location(87, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bloc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bloc"

    public static class sous_bloc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sous_bloc"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:1: sous_bloc : ( instruction_sans_expr sous_bloc | expr ( ';' ( comm )? sous_bloc )? | );
    public final Mini_Rust2Parser.sous_bloc_return sous_bloc() throws RecognitionException {
        Mini_Rust2Parser.sous_bloc_return retval = new Mini_Rust2Parser.sous_bloc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal71=null;
        Mini_Rust2Parser.instruction_sans_expr_return instruction_sans_expr68 = null;

        Mini_Rust2Parser.sous_bloc_return sous_bloc69 = null;

        Mini_Rust2Parser.expr_return expr70 = null;

        Mini_Rust2Parser.comm_return comm72 = null;

        Mini_Rust2Parser.sous_bloc_return sous_bloc73 = null;


        CommonTree char_literal71_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "sous_bloc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:11: ( instruction_sans_expr sous_bloc | expr ( ';' ( comm )? sous_bloc )? | )
            int alt37=3;
            try { dbg.enterDecision(37);

            switch ( input.LA(1) ) {
            case 58:
            case 59:
            case 60:
            case 61:
            case 64:
                {
                alt37=1;
                }
                break;
            case IDF:
            case CST_ENT:
            case 44:
            case 49:
            case 55:
            case 66:
            case 67:
            case 70:
            case 71:
            case 72:
            case 75:
            case 76:
                {
                alt37=2;
                }
                break;
            case 47:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:13: instruction_sans_expr sous_bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(89,13);
                    pushFollow(FOLLOW_instruction_sans_expr_in_sous_bloc667);
                    instruction_sans_expr68=instruction_sans_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_sans_expr68.getTree());
                    dbg.location(89,35);
                    pushFollow(FOLLOW_sous_bloc_in_sous_bloc669);
                    sous_bloc69=sous_bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, sous_bloc69.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:47: expr ( ';' ( comm )? sous_bloc )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(89,47);
                    pushFollow(FOLLOW_expr_in_sous_bloc673);
                    expr70=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr70.getTree());
                    dbg.location(89,52);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:52: ( ';' ( comm )? sous_bloc )?
                    int alt36=2;
                    try { dbg.enterSubRule(36);
                    try { dbg.enterDecision(36);

                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==58) ) {
                        alt36=1;
                    }
                    } finally {dbg.exitDecision(36);}

                    switch (alt36) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:53: ';' ( comm )? sous_bloc
                            {
                            dbg.location(89,53);
                            char_literal71=(Token)match(input,58,FOLLOW_58_in_sous_bloc676); 
                            char_literal71_tree = (CommonTree)adaptor.create(char_literal71);
                            adaptor.addChild(root_0, char_literal71_tree);

                            dbg.location(89,57);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:57: ( comm )?
                            int alt35=2;
                            try { dbg.enterSubRule(35);
                            try { dbg.enterDecision(35);

                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==83) ) {
                                alt35=1;
                            }
                            } finally {dbg.exitDecision(35);}

                            switch (alt35) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:89:57: comm
                                    {
                                    dbg.location(89,57);
                                    pushFollow(FOLLOW_comm_in_sous_bloc678);
                                    comm72=comm();

                                    state._fsp--;

                                    adaptor.addChild(root_0, comm72.getTree());

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(35);}

                            dbg.location(89,63);
                            pushFollow(FOLLOW_sous_bloc_in_sous_bloc681);
                            sous_bloc73=sous_bloc();

                            state._fsp--;

                            adaptor.addChild(root_0, sous_bloc73.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(36);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:91:11: 
                    {
                    root_0 = (CommonTree)adaptor.nil();

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
        dbg.location(91, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sous_bloc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "sous_bloc"

    public static class instruction_sans_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction_sans_expr"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:93:1: instruction_sans_expr : ( ';' ( comm )? | 'let' let2 -> let2 | 'while' ( comm )? expr bloc -> ^( WHILE ^( CONDITION expr ) bloc ) | 'return' ( comm )? ( expr )? ';' ( comm )? | if_expr );
    public final Mini_Rust2Parser.instruction_sans_expr_return instruction_sans_expr() throws RecognitionException {
        Mini_Rust2Parser.instruction_sans_expr_return retval = new Mini_Rust2Parser.instruction_sans_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal74=null;
        Token string_literal76=null;
        Token string_literal78=null;
        Token string_literal82=null;
        Token char_literal85=null;
        Mini_Rust2Parser.comm_return comm75 = null;

        Mini_Rust2Parser.let2_return let277 = null;

        Mini_Rust2Parser.comm_return comm79 = null;

        Mini_Rust2Parser.expr_return expr80 = null;

        Mini_Rust2Parser.bloc_return bloc81 = null;

        Mini_Rust2Parser.comm_return comm83 = null;

        Mini_Rust2Parser.expr_return expr84 = null;

        Mini_Rust2Parser.comm_return comm86 = null;

        Mini_Rust2Parser.if_expr_return if_expr87 = null;


        CommonTree char_literal74_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree char_literal85_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_let2=new RewriteRuleSubtreeStream(adaptor,"rule let2");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "instruction_sans_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:93:23: ( ';' ( comm )? | 'let' let2 -> let2 | 'while' ( comm )? expr bloc -> ^( WHILE ^( CONDITION expr ) bloc ) | 'return' ( comm )? ( expr )? ';' ( comm )? | if_expr )
            int alt43=5;
            try { dbg.enterDecision(43);

            switch ( input.LA(1) ) {
            case 58:
                {
                alt43=1;
                }
                break;
            case 59:
                {
                alt43=2;
                }
                break;
            case 60:
                {
                alt43=3;
                }
                break;
            case 61:
                {
                alt43=4;
                }
                break;
            case 64:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:93:25: ';' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(93,25);
                    char_literal74=(Token)match(input,58,FOLLOW_58_in_instruction_sans_expr707); 
                    char_literal74_tree = (CommonTree)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);

                    dbg.location(93,29);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:93:29: ( comm )?
                    int alt38=2;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38);

                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==83) ) {
                        alt38=1;
                    }
                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:93:29: comm
                            {
                            dbg.location(93,29);
                            pushFollow(FOLLOW_comm_in_instruction_sans_expr709);
                            comm75=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm75.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:94:25: 'let' let2
                    {
                    dbg.location(94,25);
                    string_literal76=(Token)match(input,59,FOLLOW_59_in_instruction_sans_expr736);  
                    stream_59.add(string_literal76);

                    dbg.location(94,31);
                    pushFollow(FOLLOW_let2_in_instruction_sans_expr738);
                    let277=let2();

                    state._fsp--;

                    stream_let2.add(let277.getTree());


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
                    // 94:36: -> let2
                    {
                        dbg.location(94,39);
                        adaptor.addChild(root_0, stream_let2.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:95:25: 'while' ( comm )? expr bloc
                    {
                    dbg.location(95,25);
                    string_literal78=(Token)match(input,60,FOLLOW_60_in_instruction_sans_expr768);  
                    stream_60.add(string_literal78);

                    dbg.location(95,33);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:95:33: ( comm )?
                    int alt39=2;
                    try { dbg.enterSubRule(39);
                    try { dbg.enterDecision(39);

                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==83) ) {
                        alt39=1;
                    }
                    } finally {dbg.exitDecision(39);}

                    switch (alt39) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:95:33: comm
                            {
                            dbg.location(95,33);
                            pushFollow(FOLLOW_comm_in_instruction_sans_expr770);
                            comm79=comm();

                            state._fsp--;

                            stream_comm.add(comm79.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(39);}

                    dbg.location(95,39);
                    pushFollow(FOLLOW_expr_in_instruction_sans_expr773);
                    expr80=expr();

                    state._fsp--;

                    stream_expr.add(expr80.getTree());
                    dbg.location(95,44);
                    pushFollow(FOLLOW_bloc_in_instruction_sans_expr775);
                    bloc81=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc81.getTree());


                    // AST REWRITE
                    // elements: bloc, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:50: -> ^( WHILE ^( CONDITION expr ) bloc )
                    {
                        dbg.location(95,53);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:95:53: ^( WHILE ^( CONDITION expr ) bloc )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(95,55);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILE, "WHILE"), root_1);

                        dbg.location(95,61);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:95:61: ^( CONDITION expr )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(95,63);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                        dbg.location(95,73);
                        adaptor.addChild(root_2, stream_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(95,79);
                        adaptor.addChild(root_1, stream_bloc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:25: 'return' ( comm )? ( expr )? ';' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(96,25);
                    string_literal82=(Token)match(input,61,FOLLOW_61_in_instruction_sans_expr816); 
                    string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);

                    dbg.location(96,34);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:34: ( comm )?
                    int alt40=2;
                    try { dbg.enterSubRule(40);
                    try { dbg.enterDecision(40);

                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==83) ) {
                        alt40=1;
                    }
                    } finally {dbg.exitDecision(40);}

                    switch (alt40) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:34: comm
                            {
                            dbg.location(96,34);
                            pushFollow(FOLLOW_comm_in_instruction_sans_expr818);
                            comm83=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm83.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(40);}

                    dbg.location(96,40);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:40: ( expr )?
                    int alt41=2;
                    try { dbg.enterSubRule(41);
                    try { dbg.enterDecision(41);

                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=IDF && LA41_0<=CST_ENT)||LA41_0==44||LA41_0==49||LA41_0==55||(LA41_0>=66 && LA41_0<=67)||(LA41_0>=70 && LA41_0<=72)||(LA41_0>=75 && LA41_0<=76)) ) {
                        alt41=1;
                    }
                    } finally {dbg.exitDecision(41);}

                    switch (alt41) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:40: expr
                            {
                            dbg.location(96,40);
                            pushFollow(FOLLOW_expr_in_instruction_sans_expr821);
                            expr84=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr84.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(41);}

                    dbg.location(96,46);
                    char_literal85=(Token)match(input,58,FOLLOW_58_in_instruction_sans_expr824); 
                    char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);

                    dbg.location(96,50);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:50: ( comm )?
                    int alt42=2;
                    try { dbg.enterSubRule(42);
                    try { dbg.enterDecision(42);

                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==83) ) {
                        alt42=1;
                    }
                    } finally {dbg.exitDecision(42);}

                    switch (alt42) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:96:50: comm
                            {
                            dbg.location(96,50);
                            pushFollow(FOLLOW_comm_in_instruction_sans_expr826);
                            comm86=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm86.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(42);}


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:97:25: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(97,25);
                    pushFollow(FOLLOW_if_expr_in_instruction_sans_expr853);
                    if_expr87=if_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, if_expr87.getTree());

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
        dbg.location(98, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instruction_sans_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instruction_sans_expr"

    public static class let2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "let2"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:1: let2 : ( 'mut' ( comm )? IDF ( comm )? '=' ( comm )? b ';' ( comm )? -> ^( VAR IDF b ) | IDF ( comm )? '=' ( comm )? b ';' ( comm )? -> ^( CST IDF b ) );
    public final Mini_Rust2Parser.let2_return let2() throws RecognitionException {
        Mini_Rust2Parser.let2_return retval = new Mini_Rust2Parser.let2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token IDF90=null;
        Token char_literal92=null;
        Token char_literal95=null;
        Token IDF97=null;
        Token char_literal99=null;
        Token char_literal102=null;
        Mini_Rust2Parser.comm_return comm89 = null;

        Mini_Rust2Parser.comm_return comm91 = null;

        Mini_Rust2Parser.comm_return comm93 = null;

        Mini_Rust2Parser.b_return b94 = null;

        Mini_Rust2Parser.comm_return comm96 = null;

        Mini_Rust2Parser.comm_return comm98 = null;

        Mini_Rust2Parser.comm_return comm100 = null;

        Mini_Rust2Parser.b_return b101 = null;

        Mini_Rust2Parser.comm_return comm103 = null;


        CommonTree string_literal88_tree=null;
        CommonTree IDF90_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal95_tree=null;
        CommonTree IDF97_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b");
        try { dbg.enterRule(getGrammarFileName(), "let2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:6: ( 'mut' ( comm )? IDF ( comm )? '=' ( comm )? b ';' ( comm )? -> ^( VAR IDF b ) | IDF ( comm )? '=' ( comm )? b ';' ( comm )? -> ^( CST IDF b ) )
            int alt51=2;
            try { dbg.enterDecision(51);

            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            else if ( (LA51_0==IDF) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:8: 'mut' ( comm )? IDF ( comm )? '=' ( comm )? b ';' ( comm )?
                    {
                    dbg.location(99,8);
                    string_literal88=(Token)match(input,62,FOLLOW_62_in_let2883);  
                    stream_62.add(string_literal88);

                    dbg.location(99,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:14: ( comm )?
                    int alt44=2;
                    try { dbg.enterSubRule(44);
                    try { dbg.enterDecision(44);

                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==83) ) {
                        alt44=1;
                    }
                    } finally {dbg.exitDecision(44);}

                    switch (alt44) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:14: comm
                            {
                            dbg.location(99,14);
                            pushFollow(FOLLOW_comm_in_let2885);
                            comm89=comm();

                            state._fsp--;

                            stream_comm.add(comm89.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(44);}

                    dbg.location(99,20);
                    IDF90=(Token)match(input,IDF,FOLLOW_IDF_in_let2888);  
                    stream_IDF.add(IDF90);

                    dbg.location(99,24);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:24: ( comm )?
                    int alt45=2;
                    try { dbg.enterSubRule(45);
                    try { dbg.enterDecision(45);

                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==83) ) {
                        alt45=1;
                    }
                    } finally {dbg.exitDecision(45);}

                    switch (alt45) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:24: comm
                            {
                            dbg.location(99,24);
                            pushFollow(FOLLOW_comm_in_let2890);
                            comm91=comm();

                            state._fsp--;

                            stream_comm.add(comm91.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(45);}

                    dbg.location(99,30);
                    char_literal92=(Token)match(input,63,FOLLOW_63_in_let2893);  
                    stream_63.add(char_literal92);

                    dbg.location(99,34);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:34: ( comm )?
                    int alt46=2;
                    try { dbg.enterSubRule(46);
                    try { dbg.enterDecision(46);

                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==83) ) {
                        alt46=1;
                    }
                    } finally {dbg.exitDecision(46);}

                    switch (alt46) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:34: comm
                            {
                            dbg.location(99,34);
                            pushFollow(FOLLOW_comm_in_let2895);
                            comm93=comm();

                            state._fsp--;

                            stream_comm.add(comm93.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(46);}

                    dbg.location(99,40);
                    pushFollow(FOLLOW_b_in_let2898);
                    b94=b();

                    state._fsp--;

                    stream_b.add(b94.getTree());
                    dbg.location(99,42);
                    char_literal95=(Token)match(input,58,FOLLOW_58_in_let2900);  
                    stream_58.add(char_literal95);

                    dbg.location(99,46);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:46: ( comm )?
                    int alt47=2;
                    try { dbg.enterSubRule(47);
                    try { dbg.enterDecision(47);

                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==83) ) {
                        alt47=1;
                    }
                    } finally {dbg.exitDecision(47);}

                    switch (alt47) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:46: comm
                            {
                            dbg.location(99,46);
                            pushFollow(FOLLOW_comm_in_let2902);
                            comm96=comm();

                            state._fsp--;

                            stream_comm.add(comm96.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(47);}



                    // AST REWRITE
                    // elements: b, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:52: -> ^( VAR IDF b )
                    {
                        dbg.location(99,55);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:99:55: ^( VAR IDF b )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(99,57);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                        dbg.location(99,61);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(99,65);
                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:8: IDF ( comm )? '=' ( comm )? b ';' ( comm )?
                    {
                    dbg.location(100,8);
                    IDF97=(Token)match(input,IDF,FOLLOW_IDF_in_let2923);  
                    stream_IDF.add(IDF97);

                    dbg.location(100,12);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:12: ( comm )?
                    int alt48=2;
                    try { dbg.enterSubRule(48);
                    try { dbg.enterDecision(48);

                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==83) ) {
                        alt48=1;
                    }
                    } finally {dbg.exitDecision(48);}

                    switch (alt48) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:12: comm
                            {
                            dbg.location(100,12);
                            pushFollow(FOLLOW_comm_in_let2925);
                            comm98=comm();

                            state._fsp--;

                            stream_comm.add(comm98.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(48);}

                    dbg.location(100,18);
                    char_literal99=(Token)match(input,63,FOLLOW_63_in_let2928);  
                    stream_63.add(char_literal99);

                    dbg.location(100,22);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:22: ( comm )?
                    int alt49=2;
                    try { dbg.enterSubRule(49);
                    try { dbg.enterDecision(49);

                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==83) ) {
                        alt49=1;
                    }
                    } finally {dbg.exitDecision(49);}

                    switch (alt49) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:22: comm
                            {
                            dbg.location(100,22);
                            pushFollow(FOLLOW_comm_in_let2930);
                            comm100=comm();

                            state._fsp--;

                            stream_comm.add(comm100.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(49);}

                    dbg.location(100,28);
                    pushFollow(FOLLOW_b_in_let2933);
                    b101=b();

                    state._fsp--;

                    stream_b.add(b101.getTree());
                    dbg.location(100,30);
                    char_literal102=(Token)match(input,58,FOLLOW_58_in_let2935);  
                    stream_58.add(char_literal102);

                    dbg.location(100,34);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:34: ( comm )?
                    int alt50=2;
                    try { dbg.enterSubRule(50);
                    try { dbg.enterDecision(50);

                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==83) ) {
                        alt50=1;
                    }
                    } finally {dbg.exitDecision(50);}

                    switch (alt50) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:34: comm
                            {
                            dbg.location(100,34);
                            pushFollow(FOLLOW_comm_in_let2937);
                            comm103=comm();

                            state._fsp--;

                            stream_comm.add(comm103.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(50);}



                    // AST REWRITE
                    // elements: b, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:40: -> ^( CST IDF b )
                    {
                        dbg.location(100,43);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:100:43: ^( CST IDF b )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(100,45);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CST, "CST"), root_1);

                        dbg.location(100,49);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(100,53);
                        adaptor.addChild(root_1, stream_b.nextTree());

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
        dbg.location(101, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "let2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "let2"

    public static class instruction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:103:1: instruction : ( expr ';' ( comm )? | instruction_sans_expr );
    public final Mini_Rust2Parser.instruction_return instruction() throws RecognitionException {
        Mini_Rust2Parser.instruction_return retval = new Mini_Rust2Parser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal105=null;
        Mini_Rust2Parser.expr_return expr104 = null;

        Mini_Rust2Parser.comm_return comm106 = null;

        Mini_Rust2Parser.instruction_sans_expr_return instruction_sans_expr107 = null;


        CommonTree char_literal105_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "instruction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:103:13: ( expr ';' ( comm )? | instruction_sans_expr )
            int alt53=2;
            try { dbg.enterDecision(53);

            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=IDF && LA53_0<=CST_ENT)||LA53_0==44||LA53_0==49||LA53_0==55||(LA53_0>=66 && LA53_0<=67)||(LA53_0>=70 && LA53_0<=72)||(LA53_0>=75 && LA53_0<=76)) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=58 && LA53_0<=61)||LA53_0==64) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:103:15: expr ';' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(103,15);
                    pushFollow(FOLLOW_expr_in_instruction963);
                    expr104=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr104.getTree());
                    dbg.location(103,20);
                    char_literal105=(Token)match(input,58,FOLLOW_58_in_instruction965); 
                    char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
                    adaptor.addChild(root_0, char_literal105_tree);

                    dbg.location(103,24);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:103:24: ( comm )?
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==83) ) {
                        alt52=1;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:103:24: comm
                            {
                            dbg.location(103,24);
                            pushFollow(FOLLOW_comm_in_instruction967);
                            comm106=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm106.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:104:15: instruction_sans_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(104,15);
                    pushFollow(FOLLOW_instruction_sans_expr_in_instruction984);
                    instruction_sans_expr107=instruction_sans_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, instruction_sans_expr107.getTree());

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
        dbg.location(105, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instruction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instruction"

    public static class b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "b"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:107:1: b : ( IDF ( comm )? b2 -> ^( VALUE IDF b2 ) | expr_sans_idf -> ^( VALUE expr_sans_idf ) );
    public final Mini_Rust2Parser.b_return b() throws RecognitionException {
        Mini_Rust2Parser.b_return retval = new Mini_Rust2Parser.b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF108=null;
        Mini_Rust2Parser.comm_return comm109 = null;

        Mini_Rust2Parser.b2_return b2110 = null;

        Mini_Rust2Parser.expr_sans_idf_return expr_sans_idf111 = null;


        CommonTree IDF108_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2");
        RewriteRuleSubtreeStream stream_expr_sans_idf=new RewriteRuleSubtreeStream(adaptor,"rule expr_sans_idf");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        try { dbg.enterRule(getGrammarFileName(), "b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:107:3: ( IDF ( comm )? b2 -> ^( VALUE IDF b2 ) | expr_sans_idf -> ^( VALUE expr_sans_idf ) )
            int alt55=2;
            try { dbg.enterDecision(55);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDF) ) {
                alt55=1;
            }
            else if ( (LA55_0==CST_ENT||LA55_0==44||LA55_0==49||LA55_0==66||(LA55_0>=70 && LA55_0<=72)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:107:5: IDF ( comm )? b2
                    {
                    dbg.location(107,5);
                    IDF108=(Token)match(input,IDF,FOLLOW_IDF_in_b1007);  
                    stream_IDF.add(IDF108);

                    dbg.location(107,9);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:107:9: ( comm )?
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54);

                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==83) ) {
                        alt54=1;
                    }
                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:107:9: comm
                            {
                            dbg.location(107,9);
                            pushFollow(FOLLOW_comm_in_b1009);
                            comm109=comm();

                            state._fsp--;

                            stream_comm.add(comm109.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}

                    dbg.location(107,16);
                    pushFollow(FOLLOW_b2_in_b1013);
                    b2110=b2();

                    state._fsp--;

                    stream_b2.add(b2110.getTree());


                    // AST REWRITE
                    // elements: IDF, b2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 107:19: -> ^( VALUE IDF b2 )
                    {
                        dbg.location(107,22);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:107:22: ^( VALUE IDF b2 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(107,24);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_1);

                        dbg.location(107,30);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(107,34);
                        adaptor.addChild(root_1, stream_b2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:108:5: expr_sans_idf
                    {
                    dbg.location(108,5);
                    pushFollow(FOLLOW_expr_sans_idf_in_b1029);
                    expr_sans_idf111=expr_sans_idf();

                    state._fsp--;

                    stream_expr_sans_idf.add(expr_sans_idf111.getTree());


                    // AST REWRITE
                    // elements: expr_sans_idf
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 108:19: -> ^( VALUE expr_sans_idf )
                    {
                        dbg.location(108,22);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:108:22: ^( VALUE expr_sans_idf )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(108,24);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_1);

                        dbg.location(108,30);
                        adaptor.addChild(root_1, stream_expr_sans_idf.nextTree());

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
        dbg.location(109, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "b"

    public static class b2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "b2"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:1: b2 : ( '{' ( comm )? ( IDF ( comm )? ':' ( comm )? expr ( ',' ( comm )? IDF ( comm )? ':' ( comm )? expr )* )? '}' ( comm )? | operation_suivante );
    public final Mini_Rust2Parser.b2_return b2() throws RecognitionException {
        Mini_Rust2Parser.b2_return retval = new Mini_Rust2Parser.b2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal112=null;
        Token IDF114=null;
        Token char_literal116=null;
        Token char_literal119=null;
        Token IDF121=null;
        Token char_literal123=null;
        Token char_literal126=null;
        Mini_Rust2Parser.comm_return comm113 = null;

        Mini_Rust2Parser.comm_return comm115 = null;

        Mini_Rust2Parser.comm_return comm117 = null;

        Mini_Rust2Parser.expr_return expr118 = null;

        Mini_Rust2Parser.comm_return comm120 = null;

        Mini_Rust2Parser.comm_return comm122 = null;

        Mini_Rust2Parser.comm_return comm124 = null;

        Mini_Rust2Parser.expr_return expr125 = null;

        Mini_Rust2Parser.comm_return comm127 = null;

        Mini_Rust2Parser.operation_suivante_return operation_suivante128 = null;


        CommonTree char_literal112_tree=null;
        CommonTree IDF114_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree IDF121_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree char_literal126_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "b2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:4: ( '{' ( comm )? ( IDF ( comm )? ':' ( comm )? expr ( ',' ( comm )? IDF ( comm )? ':' ( comm )? expr )* )? '}' ( comm )? | operation_suivante )
            int alt65=2;
            try { dbg.enterDecision(65);

            int LA65_0 = input.LA(1);

            if ( (LA65_0==44) ) {
                alt65=1;
            }
            else if ( (LA65_0==49||(LA65_0>=53 && LA65_0<=54)||LA65_0==58||LA65_0==63||LA65_0==68||LA65_0==73||(LA65_0>=75 && LA65_0<=82)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:6: '{' ( comm )? ( IDF ( comm )? ':' ( comm )? expr ( ',' ( comm )? IDF ( comm )? ':' ( comm )? expr )* )? '}' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(111,6);
                    char_literal112=(Token)match(input,44,FOLLOW_44_in_b21050); 
                    char_literal112_tree = (CommonTree)adaptor.create(char_literal112);
                    adaptor.addChild(root_0, char_literal112_tree);

                    dbg.location(111,10);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:10: ( comm )?
                    int alt56=2;
                    try { dbg.enterSubRule(56);
                    try { dbg.enterDecision(56);

                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==83) ) {
                        alt56=1;
                    }
                    } finally {dbg.exitDecision(56);}

                    switch (alt56) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:10: comm
                            {
                            dbg.location(111,10);
                            pushFollow(FOLLOW_comm_in_b21052);
                            comm113=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm113.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(56);}

                    dbg.location(111,16);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:16: ( IDF ( comm )? ':' ( comm )? expr ( ',' ( comm )? IDF ( comm )? ':' ( comm )? expr )* )?
                    int alt63=2;
                    try { dbg.enterSubRule(63);
                    try { dbg.enterDecision(63);

                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==IDF) ) {
                        alt63=1;
                    }
                    } finally {dbg.exitDecision(63);}

                    switch (alt63) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:17: IDF ( comm )? ':' ( comm )? expr ( ',' ( comm )? IDF ( comm )? ':' ( comm )? expr )*
                            {
                            dbg.location(111,17);
                            IDF114=(Token)match(input,IDF,FOLLOW_IDF_in_b21056); 
                            IDF114_tree = (CommonTree)adaptor.create(IDF114);
                            adaptor.addChild(root_0, IDF114_tree);

                            dbg.location(111,21);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:21: ( comm )?
                            int alt57=2;
                            try { dbg.enterSubRule(57);
                            try { dbg.enterDecision(57);

                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==83) ) {
                                alt57=1;
                            }
                            } finally {dbg.exitDecision(57);}

                            switch (alt57) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:21: comm
                                    {
                                    dbg.location(111,21);
                                    pushFollow(FOLLOW_comm_in_b21058);
                                    comm115=comm();

                                    state._fsp--;

                                    adaptor.addChild(root_0, comm115.getTree());

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(57);}

                            dbg.location(111,27);
                            char_literal116=(Token)match(input,45,FOLLOW_45_in_b21061); 
                            char_literal116_tree = (CommonTree)adaptor.create(char_literal116);
                            adaptor.addChild(root_0, char_literal116_tree);

                            dbg.location(111,31);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:31: ( comm )?
                            int alt58=2;
                            try { dbg.enterSubRule(58);
                            try { dbg.enterDecision(58);

                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==83) ) {
                                alt58=1;
                            }
                            } finally {dbg.exitDecision(58);}

                            switch (alt58) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:31: comm
                                    {
                                    dbg.location(111,31);
                                    pushFollow(FOLLOW_comm_in_b21063);
                                    comm117=comm();

                                    state._fsp--;

                                    adaptor.addChild(root_0, comm117.getTree());

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(58);}

                            dbg.location(111,37);
                            pushFollow(FOLLOW_expr_in_b21066);
                            expr118=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr118.getTree());
                            dbg.location(111,42);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:42: ( ',' ( comm )? IDF ( comm )? ':' ( comm )? expr )*
                            try { dbg.enterSubRule(62);

                            loop62:
                            do {
                                int alt62=2;
                                try { dbg.enterDecision(62);

                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==46) ) {
                                    alt62=1;
                                }


                                } finally {dbg.exitDecision(62);}

                                switch (alt62) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:43: ',' ( comm )? IDF ( comm )? ':' ( comm )? expr
                            	    {
                            	    dbg.location(111,43);
                            	    char_literal119=(Token)match(input,46,FOLLOW_46_in_b21069); 
                            	    char_literal119_tree = (CommonTree)adaptor.create(char_literal119);
                            	    adaptor.addChild(root_0, char_literal119_tree);

                            	    dbg.location(111,47);
                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:47: ( comm )?
                            	    int alt59=2;
                            	    try { dbg.enterSubRule(59);
                            	    try { dbg.enterDecision(59);

                            	    int LA59_0 = input.LA(1);

                            	    if ( (LA59_0==83) ) {
                            	        alt59=1;
                            	    }
                            	    } finally {dbg.exitDecision(59);}

                            	    switch (alt59) {
                            	        case 1 :
                            	            dbg.enterAlt(1);

                            	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:47: comm
                            	            {
                            	            dbg.location(111,47);
                            	            pushFollow(FOLLOW_comm_in_b21071);
                            	            comm120=comm();

                            	            state._fsp--;

                            	            adaptor.addChild(root_0, comm120.getTree());

                            	            }
                            	            break;

                            	    }
                            	    } finally {dbg.exitSubRule(59);}

                            	    dbg.location(111,53);
                            	    IDF121=(Token)match(input,IDF,FOLLOW_IDF_in_b21074); 
                            	    IDF121_tree = (CommonTree)adaptor.create(IDF121);
                            	    adaptor.addChild(root_0, IDF121_tree);

                            	    dbg.location(111,57);
                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:57: ( comm )?
                            	    int alt60=2;
                            	    try { dbg.enterSubRule(60);
                            	    try { dbg.enterDecision(60);

                            	    int LA60_0 = input.LA(1);

                            	    if ( (LA60_0==83) ) {
                            	        alt60=1;
                            	    }
                            	    } finally {dbg.exitDecision(60);}

                            	    switch (alt60) {
                            	        case 1 :
                            	            dbg.enterAlt(1);

                            	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:57: comm
                            	            {
                            	            dbg.location(111,57);
                            	            pushFollow(FOLLOW_comm_in_b21076);
                            	            comm122=comm();

                            	            state._fsp--;

                            	            adaptor.addChild(root_0, comm122.getTree());

                            	            }
                            	            break;

                            	    }
                            	    } finally {dbg.exitSubRule(60);}

                            	    dbg.location(111,63);
                            	    char_literal123=(Token)match(input,45,FOLLOW_45_in_b21079); 
                            	    char_literal123_tree = (CommonTree)adaptor.create(char_literal123);
                            	    adaptor.addChild(root_0, char_literal123_tree);

                            	    dbg.location(111,67);
                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:67: ( comm )?
                            	    int alt61=2;
                            	    try { dbg.enterSubRule(61);
                            	    try { dbg.enterDecision(61);

                            	    int LA61_0 = input.LA(1);

                            	    if ( (LA61_0==83) ) {
                            	        alt61=1;
                            	    }
                            	    } finally {dbg.exitDecision(61);}

                            	    switch (alt61) {
                            	        case 1 :
                            	            dbg.enterAlt(1);

                            	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:67: comm
                            	            {
                            	            dbg.location(111,67);
                            	            pushFollow(FOLLOW_comm_in_b21081);
                            	            comm124=comm();

                            	            state._fsp--;

                            	            adaptor.addChild(root_0, comm124.getTree());

                            	            }
                            	            break;

                            	    }
                            	    } finally {dbg.exitSubRule(61);}

                            	    dbg.location(111,73);
                            	    pushFollow(FOLLOW_expr_in_b21084);
                            	    expr125=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr125.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop62;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(62);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(63);}

                    dbg.location(111,82);
                    char_literal126=(Token)match(input,47,FOLLOW_47_in_b21090); 
                    char_literal126_tree = (CommonTree)adaptor.create(char_literal126);
                    adaptor.addChild(root_0, char_literal126_tree);

                    dbg.location(111,86);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:86: ( comm )?
                    int alt64=2;
                    try { dbg.enterSubRule(64);
                    try { dbg.enterDecision(64);

                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==83) ) {
                        alt64=1;
                    }
                    } finally {dbg.exitDecision(64);}

                    switch (alt64) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:111:86: comm
                            {
                            dbg.location(111,86);
                            pushFollow(FOLLOW_comm_in_b21092);
                            comm127=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm127.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(64);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:112:6: operation_suivante
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(112,6);
                    pushFollow(FOLLOW_operation_suivante_in_b21101);
                    operation_suivante128=operation_suivante();

                    state._fsp--;

                    adaptor.addChild(root_0, operation_suivante128.getTree());

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
        dbg.location(113, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "b2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "b2"

    public static class operation_suivante_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_suivante"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:1: operation_suivante : ( fonctions_ou_vecteurs )? ( prio1 operations_prio1 )? ( prio2 operations_prio2 )? ( prio3 operations_prio3 )? ( prio4 operations_prio4 )? ( prio5 operations_prio5 )? ;
    public final Mini_Rust2Parser.operation_suivante_return operation_suivante() throws RecognitionException {
        Mini_Rust2Parser.operation_suivante_return retval = new Mini_Rust2Parser.operation_suivante_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.fonctions_ou_vecteurs_return fonctions_ou_vecteurs129 = null;

        Mini_Rust2Parser.prio1_return prio1130 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1131 = null;

        Mini_Rust2Parser.prio2_return prio2132 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2133 = null;

        Mini_Rust2Parser.prio3_return prio3134 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3135 = null;

        Mini_Rust2Parser.prio4_return prio4136 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4137 = null;

        Mini_Rust2Parser.prio5_return prio5138 = null;

        Mini_Rust2Parser.operations_prio5_return operations_prio5139 = null;



        try { dbg.enterRule(getGrammarFileName(), "operation_suivante");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:20: ( ( fonctions_ou_vecteurs )? ( prio1 operations_prio1 )? ( prio2 operations_prio2 )? ( prio3 operations_prio3 )? ( prio4 operations_prio4 )? ( prio5 operations_prio5 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:22: ( fonctions_ou_vecteurs )? ( prio1 operations_prio1 )? ( prio2 operations_prio2 )? ( prio3 operations_prio3 )? ( prio4 operations_prio4 )? ( prio5 operations_prio5 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(115,22);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:22: ( fonctions_ou_vecteurs )?
            int alt66=2;
            try { dbg.enterSubRule(66);
            try { dbg.enterDecision(66);

            int LA66_0 = input.LA(1);

            if ( (LA66_0==49||LA66_0==68||LA66_0==73) ) {
                alt66=1;
            }
            } finally {dbg.exitDecision(66);}

            switch (alt66) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:23: fonctions_ou_vecteurs
                    {
                    dbg.location(115,23);
                    pushFollow(FOLLOW_fonctions_ou_vecteurs_in_operation_suivante1115);
                    fonctions_ou_vecteurs129=fonctions_ou_vecteurs();

                    state._fsp--;

                    adaptor.addChild(root_0, fonctions_ou_vecteurs129.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(66);}

            dbg.location(115,47);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:47: ( prio1 operations_prio1 )?
            int alt67=2;
            try { dbg.enterSubRule(67);
            try { dbg.enterDecision(67);

            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=76 && LA67_0<=77)) ) {
                alt67=1;
            }
            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:48: prio1 operations_prio1
                    {
                    dbg.location(115,48);
                    pushFollow(FOLLOW_prio1_in_operation_suivante1120);
                    prio1130=prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, prio1130.getTree());
                    dbg.location(115,54);
                    pushFollow(FOLLOW_operations_prio1_in_operation_suivante1122);
                    operations_prio1131=operations_prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1131.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(67);}

            dbg.location(115,73);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:73: ( prio2 operations_prio2 )?
            int alt68=2;
            try { dbg.enterSubRule(68);
            try { dbg.enterDecision(68);

            int LA68_0 = input.LA(1);

            if ( (LA68_0==75||LA68_0==78) ) {
                alt68=1;
            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:74: prio2 operations_prio2
                    {
                    dbg.location(115,74);
                    pushFollow(FOLLOW_prio2_in_operation_suivante1127);
                    prio2132=prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, prio2132.getTree());
                    dbg.location(115,80);
                    pushFollow(FOLLOW_operations_prio2_in_operation_suivante1129);
                    operations_prio2133=operations_prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2133.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(68);}

            dbg.location(115,99);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:99: ( prio3 operations_prio3 )?
            int alt69=2;
            try { dbg.enterSubRule(69);
            try { dbg.enterDecision(69);

            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=53 && LA69_0<=54)||(LA69_0>=79 && LA69_0<=80)) ) {
                alt69=1;
            }
            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:100: prio3 operations_prio3
                    {
                    dbg.location(115,100);
                    pushFollow(FOLLOW_prio3_in_operation_suivante1134);
                    prio3134=prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, prio3134.getTree());
                    dbg.location(115,106);
                    pushFollow(FOLLOW_operations_prio3_in_operation_suivante1136);
                    operations_prio3135=operations_prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3135.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(69);}

            dbg.location(115,125);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:125: ( prio4 operations_prio4 )?
            int alt70=2;
            try { dbg.enterSubRule(70);
            try { dbg.enterDecision(70);

            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=81 && LA70_0<=82)) ) {
                alt70=1;
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:126: prio4 operations_prio4
                    {
                    dbg.location(115,126);
                    pushFollow(FOLLOW_prio4_in_operation_suivante1141);
                    prio4136=prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, prio4136.getTree());
                    dbg.location(115,132);
                    pushFollow(FOLLOW_operations_prio4_in_operation_suivante1143);
                    operations_prio4137=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4137.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(70);}

            dbg.location(115,151);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:151: ( prio5 operations_prio5 )?
            int alt71=2;
            try { dbg.enterSubRule(71);
            try { dbg.enterDecision(71);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:115:152: prio5 operations_prio5
                    {
                    dbg.location(115,152);
                    pushFollow(FOLLOW_prio5_in_operation_suivante1148);
                    prio5138=prio5();

                    state._fsp--;

                    adaptor.addChild(root_0, prio5138.getTree());
                    dbg.location(115,158);
                    pushFollow(FOLLOW_operations_prio5_in_operation_suivante1150);
                    operations_prio5139=operations_prio5();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio5139.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(71);}


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
        dbg.location(116, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operation_suivante");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operation_suivante"

    public static class if_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_expr"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:1: if_expr : 'if' ( comm )? expr bloc ( 'else' ( comm )? ( bloc | if_expr ) )? ;
    public final Mini_Rust2Parser.if_expr_return if_expr() throws RecognitionException {
        Mini_Rust2Parser.if_expr_return retval = new Mini_Rust2Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal140=null;
        Token string_literal144=null;
        Mini_Rust2Parser.comm_return comm141 = null;

        Mini_Rust2Parser.expr_return expr142 = null;

        Mini_Rust2Parser.bloc_return bloc143 = null;

        Mini_Rust2Parser.comm_return comm145 = null;

        Mini_Rust2Parser.bloc_return bloc146 = null;

        Mini_Rust2Parser.if_expr_return if_expr147 = null;


        CommonTree string_literal140_tree=null;
        CommonTree string_literal144_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "if_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:9: ( 'if' ( comm )? expr bloc ( 'else' ( comm )? ( bloc | if_expr ) )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:11: 'if' ( comm )? expr bloc ( 'else' ( comm )? ( bloc | if_expr ) )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(118,11);
            string_literal140=(Token)match(input,64,FOLLOW_64_in_if_expr1180); 
            string_literal140_tree = (CommonTree)adaptor.create(string_literal140);
            adaptor.addChild(root_0, string_literal140_tree);

            dbg.location(118,16);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:16: ( comm )?
            int alt72=2;
            try { dbg.enterSubRule(72);
            try { dbg.enterDecision(72);

            int LA72_0 = input.LA(1);

            if ( (LA72_0==83) ) {
                alt72=1;
            }
            } finally {dbg.exitDecision(72);}

            switch (alt72) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:16: comm
                    {
                    dbg.location(118,16);
                    pushFollow(FOLLOW_comm_in_if_expr1182);
                    comm141=comm();

                    state._fsp--;

                    adaptor.addChild(root_0, comm141.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(72);}

            dbg.location(118,22);
            pushFollow(FOLLOW_expr_in_if_expr1185);
            expr142=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr142.getTree());
            dbg.location(118,27);
            pushFollow(FOLLOW_bloc_in_if_expr1187);
            bloc143=bloc();

            state._fsp--;

            adaptor.addChild(root_0, bloc143.getTree());
            dbg.location(118,32);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:32: ( 'else' ( comm )? ( bloc | if_expr ) )?
            int alt75=2;
            try { dbg.enterSubRule(75);
            try { dbg.enterDecision(75);

            int LA75_0 = input.LA(1);

            if ( (LA75_0==65) ) {
                alt75=1;
            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:33: 'else' ( comm )? ( bloc | if_expr )
                    {
                    dbg.location(118,33);
                    string_literal144=(Token)match(input,65,FOLLOW_65_in_if_expr1190); 
                    string_literal144_tree = (CommonTree)adaptor.create(string_literal144);
                    adaptor.addChild(root_0, string_literal144_tree);

                    dbg.location(118,40);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:40: ( comm )?
                    int alt73=2;
                    try { dbg.enterSubRule(73);
                    try { dbg.enterDecision(73);

                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==83) ) {
                        alt73=1;
                    }
                    } finally {dbg.exitDecision(73);}

                    switch (alt73) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:40: comm
                            {
                            dbg.location(118,40);
                            pushFollow(FOLLOW_comm_in_if_expr1192);
                            comm145=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm145.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(73);}

                    dbg.location(118,46);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:46: ( bloc | if_expr )
                    int alt74=2;
                    try { dbg.enterSubRule(74);
                    try { dbg.enterDecision(74);

                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==44) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==64) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(74);}

                    switch (alt74) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:47: bloc
                            {
                            dbg.location(118,47);
                            pushFollow(FOLLOW_bloc_in_if_expr1196);
                            bloc146=bloc();

                            state._fsp--;

                            adaptor.addChild(root_0, bloc146.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:118:54: if_expr
                            {
                            dbg.location(118,54);
                            pushFollow(FOLLOW_if_expr_in_if_expr1200);
                            if_expr147=if_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, if_expr147.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(74);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(75);}


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
        dbg.location(119, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "if_expr"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:121:1: expr : ( operations_prio5 | 'vec' ( comm )? '!' ( comm )? '[' ( comm )? ( expr ( ',' ( comm )? expr )* )? ']' ( comm )? | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? -> ^( PRINT expr ) | bloc );
    public final Mini_Rust2Parser.expr_return expr() throws RecognitionException {
        Mini_Rust2Parser.expr_return retval = new Mini_Rust2Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal149=null;
        Token char_literal151=null;
        Token char_literal153=null;
        Token char_literal156=null;
        Token char_literal159=null;
        Token string_literal161=null;
        Token char_literal163=null;
        Token char_literal165=null;
        Token char_literal168=null;
        Mini_Rust2Parser.operations_prio5_return operations_prio5148 = null;

        Mini_Rust2Parser.comm_return comm150 = null;

        Mini_Rust2Parser.comm_return comm152 = null;

        Mini_Rust2Parser.comm_return comm154 = null;

        Mini_Rust2Parser.expr_return expr155 = null;

        Mini_Rust2Parser.comm_return comm157 = null;

        Mini_Rust2Parser.expr_return expr158 = null;

        Mini_Rust2Parser.comm_return comm160 = null;

        Mini_Rust2Parser.comm_return comm162 = null;

        Mini_Rust2Parser.comm_return comm164 = null;

        Mini_Rust2Parser.comm_return comm166 = null;

        Mini_Rust2Parser.expr_return expr167 = null;

        Mini_Rust2Parser.comm_return comm169 = null;

        Mini_Rust2Parser.bloc_return bloc170 = null;


        CommonTree string_literal149_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree string_literal161_tree=null;
        CommonTree char_literal163_tree=null;
        CommonTree char_literal165_tree=null;
        CommonTree char_literal168_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_comm=new RewriteRuleSubtreeStream(adaptor,"rule comm");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:121:6: ( operations_prio5 | 'vec' ( comm )? '!' ( comm )? '[' ( comm )? ( expr ( ',' ( comm )? expr )* )? ']' ( comm )? | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? -> ^( PRINT expr ) | bloc )
            int alt87=4;
            try { dbg.enterDecision(87);

            switch ( input.LA(1) ) {
            case IDF:
            case CST_ENT:
            case 49:
            case 55:
            case 67:
            case 71:
            case 72:
            case 75:
            case 76:
                {
                alt87=1;
                }
                break;
            case 66:
                {
                alt87=2;
                }
                break;
            case 70:
                {
                alt87=3;
                }
                break;
            case 44:
                {
                alt87=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(87);}

            switch (alt87) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:121:8: operations_prio5
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(121,8);
                    pushFollow(FOLLOW_operations_prio5_in_expr1220);
                    operations_prio5148=operations_prio5();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio5148.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:8: 'vec' ( comm )? '!' ( comm )? '[' ( comm )? ( expr ( ',' ( comm )? expr )* )? ']' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(122,8);
                    string_literal149=(Token)match(input,66,FOLLOW_66_in_expr1229); 
                    string_literal149_tree = (CommonTree)adaptor.create(string_literal149);
                    adaptor.addChild(root_0, string_literal149_tree);

                    dbg.location(122,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:14: ( comm )?
                    int alt76=2;
                    try { dbg.enterSubRule(76);
                    try { dbg.enterDecision(76);

                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==83) ) {
                        alt76=1;
                    }
                    } finally {dbg.exitDecision(76);}

                    switch (alt76) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:14: comm
                            {
                            dbg.location(122,14);
                            pushFollow(FOLLOW_comm_in_expr1231);
                            comm150=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm150.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(76);}

                    dbg.location(122,20);
                    char_literal151=(Token)match(input,67,FOLLOW_67_in_expr1234); 
                    char_literal151_tree = (CommonTree)adaptor.create(char_literal151);
                    adaptor.addChild(root_0, char_literal151_tree);

                    dbg.location(122,24);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:24: ( comm )?
                    int alt77=2;
                    try { dbg.enterSubRule(77);
                    try { dbg.enterDecision(77);

                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==83) ) {
                        alt77=1;
                    }
                    } finally {dbg.exitDecision(77);}

                    switch (alt77) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:24: comm
                            {
                            dbg.location(122,24);
                            pushFollow(FOLLOW_comm_in_expr1236);
                            comm152=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm152.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(77);}

                    dbg.location(122,30);
                    char_literal153=(Token)match(input,68,FOLLOW_68_in_expr1239); 
                    char_literal153_tree = (CommonTree)adaptor.create(char_literal153);
                    adaptor.addChild(root_0, char_literal153_tree);

                    dbg.location(122,34);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:34: ( comm )?
                    int alt78=2;
                    try { dbg.enterSubRule(78);
                    try { dbg.enterDecision(78);

                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==83) ) {
                        alt78=1;
                    }
                    } finally {dbg.exitDecision(78);}

                    switch (alt78) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:34: comm
                            {
                            dbg.location(122,34);
                            pushFollow(FOLLOW_comm_in_expr1241);
                            comm154=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm154.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(78);}

                    dbg.location(122,40);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:40: ( expr ( ',' ( comm )? expr )* )?
                    int alt81=2;
                    try { dbg.enterSubRule(81);
                    try { dbg.enterDecision(81);

                    int LA81_0 = input.LA(1);

                    if ( ((LA81_0>=IDF && LA81_0<=CST_ENT)||LA81_0==44||LA81_0==49||LA81_0==55||(LA81_0>=66 && LA81_0<=67)||(LA81_0>=70 && LA81_0<=72)||(LA81_0>=75 && LA81_0<=76)) ) {
                        alt81=1;
                    }
                    } finally {dbg.exitDecision(81);}

                    switch (alt81) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:42: expr ( ',' ( comm )? expr )*
                            {
                            dbg.location(122,42);
                            pushFollow(FOLLOW_expr_in_expr1246);
                            expr155=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr155.getTree());
                            dbg.location(122,47);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:47: ( ',' ( comm )? expr )*
                            try { dbg.enterSubRule(80);

                            loop80:
                            do {
                                int alt80=2;
                                try { dbg.enterDecision(80);

                                int LA80_0 = input.LA(1);

                                if ( (LA80_0==46) ) {
                                    alt80=1;
                                }


                                } finally {dbg.exitDecision(80);}

                                switch (alt80) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:48: ',' ( comm )? expr
                            	    {
                            	    dbg.location(122,48);
                            	    char_literal156=(Token)match(input,46,FOLLOW_46_in_expr1249); 
                            	    char_literal156_tree = (CommonTree)adaptor.create(char_literal156);
                            	    adaptor.addChild(root_0, char_literal156_tree);

                            	    dbg.location(122,52);
                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:52: ( comm )?
                            	    int alt79=2;
                            	    try { dbg.enterSubRule(79);
                            	    try { dbg.enterDecision(79);

                            	    int LA79_0 = input.LA(1);

                            	    if ( (LA79_0==83) ) {
                            	        alt79=1;
                            	    }
                            	    } finally {dbg.exitDecision(79);}

                            	    switch (alt79) {
                            	        case 1 :
                            	            dbg.enterAlt(1);

                            	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:52: comm
                            	            {
                            	            dbg.location(122,52);
                            	            pushFollow(FOLLOW_comm_in_expr1251);
                            	            comm157=comm();

                            	            state._fsp--;

                            	            adaptor.addChild(root_0, comm157.getTree());

                            	            }
                            	            break;

                            	    }
                            	    } finally {dbg.exitSubRule(79);}

                            	    dbg.location(122,58);
                            	    pushFollow(FOLLOW_expr_in_expr1254);
                            	    expr158=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr158.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop80;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(80);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(81);}

                    dbg.location(122,67);
                    char_literal159=(Token)match(input,69,FOLLOW_69_in_expr1260); 
                    char_literal159_tree = (CommonTree)adaptor.create(char_literal159);
                    adaptor.addChild(root_0, char_literal159_tree);

                    dbg.location(122,71);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:71: ( comm )?
                    int alt82=2;
                    try { dbg.enterSubRule(82);
                    try { dbg.enterDecision(82);

                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==83) ) {
                        alt82=1;
                    }
                    } finally {dbg.exitDecision(82);}

                    switch (alt82) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:122:71: comm
                            {
                            dbg.location(122,71);
                            pushFollow(FOLLOW_comm_in_expr1262);
                            comm160=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm160.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(82);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:8: 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )?
                    {
                    dbg.location(123,8);
                    string_literal161=(Token)match(input,70,FOLLOW_70_in_expr1272);  
                    stream_70.add(string_literal161);

                    dbg.location(123,16);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:16: ( comm )?
                    int alt83=2;
                    try { dbg.enterSubRule(83);
                    try { dbg.enterDecision(83);

                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==83) ) {
                        alt83=1;
                    }
                    } finally {dbg.exitDecision(83);}

                    switch (alt83) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:16: comm
                            {
                            dbg.location(123,16);
                            pushFollow(FOLLOW_comm_in_expr1274);
                            comm162=comm();

                            state._fsp--;

                            stream_comm.add(comm162.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(83);}

                    dbg.location(123,22);
                    char_literal163=(Token)match(input,67,FOLLOW_67_in_expr1277);  
                    stream_67.add(char_literal163);

                    dbg.location(123,26);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:26: ( comm )?
                    int alt84=2;
                    try { dbg.enterSubRule(84);
                    try { dbg.enterDecision(84);

                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==83) ) {
                        alt84=1;
                    }
                    } finally {dbg.exitDecision(84);}

                    switch (alt84) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:26: comm
                            {
                            dbg.location(123,26);
                            pushFollow(FOLLOW_comm_in_expr1279);
                            comm164=comm();

                            state._fsp--;

                            stream_comm.add(comm164.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(84);}

                    dbg.location(123,32);
                    char_literal165=(Token)match(input,49,FOLLOW_49_in_expr1282);  
                    stream_49.add(char_literal165);

                    dbg.location(123,36);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:36: ( comm )?
                    int alt85=2;
                    try { dbg.enterSubRule(85);
                    try { dbg.enterDecision(85);

                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==83) ) {
                        alt85=1;
                    }
                    } finally {dbg.exitDecision(85);}

                    switch (alt85) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:36: comm
                            {
                            dbg.location(123,36);
                            pushFollow(FOLLOW_comm_in_expr1284);
                            comm166=comm();

                            state._fsp--;

                            stream_comm.add(comm166.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(85);}

                    dbg.location(123,42);
                    pushFollow(FOLLOW_expr_in_expr1287);
                    expr167=expr();

                    state._fsp--;

                    stream_expr.add(expr167.getTree());
                    dbg.location(123,47);
                    char_literal168=(Token)match(input,50,FOLLOW_50_in_expr1289);  
                    stream_50.add(char_literal168);

                    dbg.location(123,51);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:51: ( comm )?
                    int alt86=2;
                    try { dbg.enterSubRule(86);
                    try { dbg.enterDecision(86);

                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==83) ) {
                        alt86=1;
                    }
                    } finally {dbg.exitDecision(86);}

                    switch (alt86) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:51: comm
                            {
                            dbg.location(123,51);
                            pushFollow(FOLLOW_comm_in_expr1291);
                            comm169=comm();

                            state._fsp--;

                            stream_comm.add(comm169.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(86);}



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
                    // 123:57: -> ^( PRINT expr )
                    {
                        dbg.location(123,60);
                        // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:123:60: ^( PRINT expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(123,62);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRINT, "PRINT"), root_1);

                        dbg.location(123,69);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:124:8: bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(124,8);
                    pushFollow(FOLLOW_bloc_in_expr1310);
                    bloc170=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc170.getTree());

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
        dbg.location(125, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class operations_prio5_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio5"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:128:1: operations_prio5 : operations_prio4 ( prio5 operations_prio4 )? ;
    public final Mini_Rust2Parser.operations_prio5_return operations_prio5() throws RecognitionException {
        Mini_Rust2Parser.operations_prio5_return retval = new Mini_Rust2Parser.operations_prio5_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4171 = null;

        Mini_Rust2Parser.prio5_return prio5172 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4173 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio5");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:128:18: ( operations_prio4 ( prio5 operations_prio4 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:128:20: operations_prio4 ( prio5 operations_prio4 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(128,20);
            pushFollow(FOLLOW_operations_prio4_in_operations_prio51326);
            operations_prio4171=operations_prio4();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio4171.getTree());
            dbg.location(128,37);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:128:37: ( prio5 operations_prio4 )?
            int alt88=2;
            try { dbg.enterSubRule(88);
            try { dbg.enterDecision(88);

            int LA88_0 = input.LA(1);

            if ( (LA88_0==63) ) {
                alt88=1;
            }
            } finally {dbg.exitDecision(88);}

            switch (alt88) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:128:38: prio5 operations_prio4
                    {
                    dbg.location(128,38);
                    pushFollow(FOLLOW_prio5_in_operations_prio51329);
                    prio5172=prio5();

                    state._fsp--;

                    adaptor.addChild(root_0, prio5172.getTree());
                    dbg.location(128,44);
                    pushFollow(FOLLOW_operations_prio4_in_operations_prio51331);
                    operations_prio4173=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4173.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(88);}


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
        dbg.location(129, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio5");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio5"

    public static class operations_prio4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio4"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:131:1: operations_prio4 : operations_prio3 ( prio4 operations_prio4 )? ;
    public final Mini_Rust2Parser.operations_prio4_return operations_prio4() throws RecognitionException {
        Mini_Rust2Parser.operations_prio4_return retval = new Mini_Rust2Parser.operations_prio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3174 = null;

        Mini_Rust2Parser.prio4_return prio4175 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4176 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio4");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:131:18: ( operations_prio3 ( prio4 operations_prio4 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:131:20: operations_prio3 ( prio4 operations_prio4 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(131,20);
            pushFollow(FOLLOW_operations_prio3_in_operations_prio41359);
            operations_prio3174=operations_prio3();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio3174.getTree());
            dbg.location(131,37);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:131:37: ( prio4 operations_prio4 )?
            int alt89=2;
            try { dbg.enterSubRule(89);
            try { dbg.enterDecision(89);

            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=81 && LA89_0<=82)) ) {
                alt89=1;
            }
            } finally {dbg.exitDecision(89);}

            switch (alt89) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:131:38: prio4 operations_prio4
                    {
                    dbg.location(131,38);
                    pushFollow(FOLLOW_prio4_in_operations_prio41362);
                    prio4175=prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, prio4175.getTree());
                    dbg.location(131,44);
                    pushFollow(FOLLOW_operations_prio4_in_operations_prio41364);
                    operations_prio4176=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4176.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(89);}


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
        dbg.location(132, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio4");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio4"

    public static class operations_prio3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio3"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:134:1: operations_prio3 : operations_prio2 ( prio3 operations_prio3 )? ;
    public final Mini_Rust2Parser.operations_prio3_return operations_prio3() throws RecognitionException {
        Mini_Rust2Parser.operations_prio3_return retval = new Mini_Rust2Parser.operations_prio3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2177 = null;

        Mini_Rust2Parser.prio3_return prio3178 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3179 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:134:18: ( operations_prio2 ( prio3 operations_prio3 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:134:20: operations_prio2 ( prio3 operations_prio3 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(134,20);
            pushFollow(FOLLOW_operations_prio2_in_operations_prio31392);
            operations_prio2177=operations_prio2();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio2177.getTree());
            dbg.location(134,37);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:134:37: ( prio3 operations_prio3 )?
            int alt90=2;
            try { dbg.enterSubRule(90);
            try { dbg.enterDecision(90);

            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=53 && LA90_0<=54)||(LA90_0>=79 && LA90_0<=80)) ) {
                alt90=1;
            }
            } finally {dbg.exitDecision(90);}

            switch (alt90) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:134:38: prio3 operations_prio3
                    {
                    dbg.location(134,38);
                    pushFollow(FOLLOW_prio3_in_operations_prio31395);
                    prio3178=prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, prio3178.getTree());
                    dbg.location(134,44);
                    pushFollow(FOLLOW_operations_prio3_in_operations_prio31397);
                    operations_prio3179=operations_prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3179.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(90);}


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
        dbg.location(135, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio3"

    public static class operations_prio2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio2"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:137:1: operations_prio2 : operations_prio1 ( prio2 operations_prio2 )? ;
    public final Mini_Rust2Parser.operations_prio2_return operations_prio2() throws RecognitionException {
        Mini_Rust2Parser.operations_prio2_return retval = new Mini_Rust2Parser.operations_prio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1180 = null;

        Mini_Rust2Parser.prio2_return prio2181 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2182 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:137:18: ( operations_prio1 ( prio2 operations_prio2 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:137:20: operations_prio1 ( prio2 operations_prio2 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(137,20);
            pushFollow(FOLLOW_operations_prio1_in_operations_prio21425);
            operations_prio1180=operations_prio1();

            state._fsp--;

            adaptor.addChild(root_0, operations_prio1180.getTree());
            dbg.location(137,37);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:137:37: ( prio2 operations_prio2 )?
            int alt91=2;
            try { dbg.enterSubRule(91);
            try { dbg.enterDecision(91);

            int LA91_0 = input.LA(1);

            if ( (LA91_0==75||LA91_0==78) ) {
                alt91=1;
            }
            } finally {dbg.exitDecision(91);}

            switch (alt91) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:137:38: prio2 operations_prio2
                    {
                    dbg.location(137,38);
                    pushFollow(FOLLOW_prio2_in_operations_prio21428);
                    prio2181=prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, prio2181.getTree());
                    dbg.location(137,44);
                    pushFollow(FOLLOW_operations_prio2_in_operations_prio21430);
                    operations_prio2182=operations_prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2182.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(91);}


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
        dbg.location(138, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio2"

    public static class operations_prio1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio1"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:1: operations_prio1 : ( unaire )? operations_unaires ( prio1 operations_prio1 )? ;
    public final Mini_Rust2Parser.operations_prio1_return operations_prio1() throws RecognitionException {
        Mini_Rust2Parser.operations_prio1_return retval = new Mini_Rust2Parser.operations_prio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_return unaire183 = null;

        Mini_Rust2Parser.operations_unaires_return operations_unaires184 = null;

        Mini_Rust2Parser.prio1_return prio1185 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1186 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:18: ( ( unaire )? operations_unaires ( prio1 operations_prio1 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:20: ( unaire )? operations_unaires ( prio1 operations_prio1 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(140,20);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:20: ( unaire )?
            int alt92=2;
            try { dbg.enterSubRule(92);
            try { dbg.enterDecision(92);

            int LA92_0 = input.LA(1);

            if ( (LA92_0==55||LA92_0==67||(LA92_0>=75 && LA92_0<=76)) ) {
                alt92=1;
            }
            } finally {dbg.exitDecision(92);}

            switch (alt92) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:20: unaire
                    {
                    dbg.location(140,20);
                    pushFollow(FOLLOW_unaire_in_operations_prio11458);
                    unaire183=unaire();

                    state._fsp--;

                    adaptor.addChild(root_0, unaire183.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(92);}

            dbg.location(140,28);
            pushFollow(FOLLOW_operations_unaires_in_operations_prio11461);
            operations_unaires184=operations_unaires();

            state._fsp--;

            adaptor.addChild(root_0, operations_unaires184.getTree());
            dbg.location(140,47);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:47: ( prio1 operations_prio1 )?
            int alt93=2;
            try { dbg.enterSubRule(93);
            try { dbg.enterDecision(93);

            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=76 && LA93_0<=77)) ) {
                alt93=1;
            }
            } finally {dbg.exitDecision(93);}

            switch (alt93) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:140:48: prio1 operations_prio1
                    {
                    dbg.location(140,48);
                    pushFollow(FOLLOW_prio1_in_operations_prio11464);
                    prio1185=prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, prio1185.getTree());
                    dbg.location(140,54);
                    pushFollow(FOLLOW_operations_prio1_in_operations_prio11466);
                    operations_prio1186=operations_prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1186.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(93);}


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
        dbg.location(141, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio1"

    public static class operations_unaires_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_unaires"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:143:1: operations_unaires : ( '(' operations_prio4 ')' | variables );
    public final Mini_Rust2Parser.operations_unaires_return operations_unaires() throws RecognitionException {
        Mini_Rust2Parser.operations_unaires_return retval = new Mini_Rust2Parser.operations_unaires_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal187=null;
        Token char_literal189=null;
        Mini_Rust2Parser.operations_prio4_return operations_prio4188 = null;

        Mini_Rust2Parser.variables_return variables190 = null;


        CommonTree char_literal187_tree=null;
        CommonTree char_literal189_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operations_unaires");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:143:20: ( '(' operations_prio4 ')' | variables )
            int alt94=2;
            try { dbg.enterDecision(94);

            int LA94_0 = input.LA(1);

            if ( (LA94_0==49) ) {
                alt94=1;
            }
            else if ( ((LA94_0>=IDF && LA94_0<=CST_ENT)||(LA94_0>=71 && LA94_0<=72)) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(94);}

            switch (alt94) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:143:22: '(' operations_prio4 ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(143,22);
                    char_literal187=(Token)match(input,49,FOLLOW_49_in_operations_unaires1494); 
                    char_literal187_tree = (CommonTree)adaptor.create(char_literal187);
                    adaptor.addChild(root_0, char_literal187_tree);

                    dbg.location(143,26);
                    pushFollow(FOLLOW_operations_prio4_in_operations_unaires1496);
                    operations_prio4188=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4188.getTree());
                    dbg.location(143,43);
                    char_literal189=(Token)match(input,50,FOLLOW_50_in_operations_unaires1498); 
                    char_literal189_tree = (CommonTree)adaptor.create(char_literal189);
                    adaptor.addChild(root_0, char_literal189_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:144:22: variables
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(144,22);
                    pushFollow(FOLLOW_variables_in_operations_unaires1521);
                    variables190=variables();

                    state._fsp--;

                    adaptor.addChild(root_0, variables190.getTree());

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
        dbg.location(145, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_unaires");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_unaires"

    public static class variables_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variables"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:1: variables : ( IDF ( comm )? ( fonctions_ou_vecteurs )? | 'true' ( comm )? | 'false' ( comm )? | CST_ENT ( comm )? );
    public final Mini_Rust2Parser.variables_return variables() throws RecognitionException {
        Mini_Rust2Parser.variables_return retval = new Mini_Rust2Parser.variables_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF191=null;
        Token string_literal194=null;
        Token string_literal196=null;
        Token CST_ENT198=null;
        Mini_Rust2Parser.comm_return comm192 = null;

        Mini_Rust2Parser.fonctions_ou_vecteurs_return fonctions_ou_vecteurs193 = null;

        Mini_Rust2Parser.comm_return comm195 = null;

        Mini_Rust2Parser.comm_return comm197 = null;

        Mini_Rust2Parser.comm_return comm199 = null;


        CommonTree IDF191_tree=null;
        CommonTree string_literal194_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree CST_ENT198_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variables");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:11: ( IDF ( comm )? ( fonctions_ou_vecteurs )? | 'true' ( comm )? | 'false' ( comm )? | CST_ENT ( comm )? )
            int alt100=4;
            try { dbg.enterDecision(100);

            switch ( input.LA(1) ) {
            case IDF:
                {
                alt100=1;
                }
                break;
            case 71:
                {
                alt100=2;
                }
                break;
            case 72:
                {
                alt100=3;
                }
                break;
            case CST_ENT:
                {
                alt100=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(100);}

            switch (alt100) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:13: IDF ( comm )? ( fonctions_ou_vecteurs )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(147,13);
                    IDF191=(Token)match(input,IDF,FOLLOW_IDF_in_variables1549); 
                    IDF191_tree = (CommonTree)adaptor.create(IDF191);
                    adaptor.addChild(root_0, IDF191_tree);

                    dbg.location(147,17);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:17: ( comm )?
                    int alt95=2;
                    try { dbg.enterSubRule(95);
                    try { dbg.enterDecision(95);

                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==83) ) {
                        alt95=1;
                    }
                    } finally {dbg.exitDecision(95);}

                    switch (alt95) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:17: comm
                            {
                            dbg.location(147,17);
                            pushFollow(FOLLOW_comm_in_variables1551);
                            comm192=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm192.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(95);}

                    dbg.location(147,23);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:23: ( fonctions_ou_vecteurs )?
                    int alt96=2;
                    try { dbg.enterSubRule(96);
                    try { dbg.enterDecision(96);

                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==49||LA96_0==68||LA96_0==73) ) {
                        alt96=1;
                    }
                    } finally {dbg.exitDecision(96);}

                    switch (alt96) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:147:23: fonctions_ou_vecteurs
                            {
                            dbg.location(147,23);
                            pushFollow(FOLLOW_fonctions_ou_vecteurs_in_variables1554);
                            fonctions_ou_vecteurs193=fonctions_ou_vecteurs();

                            state._fsp--;

                            adaptor.addChild(root_0, fonctions_ou_vecteurs193.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(96);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:148:13: 'true' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(148,13);
                    string_literal194=(Token)match(input,71,FOLLOW_71_in_variables1569); 
                    string_literal194_tree = (CommonTree)adaptor.create(string_literal194);
                    adaptor.addChild(root_0, string_literal194_tree);

                    dbg.location(148,20);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:148:20: ( comm )?
                    int alt97=2;
                    try { dbg.enterSubRule(97);
                    try { dbg.enterDecision(97);

                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==83) ) {
                        alt97=1;
                    }
                    } finally {dbg.exitDecision(97);}

                    switch (alt97) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:148:20: comm
                            {
                            dbg.location(148,20);
                            pushFollow(FOLLOW_comm_in_variables1571);
                            comm195=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm195.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(97);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:149:13: 'false' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(149,13);
                    string_literal196=(Token)match(input,72,FOLLOW_72_in_variables1586); 
                    string_literal196_tree = (CommonTree)adaptor.create(string_literal196);
                    adaptor.addChild(root_0, string_literal196_tree);

                    dbg.location(149,21);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:149:21: ( comm )?
                    int alt98=2;
                    try { dbg.enterSubRule(98);
                    try { dbg.enterDecision(98);

                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==83) ) {
                        alt98=1;
                    }
                    } finally {dbg.exitDecision(98);}

                    switch (alt98) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:149:21: comm
                            {
                            dbg.location(149,21);
                            pushFollow(FOLLOW_comm_in_variables1588);
                            comm197=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm197.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(98);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:150:13: CST_ENT ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(150,13);
                    CST_ENT198=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_variables1603); 
                    CST_ENT198_tree = (CommonTree)adaptor.create(CST_ENT198);
                    adaptor.addChild(root_0, CST_ENT198_tree);

                    dbg.location(150,21);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:150:21: ( comm )?
                    int alt99=2;
                    try { dbg.enterSubRule(99);
                    try { dbg.enterDecision(99);

                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==83) ) {
                        alt99=1;
                    }
                    } finally {dbg.exitDecision(99);}

                    switch (alt99) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:150:21: comm
                            {
                            dbg.location(150,21);
                            pushFollow(FOLLOW_comm_in_variables1605);
                            comm199=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm199.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(99);}


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
        dbg.location(151, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variables");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variables"

    public static class expr_sans_idf_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_sans_idf"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:154:1: expr_sans_idf : ( operations_unairesb operations_prio5b | 'vec' ( comm )? '!' ( comm )? '[' ( comm )? ( expr ( ',' ( comm )? expr )* )? ']' ( comm )? | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? | bloc );
    public final Mini_Rust2Parser.expr_sans_idf_return expr_sans_idf() throws RecognitionException {
        Mini_Rust2Parser.expr_sans_idf_return retval = new Mini_Rust2Parser.expr_sans_idf_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal202=null;
        Token char_literal204=null;
        Token char_literal206=null;
        Token char_literal209=null;
        Token char_literal212=null;
        Token string_literal214=null;
        Token char_literal216=null;
        Token char_literal218=null;
        Token char_literal221=null;
        Mini_Rust2Parser.operations_unairesb_return operations_unairesb200 = null;

        Mini_Rust2Parser.operations_prio5b_return operations_prio5b201 = null;

        Mini_Rust2Parser.comm_return comm203 = null;

        Mini_Rust2Parser.comm_return comm205 = null;

        Mini_Rust2Parser.comm_return comm207 = null;

        Mini_Rust2Parser.expr_return expr208 = null;

        Mini_Rust2Parser.comm_return comm210 = null;

        Mini_Rust2Parser.expr_return expr211 = null;

        Mini_Rust2Parser.comm_return comm213 = null;

        Mini_Rust2Parser.comm_return comm215 = null;

        Mini_Rust2Parser.comm_return comm217 = null;

        Mini_Rust2Parser.comm_return comm219 = null;

        Mini_Rust2Parser.expr_return expr220 = null;

        Mini_Rust2Parser.comm_return comm222 = null;

        Mini_Rust2Parser.bloc_return bloc223 = null;


        CommonTree string_literal202_tree=null;
        CommonTree char_literal204_tree=null;
        CommonTree char_literal206_tree=null;
        CommonTree char_literal209_tree=null;
        CommonTree char_literal212_tree=null;
        CommonTree string_literal214_tree=null;
        CommonTree char_literal216_tree=null;
        CommonTree char_literal218_tree=null;
        CommonTree char_literal221_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr_sans_idf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:154:15: ( operations_unairesb operations_prio5b | 'vec' ( comm )? '!' ( comm )? '[' ( comm )? ( expr ( ',' ( comm )? expr )* )? ']' ( comm )? | 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )? | bloc )
            int alt112=4;
            try { dbg.enterDecision(112);

            switch ( input.LA(1) ) {
            case CST_ENT:
            case 49:
            case 71:
            case 72:
                {
                alt112=1;
                }
                break;
            case 66:
                {
                alt112=2;
                }
                break;
            case 70:
                {
                alt112=3;
                }
                break;
            case 44:
                {
                alt112=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(112);}

            switch (alt112) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:154:17: operations_unairesb operations_prio5b
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(154,17);
                    pushFollow(FOLLOW_operations_unairesb_in_expr_sans_idf1627);
                    operations_unairesb200=operations_unairesb();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_unairesb200.getTree());
                    dbg.location(154,37);
                    pushFollow(FOLLOW_operations_prio5b_in_expr_sans_idf1629);
                    operations_prio5b201=operations_prio5b();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio5b201.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:17: 'vec' ( comm )? '!' ( comm )? '[' ( comm )? ( expr ( ',' ( comm )? expr )* )? ']' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(155,17);
                    string_literal202=(Token)match(input,66,FOLLOW_66_in_expr_sans_idf1647); 
                    string_literal202_tree = (CommonTree)adaptor.create(string_literal202);
                    adaptor.addChild(root_0, string_literal202_tree);

                    dbg.location(155,23);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:23: ( comm )?
                    int alt101=2;
                    try { dbg.enterSubRule(101);
                    try { dbg.enterDecision(101);

                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==83) ) {
                        alt101=1;
                    }
                    } finally {dbg.exitDecision(101);}

                    switch (alt101) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:23: comm
                            {
                            dbg.location(155,23);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1649);
                            comm203=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm203.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(101);}

                    dbg.location(155,29);
                    char_literal204=(Token)match(input,67,FOLLOW_67_in_expr_sans_idf1652); 
                    char_literal204_tree = (CommonTree)adaptor.create(char_literal204);
                    adaptor.addChild(root_0, char_literal204_tree);

                    dbg.location(155,33);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:33: ( comm )?
                    int alt102=2;
                    try { dbg.enterSubRule(102);
                    try { dbg.enterDecision(102);

                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==83) ) {
                        alt102=1;
                    }
                    } finally {dbg.exitDecision(102);}

                    switch (alt102) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:33: comm
                            {
                            dbg.location(155,33);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1654);
                            comm205=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm205.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(102);}

                    dbg.location(155,39);
                    char_literal206=(Token)match(input,68,FOLLOW_68_in_expr_sans_idf1657); 
                    char_literal206_tree = (CommonTree)adaptor.create(char_literal206);
                    adaptor.addChild(root_0, char_literal206_tree);

                    dbg.location(155,43);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:43: ( comm )?
                    int alt103=2;
                    try { dbg.enterSubRule(103);
                    try { dbg.enterDecision(103);

                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==83) ) {
                        alt103=1;
                    }
                    } finally {dbg.exitDecision(103);}

                    switch (alt103) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:43: comm
                            {
                            dbg.location(155,43);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1659);
                            comm207=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm207.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(103);}

                    dbg.location(155,49);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:49: ( expr ( ',' ( comm )? expr )* )?
                    int alt106=2;
                    try { dbg.enterSubRule(106);
                    try { dbg.enterDecision(106);

                    int LA106_0 = input.LA(1);

                    if ( ((LA106_0>=IDF && LA106_0<=CST_ENT)||LA106_0==44||LA106_0==49||LA106_0==55||(LA106_0>=66 && LA106_0<=67)||(LA106_0>=70 && LA106_0<=72)||(LA106_0>=75 && LA106_0<=76)) ) {
                        alt106=1;
                    }
                    } finally {dbg.exitDecision(106);}

                    switch (alt106) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:51: expr ( ',' ( comm )? expr )*
                            {
                            dbg.location(155,51);
                            pushFollow(FOLLOW_expr_in_expr_sans_idf1664);
                            expr208=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr208.getTree());
                            dbg.location(155,56);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:56: ( ',' ( comm )? expr )*
                            try { dbg.enterSubRule(105);

                            loop105:
                            do {
                                int alt105=2;
                                try { dbg.enterDecision(105);

                                int LA105_0 = input.LA(1);

                                if ( (LA105_0==46) ) {
                                    alt105=1;
                                }


                                } finally {dbg.exitDecision(105);}

                                switch (alt105) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:57: ',' ( comm )? expr
                            	    {
                            	    dbg.location(155,57);
                            	    char_literal209=(Token)match(input,46,FOLLOW_46_in_expr_sans_idf1667); 
                            	    char_literal209_tree = (CommonTree)adaptor.create(char_literal209);
                            	    adaptor.addChild(root_0, char_literal209_tree);

                            	    dbg.location(155,61);
                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:61: ( comm )?
                            	    int alt104=2;
                            	    try { dbg.enterSubRule(104);
                            	    try { dbg.enterDecision(104);

                            	    int LA104_0 = input.LA(1);

                            	    if ( (LA104_0==83) ) {
                            	        alt104=1;
                            	    }
                            	    } finally {dbg.exitDecision(104);}

                            	    switch (alt104) {
                            	        case 1 :
                            	            dbg.enterAlt(1);

                            	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:61: comm
                            	            {
                            	            dbg.location(155,61);
                            	            pushFollow(FOLLOW_comm_in_expr_sans_idf1669);
                            	            comm210=comm();

                            	            state._fsp--;

                            	            adaptor.addChild(root_0, comm210.getTree());

                            	            }
                            	            break;

                            	    }
                            	    } finally {dbg.exitSubRule(104);}

                            	    dbg.location(155,67);
                            	    pushFollow(FOLLOW_expr_in_expr_sans_idf1672);
                            	    expr211=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr211.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop105;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(105);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(106);}

                    dbg.location(155,76);
                    char_literal212=(Token)match(input,69,FOLLOW_69_in_expr_sans_idf1678); 
                    char_literal212_tree = (CommonTree)adaptor.create(char_literal212);
                    adaptor.addChild(root_0, char_literal212_tree);

                    dbg.location(155,80);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:80: ( comm )?
                    int alt107=2;
                    try { dbg.enterSubRule(107);
                    try { dbg.enterDecision(107);

                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==83) ) {
                        alt107=1;
                    }
                    } finally {dbg.exitDecision(107);}

                    switch (alt107) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:155:80: comm
                            {
                            dbg.location(155,80);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1680);
                            comm213=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm213.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(107);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:17: 'print' ( comm )? '!' ( comm )? '(' ( comm )? expr ')' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(156,17);
                    string_literal214=(Token)match(input,70,FOLLOW_70_in_expr_sans_idf1699); 
                    string_literal214_tree = (CommonTree)adaptor.create(string_literal214);
                    adaptor.addChild(root_0, string_literal214_tree);

                    dbg.location(156,25);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:25: ( comm )?
                    int alt108=2;
                    try { dbg.enterSubRule(108);
                    try { dbg.enterDecision(108);

                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==83) ) {
                        alt108=1;
                    }
                    } finally {dbg.exitDecision(108);}

                    switch (alt108) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:25: comm
                            {
                            dbg.location(156,25);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1701);
                            comm215=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm215.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(108);}

                    dbg.location(156,31);
                    char_literal216=(Token)match(input,67,FOLLOW_67_in_expr_sans_idf1704); 
                    char_literal216_tree = (CommonTree)adaptor.create(char_literal216);
                    adaptor.addChild(root_0, char_literal216_tree);

                    dbg.location(156,35);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:35: ( comm )?
                    int alt109=2;
                    try { dbg.enterSubRule(109);
                    try { dbg.enterDecision(109);

                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==83) ) {
                        alt109=1;
                    }
                    } finally {dbg.exitDecision(109);}

                    switch (alt109) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:35: comm
                            {
                            dbg.location(156,35);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1706);
                            comm217=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm217.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(109);}

                    dbg.location(156,41);
                    char_literal218=(Token)match(input,49,FOLLOW_49_in_expr_sans_idf1709); 
                    char_literal218_tree = (CommonTree)adaptor.create(char_literal218);
                    adaptor.addChild(root_0, char_literal218_tree);

                    dbg.location(156,45);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:45: ( comm )?
                    int alt110=2;
                    try { dbg.enterSubRule(110);
                    try { dbg.enterDecision(110);

                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==83) ) {
                        alt110=1;
                    }
                    } finally {dbg.exitDecision(110);}

                    switch (alt110) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:45: comm
                            {
                            dbg.location(156,45);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1711);
                            comm219=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm219.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(110);}

                    dbg.location(156,51);
                    pushFollow(FOLLOW_expr_in_expr_sans_idf1714);
                    expr220=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr220.getTree());
                    dbg.location(156,56);
                    char_literal221=(Token)match(input,50,FOLLOW_50_in_expr_sans_idf1716); 
                    char_literal221_tree = (CommonTree)adaptor.create(char_literal221);
                    adaptor.addChild(root_0, char_literal221_tree);

                    dbg.location(156,60);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:60: ( comm )?
                    int alt111=2;
                    try { dbg.enterSubRule(111);
                    try { dbg.enterDecision(111);

                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==83) ) {
                        alt111=1;
                    }
                    } finally {dbg.exitDecision(111);}

                    switch (alt111) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:156:60: comm
                            {
                            dbg.location(156,60);
                            pushFollow(FOLLOW_comm_in_expr_sans_idf1718);
                            comm222=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm222.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(111);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:157:17: bloc
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(157,17);
                    pushFollow(FOLLOW_bloc_in_expr_sans_idf1737);
                    bloc223=bloc();

                    state._fsp--;

                    adaptor.addChild(root_0, bloc223.getTree());

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
        dbg.location(158, 15);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_sans_idf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr_sans_idf"

    public static class operations_prio5b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio5b"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:160:1: operations_prio5b : ( prio4 operations_prio4 )? ;
    public final Mini_Rust2Parser.operations_prio5b_return operations_prio5b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio5b_return retval = new Mini_Rust2Parser.operations_prio5b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.prio4_return prio4224 = null;

        Mini_Rust2Parser.operations_prio4_return operations_prio4225 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio5b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:160:19: ( ( prio4 operations_prio4 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:160:21: ( prio4 operations_prio4 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(160,21);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:160:21: ( prio4 operations_prio4 )?
            int alt113=2;
            try { dbg.enterSubRule(113);
            try { dbg.enterDecision(113);

            int LA113_0 = input.LA(1);

            if ( ((LA113_0>=81 && LA113_0<=82)) ) {
                alt113=1;
            }
            } finally {dbg.exitDecision(113);}

            switch (alt113) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:160:22: prio4 operations_prio4
                    {
                    dbg.location(160,22);
                    pushFollow(FOLLOW_prio4_in_operations_prio5b1761);
                    prio4224=prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, prio4224.getTree());
                    dbg.location(160,28);
                    pushFollow(FOLLOW_operations_prio4_in_operations_prio5b1763);
                    operations_prio4225=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4225.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(113);}


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
        dbg.location(161, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio5b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio5b"

    public static class operations_prio4b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio4b"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:163:1: operations_prio4b : ( prio3 operations_prio3 )? ;
    public final Mini_Rust2Parser.operations_prio4b_return operations_prio4b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio4b_return retval = new Mini_Rust2Parser.operations_prio4b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.prio3_return prio3226 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3227 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio4b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:163:19: ( ( prio3 operations_prio3 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:163:21: ( prio3 operations_prio3 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(163,21);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:163:21: ( prio3 operations_prio3 )?
            int alt114=2;
            try { dbg.enterSubRule(114);
            try { dbg.enterDecision(114);

            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=53 && LA114_0<=54)||(LA114_0>=79 && LA114_0<=80)) ) {
                alt114=1;
            }
            } finally {dbg.exitDecision(114);}

            switch (alt114) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:163:22: prio3 operations_prio3
                    {
                    dbg.location(163,22);
                    pushFollow(FOLLOW_prio3_in_operations_prio4b1793);
                    prio3226=prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, prio3226.getTree());
                    dbg.location(163,28);
                    pushFollow(FOLLOW_operations_prio3_in_operations_prio4b1795);
                    operations_prio3227=operations_prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3227.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(114);}


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
        dbg.location(164, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio4b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio4b"

    public static class operations_prio3b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio3b"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:166:1: operations_prio3b : ( prio3 operations_prio3 )? ;
    public final Mini_Rust2Parser.operations_prio3b_return operations_prio3b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio3b_return retval = new Mini_Rust2Parser.operations_prio3b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.prio3_return prio3228 = null;

        Mini_Rust2Parser.operations_prio3_return operations_prio3229 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio3b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:166:19: ( ( prio3 operations_prio3 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:166:21: ( prio3 operations_prio3 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(166,21);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:166:21: ( prio3 operations_prio3 )?
            int alt115=2;
            try { dbg.enterSubRule(115);
            try { dbg.enterDecision(115);

            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=53 && LA115_0<=54)||(LA115_0>=79 && LA115_0<=80)) ) {
                alt115=1;
            }
            } finally {dbg.exitDecision(115);}

            switch (alt115) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:166:22: prio3 operations_prio3
                    {
                    dbg.location(166,22);
                    pushFollow(FOLLOW_prio3_in_operations_prio3b1825);
                    prio3228=prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, prio3228.getTree());
                    dbg.location(166,28);
                    pushFollow(FOLLOW_operations_prio3_in_operations_prio3b1827);
                    operations_prio3229=operations_prio3();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio3229.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(115);}


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
        dbg.location(167, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio3b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio3b"

    public static class operations_prio2b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio2b"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:169:1: operations_prio2b : ( prio2 operations_prio2 )? ;
    public final Mini_Rust2Parser.operations_prio2b_return operations_prio2b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio2b_return retval = new Mini_Rust2Parser.operations_prio2b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.prio2_return prio2230 = null;

        Mini_Rust2Parser.operations_prio2_return operations_prio2231 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio2b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:169:19: ( ( prio2 operations_prio2 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:169:21: ( prio2 operations_prio2 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(169,21);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:169:21: ( prio2 operations_prio2 )?
            int alt116=2;
            try { dbg.enterSubRule(116);
            try { dbg.enterDecision(116);

            int LA116_0 = input.LA(1);

            if ( (LA116_0==75||LA116_0==78) ) {
                alt116=1;
            }
            } finally {dbg.exitDecision(116);}

            switch (alt116) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:169:22: prio2 operations_prio2
                    {
                    dbg.location(169,22);
                    pushFollow(FOLLOW_prio2_in_operations_prio2b1857);
                    prio2230=prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, prio2230.getTree());
                    dbg.location(169,28);
                    pushFollow(FOLLOW_operations_prio2_in_operations_prio2b1859);
                    operations_prio2231=operations_prio2();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio2231.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(116);}


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
        dbg.location(170, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio2b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio2b"

    public static class operations_prio1b_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_prio1b"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:1: operations_prio1b : ( unaire )? operations_unairesb ( prio1 operations_prio1 )? ;
    public final Mini_Rust2Parser.operations_prio1b_return operations_prio1b() throws RecognitionException {
        Mini_Rust2Parser.operations_prio1b_return retval = new Mini_Rust2Parser.operations_prio1b_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Mini_Rust2Parser.unaire_return unaire232 = null;

        Mini_Rust2Parser.operations_unairesb_return operations_unairesb233 = null;

        Mini_Rust2Parser.prio1_return prio1234 = null;

        Mini_Rust2Parser.operations_prio1_return operations_prio1235 = null;



        try { dbg.enterRule(getGrammarFileName(), "operations_prio1b");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:19: ( ( unaire )? operations_unairesb ( prio1 operations_prio1 )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:21: ( unaire )? operations_unairesb ( prio1 operations_prio1 )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(172,21);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:21: ( unaire )?
            int alt117=2;
            try { dbg.enterSubRule(117);
            try { dbg.enterDecision(117);

            int LA117_0 = input.LA(1);

            if ( (LA117_0==55||LA117_0==67||(LA117_0>=75 && LA117_0<=76)) ) {
                alt117=1;
            }
            } finally {dbg.exitDecision(117);}

            switch (alt117) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:21: unaire
                    {
                    dbg.location(172,21);
                    pushFollow(FOLLOW_unaire_in_operations_prio1b1888);
                    unaire232=unaire();

                    state._fsp--;

                    adaptor.addChild(root_0, unaire232.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(117);}

            dbg.location(172,29);
            pushFollow(FOLLOW_operations_unairesb_in_operations_prio1b1891);
            operations_unairesb233=operations_unairesb();

            state._fsp--;

            adaptor.addChild(root_0, operations_unairesb233.getTree());
            dbg.location(172,49);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:49: ( prio1 operations_prio1 )?
            int alt118=2;
            try { dbg.enterSubRule(118);
            try { dbg.enterDecision(118);

            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=76 && LA118_0<=77)) ) {
                alt118=1;
            }
            } finally {dbg.exitDecision(118);}

            switch (alt118) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:172:50: prio1 operations_prio1
                    {
                    dbg.location(172,50);
                    pushFollow(FOLLOW_prio1_in_operations_prio1b1894);
                    prio1234=prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, prio1234.getTree());
                    dbg.location(172,56);
                    pushFollow(FOLLOW_operations_prio1_in_operations_prio1b1896);
                    operations_prio1235=operations_prio1();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio1235.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(118);}


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
        dbg.location(173, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_prio1b");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_prio1b"

    public static class operations_unairesb_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operations_unairesb"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:175:1: operations_unairesb : ( '(' operations_prio4 ')' | variablesb );
    public final Mini_Rust2Parser.operations_unairesb_return operations_unairesb() throws RecognitionException {
        Mini_Rust2Parser.operations_unairesb_return retval = new Mini_Rust2Parser.operations_unairesb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal236=null;
        Token char_literal238=null;
        Mini_Rust2Parser.operations_prio4_return operations_prio4237 = null;

        Mini_Rust2Parser.variablesb_return variablesb239 = null;


        CommonTree char_literal236_tree=null;
        CommonTree char_literal238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "operations_unairesb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:175:21: ( '(' operations_prio4 ')' | variablesb )
            int alt119=2;
            try { dbg.enterDecision(119);

            int LA119_0 = input.LA(1);

            if ( (LA119_0==49) ) {
                alt119=1;
            }
            else if ( (LA119_0==CST_ENT||(LA119_0>=71 && LA119_0<=72)) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(119);}

            switch (alt119) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:175:23: '(' operations_prio4 ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(175,23);
                    char_literal236=(Token)match(input,49,FOLLOW_49_in_operations_unairesb1925); 
                    char_literal236_tree = (CommonTree)adaptor.create(char_literal236);
                    adaptor.addChild(root_0, char_literal236_tree);

                    dbg.location(175,27);
                    pushFollow(FOLLOW_operations_prio4_in_operations_unairesb1927);
                    operations_prio4237=operations_prio4();

                    state._fsp--;

                    adaptor.addChild(root_0, operations_prio4237.getTree());
                    dbg.location(175,44);
                    char_literal238=(Token)match(input,50,FOLLOW_50_in_operations_unairesb1929); 
                    char_literal238_tree = (CommonTree)adaptor.create(char_literal238);
                    adaptor.addChild(root_0, char_literal238_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:176:23: variablesb
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(176,23);
                    pushFollow(FOLLOW_variablesb_in_operations_unairesb1953);
                    variablesb239=variablesb();

                    state._fsp--;

                    adaptor.addChild(root_0, variablesb239.getTree());

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
        dbg.location(177, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operations_unairesb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "operations_unairesb"

    public static class variablesb_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variablesb"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:179:1: variablesb : ( 'true' ( comm )? | 'false' ( comm )? | CST_ENT ( comm )? );
    public final Mini_Rust2Parser.variablesb_return variablesb() throws RecognitionException {
        Mini_Rust2Parser.variablesb_return retval = new Mini_Rust2Parser.variablesb_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal240=null;
        Token string_literal242=null;
        Token CST_ENT244=null;
        Mini_Rust2Parser.comm_return comm241 = null;

        Mini_Rust2Parser.comm_return comm243 = null;

        Mini_Rust2Parser.comm_return comm245 = null;


        CommonTree string_literal240_tree=null;
        CommonTree string_literal242_tree=null;
        CommonTree CST_ENT244_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "variablesb");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:179:12: ( 'true' ( comm )? | 'false' ( comm )? | CST_ENT ( comm )? )
            int alt123=3;
            try { dbg.enterDecision(123);

            switch ( input.LA(1) ) {
            case 71:
                {
                alt123=1;
                }
                break;
            case 72:
                {
                alt123=2;
                }
                break;
            case CST_ENT:
                {
                alt123=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(123);}

            switch (alt123) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:179:14: 'true' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(179,14);
                    string_literal240=(Token)match(input,71,FOLLOW_71_in_variablesb1982); 
                    string_literal240_tree = (CommonTree)adaptor.create(string_literal240);
                    adaptor.addChild(root_0, string_literal240_tree);

                    dbg.location(179,21);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:179:21: ( comm )?
                    int alt120=2;
                    try { dbg.enterSubRule(120);
                    try { dbg.enterDecision(120);

                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==83) ) {
                        alt120=1;
                    }
                    } finally {dbg.exitDecision(120);}

                    switch (alt120) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:179:21: comm
                            {
                            dbg.location(179,21);
                            pushFollow(FOLLOW_comm_in_variablesb1984);
                            comm241=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm241.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(120);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:180:14: 'false' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(180,14);
                    string_literal242=(Token)match(input,72,FOLLOW_72_in_variablesb2001); 
                    string_literal242_tree = (CommonTree)adaptor.create(string_literal242);
                    adaptor.addChild(root_0, string_literal242_tree);

                    dbg.location(180,22);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:180:22: ( comm )?
                    int alt121=2;
                    try { dbg.enterSubRule(121);
                    try { dbg.enterDecision(121);

                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==83) ) {
                        alt121=1;
                    }
                    } finally {dbg.exitDecision(121);}

                    switch (alt121) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:180:22: comm
                            {
                            dbg.location(180,22);
                            pushFollow(FOLLOW_comm_in_variablesb2003);
                            comm243=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm243.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(121);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:181:14: CST_ENT ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(181,14);
                    CST_ENT244=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_variablesb2019); 
                    CST_ENT244_tree = (CommonTree)adaptor.create(CST_ENT244);
                    adaptor.addChild(root_0, CST_ENT244_tree);

                    dbg.location(181,22);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:181:22: ( comm )?
                    int alt122=2;
                    try { dbg.enterSubRule(122);
                    try { dbg.enterDecision(122);

                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==83) ) {
                        alt122=1;
                    }
                    } finally {dbg.exitDecision(122);}

                    switch (alt122) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:181:22: comm
                            {
                            dbg.location(181,22);
                            pushFollow(FOLLOW_comm_in_variablesb2021);
                            comm245=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm245.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(122);}


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
        dbg.location(182, 12);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variablesb");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variablesb"

    public static class fonctions_ou_vecteurs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fonctions_ou_vecteurs"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:1: fonctions_ou_vecteurs : ( '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )? | '[' ( comm )? expr ']' ( comm )? | '.' ( comm )? attribut_vecteur );
    public final Mini_Rust2Parser.fonctions_ou_vecteurs_return fonctions_ou_vecteurs() throws RecognitionException {
        Mini_Rust2Parser.fonctions_ou_vecteurs_return retval = new Mini_Rust2Parser.fonctions_ou_vecteurs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal246=null;
        Token char_literal249=null;
        Token char_literal252=null;
        Token char_literal254=null;
        Token char_literal257=null;
        Token char_literal259=null;
        Mini_Rust2Parser.comm_return comm247 = null;

        Mini_Rust2Parser.expr_return expr248 = null;

        Mini_Rust2Parser.comm_return comm250 = null;

        Mini_Rust2Parser.expr_return expr251 = null;

        Mini_Rust2Parser.comm_return comm253 = null;

        Mini_Rust2Parser.comm_return comm255 = null;

        Mini_Rust2Parser.expr_return expr256 = null;

        Mini_Rust2Parser.comm_return comm258 = null;

        Mini_Rust2Parser.comm_return comm260 = null;

        Mini_Rust2Parser.attribut_vecteur_return attribut_vecteur261 = null;


        CommonTree char_literal246_tree=null;
        CommonTree char_literal249_tree=null;
        CommonTree char_literal252_tree=null;
        CommonTree char_literal254_tree=null;
        CommonTree char_literal257_tree=null;
        CommonTree char_literal259_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fonctions_ou_vecteurs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:23: ( '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )? | '[' ( comm )? expr ']' ( comm )? | '.' ( comm )? attribut_vecteur )
            int alt132=3;
            try { dbg.enterDecision(132);

            switch ( input.LA(1) ) {
            case 49:
                {
                alt132=1;
                }
                break;
            case 68:
                {
                alt132=2;
                }
                break;
            case 73:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(132);}

            switch (alt132) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:25: '(' ( comm )? ( expr ( ',' ( comm )? expr )* )? ')' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(185,25);
                    char_literal246=(Token)match(input,49,FOLLOW_49_in_fonctions_ou_vecteurs2054); 
                    char_literal246_tree = (CommonTree)adaptor.create(char_literal246);
                    adaptor.addChild(root_0, char_literal246_tree);

                    dbg.location(185,29);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:29: ( comm )?
                    int alt124=2;
                    try { dbg.enterSubRule(124);
                    try { dbg.enterDecision(124);

                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==83) ) {
                        alt124=1;
                    }
                    } finally {dbg.exitDecision(124);}

                    switch (alt124) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:29: comm
                            {
                            dbg.location(185,29);
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2056);
                            comm247=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm247.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(124);}

                    dbg.location(185,35);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:35: ( expr ( ',' ( comm )? expr )* )?
                    int alt127=2;
                    try { dbg.enterSubRule(127);
                    try { dbg.enterDecision(127);

                    int LA127_0 = input.LA(1);

                    if ( ((LA127_0>=IDF && LA127_0<=CST_ENT)||LA127_0==44||LA127_0==49||LA127_0==55||(LA127_0>=66 && LA127_0<=67)||(LA127_0>=70 && LA127_0<=72)||(LA127_0>=75 && LA127_0<=76)) ) {
                        alt127=1;
                    }
                    } finally {dbg.exitDecision(127);}

                    switch (alt127) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:36: expr ( ',' ( comm )? expr )*
                            {
                            dbg.location(185,36);
                            pushFollow(FOLLOW_expr_in_fonctions_ou_vecteurs2060);
                            expr248=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr248.getTree());
                            dbg.location(185,41);
                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:41: ( ',' ( comm )? expr )*
                            try { dbg.enterSubRule(126);

                            loop126:
                            do {
                                int alt126=2;
                                try { dbg.enterDecision(126);

                                int LA126_0 = input.LA(1);

                                if ( (LA126_0==46) ) {
                                    alt126=1;
                                }


                                } finally {dbg.exitDecision(126);}

                                switch (alt126) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:43: ',' ( comm )? expr
                            	    {
                            	    dbg.location(185,43);
                            	    char_literal249=(Token)match(input,46,FOLLOW_46_in_fonctions_ou_vecteurs2064); 
                            	    char_literal249_tree = (CommonTree)adaptor.create(char_literal249);
                            	    adaptor.addChild(root_0, char_literal249_tree);

                            	    dbg.location(185,47);
                            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:47: ( comm )?
                            	    int alt125=2;
                            	    try { dbg.enterSubRule(125);
                            	    try { dbg.enterDecision(125);

                            	    int LA125_0 = input.LA(1);

                            	    if ( (LA125_0==83) ) {
                            	        alt125=1;
                            	    }
                            	    } finally {dbg.exitDecision(125);}

                            	    switch (alt125) {
                            	        case 1 :
                            	            dbg.enterAlt(1);

                            	            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:47: comm
                            	            {
                            	            dbg.location(185,47);
                            	            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2066);
                            	            comm250=comm();

                            	            state._fsp--;

                            	            adaptor.addChild(root_0, comm250.getTree());

                            	            }
                            	            break;

                            	    }
                            	    } finally {dbg.exitSubRule(125);}

                            	    dbg.location(185,53);
                            	    pushFollow(FOLLOW_expr_in_fonctions_ou_vecteurs2069);
                            	    expr251=expr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, expr251.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop126;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(126);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(127);}

                    dbg.location(185,62);
                    char_literal252=(Token)match(input,50,FOLLOW_50_in_fonctions_ou_vecteurs2075); 
                    char_literal252_tree = (CommonTree)adaptor.create(char_literal252);
                    adaptor.addChild(root_0, char_literal252_tree);

                    dbg.location(185,66);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:66: ( comm )?
                    int alt128=2;
                    try { dbg.enterSubRule(128);
                    try { dbg.enterDecision(128);

                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==83) ) {
                        alt128=1;
                    }
                    } finally {dbg.exitDecision(128);}

                    switch (alt128) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:185:66: comm
                            {
                            dbg.location(185,66);
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2077);
                            comm253=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm253.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(128);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:186:25: '[' ( comm )? expr ']' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(186,25);
                    char_literal254=(Token)match(input,68,FOLLOW_68_in_fonctions_ou_vecteurs2104); 
                    char_literal254_tree = (CommonTree)adaptor.create(char_literal254);
                    adaptor.addChild(root_0, char_literal254_tree);

                    dbg.location(186,29);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:186:29: ( comm )?
                    int alt129=2;
                    try { dbg.enterSubRule(129);
                    try { dbg.enterDecision(129);

                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==83) ) {
                        alt129=1;
                    }
                    } finally {dbg.exitDecision(129);}

                    switch (alt129) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:186:29: comm
                            {
                            dbg.location(186,29);
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2106);
                            comm255=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm255.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(129);}

                    dbg.location(186,35);
                    pushFollow(FOLLOW_expr_in_fonctions_ou_vecteurs2109);
                    expr256=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr256.getTree());
                    dbg.location(186,40);
                    char_literal257=(Token)match(input,69,FOLLOW_69_in_fonctions_ou_vecteurs2111); 
                    char_literal257_tree = (CommonTree)adaptor.create(char_literal257);
                    adaptor.addChild(root_0, char_literal257_tree);

                    dbg.location(186,44);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:186:44: ( comm )?
                    int alt130=2;
                    try { dbg.enterSubRule(130);
                    try { dbg.enterDecision(130);

                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==83) ) {
                        alt130=1;
                    }
                    } finally {dbg.exitDecision(130);}

                    switch (alt130) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:186:44: comm
                            {
                            dbg.location(186,44);
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2113);
                            comm258=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm258.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(130);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:187:25: '.' ( comm )? attribut_vecteur
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(187,25);
                    char_literal259=(Token)match(input,73,FOLLOW_73_in_fonctions_ou_vecteurs2140); 
                    char_literal259_tree = (CommonTree)adaptor.create(char_literal259);
                    adaptor.addChild(root_0, char_literal259_tree);

                    dbg.location(187,29);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:187:29: ( comm )?
                    int alt131=2;
                    try { dbg.enterSubRule(131);
                    try { dbg.enterDecision(131);

                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==83) ) {
                        alt131=1;
                    }
                    } finally {dbg.exitDecision(131);}

                    switch (alt131) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:187:29: comm
                            {
                            dbg.location(187,29);
                            pushFollow(FOLLOW_comm_in_fonctions_ou_vecteurs2142);
                            comm260=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm260.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(131);}

                    dbg.location(187,35);
                    pushFollow(FOLLOW_attribut_vecteur_in_fonctions_ou_vecteurs2145);
                    attribut_vecteur261=attribut_vecteur();

                    state._fsp--;

                    adaptor.addChild(root_0, attribut_vecteur261.getTree());

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
        dbg.location(188, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fonctions_ou_vecteurs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fonctions_ou_vecteurs"

    public static class attribut_vecteur_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribut_vecteur"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:1: attribut_vecteur : ( 'len' ( comm )? '(' ( comm )? ')' ( comm )? | variables );
    public final Mini_Rust2Parser.attribut_vecteur_return attribut_vecteur() throws RecognitionException {
        Mini_Rust2Parser.attribut_vecteur_return retval = new Mini_Rust2Parser.attribut_vecteur_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal262=null;
        Token char_literal264=null;
        Token char_literal266=null;
        Mini_Rust2Parser.comm_return comm263 = null;

        Mini_Rust2Parser.comm_return comm265 = null;

        Mini_Rust2Parser.comm_return comm267 = null;

        Mini_Rust2Parser.variables_return variables268 = null;


        CommonTree string_literal262_tree=null;
        CommonTree char_literal264_tree=null;
        CommonTree char_literal266_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "attribut_vecteur");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:18: ( 'len' ( comm )? '(' ( comm )? ')' ( comm )? | variables )
            int alt136=2;
            try { dbg.enterDecision(136);

            int LA136_0 = input.LA(1);

            if ( (LA136_0==74) ) {
                alt136=1;
            }
            else if ( ((LA136_0>=IDF && LA136_0<=CST_ENT)||(LA136_0>=71 && LA136_0<=72)) ) {
                alt136=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(136);}

            switch (alt136) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:20: 'len' ( comm )? '(' ( comm )? ')' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(190,20);
                    string_literal262=(Token)match(input,74,FOLLOW_74_in_attribut_vecteur2176); 
                    string_literal262_tree = (CommonTree)adaptor.create(string_literal262);
                    adaptor.addChild(root_0, string_literal262_tree);

                    dbg.location(190,26);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:26: ( comm )?
                    int alt133=2;
                    try { dbg.enterSubRule(133);
                    try { dbg.enterDecision(133);

                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==83) ) {
                        alt133=1;
                    }
                    } finally {dbg.exitDecision(133);}

                    switch (alt133) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:26: comm
                            {
                            dbg.location(190,26);
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2178);
                            comm263=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm263.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(133);}

                    dbg.location(190,32);
                    char_literal264=(Token)match(input,49,FOLLOW_49_in_attribut_vecteur2181); 
                    char_literal264_tree = (CommonTree)adaptor.create(char_literal264);
                    adaptor.addChild(root_0, char_literal264_tree);

                    dbg.location(190,36);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:36: ( comm )?
                    int alt134=2;
                    try { dbg.enterSubRule(134);
                    try { dbg.enterDecision(134);

                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==83) ) {
                        alt134=1;
                    }
                    } finally {dbg.exitDecision(134);}

                    switch (alt134) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:36: comm
                            {
                            dbg.location(190,36);
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2183);
                            comm265=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm265.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(134);}

                    dbg.location(190,42);
                    char_literal266=(Token)match(input,50,FOLLOW_50_in_attribut_vecteur2186); 
                    char_literal266_tree = (CommonTree)adaptor.create(char_literal266);
                    adaptor.addChild(root_0, char_literal266_tree);

                    dbg.location(190,46);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:46: ( comm )?
                    int alt135=2;
                    try { dbg.enterSubRule(135);
                    try { dbg.enterDecision(135);

                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==83) ) {
                        alt135=1;
                    }
                    } finally {dbg.exitDecision(135);}

                    switch (alt135) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:190:46: comm
                            {
                            dbg.location(190,46);
                            pushFollow(FOLLOW_comm_in_attribut_vecteur2188);
                            comm267=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm267.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(135);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:191:20: variables
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(191,20);
                    pushFollow(FOLLOW_variables_in_attribut_vecteur2210);
                    variables268=variables();

                    state._fsp--;

                    adaptor.addChild(root_0, variables268.getTree());

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
        dbg.location(192, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "attribut_vecteur");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "attribut_vecteur"

    public static class unaire_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaire"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:194:1: unaire : ( '!' ( comm )? | '-' ( comm )? | '*' ( comm )? | '&' ( comm )? );
    public final Mini_Rust2Parser.unaire_return unaire() throws RecognitionException {
        Mini_Rust2Parser.unaire_return retval = new Mini_Rust2Parser.unaire_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal269=null;
        Token char_literal271=null;
        Token char_literal273=null;
        Token char_literal275=null;
        Mini_Rust2Parser.comm_return comm270 = null;

        Mini_Rust2Parser.comm_return comm272 = null;

        Mini_Rust2Parser.comm_return comm274 = null;

        Mini_Rust2Parser.comm_return comm276 = null;


        CommonTree char_literal269_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree char_literal273_tree=null;
        CommonTree char_literal275_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unaire");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:194:8: ( '!' ( comm )? | '-' ( comm )? | '*' ( comm )? | '&' ( comm )? )
            int alt141=4;
            try { dbg.enterDecision(141);

            switch ( input.LA(1) ) {
            case 67:
                {
                alt141=1;
                }
                break;
            case 75:
                {
                alt141=2;
                }
                break;
            case 76:
                {
                alt141=3;
                }
                break;
            case 55:
                {
                alt141=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(141);}

            switch (alt141) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:194:10: '!' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(194,10);
                    char_literal269=(Token)match(input,67,FOLLOW_67_in_unaire2236); 
                    char_literal269_tree = (CommonTree)adaptor.create(char_literal269);
                    adaptor.addChild(root_0, char_literal269_tree);

                    dbg.location(194,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:194:14: ( comm )?
                    int alt137=2;
                    try { dbg.enterSubRule(137);
                    try { dbg.enterDecision(137);

                    int LA137_0 = input.LA(1);

                    if ( (LA137_0==83) ) {
                        alt137=1;
                    }
                    } finally {dbg.exitDecision(137);}

                    switch (alt137) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:194:14: comm
                            {
                            dbg.location(194,14);
                            pushFollow(FOLLOW_comm_in_unaire2238);
                            comm270=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm270.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(137);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:195:10: '-' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(195,10);
                    char_literal271=(Token)match(input,75,FOLLOW_75_in_unaire2250); 
                    char_literal271_tree = (CommonTree)adaptor.create(char_literal271);
                    adaptor.addChild(root_0, char_literal271_tree);

                    dbg.location(195,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:195:14: ( comm )?
                    int alt138=2;
                    try { dbg.enterSubRule(138);
                    try { dbg.enterDecision(138);

                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==83) ) {
                        alt138=1;
                    }
                    } finally {dbg.exitDecision(138);}

                    switch (alt138) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:195:14: comm
                            {
                            dbg.location(195,14);
                            pushFollow(FOLLOW_comm_in_unaire2252);
                            comm272=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm272.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(138);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:196:10: '*' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(196,10);
                    char_literal273=(Token)match(input,76,FOLLOW_76_in_unaire2264); 
                    char_literal273_tree = (CommonTree)adaptor.create(char_literal273);
                    adaptor.addChild(root_0, char_literal273_tree);

                    dbg.location(196,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:196:14: ( comm )?
                    int alt139=2;
                    try { dbg.enterSubRule(139);
                    try { dbg.enterDecision(139);

                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==83) ) {
                        alt139=1;
                    }
                    } finally {dbg.exitDecision(139);}

                    switch (alt139) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:196:14: comm
                            {
                            dbg.location(196,14);
                            pushFollow(FOLLOW_comm_in_unaire2266);
                            comm274=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm274.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(139);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:197:10: '&' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(197,10);
                    char_literal275=(Token)match(input,55,FOLLOW_55_in_unaire2278); 
                    char_literal275_tree = (CommonTree)adaptor.create(char_literal275);
                    adaptor.addChild(root_0, char_literal275_tree);

                    dbg.location(197,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:197:14: ( comm )?
                    int alt140=2;
                    try { dbg.enterSubRule(140);
                    try { dbg.enterDecision(140);

                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==83) ) {
                        alt140=1;
                    }
                    } finally {dbg.exitDecision(140);}

                    switch (alt140) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:197:14: comm
                            {
                            dbg.location(197,14);
                            pushFollow(FOLLOW_comm_in_unaire2280);
                            comm276=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm276.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(140);}


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
        dbg.location(198, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unaire");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unaire"

    public static class prio1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio1"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:200:1: prio1 : ( '*' ( comm )? | '/' ( comm )? );
    public final Mini_Rust2Parser.prio1_return prio1() throws RecognitionException {
        Mini_Rust2Parser.prio1_return retval = new Mini_Rust2Parser.prio1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal277=null;
        Token char_literal279=null;
        Mini_Rust2Parser.comm_return comm278 = null;

        Mini_Rust2Parser.comm_return comm280 = null;


        CommonTree char_literal277_tree=null;
        CommonTree char_literal279_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prio1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:200:7: ( '*' ( comm )? | '/' ( comm )? )
            int alt144=2;
            try { dbg.enterDecision(144);

            int LA144_0 = input.LA(1);

            if ( (LA144_0==76) ) {
                alt144=1;
            }
            else if ( (LA144_0==77) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(144);}

            switch (alt144) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:200:9: '*' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(200,9);
                    char_literal277=(Token)match(input,76,FOLLOW_76_in_prio12297); 
                    char_literal277_tree = (CommonTree)adaptor.create(char_literal277);
                    adaptor.addChild(root_0, char_literal277_tree);

                    dbg.location(200,13);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:200:13: ( comm )?
                    int alt142=2;
                    try { dbg.enterSubRule(142);
                    try { dbg.enterDecision(142);

                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==83) ) {
                        alt142=1;
                    }
                    } finally {dbg.exitDecision(142);}

                    switch (alt142) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:200:13: comm
                            {
                            dbg.location(200,13);
                            pushFollow(FOLLOW_comm_in_prio12299);
                            comm278=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm278.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(142);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:201:9: '/' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(201,9);
                    char_literal279=(Token)match(input,77,FOLLOW_77_in_prio12310); 
                    char_literal279_tree = (CommonTree)adaptor.create(char_literal279);
                    adaptor.addChild(root_0, char_literal279_tree);

                    dbg.location(201,13);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:201:13: ( comm )?
                    int alt143=2;
                    try { dbg.enterSubRule(143);
                    try { dbg.enterDecision(143);

                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==83) ) {
                        alt143=1;
                    }
                    } finally {dbg.exitDecision(143);}

                    switch (alt143) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:201:13: comm
                            {
                            dbg.location(201,13);
                            pushFollow(FOLLOW_comm_in_prio12312);
                            comm280=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm280.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(143);}


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
        dbg.location(202, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prio1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prio1"

    public static class prio2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio2"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:204:1: prio2 : ( '+' ( comm )? | '-' ( comm )? );
    public final Mini_Rust2Parser.prio2_return prio2() throws RecognitionException {
        Mini_Rust2Parser.prio2_return retval = new Mini_Rust2Parser.prio2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal281=null;
        Token char_literal283=null;
        Mini_Rust2Parser.comm_return comm282 = null;

        Mini_Rust2Parser.comm_return comm284 = null;


        CommonTree char_literal281_tree=null;
        CommonTree char_literal283_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prio2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(204, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:204:7: ( '+' ( comm )? | '-' ( comm )? )
            int alt147=2;
            try { dbg.enterDecision(147);

            int LA147_0 = input.LA(1);

            if ( (LA147_0==78) ) {
                alt147=1;
            }
            else if ( (LA147_0==75) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(147);}

            switch (alt147) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:204:9: '+' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(204,9);
                    char_literal281=(Token)match(input,78,FOLLOW_78_in_prio22335); 
                    char_literal281_tree = (CommonTree)adaptor.create(char_literal281);
                    adaptor.addChild(root_0, char_literal281_tree);

                    dbg.location(204,13);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:204:13: ( comm )?
                    int alt145=2;
                    try { dbg.enterSubRule(145);
                    try { dbg.enterDecision(145);

                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==83) ) {
                        alt145=1;
                    }
                    } finally {dbg.exitDecision(145);}

                    switch (alt145) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:204:13: comm
                            {
                            dbg.location(204,13);
                            pushFollow(FOLLOW_comm_in_prio22337);
                            comm282=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm282.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(145);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:205:9: '-' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(205,9);
                    char_literal283=(Token)match(input,75,FOLLOW_75_in_prio22348); 
                    char_literal283_tree = (CommonTree)adaptor.create(char_literal283);
                    adaptor.addChild(root_0, char_literal283_tree);

                    dbg.location(205,13);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:205:13: ( comm )?
                    int alt146=2;
                    try { dbg.enterSubRule(146);
                    try { dbg.enterDecision(146);

                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==83) ) {
                        alt146=1;
                    }
                    } finally {dbg.exitDecision(146);}

                    switch (alt146) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:205:13: comm
                            {
                            dbg.location(205,13);
                            pushFollow(FOLLOW_comm_in_prio22350);
                            comm284=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm284.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(146);}


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
        dbg.location(206, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prio2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prio2"

    public static class prio3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio3"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:1: prio3 : ( '<' ( '=' )? ( comm )? | '>' ( '=' )? ( comm )? | '==' ( comm )? | '!=' ( comm )? );
    public final Mini_Rust2Parser.prio3_return prio3() throws RecognitionException {
        Mini_Rust2Parser.prio3_return retval = new Mini_Rust2Parser.prio3_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal285=null;
        Token char_literal286=null;
        Token char_literal288=null;
        Token char_literal289=null;
        Token string_literal291=null;
        Token string_literal293=null;
        Mini_Rust2Parser.comm_return comm287 = null;

        Mini_Rust2Parser.comm_return comm290 = null;

        Mini_Rust2Parser.comm_return comm292 = null;

        Mini_Rust2Parser.comm_return comm294 = null;


        CommonTree char_literal285_tree=null;
        CommonTree char_literal286_tree=null;
        CommonTree char_literal288_tree=null;
        CommonTree char_literal289_tree=null;
        CommonTree string_literal291_tree=null;
        CommonTree string_literal293_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prio3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(208, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:7: ( '<' ( '=' )? ( comm )? | '>' ( '=' )? ( comm )? | '==' ( comm )? | '!=' ( comm )? )
            int alt154=4;
            try { dbg.enterDecision(154);

            switch ( input.LA(1) ) {
            case 53:
                {
                alt154=1;
                }
                break;
            case 54:
                {
                alt154=2;
                }
                break;
            case 79:
                {
                alt154=3;
                }
                break;
            case 80:
                {
                alt154=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(154);}

            switch (alt154) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:9: '<' ( '=' )? ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(208,9);
                    char_literal285=(Token)match(input,53,FOLLOW_53_in_prio32371); 
                    char_literal285_tree = (CommonTree)adaptor.create(char_literal285);
                    adaptor.addChild(root_0, char_literal285_tree);

                    dbg.location(208,13);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:13: ( '=' )?
                    int alt148=2;
                    try { dbg.enterSubRule(148);
                    try { dbg.enterDecision(148);

                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==63) ) {
                        alt148=1;
                    }
                    } finally {dbg.exitDecision(148);}

                    switch (alt148) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:13: '='
                            {
                            dbg.location(208,13);
                            char_literal286=(Token)match(input,63,FOLLOW_63_in_prio32373); 
                            char_literal286_tree = (CommonTree)adaptor.create(char_literal286);
                            adaptor.addChild(root_0, char_literal286_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(148);}

                    dbg.location(208,18);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:18: ( comm )?
                    int alt149=2;
                    try { dbg.enterSubRule(149);
                    try { dbg.enterDecision(149);

                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==83) ) {
                        alt149=1;
                    }
                    } finally {dbg.exitDecision(149);}

                    switch (alt149) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:208:18: comm
                            {
                            dbg.location(208,18);
                            pushFollow(FOLLOW_comm_in_prio32376);
                            comm287=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm287.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(149);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:209:9: '>' ( '=' )? ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(209,9);
                    char_literal288=(Token)match(input,54,FOLLOW_54_in_prio32387); 
                    char_literal288_tree = (CommonTree)adaptor.create(char_literal288);
                    adaptor.addChild(root_0, char_literal288_tree);

                    dbg.location(209,13);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:209:13: ( '=' )?
                    int alt150=2;
                    try { dbg.enterSubRule(150);
                    try { dbg.enterDecision(150);

                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==63) ) {
                        alt150=1;
                    }
                    } finally {dbg.exitDecision(150);}

                    switch (alt150) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:209:13: '='
                            {
                            dbg.location(209,13);
                            char_literal289=(Token)match(input,63,FOLLOW_63_in_prio32389); 
                            char_literal289_tree = (CommonTree)adaptor.create(char_literal289);
                            adaptor.addChild(root_0, char_literal289_tree);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(150);}

                    dbg.location(209,18);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:209:18: ( comm )?
                    int alt151=2;
                    try { dbg.enterSubRule(151);
                    try { dbg.enterDecision(151);

                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==83) ) {
                        alt151=1;
                    }
                    } finally {dbg.exitDecision(151);}

                    switch (alt151) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:209:18: comm
                            {
                            dbg.location(209,18);
                            pushFollow(FOLLOW_comm_in_prio32392);
                            comm290=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm290.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(151);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:210:9: '==' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(210,9);
                    string_literal291=(Token)match(input,79,FOLLOW_79_in_prio32403); 
                    string_literal291_tree = (CommonTree)adaptor.create(string_literal291);
                    adaptor.addChild(root_0, string_literal291_tree);

                    dbg.location(210,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:210:14: ( comm )?
                    int alt152=2;
                    try { dbg.enterSubRule(152);
                    try { dbg.enterDecision(152);

                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==83) ) {
                        alt152=1;
                    }
                    } finally {dbg.exitDecision(152);}

                    switch (alt152) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:210:14: comm
                            {
                            dbg.location(210,14);
                            pushFollow(FOLLOW_comm_in_prio32405);
                            comm292=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm292.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(152);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:211:9: '!=' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(211,9);
                    string_literal293=(Token)match(input,80,FOLLOW_80_in_prio32416); 
                    string_literal293_tree = (CommonTree)adaptor.create(string_literal293);
                    adaptor.addChild(root_0, string_literal293_tree);

                    dbg.location(211,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:211:14: ( comm )?
                    int alt153=2;
                    try { dbg.enterSubRule(153);
                    try { dbg.enterDecision(153);

                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==83) ) {
                        alt153=1;
                    }
                    } finally {dbg.exitDecision(153);}

                    switch (alt153) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:211:14: comm
                            {
                            dbg.location(211,14);
                            pushFollow(FOLLOW_comm_in_prio32418);
                            comm294=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm294.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(153);}


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
        dbg.location(212, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prio3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prio3"

    public static class prio4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio4"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:214:1: prio4 : ( '&&' ( comm )? | '||' ( comm )? );
    public final Mini_Rust2Parser.prio4_return prio4() throws RecognitionException {
        Mini_Rust2Parser.prio4_return retval = new Mini_Rust2Parser.prio4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal295=null;
        Token string_literal297=null;
        Mini_Rust2Parser.comm_return comm296 = null;

        Mini_Rust2Parser.comm_return comm298 = null;


        CommonTree string_literal295_tree=null;
        CommonTree string_literal297_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prio4");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:214:7: ( '&&' ( comm )? | '||' ( comm )? )
            int alt157=2;
            try { dbg.enterDecision(157);

            int LA157_0 = input.LA(1);

            if ( (LA157_0==81) ) {
                alt157=1;
            }
            else if ( (LA157_0==82) ) {
                alt157=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(157);}

            switch (alt157) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:214:9: '&&' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(214,9);
                    string_literal295=(Token)match(input,81,FOLLOW_81_in_prio42434); 
                    string_literal295_tree = (CommonTree)adaptor.create(string_literal295);
                    adaptor.addChild(root_0, string_literal295_tree);

                    dbg.location(214,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:214:14: ( comm )?
                    int alt155=2;
                    try { dbg.enterSubRule(155);
                    try { dbg.enterDecision(155);

                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==83) ) {
                        alt155=1;
                    }
                    } finally {dbg.exitDecision(155);}

                    switch (alt155) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:214:14: comm
                            {
                            dbg.location(214,14);
                            pushFollow(FOLLOW_comm_in_prio42436);
                            comm296=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm296.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(155);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:215:9: '||' ( comm )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(215,9);
                    string_literal297=(Token)match(input,82,FOLLOW_82_in_prio42447); 
                    string_literal297_tree = (CommonTree)adaptor.create(string_literal297);
                    adaptor.addChild(root_0, string_literal297_tree);

                    dbg.location(215,14);
                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:215:14: ( comm )?
                    int alt156=2;
                    try { dbg.enterSubRule(156);
                    try { dbg.enterDecision(156);

                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==83) ) {
                        alt156=1;
                    }
                    } finally {dbg.exitDecision(156);}

                    switch (alt156) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:215:14: comm
                            {
                            dbg.location(215,14);
                            pushFollow(FOLLOW_comm_in_prio42449);
                            comm298=comm();

                            state._fsp--;

                            adaptor.addChild(root_0, comm298.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(156);}


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
        dbg.location(216, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prio4");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prio4"

    public static class prio5_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prio5"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:218:1: prio5 : '=' ( comm )? ;
    public final Mini_Rust2Parser.prio5_return prio5() throws RecognitionException {
        Mini_Rust2Parser.prio5_return retval = new Mini_Rust2Parser.prio5_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal299=null;
        Mini_Rust2Parser.comm_return comm300 = null;


        CommonTree char_literal299_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prio5");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(218, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:218:7: ( '=' ( comm )? )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:218:9: '=' ( comm )?
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(218,9);
            char_literal299=(Token)match(input,63,FOLLOW_63_in_prio52465); 
            char_literal299_tree = (CommonTree)adaptor.create(char_literal299);
            adaptor.addChild(root_0, char_literal299_tree);

            dbg.location(218,13);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:218:13: ( comm )?
            int alt158=2;
            try { dbg.enterSubRule(158);
            try { dbg.enterDecision(158);

            int LA158_0 = input.LA(1);

            if ( (LA158_0==83) ) {
                alt158=1;
            }
            } finally {dbg.exitDecision(158);}

            switch (alt158) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:218:13: comm
                    {
                    dbg.location(218,13);
                    pushFollow(FOLLOW_comm_in_prio52467);
                    comm300=comm();

                    state._fsp--;

                    adaptor.addChild(root_0, comm300.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(158);}


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
        dbg.location(219, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prio5");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prio5"

    public static class comm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comm"
    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:1: comm : '/*' ( ( IDF | CST_ENT | '/' ) | ( ( '*' )+ ( IDF | CST_ENT ) ) )* '*/' ;
    public final Mini_Rust2Parser.comm_return comm() throws RecognitionException {
        Mini_Rust2Parser.comm_return retval = new Mini_Rust2Parser.comm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal301=null;
        Token set302=null;
        Token char_literal303=null;
        Token set304=null;
        Token string_literal305=null;

        CommonTree string_literal301_tree=null;
        CommonTree set302_tree=null;
        CommonTree char_literal303_tree=null;
        CommonTree set304_tree=null;
        CommonTree string_literal305_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "comm");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(222, 1);

        try {
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:6: ( '/*' ( ( IDF | CST_ENT | '/' ) | ( ( '*' )+ ( IDF | CST_ENT ) ) )* '*/' )
            dbg.enterAlt(1);

            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:8: '/*' ( ( IDF | CST_ENT | '/' ) | ( ( '*' )+ ( IDF | CST_ENT ) ) )* '*/'
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(222,8);
            string_literal301=(Token)match(input,83,FOLLOW_83_in_comm2484); 
            string_literal301_tree = (CommonTree)adaptor.create(string_literal301);
            adaptor.addChild(root_0, string_literal301_tree);

            dbg.location(222,13);
            // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:13: ( ( IDF | CST_ENT | '/' ) | ( ( '*' )+ ( IDF | CST_ENT ) ) )*
            try { dbg.enterSubRule(160);

            loop160:
            do {
                int alt160=3;
                try { dbg.enterDecision(160);

                int LA160_0 = input.LA(1);

                if ( ((LA160_0>=IDF && LA160_0<=CST_ENT)||LA160_0==77) ) {
                    alt160=1;
                }
                else if ( (LA160_0==76) ) {
                    alt160=2;
                }


                } finally {dbg.exitDecision(160);}

                switch (alt160) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:15: ( IDF | CST_ENT | '/' )
            	    {
            	    dbg.location(222,15);
            	    set302=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IDF && input.LA(1)<=CST_ENT)||input.LA(1)==77 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set302));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:37: ( ( '*' )+ ( IDF | CST_ENT ) )
            	    {
            	    dbg.location(222,37);
            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:37: ( ( '*' )+ ( IDF | CST_ENT ) )
            	    dbg.enterAlt(1);

            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:38: ( '*' )+ ( IDF | CST_ENT )
            	    {
            	    dbg.location(222,38);
            	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:38: ( '*' )+
            	    int cnt159=0;
            	    try { dbg.enterSubRule(159);

            	    loop159:
            	    do {
            	        int alt159=2;
            	        try { dbg.enterDecision(159);

            	        int LA159_0 = input.LA(1);

            	        if ( (LA159_0==76) ) {
            	            alt159=1;
            	        }


            	        } finally {dbg.exitDecision(159);}

            	        switch (alt159) {
            	    	case 1 :
            	    	    dbg.enterAlt(1);

            	    	    // /home/antars/Documents/Telecom/Compil/Mini_Rust2.g:222:38: '*'
            	    	    {
            	    	    dbg.location(222,38);
            	    	    char_literal303=(Token)match(input,76,FOLLOW_76_in_comm2501); 
            	    	    char_literal303_tree = (CommonTree)adaptor.create(char_literal303);
            	    	    adaptor.addChild(root_0, char_literal303_tree);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt159 >= 1 ) break loop159;
            	                EarlyExitException eee =
            	                    new EarlyExitException(159, input);
            	                dbg.recognitionException(eee);

            	                throw eee;
            	        }
            	        cnt159++;
            	    } while (true);
            	    } finally {dbg.exitSubRule(159);}

            	    dbg.location(222,43);
            	    set304=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IDF && input.LA(1)<=CST_ENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set304));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop160;
                }
            } while (true);
            } finally {dbg.exitSubRule(160);}

            dbg.location(222,61);
            string_literal305=(Token)match(input,84,FOLLOW_84_in_comm2514); 
            string_literal305_tree = (CommonTree)adaptor.create(string_literal305);
            adaptor.addChild(root_0, string_literal305_tree);


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
        dbg.location(223, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comm");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "comm"

    // Delegated rules


 

    public static final BitSet FOLLOW_comm_in_prog304 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_fichier_in_prog307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_fichier325 = new BitSet(new long[]{0x0001080000000002L});
    public static final BitSet FOLLOW_decl_struct_in_decl343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_fun_in_decl352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_decl_struct366 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct368 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct371 = new BitSet(new long[]{0x0000100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct373 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_decl_struct376 = new BitSet(new long[]{0x0000810000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct378 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct382 = new BitSet(new long[]{0x0000200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct384 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decl_struct387 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct389 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_decl_struct392 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_decl_struct395 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct397 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_struct400 = new BitSet(new long[]{0x0000200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct402 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_decl_struct405 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct407 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_decl_struct410 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_decl_struct417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_struct419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_decl_fun441 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_fun443 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDF_in_decl_fun446 = new BitSet(new long[]{0x0002000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_fun448 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_decl_fun451 = new BitSet(new long[]{0x0004010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_fun453 = new BitSet(new long[]{0x0004010000000000L});
    public static final BitSet FOLLOW_argument_in_decl_fun457 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_decl_fun460 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_fun462 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_argument_in_decl_fun465 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_decl_fun471 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_fun473 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_51_in_decl_fun477 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_decl_fun479 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_decl_fun482 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_bloc_in_decl_fun486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_type524 = new BitSet(new long[]{0x0020000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type526 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_type529 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type531 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_type534 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_type536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_type548 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type550 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_type553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_type562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_type574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_type586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_type588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_argument603 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_argument605 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_argument607 = new BitSet(new long[]{0x0390010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_type_in_argument610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_bloc635 = new BitSet(new long[]{0x3C8A930000000000L,0x00000000000819CDL});
    public static final BitSet FOLLOW_comm_in_bloc637 = new BitSet(new long[]{0x3C8A930000000000L,0x00000000000819CDL});
    public static final BitSet FOLLOW_sous_bloc_in_bloc640 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_bloc642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_bloc644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_sans_expr_in_sous_bloc667 = new BitSet(new long[]{0x3C8A130000000000L,0x00000000000819CDL});
    public static final BitSet FOLLOW_sous_bloc_in_sous_bloc669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sous_bloc673 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_sous_bloc676 = new BitSet(new long[]{0x3C8A130000000000L,0x00000000000819CDL});
    public static final BitSet FOLLOW_comm_in_sous_bloc678 = new BitSet(new long[]{0x3C8A130000000000L,0x00000000000819CDL});
    public static final BitSet FOLLOW_sous_bloc_in_sous_bloc681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_instruction_sans_expr707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_instruction_sans_expr709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_instruction_sans_expr736 = new BitSet(new long[]{0x4000010000000000L});
    public static final BitSet FOLLOW_let2_in_instruction_sans_expr738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_instruction_sans_expr768 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_instruction_sans_expr770 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_instruction_sans_expr773 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_bloc_in_instruction_sans_expr775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_instruction_sans_expr816 = new BitSet(new long[]{0x048A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_instruction_sans_expr818 = new BitSet(new long[]{0x048A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_instruction_sans_expr821 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction_sans_expr824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_instruction_sans_expr826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_instruction_sans_expr853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_let2883 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_let2885 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDF_in_let2888 = new BitSet(new long[]{0x8000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_let2890 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_let2893 = new BitSet(new long[]{0x000A130000000000L,0x00000000000801C4L});
    public static final BitSet FOLLOW_comm_in_let2895 = new BitSet(new long[]{0x000A130000000000L,0x00000000000801C4L});
    public static final BitSet FOLLOW_b_in_let2898 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_let2900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_let2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_let2923 = new BitSet(new long[]{0x8000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_let2925 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_let2928 = new BitSet(new long[]{0x000A130000000000L,0x00000000000801C4L});
    public static final BitSet FOLLOW_comm_in_let2930 = new BitSet(new long[]{0x000A130000000000L,0x00000000000801C4L});
    public static final BitSet FOLLOW_b_in_let2933 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_let2935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_let2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_instruction963 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instruction965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_instruction967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_sans_expr_in_instruction984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_b1007 = new BitSet(new long[]{0x8062100000000000L,0x00000000000FFA10L});
    public static final BitSet FOLLOW_comm_in_b1009 = new BitSet(new long[]{0x8062100000000000L,0x00000000000FFA10L});
    public static final BitSet FOLLOW_b2_in_b1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_sans_idf_in_b1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_b21050 = new BitSet(new long[]{0x0000810000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_b21052 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_IDF_in_b21056 = new BitSet(new long[]{0x0000200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_b21058 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_b21061 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_b21063 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_b21066 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_b21069 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_b21071 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IDF_in_b21074 = new BitSet(new long[]{0x0000200000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_b21076 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_b21079 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_b21081 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_b21084 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_b21090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_b21092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_suivante_in_b21101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fonctions_ou_vecteurs_in_operation_suivante1115 = new BitSet(new long[]{0x8060000000000002L,0x000000000007F800L});
    public static final BitSet FOLLOW_prio1_in_operation_suivante1120 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio1_in_operation_suivante1122 = new BitSet(new long[]{0x8060000000000002L,0x000000000007C800L});
    public static final BitSet FOLLOW_prio2_in_operation_suivante1127 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio2_in_operation_suivante1129 = new BitSet(new long[]{0x8060000000000002L,0x0000000000078000L});
    public static final BitSet FOLLOW_prio3_in_operation_suivante1134 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio3_in_operation_suivante1136 = new BitSet(new long[]{0x8000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_prio4_in_operation_suivante1141 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio4_in_operation_suivante1143 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_prio5_in_operation_suivante1148 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio5_in_operation_suivante1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_if_expr1180 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_if_expr1182 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_if_expr1185 = new BitSet(new long[]{0x0008100000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_bloc_in_if_expr1187 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_if_expr1190 = new BitSet(new long[]{0x3C08100000000000L,0x0000000000080001L});
    public static final BitSet FOLLOW_comm_in_if_expr1192 = new BitSet(new long[]{0x3C08100000000000L,0x0000000000080001L});
    public static final BitSet FOLLOW_bloc_in_if_expr1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_if_expr1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio5_in_expr1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_expr1229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080008L});
    public static final BitSet FOLLOW_comm_in_expr1231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080010L});
    public static final BitSet FOLLOW_comm_in_expr1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expr1239 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819ECL});
    public static final BitSet FOLLOW_comm_in_expr1241 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819ECL});
    public static final BitSet FOLLOW_expr_in_expr1246 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_expr1249 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_expr1251 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_expr1254 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_expr1260 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_expr1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_expr1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080008L});
    public static final BitSet FOLLOW_comm_in_expr1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr1277 = new BitSet(new long[]{0x0002000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_expr1279 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expr1282 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_expr1284 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_expr1287 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_expr1289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_expr1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_expr1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_prio51326 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_prio5_in_operations_prio51329 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_prio51331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio41359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_prio4_in_operations_prio41362 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_prio41364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio31392 = new BitSet(new long[]{0x0060000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_prio3_in_operations_prio31395 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio31397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio21425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004800L});
    public static final BitSet FOLLOW_prio2_in_operations_prio21428 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio21430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_in_operations_prio11458 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_unaires_in_operations_prio11461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_prio1_in_operations_prio11464 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_operations_unaires1494 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_unaires1496 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_operations_unaires1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_operations_unaires1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_variables1549 = new BitSet(new long[]{0x0002000000000002L,0x0000000000080210L});
    public static final BitSet FOLLOW_comm_in_variables1551 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000210L});
    public static final BitSet FOLLOW_fonctions_ou_vecteurs_in_variables1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_variables1569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_variables1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_variables1586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_variables1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_variables1603 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_variables1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operations_unairesb_in_expr_sans_idf1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_operations_prio5b_in_expr_sans_idf1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_expr_sans_idf1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080008L});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr_sans_idf1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080010L});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expr_sans_idf1657 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819ECL});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1659 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819ECL});
    public static final BitSet FOLLOW_expr_in_expr_sans_idf1664 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_46_in_expr_sans_idf1667 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1669 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_expr_sans_idf1672 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_expr_sans_idf1678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_expr_sans_idf1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080008L});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expr_sans_idf1704 = new BitSet(new long[]{0x0002000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1706 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expr_sans_idf1709 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1711 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_expr_sans_idf1714 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_expr_sans_idf1716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_expr_sans_idf1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_expr_sans_idf1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prio4_in_operations_prio5b1761 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_prio5b1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prio3_in_operations_prio4b1793 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio4b1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prio3_in_operations_prio3b1825 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio3_in_operations_prio3b1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prio2_in_operations_prio2b1857 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio2_in_operations_prio2b1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaire_in_operations_prio1b1888 = new BitSet(new long[]{0x0002020000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_operations_unairesb_in_operations_prio1b1891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});
    public static final BitSet FOLLOW_prio1_in_operations_prio1b1894 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio1_in_operations_prio1b1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_operations_unairesb1925 = new BitSet(new long[]{0x0082030000000000L,0x0000000000001988L});
    public static final BitSet FOLLOW_operations_prio4_in_operations_unairesb1927 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_operations_unairesb1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variablesb_in_operations_unairesb1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_variablesb1982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_variablesb1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_variablesb2001 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_variablesb2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_variablesb2019 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_variablesb2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_fonctions_ou_vecteurs2054 = new BitSet(new long[]{0x008E130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2056 = new BitSet(new long[]{0x008E130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_fonctions_ou_vecteurs2060 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_fonctions_ou_vecteurs2064 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2066 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_fonctions_ou_vecteurs2069 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_fonctions_ou_vecteurs2075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_fonctions_ou_vecteurs2104 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2106 = new BitSet(new long[]{0x008A130000000000L,0x00000000000819CCL});
    public static final BitSet FOLLOW_expr_in_fonctions_ou_vecteurs2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_fonctions_ou_vecteurs2111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_fonctions_ou_vecteurs2140 = new BitSet(new long[]{0x0082030000000000L,0x0000000000081D88L});
    public static final BitSet FOLLOW_comm_in_fonctions_ou_vecteurs2142 = new BitSet(new long[]{0x0082030000000000L,0x0000000000081D88L});
    public static final BitSet FOLLOW_attribut_vecteur_in_fonctions_ou_vecteurs2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_attribut_vecteur2176 = new BitSet(new long[]{0x0002000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2178 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_attribut_vecteur2181 = new BitSet(new long[]{0x0004000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2183 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_attribut_vecteur2186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_attribut_vecteur2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variables_in_attribut_vecteur2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_unaire2236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_unaire2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_unaire2250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_unaire2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_unaire2264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_unaire2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unaire2278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_unaire2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_prio12297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_prio12310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_prio22335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio22337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_prio22348 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio22350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_prio32371 = new BitSet(new long[]{0x8000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_63_in_prio32373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio32376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_prio32387 = new BitSet(new long[]{0x8000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_63_in_prio32389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio32392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_prio32403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio32405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_prio32416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio32418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_prio42434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio42436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_prio42447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio42449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_prio52465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_comm_in_prio52467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_comm2484 = new BitSet(new long[]{0x0000030000000000L,0x0000000000103000L});
    public static final BitSet FOLLOW_set_in_comm2488 = new BitSet(new long[]{0x0000030000000000L,0x0000000000103000L});
    public static final BitSet FOLLOW_76_in_comm2501 = new BitSet(new long[]{0x0000030000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_set_in_comm2504 = new BitSet(new long[]{0x0000030000000000L,0x0000000000103000L});
    public static final BitSet FOLLOW_84_in_comm2514 = new BitSet(new long[]{0x0000000000000002L});

}