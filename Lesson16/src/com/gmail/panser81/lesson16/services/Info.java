package com.gmail.panser81.lesson16.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Info {
    private long pauseTimeMilliseconds = 5000;

    public synchronized void printInfo(String name){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String currentDateTimeString = dateTimeFormatter.format(now);

        System.out.format("%s - %s\n", name, currentDateTimeString);
        try {
            Thread.sleep(pauseTimeMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
