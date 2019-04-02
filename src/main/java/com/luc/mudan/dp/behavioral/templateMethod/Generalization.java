package com.luc.mudan.dp.behavioral.templateMethod;

/**
 * @author : luc
 * @date : 2019-04-02 09:24
 * Description:
 */
public abstract class Generalization {

    public void start () {
        step1();
        step2();
        step3();
        step4();
        step5();
    }

    public void step1() {
        System.out.println("I am step 1 from Generalization");
    }
    public void step2() {
        System.out.println("I am step 2 from Generalization");
    }
    abstract void step3();

    abstract void step4();

    public void step5() {
        System.out.println("I am step 5 from Generalization");
    }
}
