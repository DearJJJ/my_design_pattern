package com.myself.design.create.factory;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("I'm doing HTMLButton render");
    }

    @Override
    public void onClick() {
        System.out.println("I'm doing HTMLButton click");
    }
}
