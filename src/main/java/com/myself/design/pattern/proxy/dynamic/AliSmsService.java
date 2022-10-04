package com.myself.design.pattern.proxy.dynamic;

public class AliSmsService {

    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }


}
