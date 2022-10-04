package com.myself.design.pattern.aspect;

public class Test {
    public static void main(String[] args) {
        testCompileTime();
    }
    public static void testCompileTime() {
        Account account = new Account();
        System.out.println("==================");
        account.pay(10);
        account.pay(50);
        account.doSome();
        System.out.println("==================");
    }
}
