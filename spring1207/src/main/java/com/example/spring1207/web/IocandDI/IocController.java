package com.example.spring1207.web.IocandDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IocController {
    @Autowired   //ioc container속 객체를 @autowired가 스캔후 자동으로 DI, 즉 주입을 해준다, 자신의 객체를 찾아냄
    @Qualifier("usi2") //ioc에 올라갈때 객체의 별명을 구분해서 해당 빈으로 가져옴
    private UserServiceImpl2 userService; //원래 멤버변수 선언+ impl생성해야하지만 impl2생성 안해도 동작함
        //안에 이미 impl2가 생성되어있음 -- ioc working 제어의 역전. spring does make instance. 
    @ResponseBody
    @GetMapping("/ioc")
    public String iocTest(){
        userService.createUser();
        userService.getUser();
        userService.updateUser();
        userService.deleteUser();
        return null;
    }//code1218 git
}
