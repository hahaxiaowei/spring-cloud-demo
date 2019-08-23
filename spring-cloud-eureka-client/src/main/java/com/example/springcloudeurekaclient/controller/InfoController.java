package com.example.springcloudeurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 孙伟17
 * @CreateDate: 2019/8/23 13:35
 */
@RestController
public class InfoController {

    @RequestMapping(value = "/info")
    public String getInfo(){
        return "您已经注册成功!";
    }
}
