package com.yangtengfei.patterns.factory.abstractFactoryPatterns;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}