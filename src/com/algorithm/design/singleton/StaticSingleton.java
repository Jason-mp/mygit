package com.algorithm.design.singleton;

/**
 * @Author xp
 * @Date：2019-02-11
 */
public class StaticSingleton {
    private static class Singleton{
        private static final StaticSingleton instance = new StaticSingleton();
    }

    private StaticSingleton() {
    }
    public StaticSingleton getInstance() {
        return Singleton.instance;
    }
}
