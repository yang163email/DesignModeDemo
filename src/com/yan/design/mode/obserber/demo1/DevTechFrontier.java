package com.yan.design.mode.obserber.demo1;

import java.util.Observable;

/**
 * @author      : yan
 * @date        : 2018/1/27
 * @description : 被观察者
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        // 标识状态或者内容发生变化
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}
