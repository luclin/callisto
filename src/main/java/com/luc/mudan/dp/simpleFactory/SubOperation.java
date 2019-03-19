package com.luc.mudan.dp.simpleFactory;

/**
 * @author : luc
 * @date : 2019-03-19 20:33
 * Description:
 */
public class SubOperation extends Operation {
    @Override
    public double operation() {
        return getVal1() - getVal2();
    }
}
