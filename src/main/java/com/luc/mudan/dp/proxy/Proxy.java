package com.luc.mudan.dp.proxy;

/**
 * @author : luc
 * @date : 2019-03-22 11:53
 * Description:
 */
public class Proxy implements Subject {
    private Subject subject ;

    public Proxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void request() {
        System.out.println("Proxy start .....");
        subject.request();
        System.out.println("Proxy end .....");
    }
}
