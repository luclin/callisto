package com.luc.mudan.dp.behavioral.command;

/**
 * @author : luc
 * @date : 2019-04-07 07:27
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command c1 = new ConcreteCommandA("c1",receiver);
        Command c2 = new ConcreteCommandB("c2", receiver);

        Invoker i1 = new Invoker(c1);
        Invoker i2 = new Invoker(c2);

        i1.runCommand();
        i1.undoCommand();

        System.out.println("--------------------------");
        i2.runCommand();
        i2.undoCommand();

    }
}
