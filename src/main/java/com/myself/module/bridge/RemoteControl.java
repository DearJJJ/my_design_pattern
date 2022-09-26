package com.myself.module.bridge;

/**
 *  “抽象部分”定义了两个类层次结构中“控制”部分的接口。它管理着一个指向“实
 *  现部分”层次结构中对象的引用，并会将所有真实工作委派给该对象。
 */
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    public void chanelDown() {
        device.setChanel(device.getChanel() - 1);
    }

    public void chanelUp() {
        device.setChanel(device.getChanel() + 1);
    }
}
