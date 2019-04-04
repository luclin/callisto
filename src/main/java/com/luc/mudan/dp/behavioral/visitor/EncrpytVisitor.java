package com.luc.mudan.dp.behavioral.visitor;

/**
 * @author : luc
 * @date : 2019-04-04 10:06
 * Description:
 */
public interface EncrpytVisitor {

    void visit(EncryptionMsgForVader msg);

    void visit(EncryptionMsgForLuke msg);

}
