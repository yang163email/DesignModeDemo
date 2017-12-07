package com.yan.design.mode.iterator.demo1;

/**
 * @author : 楠GG
 * @date : 2017/12/5 23:31
 * @description : 具体的处理者2
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")) {
            System.out.println("ConcreteHandler2 handled");
        } else {
            successor.handleRequest(condition);
        }
    }
}
