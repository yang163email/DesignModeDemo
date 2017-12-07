package com.yan.design.mode.factory.func.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/21 22:03
 * @description : 奥迪 Q3
 */
public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        System.out.println(" Q3 起飞~~~ ");
    }

    @Override
    public void selfNavigation() {
        System.out.println(" Q3 开始自动巡航~~~ ");
    }
}
