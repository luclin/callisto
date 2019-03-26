package com.luc.mudan.dp.creational.singleton;

/**
 * @author : luc
 * @date : 2019-03-22 11:34
 * Description:
 */
public class FinalSingleton {
    private static final FinalSingleton instance = new FinalSingleton();

    private FinalSingleton() {}

    public static FinalSingleton getInstance() {
        return instance;
    }
}
