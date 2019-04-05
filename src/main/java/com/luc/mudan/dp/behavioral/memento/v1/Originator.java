package com.luc.mudan.dp.behavioral.memento.v1;

/**
 * @author : luc
 * @date : 2019-04-05 18:15
 * Description:
 */
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }
}
