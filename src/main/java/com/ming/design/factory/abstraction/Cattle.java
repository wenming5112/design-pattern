package com.ming.design.factory.abstraction;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:14
 **/
public class Cattle implements Animal {
    /**
     * show
     */
    @Override
    public void show() {
        System.out.println("动物：牛");
    }
}
