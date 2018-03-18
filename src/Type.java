import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.BaseTreeAdaptor;

public class Type extends CommonTree
{
    boolean isValide; //Est-ce que le type est valide

    Type common_tree;

    public Type (CommonTree tree){
        common_tree = dupTree(tree);
        isValide = true;
    }

    public Type dupTree(CommonTree tree){
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
                case Mini_Rust2Lexer.T__49 :
                    i += 4;
                    break;
                default:
                    i += (new Type((CommonTree) this.common_tree.getChild(i))).getTaille();
                    break;
            }
        }
        return i;
    }

    public String toString()
    {
        String res = "";

        return res;
    }

    public boolean gIsValide()
    {
        return isValide;
    }

    public CommonTree getCommon_tree() {
        return common_tree;
    }
}
