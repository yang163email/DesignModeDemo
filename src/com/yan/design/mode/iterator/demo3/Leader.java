package com.yan.design.mode.iterator.demo3;

/**
 * @author : 楠GG
 * @date : 2017/12/7 21:09
 * @description : 抽象领导者
 */
public abstract class Leader {
    //上一级领导处理者
    protected Leader nextHandler;

    /**
     * 处理报账请求
     * @param money 能批复的报账额度
     */
    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(money);
            }
        }
    }

    /**
     * 自身能够批复的额度权限
     * @return  额度
     */
    protected abstract int limit();

    /**
     * 处理报账行为
     * @param money 具体金额
     */
    protected abstract void handle(int money);
}
