package com.lzw.threadpool.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 16:46
 * @Description: com.lzw.threadpool.demo
 * @version: 1.0
 */
public class FixThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task());
        }
        executorService.shutdown();

    }
}
