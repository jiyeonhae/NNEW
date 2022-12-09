package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageLoadTestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public String test1() 
    {
        System.out.println("t1요청");
        return "test1"; //html file name
    }

    @RequestMapping(value = "/t2", method = RequestMethod.GET)
    public String test2()
    {
        System.out.println("t2요청");
        return "test1";
    }

    @RequestMapping(value = "/test/page", method = RequestMethod.GET)
    public String test3()
    {
        System.out.println("t2page, test3 method");
        return "test/test2";
    }
    //요청, 호출 - requestmapping ~~~ return - 응답
}
