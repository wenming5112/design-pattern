package com.ming.design.factory.simple;

import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void makeProduct0() {
        Product product = SimpleFactory.makeProduct(0);
        if (null != product) {
            product.show();
        }
    }

    @Test
    public void makeProduct1() {
        Product product = SimpleFactory.makeProduct(1);
        if (null != product) {
            product.show();
        }
    }

}