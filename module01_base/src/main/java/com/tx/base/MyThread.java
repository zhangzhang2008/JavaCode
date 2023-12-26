package com.tx.base;

// 通过继承Thread类实现多线程
public class MyThread extends Thread {

    public void run() {
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // 启动线程
    }
}


