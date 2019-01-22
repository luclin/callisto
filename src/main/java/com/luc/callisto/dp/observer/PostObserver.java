package com.luc.callisto.dp.observer;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:28
 * Description:
 */
public class PostObserver implements Observer {
    public void notify(String msg) {
        if (msg != null && msg.contains("post")) {
            System.out.println("I am Post" + msg);
        }
    }
}
