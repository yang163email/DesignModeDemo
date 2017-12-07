package com.yan.design.mode.status.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:00
 * @description : 电视遥控器，类似于经典状态模式中的Context
 */
public class TvController implements PowerController {
    private TvState mTvState;

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void preChannel() {
        mTvState.preChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
