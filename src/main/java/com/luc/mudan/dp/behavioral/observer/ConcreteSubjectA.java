package com.luc.mudan.dp.behavioral.observer;

/**
 * @author : luc
 * @date : 2019-04-05 11:42
 * Description:
 */
public class ConcreteSubjectA extends Subject {
    @Override
    void doit(String msg) {
        System.out.println("ConcreteSubjectA ....");
        this.notification(msg);
    }

    @Override
    void notification(String msg) {
        this.observers.forEach(observer -> observer.update("a", msg));
    }
}
