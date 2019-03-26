package com.luc.mudan.dp.structural.adapter;

/**
 * @author : luc
 * @date : 2019-03-22 15:27
 * Description:
 */
public class Adaptee {
    public void specificRequest(Integer type) {
        System.out.println("I am Specific Request : Type " + type);
    }
}
