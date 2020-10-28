package com.lzw.java_thread.pc4;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 9:24
 * @Description: com.lzw.java_thread.pc4
 * @version: 1.0
 */
public class Producer implements Runnable{
    private BlockingQueue<Goods> blockingQueue;

    public Producer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Goods goods = null;
            if (i%2 == 0){
                goods = new Goods("娃哈哈","矿泉水");
            }else{
                goods = new Goods("旺仔","牛奶");
            }
            System.out.println("生产者生产了  "+goods.getBrand()+"--"+goods.getName());
            try {
                blockingQueue.put(goods);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
