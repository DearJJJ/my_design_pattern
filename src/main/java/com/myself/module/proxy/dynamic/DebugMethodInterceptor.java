package com.myself.module.proxy.dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DebugMethodInterceptor implements MethodInterceptor {

    /**
     * @param o           代理对象（增强的对象）
     * @param method      被拦截的方法（需要增强的方法）
     * @param args        方法入参
     * @param methodProxy 用于调用原始方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method " + method.getName());
        Object object = methodProxy.invokeSuper(o, args);
//        Object object = method.invoke(o, args);   这里会报错
        System.out.println("after method " + method.getName());
        return object;
    }
}
