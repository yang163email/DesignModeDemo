package com.yan.design.mode.iterator.demo2;

/**
 * @author : 楠GG
 * @date : 2017/12/5 23:47
 * @description : 处理者
 */
public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:" + request.getRequestLevel());
    }
}
