package com.yan.design.mode.factory.abst.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/25 22:12
 * @description : 抽象车厂类
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     */
    public abstract IBrake createBrake();
}
