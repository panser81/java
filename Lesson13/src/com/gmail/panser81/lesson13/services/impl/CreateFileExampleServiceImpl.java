package com.gmail.panser81.lesson13.services.impl;

import com.gmail.panser81.lesson13.services.ExampleService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class CreateFileExampleServiceImpl implements ExampleService {
    private static final String FILE_PATH = "array.txt";
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 100;
    private static final int ARRAY_SIZE = 100;
    private static final String SEPARATOR = ",";
    private static Random random = new Random();

    @Override
    public void execute() {
        Integer[] arrayOfNumbers = new Integer[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            Integer number = getRandomNumber(MIN_VALUE, MAX_VALUE);
            arrayOfNumbers[i] = number;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {

            String joined = Arrays.stream(arrayOfNumbers).map(String::valueOf)
                    .collect(Collectors.joining(SEPARATOR));
            writer.write(joined);

            System.out.println("File " + FILE_PATH + " was created");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int getRandomNumber(int minValue, int maxValue) {
        return random.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
