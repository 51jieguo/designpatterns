package com.yangtengfei.patterns.factory.factoryPatterns;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}