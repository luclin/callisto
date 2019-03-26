package com.luc.mudan.dp.structural.flyweight.line;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : luc
 * @date : 2019-03-25 11:24
 * Description:
 */
public class LineFlyweightFactory {
    private Map<String, ConcreteLineFlyweight>  lineFlyweightMap = new HashMap<>();

    public int lineFlyweightSize () {
        return lineFlyweightMap.size();
    }

    public ConcreteLineFlyweight factory(String str) {
        if (lineFlyweightMap.containsKey(str)) {
            return lineFlyweightMap.get(str);
        }
        ConcreteLineFlyweight lineFlyweight = new ConcreteLineFlyweight(str);
        lineFlyweightMap.put(str, lineFlyweight);
        return lineFlyweight;
    }

}
