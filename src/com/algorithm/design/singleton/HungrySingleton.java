package com.algorithm.design.singleton;

/**
 * @Author xmp
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){

    }
    public static HungrySingleton getSingelton() {
        return singleton;
    }
}
