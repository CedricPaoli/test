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
        iCreerTableSymboles(tablesDesSymboles, ast, 0, 0);

        return tablesDesSymboles;
    }

    //il faut implémenter le changement de valeur de num_block
    static void iCreerTableSymboles(ArrayList<TDS> tablesDesSymboles, CommonTree ast, int num_block, int fateher_region)
    {
        switch (ast.getToken().hashCode()) {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++) {
                    iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(i), num_block, fateher_region);
                }
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                tablesDesSymboles.add(new TDS(num_block, fateher_region));
                String nom = ast.getChild(0).toString();
                //CommonTree noeudType = (CommonTree)ast.getChild(1);
                if (tablesDesSymboles.get(num_block).isVariableIn(nom))
                    System.out.println("Erreur: Le nom '" + nom + "'est déjà attribué ligne : ");
                else tablesDesSymboles.get(num_block).setLigne(nom, null, 0, 0);
                for (int i = 1; i < ast.getChildCount(); i++) {
                    iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(i), num_block, fateher_region);
                }
                break;
            case Mini_Rust2Lexer.DECL_VAR:
                String nom_var = ast.getChild(0).toString();
                if (tablesDesSymboles.get(num_block).isVariableIn(nom_var))
                    System.out.println("Erreur: Le nom '" + nom_var + "'est déjà attribué ligne : ");
                else {
                    tablesDesSymboles.get(num_block).setLigne(nom_var, null, 0, 0);
                    if (ast.getChild(1).getChildCount() < 0) {
                        iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(1), num_block, fateher_region);
                    } else {
                        if (ast.getChild(1).toString().equals("i32") || ast.getChild(1).toString().equals("bool") || ast.getChild(1).toString().equals("&") || ast.getChild(1).toString().equals("Vec")) {
                            tablesDesSymboles.get(num_block).setType(nom_var,ast.getChild(1).toString());
                        }else{
                            tablesDesSymboles.get(num_block).setVal(nom_var,ast.getChild(1).toString());
                        }
                    }
                }
                break;

        }
        for(TDS tds : tablesDesSymboles){
            tds.displayTDS();
        }
    }
}
