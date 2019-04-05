package com.luc.mudan.dp.behavioral.memento.v2;

/**
 * @author : luc
 * @date : 2019-04-05 18:27
 * Description:
 */
public class Caretaker {

    private MementoIF memento;

    public MementoIF retrieveMemento(){
        return memento;
    }

    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
}
