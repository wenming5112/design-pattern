package com.ming.design.composite.transparent;

import java.util.ArrayList;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 18:19
 **/
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
