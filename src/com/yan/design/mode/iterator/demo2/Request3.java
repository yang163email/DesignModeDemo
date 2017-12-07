package com.yan.design.mode.iterator.demo2;

/**
 * @author : 楠GG
 * @date : 2017/12/5 23:45
 * @description : 请求者
 */
public class Request3 extends AbstractRequest {
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
