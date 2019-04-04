package com.luc.mudan.dp.behavioral.visitor;

/**
 * @author : luc
 * @date : 2019-04-04 10:16
 * Description:
 */
public class EncryptionVisitorWithMD5 implements EncrpytVisitor {

    @Override
    public void visit(EncryptionMsgForLuke msg) {
        System.out.println(" md5 encrypting Luke ( " + msg.getMsg() + " )");
    }

    @Override
    public void visit(EncryptionMsgForVader msg) {
        System.out.println(" md5 encrypting  Vader (" + msg.getMsg() + " )");
    }
}
