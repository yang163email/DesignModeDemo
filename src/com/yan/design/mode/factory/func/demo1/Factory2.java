package com.yan.design.mode.factory.func.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/19 0:02
 * @description : TODO
 */
public abstract class Factory2 {
    /**
     * 抽象工厂方法
     * @param clz   产品对象类类型
     * @return  具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
