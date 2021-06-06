package com.springboot.spring_study.service.Impl;

import com.springboot.spring_study.service.EmailService;
import com.springboot.spring_study.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author rensiqi1
 * @date 2021/6/6 15:37
 */
@Service
@Slf4j
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private EmailService emailService;

    @Override
    public boolean checkUsername(String username) throws Exception{
        if(username==null){
            throw new Exception("用户名不能为null");

        }
        boolean isExisted = username.equalsIgnoreCase("jake") ||
                username.equalsIgnoreCase("heather");
        if(!isExisted){
            emailService.sendEmail(username);
        }
        return !isExisted;
    }
}
