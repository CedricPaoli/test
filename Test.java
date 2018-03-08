/* Fichier de test par défaut (source : TP de CPL1) */
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception
    {
        ANTLRFileStream input = new ANTLRFileStream("exemples/valide/ex1.rs");
        Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);

        Mini_Rust2Parser.prog_return r = parser.prog();
        CommonTree ast = (CommonTree)r.getTree();

        System.out.println(ast.toString());

        printTree(ast,2);

        System.out.println(ast.toString());
    }

    static ArrayList<TDS> creerTableSymboles(CommonTree ast)
    {
        ArrayList<TDS> tablesDesSymboles = new ArrayList<TDS>;
        iCreerTableSymboles(tablesDesSymboles, ast);

        return tablesDesSymboles;
    }

    static void iCreerTableSymboles(ArrayList<TDS> tablesDesSymboles, CommonTree ast) {
        switch (ast.getToken().hashCode()) {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++)
                    iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(i));
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                break;
        }
    }

    static public void printTree(CommonTree t, int indent) {
        if ( t != null ) {
            StringBuffer sb = new StringBuffer(indent);

            if (t.getParent() == null){
                System.out.println(sb.toString() + t.getText().toString());
            }
            for ( int i = 0; i < indent; i++ )
                sb = sb.append("   ");
            for ( int i = 0; i < t.getChildCount(); i++ ) {
                System.out.println(sb.toString() + t.getChild(i).toString());
                printTree((CommonTree)t.getChild(i), indent+1);
            }
        }
    }
}