package com.lzw.threadpool.callable;

import java.util.concurrent.Callable;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 8:19
 * @Description: com.lzw.threadpool.callable
 * @version: 1.0
 */
public class Task implements Callable<String> {
    private int i;

    public Task (int i){
        this.i = i;
    }

    @Override
    public String call() throws Exception {
//        Thread.sleep(1000);
        return Thread.currentThread().getName()+" is running---"+i;
    }
}
