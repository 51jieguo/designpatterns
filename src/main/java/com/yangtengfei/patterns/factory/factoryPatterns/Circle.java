package com.yangtengfei.patterns.factory.factoryPatterns;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}