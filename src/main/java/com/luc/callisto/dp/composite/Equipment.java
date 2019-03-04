package com.luc.callisto.dp.composite;

/**
 * @author : luc
 * @date : 2019-03-04 20:55
 * Description: 计算机和立体声组合音箱，这类设备经常被组装成部分-整体层次结构或者容器层次结构。
 * 例如：底盘可以包含驱动、平面板
 *      总线含有多个插件，
 *      机柜包含底盘、总线等。
 */
public abstract class Equipment {
     protected String name;

     public Equipment(String name) {
         this.name = name;
     }

    /**
     * 耗电量
     * @return
     */
     public abstract Double power();

    /**
     * 原价
     * @return
     */
    public abstract Double netPrice();

    /**
     * 折后价
     * @return
     */
    public abstract Double disscountPrice();

    /**
     * 增加一个设备
     */
    public abstract void add(Equipment equipment);

    /**
     * 删除一台设备
     */
    public abstract void remove(Equipment equipment);

    /**
     * 展示层级结构
     */
    public abstract void display();

}
