package com.yan.design.mode.original.demo2;

/**
 * @author : 楠GG
 * @date : 2017/11/15 22:42
 * @description : 用户地址类，存储地址的详细信息
 */
public class Address {
    //城市
    public String city;
    //区
    public String district;
    //街道
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
