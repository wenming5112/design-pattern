package com.ming.design.factory.simple;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 11:41
 **/
public class SimpleFactory {
    public static Product makeProduct(int kind) {
        switch (kind) {
            case Const.PRODUCT_A:
                return new AppleProduct();
            case Const.PRODUCT_B:
                return new PearProduct();
            default:
                return null;
        }
    }
}
