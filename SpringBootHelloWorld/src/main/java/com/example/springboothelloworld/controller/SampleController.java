package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunwei on 2018-03-13 Time:14:16:24
 */
@RestController
@RequestMapping(value = "/demo")
public class SampleController {

    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET)
    public String helloWorld(){
        return "HelloWorld";
    }
}
