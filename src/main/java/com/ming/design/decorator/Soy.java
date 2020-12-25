package com.ming.design.decorator;

/**
 * 豆浆
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class Soy extends AbstractCondimentDecorator {
    private AbstractBeverage abstractBeverage;

    Soy(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + " ," + "Soy";
    }

    @Override
    public double cost() {
        return .15 + abstractBeverage.cost();
    }
}
