package com.yan.design.mode.status.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/30 21:48
 * @description : 电视状态接口，定义了电视操作的函数
 */
public interface TvState {
    void nextChannel();
    void preChannel();
    void turnUp();
    void turnDown();
}
