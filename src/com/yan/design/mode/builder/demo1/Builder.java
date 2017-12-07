package com.yan.design.mode.builder.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/13 22:02
 * @description : 抽象builder类
 */
public abstract class Builder {
    // 设置主板
    public abstract void buildBoard(String board);
    // 设置显示器
    public abstract void buildDisplay(String display);
    // 设置操作系统
    public abstract void buildOS();
    // 创建 Computer
    public abstract Computer create();
}
