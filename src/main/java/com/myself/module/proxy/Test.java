package com.myself.module.proxy;

public class Test {
    public static void main(String[] args) {
        OtherService otherService = (OtherService)JdkProxyFactory.getProxy(new SmsServiceImpl());
//        proxySmsService.send("Hello World!");
        otherService.otherDo();
        System.out.println("---------");
        SmsService proxySms = (SmsService)JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxySms.doOther();
        proxySms.send("hello world");
    }
}
