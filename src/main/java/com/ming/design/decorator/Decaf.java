package com.ming.design.decorator;

/**
 * 低咖啡因咖啡
 *
 * @program: design-pattern
 * @description: 低咖啡因咖啡
 * @author: ming
 * @date: 2020-04-26 23:34
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
