package com.luc.mudan.dp.behavioral.state;

/**
 * @author : luc
 * @date : 2019-04-05 10:57
 * Description:
 */
public class ManState implements State {
    @Override
    public void doing() {
        System.out.println("Doing Man style ...");
    }

    @Override
    public void thinking() {
        System.out.println("Thing Man style ...");
    }
}
