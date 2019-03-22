package com.luc.mudan.dp.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:48
 * Description:
 */
public class PersonMan extends Person {

    public PersonMan(Phone phone) {
        super(phone);
    }

    @Override
    public void printPerson() {
        phone.printPhoneName();
        System.out.println("I am man");
    }
}
