package com.example.spring1207.web.IocandDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;



    @ResponseBody
    @GetMapping("/student")
    public String printStudent(){
        studentService.printStudentInfo(new Student(2033, "Mass"));
        Student student = Student.builder().studentId(222).studentName("erwer").build();
        return null;
    }

    //상위개념 ioc등록되는 component - controller, repository, service, config
    //controller등에 해당되지 않지만ioc에 들어가야할 경우 component @를 쓴다
}
