package com.gmail.panser81.lesson11;

import java.util.*;

public class FrequencyExecuteServiceImpl implements ExecuteService {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 20;
    private static final int COUNT_OF_NUMBERS = 50;

    @Override
    public void execute() {
        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            int randomNumber = Helper.getRandomNumber(MIN_VALUE, MAX_VALUE);
            listOfNumbers.add(randomNumber);
        }

        Set<Integer> setOfNumbers = new HashSet<>(listOfNumbers);

        for (int number : setOfNumbers) {
            System.out.println(number + " - " + Collections.frequency(listOfNumbers, number));
        }
    }
}
