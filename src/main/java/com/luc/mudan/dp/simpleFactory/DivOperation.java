package com.luc.mudan.dp.simpleFactory;

/**
 * @author : luc
 * @date : 2019-03-19 20:34
 * Description:
 */
public class DivOperation extends Operation {
    @Override
    public double operation() {
        if (getVal1() != 0) {
            return getVal2() / getVal1();
        }
        return 0;
    }
}
