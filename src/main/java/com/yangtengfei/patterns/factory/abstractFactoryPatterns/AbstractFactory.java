package com.yangtengfei.patterns.factory.abstractFactoryPatterns;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;
}