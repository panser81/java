package com.gmail.panser81.lesson15.services;

public interface FileRepository {
    void createFile(String fileName, String content) throws Exception;

    String readFile(String fileName) throws Exception;
}
