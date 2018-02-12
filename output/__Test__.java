import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        Mini_Rust2Lexer lex = new Mini_Rust2Lexer(new ANTLRFileStream("/home/antars/Documents/Telecom/Compil/exemples/exemple1_sujet.rs", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Mini_Rust2Parser g = new Mini_Rust2Parser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}