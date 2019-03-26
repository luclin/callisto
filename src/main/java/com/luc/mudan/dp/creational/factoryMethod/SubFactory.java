package com.luc.mudan.dp.creational.factoryMethod;

import com.luc.mudan.dp.creational.simpleFactory.Operation;
import com.luc.mudan.dp.creational.simpleFactory.SubOperation;

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
