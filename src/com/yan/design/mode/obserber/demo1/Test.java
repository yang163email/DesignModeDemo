package com.yan.design.mode.obserber.demo1;

/**
 * @author      : yan
 * @date        : 2018/1/27
 * @description : 测试
 */
public class Test {
    public static void main(String[] args) {
        // 被观察的角色
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        // 观察者
        Coder mrYang = new Coder("mr.yang");
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");

        // 将观察者注册到可观察对象的观察者列表中
        devTechFrontier.addObserver(mrYang);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        devTechFrontier.postNewPublication("新的一期开发技术前线周报发布啦！");
    }
}
