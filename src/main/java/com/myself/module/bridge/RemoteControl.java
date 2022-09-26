package com.myself.module.bridge;

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
