package com.doudou.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class UserControllerProxy3  {

    public Object createProxy(Object proxiedObject) {

        Class[] interfaces = proxiedObject.getClass().getInterfaces();

        InvocationHandler invocationHandler = (proxy, method, args) -> {
            System.out.println("代理开始");
            Object invoke = method.invoke(proxiedObject, args);
            System.out.println("代理结束");
            return invoke;
        };

    return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, invocationHandler); }
}
