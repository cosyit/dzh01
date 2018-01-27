package com.cosyit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PorjectController {
    @Value("${project.name}")
    private String name;
    @Value("${project.author}")
    private String author;

    @RequestMapping("/book")
    String index(){
        return "project name is :" +name+",porject author is "+author;

    }
}
