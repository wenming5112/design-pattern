package com.ming.design.composite.transparent;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 18:18
 **/
public interface Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();
}
