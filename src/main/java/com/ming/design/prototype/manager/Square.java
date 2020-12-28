package com.ming.design.prototype.manager;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 10:27
 **/
public class Square implements Shape {
    private Integer a;

    Square() {

    }

    public Square setSideLength(Integer a) {
        this.a = a;
        return this;
    }

    /**
     * copy
     *
     * @return Object
     */
    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone Square failed!!");
        }
        return square;
    }

    /**
     * countArea
     */
    @Override
    public void countArea() {
        if (null == a) {
            System.out.println("Please set Side length of Square!!");
        }
        System.out.println(String.format("The Square Area = %s", (a * a)));
    }
}
