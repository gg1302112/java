package com.lzw.blockingqueue.arrayblockingqueue;

import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 8:50
 * @Description: com.lzw.blockingqueue.arrayblockingqueue
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
