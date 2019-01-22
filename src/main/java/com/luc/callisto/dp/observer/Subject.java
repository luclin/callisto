package com.luc.callisto.dp.observer;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:29
 * Description:
 */
public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers(String msg);
}
