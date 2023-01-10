package com.gmail.panser81.lesson15.services.impl;

import com.gmail.panser81.lesson15.services.FileRepository;
import com.gmail.panser81.lesson15.services.LessonService;
import com.gmail.panser81.lesson15.services.repositories.FileRepositoryImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindNumericLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();
    private String sourceFileName = "numeric_source.txt";
    private String resultFileName = "numeric_target.txt";

    @Override
    public void execute() throws Exception {
        String fileContent = "300 is a 2006 American epic war film based on the 1998 comic series 300 by Frank Miller and Lynn Varley. Both are fictionalized retellings of the Battle of Thermopylae within the Persian Wars.";

        fileRepository.createFile(sourceFileName, fileContent);

        String readText = fileRepository.readFile(sourceFileName);

        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(readText);

        StringBuilder resultStringBuilder = new StringBuilder();
        while (matcher.find()) {
            resultStringBuilder.append(matcher.group());
            resultStringBuilder.append(';');
        }

        String resultString = resultStringBuilder.toString();
        fileRepository.createFile(resultFileName, resultString);
        System.out.println("Result file was created");
    }
}
