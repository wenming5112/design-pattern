package com.ming.design.adapter;

/**
 * 类适配器
 *
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:32
 **/
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
