package com.luc.mudan.dp.behavioral.command;

/**
 * @author : luc
 * @date : 2019-04-07 07:27
 * Description:
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void runCommand() {
        command.execute();
    }
    public void undoCommand() {
        command.undo();
    }
}
