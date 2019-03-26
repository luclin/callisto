package com.luc.mudan.dp.structural.adapter;

/**
 * @author : luc
 * @date : 2019-03-22 15:30
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.doSomething("123");
    }
}
