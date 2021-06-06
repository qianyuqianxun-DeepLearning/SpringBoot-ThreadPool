package com.springboot.spring_study.controller;


import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import static org.junit.Assert.assertEquals;

public class RegisterControllerTest extends BaseControllerTest {

    /**
     * 模拟100个用户同时访问注册接口
     */
    @Test
    public void register() throws Exception {
        for (int i = 1; i <= 1000; i++) {
            assertEquals("注册成功", singleRegister(i));
        }
    }

    private String singleRegister(int i) throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("username", "guest" + i);
        return mockGet("/register", params);
    }
}