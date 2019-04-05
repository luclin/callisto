package com.luc.mudan.dp.behavioral.state;

/**
 * @author : luc
 * @date : 2019-04-05 10:58
 * Description:
 */
public class FatherState implements State {
    @Override
    public void doing() {
        System.out.println("Doing Father style ...");
    }

    @Override
    public void thinking() {
        System.out.println("Thing Father style ...");
    }
}
