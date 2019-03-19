package com.luc.mudan.dp.simpleFactory;

/**
 * @author : luc
 * @date : 2019-03-19 20:30
 * Description:
 */
public class OperationFactory {
    public static Operation createOperation(String op) {
        switch (op) {
            case "+" : return new AddOperation();
            case "-" : return new SubOperation();
            case "*" : return new MulOperation();
            case "/" : return new DivOperation();
            default: throw new UnsupportedOperationException("不支持");
        }
    }
}
