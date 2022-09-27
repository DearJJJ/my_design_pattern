package com.myself.module.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        SmsService proxySmsService = (SmsService)JdkProxyFactory.getProxy(new SmsServiceImpl());
//        proxySmsService.send("Hello World!");
        proxySmsService.doOther();
    }
}
