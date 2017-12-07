package com.yan.design.mode.builder.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/13 22:07
 * @description : 负责构造 Computer
 */
public class Director {
    Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建对象
     */
    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
