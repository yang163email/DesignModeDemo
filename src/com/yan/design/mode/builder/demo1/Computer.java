package com.yan.design.mode.builder.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/13 21:33
 * @description : 计算机抽象类，即product角色
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {

    }
    // 设置主板
    public void setBoard(String board) {
        mBoard = board;
    }
    // 设置显示器
    public void setDisplay(String display) {
        mDisplay = display;
    }
    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
