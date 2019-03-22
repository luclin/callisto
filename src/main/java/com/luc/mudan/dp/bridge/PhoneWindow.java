package com.luc.mudan.dp.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:43
 * Description:
 */
public class PhoneWindow implements Phone {

    @Override
    public void printPhoneName() {
        System.out.println("I am window phone ...");
    }
}
