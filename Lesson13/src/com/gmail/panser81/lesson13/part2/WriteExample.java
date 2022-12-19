package com.gmail.panser81.lesson13.part2;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WriteExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            list.add(Integer.toString(getRandomNumber(0, 100)));
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\repo\\new_file.txt"));

            String str = StringUtils.join(list, ",");
            writer.write(str);

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getRandomNumber(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
