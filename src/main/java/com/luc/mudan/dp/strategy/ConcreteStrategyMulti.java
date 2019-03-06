package com.luc.mudan.dp.strategy;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : luc
 * @date : 2019-03-06 09:33
 * Description:
 */
public class ConcreteStrategyMulti implements Strategy {
    @Override
    public void algorithmInterface(Context context) {
        List<Integer> list = context.getArr().stream().map(i -> i * 2).collect(Collectors.toList());
        context.setArr(list);
    }
}
