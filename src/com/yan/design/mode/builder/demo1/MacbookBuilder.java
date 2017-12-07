package com.yan.design.mode.builder.demo1;

/**
 * @author : 楠GG
 * @date : 2017/11/13 22:05
 * @description : 具体的builder类，MacbookBuilder
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
