package com.yan.design.mode.original.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/15 22:46
 * @description : 登录实现
 */
public class LoginImpl implements Login {
    @Override
    public void login() {
        //模拟登录到服务器，获取用户信息
        User loginedUser = new User();
        //将服务器返回的完整信息设置给loginedUser对象
        loginedUser.age = 22;
        loginedUser.name = "Mr.Yang";
        loginedUser.address = new Address("广东省", "深圳市", "南山区");

        //登录完成后将用户信息设置到Session中LoginSession.getLoginSession()里
        LoginSession.getLoginSession().setLoginedUser(loginedUser);
    }
}
