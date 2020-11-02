package com.lzw.lambdademo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: lzw
 * @Date: 20/11/1 - 11 - 01 - 12:59
 * @Description: com.lzw.lambdademo
 * @version: 1.0
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = Arrays.asList("java","python","shell","javascript");
        Collections.sort(list,(a,b)->b.length()-a.length());
        list.toArray();
        System.out.println(list.toString());
        list.forEach(System.out::println);
    }
}
