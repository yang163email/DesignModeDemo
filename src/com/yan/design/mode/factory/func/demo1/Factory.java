package com.yan.design.mode.factory.func.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/18 23:58
 * @description : 抽象工厂类
 */
public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生产什么由子类实现
     */
    public abstract Product createProduct();
}
