package com.myself.module.bridge;

public class Radio implements Device {
    boolean powerStatus = false;
    int chanel = 0;
    int volume = 0;

    @Override
    public void enable() {
        this.powerStatus = true;
    }

    @Override
    public void disable() {
        this.powerStatus = false;
    }

    @Override
    public boolean isEnabled() {
        return powerStatus;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;
    }
}
