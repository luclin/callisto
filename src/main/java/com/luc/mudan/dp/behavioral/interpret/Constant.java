package com.luc.mudan.dp.behavioral.interpret;

/**
 * @author : luc
 * @date : 2019-03-26 14:20
 * Description:
 */
public class Constant extends Expression {

    private Boolean value;

    public Constant(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Boolean) {
            this.value.equals(((Constant)obj).value);
        }
        return false;
    }

    @Override
    public boolean interpret(Context ctx) {
        return value;
    }
}
