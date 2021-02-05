package com.ming.design.adapter;

/**
 * 适配者
 *
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:31
 **/
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
