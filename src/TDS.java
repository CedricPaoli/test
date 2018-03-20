import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

public class TDS {

    private int num_block;
    private int father_num_block;
    private ArrayList<String> nom = new ArrayList<String>();
    private ArrayList<Type> type = new ArrayList<Type>();
    private ArrayList<Object> val = new ArrayList<>();
    private ArrayList<Integer> depl = new ArrayList<Integer>();

    public TDS (int indice, int num){
        num_block = indice;
        father_num_block = num;
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
/*
    public String getType(int indice){
        return type.get(indice);
    }
*/
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
        depl.add(deplacement);
    }

    public void ajouter(String nomVar, Type typeVar, Object valeur)
    {
        nom.add(nomVar);
        type.add(typeVar);
        val.add(valeur);
        if (depl.size()>0) {
            depl.add(depl.get(depl.size()-1)+typeVar.getTaille());
        } else {
            depl.add(typeVar.getTaille());
        }
    }

    public void setVal(Object o,int indice){
        val.set(indice,o);
    }


    public void setType(String nomVar, Type nomType){
        type.set(nom.indexOf(nomVar),nomType);

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

    public void displayTDS(){
        System.out.println("------------------------  " + num_block +" -----------------------------");
        for(String n : nom){
            System.out.print("nom : "+n);
            System.out.print(", type : "+type.get(nom.indexOf(n)));
            System.out.print(", valeur : "+val.get(nom.indexOf(n)));
            System.out.println(", déplacement : "+depl.get(nom.indexOf(n)));
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}
