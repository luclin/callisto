package com.luc.mudan.dp.factoryMethod;

import com.luc.mudan.dp.simpleFactory.Operation;
import com.luc.mudan.dp.simpleFactory.SubOperation;

/**
 * @author : luc
 * @date : 2019-03-19 23:49
 * Description:
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOption() {
        return new SubOperation();
    }
}
