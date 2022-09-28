package com.myself.module.proxy2.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CheckInvocationHandler implements InvocationHandler {

    private final Object target;

    public CheckInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I'm before method");
        Object result = method.invoke(target, args);
        System.out.println("I'm after method");
        return result;
    }
}
