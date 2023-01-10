package com.gmail.panser81.lesson16.services;

import com.gmail.panser81.lesson16.helpers.Helper;

import java.util.Arrays;
import java.util.Collections;

public class ThreadLesson extends Thread {
    private String name;
    private int arraySize = 10;
    private int minValue = 1;
    private int maxValue = 100;

    public ThreadLesson(String name) {
        this.name = name;
    }

    public void run() {
        Integer[] integerArray = new Integer[arraySize];

        for (int i = 0; i < arraySize; i++) {
            integerArray[i] = Helper.getRandomNumber(minValue, maxValue);
        }

        int maxResult = Collections.max(Arrays.asList(integerArray));

        System.out.format("%s: max result: %d\n", name, maxResult);
    }
}
