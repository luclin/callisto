package com.luc.mudan.dp.structural.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:49
 * Description:
 */
public class PersonFemale extends Person {
    public PersonFemale(Phone phone) {
        super(phone);
    }

    @Override
    public void printPerson() {
        phone.printPhoneName();
        System.out.println("I am women ...");
    }
}
