package com.gmail.panser81.lesson11.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++) {
            list.add(getRandomNumber(0, 20));
        }

        Set<Integer> targetSet = new HashSet<>(list);

        for (int s : targetSet) {
            System.out.println(s + " - " + Collections.frequency(list, s));
        }
    }

    private static int getRandomNumber(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
