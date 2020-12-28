package com.ming.design.factory.method;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 15:21
 **/
public class ProductApple implements Product {
    @Override
    public void show() {
        System.out.println("具体产品 苹果 显示...");
    }
}
