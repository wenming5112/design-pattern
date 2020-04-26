package com.ming.design.decorator;

import org.junit.Test;

/**
 * 星巴兹咖啡 测试类
 *
 * @program: design-pattern
 * @description: 星巴兹咖啡-测试
 * @author: ming
 * @date: 2020-04-26 23:54
 */
public class StarbuzzCoffeeTest {

    @Test
    public void main() {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

}
