package com.gmail.panser81.lesson16.services;

import com.gmail.panser81.lesson16.helpers.Helper;
import com.gmail.panser81.lesson16.repositories.FileRepositoryImpl;

import java.util.Arrays;

public class FileThreadLesson extends Thread {
    private FileRepository fileRepository = new FileRepositoryImpl();
    private int arraySize = 10;
    private int minValue = 1;
    private int maxValue = 100;
    private String fileName = "result-";
    private String extension = "txt";
    private int prefix;

    public FileThreadLesson(int prefix) {
        this.prefix = prefix;
    }

    public void run() {
        Integer[] integerArray = new Integer[arraySize];

        for (int i = 0; i < arraySize; i++) {
            integerArray[i] = Helper.getRandomNumber(minValue, maxValue);
        }
        String fileContent = Arrays.toString(integerArray);

        String generatedFileName = String.format("%s%d.%s", fileName, this.prefix, extension);

        try {
            fileRepository.createFile(generatedFileName, fileContent);

            System.out.println("File was created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
