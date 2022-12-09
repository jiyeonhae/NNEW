package com.example.spring1207.web.IocandDI;

public class UserServiceImpl implements UserService{

    private static UserServiceImpl instance = null;
    private UserServiceImpl(){}
    public static UserServiceImpl getInstance() {
        if(instance == null){
            instance = new UserServiceImpl();
        }
        return instance;
    }
//instance 선언부터 자기 자신을 가지는 객체 : 싱글톤. 위에가 싱글톤 만든거

     @Override
    public void createUser() {
        System.out.println("user create");
    }

    @Override
    public void getUser() {
        System.out.println("view");
    }

    @Override
    public void updateUser() {
        System.out.println("update user info");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");
    }
}
