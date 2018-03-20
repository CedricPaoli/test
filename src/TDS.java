import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;

public class TDS {

    private int num_block;
    private int father_num_block;
    private ArrayList<String> nom;
    private ArrayList<Type> type;
    private ArrayList<Object> val;
    private ArrayList<Integer> depl;

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
        depl.add(depl.get(depl.size()-1)+typeVar.getTaille());
    }

    public void setVal(Object o,int indice){
        val.set(indice,o);
    }

    public void setVal(String nomVar, String v) {
        val.set(nom.indexOf(nomVar), v);
    }

    public boolean isVariableIn (String nomVar){
        return nom.contains(nomVar);
    }

    public void displayTDS(){
        System.out.println("------------------------  " + num_block +" -----------------------------");
        for(String n : nom){
            System.out.println(n);
            System.out.print(type.get(nom.indexOf(n)));
            System.out.print(val.get(nom.indexOf(n)));
            System.out.print(depl.get(nom.indexOf(n)));
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}
