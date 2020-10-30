package com.lzw.threadpool.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: lzw
 * @Date: 20/10/29 - 10 - 29 - 15:18
 * @Description: com.lzw.threadpool.forkjoin
 * @version: 1.0
 */
public class ForkJoinPoolAction {
    public static void main(String[] args) throws InterruptedException {
        PrintTask task = new PrintTask(0,300);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(task);
        forkJoinPool.awaitTermination(2, TimeUnit.SECONDS);
        forkJoinPool.shutdown();
    }
}
