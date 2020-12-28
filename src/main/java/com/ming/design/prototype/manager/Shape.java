package com.ming.design.prototype.manager;

/**
 * @author ming
 * @version 1.0.0
 * @date 2020/12/28 10:24
 **/
interface Shape extends Cloneable {
    /**
     * copy
     *
     * @return Object
     */
    Object clone();

    /**
     * countArea
     */
    void countArea();
}
