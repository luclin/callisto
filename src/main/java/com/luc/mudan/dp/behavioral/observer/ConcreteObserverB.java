package com.luc.mudan.dp.behavioral.observer;

/**
 * @author : luc
 * @date : 2019-04-05 11:45
 * Description:
 */
public class ConcreteObserverB implements Observer {
    private String name;

    public ConcreteObserverB(String name) {
        this.name = name;
    }
    @Override
    public void update(String type, String msg) {
        if (type.equals("a")) {
            System.out.println("ConcreteObserverB("+name+") receive ConcreteSubjectA :" + msg);
        }
        if (type.equals("b")) {
            System.out.println("ConcreteObserverB("+name+") receive ConcreteSubjectB :" + msg);
        }
    }
}