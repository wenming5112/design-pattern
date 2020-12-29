package com.ming.design.factory.abstraction;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:16
 **/
public class SaoGuFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
