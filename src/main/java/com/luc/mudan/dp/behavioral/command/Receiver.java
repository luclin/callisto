package com.luc.mudan.dp.behavioral.command;

/**
 * @author : luc
 * @date : 2019-04-07 07:23
 * Description:
 */
public class Receiver {
    public void action() {
        System.out.println("执行 ... ");
    }
    public void unAction() {
        System.out.println("撤销 ... ");
    }
}
