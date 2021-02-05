package com.ming.design.template;

import org.junit.Test;

public class AbstractClassTest {
    @Test
    public void demo() {
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }
}