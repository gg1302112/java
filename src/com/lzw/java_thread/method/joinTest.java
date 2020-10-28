package com.lzw.java_thread.method;

/**
 * 调用该方法的线程强制执行，其他线程处于阻塞状态，该线程执行完毕后，其他线程再执行
 */
public class joinTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t1 = new Thread(myRun);
        t1.start();
        for (int i = 0; i < 10; i++) {
            if (i==3){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }
    }
}
