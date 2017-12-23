package com.yan.design.mode.interpreter.demo2;

import java.util.Stack;

/**
 * @author : 楠GG
 * @date : 2017/12/23 10:33
 * @description : 处理与解释相关的一些业务
 */
public class Calculator {
    //声明一个Stack栈存储并操作所有相关的解释器
    private Stack<ArithmeticExpression> mExpStack = new Stack<>();

    public Calculator(String expression) {
        //声明两个TerminalExpression类型的临时变量，存储运算符左右两边的数字解释器
        ArithmeticExpression exp1, exp2;

        String[] elements = expression.split(" ");

        //循环遍历表达式元素数组
        for (int i = 0; i < elements.length; i++) {
            //判断运算符号
            switch (elements[i].charAt(0)) {
                case '+':   //如果是加号
                    //将栈中的解释器弹出作为运算符号右边的解释器
                    exp1 = mExpStack.pop();
                    //同时将运算符号数组下标下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过尚明两个数字解释器构造加法运算解释器
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-':   //如果是减号
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubtractionExpression(exp1, exp2));
                    break;
                default:    //如果是数字
                    //直接构造数字解释器并压入栈
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate() {
        return mExpStack.pop().interpret();
    }
}
