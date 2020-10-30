package com.lzw.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 8:33
 * @Description: com.lzw.blockingqueue.arrayblockingqueue
 * @version: 1.0
 */
public class Producer implements Runnable{
    BlockingQueue blockingQueue = null;
    private int element = 0;
    public Producer (BlockingQueue b){
        this.blockingQueue = b;
    }
    
    @Override
    public void run() {
        try {
            while (element<20) {
                System.out.println("放入的元素值为：" + element);
                blockingQueue.put(element++);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        System.out.println("生产者终止了生产：");
    }
}
