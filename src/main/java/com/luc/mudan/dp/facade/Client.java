package com.luc.mudan.dp.facade;

/**
 * @author : luc
 * @date : 2019-03-25 11:51
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        computer.shutdown();
    }
}
