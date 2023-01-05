package com.gmail.panser81.lesson13;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateFileExampleServiceImpl implements ExampleService {
    private static final String FILE_PATH = "c:\\repo\\new_file.txt";
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;
    private static final int ARRAY_SIZE = 100;
    private static final String SEPARATOR = ",";

    @Override
    public void execute() {
        List<String> arrayOfStrings = new ArrayList<>();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            arrayOfStrings.add(Integer.toString(Helper.getRandomNumber(MIN_VALUE, MAX_VALUE)));
        }

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            String str = StringUtils.join(arrayOfStrings, SEPARATOR);
            writer.write(str);

            writer.close();
            fileWriter.close();

            System.out.println("File " + FILE_PATH + " was created");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
