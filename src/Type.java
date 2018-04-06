import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.BaseTreeAdaptor;

import java.util.ArrayList;

public class Type
{
    private int token = -1;
    private boolean isValide; //Est-ce que le type est valide
    private ArrayList<Type> fils = new ArrayList<Type>();

    public Type(CommonTree tree){
        token = tree.getToken().getType();

        for (int i = 0; i < tree.getChildCount(); i++) {
            fils.add(new Type((CommonTree) tree.getChild(i)));
        }
        isValide = true;
    }

    public Type(){
        token = -1;
        isValide = true;
    }

    public Type(CommonTree tree, boolean transformation){
        switch (tree.getToken().getType()) {
            case Mini_Rust2Lexer.T__65: //True
            case Mini_Rust2Lexer.T__66: //False
            case Mini_Rust2Lexer.T__76: //&&
            case Mini_Rust2Lexer.T__77: //||
            case Mini_Rust2Lexer.T__47: //<
            case Mini_Rust2Lexer.T__48: //>
            case Mini_Rust2Lexer.T__73: //<=
            case Mini_Rust2Lexer.T__72: //>=
                token = Mini_Rust2Lexer.T__51;
                break;
            case Mini_Rust2Lexer.CST_ENT: //CST_ENT
            case Mini_Rust2Lexer.T__71: //+
            case Mini_Rust2Lexer.T__69: //-
            case Mini_Rust2Lexer.T__67: //-
                token = Mini_Rust2Lexer.T__50;
                break;
            case Mini_Rust2Lexer.IDF: //IDF
                token = Mini_Rust2Lexer.T__50;
                System.out.println("corriger dans type");
                break;
            default:
                for (int i=0; i<tree.getChildCount(); i++) {
                    fils.add(new Type((CommonTree) tree.getChild(i), true));
                }
                break;
        }
        isValide = true;
    }
    
    public boolean isInteger( String input ){
       try{
          Integer.parseInt( input );
          return true;
       }
       catch( Exception e){
          return false;
       }
    }

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

    public boolean isEgal(Type type)
    {
        return iIsEgal(this, type);
    }

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

    public boolean gIsValide()
    {
        return isValide;
    }
/*
    public CommonTree getCommon_tree() {
        return common_tree;
    }
  */
}
