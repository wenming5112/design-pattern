package com.ming.design.singleton;

/**
 * 单例模式 - 懒汉式
 * 不足：
 * 1. 时间换空间
 * 2. 不加同步时是线程不安全的
 *
 * @author ming
 * @version 1.0.0
 * @date 2020/12/25 17:05
 **/
public class SingletonLazybones {
    /**
     * 1. 本类内部创建对象实例
     */
    private static SingletonLazybones instance = null;

    /**
     * 2. 构造方法私有化，外部不能new
     */
    private SingletonLazybones() {

    }

    /**
     * 3. 提供一个公有的静态方法，返回实例对象
     */
    private static SingletonLazybones newInstance() {
        if (null == instance) {
            instance = new SingletonLazybones();
        }
        return instance;
    }

    private void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        SingletonLazybones.newInstance().print();
        SingletonLazybones.newInstance().print();
    }

}
