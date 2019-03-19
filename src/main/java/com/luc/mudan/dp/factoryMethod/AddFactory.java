package com.luc.mudan.dp.factoryMethod;

import com.luc.mudan.dp.simpleFactory.AddOperation;
import com.luc.mudan.dp.simpleFactory.Operation;

/**
 * @author : luc
 * @date : 2019-03-19 23:48
 * Description:
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOption() {
        return new AddOperation();
    }

}
