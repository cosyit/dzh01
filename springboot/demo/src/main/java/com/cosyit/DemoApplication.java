package com.cosyit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@ImportResource({"classpath:a.xml","classpath:b.xml"})//sb无法满足你的需求情况，必须要使用。
@SpringBootApplication //Spring项目的核心注解  开启springBoot的启动自动配置。
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
