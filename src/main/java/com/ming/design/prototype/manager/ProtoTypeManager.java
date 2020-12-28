package com.ming.design.prototype.manager;

import java.util.HashMap;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 10:32
 **/
public class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<>();

    ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}
