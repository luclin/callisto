package com.luc.mudan.dp.creational.singleton;

/**
 * @author : luc
 * @date : 2019-03-22 11:27
 * Description:
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;
    private DoubleCheckSingleton() {};

    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    return new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
