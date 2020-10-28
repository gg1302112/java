package com.lzw.java_thread.pc2;

import java.util.Set;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 6:41
 * @Description: com.lzw.java_thread.pc
 * @version: 1.0
 */
public class Goods {
    private String brand;
    private String name;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void set(String brand,String name){
        this.brand = brand;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.name = name;
        System.out.println("生产者生产了  "+this.brand+"--"+this.name);
    }

    public synchronized void get(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者消费了  "+this.brand+"--"+this.name);
    }
}
