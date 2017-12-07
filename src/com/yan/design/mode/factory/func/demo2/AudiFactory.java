package com.yan.design.mode.factory.func.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/21 21:53
 * @description : 奥迪汽车抽象工厂
 */
public abstract class AudiFactory {
    /**
     * 生产奥迪车
     * @param clz   具体型号类型
     * @return  具体型号车对象
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
