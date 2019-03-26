package com.luc.mudan.dp.behavioral.iterator;

/**
 * @author : luc
 * @date : 2019-03-26 13:41
 * Description:
 */
public interface Iterator {
    /**
     * 移动到第一个元素
     */
    void first();

    /**
     * 移动到下一个元素
     */
    void next();
    /**
     * 是否为最后一个元素
     */
    boolean isDone();
    /**
     * 返还当前元素
     */
    public Object current();
}
