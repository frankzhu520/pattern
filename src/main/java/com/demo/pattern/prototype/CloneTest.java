package com.demo.pattern.prototype;


import java.util.ArrayList;

public class CloneTest {

    public static void main(String[] args) {

        Auth auth = new Auth();
        auth.userCode = "zhangsan";
        auth.age = 19;
        try {
            Auth clone = (Auth)auth.clone();
            System.out.println("深克隆：" + (auth.authList == clone.authList));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Auth a = new Auth();
        Auth n = a.shallowClone(a);
        System.out.println("浅克隆：" + (a.authList == n.authList));

    }
}
