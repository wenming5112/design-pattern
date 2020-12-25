package com.ming.design.decorator;

/**
 * 奶泡
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class Whip extends AbstractCondimentDecorator {
    private AbstractBeverage abstractBeverage;

    Whip(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + " ," + "Whip";
    }

    @Override
    public double cost() {
        return .10 + abstractBeverage.cost();
    }
}
