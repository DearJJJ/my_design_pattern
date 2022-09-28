package com.myself.module.proxy;

import com.myself.module.proxy2.jdk.CheckInvocationHandler;

import java.lang.reflect.Proxy;

public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new DebugInvocationHandler(target));
    }

    public static Object getCheckProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new CheckInvocationHandler(target));
    }
}
