package com.luc.mudan.dp.creational.builder;

/**
 * @author : luc
 * @date : 2019-03-22 11:09
 * Description:
 */
public abstract class PersonBuilder {
    abstract PersonBuilder buildFirstName(String firstName);

    abstract PersonBuilder buildLastName(String lastName);

    abstract PersonBuilder buildAge(Integer age);

    abstract Person build();

}
