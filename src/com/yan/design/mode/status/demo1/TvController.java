package com.yan.design.mode.status.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/30 21:48
 * @description : 电视遥控器，含有开机、关机、下一频道、上一频道、调高音量、调低音量这几个功能
 */
public class TvController {
    //开机状态
    private static final int POWER_ON = 1;
    //关机状态
    private static final int POWER_OFF = 2;

    private int mState = POWER_OFF;

    public void powerOn() {
        if (mState == POWER_OFF) {
            mState = POWER_ON;
            System.out.println("开机啦");
        }
    }

    public void powerOff() {
        if (mState == POWER_ON) {
            mState = POWER_OFF;
            System.out.println("关机啦");
        }
    }

    public void nextChannel() {
        if (mState == POWER_ON) {
            System.out.println("下一频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void preChannel() {
        if (mState == POWER_ON) {
            System.out.println("上一频道");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnUp() {
        if (mState == POWER_ON) {
            System.out.println("调高音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }

    public void turnDown() {
        if (mState == POWER_ON) {
            System.out.println("调低音量");
        } else {
            System.out.println("两个红灯提示没有开机");
        }
    }
}
