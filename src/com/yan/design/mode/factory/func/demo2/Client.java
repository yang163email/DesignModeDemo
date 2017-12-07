package com.yan.design.mode.factory.func.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/21 22:05
 * @description : TODO
 */
public class Client {
    public static void main(String[] args) {
        //构造一个制造汽车的工厂对象
        AudiFactory factory = new AudiCarFactory();
        //生产 Q3 并启动
        AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();
        //生产 Q5 并启动
        AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();
        //生产 Q7 并启动
        AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}
