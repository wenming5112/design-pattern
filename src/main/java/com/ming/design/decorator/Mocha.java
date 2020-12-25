package com.ming.design.decorator;

/**
 * 摩卡
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class Mocha extends AbstractCondimentDecorator {
    private AbstractBeverage abstractBeverage;

    Mocha(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + " ," + "Mocha";
    }

    @Override
    public double cost() {
        return .20 + abstractBeverage.cost();
    }
}
