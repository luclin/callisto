package com.luc.mudan.dp.bridge;

/**
 * @author : luc
 * @date : 2019-03-22 16:51
 * Description:
 */
public class PlaceHome extends Place {
    public PlaceHome(Person person) {
        super(person);
    }

    @Override
    public void printPlace() {
        person.printPerson();
        System.out.println("I am home ...");
    }
}
