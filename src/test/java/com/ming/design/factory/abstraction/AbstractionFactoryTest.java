package com.ming.design.factory.abstraction;

import org.junit.Test;

public class AbstractionFactoryTest {

    @Test
    public void saoGuFarm() {
        Farm f = new SaoGuFarm();
        Animal a = f.newAnimal();
        Plant b = f.newPlant();
        a.show();
        b.show();
    }

    @Test
    public void shaRaoFarm() {
        Farm f = new ShaRaoFarm();
        Animal a = f.newAnimal();
        Plant b = f.newPlant();
        a.show();
        b.show();
    }

}