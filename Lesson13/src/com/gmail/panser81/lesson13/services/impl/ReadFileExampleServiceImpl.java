package com.gmail.panser81.lesson13.services.impl;

import com.gmail.panser81.lesson13.helpers.Helper;
import com.gmail.panser81.lesson13.services.ExampleService;
import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ReadFileExampleServiceImpl implements ExampleService {
    private static final String SOURCE_FILE_PATH = "read_example.txt";
    private static final String TARGET_FILE_PATH = "new_example.txt";
    private static final int RANGE_START = 3;
    private static final int RANGE_END = 5;
    private static final String SEPARATOR = " ";

    @Override
    public void execute() throws Exception {

        String sourceStr = readFile(SOURCE_FILE_PATH);

        String targetString = parseString(sourceStr);

        System.out.println(targetString);

        try {
            Helper.writeFile(TARGET_FILE_PATH, targetString);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private String readFile(String path) throws Exception {

        File file = new File(path);
        if (!file.exists()) {
            String content = "nature to stress at time. I imagine stressful moment is joints coming to Dr Roberts added. The stressful moment is you're having of my attacks. It in I do is do to of my abilities.";
            Helper.writeFile(path, content);
        }

        String result = Helper.readFile(file);
        return result;
    }

    private String parseString(String content) {
        String[] splitedSourceString = content.split(SEPARATOR);
        List<String> targetStrList = new ArrayList<>();

        for (int i = 0; i < splitedSourceString.length; i++) {
            targetStrList.add(splitedSourceString[i]);
        }

        Predicate<String> condition = str -> str.length() >= RANGE_START && str.length() <= RANGE_END;
        targetStrList.removeIf(condition);

        String targetString = StringUtils.join(targetStrList, SEPARATOR);

        return targetString;
    }
}
