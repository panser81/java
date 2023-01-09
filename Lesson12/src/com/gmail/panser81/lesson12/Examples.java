package com.gmail.panser81.lesson12;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        System.out.println("Please select one of exceptions:");
        System.out.println("1. Generate NullPointerException (by default)");
        System.out.println("2. Generate own exceptions");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int exampleId = scanner.nextInt();
            ExampleService exampleService;

            if (exampleId == 0) {
                break;
            }

            switch (exampleId) {
                case 2:
                    exampleService = new SecondExampleServiceImpl();
                    break;
                default:
                    exampleService = new FirstExampleServiceImpl();
                    break;
            }
            exampleService.execute();
        }
        scanner.close();
    }
}
