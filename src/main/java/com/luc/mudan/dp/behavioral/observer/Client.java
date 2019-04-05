package com.luc.mudan.dp.behavioral.observer;

/**
 * @author : luc
 * @date : 2019-04-05 11:48
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Observer p1 = new ConcreteObserverA("p1");
        Observer p2 = new ConcreteObserverB("p2");
        Observer p3 = new ConcreteObserverB("p3");

        Subject s1 = new ConcreteSubjectA();
        Subject s2 = new ConcreteSubjectB();

        s1.addObserver(p1);s1.addObserver(p2);s1.addObserver(p3);

        s2.addObserver(p1);s2.addObserver(p3);

        System.out.println("------- s1 ------- ");
        s1.doit("s1 send 1");
        s1.doit("s1 send 2");
        System.out.println("------- s2 ------- ");
        s2.doit("s2 send 1 ...");
        s2.doit("s2 send 2 ...");
        s2.doit("s2 send 3 ...");

    }
}