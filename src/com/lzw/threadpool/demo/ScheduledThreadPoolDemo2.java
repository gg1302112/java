package com.lzw.threadpool.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 16:56
 * @Description: com.lzw.threadpool.demo
 * @version: 1.0
 */
public class ScheduledThreadPoolDemo2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("每秒执行一次");
            }
        },1,3, TimeUnit.SECONDS);
    }
}
