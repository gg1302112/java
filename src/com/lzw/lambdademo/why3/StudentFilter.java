package com.lzw.lambdademo.why3;

import com.lzw.lambdademo.why3.Student;

/**
 * @Auther: lzw
 * @Date: 20/11/1 - 11 - 01 - 10:35
 * @Description: com.lzw.lambdademo.why3
 * @version: 1.0
 */
public interface StudentFilter {
    public boolean compare(Student student);
}
