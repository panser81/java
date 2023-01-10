package com.gmail.panser81.lesson15.services.impl;

import com.gmail.panser81.lesson15.services.FileRepository;
import com.gmail.panser81.lesson15.services.LessonService;
import com.gmail.panser81.lesson15.services.repositories.FileRepositoryImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyWordLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();
    private String fileName = "frequency.txt";
    private String filterName = "test";

    @Override
    public void execute() throws Exception {
        String fileContent = "This is a simple test message for test";
        fileRepository.createFile(fileName, fileContent);

        String readText = fileRepository.readFile(fileName);

        String[] fileSplited = readText.split("\\s+");

        List<String> listOfWordsFromFile = Arrays.asList(fileSplited);

        System.out.println(filterName + ": " + Collections.frequency(listOfWordsFromFile, filterName));
    }
}
