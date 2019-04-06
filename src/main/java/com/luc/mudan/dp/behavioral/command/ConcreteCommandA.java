package com.luc.mudan.dp.behavioral.command;

/**
 * @author : luc
 * @date : 2019-04-07 07:20
 * Description:
 */
public class ConcreteCommandA implements Command {
    String name;
    Receiver receiver;

    public ConcreteCommandA(String name, Receiver receiver) {
        this.name = name;
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        System.out.print(name + ":\t");
        receiver.action();
    }

    @Override
    public void undo() {
        System.out.print(name + ":\t");
        receiver.unAction();
    }
}
