package com.luc.mudan.dp.behavioral.iterator;

import java.util.List;

/**
 * @author : luc
 * @date : 2019-03-26 13:44
 * Description:
 */
public class ConcreteAggregate <T> extends Aggregate {

    private List<T> objs ;

    public ConcreteAggregate(List<T> list) {
        objs = list;
    }

    public T getElemt(int idx) {
        if (idx < objs.size()) {
            return objs.get(idx);
        }
        return null;
    }

    public int size() {
        return objs.size();
    }

    @Override
    Iterator createIterator() {
        return new HeadIterator(this);
    }
}
