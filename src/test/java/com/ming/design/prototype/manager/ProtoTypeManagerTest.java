package com.ming.design.prototype.manager;

import org.junit.Test;

public class ProtoTypeManagerTest {
    @Test
    public void test() {
        ProtoTypeManager pm = new ProtoTypeManager();
        Circle circle = (Circle) pm.getShape("Circle");
        circle.setRadius(2).countArea();
        Square square = (Square) pm.getShape("Square");
        square.setSideLength(10).countArea();
    }
}