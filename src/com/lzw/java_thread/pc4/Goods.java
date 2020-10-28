package com.lzw.java_thread.pc4;

/**
 * @Auther: lzw
 * @Date: 20/10/28 - 10 - 28 - 9:24
 * @Description: com.lzw.java_thread.pc4
 * @version: 1.0
 */
public class Goods {
    private String brand;
    private String name;

    public Goods(){}

    public Goods(String brand,String name){
        this.brand = brand;
        this.name = name;
    }

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
}
