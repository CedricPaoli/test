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

        ArrayList<TDS> tablesDesSymboles = creerTableSymboles(ast);
        for (int i=0; i<tablesDesSymboles.size(); i++) tablesDesSymboles.get(i).displayTDS();
    }

    static ArrayList<TDS> creerTableSymboles(CommonTree ast)
    {
        ArrayList<TDS> tablesDesSymboles = new ArrayList<TDS>();
        tablesDesSymboles.add(new TDS(0, -1));
        iCreerTableSymboles(tablesDesSymboles, ast, 0, 0);

        return tablesDesSymboles;
    }

    static void iCreerTableSymboles(ArrayList<TDS> tablesDesSymboles, CommonTree ast, int num_block, int father_region)
    {
        Type type;
        Type type2;
        String nom_var;
        TDS tableDesSymboles = tablesDesSymboles.get(num_block);

        switch (ast.getToken().getType()) {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++) {
                    iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(i), num_block, father_region);
                }
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                String nom = ast.getChild(0).toString();
                type = new Type((CommonTree)ast.getChild(1));

                //Contrôles sémantiques
                if (tdsOuVariableIn(nom, tablesDesSymboles, num_block) != null) //Verification du nom
                    System.out.println("Erreur: Le nom '" + nom + "'est déjà attribué ligne : "+ast.getLine());
                else if (!type.gIsValide()) System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                else tableDesSymboles.ajouter(nom, type, 0);

                iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(3), num_block, father_region);
                break;
            case Mini_Rust2Lexer.DECL_VAR: //Declaration de variable dans les parametres d'une fonction
                nom_var = ast.getChild(0).toString();
                System.out.println(nom_var);
                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null)
                    System.out.println("Erreur: Le nom '" + nom_var + "'est déjà attribué ligne : "+ast.getLine());
                else {
                    type = new Type((CommonTree)ast.getChild(1));

                    if (!type.gIsValide()) System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, 0);
                }
                break;
            case Mini_Rust2Lexer.DECL_VAR_MUT:
                nom_var = ast.getChild(0).toString();

                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null)
                    System.out.println("Erreur: Le nom '" + nom_var + "'est déjà attribué ligne : "+ast.getLine());
                else {
                    type = new Type((CommonTree)ast.getChild(1), true);

                    if (!type.gIsValide()) System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(1));
                }
                break;
            case Mini_Rust2Lexer.CST_OU_AFF:
                nom_var = ast.getChild(0).toString();

                TDS tds = tdsOuVariableIn(nom_var, tablesDesSymboles, num_block);
                if (tds != null)
                {
                    type = tds.getType(tds.getLigne(nom_var));
                    type2 = new Type((CommonTree)ast.getChild(1), true);
                    if (!type.isEgal(type2)) System.out.println("Les types "+type+" et "+type2+" ne correspondent pas, ligne : "+ast.getLine());
                }
                else {
                    type = new Type((CommonTree)ast.getChild(1), true);

                    if (!type.gIsValide()) System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(1));
                }
                break;
            case Mini_Rust2Lexer.DECL_VEC:
                break;
            case Mini_Rust2Lexer.BLOC:
                father_region = num_block;
                num_block++;
                tablesDesSymboles.add(new TDS(num_block, father_region));

                for (int i=0; i<ast.getChildCount(); i++) iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(i), num_block, father_region);
                break;
            case Mini_Rust2Lexer.APPEL_FCT:
                break;
            case Mini_Rust2Lexer.VEC:
                break;
            default:
                for (int i=0; i<ast.getChildCount(); i++) iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(i), num_block, father_region);
                break;
        }
    }

    static public TDS tdsOuVariableIn(String nom, ArrayList<TDS> tablesDesSymboles, int nTableDesSymboles)
    {
        int i=0;
        boolean res = false;

        for (i=0; i<tablesDesSymboles.size(); i++)
        {
            if (tablesDesSymboles.get(i).getNum_block() == nTableDesSymboles)
            {
                if (tablesDesSymboles.get(i).isVariableIn(nom))
                {
                    res = true;
                }
                break;
            }
        }

        if (res) return tablesDesSymboles.get(i);
        else if (nTableDesSymboles == 0) return null;
        else return tdsOuVariableIn(nom, tablesDesSymboles, tablesDesSymboles.get(i).getFather_num_block());
    }
}
