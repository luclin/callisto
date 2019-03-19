package com.luc.mudan.dp.simpleFactory;

/**
 * @author : luc
 * @date : 2019-03-19 20:32
 * Description:
 */
public class AddOperation extends Operation {
    @Override
    protected double operation() {
        return getVal1() + getVal2();
    }
}
