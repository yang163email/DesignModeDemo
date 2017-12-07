package com.yan.design.mode.builder.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/13 22:01
 * @description : 具体的Computer类，Macbook
 */
public class Macbook extends Computer {
    public Macbook() {
    }

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.10";
    }
}
