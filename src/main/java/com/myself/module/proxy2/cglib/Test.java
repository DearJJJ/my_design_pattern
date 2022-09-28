package com.myself.module.proxy2.cglib;

import com.myself.module.proxy.dynamic.CglibProxyFactory;

public class Test {
    public static void main(String[] args) {
        MyCheckService checkProxy = (MyCheckService) CglibProxyFactory.getCheckProxy(MyCheckService.class);
        checkProxy.check();
    }
}
