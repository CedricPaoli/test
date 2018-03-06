/* Fichier de test par défaut (source : TP de CPL1) */
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;


public class Test {

    public static void main(String[] args) throws Exception {

        ANTLRFileStream input = new ANTLRFileStream("exemples/valide/ex1.rs");
        Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);
        parser.prog();

        final TreeAdaptor adaptor = new CommonTreeAdaptor() {
            public Object create(Token payload) {
                return new CommonTree(payload);
            }
        };

        parser.setTreeAdaptor(adaptor);
        Mini_Rust2Parser.fichier_return ret = parser.fichier();
        CommonTree tree = (CommonTree)ret.getTree();

        //System.out.println(tree.toString());

        final TreeAdaptor adaptor2 = new CommonTreeAdaptor() {
            public Object create(Token payload) {
                return new AST(payload);
            }
        };

        parser.setTreeAdaptor(adaptor2);
        Mini_Rust2Parser.fichier_return ret2 = parser.fichier();
        CommonTree tree2 = (CommonTree)ret2.getTree();

        printTree(tree2,2);

        System.out.println(tree2.toString());
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
