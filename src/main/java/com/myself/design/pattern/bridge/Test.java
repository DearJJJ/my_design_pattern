package com.myself.design.pattern.bridge;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();
        AdvancedRemoteControl tvControl = new AdvancedRemoteControl(tv);
        AdvancedRemoteControl radioControl = new AdvancedRemoteControl(radio);

        tvControl.mute();
        System.out.println(tv.volume);
        tvControl.volumeUp();
        System.out.println(tv.volume);
        tvControl.togglePower();
        System.out.println(tv.powerStatus);

        System.out.println();
        System.out.println();
        System.out.println();

        radioControl.mute();
        System.out.println(radio.volume);
        radioControl.volumeUp();
        System.out.println(radio.volume);
        radioControl.togglePower();
        System.out.println(radio.powerStatus);

    }
}
