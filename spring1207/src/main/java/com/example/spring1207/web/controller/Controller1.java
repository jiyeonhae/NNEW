package com.example.spring1207.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {

    //==@requestMapping(value = "page1", method = Request)
    @GetMapping("page1")
    public String page1() {
        return "page1"; //html 이름
    }
        @GetMapping("page2")
        public String page2(){
            return "page2"; //html 이름
    }

}
