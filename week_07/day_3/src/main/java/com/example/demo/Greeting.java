package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    private long id;
    private String content;

    static AtomicLong counter = new AtomicLong(1);

    public Greeting(String content) {
        this.id = counter.getAndIncrement();
        this.content = content;
    }

    public static AtomicLong getCounter() {
        return counter;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }



}
