package com.ming.design.builder;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:57
 **/
public class Director {
    private BaseBuilder builder;

    public Director(BaseBuilder builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法
     *
     * @return Product
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
