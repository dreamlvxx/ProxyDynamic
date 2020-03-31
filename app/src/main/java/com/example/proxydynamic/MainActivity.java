package com.example.proxydynamic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProxyImpl impl = new ProxyImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(impl);
        ProxyInteface proxyInteface = (ProxyInteface) Proxy.newProxyInstance(impl.getClass().getClassLoader(),impl.getClass().getInterfaces(),myInvocationHandler);
        proxyInteface.sendMessage();
    }
}
