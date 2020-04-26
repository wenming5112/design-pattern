package com.ming.design.decorator;

/**
 * 综合咖啡
 *
 * @program: design-pattern
 * @description: 综合咖啡
 * @author: ming
 * @date: 2020-04-26 23:29
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .98;
    }
}
