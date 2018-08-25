package com.yangtengfei.patterns.factory.abstractFactoryPatterns;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}