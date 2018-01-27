package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
//Core annotation :核心注解  @SpringBootApplication 来 开启自动配置
public class DemoApplication {

	@RequestMapping("/")
	String index(){
		return "HELLO WORLD!";
	}


	//Java应用标准入口，作为项目启动的入口。
	public static void main(String[] args) {

		//java -jar xx.jar
		//mvn spring-boot:run
		//IDE
		SpringApplication.run(DemoApplication.class, args);
	}
}
