import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.BaseTreeAdaptor;

public class Type
{
    boolean isValide; //Est-ce que le type est valide

    CommonTree common_tree;

    public Type (CommonTree tree){
        common_tree = dupTree(tree);
        isValide = true;
    }

    public Type(CommonTree tree, boolean transformation){
        common_tree = valToType(tree);
        isValide = true;
    }

    public CommonTree valToType(CommonTree tree){
        for (int i = 0; i < tree.getChildCount(); i++) {
            switch (tree.getChild(i).getText()){
            }
        }
        return tree;
    }

    public CommonTree dupTree(CommonTree tree){
        CommonTree ct = new CommonTree();
        for (int i = 0; i < tree.getChildCount(); i++) {
            ct.addChild(tree.getChild(i));
        }
        return ct;
    }

    public int getTaille(){
        int i = 0;
        for (int j = 0; j < this.common_tree.getChildCount(); j++) {
            switch (this.common_tree.getChild(i).hashCode()){
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
                    i += (new Type((CommonTree) this.common_tree.getChild(i))).getTaille();
                    break;
            }
        }
        return i;
    }

    public String toString()
    {
        if (common_tree.isNil()){
            return "void";
        } else {
            return common_tree.toString();
        }
    }


    public boolean gIsValide()
    {
        return isValide;
    }

    public CommonTree getCommon_tree() {
        return common_tree;
    }
}
