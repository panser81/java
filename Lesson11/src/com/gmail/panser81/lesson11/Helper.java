package com.gmail.panser81.lesson11;

import java.util.Random;

public class Helper {
    private static Random RAND = new Random();

    public static int getRandomNumber(int minValue, int maxValue) {
        return RAND.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
