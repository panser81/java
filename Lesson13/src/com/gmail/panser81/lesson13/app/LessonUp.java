package com.gmail.panser81.lesson13.app;

import com.gmail.panser81.lesson13.services.impl.CreateFileExampleServiceImpl;
import com.gmail.panser81.lesson13.services.ExampleService;
import com.gmail.panser81.lesson13.services.impl.ParseFileExampleServiceImpl;
import com.gmail.panser81.lesson13.services.impl.ReadFileExampleServiceImpl;

import java.util.Scanner;

public class LessonUp {
    public static void main(String[] args) {
        System.out.println("Please select one of examples:");
        System.out.println("1. Parse file and find min value (by default)");
        System.out.println("2. Create new file");
        System.out.println("3. Read and parse file");
        System.out.println("0. Exit");

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                int exampleId = scanner.nextInt();
                ExampleService exampleService;

                if (exampleId == 0) {
                    break;
                }

                switch (exampleId) {
                    case 2:
                        exampleService = new CreateFileExampleServiceImpl();
                        break;
                    case 3:
                        exampleService = new ReadFileExampleServiceImpl();
                        break;
                    default:
                        exampleService = new ParseFileExampleServiceImpl();
                        break;
                }
                try {
                    exampleService.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
