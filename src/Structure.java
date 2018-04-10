import java.util.ArrayList;

public class Structure {

    private String struct_name;
    private ArrayList<String> champs;
    private ArrayList<Type> types;
    private int taille=0;

    public Structure(String n, ArrayList<String> c, ArrayList<Type> types){
        struct_name=n;
        champs=c;
        this.types = types;
        for (int i = 0; i < types.size(); i++) {
            taille += types.get(i).getTaille();
        }
    }

    public int getTaille(){
        return taille;
    }

    public String getStruct_name() {
        return struct_name;
    }

    public void setStruct_name(String struct_name) {
        this.struct_name = struct_name;
    }

    public ArrayList<String> getChamps() {
        return champs;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setChamps(ArrayList<String> champs) {
        this.champs = champs;
    }

}
