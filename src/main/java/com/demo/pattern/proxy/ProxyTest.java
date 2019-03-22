package com.demo.pattern.proxy;

import java.lang.reflect.Method;

public class ProxyTest {

    public static void main(String[] args) {
        try {

            Object obj = new Daigou().getInstance(new Girl());
            Method method = obj.getClass().getMethod("buySth",null);
            method.invoke(obj);

            //obj.findLove();

            //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}