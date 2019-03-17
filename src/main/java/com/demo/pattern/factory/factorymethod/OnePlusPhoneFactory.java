package com.demo.pattern.factory.factorymethod;

import com.demo.pattern.factory.IPhone;
import com.demo.pattern.factory.OnePlusPhone;

public class OnePlusPhoneFactory implements IFactory {
    public IPhone produce() {
        return new OnePlusPhone();
    }
}
