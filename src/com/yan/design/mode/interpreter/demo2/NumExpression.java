package com.yan.design.mode.interpreter.demo2;

/**
 * @author : 楠GG
 * @date : 2017/12/23 9:21
 * @description : 数字解释器，仅仅为了解释数字
 */
public class NumExpression extends ArithmeticExpression{
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
