package com.yan.design.mode.singleton.demo3;

/**
 * @author      : 楠GG
 * @date        : 2017/12/8
 * @description : Double Check Lock (DCL)模式
 */
public class Singleton {
   private static Singleton sInstance;
   private Singleton() { }
   
   public static Singleton getInstance() {
      if(sInstance == null) {
         synchronized (Singleton.class) {
            if (sInstance == null) {
               sInstance = new Singleton(); 
            }         
         }
      }
      return sInstance; 
   }
}