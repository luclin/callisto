package com.luc.mudan.dp.creational.builder;

/**
 * @author : luc
 * @date : 2019-03-22 11:04
 * Description:
 */
public class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "firstName:" + firstName + "\tlastName:" + lastName + "\tage:" + age;
    }
}
