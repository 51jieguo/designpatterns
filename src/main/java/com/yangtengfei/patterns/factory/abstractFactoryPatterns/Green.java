package com.yangtengfei.patterns.factory.abstractFactoryPatterns;

public class Green implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}