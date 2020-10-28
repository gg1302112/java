package com.lzw.java_thread.pc4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 9:24
 * @Description: com.lzw.java_thread.pc4
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(3);

        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}
