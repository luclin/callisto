package com.luc.mudan.dp.proxy;

/**
 * @author : luc
 * @date : 2019-03-22 11:52
 * Description:
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("I am RealSubject");
    }
}
