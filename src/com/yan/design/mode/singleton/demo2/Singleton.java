package com.yan.design.mode.singleton.demo2;

/**
 * @author      : 楠GG
 * @date        : 2017/12/8
 * @description : 懒汉模式
 */
public class Singleton {
   private static Singleton sInstance;
   private Singleton() { }
   
   public static synchronized Singleton getInstance() {
      if(sInstance == null) {
         sInstance = new Singleton(); 
      }
      return sInstance; 
   }
}