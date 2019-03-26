package com.luc.mudan.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : luc
 * @date : 2019-03-05 09:33
 * Description:
 */
public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Component component  : children) {
            component.display();
        }
    }
}
