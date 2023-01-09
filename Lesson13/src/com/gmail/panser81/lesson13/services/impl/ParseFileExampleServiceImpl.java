package com.gmail.panser81.lesson13.services.impl;


import com.gmail.panser81.lesson13.services.FileRepository;
import com.gmail.panser81.lesson13.services.repositories.FileRepositoryImpl;
import com.gmail.panser81.lesson13.services.ExampleService;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ParseFileExampleServiceImpl implements ExampleService {
    private static final String FILE_PATH = "source_parse.txt";
    private static FileRepository fileRepository = new FileRepositoryImpl();

    @Override
    public void execute() throws Exception {

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            fileRepository.writeFile(FILE_PATH, "1\t9\t10\t5\t18\t3\t7\t5");
        }

        String sourceString = fileRepository.readFile(file);

        System.out.println(sourceString);

        if (sourceString.length() > 0) {
            List<Integer> numbers = new ArrayList<>();
            String[] strArray = sourceString.split("\t");

            for (int i = 0; i < strArray.length; i++) {
                int number = parseInt(strArray[i]);
                numbers.add(number);
            }

            Collections.sort(numbers);
            System.out.printf("Min value: %d \n", numbers.get(0));
        }
    }
}
