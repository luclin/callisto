package com.luc.mudan.dp.behavioral.command;

/**
 * @author : luc
 * @date : 2019-04-07 07:20
 * Description:
 */
public interface Command {
    void execute();
    void undo();
}
