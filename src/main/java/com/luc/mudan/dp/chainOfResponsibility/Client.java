package com.luc.mudan.dp.chainOfResponsibility;

/**
 * @author : luc
 * @date : 2019-03-25 21:17
 * Description:
 */
public class Client {
    public static void main(String[] str) {
        Handler h1 = new ProjectManager();
        Handler h2 = new DeptManager();
        Handler h3 = new GeneralManager();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        h1.handleBudgetRequest(10);
        h1.handleBudgetRequest(500);
        h1.handleBudgetRequest(1000000);
    }
}
