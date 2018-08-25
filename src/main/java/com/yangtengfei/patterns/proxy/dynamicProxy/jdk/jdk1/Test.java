package com.yangtengfei.patterns.proxy.dynamicProxy.jdk.jdk1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler invocationHandler = new TimeHandler(car);
        Class clas = car.getClass();
        MoveAble moveAble = (MoveAble)Proxy.newProxyInstance(clas.getClassLoader(),clas.getInterfaces(),invocationHandler);
        moveAble.move();
    }
}
