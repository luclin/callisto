package com.luc.mudan.dp.structural.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:50
 * Description:
 */
public abstract class Place {
    Person person;

    public Place(Person person) {
        this.person = person;
    }

    public abstract void printPlace();
}
