package com.luc.mudan.dp.strategy;

/**
 * @author : luc
 * @date : 2019-03-06 09:33
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Strategy s1 = new ConcreteStrategyAdd();
        Strategy s2 = new ConcreteStrategyMulti();
        Context context = new Context(s1);

        System.out.println(context.getArr());

        context.contextInterface();
        System.out.println(context.getArr());

        context.setStrategy(s2);
        context.contextInterface();
        System.out.println(context.getArr());


    }
}
