package com.yangtengfei.patterns.proxy.staticProxy.aggregation;

public class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("我要跑了");
    }
}
