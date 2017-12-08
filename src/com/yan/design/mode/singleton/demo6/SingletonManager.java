package com.yan.design.mode.singleton.demo6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author      : 楠GG
 * @date        : 2017/12/8
 * @description : 使用容器实现单例
 */
public class SingletonManager {
   private static Map<String, Object> objMap = new HashMap<>();
   
   private SingletonManager() { }
   public static void registerService (String key, Object instance) {
      if (!objMap.containsKey(key)) {
         objMap.put(key, instance);
      } 
   }
  
   public static Object getService(String key) {
      return objMap.get(key); 
   }
}