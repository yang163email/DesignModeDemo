package com.yan.design.mode.factory.abst.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/25 22:18
 * @description : TODO
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
