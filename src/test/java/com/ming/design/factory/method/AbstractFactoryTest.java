package com.ming.design.factory.method;


import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testApple() {
        Product product;
        AbstractFactory abstractFactory;
        abstractFactory = new FactoryApple();
        product = abstractFactory.newProduct();
        product.show();
    }

    @Test
    public void testPear() {
        Product product;
        AbstractFactory abstractFactory;
        abstractFactory = new FactoryPear();
        product = abstractFactory.newProduct();
        product.show();
    }
}