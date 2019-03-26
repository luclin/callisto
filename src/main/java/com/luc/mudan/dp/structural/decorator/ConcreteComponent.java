package com.luc.mudan.dp.structural.decorator;

/**
 * @author : luc
 * @date : 2019-03-18 17:31
 * Description:
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("ConcreteComponent: I do .....");
    }
}
