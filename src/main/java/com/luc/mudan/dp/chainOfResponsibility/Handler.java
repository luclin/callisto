package com.luc.mudan.dp.chainOfResponsibility;

/**
 * @author : luc
 * @date : 2019-03-25 21:09
 * Description:
 */
public abstract class Handler {

    protected Handler successor = null;

    Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleBudgetRequest(double money);
}
