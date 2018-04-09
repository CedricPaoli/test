import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

public class TDS {

    // Travail Ced :
    // Tableau des structure static à contrôler
    // Verif si le type/ la struct est valide

    private int num_block;
    private int father_num_block;
    private ArrayList<String> nom = new ArrayList<String>();
    private ArrayList<Type> type = new ArrayList<Type>();
    private ArrayList<ArrayList<Type>> argument = new ArrayList<>();
    private ArrayList<Object> val = new ArrayList<>();
    private ArrayList<Integer> depl = new ArrayList<Integer>();

    static public ArrayList<TDS> tablesDesSymboles = new ArrayList<TDS>();

    public TDS (int indice, int nPere){
        num_block = indice;
        father_num_block = nPere;
    }

    /**
     * Enregistre le numéro du block parent
     * @param num le numéro de block parent à conserver
     */
    public void setFather_num_block(int num) {
    	father_num_block = num;
    }

    /**
     * Permet d'obtenir le numéro du block parent
     * @return le numéro du block parent
     */
    public int getFather_num_block() {
    	return father_num_block;
    }


    /**
     * Permet d'obtenir le nom d'une variable de la TDS
     * @param indice indice de la variable dont on veut obtenir le nom
     * @return le nom de la variable à l'indice "indice"
     */
    public String getNom(int indice){
        return nom.get(indice);
    }

    /**
     * Permet d'obtenir le déplacement correspondant à une ligne de la TDS
     * @param indice l'indice de la ligne dont on souhaite le déplacement
     * @return le déplacement en octet lié à la ligne consultée
     */
    public Integer getDepl(int indice){
        return depl.get(indice);
    }

    /**
     * Permet d'obtenir la valeur correspondante à une ligne de la TDS
     * @param indice l'indice de la ligne dont on souhaite la valeur
     * @return la valeur lié à la ligne consultée
     */
    public Object getVal(int indice){
        return val.get(indice);
    }

    /**
     * Permet d'obtenir le numéro du block courant
     * @return le numéro du block courant
     */
    public int getNum_block(){
        return num_block;
    }

    /**
     * Permet d'ajouter une ligne à la TDS
     * @param nomVar nom de la variable à ajouter sur la ligne
     * @param typeVar type de la variable ajoutée
     * @param valeur valeur de la variable ajoutée
     * @param deplacement déplacement associé à variable
     */
    public void setLigne(String nomVar, Type typeVar, Object valeur,Integer deplacement){
        nom.add(nomVar);
        type.add(typeVar);
        val.add(valeur);
        argument.add(null);
        depl.add(deplacement);
    }

    /**
     * Permet de paramétrer la valeur liée à une variable
     * @param o valeur de la variable
     * @param indice indice ascocié dans la TDS
     */
    public void setVal(Object o,int indice){
        val.set(indice,o);
    }

    /**
     * Permet de paramétrer le type lié à une variable
     * @param nomVar nom de la variable
     * @param nomType type de la variable
     */
    public void setType(String nomVar, Type nomType){
        type.set(nom.indexOf(nomVar),nomType);

    }

    //Fonctions réellements utiles

    /**
     * Permet d'ajouter une ligne à la TDS (calcul automatique du déplacement en fonction du type)
     * @param nomVar nom de la variable
     * @param typeVar type de la variable
     * @param valeur valeur de la variable
     */
    public void ajouter(String nomVar, Type typeVar, Object valeur)
    {
        nom.add(nomVar);
        type.add(typeVar);
        val.add(valeur);
        argument.add(null);
        if (depl.size()>0) {
            depl.add(depl.get(depl.size()-1)+typeVar.getTaille());
        } else {
            depl.add(typeVar.getTaille());
        }
    }

    /**
     * Permet d'ajouter une fonction à la TDS
     * @param nomVar nom de la fonction
     * @param typeVar type de retour de la fonction
     * @param arguments les types des arguments de la fonction sous forme d'une ArrayList<Type>
     * @param valeur la valeur de retour de la fonction
     */
    public void ajouter(String nomVar, Type typeVar, ArrayList<Type> arguments, Object valeur)
    {
        nom.add(nomVar);
        type.add(typeVar);
        val.add(valeur);
        argument.add(arguments);
        if (depl.size()>0) {
            depl.add(depl.get(depl.size()-1)+typeVar.getTaille());
        } else {
            depl.add(typeVar.getTaille());
        }
    }

    /**
     * Permet de savoir si une variable/fonction est présente dans la TDS courante
     * @param nomVar nom de la variable à contrôler
     * @return true si la variable est présente, false sinon
     */
    public boolean isVariableIn (String nomVar){
        return nom.contains(nomVar);
    }

    /**
     * Permet d'obtenir le type lié à une ligne de la TDS
     * @param i indice de la ligne
     * @return type associé à l'indice "i" dans la TDS courante
     */
    public Type getType(int i)
    {
        return type.get(i);
    }

    /**
     * Permet d'obtenir l'indice de la ligne asscociée à une variable
     * @param nomVar nom de la variable
     * @return indice dans la table des symboles courante
     */
    public int getLigne(String nomVar)
    {
        return nom.indexOf(nomVar);
    }

    /**
     * Permet d'obtenir la liste des arguments associés à une fonction dans la TDS courante
     * @param nom_fn nom de la fonction
     * @return les types des argument de la fonction sous forme d'une ArrayList<Type>
     */
    public ArrayList<Type> getArgOf(String nom_fn){
        int ligne = this.getLigne(nom_fn);
        return argument.get(ligne);
    }

    /**
     * Permet d'avoir un affichage en console de la TDS
     */
    public void displayTDS(){
        System.out.printf("--------------------------------- TDS n°%-2s parent: %-2s --------------------------------\n", num_block, father_num_block);
        for(String n : nom){
            System.out.printf("| nom : %-20s", n);
            System.out.printf("  type : %-10s", type.get(nom.indexOf(n)));
            System.out.printf ("  valeur : %-5s", val.get(nom.indexOf(n)));
            System.out.printf("  déplacement : %-5s | \n", depl.get(nom.indexOf(n)));
            if (argument.get(nom.indexOf(n)) != null) {
            	//System.out.println(argument.get(nom.indexOf(n)).toString());
            	System.out.printf("| paramètres : %-69s |\n", argument.get(nom.indexOf(n)).toString());
            }
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
    }

    static public TDS getTDS(int numBloc)
    {
        for (int i=0; i<tablesDesSymboles.size(); i++)
        {
            if (tablesDesSymboles.get(i).getNum_block() == numBloc) return tablesDesSymboles.get(i);
        }
        return null;
    }
}
