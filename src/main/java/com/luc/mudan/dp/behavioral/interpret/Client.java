package com.luc.mudan.dp.behavioral.interpret;

/**
 * @author : luc
 * @date : 2019-03-26 14:24
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("X");
        Variable y = new Variable("Y");

        Constant constant = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression expression = new Or(new And(constant,x), new And(y, new Not(x)));
        System.out.println("X = " + x.interpret(ctx));
        System.out.println("Y = " + y.interpret(ctx));
        System.out.println(expression.toString() + " = " + expression.interpret(ctx));

    }
}
