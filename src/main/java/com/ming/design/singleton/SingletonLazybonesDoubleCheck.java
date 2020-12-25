package com.ming.design.singleton;

/**
 * 单例模式 - 懒汉式 (双重检查加锁)
 *
 * @author ming
 * @version 1.0.0
 * @date 2020/12/25 17:23
 **/
public class SingletonLazybonesDoubleCheck {
    private volatile static SingletonLazybonesDoubleCheck instance = null;

    private SingletonLazybonesDoubleCheck() {

    }

    public static SingletonLazybonesDoubleCheck newInstance() {
        if (null == instance) {
            synchronized (SingletonLazybonesDoubleCheck.class) {
                if (null == instance) {
                    instance = new SingletonLazybonesDoubleCheck();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

    /**
     * 防止序列化破环
     */
    private Object readResolve() {
        return instance;
    }

}
