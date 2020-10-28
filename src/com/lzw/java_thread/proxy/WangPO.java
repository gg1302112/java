package com.lzw.java_thread.proxy;

import javax.tools.Diagnostic;

/**
 * @Auther: lzw
 * @Date: 20/10/27 - 10 - 27 - 16:01
 * @Description: com.lzw.java_thread.proxy
 * @version: 1.0
 */
public class WangPO implements KindWomen {
    private KindWomen k;

    public WangPO() {
        this.k = new Panjinlian();
    }

    @Override
    public void makeEyesWithMen() {
        k.makeEyesWithMen();
    }

    @Override
    public void playWithMen() {
        k.playWithMen();
    }
}
