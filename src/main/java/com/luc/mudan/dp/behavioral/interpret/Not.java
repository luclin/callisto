package com.luc.mudan.dp.behavioral.interpret;

/**
 * @author : luc
 * @date : 2019-03-26 14:23
 * Description:
 */
public class Not extends Expression {
    private Expression expr;

    public Not(Expression expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret(Context ctx) {
        return !expr.interpret(ctx);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof And) {
            return expr.equals(((Not)obj).expr);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(NOT " + expr.toString() + ")";
    }
}
