package com.ming.design.decorator;

/**
 * 牛奶
 *
 * @program: design-pattern
 * @description: 牛奶-调料
 * @author: ming
 * @date: 2020-04-27 00:04
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
