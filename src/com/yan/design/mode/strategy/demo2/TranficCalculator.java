package com.yan.design.mode.strategy.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/27 22:20
 * @description : TODO
 */
public class TranficCalculator {
    private CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘坐16公里的价格：" + calculator.calculatePrice(16));

        calculator.setStrategy(new SubwayStrategy());
        System.out.println("地铁乘坐16公里的价格：" + calculator.calculatePrice(16));

        calculator.setStrategy(new TaxiStrategy());
        System.out.println("出租车乘坐16公里的价格：" + calculator.calculatePrice(16));
    }
}
