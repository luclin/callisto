package com.luc.mudan.dp.structural.flyweight.line;

/**
 * @author : luc
 * @date : 2019-03-25 11:22
 * Description:
 */
public class ConcreteLineFlyweight implements LineFlyweigt {

    String color;

    public ConcreteLineFlyweight(String color) {
        this.color = color;
    }

    @Override
    public void draw(String extrinsic) {
        System.out.println("The extrinsic is " + extrinsic);
        System.out.println("The intrinsic is " + color);
    }
}
