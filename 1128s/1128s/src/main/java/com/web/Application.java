package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//현재 server와 client가 같음 DB server도  따로 존재가능
	//ip = 컴퓨터의 주소 --domain 을 이용해 hosting port = 방
	//DB 포트는 3306으로 할거임
	//http 는 프로토콜. 인터페이스. 같은 통신을 사용해야 통신가능 GET, POST 등
			//홈페이지 받아오는것은 GET
}