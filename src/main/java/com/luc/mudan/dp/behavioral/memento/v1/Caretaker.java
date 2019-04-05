package com.luc.mudan.dp.behavioral.memento.v1;

/**
 * @author : luc
 * @date : 2019-04-05 18:18
 * Description:
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
