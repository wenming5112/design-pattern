package com.ming.design.builder;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:56
 **/
public class ConcreteBuilder extends BaseBuilder{
    @Override
    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}
