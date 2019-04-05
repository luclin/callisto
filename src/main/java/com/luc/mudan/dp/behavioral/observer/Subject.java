package com.luc.mudan.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : luc
 * @date : 2019-04-05 11:28
 * Description:
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    };

    void remove(Observer observer) {
        observers.remove(observer);
    }

    abstract void notification(String msg);

    abstract void doit(String msg);
}
