package com.yan.design.mode.original.demo1;

import java.util.ArrayList;

/**
 * @author : 楠GG
 * @date : 2017/11/15 23:10
 * @description : 文档类型，扮演的是ConcretePrototype角色，而Cloneable是代表Prototype角色
 */
public class WordDocument implements Cloneable {
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<>();
    private int num;

    public WordDocument() {
        System.out.println("--------------WordDocument构造函数-------------");
    }

    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
//            doc.mImages = this.mImages;
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            doc.num = this.num;
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImages(String image) {
        mImages.add(image);
    }

    public void showDocument() {
        System.out.println("--------------Word Content Start---------------");
        System.out.println("Text: " + mText);
        System.out.println("num: " + num);
        System.out.println("Images List: ");
        for (String imageName : mImages) {
            System.out.println("image name: " + imageName);
        }
        System.out.println("---------------Word Content End--------------");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
