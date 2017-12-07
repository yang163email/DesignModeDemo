package com.yan.design.mode.status.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:03
 * @description : 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        //设置开机状态
        tvController.powerOn();
        //下一频道
        tvController.nextChannel();
        //调高音量
        tvController.turnUp();
        //设置关机状态
        tvController.powerOff();
        //调高音量
        tvController.turnUp();
    }
}
