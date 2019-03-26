package com.luc.mudan.dp.behavioral.chainOfResponsibility;

/**
 * @author : luc
 * @date : 2019-03-25 21:15
 * Description:
 */
public class DeptManager extends Handler {
    @Override
    public void handleBudgetRequest(double money) {
        if (money < 1000) {
            System.out.println(" DeptManager approve ...");
            return;
        }
        if (getSuccessor() != null) {
            getSuccessor().handleBudgetRequest(money);
            return;
        }
        System.out.println("It has something wrong ...");
    }
}
