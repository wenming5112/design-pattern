package com.ming.design.bridge;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:45
 **/
public abstract class Abstraction {

    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void operation();
}
