package com.algorithm.design.singleton;


/**
 * @Author xp
 * @Date: 2019-01-12
 */
public class DoubleChecked {
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

}
