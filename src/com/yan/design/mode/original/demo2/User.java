package com.yan.design.mode.original.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/15 22:41
 * @description : 用户实体类
 */
public class User implements Cloneable{
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected User clone() {
        User user = null;
        try {
            user = ((User) super.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
