package com.luc.mudan.dp.creational.factoryMethod;

import com.luc.mudan.dp.creational.simpleFactory.DivOperation;
import com.luc.mudan.dp.creational.simpleFactory.Operation;

/**
 * @author : luc
 * @date : 2019-03-19 23:50
 * Description:
 */
public class DivFactory implements IFactory {
    @Override
    public Operation createOption() {
        return new DivOperation();
    }
}
