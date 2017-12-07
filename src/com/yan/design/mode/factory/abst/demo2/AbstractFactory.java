package com.yan.design.mode.factory.abst.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/25 23:00
 * @description : TODO
 */
public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     */
    public abstract AbstractProductB createProductB();
}
