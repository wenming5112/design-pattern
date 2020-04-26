package com.ming.design.decorator;

/**
 * 深焙咖啡
 *
 * @program: design-pattern
 * @description: 深焙咖啡
 * @author: ming
 * @date: 2020-04-26 23:32
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
