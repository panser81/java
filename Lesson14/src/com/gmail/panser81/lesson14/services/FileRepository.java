package com.gmail.panser81.lesson14.services;

public interface FileRepository {
    void createFile(String fileName, String content) throws Exception;

    void createDirectory(String path) throws Exception;

    String readFile(String fileName) throws Exception;
}
