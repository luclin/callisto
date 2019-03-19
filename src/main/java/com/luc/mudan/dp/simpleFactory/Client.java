package com.luc.mudan.dp.simpleFactory;

/**
 * @author : luc
 * @date : 2019-03-19 20:45
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setVal1(10);
        operationAdd.setVal1(5);
        System.out.println(operationAdd.operation());
    }
}
