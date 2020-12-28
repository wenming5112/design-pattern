package com.ming.design.prototype;

import org.junit.Test;

/**
 * 原型模式 Test
 *
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 9:52
 **/
public class RealizeTypeTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        RealizeType obj1 = new RealizeType();
        RealizeType obj2 = (RealizeType) obj1.clone();
        System.out.println(String.format("obj1==obj2 ? %s", (obj1 == obj2)));
    }
}