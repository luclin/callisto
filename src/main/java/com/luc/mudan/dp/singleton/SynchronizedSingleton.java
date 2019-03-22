package com.luc.mudan.dp.singleton;

/**
 * @author : luc
 * @date : 2019-03-22 11:23
 * Description:
 */
public class SynchronizedSingleton {
    private static  SynchronizedSingleton instance;

    private SynchronizedSingleton() {};

    public static synchronized SynchronizedSingleton getInstance() {
        if (null == instance) {
            return new SynchronizedSingleton();
        }
        return instance;
    }
}
