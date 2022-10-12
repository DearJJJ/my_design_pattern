package com.myself.design.create.abstractFac;

public class Application {
    private GUIFactory factory;

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = this.factory.createButton();
        this.checkbox = this.factory.createCheckbox();
    }

    void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
