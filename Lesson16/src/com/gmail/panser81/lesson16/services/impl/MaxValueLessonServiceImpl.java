package com.gmail.panser81.lesson16.services.impl;

import com.gmail.panser81.lesson16.services.LessonService;
import com.gmail.panser81.lesson16.services.ThreadLesson;

public class MaxValueLessonServiceImpl implements LessonService {
    private int threadsCount = 10;

    @Override
    public void execute(){
        Thread[] threads = new Thread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new ThreadLesson(String.format("thread %d", i));
        }

        for (Thread thread: threads) {
            thread.start();
        }
    }
}

