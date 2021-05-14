package com.doudou.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        UserControllerProxy1 userControllerProxy1 = new UserControllerProxy1(new UserController());
        String login1 = userControllerProxy1.login("", "");
        System.out.println(login1);

        System.out.println("-----------------------------------------------");

        UserControllerProxy2 userControllerProxy2 = new UserControllerProxy2();
        String login2 = userControllerProxy2.login("", "");
        System.out.println(login2);

        System.out.println("-----------------------------------------------");
        UserControllerProxy3 userControllerProxy3 = new UserControllerProxy3();
        IUserController proxy = (IUserController)userControllerProxy3.createProxy(new UserController());
        proxy.login("","");
    }
}
