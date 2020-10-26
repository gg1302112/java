package com.lzw.java_thread.create;

import java.security.PublicKey;

/**
 * 实现线程的两种方式：
 * 第一种：继承Thread类
 *      1.必须要继承Thread类
 *      2.必须要重写run方法，指的是需要执行的核心逻辑
 *      3.线程在启动的时候，不要直接调用run方法，需要通过start()来进行调用
 *      4.每次运行相同的代码，出来的结果可能不一样，原因在于多线程谁先抢占资源无法进行人控制（包括更改优先级，也只是提高被调用的可能）
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //打印当前进程的进程名获取当前进程用Thread.currentThread()，再获取当前进程的名字使用getName()方法
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"======"+i);
        }
    }
}
