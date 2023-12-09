package com.tx.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class HelloWorld {

    /*
    多行注释
     */
    public static void main(String[] args) {
        // 单行注释
        System.out.println("hello world!");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(a -> System.out.println("==>" + a));

        test();

        System.out.println("111111");
        System.out.println("hot-fix");
        System.out.println("master test!");
        System.out.println("master test2");
        System.out.println("hot-fix test2!");
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("123");
    }
    public static void test() {

        String str = "test";

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String ss = "111";
        System.out.println("ss = " + ss);
        System.out.println(ss);

        Map<String, String> map = new HashMap<>();
        map.put("name", "son");
        System.out.println(map);

        test2();
    }

    private static void test2() {
        String test = "hangman";
        System.out.println(test);
        System.out.println(test);
        System.out.println(test);
    }

    private static void method3(int a, int b) {
        String hello = "hello";
        System.out.println(hello);
    }
}
