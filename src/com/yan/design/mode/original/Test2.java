package com.yan.design.mode.original;

import com.yan.design.mode.original.demo2.Address;
import com.yan.design.mode.original.demo2.LoginImpl;
import com.yan.design.mode.original.demo2.LoginSession;
import com.yan.design.mode.original.demo2.User;

/**
 * @author : 楠GG
 * @date : 2017/11/15 22:54
 * @description : 测试类
 */
public class Test2 {
    public static void main(String[] args) {
        //模拟登录
        LoginImpl loginImpl = new LoginImpl();
        loginImpl.login();

        //获取已登录的User对象
        User newUser = LoginSession.getLoginSession().getLoginedUser();
        System.out.println("原始登录信息：" + newUser);
        //更新用户
        newUser.address = new Address("北京市", "朝阳区", "大望路");
        System.out.println("更新后登录信息：" + newUser);
        System.out.println("原始登录信息：" + LoginSession.getLoginSession().getLoginedUser());
    }
}
