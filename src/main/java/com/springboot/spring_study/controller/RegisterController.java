package com.springboot.spring_study.controller;

import com.springboot.spring_study.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rensiqi1
 * @date 2021/6/6 15:35
 */
@RestController
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("")
    public String register(String username) throws Exception{
        return registerService.checkUsername(username)?"注册成功":"用户名已被占用";
    }
}
