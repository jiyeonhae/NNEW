package com.example.spring1207.web.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean //수동적으로 클래스를 등록시키기  component는 객체 하나씩만 가능
    public Test1 t1() {
        return new Test1();
    }

    @Bean
    public Test2 t2 () {
        return new Test2();
    }

}
