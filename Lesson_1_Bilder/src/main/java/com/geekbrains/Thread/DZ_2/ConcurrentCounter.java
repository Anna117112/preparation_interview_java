package com.geekbrains.Thread.DZ_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentCounter {


    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
       ReentrantLock reentrantLock = new ReentrantLock();
       new Thread  (new ThreadCounter(counter, reentrantLock), "Thread 1").start();
        new Thread  (new ThreadCounter(counter, reentrantLock), "Thread 2").start();
        new Thread  (new ThreadCounter(counter, reentrantLock), "Thread 3").start();

    }




}
