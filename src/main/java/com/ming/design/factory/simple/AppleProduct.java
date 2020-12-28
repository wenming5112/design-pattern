package com.ming.design.factory.simple;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 11:39
 **/
public class AppleProduct implements Product {
    @Override
    public void show() {
        System.out.println("具体产品 -> 苹果 <- 显示...");
    }
}
