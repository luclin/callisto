package com.luc.mudan.dp.behavioral.iterator;

/**
 * @author : luc
 * @date : 2019-03-26 13:43
 * Description:
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    abstract Iterator createIterator();
}
