package com.cosyit;

import com.cosyit.controller.AuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private AuthorSetting authorSetting;

    @RequestMapping("/demo1")
    String index(){
        return authorSetting.getName()+","+authorSetting.getAge();
    }
}
