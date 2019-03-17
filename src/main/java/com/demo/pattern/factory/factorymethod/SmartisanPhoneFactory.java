package com.demo.pattern.factory.factorymethod;

import com.demo.pattern.factory.IPhone;
import com.demo.pattern.factory.SmartisanPhone;

public class SmartisanPhoneFactory implements IFactory{
    public IPhone produce() {
        return new SmartisanPhone();
    }
}
