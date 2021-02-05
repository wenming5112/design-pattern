package com.ming.design.bridge;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:45
 **/
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
