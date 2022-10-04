package com.myself.design.pattern.proxy;

public class SmsServiceImpl implements SmsService, OtherService {
    @Override
    public String send(String msg) {
        System.out.println("send message:" + msg);
        return msg;
    }

    @Override
    public void doOther() {
        System.out.println("do other");
    }


    @Override
    public void otherDo() {
        System.out.println("I'm otherDo");
    }
}
