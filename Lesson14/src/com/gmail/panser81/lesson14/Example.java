package com.gmail.panser81.lesson14;

import java.io.*;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        String fileName = "c:\\repo\\objFile.txt";

        createFile(fileName);

        BufferedReader reader;
        List<Person> persons = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                if (line != null) {
                    String[] strArray = line.split(" ");
                    persons.add(new Person(strArray[0], strArray[1], Integer.parseInt(strArray[2])));
                }
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(persons, (p1, p2) -> p1.getYear() - p2.getYear());
        int maxYear = persons.get(0).getYear();

        persons.forEach(p -> {
            if (p.getYear() == maxYear)
                System.out.println("Max age: " + p.getName() + " " + p.getSurName() + " " + p.getYear());
        });
    }

    private static void createFile(String fileName) {
        int[] years = new int[]{1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970};

        List<Person> persons = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            persons.add(new Person("Name" + i, "Surname" + i, years[getRandom(0, 10)]));
        }

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(fileName));

            String str = "";

            for (int i = 0; i < persons.size(); i++) {
                Person p = persons.get(i);
                str += p.getName() + " " + p.getSurName() + " " + p.getYear() + "\n";
            }
            bf.write(str);
            bf.close();

            System.out.println("\nFile created..\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getRandom(int minValue, int maxValue) {
        Random rand = new Random();
        return rand.nextInt((maxValue - minValue) + 1) + minValue;
    }
}
