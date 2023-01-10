package com.gmail.panser81.lesson16.services;

public class SyncThreadLesson extends Thread {
    private Info info;
    private String name;

    public SyncThreadLesson(Info info, String name) {
        this.info = info;
        this.name = name;
    }

    public void run() {
        this.info.printInfo(this.name);
    }
}
