package com.ming.design.factory.abstraction;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:17
 **/
public class ShaRaoFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruits();
    }
}
