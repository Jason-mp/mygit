package com.algorithm.design.singleton;

/**
 * @Author xp
 * @Date：2019-02-07
 */
public class LazySingleton {
    public static LazySingleton instance;

    private LazySingleton(){}
    //懒汉式，线程不安全
    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
    //懒汉式，线程安全，效率较低
    public static synchronized LazySingleton getSafeInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
