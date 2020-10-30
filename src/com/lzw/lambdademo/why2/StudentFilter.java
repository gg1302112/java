package com.lzw.lambdademo.why2;

import com.lzw.lambdademo.why.Student;

/**
 * @Auther: lzw
 * @Date: 20/10/30 - 10 - 30 - 20:49
 * @Description: com.lzw.lambdademo.why2
 * @version: 1.0
 */
public interface StudentFilter {
    boolean compare(Student student);
}
