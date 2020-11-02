package com.lzw.lambdademo.lambda;

import com.lzw.threadpool.forkjoin.PrintTask;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Auther: lzw
 * @Date: 20/11/1 - 11 - 01 - 13:24
 * @Description: com.lzw.lambdademo.lambda
 * @version: 1.0
 */
public class staticlambda {
    public static void main(String[] args) {
        Function<String,Integer> f1 = (e)->{return e.length();};
        System.out.println(f1.apply("abc"));

        Consumer<String> c1 = (e)-> System.out.println(e);
        c1.accept("asdg");

        Test2.put();
        Supplier put = Test2::put;
        Object o = put.get();
        System.out.println(o.toString());

    }
}


class Test2{
    static String put(){
        System.out.println("put");
        return "put";
    }
}
