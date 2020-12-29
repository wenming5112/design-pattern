package com.ming.design.factory.abstraction;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:15
 **/
public class Vegetables implements Plant {
    /**
     * show
     */
    @Override
    public void show() {
        System.out.println("植物：蔬菜");
    }
}
