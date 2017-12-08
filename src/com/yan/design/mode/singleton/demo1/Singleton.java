package com.yan.design.mode.singleton.demo1;

/**
 * @author : 楠GG
 * @date : 2017/12/8 23:01
 * @description : 饿汉模式
 */
public class Singleton {
    private static Singleton sInstance = new Singleton();
    private Singleton() { }

    public static Singleton getInstance() {
        return sInstance;
    }
}
