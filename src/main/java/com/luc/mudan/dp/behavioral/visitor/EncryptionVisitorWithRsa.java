package com.luc.mudan.dp.behavioral.visitor;

/**
 * @author : luc
 * @date : 2019-04-04 10:19
 * Description:
 */
public class EncryptionVisitorWithRsa implements EncrpytVisitor {
    @Override
    public void visit(EncryptionMsgForLuke msg) {
        System.out.println(" Rsa  encrypting Luke ( " + msg.getMsg() + " )");
    }

    @Override
    public void visit(EncryptionMsgForVader msg) {
        System.out.println(" Rsa  encrypting  Vader (" + msg.getMsg() + " )");
    }
}
