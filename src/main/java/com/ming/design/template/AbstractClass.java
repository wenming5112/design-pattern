package com.ming.design.template;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/5 13:26
 **/
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();
}
