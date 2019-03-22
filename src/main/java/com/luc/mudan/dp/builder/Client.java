package com.luc.mudan.dp.builder;

/**
 * @author : luc
 * @date : 2019-03-22 11:16
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        PersonBuilder builder = new SimplePersonBuilder();
        Person person = builder.buildFirstName("luc")
                .buildLastName("lin")
                .buildAge(10)
                .build();
        System.out.println(person);
    }
}
