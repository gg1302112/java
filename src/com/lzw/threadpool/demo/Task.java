package com.lzw.threadpool.demo;

import com.lzw.java_thread.method.ThreadApiDemo;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 16:16
 * @Description: com.lzw.threadpool.demo
 * @version: 1.0
 */
public class Task implements Runnable {
    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"  running");
//        }
    }
}
