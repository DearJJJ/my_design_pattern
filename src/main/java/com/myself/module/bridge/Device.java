package com.myself.module.bridge;

/**
 *  “实现部分”接口声明了在所有具体实现类中通用的方法。它不需要与抽象接口相匹配。
 *   实际上，这两个接口可以完全不一样。通常实现接口只提供原语操作，
 *   而抽象接口则会基于这些操作定义较高层次的操作。
 *
 */
public interface Device {

    void enable();

    void disable();

    boolean isEnabled();

    int getVolume();

    void setVolume(int volume);

    int getChanel();

    void setChanel(int chanel);
}
