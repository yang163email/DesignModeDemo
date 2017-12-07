package com.yan.design.mode.factory.abst.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/25 23:01
 * @description : TODO
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
