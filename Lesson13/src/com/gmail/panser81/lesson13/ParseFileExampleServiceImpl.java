package com.gmail.panser81.lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ParseFileExampleServiceImpl implements ExampleService {
    private static final String FILE_PATH = "c:\\repo\\test.txt";

    @Override
    public void execute() {
        String sourceString = "";

        try {
            File file = new File(FILE_PATH);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                sourceString = sourceString.concat(data);
            }
            myReader.close();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

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
