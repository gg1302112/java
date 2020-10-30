package com.lzw.lambdademo.why2;

import com.lzw.lambdademo.why.Student;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 20:50
 * @Description: com.lzw.lambdademo.why2
 * @version: 1.0
 */
public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}
