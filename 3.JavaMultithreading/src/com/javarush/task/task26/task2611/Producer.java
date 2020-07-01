package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {

    private ConcurrentHashMap<String, String> map;
    private AtomicInteger count = new AtomicInteger(1);

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }



    @Override
    public void run() {
        try {
            while (true) {
                map.put(count.toString(), "Some text for " + count.toString());
                count.incrementAndGet();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " thread was terminated");
        }

    }
}
