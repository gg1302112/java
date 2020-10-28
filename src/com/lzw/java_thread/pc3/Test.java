package com.lzw.java_thread.pc3;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 6:58
 * @Description: com.lzw.java_thread.pc
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();

        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }

}
