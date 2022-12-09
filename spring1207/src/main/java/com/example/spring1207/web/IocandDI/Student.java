package com.example.spring1207.web.IocandDI;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Builder
@Data
public class Student{
    private int studentId;
    private String studentName;



}
