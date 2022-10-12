package com.myself.design.create.factory;

public class Application {

    private String env = "Windows";

    private Dialog dialog;

    public void initialize() {
        if (env.equals("Windows")) {
            dialog = new WindowsDialog();
        } else if (env.equals("Web")) {
            dialog = new WebDialog();
        } else {
            throw new RuntimeException("未知错误");
        }
    }

    public void begin() {
        initialize();
        dialog.render();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.begin();

        app.env = "Web";
        app.begin();
    }
}
