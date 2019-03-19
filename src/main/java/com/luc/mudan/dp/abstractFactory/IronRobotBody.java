package com.luc.mudan.dp.abstractFactory;

/**
 * @author : luc
 * @date : 2019-03-19 09:20
 * Description:
 */
public class IronRobotBody implements RobotBody {
    @Override
    public void build() {
        System.out.println("build Iron Robot Body");
    }
}
