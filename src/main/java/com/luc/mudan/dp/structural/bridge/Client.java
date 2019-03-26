package com.luc.mudan.dp.structural.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:53
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new PhoneApple();
        Person person = new PersonMan(phone);
        Place p = new PlaceCar(person);
        p.printPlace();
    }
}
