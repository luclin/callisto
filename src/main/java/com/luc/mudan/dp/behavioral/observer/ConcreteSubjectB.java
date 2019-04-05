package com.luc.mudan.dp.behavioral.observer;

/**
 * @author : luc
 * @date : 2019-04-05 11:43
 * Description:
 */
public class ConcreteSubjectB extends Subject {
    @Override
    void doit(String msg) {
        System.out.println("ConcreteSubjectB ....");
        notification(msg);
    }

    @Override
    void notification(String msg) {
        this.observers.forEach(observer -> observer.update("b", msg));
    }
}
