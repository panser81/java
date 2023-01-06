package com.gmail.panser81.lesson13.services;

import java.io.File;

public interface FileRepository {
    void writeFile(String path, String content) throws Exception;

    String readFile(File file) throws Exception;
}
