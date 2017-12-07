package com.yan.design.mode.iterator.demo1;

/**
 * @author : 楠GG
 * @date : 2017/12/5 23:29
 * @description : 抽象处理者
 */
public abstract class Handler {
    protected Handler successor;    //下一节点的处理者

    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
