package com.ming.design.prototype.manager;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 10:25
 **/
public class Circle implements Shape {

    private Integer r;

    Circle() {

    }

    public Circle setRadius(Integer r) {
        this.r = r;
        return this;
    }

    @Override
    public Object clone() {
        Circle w = null;
        try {
            w = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Circle failed!!");
        }
        return w;
    }

    @Override
    public void countArea() {
        if (null == r) {
            System.out.println("Please set radius!!");
        }
        System.out.println(String.format("The circle Area = %s", (3.1415 * r * r)));
    }
}
