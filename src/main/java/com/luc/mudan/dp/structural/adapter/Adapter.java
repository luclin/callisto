package com.luc.mudan.dp.structural.adapter;

/**
 * @author : luc
 * @date : 2019-03-22 15:29
 * Description:
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething(String param) {
        Integer type = Integer.valueOf(param);
        adaptee.specificRequest(type);
    }
}
