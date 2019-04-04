package com.luc.mudan.dp.behavioral.visitor;

/**
 * @author : luc
 * @date : 2019-04-04 10:20
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        EncryptionMsgForVader vader = new EncryptionMsgForVader("Leia is your daughter ...");
        EncryptionMsgForLuke luke = new EncryptionMsgForLuke("Leia is your sister ...");
        MsgStructure  msgStructure = new MsgStructure();

        System.out.println("------- md5 ------- ");
        EncrpytVisitor visitorMd5 = new EncryptionVisitorWithMD5();
        msgStructure.addMsg(vader);
        msgStructure.addMsg(luke);
        msgStructure.accept(visitorMd5);



        System.out.println("------- rsa ------- ");
        msgStructure.remove(vader);
        msgStructure.remove(luke);
        EncrpytVisitor visitorRsa = new EncryptionVisitorWithRsa();
        msgStructure.addMsg(vader);
        msgStructure.addMsg(luke);
        msgStructure.accept(visitorRsa);

    }
}
