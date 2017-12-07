package com.yan.design.mode.iterator.demo3;

/**
 * @author : 楠GG
 * @date : 2017/12/7 21:19
 * @description : TODO
 */
public class XiaoMing {
    public static void main(String[] args) {
        //构造各个领导对象
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        //设置上一级领导处理者对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        //发起报账申请
        groupLeader.handleRequest(50000);
    }
}
