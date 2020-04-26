package com.ming.design.decorator;

/**
 * 奶泡
 *
 * @program: design-pattern
 * @description: 奶泡-调料
 * @author: ming
 * @date: 2020-04-27 00:02
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ," + "Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
