package com.myself.module.bridge;

public interface Device {

    void enable();

    void disable();

    boolean isEnabled();

    int getVolume();

    void setVolume(int volume);

    int getChanel();

    void setChanel(int chanel);
}
