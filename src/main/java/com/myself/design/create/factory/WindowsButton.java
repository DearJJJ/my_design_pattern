package com.myself.design.create.factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("I'm doing windows render");
    }

    @Override
    public void onClick() {
        System.out.println("I'm doing windows click");
    }
}
