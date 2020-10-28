package com.lzw.java_thread.pc3;

/**
 * 所产生的的问题
 *  1.生产者出现名字旺仔--矿泉水字样，存在混乱
 *  2.生产者还没有生产，消费者就消费走了
 */
public class Producer implements Runnable{
    private Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                this.goods.set("娃哈哈","矿泉水");
            }else{
                this.goods.set("旺仔","牛奶");
            }
        }
    }
}
