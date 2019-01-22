package com.luc.callisto.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:30
 * Description:
 */
public class FeedSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        observers.stream().forEach(o ->
                o.notify(msg));
    }

    public static void main(String[] args) {
        FeedSubject feed = new FeedSubject();
        feed.registerObserver(new NYObserser());
        feed.registerObserver(new PostObserver());
        feed.notifyObservers("ny ...");
        feed.notifyObservers("post ...");

        FeedSubject feedSubject = new FeedSubject();
        feedSubject.registerObserver((msg -> {
            if (msg != null && msg.contains("china")) {
                System.out.println("I am china");
            }
        }));
        feedSubject.registerObserver(msg -> {
            if (null != msg && msg.contains("eng")) {
                System.out.println("I am eng");
            }
        });
        feedSubject.notifyObservers("eng");
        feedSubject.notifyObservers("china");

    }

}
