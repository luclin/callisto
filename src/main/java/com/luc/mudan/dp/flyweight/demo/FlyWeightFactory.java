package com.luc.mudan.dp.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : luc
 * @date : 2019-03-25 10:40
 * Description:
 */
public class FlyWeightFactory {
    private Map<String,ConcreteFlyweight> flyWeights = new HashMap<>();

    public Integer getFlyWeightSize() {
        return flyWeights.size();
    }

    public ConcreteFlyweight factory(String str) {
        if (flyWeights.containsKey(str)) {
            return flyWeights.get(str);
        }
        ConcreteFlyweight flyweight = new ConcreteFlyweight(str);
        flyWeights.put(str, flyweight);
        return flyweight;
    }
}
