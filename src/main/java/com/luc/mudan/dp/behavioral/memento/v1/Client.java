package com.luc.mudan.dp.behavioral.memento.v1;

/**
 * @author : luc
 * @date : 2019-04-05 18:19
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker =new Caretaker();

        originator.setState("state 1 ....");
        caretaker.saveMemento(originator.createMemento());

        originator.setState("state 2 ....");

        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator.getState());
    }
}
