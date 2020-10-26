package com.lzw.java_thread.create;

/**
 * 第二种：实现Runable接口
 *      1.实现Runable接口
 *      2.重写run方法
 *      3.Runable接口只有run方法，没有start方法，创建Thread对象将创建的Runable子类实现作为thread的构造参数
 *      4.通过thread.start()进行启动
 */
public class RunableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }

    public static void main(String[] args) {
        RunableDemo rbd = new RunableDemo();
        Thread td = new Thread(rbd);
        td.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"====="+i);
        }
    }
}
