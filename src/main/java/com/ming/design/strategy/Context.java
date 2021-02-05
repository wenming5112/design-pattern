package com.ming.design.strategy;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/5 14:17
 **/
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
