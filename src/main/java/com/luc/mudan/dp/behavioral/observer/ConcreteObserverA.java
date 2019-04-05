package com.luc.mudan.dp.behavioral.observer;

/**
 * @author : luc
 * @date : 2019-04-05 11:43
 * Description:
 */
public class ConcreteObserverA implements Observer {
    private String name;

    public ConcreteObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update(String type, String msg) {
        if (type.equals("a")) {
            System.out.println("ConcreteObserverA("+ name + ")receive ConcreteSubjectA :" + msg);
        }
        if (type.equals("b")) {
            System.out.println("ConcreteObserverA("+ name + ")receive ConcreteSubjectB :" + msg);
        }
    }
}
