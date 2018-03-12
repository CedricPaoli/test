import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception
    {
        ANTLRFileStream input = new ANTLRFileStream("exemples/valide/ex1.rs");
        Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);

        Mini_Rust2Parser.prog_return r = parser.prog();
        CommonTree ast = (CommonTree)r.getTree();


        System.out.println(ast.toString());
    }

    static ArrayList<TDS> creerTableSymboles(CommonTree ast)
    {
        ArrayList<TDS> tablesDesSymboles = new ArrayList<TDS>();
        iCreerTableSymboles(tablesDesSymboles, ast);

        return tablesDesSymboles;
    }

    static void iCreerTableSymboles(ArrayList<TDS> tablesDesSymboles, CommonTree ast)
    {
        switch (ast.getToken().hashCode())
        {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++) iCreerTableSymboles(tablesDesSymboles, (CommonTree)ast.getChild(i));
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                String nom = ast.getChild(0).toString();
                CommonTree noeudType = (CommonTree)ast.getChild(1);
                if (tablesDesSymboles.get(0).isVariableIn(nom)) System.out.println("Erreur: Le nom '"+nom+"'est déjà attribué ligne : ");
                else tablesDesSymboles.get(0).setLigne(nom, noeudType.toString(), 0, 0);
                break;
            
            	
        }
    }
}
