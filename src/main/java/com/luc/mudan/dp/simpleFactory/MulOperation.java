package com.luc.mudan.dp.simpleFactory;

/**
 * @author : luc
 * @date : 2019-03-19 20:34
 * Description:
 */
public class MulOperation extends Operation {
    @Override
    protected double operation() {
        return getVal1() * getVal2();
    }
}
