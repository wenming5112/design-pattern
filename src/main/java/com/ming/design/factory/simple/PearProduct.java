package com.ming.design.factory.simple;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 11:40
 **/
public class PearProduct implements Product {
    @Override
    public void show() {
        System.out.println("具体产品 -> 梨子 <- 显示...");
    }
}
