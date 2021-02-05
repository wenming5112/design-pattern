package com.ming.design.facade;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 16:11
 **/
public class Facade {
    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();

    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
