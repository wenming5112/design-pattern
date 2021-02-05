package com.ming.design.template;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/5 13:28
 **/
public class ConcreteClass extends AbstractClass {
    /**
     * 抽象方法1
     */
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    /**
     * 抽象方法2
     */
    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
