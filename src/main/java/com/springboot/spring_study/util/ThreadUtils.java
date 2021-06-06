package com.springboot.spring_study.util;

import lombok.extern.slf4j.Slf4j;

/**
 * @author rensiqi1
 * @date 2021/6/6 15:40
 */
@Slf4j
public class ThreadUtils {
    public static void sleep(int milliSec){
        try{
            Thread.sleep(milliSec);
        }catch (InterruptedException e){
            log.error("线程睡眠时出现异常",e);
        }
    }
}
