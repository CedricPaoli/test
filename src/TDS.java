import java.util.ArrayList;

public class TDS {

    private int num_block;
    private ArrayList<String> nom;
    private ArrayList<String> type;
    private ArrayList<Object> val;
    private ArrayList<Integer> depl;

    public TDS (int indice){
        num_block = indice;
    }

    public String getNom(int indice){
        return nom.get(indice);
    }

    public String getType(int indice){
        return type.get(indice);
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

    public void setLigne(String nomVar, String typeVar, Object valeur,Integer deplacement){
        nom.add(nomVar);
        type.add(typeVar);
        val.add(valeur);
        depl.add(deplacement);
    }

    public void  setVal(Object o,int indice){
        val.set(indice,o);
    }

    public boolean isVariableIn (String nomVar){
        return nom.contains(nomVar);
    }
}
