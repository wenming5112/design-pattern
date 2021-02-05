package com.ming.design.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcreteImplementorATest {

    @Test
    public void operationImpl() {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.operation();
    }
}