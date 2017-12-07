package com.yan.design.mode.iterator.demo1;

/**
 * @author : 楠GG
 * @date : 2017/12/5 23:31
 * @description : 具体的处理者1
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handled");
        } else {
            successor.handleRequest(condition);
        }
    }
}
