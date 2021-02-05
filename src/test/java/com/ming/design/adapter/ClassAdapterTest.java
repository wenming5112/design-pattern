package com.ming.design.adapter;

import org.junit.Test;

public class ClassAdapterTest {

    @Test
    public void request() {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}