package com.gmail.panser81.lesson16.services;

public interface FileRepository {
    void createFile(String fileName, String content) throws Exception;
}
