package com.luc.mudan.dp.composite;

/**
 * @author : luc
 * @date : 2019-03-04 21:09
 * Description:
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component equipment) {
        System.out.println(" I am Leaf");
    }

    @Override
    public void remove(Component equipment) {
        System.out.println(" I am Leaf");
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
