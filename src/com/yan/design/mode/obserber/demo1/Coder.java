package com.yan.design.mode.obserber.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author      : yan
 * @date        : 2018/1/27
 * @description : 观察者对象
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi, " + name + ", 开发技术前线更新啦，内容： " + arg);
    }

    @Override
    public String toString() {
        return "码农：" + name;
    }
}
