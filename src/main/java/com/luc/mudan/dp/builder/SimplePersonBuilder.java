package com.luc.mudan.dp.builder;

/**
 * @author : luc
 * @date : 2019-03-22 11:11
 * Description:
 */
public class SimplePersonBuilder extends PersonBuilder {

    private Person person;

    public SimplePersonBuilder() {
        this.person = new Person();
    }

    @Override
    PersonBuilder buildAge(Integer age) {
        person.setAge(age);
        return this;
    }

    @Override
    PersonBuilder buildFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @Override
    PersonBuilder buildLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    Person build() {
        return person;
    }
}
