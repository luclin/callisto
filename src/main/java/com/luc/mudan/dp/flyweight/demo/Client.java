package com.luc.mudan.dp.flyweight.demo;

/**
 * @author : luc
 * @date : 2019-03-25 10:42
 * Description:
 */
public class Client {
    public static void main(String[] str) {
        FlyWeightFactory factory = new FlyWeightFactory();
        ConcreteFlyweight f1 = factory.factory("a1");
        ConcreteFlyweight f2 = factory.factory("b1");
        ConcreteFlyweight f3 = factory.factory("c1");
        f1.operation("a2 ");
        f2.operation("b2 ");
        f3.operation("c2 ");
    }
}
