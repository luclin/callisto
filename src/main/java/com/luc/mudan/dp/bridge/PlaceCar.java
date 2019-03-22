package com.luc.mudan.dp.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:52
 * Description:
 */
public class PlaceCar extends Place {

    public PlaceCar(Person person) {
        super(person);
    }

    @Override
    public void printPlace() {
        person.printPerson();
        System.out.println(" I am in the car");
    }
}
