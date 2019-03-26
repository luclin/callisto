package com.luc.mudan.dp.structural.decorator;

/**
 * @author : luc
 * @date : 2019-03-18 19:58
 * Description:
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("ConcreteDecorator: I begin do ");
        super.doSomething();
        System.out.println("ConcreteDecorator: I end do ");
    }
}