package com.luc.mudan.dp.behavioral.memento.v3;

import com.luc.mudan.dp.behavioral.memento.v2.MementoIF;

/**
 * @author : luc
 * @date : 2019-04-06 15:45
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        //修改状态
        o.changeState("state 0");
        //创建备忘录
        MementoIF memento = o.createMement();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
    }
}
