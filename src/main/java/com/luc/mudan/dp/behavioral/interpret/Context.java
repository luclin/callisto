package com.luc.mudan.dp.behavioral.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : luc
 * @date : 2019-03-26 14:10
 * Description:
 */
public class Context {
    private Map<Variable, Boolean> map = new HashMap<>();

    public void assign(Variable k, Boolean v) {
        map.put(k,v);
    }

    public Boolean lookup(Variable k) throws IllegalArgumentException {
        if (map.containsKey(k)) {
            return map.get(k);
        }
        throw new IllegalArgumentException();
    }
}
