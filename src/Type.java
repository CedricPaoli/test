import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.BaseTreeAdaptor;

import java.util.ArrayList;

public class Type
{
    private int token = -1;
    private boolean isValide; //Est-ce que le type est valide
    private ArrayList<Type> fils = new ArrayList<Type>();

    /**
     * Constructeur simple
     * @param tree prend la partie de l'abre correspondant au type à construire
     */
    public Type(CommonTree tree){

        token = tree.getToken().getType();

        for (int i = 0; i < tree.getChildCount(); i++) {
            fils.add(new Type((CommonTree) tree.getChild(i)));
        }

        // Nous sommes bien dans le cas d'un type
        isValide = true;
    }


    /**
     * Crée un type vide
     */
    public Type(){
        token = -1;
        isValide = true;
    }

    /**
     * Permet la création d'un type avec conversion et typage dynamique
     * @param tree arbre à analyser
     * @param types_valides ArrayList contenant les types valides spéciaux (les structures déclarées)
     * @param transformation param. de
     */
    public Type(CommonTree tree, ArrayList<Type> types_valides, boolean transformation){
        switch (tree.getToken().getType()) {
            case Mini_Rust2Lexer.T__65: //True
            	token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__66: //False
            	token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__76: //&&
            	token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__77: //||
            	token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__47: //<
            	Type type_gauche_inf = new Type((CommonTree)tree.getChild(0),types_valides,transformation);
                Type type_droit_inf = new Type((CommonTree)tree.getChild(1),types_valides,transformation);
                if(!type_gauche_inf.isEgal(type_droit_inf)){
                    System.out.println("Erreur ligne " + tree.getLine() + " : l'oppération doit se faire entre deux expressions de même type");
                }
                token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__48: //>
            	Type type_gauche_sup = new Type((CommonTree)tree.getChild(0),types_valides,transformation);
                Type type_droit_sup = new Type((CommonTree)tree.getChild(1),types_valides,transformation);
                if(!type_gauche_sup.isEgal(type_droit_sup)){
                    System.out.println("Erreur ligne " + tree.getLine() + " : l'oppération doit se faire entre deux expressions de même type");
                }
                token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__73: //<=
            	Type type_gauche_infe = new Type((CommonTree)tree.getChild(0),types_valides,transformation);
                Type type_droit_infe = new Type((CommonTree)tree.getChild(1),types_valides,transformation);
                if(!type_gauche_infe.isEgal(type_droit_infe)){
                    System.out.println("Erreur ligne " + tree.getLine() + " : l'oppération doit se faire entre deux expressions de même type");
                }
                token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.T__72: //>=
            	Type type_gauche_supe = new Type((CommonTree)tree.getChild(0),types_valides,transformation);
                Type type_droit_supe = new Type((CommonTree)tree.getChild(1),types_valides,transformation);
                if(!type_gauche_supe.isEgal(type_droit_supe)){
                    System.out.println("Erreur ligne " + tree.getLine() + " : l'oppération doit se faire entre deux expressions de même type");
                }
                token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.CST_ENT: //CST_ENT
            case Mini_Rust2Lexer.T__71: //+
                Type type_gauche_plus = new Type((CommonTree)tree.getChild(0),types_valides,transformation);
                Type type_droit_plus = new Type((CommonTree)tree.getChild(1),types_valides,transformation);
                if(!type_gauche_plus.isEgal(type_droit_plus)){
                    System.out.println("Erreur ligne " + tree.getLine() + " : l'oppération doit se faire entre deux expressions de même type");
                }
            case Mini_Rust2Lexer.T__69: //-
                Type type_gauche_moins = new Type((CommonTree)tree.getChild(0),types_valides,transformation);
                Type type_droit_moins = new Type((CommonTree)tree.getChild(1),types_valides,transformation);
                if(!type_gauche_moins.isEgal(type_droit_moins)){
                    System.out.println("Erreur ligne " + tree.getLine() + " : l'oppération doit se faire entre deux expressions de même type");
                }
            case Mini_Rust2Lexer.T__67: //*
                token = Mini_Rust2Lexer.T__50;
                break;
            case Mini_Rust2Lexer.IDF: //IDF
                token = Mini_Rust2Lexer.T__50;
                System.out.println("corriger dans type");
                break;
            case Mini_Rust2Lexer.DECL_VEC:
            	  token = Mini_Rust2Lexer.DECL_VEC;
            	  for(int i=0; i<tree.getChildCount(); i++){
            	  	  fils.add(new Type((CommonTree) tree.getChild(i), types_valides, true));
	              }
	              break;
            default:
                for (int i=0; i<tree.getChildCount(); i++) {
                    fils.add(new Type((CommonTree) tree.getChild(i), types_valides, true));
                    // On vérifie que les types des fils sont valides
                    for (int j = 0; j < types_valides.size(); j++) {
                        if (!fils.get(i).isEgal(types_valides.get(j))){
                            isValide = false;
                        }
                    }
                }
                break;
        }

        // Si tout s'est bien passé jusque là, on vérifie si le type final est valide
        if (isValide){
            isValide = false;
            for (int i = 0; i < types_valides.size(); i++) {
                // Si le type est découvert (et qu'il existe donc) on valide
                if (this.isEgal(types_valides.get(i))){
                    isValide = true;
                }
            }
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
    public int getTaille(){
        int i = 0;
        for (int j = 0; j < fils.size(); j++) {
            switch (fils.get(i).token){
                case Mini_Rust2Lexer.T__50 : // i32
                    i += 4;
                    break;
                case Mini_Rust2Lexer.T__51 : // bool
                    i += 1;
                    break;
                case Mini_Rust2Lexer.T__49 : // pointeur
                    i += 6;
                    break;
                // Manque les struct ?
                default:
                    i += fils.get(i).getTaille();
                    break;
            }
        }
        return i;
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
            case Mini_Rust2Lexer.T__50:
                return "i32";
            case Mini_Rust2Lexer.T__51:
                return "bool";
            case Mini_Rust2Lexer.T__49:
                return "*";
            case Mini_Rust2Lexer.STRUCT:
            	return "struct";
            case Mini_Rust2Lexer.VEC:
            	return "vec";
            default:
                return "erreur: "+Mini_Rust2Lexer.T__49;
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
        if (type1.fils.size() != type2.fils.size() && type1.token != type2.token) return false;

        boolean res;

        for (int i=0; i<type1.fils.size(); i++)
        {
            res = iIsEgal(type1.fils.get(i), type2.fils.get(i));
            if (!res) return false;
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
     */
    public boolean isCondition() {
    	if((this.fils).size() == 1){
    		if (this.token == Mini_Rust2Lexer.T__50) {
    			//cas du i32
    			return true;
    		}
    	}else if(this.token == Mini_Rust2Lexer.T__51){
    		//Cas du boolean
    		return true;
    	}else if(true) {
    		
    	}
    	return false;
    }
}
