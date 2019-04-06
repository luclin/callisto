package com.luc.mudan.dp.behavioral.memento.v3;

import com.luc.mudan.dp.behavioral.memento.v2.MementoIF;

/**
 * @author : luc
 * @date : 2019-04-06 07:22
 * Description:
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }
    public void changeState(String state){
        this.state = state;
        System.out.println("状态改变为：" + state);
    }


    public Memento createMement() {
        return new Memento(this);
    }

    public void restoreMemento(MementoIF mementoIF) {
        Memento memento = (Memento) mementoIF;
        changeState(memento.getState());
    }

    class Memento implements MementoIF {
        String state;

        public Memento(Originator o) {
            this.state = o.state;
        }
        public String getState() {
            return state;
        }
    }
}
