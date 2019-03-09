package com.algorithm.design.singleton;


import java.io.Serializable;

/**
 * @Author xp
 * @Date: 2019-01-12
 */
public class DoubleChecked implements Serializable,Cloneable {
    private static volatile DoubleChecked instance;

    private DoubleChecked(){}

    public static DoubleChecked getInstance() {
        if (instance == null) {
            synchronized (DoubleChecked.class) {
                if (instance == null) {
                    instance = new DoubleChecked();
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
