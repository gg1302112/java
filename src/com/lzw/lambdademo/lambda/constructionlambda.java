package com.lzw.lambdademo.lambda;

import com.lzw.threadpool.forkjoin.PrintTask;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Auther: lzw
 * @Date: 20/11/1 - 11 - 01 - 13:44
 * @Description: com.lzw.lambdademo.lambda
 * @version: 1.0
 */
public class constructionlambda {
    public static void main(String[] args) {
//        Supplier<Person> s = ()->new Person();
//        System.out.println(s.get().name);
//        Supplier<Person> s1 = Person::new;
//        System.out.println(s1.get().name);
        Supplier<Account> s1 = ()->new Account();
        System.out.println(s1.get().num);
        Function<Integer,Account> s2 = Account::new;
        Account a = s2.apply(1);
        System.out.println(a.num);

        Consumer<String> s3 = Account::new;
        s3.accept("abc");
    }
}

class Person{
    public String name = "xiaoming";
    public Person() {
        System.out.println("调用无参构造器");
    }

}


class Account{
    int num = 100;

    public Account(){
        System.out.println("调用无参构造");
    }
    public Account(int age){
        System.out.println(age);
    }
    public Account(String e){
        System.out.println(e);
    }
}
