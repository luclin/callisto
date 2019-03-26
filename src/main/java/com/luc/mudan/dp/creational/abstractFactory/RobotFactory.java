package com.luc.mudan.dp.creational.abstractFactory;

/**
 * @author : luc
 * @date : 2019-03-19 09:25
 * Description:
 */
public interface RobotFactory {
    public RobotBody createRobotBody();

    public RobotTheme createRobotTheme();
}
