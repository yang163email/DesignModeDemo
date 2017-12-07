package com.yan.design.mode.factory.func.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/19 0:00
 * @description : 客户类
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();

        Factory2 factory2 = new ConcreteFactory2();
        ConcreteProductB product2 = factory2.createProduct(ConcreteProductB.class);
        product2.method();
    }
}
