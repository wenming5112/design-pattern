package com.ming.design.decorator;

/**
 * 牛奶
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class Milk extends AbstractCondimentDecorator {
    private AbstractBeverage abstractBeverage;

    Milk(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + " ," + "Milk";
    }

    @Override
    public double cost() {
        return .10 + abstractBeverage.cost();
    }
}
