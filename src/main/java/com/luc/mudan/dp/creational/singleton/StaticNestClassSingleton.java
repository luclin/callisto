package com.luc.mudan.dp.creational.singleton;

/**
 * @author : luc
 * @date : 2019-03-22 11:37
 * Description:
 */
public class StaticNestClassSingleton {

    private static class StaticNestClassHolder {
        private static final StaticNestClassSingleton INSTANCE = new StaticNestClassSingleton();
    }

    private StaticNestClassSingleton() {}

    public static final StaticNestClassSingleton getInstance() {
        return StaticNestClassHolder.INSTANCE;
    }
}
