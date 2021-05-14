package com.doudou.proxy;

public interface IUserController {

    String register(String telephone, String password);

    String login(String telephone, String password);
}
