package com.yan.design.mode.singleton.demo4;

/**
 * @author      : 楠GG
 * @date        : 2017/12/8
 * @description : 静态内部类单例
 */
public class Singleton {  
   private Singleton() { }
   
   public static Singleton getInstance() {
       return SingletonHolder.sInstance; 
   }
  
   /** 静态内部类 */
   private static class SingletonHolder {
      private static Singleton sInstance = new Singleton();
   }
}