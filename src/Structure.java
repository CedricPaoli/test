import java.util.ArrayList;

public class Structure {

    private String struct_name;
    private ArrayList<String> champs;

    public Structure(String n, ArrayList<String> c){
        struct_name=n;
        champs=c;
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

    public void setChamps(ArrayList<String> champs) {
        this.champs = champs;
    }

}
