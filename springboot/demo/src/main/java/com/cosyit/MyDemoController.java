package com.cosyit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDemoController {
    @RequestMapping("/hi")
    String index(){
        return "Hello Spring Boot";
    }
}
