package com.luc.mudan.dp.behavioral.chainOfResponsibility;

/**
 * @author : luc
 * @date : 2019-03-25 21:12
 * Description:
 */
public class ProjectManager extends Handler {
    @Override
    public void handleBudgetRequest(double money) {
        if (money < 100) {
            System.out.println(" Manager approve ...");
            return;
        }
        if (getSuccessor() != null) {
            getSuccessor().handleBudgetRequest(money);
            return;
        }
        System.out.println("It has something wrong ...");
    }
}
