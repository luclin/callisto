package com.luc.mudan.dp.behavioral.memento.v1;

/**
 * @author : luc
 * @date : 2019-04-05 18:16
 * Description:
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
