package com.myself.design.pattern.proxy2.jdk;

public class MyServiceImpl implements MyService {
    @Override
    public void encrypt() {
        System.out.println("I'm doing encrypt");
    }
}
