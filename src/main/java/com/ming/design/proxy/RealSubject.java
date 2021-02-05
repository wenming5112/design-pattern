package com.ming.design.proxy;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:25
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}
