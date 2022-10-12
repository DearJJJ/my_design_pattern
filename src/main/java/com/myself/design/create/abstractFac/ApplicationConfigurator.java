package com.myself.design.create.abstractFac;

public class ApplicationConfigurator {

    public static void main(String[] args) {
        String config = "Windows";

        GUIFactory factory;

        if (config.equals("Windows")) {
            factory = new WinFactory();

        } else if (config.equals("Web")) {
            factory = new MacFactory();

        } else {
            throw new RuntimeException("未知错误");
        }

        Application app = new Application(factory);
        app.createUI();
        app.paint();

    }
}
