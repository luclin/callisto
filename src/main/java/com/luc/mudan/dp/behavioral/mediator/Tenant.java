package com.luc.mudan.dp.behavioral.mediator;

/**
 * @author : luc
 * @date : 2019-04-06 15:59
 * Description:
 */
public class Tenant extends Person {

    Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message, this);
    }
    public void getMsg(String message){
        System.out.println("租房者:" + name +",获得信息：" + message);
    }
}
