package com.yan.design.mode.interpreter.demo2;

/**
 * @author : 楠GG
 * @date : 2017/12/23 10:22
 * @description : 加法运算抽象解释器
 */
public class AdditionExpression extends OperatorExpression {
    public AdditionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
