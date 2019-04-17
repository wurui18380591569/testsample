package com;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/",method = RequestMethod.GET)
public class TestController {

    @RequestMapping(value = "/")
    public String test(){
        return "Welcome,congratulation that you are successful!";
    }
}
