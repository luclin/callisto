package com.luc.mudan.dp.structural.flyweight.demo;

/**
 * @author : luc
 * @date : 2019-03-25 10:38
 * Description:
 */
public class ConcreteFlyweight implements Flyweight {

    private String str;

    public ConcreteFlyweight(String str) {
        this.str = str;
    }
    @Override
    public void operation(String state) {
        System.out.println("内状态："+str);
        System.out.println("外状态："+state);
    }
}
