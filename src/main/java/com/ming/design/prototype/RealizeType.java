package com.ming.design.prototype;

/**
 * 原型模式
 *
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 9:52
 **/
public class RealizeType implements Cloneable {
    RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return super.clone();
    }
}
