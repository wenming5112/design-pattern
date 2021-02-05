package com.ming.design.flyweight;

/**
 * @author ming
 * @version 1.0.0
 * @date 2021/2/2 16:30
 **/
public class UnsharedConcreteFlyweight {
    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
