package com.luc.mudan.dp.singleton;

/**
 * @author : luc
 * @date : 2019-03-22 11:21
 * Description:
 */
public class SimpleSingleton {
    private static SimpleSingleton instance ;

    private SimpleSingleton() {};

    public static SimpleSingleton getInstance() {
        if (null == instance) {
            return  new SimpleSingleton();
        }
        return instance;
    }

}
