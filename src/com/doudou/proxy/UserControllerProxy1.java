package com.doudou.proxy;

public class UserControllerProxy1 implements IUserController {

    private UserController userController;

    public UserControllerProxy1(UserController UserController) {
        this.userController = UserController;
    }

    @Override
    public String register(String telephone, String password) {
        System.out.println("记录日志。。。。。。。。。。。。。。。。。。。。");
        return userController.register(telephone, password);
    }

    @Override
    public String login(String telephone, String password) {
        System.out.println("记录日志。。。。。。。。。。。。。。。。。。。。");
        return userController.login(telephone, password);
    }
}
