package com.luc.mudan.dp.behavioral.interpret;


/**
 * @author : luc
 * @date : 2019-03-26 14:06
 * Description:
 * Name
 * desc
 * Expression
 *           Constant | Variable | Or | And | Not
 * And
 *           Expression 'AND' Expression
 * Or
 *           Expression 'OR' Expression
 * Not
 *          'NOT' Expression
 * Variable
 *          任何标识符
 * Constant
 *          'true' | 'false'
 *

 */
public abstract class Expression {
    public abstract boolean interpret(Context ctx);

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();
}
