package com.ming.design.decorator;

/**
 * 摩卡
 *
 * @program: design-pattern
 * @description: 摩卡-调料
 * @author: ming
 * @date: 2020-04-26 23:41
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
