package com.lzw.java_thread.ticks;

/**
 * @Auther: lzw
 * @Date: 20/10/26 - 10 - 26 - 17:13
 * @Description: com.lzw.java_thread.ticks
 * @version: 1.0
 */
public class RunableTickets implements Runnable{
    private int tickets = 10;
    @Override
    public void run() {
        while (tickets>0){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tickets>0){
                System.out.println(Thread.currentThread().getName()+" 剩余"+(tickets--)+"张票");
            }
        }
    }

    public static void main(String[] args) {
        RunableTickets rtt = new RunableTickets();
        Thread td1 = new Thread(rtt);
        Thread td2 = new Thread(rtt);
        Thread td3 = new Thread(rtt);
        Thread td4 = new Thread(rtt);
        td1.start();
        td2.start();
        td3.start();
        td4.start();
    }
}
