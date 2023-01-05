package com.gmail.panser81.lesson10;

import java.util.*;

public class SortExecuteServiceImpl implements ExecuteService {

    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 98;

    @Override
    public void execute() {
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randNumber = rand.nextInt((MAX_VALUE - MIN_VALUE) + 1) + MIN_VALUE;
            list.add(randNumber);
        }

        Collections.sort(list);

        System.out.println("Max values: " + list.get(list.size() - 1) + ", " + list.get(list.size() - 2));
    }
}
