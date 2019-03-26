package com.luc.mudan.dp.creational.abstractFactory;

/**
 * @author : luc
 * @date : 2019-03-19 09:27
 * Description:
 */
public class RobotBetaFactory implements RobotFactory {

    @Override
    public RobotBody createRobotBody() {
        return new IronRobotBody();
    }

    @Override
    public RobotTheme createRobotTheme() {
        return new RedRobotTheme();
    }
}
