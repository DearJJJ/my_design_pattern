package com.myself.module.proxy.dynamic;

public class Test {
    public static void main(String[] args) {
        AliSmsService proxy = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        proxy.send("Hello World");
    }
}
