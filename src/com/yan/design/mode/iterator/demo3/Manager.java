package com.yan.design.mode.iterator.demo3;

/**
 * @author : 楠GG
 * @date : 2017/12/7 21:14
 * @description : TODO
 */
public class Manager extends Leader {

    @Override
    protected int limit() {
        return 10000;
    }

    @Override
    protected void handle(int money) {
        System.out.println("经理批复报销" + money + "元");
    }
}
