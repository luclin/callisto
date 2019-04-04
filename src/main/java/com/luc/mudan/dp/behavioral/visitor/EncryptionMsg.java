package com.luc.mudan.dp.behavioral.visitor;

/**
 * @author : luc
 * @date : 2019-04-04 09:54
 * Description:
 */
public interface EncryptionMsg {
    void accept(EncrpytVisitor visitor);
}
