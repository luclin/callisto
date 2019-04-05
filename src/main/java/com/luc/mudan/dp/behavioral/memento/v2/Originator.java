package com.luc.mudan.dp.behavioral.memento.v2;

/**
 * @author : luc
 * @date : 2019-04-05 18:22
 * Description:
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }
    public MementoIF createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(MementoIF memento) {
        Memento m = (Memento) memento;
        this.setState(m.getState());
    }

    class Memento implements MementoIF {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
