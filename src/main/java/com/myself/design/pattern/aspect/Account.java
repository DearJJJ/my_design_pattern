package com.myself.design.pattern.aspect;

public class Account {

    int balance = 20;

    public boolean pay(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void doSome() {
        System.out.println("hello world");
    }
}
