package com.gmail.panser81.lesson10;

import java.util.*;

public class SortExecuteServiceImpl implements ExecuteService {

    private int minValue = 2;
    private int maxValue = 98;

    @Override
    public void execute() {
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randNumber = rand.nextInt((maxValue - minValue) + 1) + minValue;
            list.add(randNumber);
        }

        Collections.sort(list);

        System.out.println("Max values: " + list.get(list.size() - 1) + ", " + list.get(list.size() - 2));
    }
}
