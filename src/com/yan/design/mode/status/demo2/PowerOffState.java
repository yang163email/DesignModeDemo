package com.yan.design.mode.status.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/30 21:57
 * @description : 关机状态，此时只有开机功能是有效的
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
    }

    @Override
    public void preChannel() {
    }

    @Override
    public void turnUp() {
    }

    @Override
    public void turnDown() {
    }
}
