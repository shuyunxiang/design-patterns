package com.doudou.proxy;

public class UserController implements IUserController {

    @Override
    public String register(String telephone, String password) {
        return "注册成功";
    }

    @Override
    public String login(String telephone, String password) {
        return "登陆成功";
    }
}
