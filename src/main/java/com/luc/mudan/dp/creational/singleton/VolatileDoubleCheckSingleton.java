package com.luc.mudan.dp.creational.singleton;

/**
 * @author : luc
 * @date : 2019-03-22 11:32
 * Description:
 */
public class VolatileDoubleCheckSingleton {
    private static volatile VolatileDoubleCheckSingleton instance;
    private VolatileDoubleCheckSingleton() {};

    public static VolatileDoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (VolatileDoubleCheckSingleton.class) {
                if (null == instance) {
                    return new VolatileDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
