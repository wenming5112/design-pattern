package com.ming.design.decorator;

/**
 * 低咖啡因咖啡
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class Decaf extends AbstractBeverage {

    Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
