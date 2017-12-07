package com.yan.design.mode.iterator.demo2;

/**
 * @author : 楠GG
 * @date : 2017/12/5 23:37
 * @description : 抽象请求者
 */
public abstract class AbstractRequest {
    private Object obj; //处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     * @return  请求级别
     */
    public abstract int getRequestLevel();
}
