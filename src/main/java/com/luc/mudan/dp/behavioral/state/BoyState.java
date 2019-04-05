package com.luc.mudan.dp.behavioral.state;

/**
 * @author : luc
 * @date : 2019-04-05 10:56
 * Description:
 */
public class BoyState implements State {
    @Override
    public void doing() {
        System.out.println("Doing Boy style ...");
    }

    @Override
    public void thinking() {
        System.out.println("Thing Boy style ...");
    }
}
