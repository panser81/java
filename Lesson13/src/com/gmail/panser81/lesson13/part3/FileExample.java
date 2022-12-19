package com.gmail.panser81.lesson13.part3;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FileExample {
    public static void main(String[] args) {
        String str = "";

        try {
            File myObj = new File("c:\\repo\\text.txt");
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

        String[] strArray = str.split(" ");
        List<String> strList = new ArrayList<>();

        for(int i=0;i<strArray.length;i++)
            strList.add(strArray[i]);

        Predicate<String> condition = s -> s.length() >= 3 && s.length() <= 5;
        strList.removeIf(condition);;

        String strNew = StringUtils.join(strList, " ");

        System.out.println(strNew);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\repo\\textNew.txt"));

            writer.write(strNew);

            writer.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
