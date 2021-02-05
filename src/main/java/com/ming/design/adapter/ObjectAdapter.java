package com.ming.design.adapter;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:36
 **/
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
