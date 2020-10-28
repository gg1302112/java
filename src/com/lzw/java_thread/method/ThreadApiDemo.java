package com.lzw.java_thread.method;

/**
 * @Auther: lzw
 * 介绍线程类的api方法
 */
public class ThreadApiDemo implements Runnable{
    public static void main(String[] args) {
        //获取当前线程
        Thread thread = Thread.currentThread();
        //获取当前线程的名字
        System.out.println(thread.getName()); //main
        //获取当前线程的id
        System.out.println(thread.getId()); //1
        //获取当前线程的优先级，在一般系统中的范围是0-10的值，如果没有经过设置的话，就是默认值5
        System.out.println(thread.getPriority()); //5
        //设置线程池的优先级，优先级越高不一定越先执行，只是优先执行的效率较大而已
        thread.setPriority(6);
        System.out.println(thread.getPriority());

        ThreadApiDemo tad = new ThreadApiDemo();
        Thread t1 = new Thread(tad);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t1.getPriority());


    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }
}
