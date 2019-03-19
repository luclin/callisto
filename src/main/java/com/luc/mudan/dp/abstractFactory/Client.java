package com.luc.mudan.dp.abstractFactory;

/**
 * @author : luc
 * @date : 2019-03-19 09:29
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        RobotFactory beta = new RobotBetaFactory();
        RobotBody betaBody = beta.createRobotBody();
        RobotTheme betaTheme = beta.createRobotTheme();
        betaBody.build();
        betaTheme.print();


        RobotFactory release = new RobotReleaseFactory();
        RobotBody releaseBody = release.createRobotBody();
        RobotTheme releaseTheme = release.createRobotTheme();
        releaseBody.build();
        releaseTheme.print();


    }
}
