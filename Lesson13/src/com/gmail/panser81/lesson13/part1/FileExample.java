package com.gmail.panser81.lesson13.part1;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class FileExample {
    public static void main(String[] args) {

        String str = "";

        try {
            File myObj = new File("c:\\repo\\test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                str = str.concat(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(str);

        if (str.length() > 0) {
            List<Integer> list = new ArrayList<Integer>();
            String[] strArray = str.split("\t");

            for (int i = 0; i < strArray.length; i++) {
                list.add(parseInt(strArray[i]));
            }

            Collections.sort(list);
            System.out.printf("Min value: %d \n", list.get(0));
        }
    }
}
