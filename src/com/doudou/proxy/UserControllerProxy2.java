package com.doudou.proxy;

public class UserControllerProxy2 extends UserController {

    @Override
    public String register(String telephone, String password) {
        System.out.println("代理前干啥");
        String register = super.register(telephone, password);
        System.out.println("代理后干啥");
        return register;
    }

    @Override
    public String login(String telephone, String password) {
        System.out.println("代理前干啥");
        String login = super.login(telephone, password);
        System.out.println("代理后干啥");
        return login;
    }
}
