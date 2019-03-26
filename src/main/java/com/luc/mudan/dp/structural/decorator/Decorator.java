package com.luc.mudan.dp.structural.decorator;

/**
 * @author : luc
 * @date : 2019-03-18 17:37
 * Description:
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        System.out.println("Decorator: I do ...");
    }
}
