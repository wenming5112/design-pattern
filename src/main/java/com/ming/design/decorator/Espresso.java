package com.ming.design.decorator;

/**
 * 浓缩咖啡
 *
 * @program: design-pattern
 * @description: 浓缩咖啡
 * @author: ming
 * @date: 2020-04-26 23:25
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
