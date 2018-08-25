package com.yangtengfei.patterns.proxy.dynamicProxy.jdk.jdk1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{

    private Object object;

    public TimeHandler(Object object) {
        super();
        this.object = object;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 代理对象的方法
     * @param args 参数
     * @return object 方法返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始:"+System.currentTimeMillis());
        method.invoke(object);
        System.out.println("结束:"+System.currentTimeMillis());
        return null;
    }
}
