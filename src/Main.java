import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception
    {
        ANTLRFileStream input = new ANTLRFileStream("exemples/valide/ex4.rs");

        Mini_Rust2Lexer lexer = new Mini_Rust2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Mini_Rust2Parser parser = new Mini_Rust2Parser(tokens);

        Mini_Rust2Parser.prog_return r = parser.prog();
        CommonTree ast = (CommonTree)r.getTree();

        creerTableSymboles(ast);

        for (int i=0; i<TDS.tablesDesSymboles.size(); i++) TDS.tablesDesSymboles.get(i).displayTDS();
    }

    /**
     * Contient l'intégralité des TDS
     * @param ast AST à partir duquel les TDS sont construite
     * @return l'ensemble des TDS sous la forme d'une ArrayList<TDS>
     */
    static void creerTableSymboles(CommonTree ast)
    {
        // on pose la 1er TDS
        TDS.tablesDesSymboles.add(new TDS(0, -1));
        // On initialise les type valides particuliers
        //On initialise les tructures déclarées
        ArrayList<Structure> structuresDeclarees = new ArrayList<>();
        // On crée récursivement les TDS
        iCreerTableSymboles(structuresDeclarees, ast, 0, 0);
    }

    /**
     * Fonction permettant de créer récursivement l'ensemble des TDS associée à un AST
     * @param ast AST à partis duquel l'on construit les TDS
     * @param num_block numéro du block courant
     * @param father_region numéro de région englobante
     */
    static void iCreerTableSymboles(ArrayList<Structure> structures, CommonTree ast, int num_block, int father_region)

    {
        Type type;
        Type type2;
        String nom_var;
        ArrayList<TDS> tablesDesSymboles = TDS.tablesDesSymboles;
        TDS tableDesSymboles = tablesDesSymboles.get(num_block);

        switch (ast.getToken().getType()) {
            case Mini_Rust2Lexer.FICHIER:
                for (int i = 0; i < ast.getChildCount(); i++) {
                    iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);
                }
                break;
            case Mini_Rust2Lexer.DECL_FCT:
                String nom = ast.getChild(0).toString();
                if (ast.getChild(2).getChildCount() > 0) type = new Type((CommonTree) ast.getChild(2).getChild(0), structures);
                else type = new Type();

                //Contrôles sémantiques
                if (tdsOuVariableIn(nom, tablesDesSymboles, num_block) != null) //Verification du nom
                    System.out.println("Erreur: Le nom '" + nom + "' est déjà attribué ligne : " + ast.getLine());
                else if (!type.gIsValide())
                    System.out.println("Erreur: Le type '" + type + " n'existe pas ligne : "+ast.getLine()); //Verification du type
                else
                {
                    ArrayList<Type> arguments = new ArrayList<Type>();

                    for (int i=0; i<ast.getChild(1).getChildCount(); i++)
                    {
                        arguments.add(new Type((CommonTree)(ast.getChild(1).getChild(i).getChild(1)), structures));
                    }
                    tableDesSymboles.ajouter(nom, type, arguments, 0);
                }

                father_region = num_block;
                num_block = tablesDesSymboles.size();

                tablesDesSymboles.add(new TDS(num_block, father_region));
                iCreerTableSymboles(structures, (CommonTree) ast.getChild(1), num_block, father_region);

                ast = (CommonTree)ast.getChild(3);
                for (int i = 0; i < ast.getChildCount(); i++)
                    iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);

                break;
            case Mini_Rust2Lexer.DECL_VAR: //Declaration de variable dans les parametres d'une fonction
                nom_var = ast.getChild(0).toString();

                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null)
                    System.out.println("Erreur: Le nom '" + nom_var + "' est déjà attribué ligne : " + ast.getLine());
                else {
                    type = new Type((CommonTree) ast.getChild(1),structures);

                    if (!type.gIsValide())
                        System.out.println("Erreur: Le type '" + type + " n'existe pas ligne : "+ast.getLine()); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, 0);
                }
                break;
            case Mini_Rust2Lexer.DECL_VAR_MUT:
                nom_var = ast.getChild(0).toString();

                if (tdsOuVariableIn(nom_var, tablesDesSymboles, num_block) != null)
                    System.out.println("Erreur: Le nom '" + nom_var + "' est déjà attribué ligne : " + ast.getLine());
                else {
                    type = new Type((CommonTree) ast.getChild(1), structures, num_block);

                    if (!type.gIsValide())
                        System.out.println("Erreur: Le type '" + type + "' n'existe pas ligne " + ast.getLine()); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(1));
                }
                break;
            case Mini_Rust2Lexer.CST_OU_AFF:
                nom_var = ast.getChild(0).toString();

                TDS tds = tdsOuVariableIn(nom_var, tablesDesSymboles, num_block);

                if (tds != null) {
                    type = tds.getType(tds.getLigne(nom_var));
                    type2 = new Type((CommonTree) ast.getChild(ast.getChildCount()-1), structures, num_block);

                    if (type.isEgal(new Type())) //aff
                    {
                        tds.setType(nom_var, type2);
                    }
                    else {
                        if (!type.isEgal(type2))
                            System.out.println("Les types " + type + " et " + type2 + " ne correspondent pas, ligne : " + ast.getLine());
                    }
                } else {
                    if (ast.getChildCount() > 1 && ast.getChild(ast.getChildCount()-1).getType() != Mini_Rust2Lexer.ACCES_VEC &&
                            ast.getChild(ast.getChildCount()-1).getType() != Mini_Rust2Lexer.ACCES_ATTRIBUT)
                        type = new Type((CommonTree) ast.getChild(ast.getChildCount()-1), structures, num_block);
                    else type = new Type();

                    if (!type.gIsValide())
                        System.out.println("Erreur: Le type '" + type + " n'existe pas ligne : " + ast.getLine()); //Verification du type
                    else tableDesSymboles.ajouter(nom_var, type, ast.getChild(ast.getChildCount()-1));
                }
                break;
            case Mini_Rust2Lexer.WHILE:
            	type = new Type((CommonTree) ast.getChild(0).getChild(0), structures, num_block);
            	//Vérification de la condition => boolean ou nombre
            	if(!type.isCondition()) {
            		System.out.println("La condition n'est pas valide, ligne : " + ast.getLine());
            	}

                iCreerTableSymboles(structures, (CommonTree) ast.getChild(1), num_block, father_region);
            	break;
            case Mini_Rust2Lexer.IF:
            	type = new Type((CommonTree) ast.getChild(0).getChild(0), structures, num_block);
            	//Vérification de la condition => boolean ou nombre
            	if(!type.isCondition()) {
            		System.out.println("La condition n'est pas valide, ligne : " + ast.getLine());
            	}

                iCreerTableSymboles(structures, (CommonTree) ast.getChild(1), num_block, father_region);

            	if (ast.getChildCount() == 3) iCreerTableSymboles(structures, (CommonTree) ast.getChild(2), num_block, father_region);
            	break;
            case Mini_Rust2Lexer.LEN:
            	nom_var = ast.getChild(0).toString();
            	TDS tedeess2 = tdsOuVariableIn(nom_var, tablesDesSymboles, num_block);
            	if(tedeess2 != null) {
            		if(tedeess2.getType(tedeess2.getLigne(nom_var)).getToken() != Mini_Rust2Lexer.VEC) {
            			System.out.println("La variable n'est pas un vecteur");
            		}
            	}else {
            		System.out.println("Variable non définie");
            	}
            	break;
            case Mini_Rust2Lexer.BLOC:
                father_region = num_block;
                num_block = tablesDesSymboles.size();
                tablesDesSymboles.add(new TDS(num_block, father_region));

                for (int i = 0; i < ast.getChildCount(); i++)
                    iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);

                break;
            case Mini_Rust2Lexer.APPEL_FCT:
                String nom_fn = ast.getChild(0).toString();
                //contrôle sem : vérifier que la fonction existe
                boolean exist = false;
                int current = num_block;

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
                            Type tested_type = new Type((CommonTree) ast.getChild(i).getChild(0), structures, num_block);

                            if (!tested_type.isEgal(fn_tds.getArgOf(nom_fn).get(i-1))) {
                                System.out.println("Erreur ligne " + ast.getLine() + " : L'argument de la fonction '" + nom_fn + "' doit être de type " + fn_tds.getArgOf(nom_fn).get(i-1)+" alors qu'il est de type "+tested_type);
                            }
                        }
                    }
                }
                break;
            case Mini_Rust2Lexer.DECL_STRUCT:
                String nom_struct = ast.getChild(0).toString();

                ArrayList<String> champs = new ArrayList<>();
                ArrayList<Type> types = new ArrayList<>();

                Type nouveau_type = new Type((CommonTree)ast,structures);
                for(int i=0; i<ast.getChild(1).getChildCount();i++){
                    types.add(new Type((CommonTree)ast.getChild(1).getChild(i).getChild(0),structures));
                    champs.add(ast.getChild(1).getChild(i).getChild(1).toString());
                }
                // ajout de la nouvelle structure aux types valides et aux structures déclarées
                structures.add(new Structure(nom_struct,champs, types));
                break;
            default:
                for (int i=0; i<ast.getChildCount(); i++) iCreerTableSymboles(structures, (CommonTree) ast.getChild(i), num_block, father_region);

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
