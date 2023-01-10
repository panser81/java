package com.gmail.panser81.lesson16.services.impl;

import com.gmail.panser81.lesson16.services.*;

public class SyncMethodLessonServiceImpl implements LessonService {
    private int threadsCount = 10;

    @Override
    public void execute() {
        Info info = new Info();

        Thread[] threads = new Thread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new SyncThreadLesson(info, String.format("thread %d", i));
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
