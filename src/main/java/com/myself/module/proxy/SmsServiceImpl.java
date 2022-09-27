package com.myself.module.proxy;

public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String msg) {
        System.out.println("send message:" + msg);
        return msg;
    }

    @Override
    public void doOther() {
        System.out.println("do other");
    }


}
