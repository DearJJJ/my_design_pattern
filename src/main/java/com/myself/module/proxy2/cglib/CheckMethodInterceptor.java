package com.myself.module.proxy2.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CheckMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("I'm before method");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("I'm after method");
        return result;
    }
}
