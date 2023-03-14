package com.geekbrains.Thread.DZ_2;

import java.util.concurrent.locks.Lock;

public class ThreadCounter implements Runnable {
    private Counter mycounter;
    private Lock lock;

    public ThreadCounter(Counter mycounter, Lock lock) {
        this.mycounter = mycounter;
        this.lock = lock;
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            lock.lock();
            try {
                int currentCountValue = mycounter.incrementAndGet();
                System.out.println("Поток" + Thread.currentThread() + "изменил счетчик на " + currentCountValue);
            } finally {
                lock.unlock();
            }
        }
    }
}
