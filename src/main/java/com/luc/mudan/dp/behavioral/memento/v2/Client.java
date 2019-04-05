package com.luc.mudan.dp.behavioral.memento.v2;

/**
 * @author : luc
 * @date : 2019-04-05 18:30
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();

        o.setState("On");

        c.saveMemento(o.createMemento());

        o.setState("Off");

        o.restoreMemento(c.retrieveMemento());
    }
}
