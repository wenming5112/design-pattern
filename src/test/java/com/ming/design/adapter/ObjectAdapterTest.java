package com.ming.design.adapter;

import org.junit.Test;

public class ObjectAdapterTest {

    @Test
    public void request() {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}