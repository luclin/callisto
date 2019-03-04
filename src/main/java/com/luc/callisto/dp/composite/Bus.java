package com.luc.callisto.dp.composite;

/**
 * @author : linweizhong
 * @date : 2019-03-04 21:09
 * Description:
 */
public class Bus extends Equipment {

    public Bus(String name) {
        super(name);
    }

    @Override
    public Double power() {
        return 1.0;
    }

    @Override
    public Double netPrice() {
        return 100.0;
    }

    @Override
    public Double disscountPrice() {
        return 90.0;
    }

    @Override
    public void add(Equipment equipment) {
        System.out.println(" I am leaf");
    }

    
}
