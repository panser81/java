package com.gmail.panser81.lesson11;

import java.util.*;

public class FrequencyExecuteServiceImpl implements ExecuteService {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 20;

    @Override
    public void execute() {
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int randomNumber = getRandomNumber(MIN_VALUE, MAX_VALUE);
            listOfNumbers.add(randomNumber);
        }

        Set<Integer> targetSet = new HashSet<>(listOfNumbers);

        for (int s : targetSet) {
            System.out.println(s + " - " + Collections.frequency(listOfNumbers, s));
        }
    }

    private static int getRandomNumber(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
