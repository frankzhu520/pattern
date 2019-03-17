package com.demo.pattern.factory.simplefactory;

import com.demo.pattern.factory.IPhone;
import com.demo.pattern.factory.OnePlusPhone;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        PhoneFactory factory = new PhoneFactory();
        IPhone phone = factory.create(OnePlusPhone.class);
        phone.call();
    }
}