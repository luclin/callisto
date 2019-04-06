package com.luc.mudan.dp.behavioral.mediator;

/**
 * @author : luc
 * @date : 2019-04-06 15:57
 * Description:
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
