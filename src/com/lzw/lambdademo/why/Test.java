package com.lzw.lambdademo.why;

import com.lzw.threadpool.forkjoin.PrintTask;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 20:35
 * @Description: com.lzw.lambdademo.why
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("zhangsan",14,67));
        students.add(new Student("lisi",13,89));
        students.add(new Student("wangwu",15,97));
        students.add(new Student("maliu",12,63));
        students.add(new Student("zhaoqi",17,75));
        findByAge(students);
        System.out.println("-------------");
        findByScore(students);
    }

    private static void findByScore(ArrayList<Student> students) {
        List<Student> list = new ArrayList<>();
        for (Student s : students){
            if (s.getScore()>75){
                list.add(s);
            }
        }
        for (Student s: list){
            System.out.println(s);
        }
    }

    private static void findByAge(List<Student> students) {
        List<Student> list = new ArrayList<>();
        for (Student s:students){
            if (s.getAge()>14){
                list.add(s);
            }
        }
        for (Student s:list){
            System.out.println(s);
        }
    }
}
