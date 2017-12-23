package com.yan.design.mode.interpreter.demo1;

/**
 * @author : 楠GG
 * @date : 2017/12/23 9:14
 * @description : 抽象表达式
 */
public abstract class AbstractExpression {

    /**
     * 抽象的解析方法
     */
    public abstract void interpret(Context ctx);
}
