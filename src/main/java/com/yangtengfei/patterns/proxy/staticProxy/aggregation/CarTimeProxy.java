package com.yangtengfei.patterns.proxy.staticProxy.aggregation;

public class CarTimeProxy implements MoveAble {

    private MoveAble moveAble;

    public CarTimeProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    @Override
    public void move() {
        System.out.println("汽车开始跑时间:"+System.currentTimeMillis());
        moveAble.move();
        System.out.println("汽车结束时间:"+System.currentTimeMillis());
    }
}
