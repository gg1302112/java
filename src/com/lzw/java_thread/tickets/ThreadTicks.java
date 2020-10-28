package com.lzw.java_thread.tickets;

/**
 * 使用Thread和Runable练习买票和练习共享资源问题
 * 方式一：继承Thread类
 *      1.首先定义一个ticks变量为总票数为10
 *      2.定义run方法，循环的扣除票数量（简单写一下打印ticks票数）
 *      3.模拟四个窗口购买票
 * 问题1：打印的结果是每个窗口都打印了10张票
 * 解决1：通过给变量添加static，使变量变为共享变量
 * 解决2：通过实现runable接口解决共享变量问题
 *
 * 问题2：打印的ticks数量顺序不是从10->1，顺序乱了，也就是数据不同步
 * 解决：通过代码块同步或者方法同步解决问题（加锁）
 *
 */
public class ThreadTicks extends Thread{
    private static int tickets = 10;
    @Override
    public void run() {
        while (tickets>0){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (tickets>0){
                    System.out.println(Thread.currentThread().getName() + " 剩余" + (tickets--) + "张票");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadTicks tt1 = new ThreadTicks();
        ThreadTicks tt2 = new ThreadTicks();
        ThreadTicks tt3 = new ThreadTicks();
        ThreadTicks tt4 = new ThreadTicks();
        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
    }
}
