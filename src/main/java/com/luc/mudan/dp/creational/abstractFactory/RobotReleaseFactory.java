package com.luc.mudan.dp.creational.abstractFactory;

/**
 * @author : luc
 * @date : 2019-03-19 09:29
 * Description:
 */
public class RobotReleaseFactory implements RobotFactory {

    @Override
    public RobotTheme createRobotTheme() {
        return new SportRobotTheme();
    }

    @Override
    public RobotBody createRobotBody() {
        return new TitaniumRobotBody();
    }
}
