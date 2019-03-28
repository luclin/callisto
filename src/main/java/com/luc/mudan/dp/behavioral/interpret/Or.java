package com.luc.mudan.dp.behavioral.interpret;

/**
 * @author : luc
 * @date : 2019-03-26 14:23
 * Description:
 */
public class Or extends Expression {
    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left; this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Or) {
            return left.equals(((Or)obj).left) && right.equals(((Or) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}
