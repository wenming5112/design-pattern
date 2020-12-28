package com.ming.design.factory.method;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 15:20
 **/
public interface AbstractFactory {
    /**
     * new product
     *
     * @return Product
     */
    Product newProduct();
}
