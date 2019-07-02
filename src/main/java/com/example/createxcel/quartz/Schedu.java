package com.example.createxcel.quartz;

import com.example.createxcel.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class Schedu {
    @Autowired
    private UserServcie  userServcie;

    @Scheduled(cron = "0/10 * * * * ?")//每十秒执行一次
    public void  work1(){
       // System.out.println("定时任务已执行 ");
        userServcie.CreatExcel();
    }





}
