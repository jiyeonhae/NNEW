package com.example.spring1207.web.IocandDI;

import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {
    
    //바로 본체에 이식xxxxxx impl용 클래스생성
    @Override
    public void printStudentInfo(Student student) {
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());

    }
}
