package com.gmail.panser81.lesson16.services.impl;

import com.gmail.panser81.lesson16.services.*;

public class CreateFileLessonServiceImpl implements LessonService {
    private int threadsCount = 5;


    @Override
    public void execute() throws Exception {
        Thread[] threads = new Thread[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new FileThreadLesson(i);
        }

        for (Thread thread: threads) {
            thread.start();
        }
    }
}
