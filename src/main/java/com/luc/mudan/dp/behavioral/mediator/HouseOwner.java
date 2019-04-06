package com.luc.mudan.dp.behavioral.mediator;

/**
 * @author : luc
 * @date : 2019-04-06 15:58
 * Description:
 */
public class HouseOwner extends Person {

    HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String msg) {
        mediator.constact(msg, this);
    }

    public void getMsg(String message) {
        System.out.println("房主:" + name +",获得信息：" + message);
    }
}
