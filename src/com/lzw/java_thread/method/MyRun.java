package com.lzw.java_thread.method;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 10:13
 * @Description: com.lzw.java_thread.method
 * @version: 1.0
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
