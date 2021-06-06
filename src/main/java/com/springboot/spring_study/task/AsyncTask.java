package com.springboot.spring_study.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author rensiqi1
 * @date 2021/6/6 15:39
 */
@Component
@Slf4j
public class AsyncTask {

    @Async("beanThreadPool")
    public void doTask1(int i){
        log.info("Task"+i+"startend.");
    }

    @Async
    public void doTask2(int i){
        if(i>60){
            System.out.println(1/0);
        }
        log.info("Native Task"+i+"started");
    }
}
