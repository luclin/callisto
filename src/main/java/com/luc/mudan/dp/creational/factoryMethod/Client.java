package com.luc.mudan.dp.creational.factoryMethod;

import com.luc.mudan.dp.creational.simpleFactory.Operation;

/**
 * @author : luc
 * @date : 2019-03-19 23:51
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        IFactory addFactory = new AddFactory();
        Operation o1 = addFactory.createOption();
        o1.setVal1(1);
        o1.setVal1(2);
        System.out.println(o1.operation());

        IFactory mulFactory = new MulFactory();
        Operation o2 = mulFactory.createOption();
        o2.setVal1(1);o2.setVal2(2);
        System.out.println(o2.operation());

    }
}
