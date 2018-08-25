package com.yangtengfei.patterns.proxy.staticProxy.extend;

public class ProxyPatternDemo {
   
   public static void main(String[] args) {
     /* Image image = new ProxyImage("test_10mb.jpg");
 
      // 图像将从磁盘加载
      image.display(); 
      System.out.println("");
      // 图像不需要从磁盘加载
      image.display();  */

     Image2 image2 = new Image2("12312321");
     image2.display();
   }
}