package com.lzw.java_thread.pc3;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 6:41
 * @Description: com.lzw.java_thread.pc
 * @version: 1.0
 */
public class Consumer implements Runnable {
    private Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.goods.get();
        }
    }
}
