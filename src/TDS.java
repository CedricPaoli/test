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

    public TDS (int indice, int nPere){
        num_block = indice;
        father_num_block = nPere;
    }
    
    public void setFather_num_block(int num) {
    	father_num_block = num;
    }
    
    public int getFather_num_block() {
    	return father_num_block;
    }

    public String getNom(int indice){
        return nom.get(indice);
    }


    public Integer getDepl(int indice){
        return depl.get(indice);
    }

    public Object getVal(int indice){
        return val.get(indice);
    }

    public int getNum_block(){
        return num_block;
    }

    public void setLigne(String nomVar, Type typeVar, Object valeur,Integer deplacement){
        nom.add(nomVar);
        type.add(typeVar);
        val.add(valeur);
        argument.add(null);
        depl.add(deplacement);
    }

    public void setVal(Object o,int indice){
        val.set(indice,o);
    }


    public void setType(String nomVar, Type nomType){
        type.set(nom.indexOf(nomVar),nomType);

    }

    //Fonctions reellements utiles
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

    public boolean isVariableIn (String nomVar){
        return nom.contains(nomVar);
    }

    public Type getType(int i)
    {
        return type.get(i);
    }

    public int getLigne(String nomVar)
    {
        return nom.indexOf(nomVar);
    }

    public ArrayList<Type> getArgOf(String nom_fn){
        int ligne = this.getLigne(nom_fn);
        return argument.get(ligne);
    }

    public void displayTDS(){
        System.out.printf("--------------------------------- TDS n°%-2s parent: %-2s --------------------------------\n", num_block, father_num_block);
        for(String n : nom){
            System.out.printf("| nom : %-20s", n);
            System.out.printf("  type : %-10s", type.get(nom.indexOf(n)));
            System.out.printf ("  valeur : %-5s", val.get(nom.indexOf(n)));
            System.out.printf("  déplacement : %-5s | \n", depl.get(nom.indexOf(n)));
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("");
    }
}
