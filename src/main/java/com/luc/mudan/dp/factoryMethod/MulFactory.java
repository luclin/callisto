package com.luc.mudan.dp.factoryMethod;

import com.luc.mudan.dp.simpleFactory.MulOperation;
import com.luc.mudan.dp.simpleFactory.Operation;

/**
 * @author : luc
 * @date : 2019-03-19 23:49
 * Description:
 */
public class MulFactory implements IFactory {

    @Override
    public Operation createOption() {
        return new MulOperation();
    }
}
