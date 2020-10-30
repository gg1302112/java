package com.lzw.threadpool.forkjoin;

import java.util.concurrent.RecursiveAction;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 17:07
 * @Description: com.lzw.threadpool.forkjoin
 * @version: 1.0
 */
public class PrintTask extends RecursiveAction {
    private static final int THRESHOLD = 50;
    private int start;
    private int end;

    public PrintTask(int start,int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end-start<THRESHOLD){
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName()+"的i值: "+i);
            }
        }else {
            int middle = (start+end)/2;
            PrintTask left = new PrintTask(start,middle);
            PrintTask right = new PrintTask(middle,end);
            left.fork();
            right.fork();
        }
    }
}
