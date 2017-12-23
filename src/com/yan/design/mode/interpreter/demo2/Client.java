package com.yan.design.mode.interpreter.demo2;

/**
 * @author : 楠GG
 * @date : 2017/12/23 10:47
 * @description : TODO
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("1 + 2 + 3 + 10");
        System.out.println(calculator.calculate());
    }
}
