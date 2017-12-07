package com.yan.design.mode.original.demo1;

import java.util.Date;

/**
 * @author : 楠GG
 * @date : 2017/11/15 23:15
 * @description : 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        //1.构建文档对象
        WordDocument originDoc = new WordDocument();
        //2.编辑文档，添加图片等
        originDoc.setText("这是一篇文档");
        originDoc.setNum(1);
        originDoc.addImages("图片1");
        originDoc.addImages("图片2");
        originDoc.addImages("图片3");
        originDoc.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();
        //修改文档副本，不会影响原始文档
        doc2.setText("这是修改过的Doc2文本");
        doc2.setNum(2);
        doc2.addImages("haha.jpg");
        doc2.showDocument();

        System.out.println("doc2Text=" + doc2.getText().hashCode());
        System.out.println("originDoc=" + originDoc.getText().hashCode());
        originDoc.showDocument();
    }
}
