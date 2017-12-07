package com.yan.design.mode.factory.abst.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/25 22:21
 * @description : TODO
 */
public class Client {
    public static void main(String[] args) {
        Q3Factory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();

        System.out.println("-----------------");

        Q7Factory factoryQ7 = new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createEngine().engine();
        factoryQ7.createBrake().brake();
    }
}
