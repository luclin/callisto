package com.luc.mudan.dp.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @author : luc
 * @date : 2019-03-26 13:55
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Aggregate aggregate = new ConcreteAggregate<>(list);
        Iterator iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }


    }
}
