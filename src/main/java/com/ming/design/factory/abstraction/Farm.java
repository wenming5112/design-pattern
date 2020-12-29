package com.ming.design.factory.abstraction;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/29 14:16
 **/
public interface Farm {
    /**
     * 新动物
     *
     * @return Animal
     */
    Animal newAnimal();

    /**
     * 新植物
     *
     * @return Plant
     */
    Plant newPlant();
}
