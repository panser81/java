package com.gmail.panser81.lesson15.services.impl;

import com.gmail.panser81.lesson15.services.FileRepository;
import com.gmail.panser81.lesson15.services.LessonService;
import com.gmail.panser81.lesson15.services.repositories.FileRepositoryImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseLogLessonServiceImpl implements LessonService {
    private FileRepository fileRepository = new FileRepositoryImpl();
    private String fileName = "log.txt";
    private String resultFileName = "result-log.txt";
    private int detailsNumber = 3;
    private int icmpIndex = 0;
    private int timeIndex = 2;

    @Override
    public void execute() throws Exception {
        StringBuilder fileContent = new StringBuilder();
        fileContent.append("log=[\n");
        fileContent.append("'64 bytes from localhost.localdomain (127.0.0.1): icmp_req=1 ttl=64 time=0.033 ms',\n");
        fileContent.append("'64 bytes from localhost.localdomain (127.0.0.1): icmp_req=2 ttl=64 time=0.034 ms',\n");
        fileContent.append("‘64 bytes from localhost.localdomain (127.0.0.1): icmp_req=3 ttl=64 time=0.031 ms',\n");
        fileContent.append("‘64 bytes from localhost.localdomain (127.0.0.1): icmp_req=4 ttl=64 time=0.031 ms']\n");

        fileRepository.createFile(fileName, fileContent.toString());

        String readText = fileRepository.readFile(fileName);

        String[] lines = readText.split("\n");

        StringBuilder resultStringBuilder = new StringBuilder();

        Pattern pattern = Pattern.compile(":(.*)'");
        for (String line : lines) {

            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {

                String trimedLine = matcher.group(1).trim();
                String[] splitedDetails = trimedLine.split("\\s+", detailsNumber);

                if (resultStringBuilder.length() == 0) {
                    resultStringBuilder.append("[");
                } else {
                    resultStringBuilder.append(",\n");
                }
                resultStringBuilder.append("('");
                resultStringBuilder.append(splitedDetails[icmpIndex]);
                resultStringBuilder.append("', '");
                resultStringBuilder.append(splitedDetails[timeIndex]);
                resultStringBuilder.append("')");
            }
        }
        resultStringBuilder.append("]");

        fileRepository.createFile(resultFileName, resultStringBuilder.toString());
        System.out.println("File was created");
    }
}
