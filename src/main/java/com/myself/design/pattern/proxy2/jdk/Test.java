package com.myself.design.pattern.proxy2.jdk;

import com.myself.design.pattern.proxy.JdkProxyFactory;

public class Test {
    public static void main(String[] args) {
        MyService service = new MyServiceImpl();
        MyService checkProxy = (MyService) JdkProxyFactory.getCheckProxy(service);
        checkProxy.encrypt();
        System.out.println("-----------------");
        service.encrypt();

    }
}
