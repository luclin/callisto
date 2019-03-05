package com.luc.mudan.dp.composite;

/**
 * @author : luc
 * @date : 2019-03-04 20:55
 * Description:
 */
public abstract class Component {
     protected String name;

    public Component(String name) {
         this.name = name;
     }

    /**
     * 增加
     */
    public abstract void add(Component component);

    /**
     * 删除
     */
    public abstract void remove(Component component);

    /**
     * 展示层级结构
     */
    public abstract void display();

}
