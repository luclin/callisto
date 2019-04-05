package com.luc.mudan.dp.behavioral.state;

/**
 * @author : luc
 * @date : 2019-04-05 10:44
 * Description:
 */
public class Context {
    private State state;

    public Context() {
        this.state = new BoyState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
