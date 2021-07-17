package com.springboot.spring_study.service.Impl;

import com.springboot.spring_study.service.EmailService;
import com.springboot.spring_study.util.ThreadUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author rensiqi1
 * @date 2021/6/6 15:37
 */
@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    @Override
    @Async
    public void sendEmail(String username){
        log.info("开始向{}@mastermind.com发送邮件",username);
        ThreadUtils.sleep(3000);
        log.info("邮件发送成功");
    }



}
