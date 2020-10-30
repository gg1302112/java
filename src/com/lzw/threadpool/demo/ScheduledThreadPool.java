package com.lzw.threadpool.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 16:51
 * @Description: com.lzw.threadpool.demo
 * @version: 1.0
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("延迟3秒执行");
                }
            }, 3, TimeUnit.SECONDS);
        }
        scheduledExecutorService.shutdown();
    }
}
