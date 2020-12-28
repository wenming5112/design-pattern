package com.ming.design.factory.method;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 15:22
 **/
public class ProductPear implements Product {
    @Override
    public void show() {
        System.out.println("具体产品 梨子 显示...");
    }
}
