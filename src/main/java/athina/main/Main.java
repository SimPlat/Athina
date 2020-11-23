package main;

import controller.LoginController;

public class Main {

    public static void main(String[] args) {
        LoginController lc = new LoginController("st12345678","test");
        System.out.println(lc.logIn());
    }
   
}