package com.yan.design.mode.original.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/15 22:50
 * @description : 登录Session
 */
public class LoginSession {
    static LoginSession sLoginSession = null;
    //已登录用户
    private User loginedUser;

    private LoginSession() {
    }

    public static LoginSession getLoginSession() {
        if (sLoginSession == null) {
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }
    // 设置已登录的用户信息，只能在同一包下才能访问，不对外开放
    void setLoginedUser(User loginedUser) {
        this.loginedUser = loginedUser;
    }

    public User getLoginedUser() {
//        return loginedUser;
        return loginedUser.clone();
    }
}
