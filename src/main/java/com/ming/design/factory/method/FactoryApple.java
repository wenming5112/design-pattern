package com.ming.design.factory.method;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 15:23
 **/
public class FactoryApple implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂 苹果 生成-->具体产品 苹果...");
        return new ProductApple();
    }
}
