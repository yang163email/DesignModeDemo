package com.yan.design.mode.strategy.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/27 22:48
 * @description : 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * @param km    公里
     * @return  返回价格
     */
    int calculatePrice(int km);
}
