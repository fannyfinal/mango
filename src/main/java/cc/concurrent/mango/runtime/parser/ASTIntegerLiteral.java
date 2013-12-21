package cc.concurrent.mango.runtime.parser;

import cc.concurrent.mango.runtime.RuntimeContext;

/**
 * @author ash
 */
public class ASTIntegerLiteral extends SimpleNode {

    private Integer value;

    public ASTIntegerLiteral(int i) {
        super(i);
    }

    public ASTIntegerLiteral(Parser p, int i) {
        super(p, i);
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public Object value(RuntimeContext context) {
        return value;
    }

}