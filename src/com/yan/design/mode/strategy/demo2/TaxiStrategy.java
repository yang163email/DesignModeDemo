package com.yan.design.mode.strategy.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/27 22:57
 * @description : 出租车计算策略
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
