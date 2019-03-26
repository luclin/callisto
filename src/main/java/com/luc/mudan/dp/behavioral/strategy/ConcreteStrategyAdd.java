package com.luc.mudan.dp.behavioral.strategy;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : luc
 * @date : 2019-03-06 09:32
 * Description:
 */
public class ConcreteStrategyAdd implements Strategy {
    @Override
    public void algorithmInterface(Context context) {
        List<Integer> list = context.getArr().stream().map(i -> i +1 ).collect(Collectors.toList());
        context.setArr(list);
    }
}
