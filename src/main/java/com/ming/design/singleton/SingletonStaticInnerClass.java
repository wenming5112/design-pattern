package com.ming.design.singleton;

/**
 * 单例模式 - 静态内部类
 *
 * @author ming
 * @version 1.0.0
 * @date 2020/12/25 17:39
 **/
public class SingletonStaticInnerClass {
    private static class Singleton {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
    }

    private SingletonStaticInnerClass() {
    }

    public static SingletonStaticInnerClass newInstance() {
        return Singleton.instance;
    }

}