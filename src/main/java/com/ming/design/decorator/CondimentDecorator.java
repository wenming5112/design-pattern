package com.ming.design.decorator;

/**
 * 调料装饰者类
 *
 * @program: design-pattern
 * @description: 调料装饰者
 * @author: ming
 * @date: 2020-04-26 23:39
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
