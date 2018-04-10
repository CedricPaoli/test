import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.BaseTreeAdaptor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Type
{
    private int token = -1;
    private String structure = "";
    private boolean isValide = false; //Est-ce que le type est valide
    private int taille = 0;

    private ArrayList<Type> fils = new ArrayList<Type>();

    /**
     * Constructeur simple
     * @param tree prend la partie de l'abre correspondant au type à construire
     */
    public Type(CommonTree tree){ //Definition d'un type "statiquement"

        if (tree.getToken().getType() == Mini_Rust2Lexer.IDF) {
            structure = tree.toString();
            token = -2;
            isValide = true;
        }
        else {
            token = tree.getToken().getType();

            switch (token) {
                case Mini_Rust2Lexer.T__50: // i32
                    taille += 4;
                    break;
                case Mini_Rust2Lexer.T__51: // bool
                    taille += 1;
                    break;
                case Mini_Rust2Lexer.POINTEUR: // pointeur
                case Mini_Rust2Lexer.POINTEUR_VAL: // pointeur de pointeur
                case Mini_Rust2Lexer.T__49: //&
                    taille = 6;
                    break;
            }

            if (tree.getChildCount() == 2 && (tree.getChild(0).getType() == Mini_Rust2Lexer.POINTEUR_VAL || tree.getChild(0).getType() == Mini_Rust2Lexer.POINTEUR || tree.getChild(0).getType() == Mini_Rust2Lexer.T__49)) {
                taille = 6;
            } else {
                token = tree.getToken().getType();

                for (int i = 0; i < tree.getChildCount(); i++) {
                    fils.add(new Type((CommonTree) tree.getChild(i)));
                }

                // Nous sommes bien dans le cas d'un type
                isValide = true;
            }
        }
    }

    public Type(boolean isPointeur){
        taille = 6;
    }

    /**
     * Crée un type vide
     */
    public Type(){
        token = -1;
        isValide = true;
        taille = 0;
    }


    /**
     * Permet la création d'un type avec conversion et typage dynamique
     * @param tree arbre à analyser
     * @param structures ArrayList contenant les types valides spéciaux (les structures déclarées)
     */
    public Type(CommonTree tree, ArrayList<Structure> structures, int nTableDesSymboles){
        TDS table;

        switch (tree.getToken().getType()) {
            case Mini_Rust2Lexer.T__65: //True
                token = Mini_Rust2Lexer.T__51;
                isValide = true;
                taille += 1;
                break;
            case Mini_Rust2Lexer.T__66: //False
                token = Mini_Rust2Lexer.T__51;
                isValide = true;
                taille += 1;
                break;
            case Mini_Rust2Lexer.T__76: //&&
            case Mini_Rust2Lexer.T__77: //||
                Type type_gauche = new Type((CommonTree) tree.getChild(0), structures, nTableDesSymboles);
                Type type_droit = new Type((CommonTree) tree.getChild(1), structures, nTableDesSymboles);
                if ((type_gauche.token != Mini_Rust2Lexer.T__50 && type_droit.token != Mini_Rust2Lexer.T__50) &&
                        (type_gauche.token != Mini_Rust2Lexer.T__51 && type_droit.token != Mini_Rust2Lexer.T__51)) {
                    System.out.println("Erreur ligne " + tree.getLine() + " : les deux opérandes doivent être de type i32 alors qu'ils sont de type " + type_gauche + " et " + type_droit);
                }
                token = Mini_Rust2Lexer.T__51;
                isValide = true;
                taille += 1;
                break;
            case Mini_Rust2Lexer.T__47: //<
            case Mini_Rust2Lexer.T__48: //>
            case Mini_Rust2Lexer.T__73: //<=
            case Mini_Rust2Lexer.T__72: //>=
            case Mini_Rust2Lexer.T__74: //==
                Type type_gauche_supe = new Type((CommonTree) tree.getChild(0), structures, nTableDesSymboles);
                Type type_droit_supe = new Type((CommonTree) tree.getChild(1), structures, nTableDesSymboles);
                if (type_gauche_supe.token != Mini_Rust2Lexer.T__50 || type_droit_supe.token != Mini_Rust2Lexer.T__50) {
                    System.out.println("Erreur ligne " + tree.getLine() + " : les deux opérandes doivent être de type i32 alors qu'ils sont de type " + type_gauche_supe + " et " + type_droit_supe);
                }
                token = Mini_Rust2Lexer.T__51; // bool
                isValide = true;
                taille += 1;
                break;
            case Mini_Rust2Lexer.CST_ENT: //CST_ENT
                token = Mini_Rust2Lexer.T__50;
                isValide = true;
                taille += 4;
                break;

            case Mini_Rust2Lexer.T__71: //+
            case Mini_Rust2Lexer.T__69: //-
            case Mini_Rust2Lexer.T__67: //*

                Type type_gauche_moins = new Type((CommonTree) tree.getChild(0), structures, nTableDesSymboles);
                Type type_droit_moins = new Type((CommonTree) tree.getChild(1), structures, nTableDesSymboles);
                if (type_gauche_moins.token != Mini_Rust2Lexer.T__50 || type_droit_moins.token != Mini_Rust2Lexer.T__50) {
                    System.out.println("Erreur ligne " + tree.getLine() + " : les deux opérandes doivent être de type i32");
                }
                token = Mini_Rust2Lexer.T__50; // i32
                isValide = true;
                taille += 4;
                break;
            case Mini_Rust2Lexer.VAR: //VAR
                table = Main.tdsOuVariableIn(tree.getChild(0).toString(), TDS.tablesDesSymboles, nTableDesSymboles);

                if (table == null)
                    System.out.println(tree.getChild(0) + " n'est pas déclaré ligne : " + tree.getChild(0).getLine());
                else {
                    Type typeVar = table.getType(table.getLigne(tree.getChild(0).toString()));

                    if (tree.getChildCount() == 2 && tree.getChild(1).getType() == Mini_Rust2Lexer.T__68) { //len()
                        if (typeVar.token == Mini_Rust2Lexer.T__46) {
                            token = Mini_Rust2Lexer.T__50;

                            isValide = true;
                        } else System.out.println(typeVar + " n'a pas de méthode len() ligne : " + tree.getLine());
                    } else if (tree.getChildCount() == 2 && tree.getChild(1).getType() == Mini_Rust2Lexer.ACCES_VEC)
                    {
                        //vérifier que c'est bien i32
                        String nom_var = tree.getChild(0).toString();

                        Type type = new Type((CommonTree) tree.getChild(1).getChild(0), structures, nTableDesSymboles);

                        if(!type.gIsValide()) {
                            System.out.println("Le type "+type+" n'existe pas, ligne : "+ tree.getLine());
                        }
                        else if (type.getToken() != Mini_Rust2Lexer.T__50) System.out.println("Le type "+type+" est incorrecte, ligne : "+ tree.getLine());
                        else {

                            //Vérifier que c'est bien un vec
                            TDS tedeess = Main.tdsOuVariableIn(nom_var, TDS.tablesDesSymboles, nTableDesSymboles);
                            if (tedeess != null) {
                                if (tedeess.getType(tedeess.getLigne(nom_var)).getToken() != Mini_Rust2Lexer.T__46) {
                                    System.out.println("La variable n'est pas un vecteur, ligne : "+tree.getLine());
                                }
                                else
                                {
                                    token = Mini_Rust2Lexer.T__50;
                                    taille = 4;
                                    isValide = true;
                                }
                            } else {
                                System.out.println("Variable non définie");
                            }
                        }
                    }
                    else if (tree.getChildCount() == 2 && tree.getChild(1).getType() == Mini_Rust2Lexer.ACCES_ATTRIBUT)
                    {/*
                        String nom_var1 = tree.getChild(0).toString();
                        String nom_var2 = tree.getChild(0).toString();
                        Type type = new Type((CommonTree) tree.getChild(1).getChild(0), structures, nTableDesSymboles);

                        if(!type.gIsValide()) {
                            System.out.println("Le type "+type+" n'existe pas, ligne : "+ tree.getLine());
                        }
                        else
                        {

                        }
                        System.out.println("acces attribut "+tree.getLine());*/
                    }
                    else
                        {
                        token = typeVar.token;
                        fils = typeVar.fils;
                        isValide = true;
                        taille = typeVar.taille;
                        structure = typeVar.structure;
                    }
                }
                break;
            case Mini_Rust2Lexer.POINTEUR: // pointeur
            case Mini_Rust2Lexer.POINTEUR_VAL: // pointeur de pointeur
            case Mini_Rust2Lexer.T__49: //&
                token = Mini_Rust2Lexer.POINTEUR;
                fils.add(new Type((CommonTree) tree.getChild(0), structures, nTableDesSymboles));
                isValide = true;
                taille += 6;
                break;
            case Mini_Rust2Lexer.DECL_VEC:
                token = Mini_Rust2Lexer.T__46;
                for (int i = 0; i < tree.getChildCount(); i++) {
                    fils.add(new Type((CommonTree) tree.getChild(i), structures, nTableDesSymboles));
                }
                isValide = true;
                break;
            case Mini_Rust2Lexer.STRUCT:
                isValide = false;
                tree = (CommonTree)tree.getChild(0);

                for (int i = 0; i < structures.size(); i++) {
                    if (structures.get(i).getStruct_name().equals(tree.toString())) {
                        token = -2;
                        structure = tree.toString();
                        isValide = true;
                    }
                }
                break;
            case Mini_Rust2Lexer.APPEL_FCT:
                String nom_fn = tree.getChild(0).toString();
                table = Main.tdsOuVariableIn(nom_fn, TDS.tablesDesSymboles, nTableDesSymboles);

                if (table == null) {
                    System.out.println("Erreur ligne " + tree.getLine() + " : La fonction '" + nom_fn + "' n'est pas définie");
                    break;
                } else {
                    Type type = table.getType(table.getLigne(nom_fn));
                    token = type.token;
                    structure = type.structure;
                    fils = type.fils;
                    isValide = true;
                }
                break;
            default:
                isValide = false;
                break;
        }
        if(tree.getChildCount() == 2 && (tree.getChild(0).getType() == Mini_Rust2Lexer.POINTEUR_VAL || tree.getChild(0).getType() == Mini_Rust2Lexer.POINTEUR || tree.getChild(0).getType() == Mini_Rust2Lexer.T__49)) {
            taille = 6;
        }
    }

    /**
     * Fonction pour tester si la valeur du type est un entier
     * @param input une chaine de caractère
     * @return true si entier, false sinon
     */
    public boolean isInteger( String input ){
       try{
          Integer.parseInt( input );
          return true;
       }
       catch( Exception e){
          return false;
       }
    }

    /**
     * Fonction donnant l'espace mémoire requis / occupé par le type courant
     * @return un entier correspondant à la taille du type en octet
     */
    public int getTaille1(){
        int i = 0;
        for (int j = 0; j < fils.size(); j++) {
            System.out.println(fils.get(j));
            switch (fils.get(j).token){
                case Mini_Rust2Lexer.T__50 : // i32
                    System.out.println("c'est un int ! ligne :");
                    i += 4;
                    break;
                case Mini_Rust2Lexer.T__51 : // bool
                    i += 1;
                    break;
                case Mini_Rust2Lexer.T__49 : // pointeur
                    i += 6;
                    break;
                default: // le reste
                    i += fils.get(j).getTaille1();
                    break;
            }
        }
        System.out.println(i);
        return i;
    }


    public int getTaille(){
        return taille;
    }

    /**
     * Fonction transformant le type courant en une chaine de caractères
     * @return le type sous forme string
     */
    public String toString()
    {
        switch (token)
        {
            case -1:
                return "void";
            case -2:
                return structure;
            case Mini_Rust2Lexer.T__50:
                return "i32";
            case Mini_Rust2Lexer.T__51:
                return "bool";
            case Mini_Rust2Lexer.POINTEUR:
                return "&"+fils.get(0).toString();
            case Mini_Rust2Lexer.STRUCT:
            	return "struct";
            case Mini_Rust2Lexer.T__46:
            	String res = "Vec<"+fils.get(0);
                for (int i=1; i<fils.size(); i++) res += ", "+fils.get(i);
            	return res+">";
            default:
                return "erreur: "+token;
        }
    }

    /**
     * Vérifie que deux types sont bien identiques
     * @param type type à comparer avec le type courant
     * @return true si c'est le même type, false sinon
     */
    public boolean isEgal(Type type)
    {
        return iIsEgal(this, type);
    }

    /**
     * Vérifie que deux types sont bien identiques
     * @param type1 premier type à comparer
     * @param type2 second type à comparer
     * @return true si les types sont identiques, false sinon
     */
    public boolean iIsEgal(Type type1, Type type2)
    {
        if (type1.fils.size() != type2.fils.size() || type1.token != type2.token) return false;

        boolean res;

        for (int i=0; i<type1.fils.size(); i++)
        {
            if (type1.token != type2.token) return false;
            else if (type1.token == -2 && type1.structure != type2.structure) return false;
            else {
                res = iIsEgal(type1.fils.get(i), type2.fils.get(i));
                if (!res) return false;
            }
        }

        return true;
    }

    /**
     * Fonction contrôlant si le type est un type valide
     * @return true si le type est correct, false sinon
     */
    public boolean gIsValide()
    {
        return isValide;
    }
/*
    public CommonTree getCommon_tree() {
        return common_tree;
    }
  */
    
    /**
     * Pour vérifier condition boucle
     * @return true si c'est une condition
     */
    public boolean isCondition() {
        return (token == Mini_Rust2Lexer.T__50 || token == Mini_Rust2Lexer.T__51);
    }


    /**
     * Permet d'obtenir les fils du type
     * @return les fils du type
     */
    public  ArrayList<Type> getFils(){
        return fils;
    }


    
    /**
     * Récupérer le token du type (int)
     */
    public int getToken() {
    	return this.token;
    }
}
