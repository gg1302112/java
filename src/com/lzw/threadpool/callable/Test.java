package com.lzw.threadpool.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 8:21
 * @Description: com.lzw.threadpool.callable
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Task t = new Task(i);
            Future<String> submit = executorService.submit(t);
            String s = submit.get();
            System.out.println(s);
        }
        executorService.shutdown();
    }
}
