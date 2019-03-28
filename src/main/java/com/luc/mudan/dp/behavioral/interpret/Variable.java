package com.luc.mudan.dp.behavioral.interpret;

/**
 * @author : luc
 * @date : 2019-03-26 14:11
 * Description:
 */
public class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!= null && obj instanceof Variable) {
            return this.name.equals(((Variable) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }
}
