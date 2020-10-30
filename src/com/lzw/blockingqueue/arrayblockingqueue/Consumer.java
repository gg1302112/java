package com.lzw.blockingqueue.arrayblockingqueue;

import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.BlockingQueue;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 8:33
 * @Description: com.lzw.blockingqueue.arrayblockingqueue
 * @version: 1.0
 */
public class Consumer implements Runnable {
    private BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }


    @Override
    public void run() {
        try {
            while (true){
                System.out.println("取出的元素是："+blockingQueue.take());
            }
        } catch (InterruptedException e) {
            System.out.println("消费者在等待消费时，被打断了");
            e.printStackTrace();
        }
    }
}
