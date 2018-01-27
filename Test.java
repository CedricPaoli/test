/* Fichier de test par défaut (source : TP de CPL1) */
import org.antlr.runtime.*;

public class Test {

  public static void main(String[] args) throws Exception {
    ANTLRInputStream input = new ANTLRInputStream(System.in);
    ExprLexer lexer = new ExprLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExprParser parser = new ExprParser(tokens);
    parser.prog();
    }

}
