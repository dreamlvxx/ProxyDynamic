package com.example.proxydynamic;

public class ProxyImpl implements ProxyInteface{

    @Override
    public void sendMessage() {
        System.out.println("ProxyImpl");
    }
}
