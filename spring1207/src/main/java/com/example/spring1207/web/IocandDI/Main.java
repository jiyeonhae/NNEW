package com.example.spring1207.web.IocandDI;

public class Main {
    private final UserService userService;

    public Main (UserService userService) {
        this.userService = userService; //this userservice는 곧 main
    }

    public void run() {
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
    }
    public static void main(String[] args) {
        UserService userService = UserServiceImpl.getInstance();
        Main main = new Main(userService); //이건 의존성 주입한것
        //의존관계는 존재. but serviceimpl instance를 따로 만들어서 main으로 ==DI
        //spring은 의존성 자동주입함  요객체는 static영역에. 언제든 꺼낼 수 있음 ==Ioc


        main.run();
    }

    //결합도가 높다 : 일체형. 만약 메인 메서드에서 유저서비스 임플리의 객체를 바로 생성 - 생성하려면 또 메인이 필요 - 서로 연관성 높음
    //다만 객체지향에는 어울리지않음.



}
