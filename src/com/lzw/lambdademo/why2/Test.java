package com.lzw.lambdademo.why2;

import com.lzw.lambdademo.why.Student;

import java.util.ArrayList;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 20:54
 * @Description: com.lzw.lambdademo.why2
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
        getByFilter(students,new AgeFilter());
        getByFilter(students,new ScoreFilter());
    }

    private static void getByFilter(ArrayList<Student> students, StudentFilter Filter) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student s:students){
            if (Filter.compare(s)){
                list.add(s);
            }
        }
        printStudent(list);
    }

    private static void printStudent(ArrayList<Student> list) {
        for (Student s:list){
            System.out.println(s);
        }
    }
}
