package com.luc.mudan.dp.structural.decorator;

/**
 * @author : luc
 * @date : 2019-03-18 19:59
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.doSomething();
    }
}
