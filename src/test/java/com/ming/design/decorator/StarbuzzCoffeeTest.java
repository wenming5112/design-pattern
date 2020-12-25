package com.ming.design.decorator;

import org.junit.Test;

/**
 * 星巴兹咖啡 测试类
 *
 * @author ming
 * @date 2020-04-26 23:20
 */
public class StarbuzzCoffeeTest {

    @Test
    public void main() {
        AbstractBeverage abstractBeverage = new Espresso();
        abstractBeverage = new Milk(abstractBeverage);
        System.out.println(abstractBeverage.getDescription() + " $" + abstractBeverage.cost());

        AbstractBeverage abstractBeverage1 = new DarkRoast();
        abstractBeverage1 = new Mocha(abstractBeverage1);
        abstractBeverage1 = new Mocha(abstractBeverage1);
        abstractBeverage1 = new Whip(abstractBeverage1);
        System.out.println(abstractBeverage1.getDescription() + " $" + abstractBeverage1.cost());

        AbstractBeverage abstractBeverage2 = new HouseBlend();
        abstractBeverage2 = new Soy(abstractBeverage2);
        abstractBeverage2 = new Mocha(abstractBeverage2);
        abstractBeverage2 = new Whip(abstractBeverage2);
        System.out.println(abstractBeverage2.getDescription() + " $" + abstractBeverage2.cost());

        AbstractBeverage abstractBeverage3 = new Decaf();
        abstractBeverage3 = new Soy(new Mocha(new Whip(new Milk(abstractBeverage3))));
        System.out.println(abstractBeverage3.getDescription() + " $" + abstractBeverage3.cost());
    }

}
