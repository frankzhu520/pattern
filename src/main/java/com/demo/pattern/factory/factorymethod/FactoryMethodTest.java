package com.demo.pattern.factory.factorymethod;

import com.demo.pattern.factory.IPhone;
import com.demo.pattern.factory.OnePlusPhone;
import com.demo.pattern.factory.SmartisanPhone;

public class FactoryMethodTest {

        public static void main(String[] args) {
            IFactory onePlusPhoneFactory = new OnePlusPhoneFactory();
            IPhone onePlusPhone = onePlusPhoneFactory.produce();
            onePlusPhone.call();

            IFactory smartisanPhoneFactory = new SmartisanPhoneFactory();
            IPhone smartisanPhone = new SmartisanPhone();
            smartisanPhone.call();
        }
}
