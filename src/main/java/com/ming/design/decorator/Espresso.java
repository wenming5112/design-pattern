package com.ming.design.decorator;

/**
 * 浓缩咖啡
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class Espresso extends AbstractBeverage {

    Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
