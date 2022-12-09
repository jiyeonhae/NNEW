package com.example.spring1207.web.IocandDI;

import org.springframework.stereotype.Component;

@Component("usi2") //springboot가 실행하기전 @componentscan이 객체 메모리할당을 하고 ioc container에 저장. == 싱글톤
public class UserServiceImpl2 implements UserService{
//파일 선택후 f5누르면 바로 복사가능

     @Override
    public void createUser() {
        System.out.println("user create2");
    }

    @Override
    public void getUser() {
        System.out.println("view2");
    }

    @Override
    public void updateUser() {
        System.out.println("update user info2");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user2");
    }
}
