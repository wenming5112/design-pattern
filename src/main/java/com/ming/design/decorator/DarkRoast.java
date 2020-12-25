package com.ming.design.decorator;

/**
 * 深焙咖啡
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class DarkRoast extends AbstractBeverage {

    DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
