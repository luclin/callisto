package com.luc.mudan.dp.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : luc
 * @date : 2019-04-04 10:27
 * Description:
 */
public class MsgStructure {
    private List<EncryptionMsg> encryptionMsgList  = new ArrayList<>();

    void addMsg(EncryptionMsg msg) {
        encryptionMsgList.add(msg);
    }
    void remove(EncryptionMsg msg) {
        encryptionMsgList.remove(msg);
    }
    void accept(EncrpytVisitor visitor) {
        encryptionMsgList.forEach(o -> o.accept(visitor));
    }
}
