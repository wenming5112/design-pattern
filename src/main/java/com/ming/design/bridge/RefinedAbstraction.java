package com.ming.design.bridge;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 14:46
 **/
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }
}
