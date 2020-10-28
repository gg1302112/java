package com.lzw.java_thread.method;

/**
 * @Auther: lzw
 *  yield方法，是当前线程暂停一次，允许其他线程执行，不阻塞，线程进入就绪状态，与其他线程抢占资源
 *  stop方法，强制线程停止执行，已过时，不推荐使用
 */
public class YieldTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread t3 = new Thread(myRun);
        t3.start();

        for (int i = 0; i < 10; i++) {
            if (i==2){
                Thread.yield();
//                t3.stop();
                System.out.println(Thread.currentThread().getName()+"======"+i+"礼让一次");
            }else{
                System.out.println(Thread.currentThread().getName()+"======"+i);
            }
        }
    }
}
