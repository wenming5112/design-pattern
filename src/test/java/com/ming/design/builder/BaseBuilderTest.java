package com.ming.design.builder;

import org.junit.Test;

public class BaseBuilderTest {

    @Test
    public void demo() {
        BaseBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }

}