package com.lzw.java_thread.pc4;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 9:24
 * @Description: com.lzw.java_thread.pc4
 * @version: 1.0
 */
public class Consumer implements Runnable{

    private BlockingQueue<Goods> blockingQueue;

    public Consumer (BlockingQueue<Goods> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods = null;
            try {
                goods = blockingQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者消费了  "+goods.getBrand()+"--"+goods.getName());
        }
    }
}
