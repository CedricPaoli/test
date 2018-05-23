// $ANTLR 3.3 Nov 30, 2010 12:50:56 Mini_Rust2.g 2018-05-17 13:30:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Mini_Rust2Lexer extends Lexer {
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

    public Mini_Rust2Lexer() {;} 
    public Mini_Rust2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Mini_Rust2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Mini_Rust2.g"; }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:3:7: ( 'struct' )
            // Mini_Rust2.g:3:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:4:7: ( '{' )
            // Mini_Rust2.g:4:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:5:7: ( ',' )
            // Mini_Rust2.g:5:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:6:7: ( '}' )
            // Mini_Rust2.g:6:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:7:7: ( ':' )
            // Mini_Rust2.g:7:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:8:7: ( 'fn' )
            // Mini_Rust2.g:8:9: 'fn'
            {
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:9:7: ( '(' )
            // Mini_Rust2.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:10:7: ( ')' )
            // Mini_Rust2.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:11:7: ( '->' )
            // Mini_Rust2.g:11:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:12:7: ( 'Vec' )
            // Mini_Rust2.g:12:9: 'Vec'
            {
            match("Vec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:13:7: ( '<' )
            // Mini_Rust2.g:13:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:14:7: ( '>' )
            // Mini_Rust2.g:14:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:15:7: ( '&' )
            // Mini_Rust2.g:15:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:16:7: ( 'i32' )
            // Mini_Rust2.g:16:9: 'i32'
            {
            match("i32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:17:7: ( 'bool' )
            // Mini_Rust2.g:17:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:18:7: ( ';' )
            // Mini_Rust2.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:19:7: ( 'let' )
            // Mini_Rust2.g:19:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:20:7: ( 'return' )
            // Mini_Rust2.g:20:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:21:7: ( 'print' )
            // Mini_Rust2.g:21:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:22:7: ( '!' )
            // Mini_Rust2.g:22:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:23:7: ( '=' )
            // Mini_Rust2.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:24:7: ( 'while' )
            // Mini_Rust2.g:24:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:25:7: ( 'mut' )
            // Mini_Rust2.g:25:9: 'mut'
            {
            match("mut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:26:7: ( 'if' )
            // Mini_Rust2.g:26:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:27:7: ( 'else' )
            // Mini_Rust2.g:27:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:28:7: ( '[' )
            // Mini_Rust2.g:28:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:29:7: ( ']' )
            // Mini_Rust2.g:29:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:30:7: ( '.' )
            // Mini_Rust2.g:30:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:31:7: ( 'true' )
            // Mini_Rust2.g:31:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:32:7: ( 'false' )
            // Mini_Rust2.g:32:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:33:7: ( '*' )
            // Mini_Rust2.g:33:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:34:7: ( 'len' )
            // Mini_Rust2.g:34:9: 'len'
            {
            match("len"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:35:7: ( '-' )
            // Mini_Rust2.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:36:7: ( '/' )
            // Mini_Rust2.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:37:7: ( '+' )
            // Mini_Rust2.g:37:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:38:7: ( '>=' )
            // Mini_Rust2.g:38:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:39:7: ( '<=' )
            // Mini_Rust2.g:39:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:40:7: ( '==' )
            // Mini_Rust2.g:40:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:41:7: ( '!=' )
            // Mini_Rust2.g:41:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:42:7: ( '&&' )
            // Mini_Rust2.g:42:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:43:7: ( '||' )
            // Mini_Rust2.g:43:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:44:7: ( '/*' )
            // Mini_Rust2.g:44:9: '/*'
            {
            match("/*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:45:7: ( '*/' )
            // Mini_Rust2.g:45:9: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:245:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Mini_Rust2.g:245:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Mini_Rust2.g:245:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Mini_Rust2.g:
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
    // $ANTLR end "IDF"

    // $ANTLR start "CST_ENT"
    public final void mCST_ENT() throws RecognitionException {
        try {
            int _type = CST_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:246:9: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // Mini_Rust2.g:246:11: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // Mini_Rust2.g:246:11: ( '0' .. '9' )+
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
            	    // Mini_Rust2.g:246:12: '0' .. '9'
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

            // Mini_Rust2.g:246:22: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Mini_Rust2.g:246:23: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // Mini_Rust2.g:246:26: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Mini_Rust2.g:246:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CST_ENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Mini_Rust2.g:247:5: ( ( ' ' | '\\n' | '\\t' | '\\r' | '//' ( . )* '\\n' )+ )
            // Mini_Rust2.g:247:9: ( ' ' | '\\n' | '\\t' | '\\r' | '//' ( . )* '\\n' )+
            {
            // Mini_Rust2.g:247:9: ( ' ' | '\\n' | '\\t' | '\\r' | '//' ( . )* '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=6;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt6=1;
                    }
                    break;
                case '\n':
                    {
                    alt6=2;
                    }
                    break;
                case '\t':
                    {
                    alt6=3;
                    }
                    break;
                case '\r':
                    {
                    alt6=4;
                    }
                    break;
                case '/':
                    {
                    alt6=5;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // Mini_Rust2.g:247:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // Mini_Rust2.g:247:14: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 3 :
            	    // Mini_Rust2.g:247:19: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 4 :
            	    // Mini_Rust2.g:247:24: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 5 :
            	    // Mini_Rust2.g:247:30: '//' ( . )* '\\n'
            	    {
            	    match("//"); 

            	    // Mini_Rust2.g:247:35: ( . )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0=='\n') ) {
            	            alt5=2;
            	        }
            	        else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\uFFFF')) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // Mini_Rust2.g:247:35: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    match('\n'); 

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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Mini_Rust2.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | IDF | CST_ENT | WS )
        int alt7=46;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Mini_Rust2.g:1:10: T__37
                {
                mT__37(); 

                }
                break;
            case 2 :
                // Mini_Rust2.g:1:16: T__38
                {
                mT__38(); 

                }
                break;
            case 3 :
                // Mini_Rust2.g:1:22: T__39
                {
                mT__39(); 

                }
                break;
            case 4 :
                // Mini_Rust2.g:1:28: T__40
                {
                mT__40(); 

                }
                break;
            case 5 :
                // Mini_Rust2.g:1:34: T__41
                {
                mT__41(); 

                }
                break;
            case 6 :
                // Mini_Rust2.g:1:40: T__42
                {
                mT__42(); 

                }
                break;
            case 7 :
                // Mini_Rust2.g:1:46: T__43
                {
                mT__43(); 

                }
                break;
            case 8 :
                // Mini_Rust2.g:1:52: T__44
                {
                mT__44(); 

                }
                break;
            case 9 :
                // Mini_Rust2.g:1:58: T__45
                {
                mT__45(); 

                }
                break;
            case 10 :
                // Mini_Rust2.g:1:64: T__46
                {
                mT__46(); 

                }
                break;
            case 11 :
                // Mini_Rust2.g:1:70: T__47
                {
                mT__47(); 

                }
                break;
            case 12 :
                // Mini_Rust2.g:1:76: T__48
                {
                mT__48(); 

                }
                break;
            case 13 :
                // Mini_Rust2.g:1:82: T__49
                {
                mT__49(); 

                }
                break;
            case 14 :
                // Mini_Rust2.g:1:88: T__50
                {
                mT__50(); 

                }
                break;
            case 15 :
                // Mini_Rust2.g:1:94: T__51
                {
                mT__51(); 

                }
                break;
            case 16 :
                // Mini_Rust2.g:1:100: T__52
                {
                mT__52(); 

                }
                break;
            case 17 :
                // Mini_Rust2.g:1:106: T__53
                {
                mT__53(); 

                }
                break;
            case 18 :
                // Mini_Rust2.g:1:112: T__54
                {
                mT__54(); 

                }
                break;
            case 19 :
                // Mini_Rust2.g:1:118: T__55
                {
                mT__55(); 

                }
                break;
            case 20 :
                // Mini_Rust2.g:1:124: T__56
                {
                mT__56(); 

                }
                break;
            case 21 :
                // Mini_Rust2.g:1:130: T__57
                {
                mT__57(); 

                }
                break;
            case 22 :
                // Mini_Rust2.g:1:136: T__58
                {
                mT__58(); 

                }
                break;
            case 23 :
                // Mini_Rust2.g:1:142: T__59
                {
                mT__59(); 

                }
                break;
            case 24 :
                // Mini_Rust2.g:1:148: T__60
                {
                mT__60(); 

                }
                break;
            case 25 :
                // Mini_Rust2.g:1:154: T__61
                {
                mT__61(); 

                }
                break;
            case 26 :
                // Mini_Rust2.g:1:160: T__62
                {
                mT__62(); 

                }
                break;
            case 27 :
                // Mini_Rust2.g:1:166: T__63
                {
                mT__63(); 

                }
                break;
            case 28 :
                // Mini_Rust2.g:1:172: T__64
                {
                mT__64(); 

                }
                break;
            case 29 :
                // Mini_Rust2.g:1:178: T__65
                {
                mT__65(); 

                }
                break;
            case 30 :
                // Mini_Rust2.g:1:184: T__66
                {
                mT__66(); 

                }
                break;
            case 31 :
                // Mini_Rust2.g:1:190: T__67
                {
                mT__67(); 

                }
                break;
            case 32 :
                // Mini_Rust2.g:1:196: T__68
                {
                mT__68(); 

                }
                break;
            case 33 :
                // Mini_Rust2.g:1:202: T__69
                {
                mT__69(); 

                }
                break;
            case 34 :
                // Mini_Rust2.g:1:208: T__70
                {
                mT__70(); 

                }
                break;
            case 35 :
                // Mini_Rust2.g:1:214: T__71
                {
                mT__71(); 

                }
                break;
            case 36 :
                // Mini_Rust2.g:1:220: T__72
                {
                mT__72(); 

                }
                break;
            case 37 :
                // Mini_Rust2.g:1:226: T__73
                {
                mT__73(); 

                }
                break;
            case 38 :
                // Mini_Rust2.g:1:232: T__74
                {
                mT__74(); 

                }
                break;
            case 39 :
                // Mini_Rust2.g:1:238: T__75
                {
                mT__75(); 

                }
                break;
            case 40 :
                // Mini_Rust2.g:1:244: T__76
                {
                mT__76(); 

                }
                break;
            case 41 :
                // Mini_Rust2.g:1:250: T__77
                {
                mT__77(); 

                }
                break;
            case 42 :
                // Mini_Rust2.g:1:256: T__78
                {
                mT__78(); 

                }
                break;
            case 43 :
                // Mini_Rust2.g:1:262: T__79
                {
                mT__79(); 

                }
                break;
            case 44 :
                // Mini_Rust2.g:1:268: IDF
                {
                mIDF(); 

                }
                break;
            case 45 :
                // Mini_Rust2.g:1:272: CST_ENT
                {
                mCST_ENT(); 

                }
                break;
            case 46 :
                // Mini_Rust2.g:1:280: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\41\4\uffff\1\41\2\uffff\1\50\1\41\1\53\1\55\1\57\2\41"+
        "\1\uffff\3\41\1\67\1\71\3\41\3\uffff\1\41\1\77\1\101\5\uffff\1\41"+
        "\1\103\1\41\2\uffff\1\41\6\uffff\1\41\1\107\4\41\4\uffff\4\41\4"+
        "\uffff\1\41\1\uffff\1\41\1\123\1\124\1\uffff\1\41\1\126\1\127\3"+
        "\41\1\133\4\41\2\uffff\1\140\2\uffff\3\41\1\uffff\1\144\1\145\1"+
        "\41\1\147\1\uffff\1\41\1\151\1\152\2\uffff\1\153\1\uffff\1\154\4"+
        "\uffff";
    static final String DFA7_eofS =
        "\155\uffff";
    static final String DFA7_minS =
        "\1\11\1\164\4\uffff\1\141\2\uffff\1\76\1\145\2\75\1\46\1\63\1\157"+
        "\1\uffff\2\145\1\162\2\75\1\150\1\165\1\154\3\uffff\1\162\1\57\1"+
        "\52\5\uffff\1\162\1\60\1\154\2\uffff\1\143\6\uffff\1\62\1\60\1\157"+
        "\1\156\1\164\1\151\4\uffff\1\151\1\164\1\163\1\165\4\uffff\1\165"+
        "\1\uffff\1\163\2\60\1\uffff\1\154\2\60\1\165\1\156\1\154\1\60\2"+
        "\145\1\143\1\145\2\uffff\1\60\2\uffff\1\162\1\164\1\145\1\uffff"+
        "\2\60\1\164\1\60\1\uffff\1\156\2\60\2\uffff\1\60\1\uffff\1\60\4"+
        "\uffff";
    static final String DFA7_maxS =
        "\1\175\1\164\4\uffff\1\156\2\uffff\1\76\1\145\2\75\1\46\1\146\1"+
        "\157\1\uffff\2\145\1\162\2\75\1\150\1\165\1\154\3\uffff\1\162\2"+
        "\57\5\uffff\1\162\1\172\1\154\2\uffff\1\143\6\uffff\1\62\1\172\1"+
        "\157\2\164\1\151\4\uffff\1\151\1\164\1\163\1\165\4\uffff\1\165\1"+
        "\uffff\1\163\2\172\1\uffff\1\154\2\172\1\165\1\156\1\154\1\172\2"+
        "\145\1\143\1\145\2\uffff\1\172\2\uffff\1\162\1\164\1\145\1\uffff"+
        "\2\172\1\164\1\172\1\uffff\1\156\2\172\2\uffff\1\172\1\uffff\1\172"+
        "\4\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\7\uffff\1\20\10\uffff"+
        "\1\32\1\33\1\34\3\uffff\1\43\1\51\1\54\1\55\1\56\3\uffff\1\11\1"+
        "\41\1\uffff\1\45\1\13\1\44\1\14\1\50\1\15\6\uffff\1\47\1\24\1\46"+
        "\1\25\4\uffff\1\53\1\37\1\52\1\42\1\uffff\1\6\3\uffff\1\30\13\uffff"+
        "\1\12\1\16\1\uffff\1\21\1\40\3\uffff\1\27\4\uffff\1\17\3\uffff\1"+
        "\31\1\35\1\uffff\1\36\1\uffff\1\23\1\26\1\1\1\22";
    static final String DFA7_specialS =
        "\155\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\24\4\uffff\1\15\1\uffff\1"+
            "\7\1\10\1\35\1\37\1\3\1\11\1\33\1\36\12\42\1\5\1\20\1\13\1\25"+
            "\1\14\2\uffff\25\41\1\12\4\41\1\31\1\uffff\1\32\3\uffff\1\41"+
            "\1\17\2\41\1\30\1\6\2\41\1\16\2\41\1\21\1\27\2\41\1\23\1\41"+
            "\1\22\1\1\1\34\2\41\1\26\3\41\1\2\1\40\1\4",
            "\1\44",
            "",
            "",
            "",
            "",
            "\1\46\14\uffff\1\45",
            "",
            "",
            "\1\47",
            "\1\51",
            "\1\52",
            "\1\54",
            "\1\56",
            "\1\60\62\uffff\1\61",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\100\4\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\104",
            "",
            "",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\110",
            "\1\112\5\uffff\1\111",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\1\121",
            "",
            "\1\122",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\125",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\146",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\150",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | IDF | CST_ENT | WS );";
        }
    }
 

}