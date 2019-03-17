package com.demo.pattern.factory.simplefactory;

import com.demo.pattern.factory.IPhone;

public class PhoneFactory {


    public IPhone create(Class<? extends IPhone> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}