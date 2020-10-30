package com.lzw.threadpool.forkjoin;

import sun.security.util.Length;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;

/**
 * @Auther: lzw
 * @Date: 20/10/29 - 10 - 29 - 15:57
 * @Description: com.lzw.threadpool.forkjoin
 * @version: 1.0
 */
public class ForkJoinPoolTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = new int[100];
        Random random = new Random();
        int total = 0;

        for (int i = 0,len = array.length;i < len; i++) {
            int temp = random.nextInt(20);
            total += (array[i]=temp);
        }
        System.out.println("初始化数组的总和："+total);
        SumTask task = new SumTask(array,0,array.length);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> future = pool.submit(task);
        System.out.println(future.get());
        pool.shutdown();
    }
}
