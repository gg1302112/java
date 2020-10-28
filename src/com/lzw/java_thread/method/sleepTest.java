package com.lzw.java_thread.method;

/**
 * @Auther: lzw
 * 使当前的线程处于休眠状态，该线程处于阻塞状态
 */
public class sleepTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t2 = new Thread(myRun);
        t2.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }
    }
}
