package com.ming.design.factory.abstraction;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:13
 **/
public class Horse implements Animal {
    /**
     * show
     */
    @Override
    public void show() {
        System.out.println("动物：马");
    }
}
