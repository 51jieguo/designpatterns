package com.yangtengfei.patterns.factory.abstractFactoryPatterns;

public class Red implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}