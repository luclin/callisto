package com.luc.mudan.dp.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * @author : luc
 * @date : 2019-03-06 09:31
 * Description:
 */
public class Context {
    private Strategy strategy ;

    private List<Integer> arr = Arrays.asList(1, 2,3);


    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public List<Integer> getArr() {
        return this.arr;
    }
    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        this.strategy.algorithmInterface(this);
    }
}
