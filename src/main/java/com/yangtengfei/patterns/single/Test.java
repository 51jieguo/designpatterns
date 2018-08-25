package com.yangtengfei.patterns.single;


import com.sun.org.glassfish.gmbal.Description;

@Description("因为enum中的实例被保证只会被实例化一次，所以我们的INSTANCE也被保证实例化一次。 ")
public class Test {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"================"+Singleton.INSTANCE.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"================"+Singleton.INSTANCE.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"================"+Singleton.INSTANCE.getInstance());
            }
        }).start();
    }
}
