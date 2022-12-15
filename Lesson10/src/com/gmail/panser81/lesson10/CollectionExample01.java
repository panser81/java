package com.gmail.panser81.lesson10;

import java.util.*;

public class CollectionExample01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt((98 - 2) + 1) + 2);
        }

        Collections.sort(list);

        System.out.println("Max values: " + list.get(list.size() - 1) + ", " + list.get(list.size() - 2));
    }
}
