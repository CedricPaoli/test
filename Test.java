/* Fichier de test par défaut (source : TP de CPL1) */
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Test {

  public static void main(String[] args) throws Exception {
    ANTLRFileStream input = new ANTLRFileStream("exemples/valide/ex1.rs");
    Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);

    Mini_Rust2Parser.prog_return r = parser.prog();
    CommonTree ast = (CommonTree)r.getTree();

    System.out.println(ast.toString());
    }

}
