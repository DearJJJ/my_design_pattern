package com.myself.design.pattern.proxy;

public class Test {
    public static void main(String[] args) {
        OtherService otherService = (OtherService)JdkProxyFactory.getProxy(new SmsServiceImpl());
//        proxySmsService.send("Hello World!");
        otherService.otherDo();
        System.out.println("---------");
        SmsService proxySms = (SmsService)JdkProxyFactory.getProxy(new SmsServiceImpl());
        proxySms.doOther();
        proxySms.send("hello world");


        System.out.println("hello world".indexOf("hello"));
    }
}
