package com.luc.mudan.dp.chainOfResponsibility;

/**
 * @author : luc
 * @date : 2019-03-25 21:16
 * Description:
 */
public class GeneralManager extends Handler {
    @Override
    public void handleBudgetRequest(double money) {
        if (money < 10000) {
            System.out.println(" GeneralManager approve ...");
            return;
        }
        if (getSuccessor() != null) {
            getSuccessor().handleBudgetRequest(money);
            return;
        }
        System.out.println("It is not a good Budget ...");
    }
}
