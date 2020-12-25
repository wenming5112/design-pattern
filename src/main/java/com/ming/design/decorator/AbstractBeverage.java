package com.ming.design.decorator;

/**
 * 饮料
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public abstract class AbstractBeverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 计算饮料费用
     *
     * @return double 费用
     */
    public abstract double cost();

}
