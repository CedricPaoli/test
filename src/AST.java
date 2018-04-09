package src;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

public class AST extends CommonTree{
    public String text;

    public AST(Token t) {
        super(t);
        text = (t != null? t.getText(): "[]");
    }

    public String toString() {
        return text + super.toString();
    }
}
