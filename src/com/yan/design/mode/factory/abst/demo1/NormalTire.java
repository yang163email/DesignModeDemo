package com.yan.design.mode.factory.abst.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/25 22:14
 * @description : TODO
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
