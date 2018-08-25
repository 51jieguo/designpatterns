package com.yangtengfei.patterns.proxy.staticProxy.aggregation;

public class CarLogProxy implements  MoveAble {
    private MoveAble moveAble;

    public CarLogProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    @Override
    public void move() {
        System.out.println("日志记录开始");
        moveAble.move();
        System.out.println("日志记录结束");
    }
}
