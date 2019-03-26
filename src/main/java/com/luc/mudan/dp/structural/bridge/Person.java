package com.luc.mudan.dp.structural.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:44
 * Description:
 */
public abstract class Person {
    Phone phone;

    public Person(Phone phone) {
        this.phone = phone;
    }

    public abstract void printPerson();
}
