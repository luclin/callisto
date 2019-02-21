package com.luc.callisto.dp.factory;

/**
 * @author : luc
 * @date : 2019-01-22 20:01
 * Description:
 */
public class Stock implements Product {
    @Override
    public void say() {
        System.out.println("I am Stock");
    }
}
