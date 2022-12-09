package com.example.spring1207.web.IocandDI;

import org.springframework.stereotype.Component;

@Component("usi3") //springboot가 실행하기전 @componentscan이 객체 메모리할당을 하고 ioc container에 저장. == 싱글톤
public class UserServiceImpl3 implements UserService{
//파일 선택후 f5누르면 바로 복사가능

     @Override
    public void createUser() {
        System.out.println("user create3");
    }

    @Override
    public void getUser() {
        System.out.println("view3");
    }

    @Override
    public void updateUser() {
        System.out.println("update user info3");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user3");
    }
}
//3이 생성되면 ioc container 안에 bean이 2개 발견되서 작동안되는 오류발생. bean == 객체

//만약 impl2 & 3 둘다 @component 없으면 autowired 할 bean이 존재하지않는 오류 발생
//면접에서 자주 묻는 부분