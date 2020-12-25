package com.ming.design.decorator;

/**
 * 综合咖啡
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class HouseBlend extends AbstractBeverage {

    HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .98;
    }
}
