package com.ming.design.decorator;

/**
 * 调料装饰者类
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {

    /**
     * 获取描述
     *
     * @return str 描述
     */
    @Override
    public abstract String getDescription();
}
