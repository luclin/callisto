package com.luc.mudan.dp.behavioral.templateMethod;

/**
 * @author : luc
 * @date : 2019-04-02 09:28
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Generalization one = new ConcreteOne();
        Generalization two = new ConcreteTwo();

        one.start();
        two.start();
    }
}
