package com.luc.mudan.dp.behavioral.visitor;

/**
 * @author : luc
 * @date : 2019-04-04 10:08
 * Description:
 */
public class EncryptionMsgForVader implements EncryptionMsg{

    private String msg ;

    public EncryptionMsgForVader(String msg ) {
        this.msg = msg;
    }

    @Override
    public void accept(EncrpytVisitor visitor) {
        visitor.visit(this);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
