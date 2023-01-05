package com.gmail.panser81.lesson13;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ReadFileExampleServiceImpl implements ExampleService {
    private static final String SOURCE_FILE_PATH = "c:\\repo\\text.txt";
    private static final String TARGET_FILE_PATH = "c:\\temp\\text.txt";
    private static final int RANGE_START = 3;
    private static final int RANGE_END = 5;
    private static final String SEPARATOR = " ";

    @Override
    public void execute() {
        String sourceStr = "";

        try {
            File sourceFile = new File(SOURCE_FILE_PATH);
            Scanner reader = new Scanner(sourceFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                sourceStr = sourceStr.concat(data);
            }
            reader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        String[] strArray = sourceStr.split(SEPARATOR);
        List<String> targetStrList = new ArrayList<>();

        for (int i = 0; i < strArray.length; i++) {
            targetStrList.add(strArray[i]);
        }

        Predicate<String> condition = str -> str.length() >= RANGE_START && str.length() <= RANGE_END;
        targetStrList.removeIf(condition);

        String targetString = StringUtils.join(targetStrList, SEPARATOR);

        System.out.println(targetString);

        try {
            FileWriter fileWriter = new FileWriter(TARGET_FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(targetString);

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
