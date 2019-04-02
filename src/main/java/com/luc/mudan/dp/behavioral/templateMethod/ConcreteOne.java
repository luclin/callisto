package com.luc.mudan.dp.behavioral.templateMethod;

/**
 * @author : luc
 * @date : 2019-04-02 09:26
 * Description:
 */
public class ConcreteOne extends Generalization {

    @Override
    void step3() {
        System.out.println("I am step 3 from ConcreteOne");
    }

    @Override
    void step4() {
        System.out.println("I am step 4 from ConcreteOne");
    }
}
