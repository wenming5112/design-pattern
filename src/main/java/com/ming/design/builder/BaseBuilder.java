package com.ming.design.builder;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:53
 **/
public abstract class BaseBuilder {
    protected Product product = new Product();

    /**
     * build a
     */
    public abstract void buildPartA();

    /**
     * build b
     */
    public abstract void buildPartB();

    /**
     * build c
     */
    public abstract void buildPartC();

    /**
     * 返回产品对象
     *
     * @return Product
     */
    public Product getResult() {
        return product;
    }
}
