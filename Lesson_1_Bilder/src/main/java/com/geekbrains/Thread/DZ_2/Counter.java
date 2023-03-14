package com.geekbrains.Thread.DZ_2;

import java.util.concurrent.locks.Lock;

public class Counter {
    private int counter;

    public int incrementAndGet() {

        return counter++;
    }
}


