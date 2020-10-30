package com.lzw.threadpool.forkjoin;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 * @Auther: lzw
 * @Date: 20/10/29 - 10 - 29 - 15:23
 * @Description: com.lzw.threadpool.forkjoin
 * @version: 1.0
 */
public class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 20;
    private int array[];
    private int start;
    private int end;

    public SumTask(int[] array,int start,int end){
        super();
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (end-start<THRESHOLD){
            for (int i = start;i<end;i++){
//                System.out.println(Thread.currentThread().getName()+"的i值："+i);
                sum+= array[i];
            }
            return sum;
        }else{
            int middle = (start+end)/2;
            SumTask left = new SumTask(array,start,middle);
            SumTask right = new SumTask(array,middle,end);
            left.fork();
            right.fork();
            return left.join()+right.join();
        }
    }
}
