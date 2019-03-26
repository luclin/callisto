package com.luc.mudan.dp.behavioral.iterator;

/**
 * @author : luc
 * @date : 2019-03-26 13:42
 * Description:
 */
public class HeadIterator implements Iterator {
    /**
     * 持有被迭代的具体的聚合对象
     */
    private ConcreteAggregate agg;

    /**
     * 内部索引，记录当前迭代到的索引位置
     */
    private int index = 0;

    /**
     * 记录当前聚集对象的大小
     */
    private int size = 0;

    public HeadIterator(ConcreteAggregate agg) {
        this.agg = agg;
        this.size = agg.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
       if (index < size) {
           index ++;
       }
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object current() {
        return agg.getElemt(index);
    }
}
