package com.ming.design.strategy;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/5 14:17
 **/
public class ConcreteStrategyB implements Strategy {
    /**
     * 策略方法
     */
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
