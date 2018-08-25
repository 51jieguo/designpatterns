package com.yangtengfei.patterns.proxy.dynamicProxy.jdk.jdk1;

public class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("我要开始跑了");
    }
}
