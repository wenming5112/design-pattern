package com.ming.design.decorator;

/**
 * 豆浆
 *
 * @program: design-pattern
 * @description: 豆浆-调料
 * @author: ming
 * @date: 2020-04-26 23:59
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
