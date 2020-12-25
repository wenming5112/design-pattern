package com.ming.design.singleton;

/**
 * 饿汉式 - 空间换时间
 *
 * @author ming
 * @version 1.0.0
 * @date 2020/12/25 17:31
 **/
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry newInstance() {
        return instance;
    }
}
