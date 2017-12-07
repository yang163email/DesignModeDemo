package com.yan.design.mode.factory.abst.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/25 22:17
 * @description : TODO
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
