package src;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception
    {
        ANTLRFileStream input = new ANTLRFileStream("exemples/valide/ex2.rs");
        Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);

        Mini_Rust2Parser.prog_return r = parser.prog();
        CommonTree ast = (CommonTree)r.getTree();

        ArrayList<TDS> tablesDesSymboles = creerTableSymboles(ast);
        for (int i=0; i<tablesDesSymboles.size(); i++) tablesDesSymboles.get(i).displayTDS();
    }

    /**
     * Contient l'intégralité des TDS
     * @param ast AST à partir duquel les TDS sont construite
     * @return l'ensemble des TDS sous la forme d'une ArrayList<TDS>
     */
    static ArrayList<TDS> creerTableSymboles(CommonTree ast)
    {
        // liste des TDS
        ArrayList<TDS> tablesDesSymboles = new ArrayList<TDS>();
        // on pose la 1er TDS
        tablesDesSymboles.add(new TDS(0, -1));
        // On initialise les type valides particuliers
        ArrayList<Type> typesValide = new ArrayList<>();
        // On crée récursivement les TDS
        iCreerTableSymboles(tablesDesSymboles,typesValide, ast, 0, 0);

        return tablesDesSymboles;
    }

    /**
     * Fonction permettant de créer récursivement l'ensemble des TDS associées à un AST
     * @param tablesDesSymboles contient l'ensemble des TDS déjà créées
     * @param types_valides contient l'ensemble des types valides courants
     * @param ast AST à partir duquel on construit les TDS
     * @param num_block numéro du block courant
     * @param father_region numéro de région englobante
     */
    static void iCreerTableSymboles(ArrayList<TDS> tablesDesSymboles,ArrayList<Type> types_valides, CommonTree ast, int num_block, int father_region)
    {
        Type type;
        Type type2;
        String nom_var;
        TDS tableDesSymboles = tablesDesSymboles.get(num_block);

        switch (ast.getToken().getType()) {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++) {
                    iCreerTableSymboles(tablesDesSymboles,types_valides, (CommonTree) ast.getChild(i), num_block, father_region);
                }
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                String nom = ast.getChild(0).toString();
                if (ast.getChild(2).getChildCount() > 0) type = new Type((CommonTree) ast.getChild(2).getChild(0));
                else type = new Type();

                //Contrôles sémantiques
                if (tdsOuVariableIn(nom, tablesDesSymboles, num_block) != null) //Verification du nom
                    System.out.println("Erreur: Le nom '" + nom + "'est déjà attribué ligne : " + ast.getLine());
                else if (!type.gIsValide())
                    System.out.println("Erreur: Le type '" + type + " n'existe pas"); //Verification du type
                else
                {
                    ArrayList<Type> arguments = new ArrayList<Type>();

                    for (int i=0; i<ast.getChild(1).getChildCount(); i++)
                    {
                        arguments.add(new Type((CommonTree)(ast.getChild(1).getChild(i).getChild(1))));
                    }
                    tableDesSymboles.ajouter(nom, type, arguments, 0);
                }

                //iCreerTableSymboles(tablesDesSymboles, (CommonTree) ast.getChild(1), num_block, father_region);
                iCreerTableSymboles(tablesDesSymboles,types_valides, (CommonTree) ast.getChild(3), num_block, father_region);
                break;
            case Mini_Rust2Lexer.DECL_VAR: //Declaration de variable dans les parametres d'une fonction
                nom_var = ast.getChild(0).toString();
                System.out.println(nom_var);
                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null)
                    System.out.println("Erreur: Le nom '" + nom_var + "'est déjà attribué ligne : " + ast.getLine());
                else {
                    type = new Type((CommonTree) ast.getChild(1));

                    if (!type.gIsValide())
                        System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, 0);
                }
                break;
            case Mini_Rust2Lexer.DECL_VAR_MUT:
                nom_var = ast.getChild(0).toString();

                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null)
                    System.out.println("Erreur: Le nom '" + nom_var + "'est déjà attribué ligne : " + ast.getLine());
                else {
                    type = new Type((CommonTree) ast.getChild(1),types_valides, true);

                    if (!type.gIsValide())
                        System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(1));
                }
                break;
            case Mini_Rust2Lexer.CST_OU_AFF:
                nom_var = ast.getChild(0).toString();

                TDS tds = tdsOuVariableIn(nom_var, tablesDesSymboles, num_block);
                if (tds != null) {
                    type = tds.getType(tds.getLigne(nom_var));
                    type2 = new Type((CommonTree) ast.getChild(1), types_valides, true);
                    if (!type.isEgal(type2))
                        System.out.println("Les types " + type + " et " + type2 + " ne correspondent pas, ligne : " + ast.getLine());
                } else {
                    type = new Type((CommonTree) ast.getChild(1), types_valides, true);

                    if (!type.gIsValide())
                        System.out.println("Erreur: Le type '" + type + "n'existe pas"); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(1));
                }
                break;
            case Mini_Rust2Lexer.DECL_VEC:
                break;
            case Mini_Rust2Lexer.ACCES_VEC:
            	nom_var = ast.getChild(0).toString();
            	type = new Type((CommonTree) ast.getChild(1), types_valides, true);
            	
            	if(!type.gIsValide()) {
            		System.out.println("Erreur: Les types ne sont pas corrects, ligne : "+ ast.getLine());
            	}else {
            		  tableDesSymboles.ajouter(nom_var, type, ast.getChild(1));
            	}
            	break;
            case Mini_Rust2Lexer.BLOC:
                father_region = num_block;
                num_block++;
                tablesDesSymboles.add(new TDS(num_block, father_region));

                for (int i = 0; i < ast.getChildCount(); i++)
                    iCreerTableSymboles(tablesDesSymboles,types_valides, (CommonTree) ast.getChild(i), num_block, father_region);
                break;
            case Mini_Rust2Lexer.APPEL_FCT:
                String nom_fn = ast.getChild(0).toString();
                //contrôle sem : vérifier que la fonction existe
                boolean exist = false;
                int current = num_block;
                /*
                while (!exist || current>=0){
                    exist=tablesDesSymboles.get(current).isVariableIn(nom_fn);
                    current = tablesDesSymboles.get(current).getFather_num_block();
                }*/
                TDS fn_tds = tdsOuVariableIn(nom_fn, tablesDesSymboles, num_block);

                if (fn_tds == null) {
                    System.out.println("Erreur ligne " + ast.getLine() + " : La fonction '" + nom_fn + "' n'est pas définie");
                }
                else
                {
                    //TDS fn_tds = tablesDesSymboles.get(current);
                    if (ast.getChildCount()-1 != fn_tds.getArgOf(nom_fn).size()) System.out.println("Erreur ligne " + ast.getLine()+" : Le nombre de paramètres est erroné");
                    else {
                        for (int i = 1; i < ast.getChildCount(); i++) {
                            Type tested_type = new Type((CommonTree) ast.getChild(i).getChild(0), types_valides, true);
                            if (!tested_type.isEgal(fn_tds.getArgOf(nom_fn).get(i-1))) {
                                System.out.println("Erreur ligne " + ast.getLine() + " : L'argument de la fonction '" + nom_fn + "' doit être de type " + fn_tds.getArgOf(nom_fn).get(i-1));
                            }
                        }
                    }
                }
                break;
            case Mini_Rust2Lexer.DECL_STRUCT:
                String nom_struct = ast.getChild(0).toString();
                if (tdsOuVariableIn(nom_struct, tablesDesSymboles, num_block) != null){
                    // Cas où le type existe déjà dans la TDS
                    System.out.println("Erreur ligne " + ast.getLine() + " La structure " + nom_struct + "existe déjà ");
                }else{
                    // Cas o l'on rencontre le type pour la première fois
                    ArrayList<String> champs = new ArrayList<>();
                    ArrayList<String> types = new ArrayList<>();
                    Type nouveau_type = new Type((CommonTree)ast);
                    for(int i=0; i<ast.getChild(1).getChildCount();i++){
                        types.add(ast.getChild(1).getChild(i).getChild(0).toString());
                        champs.add(ast.getChild(1).getChild(i).getChild(1).toString());
                    }
                    // ajout de la nouvelle structure aux types valides
                    types_valides.add(nouveau_type);
                    //ajouter nom_struct et ses champs ainsi que leurs types à la liste des types valides
                    // (je sais pas où c'est censé aller ^^)
                }
                break;

            case Mini_Rust2Lexer.VEC:
                break;
            default:
                for (int i=0; i<ast.getChildCount(); i++) iCreerTableSymboles(tablesDesSymboles,types_valides, (CommonTree) ast.getChild(i), num_block, father_region);
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
