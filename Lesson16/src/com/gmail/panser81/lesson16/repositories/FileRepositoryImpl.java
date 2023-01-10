package com.gmail.panser81.lesson16.repositories;

import com.gmail.panser81.lesson16.services.FileRepository;

import java.io.*;

public class FileRepositoryImpl implements FileRepository {
    @Override
    public void createFile(String fileName, String content) throws Exception {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            bufferedWriter.write(content);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
}
