package com.yan.design.mode.factory.func.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/18 23:59
 * @description : 具体工厂类
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
