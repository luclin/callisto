package com.luc.callisto.dp.observer;


/**
 * @author : linweizhong
 * @date : 2019-01-22 19:26
 * Description:
 */
public class NYObserser implements Observer {
    public void notify(String msg) {
        if (msg != null && msg.contains("ny")) {
            System.out.println("I am NY Time" + msg);
        }
    }
}
